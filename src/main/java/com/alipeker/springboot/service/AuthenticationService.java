package com.alipeker.springboot.service;

import com.alipeker.springboot.jwt.security.JwtTokenGenerator;
import com.alipeker.springboot.service.entityservice.UserEntityService;
import com.alipeker.springboot.dto.UserRequestDto;
import com.alipeker.springboot.entity.User;
import com.alipeker.springboot.jwt.security.EnumJwtConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    private UserEntityService userEntityService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenGenerator jwtTokenGenerator;

    public String login(UserRequestDto userRequestDto){

        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken
                (userRequestDto.getUsername(), userRequestDto.getPassword());

        Authentication authentication = authenticationManager.authenticate(authenticationToken);

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String token = jwtTokenGenerator.generateJwtToken(authentication);

        return EnumJwtConstant.BEARER.getConstant() + token;
    }

    public User register(String username, String password){

        password = passwordEncoder.encode(password);

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        return userEntityService.save(user);
    }

    public void validateUserRequest(String username) {

        User user = userEntityService.findByUsername(username);

        if (user != null){
            throw new RuntimeException("Username already in use");
        }
    }
}
