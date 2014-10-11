package com.xiumeteo.chiltepec.utils.test;

import com.xiumeteo.chiltepec.test.utils.SimpleObject;
import com.xiumeteo.chiltepec.utils.ObjectFiller;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;

/**
 * Created by xiumeteo on 10/10/14.
 */
public class ObjectFillerTest {

    @Test
    public void thatFillPrimitives() throws Exception{

        SimpleObject object = new SimpleObject();
        object =  ObjectFiller.fillPrimitives(object);

        assertFalse(object.equals(new SimpleObject()));
    }



}
