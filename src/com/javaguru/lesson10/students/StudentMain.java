package com.javaguru.lesson10.students;

class StudentMain {

    public static void main(String[] args) {
        Student student = new Student("Vasya");
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper("Vasek");
        MiddleDeveloper middleDeveloper = new MiddleDeveloper("Vasilij");
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper("Vasilij K.");

        System.out.println(student);
        System.out.println(juniorDeveloper);
        System.out.println(middleDeveloper);
        System.out.println(seniorDeveloper);

        System.out.println();

        student.learnSomething();
        juniorDeveloper.learnSomething();
        middleDeveloper.learnSomething();
        seniorDeveloper.learnSomething();

        System.out.println();

        juniorDeveloper.writeCode();
        seniorDeveloper.writeCode();

        System.out.println();

        middleDeveloper.debuggingCode();
        seniorDeveloper.solveProblems();
    }
}
