public interface SecurityLog {

	void logEvent(String message);

	void setSecurityLevel(int level);
}
