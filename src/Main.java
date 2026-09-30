import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        LegacyFirewall oldFirewall = new LegacyFirewall();
        FirewallAdapter firewall = new FirewallAdapter(oldFirewall);
        NetworkTrafficController net = new NetworkTrafficController();
        UserAccessManager uam = new UserAccessManager();
        EncryptionService es = new EncryptionService();

        firewall.setSecurityLevel(5);
        firewall.logEvent("User: Admin - changed secureity level.");
        //lockdown
        net.blockPort(8080);
        net.blockPort(443);
        List<String> users = new ArrayList<>();
        users.add("guest_user1");
        users.add("Sus_Account");
        users.add("ImaHacker");
        uam.lockUserAccounts(users);
        es.encryptDatabase("Customer_Records");
        net.divertTraffic();
        //allclear
        net.unblockPort(8080);
        net.unblockPort(443);
        uam.unlockUserAccounts(users);
        es.decryptDatabase("Customer_Records");
        es.verifyIntegrity();
    }
}
