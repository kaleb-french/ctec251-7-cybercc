import java.util.ArrayList;
import java.util.List;

public class CommandCenterFacade {
    //f
    private NetworkTrafficController net = new NetworkTrafficController();
    private UserAccessManager uam = new UserAccessManager();
    private EncryptionService es = new EncryptionService();
    List<String> users = new ArrayList<>();
	//c
	CommandCenterFacade(){
        users.add("guest_user1");
        users.add("Sus_Account");
        users.add("ImaHacker");
	}
	//m
	void initiateEmergencyLockdown(){
        net.blockPort(8080);
        net.blockPort(443);
        uam.lockUserAccounts(users);
        es.encryptDatabase("Customer_Records");
        net.divertTraffic();
	}
	void liftEmergencyLockdown(){
	    net.unblockPort(8080);
        net.unblockPort(443);
        uam.unlockUserAccounts(users);
        es.decryptDatabase("Customer_Records");
        net.stopDivertTraffic();
	}
	void enableMaintenanceMode(){
	    net.divertTraffic();
		uam.grantAdminAccess("BobNotaAdmin");
	}
}
