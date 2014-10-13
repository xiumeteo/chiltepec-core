package com.xiumeteo.chiltepec.utils.callbacks.asserters;

import com.xiumeteo.chiltepec.utils.callbacks.Callable;

import static com.xiumeteo.chiltepec.utils.callbacks.asserters.DefaultAsserters.EQUALS;
import static com.xiumeteo.chiltepec.utils.callbacks.asserters.DefaultAsserters.NOT_NULL;
import static com.xiumeteo.chiltepec.utils.callbacks.asserters.DefaultAsserters.NULL;

/**
 * Created on 13/10/2014.
 */
public final class AsserterFactory {

    AsserterFactory() {
    }

    public static final Asserter getAsserter( DefaultAsserters asserter ){

        Asserter loadedAsserter = null;

        if( asserter.equals(EQUALS) ){
            loadedAsserter = new EqualsAsserter();
        }else if( asserter.equals(NOT_NULL) ){
            loadedAsserter = new NotNullAsserter();
        }else if( asserter.equals(NULL) ){
            loadedAsserter =  new NullAsserter();
        }else{
            throw new IllegalArgumentException("There is no asserter named "+asserter);
        }

        return loadedAsserter;
    }

}
