//1.  write	a	Java	program  to	create	a	new	array	list,	add	some	colors	(string) and	print	out	the	collection.
//2.  Write	a	Java	program	to	iterate	through	all	elements	in	a	array	list.
//3.  Write	a	Java	program	to	insert	an	element	into	the	array	list	at	the	first position.
//4.  Write	a	Java	program	to	retrieve	an	element	(at	a	specified	index)	from given	array	list.
//5.  Write	a	Java	program	to	update	specific	array	element	by	given	element.
//6.  Write	a	Java	program	to	remove	the	third	element	from	a	array	list.
//7.  Write	a	Java	program	to	search	an	element	in	a	array	list.
//8.  Write	a	Java	program	to	sort	a	given	array	list.
//9.  Write	a	Java	program	to	copy	one	array	list	into	another.
//10. Write	a	Java	program	to	shuffle	elements	in	a	array	list.
//11. Write	a	Java	program	to	reverse	elements	in	a	array	list.
//12. Write	a	Java	program	to	extract	a	portion	of	a	array	list.
//13. Write	a	Java	program	to	compare	two	array	lists.
//14. Write	a	Java	program	of	swap	two	elements	in	an	array	list.
//15. Write	a	Java	program	to	join	two	array	lists.
//16. Write	a	Java	program	to	clone	an	array	list	to	another	array	list.
//17. Write	a	Java	program	to	empty	an	array	list.
//18. Write	a	Java	program	to	test	an	array	list	is	empty	or	not.
//19. Write	a	Java	program	to	trim	the	capacity	of	an	array	list	the	current	list size.
//20. Write	a	Java	program	to	increase	the	size	of	an	array	list.
//21. Write	a	Java	program	to	replace	the	second	element	of	a	ArrayList	with the	specified	element.
//22. Write	a	Java	program	to	print	all	the	elements	of	a	ArrayList	using	the position	of	the	elements



import java.util.ArrayList;
import java.util.Collections;

public class Collections_ArrayList {


    public static void main(String[] args) {
        ArrayList<String> Arr = new ArrayList<>();
//      1

        Arr.add("Red");
        Arr.add("Green");
        Arr.add("Black");
        Arr.add("White");
        System.out.println(Arr);
        System.out.println("--------------------------------------------------");

//      2

        System.out.println("iterating through all elements in a array list");
        for (String i : Arr) {
            System.out.println(i);
        }
        System.out.println("--------------------------------------------------");

//      3

        System.out.println("insert an element into the array list at the first position");
        Arr.add(0, "Pink");
        System.out.println(Arr);
        System.out.println("--------------------------------------------------");

//      4

        System.out.println("retrieve an element (at a specified index) from given array list");
        System.out.println(Arr.get(1));
        System.out.println("--------------------------------------------------");

//      5

        System.out.println("update specific array element by given element");
        Arr.set(0, "Blue");
        System.out.println(Arr);
        System.out.println("--------------------------------------------------");

//      6

        System.out.println("remove the third element from a array list");
        Arr.remove(2);
        System.out.println(Arr);
        System.out.println("--------------------------------------------------");

//      7

        System.out.println("search an element in a array list");
        System.out.println(Arr.contains("Red"));
        System.out.println("--------------------------------------------------");

//      8

        System.out.println("sort a given array list");
        Collections.sort(Arr);
        System.out.println(Arr);
        System.out.println("--------------------------------------------------");

//      9

        System.out.println("copy one array list into another");
        ArrayList<String> Arr2 = new ArrayList<>();
        Arr2.addAll(Arr);
        System.out.println(Arr2);
        System.out.println("--------------------------------------------------");

//      10

        System.out.println("shuffle elements in a array list");
        Collections.shuffle(Arr);
        System.out.println(Arr);
        System.out.println("--------------------------------------------------");

//      11

        System.out.println("reverse elements in a array list");
        Collections.reverse(Arr);
        System.out.println(Arr);
        System.out.println("--------------------------------------------------");

//      12

        System.out.println("extract a portion of a array list");
        ArrayList<String> Arr3 = new ArrayList<>();
        Arr3.addAll(Arr.subList(0, 2));
        System.out.println(Arr3);
        System.out.println("--------------------------------------------------");

//      13

        System.out.println("compare two array lists");
        boolean flag  = true;
        for(String s:Arr)
        {
            if(!Arr2.contains(s))
            {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("Both are equal");
        else
            System.out.println("Both are not equal");
        System.out.println("--------------------------------------------------");

//      14

        System.out.println("swap two elements in an array list");
        String temp1 = Arr.get(0);
        String temp2 = Arr.get(1);
        Arr.set(0, temp2);
        Arr.set(1, temp1);
        System.out.println(Arr);
        System.out.println("--------------------------------------------------");

//      15

        System.out.println("join two array lists");
        Arr2.addAll(Arr);
        System.out.println(Arr2);
        System.out.println("--------------------------------------------------");

//      16

        System.out.println("clone an array list to another array list");
        ArrayList<String> Arr4 = new ArrayList<>();
        Arr4 = (ArrayList<String>) Arr.clone();
        System.out.println(Arr4);
        System.out.println("--------------------------------------------------");

//      17

        System.out.println("empty an array list");
        Arr4.clear();
        System.out.println(Arr4);
        System.out.println("--------------------------------------------------");

//      18

        System.out.println("test an array list is empty or not");
        System.out.println(Arr4.isEmpty());
        System.out.println("--------------------------------------------------");

//      19

        System.out.println("trim the capacity of an array list the current list size");
        Arr.trimToSize();
        System.out.println(Arr);
        System.out.println("--------------------------------------------------");

//      20

        System.out.println("increase the size of an array list");
        Arr.ensureCapacity(10);
        System.out.println(Arr);
        System.out.println("--------------------------------------------------");

    }
}
