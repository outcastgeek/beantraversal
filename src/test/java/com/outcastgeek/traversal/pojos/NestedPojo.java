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
public class NestedPojo {

    private String nestedPojoField1;
    private String nestedPojoField2;
    private PojoLevelOne pojoLevelOne;

    public String getNestedPojoField1() {
        return nestedPojoField1;
    }

    public void setNestedPojoField1(String nestedPojoField1) {
        this.nestedPojoField1 = nestedPojoField1;
    }

    public String getNestedPojoField2() {
        return nestedPojoField2;
    }

    public void setNestedPojoField2(String nestedPojoField2) {
        this.nestedPojoField2 = nestedPojoField2;
    }

    public PojoLevelOne getPojoLevelOne() {
        return pojoLevelOne;
    }

    public void setPojoLevelOne(PojoLevelOne pojoLevelOne) {
        this.pojoLevelOne = pojoLevelOne;
    }
}
