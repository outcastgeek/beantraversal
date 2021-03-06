package com.outcastgeek.exceptions;

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

/**
 * Created with IntelliJ IDEA.
 * User: outcastgeek
 * Date: 8/1/13
 * Time: 2:06 PM
 * To change this template use File | Settings | File Templates.
 */

/**
 * TraverseException
 */
public class TraverseException extends Exception {

    /**
     * @param t is the Throwable to be wrapped.
     */
    public TraverseException(Throwable t) {
        super(t);
    }
}
