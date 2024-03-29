package com.example.springbootTutorial.repository;

import com.example.springbootTutorial.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);

    // save member for db
    Optional<Member> findById(Long id);

    Optional<Member> findByName(String name);

    List<Member> findAll();
}