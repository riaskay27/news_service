package ua.com.newsAPEPS.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class NewsErrorHandler {

    @ExceptionHandler
    ResponseEntity<NewsErrorResponce> handlerException(NewsNotFoundException e){

        NewsErrorResponce error= NewsErrorResponce.builder()
                .message(e.getMessage())
                .status(HttpStatus.NOT_FOUND.value())
                .timestamp(System.currentTimeMillis())
                .build();
        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }
}
