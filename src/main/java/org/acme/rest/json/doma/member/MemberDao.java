/*
 * Copyright(c) u-next.
 */
package org.acme.rest.json.doma.member;

import java.util.List;

import org.acme.rest.json.AppConfig;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;

/**
 * 
 * @author y-noguchi
 */
@Dao(config = AppConfig.class)
public interface MemberDao {

	@Select
    List<Member> selectAll();
}
