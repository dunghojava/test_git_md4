package com.example.testcasemd4.service.userInfo;

import com.codegym.castudymd6final.model.entity.UserInfo;
import com.codegym.castudymd6final.service.IGeneralService;

public interface IUserInfoService extends IGeneralService<UserInfo> {
    UserInfo findByUserId(Long id);
    Long findUserByUserInfo(Long id);
}
