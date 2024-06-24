package com.amo.meet.enums.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.amo.meet.enums.Gender;

@Converter
public class GenderConverter implements AttributeConverter<Gender, Integer>{

	@Override
	public Integer convertToDatabaseColumn(Gender attribute) {
		// TODO Auto-generated method stub
		return attribute.getCode();
	}

	@Override
	public Gender convertToEntityAttribute(Integer dbData) {
		// TODO Auto-generated method stub
		return Gender.ofCode(dbData);
	}
	
}
