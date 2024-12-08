package com.erdem.service;

import com.erdem.dto.request.LoginResponseDto;
import com.erdem.dto.request.RegisterRequestDto;
import com.erdem.entity.Auth;
import com.erdem.repository.AuthRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final AuthRepository authRepository;

    public Auth register(RegisterRequestDto dto) {
        return  authRepository.save(Auth.builder()
                .userName(dto.getUserName())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .build());

    }

    public Boolean login(LoginResponseDto dto) {
        return authRepository.existsByUserNameAndPassword(dto.getUserName(),dto.getPassword());
    }
}
