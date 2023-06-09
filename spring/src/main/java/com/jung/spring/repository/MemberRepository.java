package com.jung.spring.repository;

import com.jung.spring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); // 회원이 저장소에 저장
    Optional<Member> findById(long id);
    Optional<Member> findByName(String name);
    List<Member> findAll(); // 모든 회원 리스트 반환
}
