package com.erdem.service;

import com.erdem.document.UserProfile;
import com.erdem.dto.request.CreateUserRequestDto;
import com.erdem.repository.UserProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserProfileService {
    private final UserProfileRepository repository;

    public void createUser(CreateUserRequestDto userRequestDto) {
        repository.save(UserProfile.builder()
                        .authId(userRequestDto.getAuthId())
                        .userName(userRequestDto.getUserName())
                        .email(userRequestDto.getEmail())
                .build());
    }

    public List<UserProfile> getAll() {
        return repository.findAll();
    }
}
