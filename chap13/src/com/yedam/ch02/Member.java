package com.yedam.ch02;

public class Member {
	public int id;
	public String name;
	
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return id + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			
			return (id == member.id) 
					&& (name.equals(member.name));
			/*
			if(id == member.id) {
				if(name.equals(member.name)) {
					return true;
				}
			}
			*/
		}
		return false;
	}
	
}
	
	
