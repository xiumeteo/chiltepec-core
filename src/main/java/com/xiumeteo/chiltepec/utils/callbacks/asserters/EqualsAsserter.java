package com.xiumeteo.chiltepec.utils.callbacks.asserters;

import static junit.framework.TestCase.assertEquals;

/**
 * Created on 13/10/2014.
 */
public final class EqualsAsserter implements Asserter {

    EqualsAsserter() {
    }


    @Override
    public Void call(final AssertParameters args) {

        Object expected = args.getArgs()[0];
        Object obtained = args.getArgs()[1];


        assertEquals("The attribute '"+args.getAttributeName()+"' are not equals\n" +
                "expectedObject='"+expected+"'\n" +
                "obtainedObject='"+obtained+"'\n" ,expected, obtained );

        return null;
    }
}
