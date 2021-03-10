package sk.ojt.backend.admin.service;

import org.springframework.stereotype.Service;
import sk.ojt.backend.admin.jpa.Admin;
import sk.ojt.backend.admin.repository.AdminRepository;

import java.util.List;

@Service
public class AdminService {

    private AdminRepository repo;

    public AdminService(AdminRepository repo) {
        this.repo = repo;
    }

    public List<Admin> getAllAdminList() {
        return repo.findAll();
    }

    public List<Admin> getAdminInfo(long adminId) {
        return repo.findByAdminId(adminId);
    }
}
