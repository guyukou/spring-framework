package com.garry.core;

import org.springframework.core.ResolvableType;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class G_ResolvableType {
	public static void main(String[] args) {
		testHashMap();
	}

	private static void testHashMap() {
		ResolvableType resolvableType = ResolvableType.forType(HashMap.class);
		System.out.println(resolvableType.getSource());
		System.out.println(resolvableType.isArray());
		System.out.println(resolvableType.asMap());
		System.out.println(resolvableType.isAssignableFrom(Map.class));
	}
}
