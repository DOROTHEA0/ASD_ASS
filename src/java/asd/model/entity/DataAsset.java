package asd.model.entity;

public class DataAsset {

	private String id;
	private String url;
	private String FileType;
	
	public DataAsset() {
		super();
	}

	public DataAsset(String id, String url, String fileType) {
		super();
		this.id = id;
		this.url = url;
		FileType = fileType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getFileType() {
		return FileType;
	}

	public void setFileType(String fileType) {
		FileType = fileType;
	}
}
