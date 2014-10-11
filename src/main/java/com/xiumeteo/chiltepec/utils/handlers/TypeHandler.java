package com.xiumeteo.chiltepec.utils.handlers;

/**
 * Created by xiumeteo on 10/10/14.
 */
public interface TypeHandler {

    <T> T handle( Class<T> type  );

}
