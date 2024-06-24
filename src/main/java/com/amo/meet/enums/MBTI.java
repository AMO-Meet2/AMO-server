package com.amo.meet.enums;

import java.util.Arrays;

public enum MBTI {
	
	// I = 1, E = 2
	// N = 3, S = 4
	// T = 5, F = 6
	// P = 7, J = 8
	NONE(0, "none"),
	INTP(1357, "intp"),
	INTJ(1358, "intj"),
	INFP(1367, "infp"),
	INFJ(1368, "infj"),
	ISTP(1457, "istp"),
	ISTJ(1458, "istj"),
	ISFP(1467, "isfp"),
	ISFJ(1468, "isfj"),
	ENTP(2357, "entp"),
	ENTJ(2358, "entj"),
	ENFP(2367, "enfp"),
	ENFJ(2368, "enfj"),
	ESTP(2457, "estp"),
	ESTJ(2458, "estj"),
	ESFP(2467, "esfp"),
	ESFJ(2468, "esfj");
	
	private final Integer code;
	private final String desc;
	
	MBTI(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public Integer getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}
	
	public static MBTI ofCode(int code) {
		return Arrays.stream(MBTI.values())
				.filter(v -> v.getCode().equals(code))
				.findAny()
				.orElseThrow(() -> new IllegalArgumentException(String.format("Exception!", code)));
	}

}
