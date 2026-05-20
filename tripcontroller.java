public class tripcontroller {
    public static void main(String[] args) {
        trip trip1 = new trip("John Doe", "john.doe@example.com");
        System.out.println("Name: " + trip1.getName());
        System.out.println("Email: " + trip1.getEmail());
}
}