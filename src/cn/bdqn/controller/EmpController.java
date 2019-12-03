package cn.bdqn.controller;

import cn.bdqn.entity.Emp;
import cn.bdqn.service.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class EmpController {
    @Resource
    private EmpService empService;
    @RequestMapping("/login.html")
    public  String login(@RequestParam(value = "ename",required = false) String ename, @RequestParam(value = "epwd",required = false)String epwd, Model mode){
        if (ename!=null&&epwd!=null){
            Emp e=empService.getEmpList(ename,epwd);
            System.out.println(""+e.getEname()+""+e.getEpwd());
            mode.addAttribute("emp",e);
        }
        return "yes";
    }
}
