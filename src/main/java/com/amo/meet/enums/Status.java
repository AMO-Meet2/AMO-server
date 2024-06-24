package com.amo.meet.enums;

import java.util.Arrays;

public enum Status {
	
	SUCCESS(2000, "success"),
	ERROR(1000, "error");
	
	private final Integer code;
	private final String desc;
	
	Status(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public Integer getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	public static Status ofCode(int code) {
		return Arrays.stream(Status.values())
				.filter(v -> v.getCode().equals(code))
				.findAny()
				.orElseThrow(() -> new IllegalArgumentException(String.format("Exception!", code)));
	}

}
