package com.example.demo.controller;

import com.example.demo.dao.member.Member;
import com.example.demo.dto.MemberServiceDto;
import com.example.demo.service.member.MemberService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api")
public class MemberApiController {

    private final MemberService memberService;

    String message="";
    boolean idDuplicateCheck ;


//
//    @PostMapping("/join")
//    public Long save(@RequestBody MemberServiceDto memberServiceDto){
//        System.out.println(memberServiceDto.getId_());
//        Long save = memberService.save(memberServiceDto);
//        System.out.println("save = " + save);
//        return save;
//    }

    @PostMapping(value = "/joinRequest")
    public boolean join(@RequestBody MemberServiceDto memberServiceDto){

        System.out.println("joinRequest 호출");
        String id = memberServiceDto.getMember();
        System.out.println("id="+id);
        Optional<Member> member = checkIdDuplicate(id);
        // 중복 x
        if(member.isEmpty()){
            String save = memberService.save(memberServiceDto);
            return false;

        }else{
            return true;
        }

    }
    public Optional<Member> checkIdDuplicate(String id){
        return memberService.checkIdDuplicate(id);
        //중복 x


    }

    @GetMapping(value = "/join")
    public boolean join_check(){
        System.out.println("getmapping"+idDuplicateCheck);
        return idDuplicateCheck;

    }






}
