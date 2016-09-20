//$Id: $
package org.hibernate5.annotations.common.test.reflection.java.generics.deep;

import org.hibernate5.annotations.common.reflection.XClass;
import org.hibernate5.annotations.common.reflection.java.JavaReflectionManager;

import junit.framework.TestCase;


/**
 * @author Emmanuel Bernard
 */
public class DeepGenericsInheritance extends TestCase {
	public void test2StepsGenerics() throws Exception {
		JavaReflectionManager factory = new JavaReflectionManager();
		XClass subclass2 = factory.toXClass( Subclass2.class );
		XClass dummySubclass = factory.toXClass( DummySubclass.class );
		XClass superclass = subclass2.getSuperclass();
		XClass supersuperclass = superclass.getSuperclass();
		assertTrue( supersuperclass.getDeclaredProperties( "field" ).get( 1 ).isTypeResolved() );
		assertEquals( dummySubclass, supersuperclass.getDeclaredProperties( "field" ).get( 1 ).getType() );

	}
}
