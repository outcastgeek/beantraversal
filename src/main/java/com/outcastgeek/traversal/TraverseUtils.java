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
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: C148810
 * Date: 8/1/13
 * Time: 11:30 AM
 * To change this template use File | Settings | File Templates.
 */
public class TraverseUtils {

    private static Logger logger = LoggerFactory.getLogger(TraverseUtils.class);

    public static boolean isNullPath(Object pojo, String... pathSteps) throws TraverseException {

        boolean isNullPath = false;

        try {
            Class pojoClass = pojo.getClass();
            Method[] declaredMethods = pojoClass.getDeclaredMethods();
            int pathStepLength = pathSteps.length;
            logger.debug("Traversing {}...", pojo);
            for (int i = 0; i < pathStepLength; i++) {
                String step = pathSteps[i];
                logger.debug("Step: {}", step);
                Object value = null;
                for (Method method:declaredMethods) {
                    String methodName = method.getName();
                    if (StringUtils.containsIgnoreCase(methodName, step)) {
                        value = pojoClass.getDeclaredMethod(methodName).invoke(pojo);
                        break;
                    }
                }
                if (value != null) {
                    if (i == pathStepLength - 1) {
                        break;
                    } else {
                        String[] followingSteps = ArrayUtils.removeElement(pathSteps, step);
                        return isNullPath(value, followingSteps);
                    }
                } else {
                    isNullPath = true;
                    break;
                }
            }
        } catch (Exception e) {
            throw new TraverseException(e);
        }

        return isNullPath;
    }

    public static Object getPath(Object pojo, String... pathSteps) throws TraverseException {

        Object value = null;

        try {
            Class pojoClass = pojo.getClass();
            Method[] declaredMethods = pojoClass.getDeclaredMethods();
            int pathStepLength = pathSteps.length;
            logger.debug("Traversing {}...", pojo);
            for (int i = 0; i < pathStepLength; i++) {
                String step = pathSteps[i];
                logger.debug("Step: {}", step);
                for (Method method:declaredMethods) {
                    String methodName = method.getName();
                    if (StringUtils.containsIgnoreCase(methodName, step)) {
                        value = pojoClass.getDeclaredMethod(methodName).invoke(pojo);
                        break;
                    }
                }
                if (i == pathStepLength - 1) {
                    break;
                } else {
                    String[] followingSteps = ArrayUtils.removeElement(pathSteps, step);
                    return getPath(value, followingSteps);
                }
            }
        } catch (Exception e) {
            throw new TraverseException(e);
        }

        return value;
    }
}
