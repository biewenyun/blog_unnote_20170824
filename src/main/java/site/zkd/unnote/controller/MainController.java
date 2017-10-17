package site.zkd.unnote.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;


@Controller
@Api(description = "主要入口控制器")
public class MainController {
    @RequestMapping(value = "/main/login", method = RequestMethod.GET)
    @ApiOperation(value = "打开用户登录界面",
            notes = "返回用户登录界面")
    public String userLogin(HttpServletRequest request) {
//        User user = (User) request.getSession().getAttribute("userInfo");
//        if (null != user) return "redirect:/endSupport/index";
//        return "userLogin";
        return null;
    }

    @RequestMapping(value = "/apiDocs", method = RequestMethod.GET)
    @ApiOperation(value = "api接口",
            notes = "打开API接口页面")
    public String apiDocs() {
        return "redirect:swagger-ui.html#!/";
    }

    @RequestMapping(value = "/serverCenter", method = RequestMethod.GET)
    @ApiOperation(value = "监控中心",
            notes = "打开服务器管理中心")
    public String druid() {
        return "redirect:druid";
    }
}
