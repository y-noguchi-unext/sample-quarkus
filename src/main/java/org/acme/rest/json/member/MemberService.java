/*
 * Copyright(c) u-next.
 */
package org.acme.rest.json.member;

import java.time.LocalDate;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

/**
 * 
 * @author y-noguchi
 */
@ApplicationScoped
public class MemberService {

	@Inject
	EntityManager em;
	
	@Transactional
	public MemberEntity createMember(String name, LocalDate bitrhDate) {
		MemberEntity entity = new MemberEntity();
		entity.setName(name);
		entity.setBirth_date(bitrhDate);
		em.persist(entity);
		return entity;
	}
	
	public List<MemberEntity> getMemberList() {
		return em.createNativeQuery("select * from member", MemberEntity.class).getResultList();
	}
}
