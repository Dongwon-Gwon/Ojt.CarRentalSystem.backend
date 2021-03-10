package sk.ojt.backend.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.ojt.backend.admin.jpa.Admin;

import java.util.List;

public interface AdminRepository extends JpaRepository<Admin, Long> {

    List<Admin> findByAdminId(long adminId);
    List<Admin> findAll();

}
