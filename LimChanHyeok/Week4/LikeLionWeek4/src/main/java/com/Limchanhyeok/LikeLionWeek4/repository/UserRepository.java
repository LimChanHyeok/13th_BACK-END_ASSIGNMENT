package com.Limchanhyeok.LikeLionWeek4.repository;

import com.Limchanhyeok.LikeLionWeek4.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByUsername(String username);
}