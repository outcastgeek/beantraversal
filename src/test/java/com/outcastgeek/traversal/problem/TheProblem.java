package com.outcastgeek.traversal.problem;

import com.outcastgeek.traversal.pojos.NestedPojo;
import com.outcastgeek.traversal.pojos.PojoLevelFour;
import com.outcastgeek.traversal.pojos.PojoLevelOne;
import com.outcastgeek.traversal.pojos.PojoLevelThree;
import com.outcastgeek.traversal.pojos.PojoLevelTwo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: outcastgeek
 * Date: 8/4/13
 * Time: 8:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class TheProblem {

    private static Logger logger = LoggerFactory.getLogger(TheProblem.class);

    public void someMethodThatDoesStuffWithValueDownBelow(NestedPojo nestedPojo) {

        PojoLevelOne pojoLevelOne = nestedPojo.getPojoLevelOne();
        if (pojoLevelOne != null) {
            logger.info("Passed level one null check!!!!");
            PojoLevelTwo pojoLevelTwo = pojoLevelOne.getPojoLevelTwo();
            if (pojoLevelTwo != null) {
                logger.info("Passed level two null check!!!!");
                PojoLevelThree pojoLevelThree = pojoLevelTwo.getPojoLevelThree();
                if (pojoLevelThree != null) {
                    logger.info("Passed level three null check!!!!");
                    PojoLevelFour pojoLevelFour = pojoLevelThree.getPojoLevelFour();
                    if (pojoLevelFour != null) {
                        logger.info("Passed level four null check!!!!");
                        logger.info("Guess what, we did all of this work just to print these ({}, {})!!!!", pojoLevelFour.getPojoLevelFour1(), pojoLevelFour.getPojoLevelFour2());
                    }
                }
            }
        }
    }
}
