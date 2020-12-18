package com.tylerswift.sp500tracker.controller;

import com.tylerswift.sp500tracker.response.SuccessfulResponse;
import com.tylerswift.sp500tracker.service.csvreader.CSVReaderService;
import com.tylerswift.sp500tracker.service.fileconverter.FileConverterService;
import com.tylerswift.sp500tracker.service.filestorage.FileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

public class FileUploadController {

    @Autowired
    FileStorageService fileStorageService;

    @Autowired
    FileConverterService fileConverterService;

    @Autowired
    CSVReaderService csvReaderService;

    @PostMapping("/covid_file")
    public SuccessfulResponse handleFileUpload(@RequestParam MultipartFile file) {

        fileStorageService.uploadFile(file);
//        File csvFile = fileConverterService.convertToFile(file);
//        csvReaderService.readCSV(csvFile);

        return new SuccessfulResponse(file.getName(), "Successfully uploaded file!");
    }
}
