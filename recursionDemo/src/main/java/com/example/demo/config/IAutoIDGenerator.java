package com.example.demo.config;

import java.util.concurrent.atomic.AtomicLong;

public interface IAutoIDGenerator {
	public final AtomicLong counter = new AtomicLong();
}
