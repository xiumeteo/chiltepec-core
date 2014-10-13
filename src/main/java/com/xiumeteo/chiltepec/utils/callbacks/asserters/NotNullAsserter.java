package com.xiumeteo.chiltepec.utils.callbacks.asserters;

import static org.junit.Assert.assertNotNull;

/**
 * Created on 13/10/2014.
 */
public final class NotNullAsserter implements Asserter {

     NotNullAsserter() {
    }



    @Override
    public Void call(final AssertParameters args) {
        assertNotNull( "The attribute '"+args.getAttributeName()+"' is NULL",
                args.getArgs()[0] );
        return null;
    }
}
