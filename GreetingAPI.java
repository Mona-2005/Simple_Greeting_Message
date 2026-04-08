public class GreetingAPI {
    public static String getGreeting(String name) {
        return "Hello, " + name + "! Welcome!";
    }

    public static void main(String[] args) {
        System.out.println(getGreeting("Praveen"));
    }
}
