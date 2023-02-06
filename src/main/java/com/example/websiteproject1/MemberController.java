package com.example.websiteproject1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/member")
public class MemberController {

    private final MemberService memberService;


    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/register")
    public String register(String id, String password) {
        memberService.join(id, password);
        return "home";
    }
}
