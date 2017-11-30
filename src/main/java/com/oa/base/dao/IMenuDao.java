package com.oa.base.dao;

import com.oa.base.domain.Menu;

import java.util.List;
import java.util.Set;

/**
 * @author Q
 * @version V1.0
 * @Description: ${todo}
 * @date 2017-11-30 13:09
 */
public interface IMenuDao<T> extends IGeneralDao<T>{
    /**
     * 根据父节点查询子节点
     * @return
     */
    Set<Menu> queryMenuByParentId(Long id);


    List<Menu> queryMenuByArray(Long[] ids);
}
