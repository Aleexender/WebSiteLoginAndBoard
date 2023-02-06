package com.example.websiteproject1;

import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    @Override
    public boolean join(String stringId, String password) { // DB에 id랑,password 집어넣는 로직
     return memberRepository.addIdNPassword(stringId, password);

    }

    @Override
    public void validate(String stringId, String password) { // DB에 id랑 password가 있는지 보는 로직

    }

    @Override
    public String findMember(String stringId) {
        return null;
    }


    //비번 체크하는 로직

    //Id 체크하는 로직

    //
}
