/*
 * Copyright(c) u-next.
 */
package org.acme.rest.json.doma.member;

import java.time.LocalDate;

import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.SequenceGenerator;

/**
 * 
 * @author y-noguchi
 */
@Entity
public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long member_id;
	public String name;
	public LocalDate birth_date;
}
