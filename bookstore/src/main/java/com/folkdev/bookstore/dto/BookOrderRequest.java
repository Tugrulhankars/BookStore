package com.folkdev.bookstore.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class BookOrderRequest {
    private List<Integer> bookIdList;
    private String userName;
}
