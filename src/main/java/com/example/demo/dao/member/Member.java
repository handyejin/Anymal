package com.example.demo.dao.member;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Member {

    @Id
    private String member;

//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(length = 20, nullable = true )
//    private Long id;

    @Column(length = 20, nullable = false )
    private String pw;

    @Column(length = 50, nullable = false )
    private String address;

    @Column(length = 50, nullable = false )
    private String email;

    @Column(length = 20, nullable = false )
    private String hp;

    @Builder
    public Member(String member, String pw, String address, String email, String hp){
        this.member = member;
        this.pw = pw;
        this.address = address;
        this.email = email;
        this.hp = hp;

    }


}
