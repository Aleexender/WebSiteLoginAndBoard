package com.example.websiteproject1;

public interface MemberService {
    boolean join(String stringId, String password);

    void validate(String stringId, String password);

    String findMember(String stringId);
}
