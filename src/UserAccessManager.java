import java.util.List;

public class UserAccessManager {
    //f
    //c
    //m
    void lockUserAccounts(List<String> usernames){
        System.out.println("The following accounts are locked:");
        for(String name: usernames){
            System.out.println(name);
        }
    }
    void unlockUserAccounts(List<String> usernames){
        System.out.println("The following accounts are unlocked:");
        for(String name: usernames){
            System.out.println(name);
        }
    }
    void grantAdminAccess(String user){
        System.out.println("User: " + user + " - has been granted adim access.");
    }
}
