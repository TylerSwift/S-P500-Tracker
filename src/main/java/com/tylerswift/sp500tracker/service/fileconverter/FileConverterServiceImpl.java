package com.tylerswift.sp500tracker.service.fileconverter;

import com.tylerswift.sp500tracker.exception.NullFileNameException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Service
public class FileConverterServiceImpl implements FileConverterService {
    @Override
    public File convertToFile(MultipartFile multipartFile) {
        if (multipartFile.getOriginalFilename() == null) {
            throw new NullFileNameException("File Name is NULL");
        }

        File convertedFile = new File(multipartFile.getOriginalFilename());

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(convertedFile);
            fileOutputStream.write(multipartFile.getBytes());
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return convertedFile;
    }
}
