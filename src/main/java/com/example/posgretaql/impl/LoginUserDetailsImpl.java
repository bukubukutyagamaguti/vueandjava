package com.example.posgretaql.impl;

import com.example.posgretaql.model.LoginUserModel;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class LoginUserDetailsImpl implements UserDetails {
    private final LoginUserModel loginUser;
    private final Collection<? extends GrantedAuthority> authorities;

    public LoginUserDetailsImpl(LoginUserModel loginUser) {
        this.loginUser = loginUser;
        this.authorities = loginUser.roleList().stream().map(role -> new SimpleGrantedAuthority(role)).toList();
    }

    public LoginUserModel getLoginUser() {
        return loginUser;
    }

    @Override
    public String getPassword() {
        return loginUser.password();
    }

    @Override
    public String getUsername() {
        return loginUser.name();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
