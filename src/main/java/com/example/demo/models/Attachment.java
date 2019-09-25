package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Attachment {
    Long studentId;
    Long id;



    public Attachment(Long studentId) {
        this.studentId = studentId;

    }
    public Attachment(){

    }
    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "studentId=" + studentId +
                ", id=" + id +
                '}';
    }
}
