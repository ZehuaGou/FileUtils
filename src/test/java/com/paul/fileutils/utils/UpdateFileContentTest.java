package com.paul.fileutils.utils;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;

@SpringBootTest
class UpdateFileContentTest {

    @Test
    public void update() {

    }

    public String read(String path) {
        StringBuffer res = new StringBuffer();
        String line = null;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
            while ((line = reader.readLine()) != null) {
                res.append(line + "\n");
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res.toString();
    }
}
