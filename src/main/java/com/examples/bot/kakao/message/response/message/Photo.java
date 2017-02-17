package com.examples.bot.kakao.message.response.message;


public class Photo {

	private String url;
	private int width;
	private int height;

	public Photo(String url) {
		super();
		this.url = url;
		this.width = 720;
		this.height = 630;
	}

	public Photo(String url, int width, int height) {
		super();
		this.url = url;
		this.width = width;
		this.height = height;
	}

}
