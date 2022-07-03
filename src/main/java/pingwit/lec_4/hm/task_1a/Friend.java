package pingwit.lec_4.hm.task_1a;

public class Friend {

    String name;
    private Integer age;

    public Friend() {
    }

    public Friend(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }



}
