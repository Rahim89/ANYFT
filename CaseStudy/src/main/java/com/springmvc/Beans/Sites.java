package com.springmvc.Beans;

public class Sites {
	
	private int siteId;
	private String siteName;
	private String mainPicture;
	
	private int timeneed;
	public int getSiteId() {
		return siteId;
	}
	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public String getMainPicture() {
		return mainPicture;
	}
	public void setMainPicture(String mainPicture) {
		this.mainPicture = mainPicture;
	}
	
	public int getTimeneed() {
		return timeneed;
	}
	public void setTimeneed(int timeneed) {
		this.timeneed = timeneed;
	}
	
	
}
