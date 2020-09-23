package asd.model.entity;

public class House {

	private String id;
	private String userId;
	private String DataAssetId;
	private int UnitNumber;
	private String StreetNumber;
	private String Description;
	private String Region;
	private String City;
	private String Address;
	private int Postcode;
	private int Price;
	private String Requirement;
	
	public House() {
		super();
	}

	public House(String id, String userId, String dataAssetId, int unitNumber,
			String streetNumber, String description, String region,
			String city, String address, int postcode, int price,
			String requirement) {
		super();
		this.id = id;
		this.userId = userId;
		DataAssetId = dataAssetId;
		UnitNumber = unitNumber;
		StreetNumber = streetNumber;
		Description = description;
		Region = region;
		City = city;
		Address = address;
		Postcode = postcode;
		Price = price;
		Requirement = requirement;
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

	public String getDataAssetId() {
		return DataAssetId;
	}

	public void setDataAssetId(String dataAssetId) {
		DataAssetId = dataAssetId;
	}

	public int getUnitNumber() {
		return UnitNumber;
	}

	public void setUnitNumber(int unitNumber) {
		UnitNumber = unitNumber;
	}

	public String getStreetNumber() {
		return StreetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		StreetNumber = streetNumber;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getRegion() {
		return Region;
	}

	public void setRegion(String region) {
		Region = region;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getPostcode() {
		return Postcode;
	}

	public void setPostcode(int postcode) {
		Postcode = postcode;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public String getRequirement() {
		return Requirement;
	}

	public void setRequirement(String requirement) {
		Requirement = requirement;
	}
}
