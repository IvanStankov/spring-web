package com.ivan.jmp.springweb.repository;

import com.ivan.jmp.springweb.entity.Movie;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Иван on 13.04.2016.
 */
@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    List<Movie> findByNameLike(String q);

}
