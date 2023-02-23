package ch3_wrapper.myIO;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws Exception {
        InputStream in =
                //外面可以嵌套若干层的wrapper
                new LowerCaseInputStream(
                new BufferedInputStream(
                //洋葱的最内侧肯定是提供核心功能的wrapped
                new ByteArrayInputStream("Hello World!!".getBytes(StandardCharsets.UTF_8))));
        int c;
        while( (c = in.read()) != -1 )
            System.out.print((char) c);

        in.close();
    }
}
