package StaticMembers;

public class Configuration {
    public static String configValue;
    static {
        configValue = "Default Config Value";
        System.out.println("Static block executed: configValue initialized");
    }

    public static void main(String[] args) {
        System.out.println("Config Value: " + configValue);
    }
}
