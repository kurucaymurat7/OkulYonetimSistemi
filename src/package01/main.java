package package01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static package01.Student.*;

public class main {

    static List<Student> studentList = new ArrayList<>();
    static List<Teacher> teacherList = new ArrayList<>();
    static List<Course> courseList = new ArrayList<>();

    public static void main(String[] args) {
        //----------Öğrenci Not Sistemi-----------
        //
        //----------Course Class Özellikleri :
        //
        //fields (variable) : name,code,prefix,note,Teacher
        //Methods : Course() , addTeacher() , printTeacher()
        //
        //----------Teacher Class Özellikleri :
        //
        //fields : name,mpno,branch
        //Methods : Teacher()
        //
        //----------Student Class Özellikleri :
        //
        //fields : name,stuNo,classes,course1,course2,course3,avarage,isPass
        //Methods : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
        //
        //
        //-----------TASK
        //Course class'ında derse ait sözlü notu kısmını girin ve ortalamaya etkisini
        //her ders için ayrı ayrı belirtin. Sözlü notların ıda ortalamaya etkileme
        //yüzdesi ile dahil edin.
        //
        //Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise
        //sınav notunun etkisi %80'dir.
        //
        //Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin
        //genel ortalamaya etkisi şu şekilde hesaplanır :
        //
        //Fizik Ortalaması : (90 * 0.20) + (60* 0.80);

        Scanner scan = new Scanner(System.in);

        System.out.println("3 adet Course icin asagidaki bilgileri giriniz ...");
        Course course = new Course();
        course.courseEkle();

        System.out.println("Girmis oldugunuz kurslar icin ogretmen bilgi formunu doldurunuz...");
        Teacher teacher = new Teacher();
        teacher.TeacherEkle();

        System.out.println("Bu adımda ogrenci bilgilerini ve ders notlarını giriniz...");
        Student student = new Student();
        student.studentEkle();


        while (true) {
            System.out.println("Asagidaki menuden bir secim yapabilirsinz...");
            System.out.println("Bir dersin ogretmenini gormek icin        (1)...");
            System.out.println("Bir dersin ogretmenini degistirmek icin   (2)...");
            System.out.println("Bir ogrencinin notlarini gormek icin      (3)...");
            System.out.println("Bir ogrencinin bir ders performansi icin   (4)..." );
            System.out.println("Programı bitirmek icin 0'a basiniz...");

            int secim = scan.nextInt();
            if (secim == 0) break;

            switch (secim){
                case 1: course.printTeacher(); break;
                case 2: course.addorChangeTeacher(); break;
                case 3: student.printNote(); break;
                case 4: student.calcAvarage(); break;
                default: break;

            }
        }
    }
}
