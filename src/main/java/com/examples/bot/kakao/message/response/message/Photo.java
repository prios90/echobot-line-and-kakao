package com.examples.bot.kakao.message.response.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@AllArgsConstructor
public @Data class Photo {
	@NonNull private final String url;
	private int width;
	private int height;
	
	public Photo(String url) {
		super();
		this.url = url;
		width = 720;
		height = 630;
	}
}
