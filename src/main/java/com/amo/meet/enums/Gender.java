package com.amo.meet.enums;

import java.util.Arrays;

public enum Gender {
	
	NONE(0, "default"),
	MAN(1, "man"),
	WOMAN(2, "woman"),
	TRANS_MAN(-1, "trans_man"),
	TRANS_WOMAN(-2, "trans_woman");
	
	private final Integer code;
	private final String desc;
	
	Gender(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public Integer getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}
	

//	public static Optional<Gender> ofCode(String code) {
//		return Arrays.stream(Gender.values())
//				.filter(v -> v.getCode().equals(code))
//				.findAny();
		
	public static Gender ofCode(int code) {
		return Arrays.stream(Gender.values())
				.filter(v -> v.getCode().equals(code))
				.findAny()
				.orElseThrow(() -> new IllegalArgumentException(String.format("Exception!", code)));
	}

}
