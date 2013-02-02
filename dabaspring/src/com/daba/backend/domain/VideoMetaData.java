package com.daba.backend.domain;

public class VideoMetaData {

	private String longitude;
	private String latitude;
	private String key;
	
	
	
	public VideoMetaData() {
		super();
	}
	
	public VideoMetaData(VideoMetaData input) {
		super();
		this.longitude = input.getLongitude();
		this.latitude = input.getLatitude();
		this.key = input.getKey();
	}
	public String getLongitude() {
		return longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public String getKey() {
		return key;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
	

}
