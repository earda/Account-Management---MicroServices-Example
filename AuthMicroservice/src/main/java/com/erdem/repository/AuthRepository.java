package com.erdem.repository;

import com.erdem.dto.request.LoginResponseDto;
import com.erdem.entity.Auth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository extends JpaRepository<Auth,Long> {

    Boolean existsByUserNameAndPassword(String userName, String password);
}
