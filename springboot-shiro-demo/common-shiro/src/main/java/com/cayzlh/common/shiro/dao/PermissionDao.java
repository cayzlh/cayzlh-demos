package com.cayzlh.common.shiro.dao;

import com.google.common.collect.Sets;
import java.util.Set;
import org.springframework.stereotype.Repository;

/**
 * @author chenanyu
 * @date 2019-04-30.
 */
@Repository
public class PermissionDao {

    public Set<String> selectByRole(String role) {
        switch (role) {
            case "admin":
                return Sets.newHashSet("Idea", "navicat", "notepad", "webstorm",
                        "chrome");
            case "java":
                return Sets.newHashSet("Idea");
            case "mysql":
                return Sets.newHashSet("navicat");
            case "html":
                return Sets.newHashSet("notepad");
            case "javascript":
                return Sets.newHashSet("webstorm");
            case "guest":
                return Sets.newHashSet("chrome");
            default:
                return Sets.newHashSet();
        }
    }
}
