package StaticMembers;

public class IDGenerator {
    private static int nextID = 1;
    public static int generateID(){
        return nextID++;
    }

    public static void main(String[] args) {
        System.out.println("Generated ID: " + IDGenerator.generateID());
        System.out.println("Generated ID: " + IDGenerator.generateID());
        System.out.println("Generated ID: " + IDGenerator.generateID());
    }
}
