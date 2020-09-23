package asd.model.entity;

public class Report {

	private String id;
	private String userId;
	private String Title;
	private String Content;
	private String Time;
	private String Status;
	
	public Report() {
		super();
	}

	public Report(String id, String userId, String title, String content,
			String time, String status) {
		super();
		this.id = id;
		this.userId = userId;
		Title = title;
		Content = content;
		Time = time;
		Status = status;
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

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
}
