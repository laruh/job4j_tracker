package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Sharonina Alina Sergeevna");
        student.setGroup(18603);
        student.setAdmissionDate(new Date());

        System.out.println(student.getFio()
                + " has entered the group "
                + student.getGroup()
                + " on "
                + student.getAdmissionDate());
    }
}
