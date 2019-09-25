package com.example.demo;

import com.example.demo.models.Attachment;
import com.example.demo.models.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FeignRun implements CommandLineRunner {

    private final FeignClient feignClient;

    public FeignRun(FeignClient feignClient) {
        this.feignClient = feignClient;
    }

    @Override
    public void run(String... args) throws Exception {

        // Registering a student - ID = 5
        Student reg = feignClient.registerStudent(new Student("94337", "Shawn"));
        System.out.println("Created the following: " + reg);

        // Request attachment
        Attachment request = feignClient.createAttachment(43L);
        System.out.println(request);

        //Patch Student
        Attachment patchAttachment = feignClient.patchAttachment(43L, 14L);

        //Delete Application
        Attachment deleteAttached = feignClient.deleteAttachment(43L, 14L, 7L);
        System.out.println(request);

    }
}
