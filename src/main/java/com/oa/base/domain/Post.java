package com.oa.base.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Q
 * @version V1.0
 * @Description: ${todo}
 * @date 2017-11-23 20:15
 */
@Getter
@Setter
public class Post  implements Serializable {

    private Long id;
    private String name;
    private String description;

}
