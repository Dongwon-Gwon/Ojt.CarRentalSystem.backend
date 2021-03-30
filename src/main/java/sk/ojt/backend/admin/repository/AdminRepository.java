package sk.ojt.backend.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.ojt.backend.admin.jpa.Admin;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface AdminRepository extends JpaRepository<Admin, Long> {

    List<Admin> findByAdminId(long adminId);
    List<Admin> findAll();

    Admin save(Admin admin);
    int deleteByAdminId(long adminId);
}
