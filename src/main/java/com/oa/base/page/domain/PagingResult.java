package com.oa.base.page.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Q
 * @version V1.0
 * @Description: ${todo}
 * @date 2017-11-24 00:10
 */
@Getter@Setter
public class PagingResult {

    private List<?> result;


    public PagingResult(List list){

        this.result = list;

    }
}
