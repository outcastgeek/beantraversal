package com.outcastgeek.traversal.pojos;

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
 * Time: 1:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class PojoLevelOne {

    private String pojoLevelOne1;
    private String pojoLevelOne2;
    private PojoLevelTwo pojoLevelTwo;

    public String getPojoLevelOne1() {
        return pojoLevelOne1;
    }

    public void setPojoLevelOne1(String pojoLevelOne1) {
        this.pojoLevelOne1 = pojoLevelOne1;
    }

    public String getPojoLevelOne2() {
        return pojoLevelOne2;
    }

    public void setPojoLevelOne2(String pojoLevelOne2) {
        this.pojoLevelOne2 = pojoLevelOne2;
    }

    public PojoLevelTwo getPojoLevelTwo() {
        return pojoLevelTwo;
    }

    public void setPojoLevelTwo(PojoLevelTwo pojoLevelTwo) {
        this.pojoLevelTwo = pojoLevelTwo;
    }
}
