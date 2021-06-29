package com.example.cache.service;

import com.example.cache.mapper.CacheMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * created by jg 2021/06/29
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class CacheService {

    private final CacheMapper cacheMapper;

    @Cacheable(value="findPostCache")
    public void ehCacheTest() {
        cacheMapper.findPostCache();
    }
}
