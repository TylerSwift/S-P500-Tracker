package com.tylerswift.sp500tracker.service.filestorage;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;

public interface FileStorageService {
    void uploadFile(MultipartFile file);
}
