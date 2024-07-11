package homework;

public class Main{
    @SuppressWarnings("static-access")
    public static void main(String[] args, User User){
        User user = new User("Bob");
        Persister.report();
        System.out.println("Report for user: " + User.getName(user));
        Persister.save();
        System.out.println("Save user: " + User.getName(user));
    }

}