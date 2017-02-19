package com.examples.bot.kakao.message;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@NoArgsConstructor
public @Data class RequestFromKakao {
	@NonNull private String user_key;
	@NonNull private String type;
	@NonNull private String content;
}
