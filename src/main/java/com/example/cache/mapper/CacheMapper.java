package com.example.cache.mapper;

import com.example.cache.dto.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * created by jg 2021/06/29
 */
@Mapper
public interface CacheMapper {

    @Select("SELECT * FROM post")
    List<Post> findPostCache();
}
