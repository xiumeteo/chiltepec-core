package com.xiumeteo.chiltepec.config.test;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.XMLConfiguration;
import org.junit.Test;

/**
 * Created on 16/10/2014.
 */
public class ConfigTest {

    @Test
    public void loadConfiguration() throws Exception {
        Configuration config = new XMLConfiguration("handlers.xml");

        config.getInt("primitive.prop");
    }


}
