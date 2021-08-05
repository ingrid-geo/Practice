package PracticeTests;

import com.google.gson.*;
import com.practice.pojo.*;
import org.junit.*;

import java.io.*;
import java.nio.file.*;



public class ReadAccountAddress {
    @Test

    public void accountAddress () {

        try {
        Gson gson = new Gson();
        Reader reader = Files.newBufferedReader(Paths.get(System.getProperty("user.dir") + "/src/test/resources/testData/createAccountAddress.json"));
        AccountAddress accountAddress = gson.fromJson(reader, AccountAddress.class);
        System.out.println(accountAddress);
        reader.close();

    } catch(
    Exception ex)

    {
        ex.printStackTrace();
    }
}
}
