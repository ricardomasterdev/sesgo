package com.ricardomasterdev.api.repository;

import com.ricardomasterdev.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
