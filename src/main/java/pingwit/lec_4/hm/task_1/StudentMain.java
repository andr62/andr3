package pingwit.lec_4.hm.task_1;

public class StudentMain extends Student {
    private static Student Egorka;

    public static void main(String[] args) {
        Student Billiard = new Student(18, "Patrick");
        Student StarTrack = new Student(21, "Lesli");
        Billiard.show();
        StarTrack.show();
//        Egorka.show();

        Student Jackson = new Student(22, "Harry");

    }
}


