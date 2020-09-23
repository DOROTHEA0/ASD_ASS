package asd.model.entity;

public class Payment {

	private String id;
	private String userId;
	private String FullName;
	private String CardNumber;
	private String ExpiryDate;
	private int CVV;
	
	public Payment() {
		super();
	}

	public Payment(String id, String userId, String fullName,
			String cardNumber, String expiryDate, int cVV) {
		super();
		this.id = id;
		this.userId = userId;
		FullName = fullName;
		CardNumber = cardNumber;
		ExpiryDate = expiryDate;
		CVV = cVV;
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

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public String getCardNumber() {
		return CardNumber;
	}

	public void setCardNumber(String cardNumber) {
		CardNumber = cardNumber;
	}

	public String getExpiryDate() {
		return ExpiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		ExpiryDate = expiryDate;
	}

	public int getCVV() {
		return CVV;
	}

	public void setCVV(int cVV) {
		CVV = cVV;
	}
}
