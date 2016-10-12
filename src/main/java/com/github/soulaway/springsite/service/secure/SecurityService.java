package com.github.soulaway.springsite.service.secure;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
