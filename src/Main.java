import java.util.Scanner;

public class Main {
    static void main() {
        LegacyFirewall oldFirewall = new LegacyFirewall();
        FirewallAdapter firewall = new FirewallAdapter(oldFirewall);
        CommandCenterFacade command = new CommandCenterFacade();
        Scanner scan = new Scanner(System.in);

        boolean running = true;
        while(running){
            System.out.println("Please enter a message: ");
            String input = scan.nextLine();
            firewall.logEvent(input);
            System.out.println("Please set a security level: ");
            int level = scan.nextInt();
            firewall.setSecurityLevel(level);

            System.out.println("PLease make a choice: \n 1. System Lock Down \n 2. Lift System Lock Down \n 3. enter maintaince mode \n 4. exit");
            scan.nextLine();
            String choice = scan.nextLine();
            switch(choice) {
                case "1":
                    command.initiateEmergencyLockdown();
                    break;
                case "2":
                    command.liftEmergencyLockdown();
                    break;
                case "3":
                    command.enableMaintenanceMode();
                    break;
                case "4":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }
        }
    }
}
