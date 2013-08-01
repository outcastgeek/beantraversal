beantraversal [![Build Status](https://secure.travis-ci.org/outcastgeek/beantraversal.png?branch=master)](http://travis-ci.org/outcastgeek/beantraversal)
=============
Traverses POJOs using String steps which are partial or exact name for the name methods to be used to traverse.

Warning
=======
This is an afternoon hack, not a library.

Installation
============

        Fork it, or Straight copy it!!!!

example
=======

        boolean response = TraverseUtils.isNullPath(nestedPojo, POJO_LEVEL_ONE, POJO_LEVEL_TWO, POJO_LEVEL_THREE, POJO_LEVEL_FOUR);

        PojoLevelFour response = (PojoLevelFour) TraverseUtils.getPath(nestedPojo, POJO_LEVEL_ONE, POJO_LEVEL_TWO, POJO_LEVEL_THREE, POJO_LEVEL_FOUR);

license
=======

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
