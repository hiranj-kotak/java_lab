//1. Write	a	Java	program	to	append	the	specified	element	to	the	end	of	a	linked  list.
//2. Write	a	Java	program	to	iterate	through	all	elements	in	a	linked	list.
//3. Write	a	Java	program	to	iterate	through	all	elements	in	a	linked	list	starting at	the	specified	position.
//4. Write	a	Java	program	to	iterate	a	linked	list	in	reverse	order.
//5. Write	a	Java	program	to	insert	the	specified	element	at	the	specified position	in	the	linked	list.
//6. Write	a	Java	program	to	insert	elements	into	the	linked	list	at	the	first	and last	position.
//7. Write	a	Java	program	to	insert	the	specified	element	at	the	front	of	a	linked list.
//8. Write	a	Java	program	to	insert	the	specified	element	at	the	end	of	a	linked list.
//9. Write	a	Java	program	to	insert	some	elements	at	the	specified	position	into a	linked	list.
//10. Write	a	Java	program	to	get	the	first	and	last	occurrence	of	the	specified elements	in	a	linked	list.
//11. Write	a	Java	program	to	display	the	elements	and	their	positions	in	a linked	list.
//12. Write	a	Java	program	to	remove	a	specified	element	from	a	linked	list.
//13. Write	a	Java	program	to	remove	first	and	last	element	from	a	linked	list.
//14. Write	a	Java	program	to	remove	all	the	elements	from	a	linked	list.
//15. Write	a	Java	program	of	swap	two	elements	in	a	linked	list.
//16. Write	a	Java	program	to	shuffle	the	elements	in	a	linked	list.
//17. Write	a	Java	program	to	join	two	linked	lists.
//18. Write	a	Java	program	to	clone	an	linked	list	to	another	linked	list.
//19. Write	a	Java	program	to	remove	and	return	the	first	element	of	a	linked list.
//20. Write	a	Java	program	to	retrieve	but	does	not	remove,	the	first	element	of a	linked	list.
//21. Write	a	Java	program	to	retrieve	but	does	not	remove,	the	last	element	of a	linked	list.
//22. Write	a	Java	program	to	check	if	a	particular	element	exists	in	a	linked list.
//23. Write	a	Java	program	to	convert	a	linked	list	to	array	list.
//24. Write	a	Java	program	to	compare	two	linked	lists.
//25. Write	a	Java	program	to	test	an	linked	list	is	empty	or	not.
//26. Write	a	Java	program	to	replace	an	element	in	a	linked	list

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Collections_LinkedList {

    public static void main(String[] args) {

        //1
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(15);
        System.out.println(list);
        System.out.println("--------------------------------------------------");
        System.out.println("");

        //2
        System.out.println("iterating through all the elements of list");
        for(int i:list)
        {
            System.out.println(i);
        }
        System.out.println("--------------------------------------------------");
        System.out.println("");

        //3

        System.out.println("iterate through all elements in a linked list starting at the specified position");
        for(int i=2;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println("--------------------------------------------------");
        System.out.println("");

        //4

        System.out.println("iterate a linked list in reverse order");
        int size = list.size();
        for(int i =size-1;i>0;i--)
        {
            System.out.println(list.get(i));
        }
        System.out.println("--------------------------------------------------");
        System.out.println("");

        //5


        System.out.println("insert the specified element at the specified position in the linked list");
        list.add(2, 6);
        System.out.println(list);
        System.out.println("--------------------------------------------------");
        System.out.println("");

        //6

        System.out.println("insert elements into the linked list at the first and last  position.");
        list.add(0, 7);
        list.add(list.size(), 8);
        System.out.println(list);
        System.out.println("--------------------------------------------------");
        System.out.println("");

        //7

        System.out.println("to get the first and last occurrence of the specified elements in a linked list.");
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(2);
        l1.add(2);
        l1.add(3);
        l1.add(2);
        System.out.println("first occurance of 2 in l1 is" + l1.indexOf(2));
        System.out.println("last occurance of 2 in l1 is" + l1.lastIndexOf(2));
        System.out.println("--------------------------------------------------");
        System.out.println("");


        //8

        System.out.println("display the elements and their positions in a linked list.");
        for(int i=0;i<l1.size();i++)
        {
            System.out.println("element at position "+i+" is "+l1.get(i));
        }
        System.out.println("--------------------------------------------------");
        System.out.println("");

        //9

        System.out.println("remove a specified element from a linked list.");
        list.remove(15);
        System.out.println(list);
        System.out.println("remove first and last element from a linked list.");
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        System.out.println("--------------------------------------------------");
        System.out.println("");

        //10

        System.out.println("remove all the elements from a linked list.");
        list.clear();
        System.out.println(list);
        System.out.println("--------------------------------------------------");
        System.out.println("");

        //11

        System.out.println("swap two elements in a linked list.");
        int temp = l1.get(0);
        int temp2 = l1.get(3);
        l1.set(0, temp2);
        l1.set(3, temp);
        System.out.println(l1);
        System.out.println("--------------------------------------------------");
        System.out.println("");

        //12

        System.out.println("shuffle the elements in a linked list.");
        Collections.shuffle(l1);
        System.out.println("--------------------------------------------------");
        System.out.println("");

        //13

        System.out.println("join two linked lists.");
        LinkedList<Integer> l2 = new LinkedList<>();
        LinkedList<Integer> l3 = new LinkedList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);

        l3.add(6);
        l3.add(7);
        l3.add(8);
        l3.add(9);
        l3.add(10);

        l2.addAll(l3);
        System.out.println(l2);
        System.out.println("--------------------------------------------------");
        System.out.println("");

        //14

        System.out.println("clone an linked list to another linked list.");
        LinkedList<Integer> l4 =  (LinkedList<Integer>) l2.clone();
        System.out.println(l4);
        System.out.println("--------------------------------------------------");
        System.out.println("");

        //15

        System.out.println("remove and return the first element of a linked list.");
        System.out.println(l4.removeFirst());
        System.out.println(l4);
        System.out.println("--------------------------------------------------");
        System.out.println("");

        //16

        System.out.println("retrieve but does not remove, the first element of a linked list.");
        System.out.println(l4.getFirst());
        System.out.println(l4);
        System.out.println("--------------------------------------------------");
        System.out.println("");

        //17

        System.out.println("retrieve but does not remove, the last element of a linked list.");
        System.out.println(l4.getLast());
        System.out.println(l4);
        System.out.println("--------------------------------------------------");
        System.out.println("");

        //18

        System.out.println("check if a particular element exists in a linked list.");
        System.out.println(l4.contains(1));
        System.out.println(l4.contains(11));
        System.out.println("--------------------------------------------------");
        System.out.println("");

        //19

        System.out.println("convert a linked list to array list.");
        List<Integer> l5 = new ArrayList<Integer>(l4);
        System.out.println(l5);
        System.out.println("--------------------------------------------------");
        System.out.println("");

        //20

        System.out.println("compare two linked lists.");
        boolean flag = true;
        for(int i: l4)
        {
            if(!l5.contains(i))
            {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
        System.out.println("--------------------------------------------------");
        System.out.println("");

        //21

        System.out.println("test an linked list is empty or not.");
        System.out.println(list.isEmpty());
        System.out.println(l4.isEmpty());
        System.out.println("--------------------------------------------------");
        System.out.println("");


        //22

        System.out.println("replace an element in a linked list");
        l4.set(0, 11);
        System.out.println(l4);
        System.out.println("--------------------------------------------------");
        System.out.println("");

    }
}
