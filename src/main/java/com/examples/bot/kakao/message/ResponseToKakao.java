package com.examples.bot.kakao.message;

import com.examples.bot.kakao.message.response.keyboard.Keyboard;
import com.examples.bot.kakao.message.response.message.Message;
import lombok.Getter;
import lombok.ToString;
@ToString
public class ResponseToKakao {

	@Getter private Message message;
	@Getter private Keyboard keyboard;

	public ResponseToKakao(Message message) {
		super();
		this.message = message;
	}

	public ResponseToKakao(Message message, Keyboard keyboard) {
		super();
		this.message = message;
		this.keyboard = keyboard;
	}
}