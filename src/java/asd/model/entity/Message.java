package asd.model.entity;

public class Message {

	private String id;
	private String sessionId;
	private String Content;
	
	public Message() {
		super();
	}

	public Message(String id, String sessionId, String content) {
		super();
		this.id = id;
		this.sessionId = sessionId;
		Content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}
}
