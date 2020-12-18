package com.tylerswift.sp500tracker.service.filestorage;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileStorageServiceImpl implements FileStorageService {

    @Override
    public void uploadFile(MultipartFile file) {

        Path testFileDirectory = Paths.get("/Users/tylerrodriguez/TestFileDirectory");

        System.out.println("testFileDirectory = " + testFileDirectory.toString());
        System.out.println("OriginalFilename = " + file.getOriginalFilename());

        Path filepath = Paths.get(testFileDirectory.toString(), file.getOriginalFilename());

        try (OutputStream os = Files.newOutputStream(filepath)) {
            os.write(file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
