package com.amo.meet.enums.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.amo.meet.enums.Marry;

@Converter
public class MarryConverter implements AttributeConverter<Marry, Integer>{

	@Override
	public Integer convertToDatabaseColumn(Marry attribute) {
		// TODO Auto-generated method stub
		return attribute.getCode();
	}

	@Override
	public Marry convertToEntityAttribute(Integer dbData) {
		// TODO Auto-generated method stub
		return Marry.ofCode(dbData);
	}
	
}
