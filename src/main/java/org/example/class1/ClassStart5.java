package org.example.class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student();   // 참조 변수 student1 : x001
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();   // 참조 변수 student2 : x002
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;


        Student[] students = new Student[]{student1, student2};     // 직접 정의한 Student 타입도 일반적인 변수와 동일하게 배열을 생성할 때 포함할 수 있음.
        // Student[] students = {student1, student2}; 위 코드와 같음 (생성과 선언을 동시에 해서 최적화)

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름 : " + students[i].name + ", 나이 : " + students[i].age + ", 성적 : " +  students[i].grade);
        }
        System.out.println("----변수 간소화----");
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];    // 배열에 저장된 참조값을 간단한 변수에 저장.
            System.out.println("이름 : " + s.name + ", 나이 : " + s.age + ", 성적 : " + s.grade);
        }
        System.out.println("----향상된 for문----");
        for (Student s : students) {
            System.out.println("이름 : " + s.name + ", 나이 : " + s.age + ", 성적 : " + s.grade);
        }
    }
}
