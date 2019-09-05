package maven.controller;

import maven.pojo.Apply;
import maven.pojo.Evaluation;
import maven.pojo.Record;
import maven.pojo.User;
import maven.service.ApplyService;
import maven.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
public class UserAction {
    @Autowired
    UserService userService;
    @Autowired
    ApplyService applyService;
    @RequestMapping("/view")
    public String view(ModelMap modelMap, HttpSession session){
        User user = (User) session.getAttribute("user");
        List<User> user1 = applyService.selectByUserId(user.getId());
        System.out.println(applyService.selectEva(user.getId()).size());
        modelMap.addAttribute("user",user);
        modelMap.addAttribute("apply",user1);
        modelMap.addAttribute("eve",applyService.selectEva(user.getId()));
        modelMap.addAttribute("records",applyService.selectAllById(user.getId()));
        return "view";
    }

    @RequestMapping(value = "/getRequest/{userId}/{applyId}")
    public String getRequest(@PathVariable int userId , @PathVariable int applyId , HttpSession session, ModelMap modelMap){
        Record record = new Record();
        record.setParentid(userId);
        record.setTeacherid(applyId);
        record.setTime(new Date());
        applyService.insertRecord(record);

        Apply apply = new Apply();
        apply.setUserid(userId);
        apply.setInfoid(applyId);
        applyService.updatePermission(apply);
        return "redirect:/view";
    }

    @PostMapping("/star")
    public String star(Evaluation evaluation, HttpSession session, ModelMap modelMap){
        applyService.insertEva(evaluation);
        return "redirect:/view";
    }
}
