package com.garry.core;

import org.springframework.core.annotation.MergedAnnotation;
import org.springframework.core.type.AnnotationMetadata;

import java.lang.annotation.Annotation;

public class G_AnnotationMetadata {
	public static void main(String[] args) {
		AnnotationMetadata annotationMetadata = AnnotationMetadata.introspect(G_CoreConfig.class);
		System.out.println(annotationMetadata.getAnnotationTypes());
		for (MergedAnnotation<Annotation> annotation : annotationMetadata.getAnnotations()) {
			System.out.println(annotation);
		}
		System.out.println(annotationMetadata.hasAnnotation("org.springframework.context.annotation.ComponentScan"));

	}
}
