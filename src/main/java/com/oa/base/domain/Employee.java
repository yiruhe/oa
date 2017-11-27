package com.oa.base.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Q
 * @version V1.0
 * @Description: ${todo}
 * @date 2017-11-23 20:14
 */
@Getter
@Setter
public class Employee implements Serializable {
    private Long id;
    private String name;
    private String password;
    private String sex;
    private String phone;
    private String email;
    private Department department;
    private Set<Post> posts = new HashSet<>();
}
