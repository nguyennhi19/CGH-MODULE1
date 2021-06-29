package Student;

public class Test {

    public static void main(String[] args) {
        Student test = new Student("Nhi","C04");
        Stu(test);
//        Test.setName("NHI");
        test.setName("nhi88");
        Stu(test);
    }

    public static void Stu(Student Test){
        System.out.println(Test.getName());
        System.out.println(Test.getClasses());
    }
}
