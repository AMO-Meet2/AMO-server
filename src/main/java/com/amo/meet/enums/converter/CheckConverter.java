package com.amo.meet.enums.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.amo.meet.enums.Check;

@Converter
public class CheckConverter implements AttributeConverter<Check, Integer>{

	@Override
	public Integer convertToDatabaseColumn(Check attribute) {
		// TODO Auto-generated method stub
		return attribute.getCode();
	}

	@Override
	public Check convertToEntityAttribute(Integer dbData) {
		// TODO Auto-generated method stub
		return Check.ofCode(dbData);
	}
	
}
