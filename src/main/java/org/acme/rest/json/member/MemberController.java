/*
 * Copyright(c) u-next.
 */
package org.acme.rest.json.member;

import java.time.LocalDate;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.rest.json.AppConfig;
import org.acme.rest.json.doma.member.MemberDao;
import org.acme.rest.json.doma.member.impl.MemberDaoImpl;
import org.seasar.doma.jdbc.tx.TransactionManager;

/**
 * 
 * @author y-noguchi
 */
@Path("/member")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MemberController {

	@Inject
	 MemberService service;
	
	private final MemberDao dao = new MemberDaoImpl();
	TransactionManager tm = AppConfig.singleton().getTransactionManager();
	
	@GET
	@Path("/create")
	public MemberEntity create() {
		return service.createMember("test", LocalDate.now());
	}
	
	@GET
	@Path("/list")
	public List<MemberEntity> list() {
		return service.getMemberList();
	}
	
	@GET
	@Path("/doma/list")
	public List<org.acme.rest.json.doma.member.Member> domaList() {
		return tm.required(() -> {
			return dao.selectAll();
		});
	}
	
}
