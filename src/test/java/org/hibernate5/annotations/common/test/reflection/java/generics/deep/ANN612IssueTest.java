//$Id: $
package org.hibernate5.annotations.common.test.reflection.java.generics.deep;

import java.util.List;

import org.hibernate5.annotations.common.reflection.XClass;
import org.hibernate5.annotations.common.reflection.XProperty;
import org.hibernate5.annotations.common.reflection.java.JavaReflectionManager;

import junit.framework.TestCase;


/**
 * @author Paolo Perrotta
 */
public class ANN612IssueTest extends TestCase {


	public static class J<T> {}

	public static class C {
		public J<Object> thisOneAlwaysWorkedFine;
		public J<Object[]> thisOneUsedToCauseProblems;
	}
	
	public void testANN612IssueIsFixed() throws Exception {
		JavaReflectionManager factory = new JavaReflectionManager();
		XClass clazz = factory.toXClass( C.class );
		List<XProperty> properties = clazz.getDeclaredProperties( XClass.ACCESS_FIELD );
		for( XProperty property : properties ) 
			assertTrue( property.isTypeResolved() );
	}
}