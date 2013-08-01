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
 * User: C148810
 * Date: 8/1/13
 * Time: 1:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class PojoLevelTwo {

    private String pojoLevelTwo1;
    private String pojoLevelTwo2;
    private PojoLevelThree pojoLevelThree;

    public String getPojoLevelTwo1() {
        return pojoLevelTwo1;
    }

    public void setPojoLevelTwo1(String pojoLevelTwo1) {
        this.pojoLevelTwo1 = pojoLevelTwo1;
    }

    public String getPojoLevelTwo2() {
        return pojoLevelTwo2;
    }

    public void setPojoLevelTwo2(String pojoLevelTwo2) {
        this.pojoLevelTwo2 = pojoLevelTwo2;
    }

    public PojoLevelThree getPojoLevelThree() {
        return pojoLevelThree;
    }

    public void setPojoLevelThree(PojoLevelThree pojoLevelThree) {
        this.pojoLevelThree = pojoLevelThree;
    }
}
