package PracticeTests;

import com.google.gson.*;
import com.practice.pojo.*;
import org.junit.*;

import java.io.*;
import java.nio.file.*;

public class ReadAccountPersonalInformation {

    @Test

    public void accountPersonalInformation() {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(System.getProperty("user.dir")+"/src/test/resources/testData/createAccountPersonalInformation.json"));
            AccountPersonalInformation personalInformation = gson.fromJson(reader, AccountPersonalInformation.class);
            System.out.println(personalInformation);
            reader.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}