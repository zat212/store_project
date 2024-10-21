package com.storesystem.Repository;

import com.storesystem.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Integer> {

    Admin findByAdminEmail(String email);
}
