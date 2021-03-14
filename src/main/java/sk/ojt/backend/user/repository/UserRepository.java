package sk.ojt.backend.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sk.ojt.backend.user.jpa.User;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAll();
    User findByUserId(long userId);
    User save(User user);
    int deleteByUserId(long userId);
}
