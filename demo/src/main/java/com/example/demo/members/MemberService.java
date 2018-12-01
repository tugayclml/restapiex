package com.example.demo.members;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired
	private MemberRepository memberRepository;
	
	public List<Member> getAllMembers(){
		List<Member> members = new ArrayList<>();
		memberRepository.findAll().forEach(members::add);
		return members;
	}
	
	public void addMember(Member member) {
		memberRepository.save(member);
	}
}
