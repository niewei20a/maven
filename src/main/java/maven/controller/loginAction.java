package maven.controller;

import maven.pojo.Apply;
import maven.pojo.Info;
import maven.pojo.Teacherinfo;
import maven.pojo.User;
import maven.service.ApplyService;
import maven.service.InfoService;
import maven.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class loginAction {

    @Autowired
    UserService userService;

    @Autowired
    InfoService infoService;
    @Autowired
    ApplyService applyService;
    @RequestMapping("/login")
    public String login_index(ModelMap modelMap, HttpSession session){
        List<Teacherinfo> info = infoService.selectTeacher();
        modelMap.addAttribute("teacher",info);
        modelMap.addAttribute("user",session.getAttribute("user"));
        return "welcome";
    }

    @PostMapping("/register")
    public String Register(User user, HttpSession session, ModelMap modelMap){
        System.out.println(user.toString());
        userService.register(user);
        return "welcome";
    }

    @PostMapping("/loginCheck")
    public String loginCheck(User user, HttpSession session, ModelMap modelMap){
        System.out.println(user.toString());
        User user1 = userService.loginCheck(user);
        if(user1!=null && !user1.equals("")){
            session.setAttribute("user",user1);
        }
        return "redirect:login";
    }

    @RequestMapping(value = "/detail/{id}")
    public String detail(@PathVariable int id , HttpSession session, ModelMap modelMap){

        Info info = infoService.selectInfoById(id);

        User user= (User) session.getAttribute("user");
        modelMap.addAttribute("user",user);
        modelMap.addAttribute("teacher",userService.selectById(id));
        modelMap.addAttribute("info",info);
        modelMap.addAttribute("course",infoService.getCourse(info.getCourseid()));
        modelMap.addAttribute("grade",infoService.getGrade(info.getGradeid()));
        modelMap.addAttribute("evas",applyService.selectEvaInfo(id));

        if(user!=null){
            Apply apply = new Apply();
            apply.setUserid(user.getId());
            apply.setInfoid(info.getUserid());
            modelMap.addAttribute("apply",applyService.selectByTwoId(apply));
        }
        return "detail";
    }

    @RequestMapping("/permission")
    public String permission (HttpSession session, ModelMap modelMap){
        modelMap.addAttribute("user",userService.permission());
        modelMap.addAttribute("info",infoService.permission());
        return "permission";
    }

    @RequestMapping(value = "/failUser/{id}")
    public String failUser(@PathVariable int id , HttpSession session, ModelMap modelMap){
        userService.failUser(id);
        return "redirect:/login";
    }
    @RequestMapping(value = "/passUser/{id}")
    public String passUser(@PathVariable int id , HttpSession session, ModelMap modelMap){
        userService.passUser(id);
        return "redirect:/login";
    }

    @RequestMapping(value = "/failInfo/{id}")
    public String failInfo(@PathVariable int id , HttpSession session, ModelMap modelMap){
        infoService.failInfo(id);
        return "redirect:/login";
    }
    @RequestMapping(value = "/passInfo/{id}")
    public String passInfo(@PathVariable int id , HttpSession session, ModelMap modelMap){
        infoService.passInfo(id);
        return "redirect:/login";
    }

    @RequestMapping(value = "/apply/{userId}/{applyId}")
    public String apply(@PathVariable int userId ,@PathVariable int applyId , HttpSession session, ModelMap modelMap){
        System.out.println("u =" + userId +" apply =" + applyId);
        Apply apply = new Apply();
        apply.setUserid(applyId);
        apply.setInfoid(userId);
        apply.setPermission(0);
        applyService.insert(apply);
        return "redirect:/detail/"+userId;
    }

    @RequestMapping("/quit")
    public String quit(ModelMap modelMap, HttpSession session){
        session.removeAttribute("user");
        return "redirect:./login";
    }


    @RequestMapping("/registerStudent")
    public String reStudent(){
        return "login";
    }
}
