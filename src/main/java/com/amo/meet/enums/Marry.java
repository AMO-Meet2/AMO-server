package com.amo.meet.enums;

import java.util.Arrays;

public enum Marry {
	
	SINGLE(100, "미혼"),
	COUPLE(0, "커플"),
	RE_SINGLE(-100, "이혼") // 아이 유무
	;
	
	private final Integer code;
	private final String desc;
	
	Marry(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public Integer getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}
	
	public static Marry ofCode(int code) {
		return Arrays.stream(Marry.values())
				.filter(v -> v.getCode().equals(code))
				.findAny()
				.orElseThrow(() -> new IllegalArgumentException(String.format("Exception!", code)));
	}

}
