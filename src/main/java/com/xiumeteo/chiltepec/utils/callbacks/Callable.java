package com.xiumeteo.chiltepec.utils.callbacks;

/**
 * Created on 13/10/2014.
 */
public interface Callable<Return, Parameters> {

    Return call( Parameters args );

}
