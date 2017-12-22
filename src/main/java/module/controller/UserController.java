package module.controller;

import module.model.User;
import module.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private Logger log = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;

    @RequestMapping(value = "/showUser", method = RequestMethod.GET)
    public @ResponseBody
    List showUser() {
        log.info("查询所有用户信息");
        List<User> userList = userService.getAllUser();
        return userList;
    }

    @RequestMapping(value = "/getUserById", method = RequestMethod.GET)
    public @ResponseBody
    User getUserById(@RequestParam(value="id",defaultValue="1") Long id) {
        log.info("查询所有用户信息");
        return userService.getUserById(id);
    }
}
