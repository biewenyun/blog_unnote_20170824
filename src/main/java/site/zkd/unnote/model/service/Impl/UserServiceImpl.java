package site.zkd.unnote.model.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.zkd.unnote.model.mybatis.bean.UserBean;
import site.zkd.unnote.model.mybatis.bean.UserBeanExample;
import site.zkd.unnote.model.mybatis.dao.UserBeanMapper;
import site.zkd.unnote.model.service.IUserService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("IUserService")
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserBeanMapper userBeanMapper;

    @Override
    public List getUserNameAndID() {
        UserBeanExample userBeanExample =new UserBeanExample();
        List<UserBean> list=userBeanMapper.selectByExample(userBeanExample);

        List usersList =new ArrayList();
        for(int i=0;i<list.size();i++){
            Map<String,Object> userMap =new HashMap<>();
            userMap.put("NAME",list.get(i).getUserDisplayname());
            userMap.put("ID",list.get(i).getUserId());
            usersList.add(userMap);
        }
        return usersList;
    }
}
