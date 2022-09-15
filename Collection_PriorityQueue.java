//1. Write	a	Java	program	to	create	a	new	priority	queue,	add	some	colors(string)	and	print	out	the	elements	of	the	priority	queue.
//2. Write	a	Java	program	to	iterate	through	all	elements	in	priority	queue.
//3. Write	a	Java	program	to	add	all	the	elements	of	a	priority	queue	to	another priority	queue.
//4. Write	a	Java	program	to	insert	a	given	element	into	a	priority	queue.
//5. Write	a	Java	program	to	remove	all	the	elements	from	a	priority	queue.
//6. Write	a	Java	program	to	count	the	number	of	elements	in	a	priority	queue.
//7. Write	a	Java	program	to	compare	two	priority	queues.
//8. Write	a	Java	program	to	retrieve	the	first	element	of	the	priority	queue.
//9. Write	a	Java	program	to	retrieve	and	remove	the	first	element.
//10. Write	a	Java	program	to	convert	a	priority	queue	to	an	array	containing	all of	the	elements	of	the	queue.
//11. Write	a	Java	program	to	convert	a	Priority	Queue	elements	to	a	string representation.
//12. Write	a	Java	program	to	change	priorityQueue	to	maximum priorityqueue


import java.util.Collections;
import java.util.PriorityQueue;

public class Collection_PriorityQueue {
    public static void main(String[] args) {
//        1
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("red");
        queue.add("blue");
        queue.add("green");
        queue.add("yellow");
        queue.add("black");
        System.out.println(queue);
        System.out.println("--------------------------------------------------");

//        2
        System.out.println("Iterate through all elements in priority queue:");
        for (String s : queue) {
            System.out.println(s);
        }
        System.out.println("--------------------------------------------------");

//        3
        System.out.println("Add all the elements of a priority queue to another priority queue:");
        PriorityQueue<String> queue2 = new PriorityQueue<>();
        queue2.add("white");
        queue2.add("pink");
        queue2.add("orange");
        queue2.add("purple");
        queue2.add("brown");
        queue2.addAll(queue);
        System.out.println(queue2);
        System.out.println("--------------------------------------------------");

//        4
        System.out.println("Insert a given element into a priority queue:");
        queue2.offer("grey");
        System.out.println(queue2);
        System.out.println("--------------------------------------------------");

//        5
        System.out.println("Remove all the elements from a priority queue:");
        queue.clear();
        System.out.println(queue);
        System.out.println("--------------------------------------------------");

//        6
        System.out.println("Count the number of elements in a priority queue:");
        System.out.println(queue2.size());
        System.out.println("--------------------------------------------------");

//        7
        System.out.println("Compare two priority queues:");
        PriorityQueue<String> queue3 = new PriorityQueue<>();
        queue3.add("white");
        queue3.add("pink");
        queue3.add("orange");
        queue3.add("purple");
        queue3.add("brown");

        boolean flag =true;
        for(String s:queue2){
            if(!queue3.contains(s)){
                flag=false;
                break;
            }
        }
        System.out.println(flag);
        System.out.println("--------------------------------------------------");

//        8
        System.out.println("Retrieve the first element of the priority queue:");
        System.out.println(queue2.peek());
        System.out.println("--------------------------------------------------");

//        9
        System.out.println("Retrieve and remove the first element:");
        System.out.println(queue2.poll());
        System.out.println("--------------------------------------------------");

//        10
        System.out.println("Convert a priority queue to an array containing all of the elements of the queue:");
        Object[] arr = queue2.toArray();
        for(Object s:arr){
            System.out.println(s);
        }
        System.out.println("--------------------------------------------------");

//        11
        System.out.println("Convert a Priority Queue elements to a string representation:");
        System.out.println(queue2.toString());
        System.out.println("--------------------------------------------------");

//        12
        System.out.println("Change priorityQueue to maximum priorityqueue:");
        PriorityQueue<String> queue4 = new PriorityQueue<>(queue2.size(), Collections.reverseOrder());
        queue4.addAll(queue2);
        System.out.println(queue4);
        System.out.println("--------------------------------------------------");
    }


}
