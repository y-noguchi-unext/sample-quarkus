/*
 * Copyright(c) u-next.
 */
package org.acme.rest.json.member;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author y-noguchi
 */
@Entity(name = "member")
public class MemberEntity {
	private Long member_id;
	private String name;
	private LocalDate birth_date;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getMember_id() {
		return member_id;
	}
	
	public String getName() {
		return name;
	}
	
	public LocalDate getBirth_date() {
		return birth_date;
	}
	
	public void setMember_id(Long memberId) {
		this.member_id = memberId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBirth_date(LocalDate birtDate) {
		this.birth_date = birtDate;
	}
}
