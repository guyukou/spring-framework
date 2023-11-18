package com.garry.util;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;

/**
 * @author guyu06
 * @date 2022/9/11 3:54 下午
 */
public class DateEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		try {
			setValue(new SimpleDateFormat("yyyy-MM-dd").parse(text));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}