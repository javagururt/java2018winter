package com.javaguru.lesson10.casts;

import com.javaguru.lesson10.students.JuniorDeveloper;
import com.javaguru.lesson10.students.MiddleDeveloper;
import com.javaguru.lesson10.students.SeniorDeveloper;
import com.javaguru.lesson10.students.Student;

import java.util.ArrayList;
import java.util.List;

class StudentCastMain {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student student = new Student("Vasya");
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper("Vasek");
        MiddleDeveloper middleDeveloper = new MiddleDeveloper("Vasilij");
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper("Vasilij K.");

        students.add(student);
        students.add(juniorDeveloper);
        students.add(middleDeveloper);
        students.add(seniorDeveloper);

//        for(Student st : students) {
//            st.learnSomething();
//            System.out.println(st);
//        }

        students.forEach(st -> {
            st.learnSomething();
//            System.out.println(st);
        });

        System.out.println();

        List<JuniorDeveloper> juniorDevelopers = new ArrayList<>();

        juniorDevelopers.add(juniorDeveloper);
        juniorDevelopers.add(middleDeveloper);
        juniorDevelopers.add(seniorDeveloper);

        juniorDevelopers.forEach(jd -> jd.writeCode());


        List<SeniorDeveloper> seniorDevelopers = new ArrayList<>();
        seniorDevelopers.add(seniorDeveloper);

        seniorDevelopers.forEach(System.out::println);
//        seniorDevelopers.forEach(sd -> System.out.println(sd));

        Student student1 = new JuniorDeveloper("Vasjka");
        System.out.println(student1);

    }
}
