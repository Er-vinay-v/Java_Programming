package constructor;

public class Student {
    private String name;
    private int age;

    public Student(){
        this("donald",22);
        System.out.println("Default constructor is called");
        name="vinay";
        age=22;
    }
    public Student(String name){
        this();
        this.name=name;
        age=22;
    }
    public Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    void disply(){
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String[] args) {
        Student st=new Student();
        st.disply();
    }
}
