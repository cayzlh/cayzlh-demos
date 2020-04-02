package com.cayzlh.demo.shiro.vo;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chenanyu
 * @date 2019-04-30.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginVo implements Serializable {

    private String username;

    private String token;

}
