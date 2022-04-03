package package01;

import java.util.Scanner;

import static package01.main.*;

public class Teacher {

    String teacherName;
    int teacherNo;
    String teacherBranch;

    public Teacher() {
    }

    public Teacher(int teacherNo, String teacherName, String teacherBranch) {
        this.teacherNo = teacherNo;
        this.teacherName = teacherName;
        this.teacherBranch = teacherBranch;
    }

    public void TeacherEkle() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < courseList.size(); i++) {

            Teacher teacher = new Teacher();
            System.out.println(courseList.get(i).courseName + " dersi ogretmeni icin asagidaki bilgileri giriniz : ");

            System.out.println("Teacher No : ");
            teacher.teacherNo = scan.nextInt();

            System.out.println("İsim Soyisim : ");
            teacher.teacherName = scan.next();
            courseList.get(i).courseTeacher =teacher.teacherName;

            teacherList.add(i, teacher);
        }
    }
}
