package com.simBank.repository;

import com.simBank.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUserByCpf(String cpf);

    Optional<User> findUserByid(Long id);

}