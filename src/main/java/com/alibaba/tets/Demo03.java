package com.alibaba.tets;

import java.util.Arrays;
import java.util.Comparator;

import com.alibaba.interfaces.Person;

/**
 * @author MSI
 * @date 2017/07/31
 */
public class Demo03 {

    public static void main(String[] args) {
        /*List<Person> list = new ArrayList<>();
        list.add(new Person("1123"));
        list.add(new Person("2"));
        list.add(new Person("112"));
        list.add(new Person("3333"));
        list.add(new Person("4444"));*/

        Person[] array = new Person[]{new Person("1123"),new Person("2"),new Person("112"),new Person("3333"),new Person("4444")};
        System.out.println(Arrays.toString(array));

        Arrays.sort(array, Comparator.comparing(Person :: getName));

        System.out.println(Arrays.toString(array));

        Arrays.sort(array,Comparator.comparing(Person::getName,(s,t)->Integer.compare(s.length(),t.length())));

        System.out.println(Arrays.toString(array));
        Arrays.sort(array,Comparator.comparing(Person::getName).thenComparing(Person::getAge));
   }
}
