package com.xiumeteo.chiltepec.utils.callbacks.asserters;

/**
 * Created on 13/10/2014.
 */
public final class AssertParameters {

    private String attributeName;

    private Object[] args;

    public AssertParameters(final String attributeName, final Object[] args) {
        this.attributeName = attributeName;
        this.args = args;
    }

    public Object[] getArgs() {
        return args;
    }

    public String getAttributeName() {
        return attributeName;
    }
}
