package com.myblog04.myblog04.repository;

import com.myblog04.myblog04.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
