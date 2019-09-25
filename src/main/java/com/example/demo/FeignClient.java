package com.example.demo;

import com.example.demo.models.Attachment;
import com.example.demo.models.Student;
import org.springframework.web.bind.annotation.*;

@org.springframework.cloud.openfeign.FeignClient(name = "client", url = "http://10.51.10.111:2000",configuration = FeignConfig.class)
public interface FeignClient {

    //Register Student
    @RequestMapping(method = RequestMethod.POST, value = "students")
    Student registerStudent(@RequestBody Student student);

    @RequestMapping(method = RequestMethod.POST, value= "companies/7/attachments")
    Attachment createAttachment(@RequestParam(name = "studentId") Long studentId);

    @RequestMapping(method = RequestMethod.PATCH, value= "companies/7/attachments")
    Attachment deleteAttachment(@RequestParam(name = "studentId") Long studentId, @RequestParam(name = "departmentId") Long departmentId , @RequestParam(name = "companyId") Long companyId  );

    @RequestMapping(method = RequestMethod.DELETE, value= "departments")
    Attachment patchAttachment(@RequestParam(name = "studentId") Long studentId, @RequestParam(name = "departmentId") Long departmentId );
}
