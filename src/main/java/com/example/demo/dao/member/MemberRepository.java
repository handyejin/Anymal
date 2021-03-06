package com.example.demo.dao.member;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, String> {

    public Optional<Member> findByMember(String id);
}
