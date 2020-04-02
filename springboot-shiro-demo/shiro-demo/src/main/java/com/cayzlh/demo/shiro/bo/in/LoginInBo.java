package com.cayzlh.demo.shiro.bo.in;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;
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
public class LoginInBo implements Serializable {

    @NotBlank(message = "username can not be blank.")
    private String username;

    @NotBlank(message = "password can not be blank.")
    private String password;

}
