package com.example.demo.config;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.Requirement;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class ProcedureSerializer extends StdSerializer<List<Requirement>> {

	public ProcedureSerializer() {
		this(null);
	}

	public ProcedureSerializer(Class<List<Requirement>> t) {
		super(t);
	}

	@Override
	public void serialize(List<Requirement> value, JsonGenerator gen, SerializerProvider provider) throws IOException {
		List<Requirement> requirements = new ArrayList<>();
		for (Requirement req : value) {
			req.setProcedures(null);
			requirements.add(req);
		}
		gen.writeObject(requirements);
	}

}
