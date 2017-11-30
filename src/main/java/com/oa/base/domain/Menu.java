package com.oa.base.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Q
 * @version V1.0
 * @Description: ${todo}
 * @date 2017-11-30 12:58
 */
@Getter
@Setter
public class Menu {

    //是否为父节点常量
    public static Boolean IS_PARENT_YES = true;
    public static Boolean IS_PARENT_NO = false;

    private Long id;
    private String name;
    private Boolean isParent;

    private Long parentId;
    private String icon;
    private Boolean checked;
    private String url;
}
