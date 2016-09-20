package org.hibernate5.annotations.common.reflection.java;

import java.util.Map;

import org.hibernate5.annotations.common.reflection.AnnotationReader;
import org.hibernate5.annotations.common.reflection.MetadataProvider;

import java.util.Collections;
import java.lang.reflect.AnnotatedElement;

/**
 * @author Emmanuel Bernard
*/
public class JavaMetadataProvider implements MetadataProvider {

	public Map<Object, Object> getDefaults() {
		return Collections.emptyMap();
	}

	public AnnotationReader getAnnotationReader(AnnotatedElement annotatedElement) {
		return new JavaAnnotationReader(annotatedElement);
	}
}
