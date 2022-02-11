package com.example.demo.dto;

import com.example.demo.dao.member.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberServiceDto {

    private String member;
    private String pw;
    private String address;
    private String email;
    private String hp;

    public Member toEntity(){
        return Member.builder()
                .member(member)
                .pw(pw)
                .address(address)
                .email(email)
                .hp(hp)
                .build();
    }
}
