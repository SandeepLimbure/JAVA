package Constructor;

public class Example9 {
    public static class Classroom{
        private String className;
        private String[] Students;
        Classroom(String cls,String[] students){
            this.className=cls;
            this.Students=students;
        }
        public void printClassroom(){
            System.out.println("Class Name: " + className);
            System.out.print("Students: ");
            for (String student : Students) {
                System.out.print(student + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String [] studentArray = {"Sandeep","Shivani"};
        Classroom cls = new Classroom("Bestie",studentArray);
        cls.printClassroom();
    }
}
