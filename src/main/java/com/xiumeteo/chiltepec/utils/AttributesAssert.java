package com.xiumeteo.chiltepec.utils;

import com.xiumeteo.chiltepec.utils.callbacks.asserters.AssertParameters;
import com.xiumeteo.chiltepec.utils.callbacks.asserters.Asserter;
import com.xiumeteo.chiltepec.utils.callbacks.asserters.AsserterFactory;
import org.apache.commons.beanutils.PropertyUtils;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;

import static com.xiumeteo.chiltepec.utils.Commons.extractValues;
import static com.xiumeteo.chiltepec.utils.Commons.getDescriptors;
import static com.xiumeteo.chiltepec.utils.callbacks.asserters.DefaultAsserters.*;

/**
 * Created on 13/10/2014.
 */
public final class AttributesAssert {


    AttributesAssert() {
    }

    public static final void assertOverAttributes(Asserter asserter, Object... parameters) throws Exception {
        performAssert(asserter, parameters);
    }

    public static final void assertNotNullAttributes( Object object ) throws Exception{
        performAssert(AsserterFactory.getAsserter(NOT_NULL), object);
    }

    public static final void assertNullAttributes( Object object ) throws Exception{
        performAssert(  AsserterFactory.getAsserter(NULL), object);
    }

    public static final <T> void  assertEqualsByAttributes( T expected, T obtained )throws Exception{
        performAssert( AsserterFactory.getAsserter( EQUALS ), expected, obtained );
    }

    public static final void assertEqualsCollections( Collection expected, Collection obtained ) throws Exception{

        if( expected.size() != obtained.size() ){
            throw new AssertionError("The collections are different in size expectedSize='"+expected.size()+"'" +
                    " obtainedSize='"+obtained.size()+"'");
        }

        Iterator expectedIterator =  expected.iterator();
        Iterator obtainedIterator =  obtained.iterator();
        Asserter equals = AsserterFactory.getAsserter( EQUALS );

        while( expectedIterator.hasNext() && obtainedIterator.hasNext() ){
            Object expectedObject =  expectedIterator.next();
            Object obtainedObject =  obtainedIterator.next();

            performAssert( equals, expectedObject, obtainedObject );
        }

    }

    private static final void performAssert( Asserter asserter, Object... toAssert ) throws Exception{
        PropertyDescriptor[] descriptors = getDescriptors( toAssert[0].getClass(),
                toAssert[0].getClass().getSuperclass() );

        for(PropertyDescriptor descriptor: descriptors){
            Method getterMethod = PropertyUtils.getReadMethod( descriptor );

            if( getterMethod != null ){
                Object[] values = extractValues(getterMethod, toAssert);
                asserter.call( new AssertParameters( descriptor.getName(), values ));
            }
        }
    }



}
