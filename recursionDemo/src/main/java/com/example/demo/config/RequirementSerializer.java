package com.example.demo.config;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.Procedeure;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class RequirementSerializer extends StdSerializer<List<Procedeure>> {

	public RequirementSerializer() {
		this(null);
	}

	public RequirementSerializer(Class<List<Procedeure>> p) {
		super(p);
	}

	@Override
	public void serialize(List<Procedeure> value, JsonGenerator gen, SerializerProvider provider) throws IOException {
		List<Procedeure> procedures = new ArrayList<>();
		for (Procedeure pro : value) {
			pro.setRequirement(null);
			procedures.add(pro);
		}
		gen.writeObject(procedures);
	}

}
