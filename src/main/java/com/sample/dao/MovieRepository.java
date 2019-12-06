package com.sample.dao;

import org.springframework.stereotype.Repository;

import com.sample.domain.Movie;

import org.springframework.data.repository.*;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {

}
