//practical 6

public class Student {
    public int ernum;
    public String name;

    public Student(String name, int ernum) {
        this.name = name;
        this.ernum = ernum;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Vasvi", 1);
        Student s2 = new Student("Vrushti", 2);
        Student s3 = new Student("Rosè", 3);

        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);
    }
}