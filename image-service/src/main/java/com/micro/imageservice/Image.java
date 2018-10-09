package com.micro.imageservice;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Image {
    private Long id;
    private String title;
    private String url;
}
