package com.gulukal.blogspringtrestapi.repository;

import com.gulukal.blogspringtrestapi.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * @author Gulten Ulukal
 */

// @Repository // infact no need to add...
// @Transactional // infact no need to add...
public interface PostRepository extends JpaRepository<Post, Long> {


}
