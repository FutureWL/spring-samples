package com.imooc.controller;

import com.imooc.service.FastDFSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class FileController {

    @Autowired
    private FastDFSService fastDFSService;

    @PostMapping(value="/upload", headers="content-type=multipart/form-data")
    public String uploadFace(MultipartFile file,
                                        HttpServletRequest request,
                                        HttpServletResponse response) throws Exception {

        // 使用fastdfs上传文件
        String path = fastDFSService.upload(file);

        System.out.println(path);

        String fdfsServer = "http://192.168.1.154:8888/";
        return fdfsServer + path;
    }

}
