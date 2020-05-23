package ua.com.newsAPEPS.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.com.newsAPEPS.entity.News;
import ua.com.newsAPEPS.service.NewsService;

@RestController
@RequestMapping(value = "/app",
        produces = {MediaType.APPLICATION_JSON_VALUE})
@CrossOrigin(origins = "http://localhost:3000")
public class NewsController {

    private NewsService service;

    public NewsController(NewsService newsService) {
        this.service=newsService;
    }

    @GetMapping("news")
    public ResponseEntity<Object> getAllNews() {
        return new ResponseEntity<>(service.getAllNews(), HttpStatus.OK);
    }

    @GetMapping("news/{id}")
    public ResponseEntity<Object> getNewsById(@PathVariable(value = "id") long id) {
        return new ResponseEntity<>(service.getNewsById(id), HttpStatus.OK);
    }

    @PostMapping("news")
    public ResponseEntity<Object> addNews(@RequestBody News news) {
        service.addNews(news);
        return new ResponseEntity<>("News is created successfully"+news.toString(), HttpStatus.OK);
    }

    @PutMapping("news/{id}")
    public ResponseEntity<Object> updateNewsById(@PathVariable(value = "id") long id,
                                                 @RequestBody News news) {
        service.updateNewsById(news,id);
        return new ResponseEntity<>("News is updated successfully"+news.toString(), HttpStatus.OK);
    }

    @DeleteMapping("news/{id}")
    public ResponseEntity<Object> deleteNewsById(@PathVariable(value = "id") long id) {
        service.deleteNewsById(id);
        return new ResponseEntity<>("News is deleted", HttpStatus.OK);
    }
}
