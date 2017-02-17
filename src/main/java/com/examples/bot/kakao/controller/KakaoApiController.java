package com.examples.bot.kakao.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.examples.bot.kakao.message.RequestFromKakao;
import com.examples.bot.kakao.message.ResponseToKakao;
import com.examples.bot.kakao.message.response.keyboard.Keyboard;
import com.examples.bot.kakao.message.response.message.Message;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping(value = "/kakao/emptyroom")
@Slf4j
public class KakaoApiController {

	private List<String> basicList = Arrays.asList("basic keyboard", "hello", "no buttons please");

	@RequestMapping(value = "/keyboard", method = RequestMethod.GET)
	@ResponseBody
	public Keyboard keyboardController() {
		return new Keyboard(basicList);
	}

	@RequestMapping(value = "/message", method = RequestMethod.POST)
	@ResponseBody
	public ResponseToKakao messageController(@RequestBody RequestFromKakao request) {
		String fromMsg = request.getContent();

		Message message = new Message("received! > " + fromMsg);

		ResponseToKakao responseToKakao;
		if("no buttons please".equals(fromMsg)){
			responseToKakao = new ResponseToKakao(message);
		} else {
			responseToKakao= new ResponseToKakao(message, new Keyboard(basicList));
		}
		return responseToKakao;
	}
}
