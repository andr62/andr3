package pingwit.lec_4.hm.task_1;

public class Student {
    private static Integer age;
    private static String name;

    public Student(Integer age, String name) {
        Student.age = age;
        Student.name = name;

    }

    public Integer setAge() {
        return age;
    }

    public String setName() {
        return name;
    }


    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Student() {
        this(19, "Egorka");
    }

    public void show() {

        System.out.println("Student's profile age: " + Student.age);
        System.out.println("Students's profile name: " + Student.name);
    }
}
