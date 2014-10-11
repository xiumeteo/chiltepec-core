package com.xiumeteo.chiltepec.utils.handlers.defaults;

import com.xiumeteo.chiltepec.utils.handlers.TypeHandler;

import static com.xiumeteo.chiltepec.utils.handlers.defaults.DefaultTypeHandlers.PRIMITIVE_TYPE_HANDLER;

/**
 * Created by xiumeteo on 10/10/14.
 */
public final class TypeHandlerFactory {

    public static TypeHandler getTypeHandler( DefaultTypeHandlers handler ){
        if( handler.equals( PRIMITIVE_TYPE_HANDLER ) ){
            return new PrimitiveTypeHandler();
        }

        throw new IllegalArgumentException("The type handler "+handler.toString()+" does not exists");
    }
}
