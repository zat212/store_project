package com.storesystem.Service;

import com.storesystem.Model.Admin;
import com.storesystem.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public void addAdmin(Admin admin){
    admin.setJoinDate(new Date());
    admin.setAdminPassword(passwordEncoder.encode(admin.getAdminPassword()));
    adminRepository.save(admin);
    }

    public List<Admin> findAllAdmin(){
        return adminRepository.findAll();
    }

    public Admin findByEmail(String email){
        return adminRepository.findByAdminEmail(email);
    }
}
