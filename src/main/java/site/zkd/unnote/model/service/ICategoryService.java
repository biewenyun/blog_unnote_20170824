package site.zkd.unnote.model.service;

import site.zkd.unnote.model.mybatis.bean.CategoryBean;

import java.util.List;

public interface ICategoryService {

    /**
     * 根据userId获取此用户的所有类别信息
     * @param userId
     * @return
     */
    List<CategoryBean> getCategoryBeanList(Long userId);

}
