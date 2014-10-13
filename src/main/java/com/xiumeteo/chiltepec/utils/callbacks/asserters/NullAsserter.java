package com.xiumeteo.chiltepec.utils.callbacks.asserters;

import static org.junit.Assert.assertNull;

/**
 * Created on 13/10/2014.
 */
public final class NullAsserter implements Asserter {

     NullAsserter() {
    }



    @Override
    public Void call(final AssertParameters args) {
        assertNull( "The attribute '"+args.getAttributeName()+"' is NOT NULL",
                args.getArgs()[0] );
        return null;
    }
}
