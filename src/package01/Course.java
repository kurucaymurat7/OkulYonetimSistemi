package package01;

import java.util.Scanner;

import static package01.main.courseList;
import static package01.main.teacherList;

public class Course {

    //----------Course Class Özellikleri :
    //
    //fields (variable) : name,code,prefix,note,Teacher
    //Methods : Course() , addTeacher() , printTeacher()

    String courseName;
    int courseCode;
    String coursePrefix;
    String courseNote;
    String courseTeacher;

    Scanner scan = new Scanner(System.in);

    public Course(String courseName, int courseCode, String coursePrefix, String courseNote, String courseTeacher) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.coursePrefix = coursePrefix;
        this.courseNote = courseNote;
        this.courseTeacher = courseTeacher;
    }

    public Course() {

    }

    public void courseEkle() {

        for (int i = 0; i < 3; i++) {

            Course course = new Course();
            System.out.println(i + 1 + " . course icin asagidaki bilgileri giriniz : ");

            System.out.println("Course Name : ");
            course.courseName = scan.next();

            System.out.println("Course code : ");
            course.courseCode = scan.nextInt();

            System.out.println("Course prefix : ");
            course.coursePrefix = scan.next();

            System.out.println("Course note : ");
            course.courseNote = scan.next();

            courseList.add(i, course);
        }
    }

    public void addorChangeTeacher() {

        System.out.println("Hangi derse ogretmen atamasi yapmak istiyorsunuz ? ");
        String degisecekders = scan.next();

        String yeniOgretmenİsimSoyisim = "";
        boolean degistimi = false;

        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).courseName.equalsIgnoreCase(degisecekders)) {
                System.out.println("Lutfen yeni ogretmen ismini giriniz : ");
                yeniOgretmenİsimSoyisim = scan.next();
                courseList.get(i).courseTeacher = yeniOgretmenİsimSoyisim;
                degistimi = true;
            }
        }

        if (degistimi == true) {
            System.out.println("İslem basaril ile tamamlandi.");
        } else {
            System.out.println("Girdiginiz ders ismi hatali ya da listede yok! ");
        }
    }

    public void printTeacher() {
        System.out.println("Hangi dersin ogretmenini listemek istiyorsunuz ? \n " +
                "Asagidaki listeden seciniz. ");
        for (int i = 0; i < courseList.size(); i++) {
            System.out.println(i+1 + ":" + courseList.get(i).courseName);
        }
        String secilenders = scan.next();
        boolean bulunndumu = false;
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).courseName.equalsIgnoreCase(secilenders)) {
                System.out.println("Sectiginiz dersin ogretmeni : " + courseList.get(i).courseTeacher);
                bulunndumu = true;
            }
        }
        if (bulunndumu == false) {
            System.out.println("Girdiginiz ders ismi hatali ya da listede yok! ");
        }
    }


}
