package com.dingli.spring_security_document.C_base.database.repository;

import com.dingli.spring_security_document.C_base.database.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
