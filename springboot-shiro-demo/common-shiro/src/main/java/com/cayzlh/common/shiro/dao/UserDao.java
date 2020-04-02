package com.cayzlh.common.shiro.dao;

import com.cayzlh.common.shiro.bean.UserInfo;
import org.springframework.stereotype.Repository;

/**
 * @author chenanyu
 * @date 2019-04-29.
 */
@Repository
public class UserDao {

    public UserInfo selectByUsername(String username) {

        switch (username) {
            case "zhangsan":
                return UserInfo.builder()
                        .userName("zhangsan").password("123456").salt("123456")
                        .build();
            case "lisi":
                return UserInfo.builder()
                        .userName("lisi").password("123456").salt("123456")
                        .build();
            case "wangwu":
                return UserInfo.builder()
                        .userName("wangwu").password("123456").salt("123456")
                        .build();
            default:
                return null;
        }


    }

}
