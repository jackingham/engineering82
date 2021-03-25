package com.sparta.astha;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetImplementation {

    private Set<String> mySet=new HashSet<>();

        public HashSetImplementation() {

            mySet.add("one");
            mySet.add("two");
            mySet.add("three");
            mySet.add("four");
            mySet.add("one");
            mySet.add(null);
        }

        public void iterateThroughSet()
        {
            Printer.printMessage("My Set::"+mySet);
            Printer.printMessage("Sets");
            Printer.printMessage("With iterator:");

            for (Iterator<String> iterator = mySet.iterator(); iterator.hasNext();) {
                System.out.println(iterator.next());
            }

            Printer.printMessage("");
            Printer.printMessage("Using forEach:");

            for (String element : mySet) {
                System.out.println(element);
            }


        }


         public void removeMethod(){

            mySet.remove("one");
            //mySet.clear();
             Printer.printMessage("My Set::"+mySet);
             Printer.printMessage("mySet::"+mySet.isEmpty());
        }
    }

