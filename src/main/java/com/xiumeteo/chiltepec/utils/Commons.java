package com.xiumeteo.chiltepec.utils;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 13/10/2014.
 */
public final class Commons {
     Commons() {
    }

    public static final PropertyDescriptor[] getDescriptors( Class<?> from, Class<?> to) throws Exception{
        return Introspector.getBeanInfo( from, to ).getPropertyDescriptors();
    }

    public static final Object[] extractValues( Method toInvoke, Object... objects ) throws Exception{
        List values =  new ArrayList();

        for( Object object: objects ){
            values.add( toInvoke.invoke( object ) );
        }

        return values.toArray();
    }
}
