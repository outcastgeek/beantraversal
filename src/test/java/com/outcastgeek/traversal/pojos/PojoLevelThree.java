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
 * Time: 1:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class PojoLevelThree {

    private String pojoLevelThree1;
    private String pojoLevelThree2;
    private PojoLevelFour pojoLevelFour;

    public String getPojoLevelThree1() {
        return pojoLevelThree1;
    }

    public void setPojoLevelThree1(String pojoLevelThree1) {
        this.pojoLevelThree1 = pojoLevelThree1;
    }

    public String getPojoLevelThree2() {
        return pojoLevelThree2;
    }

    public void setPojoLevelThree2(String pojoLevelThree2) {
        this.pojoLevelThree2 = pojoLevelThree2;
    }

    public PojoLevelFour getPojoLevelFour() {
        return pojoLevelFour;
    }

    public void setPojoLevelFour(PojoLevelFour pojoLevelFour) {
        this.pojoLevelFour = pojoLevelFour;
    }
}
