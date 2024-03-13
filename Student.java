public class Student {
    int id;
    String name;

    public void details(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.details(10,"Susita");
        System.out.println("Student 1 | ID: "+s1.id+", Name: "+s1.name);
    }
}

