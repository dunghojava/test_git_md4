package com.example.testcasemd4.service.user;

import com.codegym.castudymd6final.model.entity.User;
import com.codegym.castudymd6final.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends IGeneralService<User>, UserDetailsService {
    User findByUserName(String username);
}
