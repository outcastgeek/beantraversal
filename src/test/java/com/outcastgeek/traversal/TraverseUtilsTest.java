package com.outcastgeek.traversal;

/*
 Copyright 2013 outcastgeek

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

import com.outcastgeek.exceptions.TraverseException;
import com.outcastgeek.traversal.pojos.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: C148810
 * Date: 8/1/13
 * Time: 11:30 AM
 * To change this template use File | Settings | File Templates.
 */
public class TraverseUtilsTest {

    public static final String POJO_LEVEL_ONE = "getpojoLevelOne";
    public static final String POJO_LEVEL_TWO = "getpojoLevelTwo";
    public static final String POJO_LEVEL_THREE = "getpojoLevelThree";
    public static final String POJO_LEVEL_FOUR = "getpojoLevelFour";
    public static final String VALUE_ONE = "valueOne";
    public static final String VALUE_TWO = "valueTwo";
    private NestedPojo nestedPojo;

    @Before
    public void setUp() {
        nestedPojo = new NestedPojo();
    }

    @Test
    public void checkLevelFourPojoIsNull() throws TraverseException {
        // setup
        PojoLevelThree pojoLevelThree = new PojoLevelThree();
        PojoLevelTwo pojoLevelTwo = new PojoLevelTwo();
        pojoLevelTwo.setPojoLevelThree(pojoLevelThree);
        PojoLevelOne pojoLevelOne = new PojoLevelOne();
        pojoLevelOne.setPojoLevelTwo(pojoLevelTwo);
        nestedPojo.setPojoLevelOne(pojoLevelOne);

        // run
        boolean response = TraverseUtils.isNullPath(nestedPojo, POJO_LEVEL_ONE, POJO_LEVEL_TWO, POJO_LEVEL_THREE, POJO_LEVEL_FOUR);

        // verify
        assertTrue(response);
    }

    @Test
    public void checkLevelFourPojoIsNotNull() throws TraverseException {
        // setup
        PojoLevelFour pojoLevelFour = new PojoLevelFour();
        PojoLevelThree pojoLevelThree = new PojoLevelThree();
        pojoLevelThree.setPojoLevelFour(pojoLevelFour);
        PojoLevelTwo pojoLevelTwo = new PojoLevelTwo();
        pojoLevelTwo.setPojoLevelThree(pojoLevelThree);
        PojoLevelOne pojoLevelOne = new PojoLevelOne();
        pojoLevelOne.setPojoLevelTwo(pojoLevelTwo);
        nestedPojo.setPojoLevelOne(pojoLevelOne);

        // run
        boolean response = TraverseUtils.isNullPath(nestedPojo, POJO_LEVEL_ONE, POJO_LEVEL_TWO, POJO_LEVEL_THREE, POJO_LEVEL_FOUR);

        // verify
        assertFalse(response);
    }

    @Test
    public void getLevelFourPojo() throws TraverseException {
        // setup
        PojoLevelFour pojoLevelFour = new PojoLevelFour();
        pojoLevelFour.setPojoLevelFour1(VALUE_ONE);
        pojoLevelFour.setPojoLevelFour2(VALUE_TWO);
        PojoLevelThree pojoLevelThree = new PojoLevelThree();
        pojoLevelThree.setPojoLevelFour(pojoLevelFour);
        PojoLevelTwo pojoLevelTwo = new PojoLevelTwo();
        pojoLevelTwo.setPojoLevelThree(pojoLevelThree);
        PojoLevelOne pojoLevelOne = new PojoLevelOne();
        pojoLevelOne.setPojoLevelTwo(pojoLevelTwo);
        nestedPojo.setPojoLevelOne(pojoLevelOne);

        // run
        PojoLevelFour response = (PojoLevelFour) TraverseUtils.getPath(nestedPojo, POJO_LEVEL_ONE, POJO_LEVEL_TWO, POJO_LEVEL_THREE, POJO_LEVEL_FOUR);

        // verify
        assertTrue(VALUE_ONE.equals(response.getPojoLevelFour1()));
        assertTrue(VALUE_TWO.equals(response.getPojoLevelFour2()));
    }

    @Test
    public void getLevelTwoPojo() throws TraverseException {
        // setup
        PojoLevelTwo pojoLevelTwo = new PojoLevelTwo();
        pojoLevelTwo.setPojoLevelTwo1(VALUE_ONE);
        pojoLevelTwo.setPojoLevelTwo2(VALUE_TWO);
        PojoLevelOne pojoLevelOne = new PojoLevelOne();
        pojoLevelOne.setPojoLevelTwo(pojoLevelTwo);
        nestedPojo.setPojoLevelOne(pojoLevelOne);

        // run
        PojoLevelTwo response = (PojoLevelTwo) TraverseUtils.getPath(nestedPojo, POJO_LEVEL_ONE, POJO_LEVEL_TWO);

        // verify
        assertTrue(VALUE_ONE.equals(response.getPojoLevelTwo1()));
        assertTrue(VALUE_TWO.equals(response.getPojoLevelTwo2()));
    }
}
