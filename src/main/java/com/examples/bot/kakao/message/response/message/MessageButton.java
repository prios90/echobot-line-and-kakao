package com.examples.bot.kakao.message.response.message;

import lombok.Data;
import lombok.NonNull;

public @Data class MessageButton {
	@NonNull private final String label;
	@NonNull private final String url;
}
