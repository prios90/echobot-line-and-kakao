package com.examples.bot.kakao.message.response.message;

public class Message {

	private String text;
	private Photo photo;
	private MessageButton message_button;

	public Message(String text) {
		super();
		this.text = text;
	}

	public Message(Photo photo) {
		super();
		this.photo = photo;
	}

	public Message(MessageButton message_button) {
		super();
		this.message_button = message_button;
	}

	public Message(String text, Photo photo) {
		super();
		this.text = text;
		this.photo = photo;
	}

	public Message(String text, MessageButton message_button) {
		super();
		this.text = text;
		this.message_button = message_button;
	}

	public Message(Photo photo, MessageButton message_button) {
		super();
		this.photo = photo;
		this.message_button = message_button;
	}
	
	public Message(String text, Photo photo, MessageButton message_button) {
		super();
		this.text = text;
		this.photo = photo;
		this.message_button = message_button;
	}

	public String getText() {
		return text;
	}

	public Photo getPhoto() {
		return photo;
	}

	public MessageButton getMessage_button() {
		return message_button;
	}
}
