package com.practice.util;

import com.google.gson.Gson;
import com.practice.pojo.AccountAddress;
import com.practice.pojo.AccountPersonalInformation;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtil {

    public static AccountAddress createAAObj(String path){
        Gson gson = new Gson();
        Reader reader = null;
        try {
            reader = Files.newBufferedReader(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gson.fromJson(reader, AccountAddress.class);
    }
}
