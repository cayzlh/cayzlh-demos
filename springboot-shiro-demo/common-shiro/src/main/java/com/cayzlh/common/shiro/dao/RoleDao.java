package com.cayzlh.common.shiro.dao;

import com.google.common.collect.Sets;
import java.util.Set;
import org.springframework.stereotype.Repository;

/**
 * @author chenanyu
 * @date 2019-04-29.
 */
@Repository
public class RoleDao {

    public Set<String> selectByUsername(String username) {
        switch (username) {
            case "zhangsan":
                return Sets.newHashSet("admin");
            case "lisi":
                return Sets.newHashSet("java", "mysql");
            case "wangwu":
                return Sets.newHashSet("html", "javascript");
            default:
                return Sets.newHashSet("guest");
        }
    }

}
