package com.examples.bot.kakao.message.response.keyboard;

import java.util.List;

public class Keyboard {

	private KeyboardType type;
	private List<String> buttons;

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

	public KeyboardType getType() {
		return type;
	}

	public List<String> getButtons() {
		return buttons;
	}
}
