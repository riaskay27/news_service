package ua.com.terminals.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.terminals.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    User findByLogin(String login);
}
