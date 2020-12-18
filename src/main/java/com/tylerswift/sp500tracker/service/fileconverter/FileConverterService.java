package com.tylerswift.sp500tracker.service.fileconverter;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;

public interface FileConverterService {

    File convertToFile(MultipartFile multipartFile);
}
