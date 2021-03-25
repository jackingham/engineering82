package com.sparta.astha;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeImplementation {
// I am writing to the interface Deque
    Deque<String> deque = new ArrayDeque();

    public void implementArrayDequeue() {
        deque.add("Sparta Trainee:1");
        deque.add("Sparta Trainee:2");
        deque.add("Sparta Trainee:3");
        deque.addLast("Sparta Trainee 4");
        deque.addFirst("Sparta Trainee 0");
        Printer.printMessage("Deque::"+deque);
        //Remove in the order of FIFO
        //You can also use removeFirst does the same

        Printer.printMessage(deque.remove());
        Printer.printMessage(deque.remove());
        Printer.printMessage(deque.remove());
        Printer.printMessage(deque.removeFirst());
        Printer.printMessage(deque.remove());
        Printer.printMessage("Deque::"+deque);

        deque.add("Sparta Trainee:1");
        deque.add("Sparta Trainee:2");
        deque.add("Sparta Trainee:3");

        //Remove in the order of LIFO
        Printer.printMessage(deque.removeLast());
        Printer.printMessage(deque.removeLast());
        Printer.printMessage(deque.removeLast());

        //System.out.println(deque.removeLast());
        Printer.printMessage(deque.pollLast());
        deque.add("one");
        deque.add("two");
        deque.add("three");
        deque.add("four");
        deque.add("five");

        Printer.printMessage("Deque::"+deque);
        Printer.printMessage(deque.pollFirst() + " first removed");
        Printer.printMessage("Deque::"+deque);
        Printer.printMessage(deque.pollLast() + " last removed" );
        Printer.printMessage("Deque::"+deque);
        Printer.printMessage(deque.poll() + " removed");
        Printer.printMessage("Deque::"+deque);

        deque.clear();
        Printer.printMessage("first: " + deque.peekFirst());
        //System.out.println("getFirst::"+deque.getFirst());
        deque.add("one");
        deque.add("two");
        deque.add("three");
        deque.add("four");
        deque.add("five");
        //inspect
        Printer.printMessage("Deque::"+deque);
        Printer.printMessage(deque.element());
        Printer.printMessage(deque.peek());
        Printer.printMessage("getFirst::"+deque.getFirst());
        Printer.printMessage("first: " + deque.peekFirst());
        Printer.printMessage("getLast::"+deque.getLast());
        Printer.printMessage("Last: " + deque.peekLast());
        Printer.printMessage("");



    }
}
