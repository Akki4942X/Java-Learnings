public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student("Akash Patil");
        System.out.println(s1.name);
    }

}

class Student {
    String name;
    int age;
    float marks;

    Student(String name) {
        this.name = name;
    }
}
