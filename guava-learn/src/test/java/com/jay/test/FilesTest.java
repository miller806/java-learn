package com.jay.test;

import com.google.common.io.Files;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

@Slf4j
public class FilesTest {
    @Test
    void fileTest() throws IOException {
        File newFile = new File("D://test.txt");
        //每次写会冲掉之前的数据
        Files.write("this is a test".getBytes(), newFile);
        Files.write("just".getBytes(StandardCharsets.UTF_8), newFile);
        //追加
        Files.append("lsk", newFile, Charset.defaultCharset());
    }
}
