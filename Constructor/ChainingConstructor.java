package Constructor;

public class ChainingConstructor {
    public static class Student{
        private int StudentId;
        private String studentName;
        private char grade;
        Student(){
            this(311033,"Sandeep",'A');
        }
        Student(int id,String name,char g){
            this.StudentId=id;
            this.studentName=name;
            this.grade=g;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.StudentId+"\n"+s1.studentName+"\n"+s1.grade+"\n");
        Student s2 = new Student(311033,"Shivani",'A');
        System.out.println(s2.StudentId+"\n"+s2.studentName+"\n"+s2.grade+"\n");
    }
}
