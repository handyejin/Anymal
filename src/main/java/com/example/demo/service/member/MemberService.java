package com.example.demo.service.member;

import com.example.demo.dao.member.Member;
import com.example.demo.dao.member.MemberRepository;
import com.example.demo.dto.MemberServiceDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public String save(MemberServiceDto memberServiceDto){
        return memberRepository.save(memberServiceDto.toEntity()).getMember();
    }

    @Transactional
    public Optional<Member> checkIdDuplicate(String id){
        return memberRepository.findByMember(id);
    }

}
