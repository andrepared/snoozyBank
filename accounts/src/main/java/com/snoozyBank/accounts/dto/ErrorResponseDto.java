package com.snoozyBank.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data@AllArgsConstructor
public class ErrorResponseDto {

    private String apiPath;
    private HttpStatus erroCode;
    private String errorMsg;
    private LocalDateTime errorTimeStamp;

}
