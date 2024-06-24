package com.amo.meet.enums.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.amo.meet.enums.MBTI;

@Converter
public class MBTIConverter implements AttributeConverter<MBTI, Integer>{

	@Override
	public Integer convertToDatabaseColumn(MBTI attribute) {
		// TODO Auto-generated method stub
		return attribute.getCode();
	}

	@Override
	public MBTI convertToEntityAttribute(Integer dbData) {
		// TODO Auto-generated method stub
		return MBTI.ofCode(dbData);
	}
	
}
