package asd.model.entity;

public class Order {

	private String id;
	private String userId;
	private String paymentId;
	private String houseId;
	private String CheckInTime;
	private String Status;
	
	public Order() {
		super();
	}

	public Order(String id, String userId, String paymentId, String houseId,
			String checkInTime, String status) {
		super();
		this.id = id;
		this.userId = userId;
		this.paymentId = paymentId;
		this.houseId = houseId;
		CheckInTime = checkInTime;
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

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getHouseId() {
		return houseId;
	}

	public void setHouseId(String houseId) {
		this.houseId = houseId;
	}

	public String getCheckInTime() {
		return CheckInTime;
	}

	public void setCheckInTime(String checkInTime) {
		CheckInTime = checkInTime;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
}
