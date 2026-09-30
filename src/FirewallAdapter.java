public class FirewallAdapter implements SecurityLog{
    //f
    private LegacyFirewall firewall;
    //c
    FirewallAdapter(LegacyFirewall firewall){
        this.firewall = firewall;
    }
    //m
	@Override
	public void logEvent(String message) {
	    firewall.recordActivity(message);
	}
	@Override
	public void setSecurityLevel(int level) {
	    firewall.setAlertLevel(level);
	}

}
