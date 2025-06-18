import java.util.*;

public class uniqueEmails {
    public static void main(String[] args) {
        
        HashSet<String> emails = new HashSet<>();

        emails.add("user1@example.com");
        emails.add("user2@example.com");
        emails.add("user3@example.com");
        emails.add("user1@example.com");
        emails.add("user4@example.com");

        System.out.println("Unique Email IDs : ");

        for(String email : emails){
            System.out.println(email);
        }

    }
}
