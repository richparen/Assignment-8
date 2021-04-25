package kz.iitu.lms.repository;

import kz.iitu.lms.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User getById(Long id);
    List<User> getAllByFullNameContaining(String fullName);
    List<User> deleteUserById(Long id);
    User findByUsername(String username);
}
