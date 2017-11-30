package com.oa.base.service;

import com.oa.base.domain.Menu;

import java.util.List;
import java.util.Set;

/**
 * @author Q
 * @version V1.0
 * @Description: ${todo}
 * @date 2017-11-30 13:10
 */
public interface IMenuService {

    void save(Menu p);

    void update(Menu p);

    void delete(Long i);

    Menu get(Long id);

    List<Menu> queryAll();

    /**
     *  根据父节点id查询子节点
     * @param id
     * @return
     */
    Set<Menu> queryMenuByParentId(Long id);

    /**
     *  保存用户权限
     * @param ids
     */
    List<Menu> queryMenuByArray(Long[] ids);


}
