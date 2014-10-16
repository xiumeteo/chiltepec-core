package com.xiumeteo.chiltepec.utils.test;

import com.xiumeteo.chiltepec.test.utils.SimpleHierarchicalNotNullObject;
import com.xiumeteo.chiltepec.test.utils.SimpleNotNullObject;
import com.xiumeteo.chiltepec.test.utils.SimpleNullObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.xiumeteo.chiltepec.utils.AttributesAssert.*;

/**
 * Created on 13/10/2014.
 */
public class AttributesAssertTest {


    @Test
    public void testNotNullWhenNotNull() throws Exception{

        SimpleNotNullObject object =  new SimpleNotNullObject();

        assertNotNullAttributes(object);

    }

    @Test
    public void testNotNullWhenNotNullInHierarchical() throws Exception{

        SimpleHierarchicalNotNullObject object =  new SimpleHierarchicalNotNullObject();

        assertNotNullAttributes(object);

    }

    @Test( expected = AssertionError.class )
    public void testNotNullWhenNull() throws Exception{

        SimpleNullObject object =  new SimpleNullObject();

        assertNotNullAttributes(object);

    }


    @Test( expected = AssertionError.class )
    public void testNullWhenNotNUll() throws Exception{

        SimpleNotNullObject object =  new SimpleNotNullObject();

        assertNullAttributes(object);

    }
    @Test
    public void testNullWhenNull() throws Exception{

        SimpleNullObject object =  new SimpleNullObject();

        assertNullAttributes(object);

    }

    @Test
    public void testEqualsWhenEquals()throws Exception{

        SimpleNotNullObject object1 =  new SimpleNotNullObject();
        SimpleNotNullObject object2 =  new SimpleNotNullObject();

        assertEqualsByAttributes( object1, object2 );

    }

    @Test( expected = AssertionError.class)
    public void testEqualsWhenNoEquals()throws Exception{

        SimpleNotNullObject object1 =  new SimpleNotNullObject();
        SimpleNotNullObject object2 =  new SimpleNotNullObject();
        object1.setaChar('c');

        assertEqualsByAttributes(object1, object2);

    }

    @Test
    public void testEqualsCollections() throws Exception{

        List<SimpleNotNullObject> objects1 = new ArrayList<SimpleNotNullObject>();
        objects1.add(new SimpleNotNullObject());
        objects1.add(new SimpleNotNullObject());
        objects1.add(new SimpleNotNullObject());
        objects1.add(new SimpleNotNullObject());



        List<SimpleNotNullObject> objects2 = new ArrayList<SimpleNotNullObject>( );
        objects2.add(new SimpleNotNullObject());
        objects2.add(new SimpleNotNullObject());
        objects2.add(new SimpleNotNullObject());
        objects2.add(new SimpleNotNullObject());

        assertEqualsCollections( objects1, objects2 );

    }

    @Test( expected = AssertionError.class )
    public void testNotEqualsCollections() throws Exception{

        List<SimpleNotNullObject> objects1 = new ArrayList<SimpleNotNullObject>();
        objects1.add(new SimpleNotNullObject());
        objects1.add(new SimpleNotNullObject());
        objects1.add(new SimpleNotNullObject());
        objects1.add(new SimpleNotNullObject());



        List<SimpleNotNullObject> objects2 = new ArrayList<SimpleNotNullObject>( );
        objects2.add(new SimpleNotNullObject());
        objects2.add(new SimpleNotNullObject());
        objects2.add(new SimpleNotNullObject());
        objects2.add(new SimpleNotNullObject());

        SimpleNotNullObject notNullObject = new SimpleNotNullObject();
        notNullObject.setaChar('c');
        Collections.fill( objects2, notNullObject );


        assertEqualsCollections(objects1, objects2);

    }





}
