package kz.iitu.lms.repository;

import kz.iitu.lms.model.Userbooks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserBookRepository extends JpaRepository<Userbooks,Long> {
    Userbooks getById(Long id);
    List<Userbooks> getAllByUserId(Long id);
    List<Userbooks> getAllByBookId(Long id);
}
