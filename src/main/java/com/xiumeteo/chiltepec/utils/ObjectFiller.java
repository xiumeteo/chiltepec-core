package com.xiumeteo.chiltepec.utils;

import com.xiumeteo.chiltepec.utils.handlers.TypeHandler;
import com.xiumeteo.chiltepec.utils.handlers.defaults.TypeHandlerFactory;
import org.apache.commons.beanutils.PropertyUtils;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

import static com.xiumeteo.chiltepec.utils.handlers.defaults.DefaultTypeHandlers.PRIMITIVE_TYPE_HANDLER;

/**
 * Created by xiumeteo on 10/10/14.
 */
public final class ObjectFiller {

    ObjectFiller(){}

    public static <T> T fillPrimitives( T object ) throws Exception {
        return fillObject( object, Object.class, TypeHandlerFactory.getTypeHandler( PRIMITIVE_TYPE_HANDLER ));
    }

    private static <T> T fillObject( T instance, Class<?> stopClass, TypeHandler handler ) throws Exception{

        PropertyDescriptor[] descriptors = PropertyUtils.getPropertyDescriptors( instance );

        for(PropertyDescriptor descriptor: descriptors){
            Method setterMethod = PropertyUtils.getWriteMethod( descriptor );


            if( setterMethod != null && setterMethod.getParameterTypes().length == 1){

                Object argument = handler.handle( descriptor.getPropertyType() );

                if( descriptor.getPropertyType().isPrimitive() && argument != null ){
                    setterMethod.invoke( instance, argument );
                }else if( descriptor.getPropertyType().isPrimitive() ){
                    //do nothing
                }else{
                    setterMethod.invoke( instance, argument );
                }


            }
        }

        return instance;

    }

}
