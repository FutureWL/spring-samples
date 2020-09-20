package cn.huntercat;

import io.minio.MinioClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoMinio implements CommandLineRunner {

    @Value("${app.minio.endpoint}")
    private String endpoint;

    @Value("${app.minio.accessKey}")
    private String accessKey;

    @Value("${app.minio.secretKey}")
    private String secretKey;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoMinio.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        MinioClient minioClient = new MinioClient(endpoint, accessKey, secretKey);
        String bucketName = "spring-boot-samples-demo";
        String objectName = "jdk-14.0.2_windows-x64_bin.zip";
        String fileName = "C:\\Users\\weilai\\Downloads\\jdk-14.0.2_windows-x64_bin.zip";
        boolean isExist = minioClient.bucketExists(bucketName);
        if (isExist) {
            System.out.println("Bucket already exists.");
        } else {
            minioClient.makeBucket(bucketName);
        }
        System.out.println("开始上传文件");
        minioClient.putObject(bucketName, objectName, fileName);
        System.out.println("success");
    }
}
