//1. Write	a	Java	program	to	append	the	specified	element	to	the	end	of	a	hash  set.
//2. Write	a	Java	program	to	iterate	through	all	elements	in	a	hash	list.
//3. Write	a	Java	program	to	get	the	number	of	elements	in	a	hash	set.
//4. Write	a	Java	program	to	empty	an	hash	set.
//5. Write	a	Java	program	to	test	a	hash	set	is	empty	or	not.
//6. Write	a	Java	program	to	clone	a	hash	set	to	another	hash	set.
//7. Write	a	Java	program	to	convert	a	hash	set	to	an	array.
//8. Write	a	Java	program	to	convert	a	hash	set	to	a	tree	set.
//9. Write	a	Java	program	to	convert	a	hash	set	to	a	List/ArrayList.
//10. Write	a	Java	program	to	compare	two	hash	set.
//11. Write	a	Java	program	to	compare	two	sets	and	retain	elements	which	are same	on	both	sets.
//12. Write	a	Java	program	to	remove	all	of	the	elements	from	a	hash	set.

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collections_HashSet {
    public static void main(String[] args) {
//        1

        HashSet<String> Set = new HashSet<>();
        Set.add("Red");
        Set.add("Green");
        Set.add("Black");
        Set.add("White");
        Set.add("Pink");
        Set.add("Yellow");
        System.out.println(Set);
        System.out.println("--------------------------------------------------");

//        2

        for (String i : Set) {
            System.out.println(i);
        }
        System.out.println("--------------------------------------------------");

//        3

        System.out.println(Set.size());
        System.out.println("--------------------------------------------------");

//        4

        Set.clear();
        System.out.println(Set);
        System.out.println("--------------------------------------------------");

//        5

        System.out.println(Set.isEmpty());
        System.out.println("--------------------------------------------------");

//        6

        HashSet<String> Set2 = new HashSet<>();
        Set2.add("Red");
        Set2.add("Green");
        Set2.add("Black");
        Set2.add("White");
        Set2.add("Pink");
        Set2.add("Yellow");
        Set = (HashSet<String>) Set2.clone();
        System.out.println(Set);
        System.out.println("--------------------------------------------------");

//        7

        System.out.println("convert a hash set to an array.");
        Object[] arr = Set.toArray();
        for (Object i : arr) {
            System.out.println(i);
        }
        System.out.println("--------------------------------------------------");

//        8

        System.out.println("convert a hash set to a tree set.");
        java.util.Set<String> Set3 = new TreeSet<String>(Set2);
        System.out.println(Set3);
        System.out.println("--------------------------------------------------");

//        9

        System.out.println("convert a hash set to a List/ArrayList.");
        java.util.List<String> list = new java.util.ArrayList<String>(Set2);
        System.out.println(list);
        System.out.println("--------------------------------------------------");

//        10

        System.out.println("compare two hash set.");
        HashSet<String> Set4 = new HashSet<>();
        Set4.add("Red");
        Set4.add("Green");
        Set4.add("Black");
        Set4.add("Pink");
        Set4.add("Yellow");
        Set4.add("Orange");

        boolean flag = true;
        for(String s: Set2) {
            if (!Set4.contains(s)) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
        System.out.println("--------------------------------------------------");

//        11

        System.out.println("compare two sets and retain elements which are same on both sets.");
        Set2.retainAll(Set4);
        System.out.println(Set2);
        System.out.println("--------------------------------------------------");

    }
}
