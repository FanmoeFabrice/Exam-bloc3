package com.Examen.promoweb.service;


import com.Examen.promoweb.model.Admin;

public interface AdminService {
    Admin getAdminById(Long id);
    Admin getAdminByUsername(String username);
    void createAdmin(Admin admin);
    void updateAdmin(Admin admin);
    boolean deleteAdmin(Long id);

    boolean validateAdmin(String username, String password);

}

