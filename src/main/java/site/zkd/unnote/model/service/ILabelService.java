package site.zkd.unnote.model.service;

import site.zkd.unnote.model.mybatis.bean.LabelBean;

import java.util.List;

public interface ILabelService {

    /**
     * 根据userId获取此用户的所有标签信息
     * @param userId
     * @return
     */
    List<LabelBean> getLabelBeanList(Long userId);

}
