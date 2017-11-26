package com.oa.base.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

/**
 * @author Q
 * @version V1.0
 * @Description: ${todo}
 * @date 2017-11-23 20:15
 */
@Getter
@Setter

public class Department extends  Domain implements Serializable {

    private String name;
    private String description;


}
