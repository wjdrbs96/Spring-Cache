package com.example.cache.controller;

import com.example.cache.service.CacheService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by jg 2021/06/29
 */
@RequiredArgsConstructor
@RestController
public class CacheController {

    private final CacheService cacheService;

    @GetMapping("/")
    public String cache() {
        long l = System.currentTimeMillis();
        cacheService.ehCacheTest();
        System.out.println(System.currentTimeMillis() - l);
        return "Cache Test";
    }
}
