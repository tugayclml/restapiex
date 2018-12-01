package com.example.demo.members;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@RequestMapping(method=RequestMethod.GET,value="/members")
	public List<Member> getAllMembers(){
		return memberService.getAllMembers();
	}
	
	@RequestMapping(method = RequestMethod.POST , value="/registreeruge")
	public void addMember(@RequestBody Member member) {
		String pw = member.getPassword();
		BCryptPasswordEncoder pwEncoder = new BCryptPasswordEncoder();
		String hashedPassword  = pwEncoder.encode(pw);
		member.setPassword(hashedPassword);
		memberService.addMember(member);
	}
	
}
