//1. Write	a	Java	program	to	create	a	new	tree	set,	add	some colors	(string)	and print	out	the	tree	set.
//2. Write	a	Java	program	to	iterate	through	all	elements	in	a	tree	set.
//3. Write	a	Java	program	to	add	all	the	elements	of	a	specified	tree	set	to another	tree	set.
//4. Write	a	Java	program	to	create	a	reverse	order	view	of	the	elements contained	in	a	given	tree	set.
//5. Write	a	Java	program	to	get	the	first	and	last	elements	in	a	tree	set.
//6. Write	a	Java	program	to	clone	a	tree	set	list	to	another	tree	set.
//7. Write	a	Java	program	to	get	the	number	of	elements	in	a	tree	set.
//8. Write	a	Java	program	to	compare	two	tree	sets.
//9. Write	a	Java	program	to	find	the	numbers	less	than	7	in	a	tree	set.
//10. Write	a	Java	program	to	get	the	element	in	a	tree	set	which	is	greater	than
//or	equal	to	the	given	element.
//11. Write	a	Java	program	to	get	the	element	in	a	tree	set	which	is	less	than	or
//equal	to	the	given	element.
//12. Write	a	Java	program	to	get	the	element	in	a	tree	set	which	is	strictly
//greater	than	or	equal	to	the	given	element.
//13. Write	a	Java	program	to	get	an	element	in	a	tree	set	which	is	strictly	less
//than	the	given	element.
//14. Write	a	Java	program	to	retrieve	and	remove	the	first	element	of	a	tree
//set.
//15. Write	a	Java	program	to	retrieve	and	remove	the	last	element	of	a	tree	set.
//16. Write	a	Java	program	to	remove	a	given	element	from	a	tree	set.

import com.sun.source.tree.Tree;

import java.util.Iterator;
import java.util.TreeSet;

public class Collections_TreeSet {
    public static void main(String[] args) {
//        1
        TreeSet<Integer> Set = new TreeSet<>();
        Set.add(2);
        Set.add(1);
        Set.add(2);
        Set.add(4);
        Set.add(2);
        System.out.println(Set);
        System.out.println("--------------------------------------------------");

//        2
        System.out.println("iterate through all elements in a tree set.");
        for (Integer integer : Set) {
            System.out.println(integer);
        }
        System.out.println("--------------------------------------------------");

//        3
        System.out.println("add all the elements of a specified tree set to another tree set.");
        TreeSet<Integer> Set2 = new TreeSet<>();
        Set2.add(5);
        Set2.add(6);
        Set2.add(7);
        Set2.add(8);
        Set2.add(9);
        Set.addAll(Set2);
        System.out.println(Set);
        System.out.println("--------------------------------------------------");

//        4
        System.out.println("create a reverse order view of the elements contained in a given tree set.");
        Iterator<Integer> it = Set.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("--------------------------------------------------");

//        5
        System.out.println("get the first and last elements in a tree set.");
        System.out.println(Set.first());
        System.out.println(Set.last());
        System.out.println("--------------------------------------------------");

//        6
        System.out.println("clone a tree set list to another tree set.");
        TreeSet<Integer> Set3 = (TreeSet<Integer>) Set.clone();
        System.out.println(Set3);
        System.out.println("--------------------------------------------------");

//        7
        System.out.println("get the number of elements in a tree set.");
        System.out.println(Set.size());
        System.out.println("--------------------------------------------------");

//        8
        System.out.println("compare two tree sets.");
        boolean flag = true;
        for(int i:Set2){
            if(!Set.contains(i)){
                flag = false;
                break;
            }
        }
        System.out.println(flag);
        System.out.println("--------------------------------------------------");

//        9
        System.out.println("find the numbers less than 7 in a tree set.");
        System.out.println(Set.headSet(7));
        System.out.println("--------------------------------------------------");

//        10
        System.out.println("get the element in a tree set which is greater than or equal to the given element.");
        System.out.println(Set.ceiling(7));
        System.out.println("--------------------------------------------------");

//        11
        System.out.println("get the element in a tree set which is less than or equal to the given element.");
        System.out.println(Set.floor(7));
        System.out.println("--------------------------------------------------");

//        12
        System.out.println("get the element in a tree set which is strictly greater than or equal to the given element.");
        System.out.println(Set.higher(7));
        System.out.println("--------------------------------------------------");

//        13
        System.out.println("get an element in a tree set which is strictly less than the given element.");
        System.out.println(Set.lower(7));
        System.out.println("--------------------------------------------------");

//        14
        System.out.println("retrieve and remove the first element of a tree set.");
        System.out.println(Set.pollFirst());
        System.out.println("--------------------------------------------------");

//        15
        System.out.println("retrieve and remove the last element of a tree set.");
        System.out.println(Set.pollLast());
        System.out.println("--------------------------------------------------");

//        16
        System.out.println("remove a given element from a tree set.");
        Set.remove(7);
        System.out.println(Set);
        System.out.println("--------------------------------------------------");


    }
}
