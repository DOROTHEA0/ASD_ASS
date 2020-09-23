package asd.model.entity;

public class Session {

	private String id;
	private String userId;
	private String SessionName;
	
	public Session() {
		super();
	}

	public Session(String id, String userId, String sessionName) {
		super();
		this.id = id;
		this.userId = userId;
		SessionName = sessionName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSessionName() {
		return SessionName;
	}

	public void setSessionName(String sessionName) {
		SessionName = sessionName;
	}
}
