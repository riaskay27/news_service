package ua.com.newsAPEPS.service;

import org.springframework.stereotype.Service;
import ua.com.newsAPEPS.entity.News;
import ua.com.newsAPEPS.exception.NewsNotFoundException;
import ua.com.newsAPEPS.repo.NewsRepo;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Optional;

@Service
public class NewsService {

    private NewsRepo repo;

    public NewsService(NewsRepo newsRepo) {
        this.repo = newsRepo;
    }

    public List<News> getAllNews() {
        return repo.findAll();
    }


    public News getNewsById(long id) {
        return repo.findById(id).orElseThrow(()-> new NewsNotFoundException("News not found"));
    }

    public void addNews(News news) {
        repo.save(news);
    }

    public News updateNewsById(News news, long id) {
        News current = repo.findById(id).orElse(null);
        BeanUtils.copyProperties(news,current,"id");
        return current;
    }

    public void deleteNewsById(long id) {
        repo.deleteById(id);
    }
}
