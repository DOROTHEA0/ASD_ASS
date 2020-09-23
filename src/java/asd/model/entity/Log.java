package asd.model.entity;

public class Log {

	private String id;
	private String userId;
	private String Time;
	private String Activity;
	
	public Log() {
		super();
	}

	public Log(String id, String userId, String time, String activity) {
		super();
		this.id = id;
		this.userId = userId;
		Time = time;
		Activity = activity;
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

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}

	public String getActivity() {
		return Activity;
	}

	public void setActivity(String activity) {
		Activity = activity;
	}
}
