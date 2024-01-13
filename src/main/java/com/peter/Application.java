package com.peter;

//import cn.hutool.core.io.FileUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
        String filePath = "CLASSPATH:";
//        File file = FileUtil.file(filePath);
        System.out.println("end");
    }
}
