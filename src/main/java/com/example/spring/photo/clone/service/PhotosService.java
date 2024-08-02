package com.example.spring.photo.clone.service;

import com.example.spring.photo.clone.model.Photo;
import com.example.spring.photo.clone.repository.PhotosRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PhotosService {

    private final PhotosRepository photosRepository;

    public PhotosService(PhotosRepository photosRepository) {
        this.photosRepository = photosRepository;
    }

    public Iterable<Photo> get() {
        return photosRepository.findAll();
    }

    public Photo get(Integer id) {
        return photosRepository.findById(id).orElse(null);
    }

    public void remove(Integer id) {
        photosRepository.deleteById(id);
    }

    public Photo save(String filename, String contentType, byte[] data) {
        Photo photo = new Photo();
        photo.setContentType(contentType);
        photo.setFileName(filename);
        photo.setData(data);
        photosRepository.save(photo);
        return photo;
    }
}
