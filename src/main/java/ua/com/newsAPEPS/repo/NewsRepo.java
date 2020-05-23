package ua.com.newsAPEPS.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.newsAPEPS.entity.News;

import java.util.Optional;

@Repository
public interface NewsRepo extends JpaRepository <News,Long> {

}
