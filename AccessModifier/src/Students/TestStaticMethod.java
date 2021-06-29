package Students;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student s1= new Student(11, "Nhi");
        Student s2=new Student(12,"Nguyên");
        Student s3= new Student(13,"My");

        s1.display();
        s2.display();
        s3.display();
    }
}
