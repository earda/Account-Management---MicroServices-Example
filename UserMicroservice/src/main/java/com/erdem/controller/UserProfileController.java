package com.erdem.controller;

import com.erdem.document.UserProfile;
import com.erdem.dto.request.CreateUserRequestDto;
import com.erdem.service.UserProfileService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.erdem.config.RestApis.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(USERPROFILE)
public class UserProfileController {
    private final UserProfileService service;

    @PostMapping(CREATE_USER)
    public ResponseEntity<Boolean> createUser(@RequestBody CreateUserRequestDto userRequestDto){
        service.createUser(userRequestDto);
        return ResponseEntity.ok(true);
    }

    @GetMapping(GET_ALL)
    public ResponseEntity<List<UserProfile>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }
}
