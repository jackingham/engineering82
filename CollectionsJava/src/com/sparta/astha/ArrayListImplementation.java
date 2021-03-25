package com.sparta.astha;

import java.util.*;

public class ArrayListImplementation {

        public void implementArrayList() {
            //resizable array
            //Collection<Integer> arrayList=new ArrayList<>();//writing to the interface
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
            //List list=new ArrayList();//This is better as it gives more generality
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);
            arrayList.add(3); //duplicates allowed
            arrayList.add(null);//null value is allowed


            arrayList1.add(9);
            arrayList1.add(10);
            arrayList1.add(2);

            Printer.printMessage("ArrayList::" + arrayList);
            Printer.printMessage("ArrayList1::" + arrayList1);

            // Remove element at the 0th position
            arrayList.remove(0);
            Printer.printMessage("After removing an element at the 0th position::"+arrayList);

            // Add an element at the 0th position
            arrayList.add(0, 4);
            Printer.printMessage("After adding an element at the 0th position::"+arrayList);

            //Setting an element at the 0th position
            arrayList.set(0,5);
            Printer.printMessage("After Setting an element at the 0th position::"+arrayList);

            //Get the 3rd element
            Printer.printMessage("Get from index 2::"+arrayList.get(2));

            Printer.printMessage("ArrayList::"+arrayList);
            Printer.printMessage("ArrayList1::"+arrayList1);

            //Bulk Operations

            //remove all
            Printer.printMessage("-----Remove all-----");
            arrayList.removeAll(arrayList1);
            Printer.printMessage("ArrayList::" + arrayList);
            Printer.printMessage("ArrayList1::" + arrayList1);

            arrayList.add(1);
            arrayList1.add(1);
            Printer.printMessage("ArrayList::" + arrayList);
            Printer.printMessage("ArrayList1::" + arrayList1);

            //retain all
            Printer.printMessage("----Retain All----");
            arrayList.retainAll(arrayList1);
            Printer.printMessage("ArrayList::" + arrayList);
            Printer.printMessage("ArrayList1::" + arrayList1);

            //add all
            arrayList.add(3);
            Printer.printMessage("ArrayList::" + arrayList);
            arrayList.addAll(arrayList1);
            Printer.printMessage("ArrayList::" + arrayList);
            Printer.printMessage("ArrayList1::" + arrayList1);

            //Search
            Printer.printMessage("Contains::"+arrayList.contains(1));
            Printer.printMessage("Index Of::"+arrayList.indexOf(1));
            Printer.printMessage("Last Index Of::"+arrayList.lastIndexOf(1));

            //for each vs iterator
            for (int element : arrayList1) {
                System.out.println("Element:" + element);//iterating

                if (element == 9) {
                    arrayList1.remove(Integer.valueOf(element));//manipulating the arraylist
                }
            }



          arrayList.add(9);
            arrayList.add(9);
            System.out.println("ArrayList::"+arrayList);
         //Invoking the arraylist iterator returns an instance of the iterator through which we can iterate through our collections
        Iterator iterator= arrayList.iterator();

//        while(iterator.hasNext()){
//             int element=(int)iterator.next();
//            System.out.println("element::"+element);
//
//            if(element==9){
//                iterator.remove();
//            }
//
//       }

            System.out.println(arrayList);

        //Sort
            Collections.sort(arrayList);
            System.out.println(arrayList);
            Collections.reverse(arrayList);
            System.out.println(arrayList);

       // Explore List iterator in your own time and play with it












        }
    }
