package com.storesystem.Controller;

import com.storesystem.Model.Admin;
import com.storesystem.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;


@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    //Admin Login Form Get and Post Mapping
    @GetMapping("/adminLogin")
    public String showLogin(){
        return "AdminLogin";
    }

    @PostMapping("/login")
    public String adminLoginPage(@RequestParam(name = "email")String email,
                                 @RequestParam(name = "password")String password,
                                 RedirectAttributes redirectAttributes){
        Admin loginAdmin = adminService.findByEmail(email);

        return null;
    }


    //Admin Registration Get and Post Mapping
    @GetMapping("/adminRegistration")
    public String showRegistration(Model model){
        model.addAttribute("admin",new Admin());
        return "Registration";
    }
    @PostMapping("/adminSignUp")
    public String addAdmin(@ModelAttribute("admin") Admin admin){
        adminService.addAdmin(admin);
        return "redirect:/admin/adminLogin";
    }

    @GetMapping("/test")
    public String showIndex(){
        return "adminIndex";
    }





}
