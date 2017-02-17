package com.examples.bot.kakao.message.response.message;


public class MessageButton {

	private String label;
	private String url;

	/**
	 * Give User a link to url in Message area, not Keyboard area
	 * @param label
	 * @param url
	 */
	public MessageButton(String label, String url) {
		super();
		this.label = label;
		this.url = url;
	}
}
