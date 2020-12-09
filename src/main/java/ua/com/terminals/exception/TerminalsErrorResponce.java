package ua.com.terminals.exception;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TerminalsErrorResponce {
    private long timestamp;
    private String message;
    private int status;
    private LocalDateTime timeStamp;
}
