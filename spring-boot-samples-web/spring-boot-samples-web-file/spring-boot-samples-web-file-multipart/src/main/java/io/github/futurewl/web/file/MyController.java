package io.github.futurewl.web.file;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@RestController
public class MyController {

    /**
     * 上传单个文件
     *
     * @param file
     * @return
     */
    @RequestMapping("/upload")
    public String update(MultipartFile file) {
        try {
            if (file.isEmpty()) {
                return "file is empty";
            }
            String fileName = file.getOriginalFilename();
            String suffixName = fileName.substring(fileName.lastIndexOf("."));
            String filePath = "";
            String path = filePath + fileName;
            File dest = new File(path);
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdir();
            }
            file.transferTo(dest);
        } catch (IllegalStateException ise) {
            ise.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return "upload failure";
    }

    /**
     * 上传多个文件
     *
     * @param request
     * @return
     */
    @PostMapping("/batch")
    public String handleFileUpload(HttpServletRequest request) {
        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
        MultipartFile file = null;
        BufferedOutputStream outputStream = null;
        for (MultipartFile multipartFile : files) {
            file = multipartFile;
            String filePath = "G:\\uploads";
            if (!file.isEmpty()) {
                try {
                    byte[] bytes = file.getBytes();
                    outputStream = new BufferedOutputStream(new FileOutputStream(new File(
                            filePath + file.getOriginalFilename())));
                    outputStream.write(bytes);
                    outputStream.close();
                } catch (Exception e) {
                    return "";
                }
            } else {
                return "";
            }
        }
        return "upload Multifile success";
    }

}
