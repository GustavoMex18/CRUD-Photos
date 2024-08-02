package com.example.spring.photo.clone.repository;

import com.example.spring.photo.clone.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotosRepository extends CrudRepository<Photo, Integer> {



}
