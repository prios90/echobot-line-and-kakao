package com.examples.bot.kakao.message.response.message;

import lombok.Getter;
import lombok.ToString;
@ToString
public class Message {

	@Getter
	private String text;
	@Getter
	private Photo photo;
	@Getter
	private MessageButton message_button;

	public Message(String text) {
		super();
		this.text = text;
	}

	public Message(Photo photo) {
		super();
		this.photo = photo;
	}

	public Message(MessageButton messageButton) {
		super();
		this.message_button = messageButton;
	}

	public Message(String text, Photo photo) {
		super();
		this.text = text;
		this.photo = photo;
	}

	public Message(String text, MessageButton messageButton) {
		super();
		this.text = text;
		this.message_button = messageButton;
	}

	public Message(Photo photo, MessageButton messageButton) {
		super();
		this.photo = photo;
		this.message_button = messageButton;
	}

	public Message(String text, Photo photo, MessageButton messageButton) {
		super();
		this.text = text;
		this.photo = photo;
		this.message_button = messageButton;
	}
}