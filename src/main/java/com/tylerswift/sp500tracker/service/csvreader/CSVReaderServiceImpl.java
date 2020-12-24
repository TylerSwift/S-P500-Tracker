package com.tylerswift.sp500tracker.service.csvreader;

import com.tylerswift.sp500tracker.model.CSVObject;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CSVReaderServiceImpl implements CSVReaderService {

    @Override
    public void readCSV(File file, Boolean header) {

        List<List<String>> lines = new ArrayList<>();

        try (
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            String line = bufferedReader.readLine();
            List<String> headers = Arrays.asList(line.split(","));

            while (line != null) {
                List<String> data = Arrays.asList(line.split(","));
                lines.add(data);
                System.out.println(data);
                line = bufferedReader.readLine();
            }

            System.out.println(lines);

            CSVObject csvObject = new CSVObject(headers, lines);

            csvObject.describe();

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound Exception");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO Exception");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception");
            e.printStackTrace();
        }
    }
}
