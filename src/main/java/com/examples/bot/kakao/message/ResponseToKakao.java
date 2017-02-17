package com.examples.bot.kakao.message;

import com.examples.bot.kakao.message.response.keyboard.Keyboard;
import com.examples.bot.kakao.message.response.message.Message;

public class ResponseToKakao {

	private Message message;
	private Keyboard keyboard;

	public ResponseToKakao(Message message) {
		super();
		this.message = message;
	}

	public ResponseToKakao(Message message, Keyboard keyboard) {
		super();
		this.message = message;
		this.keyboard = keyboard;
	}

	public Message getMessage() {
		return message;
	}

	public Keyboard getKeyboard() {
		return keyboard;
	}
}
