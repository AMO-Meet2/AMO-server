package com.amo.meet.enums.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.amo.meet.enums.Status;

@Converter
public class StatusConverter implements AttributeConverter<Status, Integer>{

	@Override
	public Integer convertToDatabaseColumn(Status attribute) {
		// TODO Auto-generated method stub
		return attribute.getCode();
	}

	@Override
	public Status convertToEntityAttribute(Integer dbData) {
		// TODO Auto-generated method stub
		return Status.ofCode(dbData);
	}
	
}
