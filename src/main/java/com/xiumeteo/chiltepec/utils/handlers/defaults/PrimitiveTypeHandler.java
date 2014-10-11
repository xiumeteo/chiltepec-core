package com.xiumeteo.chiltepec.utils.handlers.defaults;

import com.xiumeteo.chiltepec.utils.handlers.TypeHandler;

import java.util.Arrays;

/**
 * Created by xiumeteo on 10/10/14.
 */
final class PrimitiveTypeHandler implements TypeHandler {



    private Class<?>[] acceptedTypes = new Class[]{
        Long.TYPE, Short.TYPE, Double.TYPE, Integer.TYPE, String.class, Byte.TYPE,
        Character.TYPE, Boolean.TYPE
    };

    PrimitiveTypeHandler(){
        //Arrays.sort( acceptedTypes );
    }

    @Override
    public <T> T handle(Class<T> type) {

        if( type.equals(String.class) ){
            return (T)"default";
        }

        return null;
    }
}
