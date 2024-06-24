package com.amo.meet.enums;

import java.util.Arrays;

public enum Check {
	
	NONE(0, "none"),
	YES(1, "yes"),
	NO(-1, "no");
	
	private final Integer code;
	private final String desc;
	
	Check(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public Integer getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	public static Check ofCode(int code) {
		return Arrays.stream(Check.values())
				.filter(v -> v.getCode().equals(code))
				.findAny()
				.orElseThrow(() -> new IllegalArgumentException(String.format("Exception!", code)));
	}
	
}
