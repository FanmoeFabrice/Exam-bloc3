package com.Examen.promoweb.service;

import com.Examen.promoweb.model.Admin;
import com.Examen.promoweb.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    private final AdminRepository adminRepository;

    @Autowired
    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public Admin getAdminById(Long id) {
        return adminRepository.findById(id).orElse(null);
    }

    @Override
    public Admin getAdminByUsername(String username) {
        return adminRepository.findByUsername(username);
    }

    @Override
    public void createAdmin(Admin admin) {
        adminRepository.save(admin);
    }

    @Override
    public void updateAdmin(Admin admin) {
        if (adminRepository.existsById(admin.getId())) {
            adminRepository.save(admin);
        }
    }

    @Override
    public boolean deleteAdmin(Long id) {
        adminRepository.deleteById(id);
        return false;
    }

    @Override
    public boolean validateAdmin(String username, String password) {
        return false;
    }


}

