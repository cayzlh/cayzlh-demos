package com.cayzlh.common.shiro.bean;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chenanyu
 * @date 2019-04-29.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo implements Serializable {

    private String userName;

    private String password;

    private String salt;

}
