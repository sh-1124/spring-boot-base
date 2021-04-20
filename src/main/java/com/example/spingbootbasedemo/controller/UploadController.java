package com.example.spingbootbasedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@RestController
public class UploadController {

    @PostMapping("/upload")
    public  String upload(MultipartFile upload,String username) throws IOException {
        System.out.println("userName:" + username + "文件名称" + upload.getOriginalFilename());
        upload.transferTo(new File("E:/",upload.getOriginalFilename()));
        return "success";
    }

    @GetMapping("/download")
    public  void download(HttpServletRequest request, HttpServletResponse response){
        File file = new File("E://本人照片.jpg");
        response.setCharacterEncoding("utf-8");
        response.setContentType("multipart/form-data");
        response.setHeader("Content-Disposition","attachment;fileName="+ file.getName());
        InputStream in = null;
        ServletOutputStream out = null;
        try {
            in = new FileInputStream(file);
            out = response.getOutputStream();
            byte[] bytes = new byte[1024];
            int length = 0;
            while ((length = in.read(bytes)) > 0){
                out.write(bytes,0,length);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                out.flush();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
