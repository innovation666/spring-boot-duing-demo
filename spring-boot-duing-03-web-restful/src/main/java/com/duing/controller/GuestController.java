package com.duing.controller;


import com.duing.bean.Guest;
import com.duing.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 业务控制类 返回视图
 * 使用restful技术进行crud
 *
 * @RequestMapping("/guest")
 * 放在类上面，代表类里面的方法是以此开头的
 *
 */
@Controller
@RequestMapping("/guest")
public class  GuestController {

    @Autowired
    private GuestService guestService;

    //查询嘉宾列表
    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping
    private String list(Model model){
        List<Guest> guestList = guestService.list();
        model.addAttribute("guestList",guestList);
        return "list";
    }

    //添加嘉宾
    @GetMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

    @PostMapping
    public String add(Guest guest){
        guestService.add(guest);
        return "redirect:/guest";
    }

    //修改嘉宾

    /**
     * 将/guest/toUpdate/{name}格式的url映射到此地方
     * 其中的name属性值 通过注解@PathVariable("name")映射到方法的属性中
     * 其中的"name"代表去url中查找的属性值
     * 直译的意思就是将从路径中获取的属性值给方法参数列表对应的参数
     *
     * @param model
     * @param name
     * @return
     */
    @GetMapping("/toUpdate/{name}")
    public String toUpdate(Model model,@PathVariable("name") String name){
        Guest guest = guestService.get(name);
        model.addAttribute("guest",guest);
        return "update";
    }

    @PutMapping
    public String update(Guest guest){
        guestService.update(guest);
        return "redirect:/guest";
    }

    //删除嘉宾
    @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name){
        guestService.delete(name);
        return "redirect:/guest";
    }
}
