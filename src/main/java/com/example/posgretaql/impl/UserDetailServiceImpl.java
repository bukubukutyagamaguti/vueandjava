package com.example.posgretaql.impl;

import com.example.posgretaql.model.MUserModel;
import com.example.posgretaql.service.MUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserDetailServiceImpl implements UserDetailsService {
    private final MUserService service;
    public UserDetailServiceImpl(MUserService service) {
        this.service = service;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        MUserModel loginUser = service.getByUser(username);
        if (loginUser == null) {
            throw new UsernameNotFoundException("user not found");
        }

        GrantedAuthority authority = new SimpleGrantedAuthority(loginUser.get)
    }
}
