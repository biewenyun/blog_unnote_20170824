package site.zkd.unnote.model.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.zkd.unnote.model.mybatis.bean.LabelBean;
import site.zkd.unnote.model.mybatis.bean.LabelBeanExample;
import site.zkd.unnote.model.mybatis.dao.LabelBeanMapper;
import site.zkd.unnote.model.service.ILabelService;

import java.util.List;
@Service("ILabelService")
public class LabelServiceImpl implements ILabelService {

    @Autowired
    private LabelBeanMapper labelBeanMapper;

    @Override
    public List<LabelBean> getLabelBeanList(Long userId) {
        List<LabelBean>LabelBeanList;
        LabelBeanExample labelBeanExample =new LabelBeanExample();
        labelBeanExample.or().andUserIdEqualTo(userId);
        LabelBeanList=labelBeanMapper.selectByExample(labelBeanExample);
        return LabelBeanList;
    }
}
