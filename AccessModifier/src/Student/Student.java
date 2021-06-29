package Student;

public class Student {
    private String name;
    private String classes;

    public Student(){

    }

    public  Student(String name,String classes){
        this.name=name;
        this.classes=classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
