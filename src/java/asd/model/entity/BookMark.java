package asd.model.entity;

public class BookMark {

	private String id;
	private String userId;
	private String houseId;
	
	public BookMark() {
		super();
	}

	public BookMark(String id, String userId, String houseId) {
		super();
		this.id = id;
		this.userId = userId;
		this.houseId = houseId;
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

	public String getHouseId() {
		return houseId;
	}

	public void setHouseId(String houseId) {
		this.houseId = houseId;
	}
}
