public class Main {
    static void main() {
        LegacyFirewall oldFirewall = new LegacyFirewall();
        FirewallAdapter firewall = new FirewallAdapter(oldFirewall);

        firewall.setSecurityLevel(5);
        firewall.logEvent("User: Admin - changed secureity level.");
    }
}
