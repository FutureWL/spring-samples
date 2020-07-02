package com.imooc.service.impl;

import com.github.tobato.fastdfs.domain.fdfs.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import com.imooc.service.FastDFSService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FastDFSServiceImpl implements FastDFSService {

    @Autowired
    private FastFileStorageClient fastFileStorageClient;

    @Override
    public String upload(MultipartFile file) throws Exception {

//        String fileName = file.getOriginalFilename();

        if(file != null) {
            String fileName = file.getOriginalFilename();
            // 判断文件名不为空
            if(StringUtils.isNotBlank(fileName)) {
                // 组装文件名
                String fileNameArr[] = fileName.split("\\.");
                String suffix = fileNameArr[fileNameArr.length - 1];

                if (!suffix.equalsIgnoreCase("png") &&
                        !suffix.equalsIgnoreCase("jpg") &&
                        !suffix.equalsIgnoreCase("jpeg")) {
                    return null;
                }

                StorePath storePath = fastFileStorageClient.uploadFile(file.getInputStream(),
                        file.getSize(),
                        suffix,
                        null);

                String path = storePath.getFullPath();

                return path;
            }
        }

        return null;
    }

}
