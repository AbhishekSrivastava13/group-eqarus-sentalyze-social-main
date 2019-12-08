package com.eqarus.sentalyze.request;

import java.util.LinkedHashMap;
import java.util.List;

public class TwitterRequestBean {
	
	private List<String> twitterDataList;
	private LinkedHashMap<String, String> tweetLocationList;

	public List<String> getTwitterDataList() {
		return twitterDataList;
	}

	public void setTwitterDataList(List<String> twitterDataList) {
		this.twitterDataList = twitterDataList;
	}

	public LinkedHashMap<String, String> getTweetLocationList() {
		return tweetLocationList;
	}

	public void setTweetLocationList(LinkedHashMap<String, String> tweetLocationList) {
		this.tweetLocationList = tweetLocationList;
	}

}
