package com.micro.galleryservice;

import lombok.Data;

import java.util.List;

@Data
public class Gallery {
    private Long id;
    private List<Object> images;
}
