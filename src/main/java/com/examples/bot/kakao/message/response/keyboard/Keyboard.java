package com.examples.bot.kakao.message.response.keyboard;

import java.util.List;
import lombok.Getter;

public class Keyboard {

	@Getter
	private KeyboardType type;
	@Getter
	private List<String> buttons;
	
	public enum KeyboardType {
		buttons, text
	}

	/**
	 * Force user to give keyboard(String) Input
	 * 
	 */
	public Keyboard() {
		super();
		this.type = KeyboardType.text;
	}

	/**
	 * Force user to give button Input
	 * 
	 * @param buttons
	 */
	public Keyboard(List<String> buttons) {
		super();
		this.type = KeyboardType.buttons;
		this.buttons = buttons;
	}
}