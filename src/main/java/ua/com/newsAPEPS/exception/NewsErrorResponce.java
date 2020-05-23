package ua.com.newsAPEPS.exception;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NewsErrorResponce {
    private long timestamp;
    private String message;
    private int status;
    private LocalDateTime timeStamp;
}
