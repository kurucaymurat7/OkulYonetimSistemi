package package01;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

import static package01.main.*;

public class Student {

    String ogrenciName;
    int ogrenciNo;
    String course1;
    String course2;
    String course3;
    int course1Sinavnote;
    int course1Sozlunote;
    int course2Sinavnote;
    int course2Sozlunote;
    int course3Sinavnote;
    int course3Sozlunote;
    double average;
    boolean isPAss;
    Scanner scan = new Scanner(System.in);

    public Student(int ogrenciNo, String ogrenciName, String course1, int course1Sinavnote, int course1Sozlunote,
                   String course2, int course2Sinavnote, int course2Sozlunote,
                   String course3, int course3Sinavnote, int course3Sozlunote) {

        this.ogrenciNo = ogrenciNo;
        this.course1 = course1;
        this.course1Sinavnote = ogrenciNo;
        this.course1Sozlunote = course1Sozlunote;
        this.course2 = course2;
        this.course2Sinavnote = course2Sinavnote;
        this.course2Sozlunote = course2Sozlunote;
        this.course3 = course3;
        this.course3Sinavnote = course3Sinavnote;
        this.course3Sozlunote = course3Sozlunote;
    }

    public Student() {

    }

    public void studentEkle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kac adet ogrenci gireceksiniz : ");
        int ogrenciAdedi = scan.nextInt();
        for (int i = 0; i < ogrenciAdedi; i++) {

            Student student = new Student();
            System.out.println(i+1 + " . ogrenci icin asagidaki bilgileri giriniz : ");

            System.out.println("OgrenciNo");
            student.ogrenciNo = scan.nextInt();

            System.out.println("İsim Soyisim : ");
            student.ogrenciName = scan.next();

            System.out.println("Course 1 : " + courseList.get(0).courseName);
            student.course1 = courseList.get(0).courseName;
            System.out.println("Sinav notu : "); student.course1Sinavnote = scan.nextInt();
            System.out.println("Sozlu notu : "); student.course1Sozlunote = scan.nextInt();

            System.out.println("Course 2 : " + courseList.get(1).courseName);
            student.course2 = courseList.get(1).courseName;
            System.out.println("Sinav notu : "); student.course2Sinavnote = scan.nextInt();
            System.out.println("Sozlu notu : "); student.course2Sozlunote = scan.nextInt();

            System.out.println("Course 3 : " + courseList.get(2).courseName);
            student.course3 = courseList.get(2).courseName;
            System.out.println("Sinav notu : "); student.course3Sinavnote = scan.nextInt();
            System.out.println("Sozlu notu : "); student.course3Sozlunote = scan.nextInt();

            studentList.add(i, student);
        }

    }

    public void printNote() {

        System.out.println("Hangi ogrenci icin notları listelemek istiyorsunuz \n" +
                "Asagidaki listeden seciniz...");

        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(i+1 + ".ogrenci :" + studentList.get(i).ogrenciName);
        }

        String secilenOgrenci = scan.next();

        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).ogrenciName.equalsIgnoreCase(secilenOgrenci)) {
                System.out.println(studentList.get(i).course1 + " : " + studentList.get(i).course1Sinavnote +" , "+
                        studentList.get(i).course1Sozlunote);
                System.out.println(studentList.get(i).course2 + " : " + studentList.get(i).course2Sinavnote +" , "+
                        studentList.get(i).course2Sozlunote);
                System.out.println(studentList.get(i).course3 + " : " + studentList.get(i).course3Sinavnote +" , "+
                        studentList.get(i).course3Sozlunote);
            }
        }
    }

    public void calcAvarage() {

        System.out.println("Hangi ogrenci icin not ortalamasi hesaplatmak istiyorsunuz ? \n" +
                "Asagidaki listeden seciniz...");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(i+1 + ".ogrenci :" + studentList.get(i).ogrenciName);
        }
        String secilenOgrenci = scan.next();

        System.out.println("Secilen ogrencinin hangi ders icin ortalamasini hesaplatmak istiyorsunuz ? \n" +
                "Asagidaki listeden seciniz...");
        for (int i = 0; i < courseList.size(); i++) {
            System.out.println(i+1 + ".ders : "+ courseList.get(i).courseName);
        }
        String secilenDers = scan.next();

        double ortalama = 0;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).course1.equalsIgnoreCase(secilenDers) && studentList.get(i).ogrenciName.equalsIgnoreCase(secilenOgrenci)) {
                ortalama = studentList.get(i).course1Sinavnote*0.80 + studentList.get(i).course1Sinavnote*0.20;
            } else
            if (studentList.get(i).course2.equalsIgnoreCase(secilenDers)) {
                ortalama = studentList.get(i).course2Sinavnote*0.80 + studentList.get(i).course2Sinavnote*0.20;
            } else
            if (studentList.get(i).course3.equalsIgnoreCase(secilenDers)) {
                ortalama = studentList.get(i).course3Sinavnote*0.80 + studentList.get(i).course3Sinavnote*0.20;
            }
        }
        System.out.println(secilenOgrenci + " " + secilenDers + " " + " not ortalamasi " + ortalama);
        isPass(ortalama);
    }

    public void isPass(double ortalama) {
        if (ortalama >= 70) {
            System.out.println("GECTİ. BASARİLİ.");
        } else {
            System.out.println("KALDİ. BASARİSİZ.");
        }
    }
}
