package ua.com.terminals.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.terminals.entity.Terminal;

@Repository
public interface TerminalsRepo extends JpaRepository <Terminal,Long> {
    Terminal findById(long id);
}
