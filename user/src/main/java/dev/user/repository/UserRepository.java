package dev.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.user.entidades.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
