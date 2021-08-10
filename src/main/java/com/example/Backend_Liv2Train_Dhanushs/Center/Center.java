package com.example.Backend_Liv2Train_Dhanushs.Center;

import java.util.List;

public class Center {

    private Long id ;
    private String CenterName;
    private String CenterCode ;
    private Object Address ;
    private Integer Student_Capacity;
    private List<String> Courses_Offered;
    private String ContactEmail;
    private String ContactPhone ;

    public Center() {
    }

    public Center(Long id,
                  String centerName,
                  String centerCode,
                  Object address,
                  Integer student_Capacity,
                  List<String> courses_Offered,
                  String contactEmail,
                  String contactPhone) {
        this.id = id;
        CenterName = centerName;
        CenterCode = centerCode;
        Address = address;
        Student_Capacity = student_Capacity;
        Courses_Offered = courses_Offered;
        ContactEmail = contactEmail;
        ContactPhone = contactPhone;
    }

    public Center(String centerName,
                  String centerCode,
                  Object address,
                  Integer student_Capacity,
                  List<String> courses_Offered,
                  String contactEmail, String contactPhone) {
        CenterName = centerName;
        CenterCode = centerCode;
        Address = address;
        Student_Capacity = student_Capacity;
        Courses_Offered = courses_Offered;
        ContactEmail = contactEmail;
        ContactPhone = contactPhone;
    }

    @Override
    public String toString() {
        return "Center{" +
                "id=" + id +
                ", CenterName='" + CenterName + '\'' +
                ", CenterCode='" + CenterCode + '\'' +
                ", Address=" + Address +
                ", Student_Capacity=" + Student_Capacity +
                ", Courses_Offered=" + Courses_Offered +
                ", ContactEmail='" + ContactEmail + '\'' +
                ", ContactPhone='" + ContactPhone + '\'' +
                '}';
    }
}
