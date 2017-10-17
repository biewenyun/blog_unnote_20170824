package site.zkd.unnote.controller.backSupporter;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import site.zkd.unnote.utils.EncryptUtils;
import site.zkd.unnote.utils.GsonUtils;
import site.zkd.unnote.utils.PublicUtil;
import site.zkd.unnote.utils.StringUtils;

import javax.servlet.http.HttpServletRequest;

import java.io.IOException;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@Controller
@RequestMapping(value = "/user")
@Api(value = "/user", description = "用户相关")
public class SysUserController {

//    @Autowired
//    public UserService userService;
//
//    @RequestMapping(value = "/login"
//            , produces = {APPLICATION_JSON_UTF8_VALUE}
//            , method = RequestMethod.POST)
//    @ApiOperation(
//            value = "用户登录"
//            , notes = "用户登录的接口，输入用户名和密码进行登录"
//            , response = User.class)
//    @ResponseBody
//    public Object userLogin(HttpServletRequest request,
//                            @ApiParam(value = "用户名不能为空，否则不允许登录"
//                                    , required = true) @RequestParam("userId") String userId,
//                            @ApiParam(value = "用户密码不能为空且必须为16位小写MD5，否则不允许登录"
//                                    , required = true) @RequestParam("userPwd") String userPwd) {
//        ResponseObj<User> responseObj = new ResponseObj<>();
//        User user;
//        if (PublicUtil.isJsonRequest(request)) {    //确认是否是post的json提交
//            try {
//                user = new GsonUtils().jsonRequest2Bean(request.getInputStream(), User.class);  //转换为指定类型的对象
//                userId = user.getUser_id();
//                userPwd = user.getUser_pwd();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        if (StringUtils.isEmpty(userId) || StringUtils.isEmpty(userPwd)) {
//            responseObj.setCode(ResponseObj.FAILED);
//            responseObj.setMsg("用户名和密码不能为空！请检查！");
//            return new GsonUtils().toJson(responseObj);
//        }
//
//        user = userService.findOneById(userId);
//
//        if (null == user) {
//            responseObj.setCode(ResponseObj.EMPUTY);
//            responseObj.setMsg("用户不存在！请检查!");
//            return new GsonUtils().toJson(responseObj);
//        }
//
//        userPwd = userPwd.toLowerCase();  //将大写md5转换为小写md5
//
//        if (userPwd.length() > 16 && userPwd.length() == 32) {    //32位小写转换为16位小写
//            userPwd = userPwd.substring(8, 24).toLowerCase();
//        } else if (userPwd.length() > 32) {
//            responseObj.setCode(ResponseObj.FAILED);
//            responseObj.setMsg("密码不规范！请检查！");
//            return new GsonUtils().toJson(responseObj);
//        }
//
//        String encryptPassword = EncryptUtils.encryptPassword(userPwd, user.getUser_salt());
//        System.out.println(encryptPassword);
//
//        if (!encryptPassword.equals(user.getUser_pwd())) {
//            responseObj.setCode(ResponseObj.FAILED);
//            responseObj.setMsg("用户名和密码不匹配！请检查！");
//            return new GsonUtils().toJson(responseObj);
//        }
//
//        user.setUser_sessionid(request.getSession().getId()); //将sessionId放入用户信息中
//        user.setUser_salt("");  //将用户注册的salt清空
//        user.setUser_url("/user/endSupport/index");
//
//        responseObj.setData(user);
//        responseObj.setCode(ResponseObj.OK);
//        responseObj.setMsg("登录成功");
//
//        System.out.println(new GsonUtils().toJson(responseObj));
//        return new GsonUtils().toJson(responseObj);
//    }
//
//    @RequestMapping(value = "/endSupport/index", method = RequestMethod.GET)
//    @ApiOperation(value = "用户后端入口", notes = "后端入口页面，自动检查用户信息是否存在，不存在则去登录")
//    public String endSupportIndex() {
//        return "endSupport/index";
//    }
//
//    @RequestMapping(value = "/endSupport/backManagement", method = RequestMethod.GET)
//    @ApiOperation(value = "", notes = "")
//    public String endSupportManagement() {
//        return "endSupport/backManagement";
//    }
//    /**
//     * 返回主页面
//     *
//     * @return
//     */
//    @RequestMapping(value = "/main", method = RequestMethod.GET)
//    @ApiOperation(value = "打开首页界面", notes = "首页web界面，js模板加载网页数据")
//    public ModelAndView frontMain(HttpServletRequest request) throws Exception {
//        ModelAndView view = new ModelAndView("frontMain");
//        view.addObject("framJson", getFramJson());
//        view.addObject("postsJson", findPublishPost(request, 1, 10));
//        return view;
//    }
}

