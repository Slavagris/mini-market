package ru.geekbrains.mini.market.dto;

import lombok.Data;

@Data
public class ErrorBody {
    private Integer status;
    private String message;
    private String timestamp;
}