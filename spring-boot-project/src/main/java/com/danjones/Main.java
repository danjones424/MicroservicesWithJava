package com.danjones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("api/v1/members")
public class Main {

    private final MemberRepository memberRepository;

    public Main(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping
    public List<Member> getMembers(){
        return memberRepository.findAll();
    }

    record NewMemberRequest(
            String name,
            String tier,
            String email
    ){}

    @PostMapping
    public void addMember(@RequestBody NewMemberRequest request){
        Member member = new Member();
        member.setName(request.name());
        member.setTier(request.tier());
        member.setEmail(request.email());
        memberRepository.save(member);
    }


}
