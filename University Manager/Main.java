public class Student {

    String name;
    int age;
    double gpa;


    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }


    boolean isPassed() {
        return gpa >= 2;
    }


    String getInfo() {
        return "Name: " + name + ", Age: " + age + ", GPA: " + gpa;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", GPA: " + gpa;
    }

}
