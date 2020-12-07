package test.java.com.company.customlinkedlist.linkedlist;

import com.company.linkedlist.LinkedList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class LinkedListTest {

    @Test
    public void constructorTestA() {
        // Given
        LinkedList<String> list = new LinkedList<>();

        // When
        int expected = 0;
        int actual = list.size();

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void constructorTestB() {
        // Given
        LinkedList<String> list = new LinkedList<>("Peter", "Kevin", "Angelino");

        // When
        int expected = 3;
        int actual = list.size();

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void constructorTestC() {
        // Given
        String[] names = { "Peter", "Kevin", "Angelino", "Jackson" };
        LinkedList<String> list = new LinkedList<>(names);

        // When
        int expected = 4;
        int actual = list.size();

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void addTest() {
        // Given
        LinkedList<String> list = new LinkedList<>();
        list.add("firstEle");
        list.add("secondEle");

        // When
        int expected = 2;
        int actual = list.size();

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void removeTest() {
        // Given
        LinkedList<String> list = new LinkedList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        list.remove(1);

        // When
        String expected = "[first, third, fourth]";
        String actual = list.toString();

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    // Get first element
    public void getTestA() {
        // Given
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // When
        int expected = 0;
        int actual = list.get(0);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    // Get middle element
    public void getTestB() {
        // Given
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // When
        int expected = 20;
        int actual = list.get(2);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    // Get last element
    public void getTestC() {
        // Given
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // When
        int expected = 40;
        int actual = list.get(4);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    // Get first element
    public void indexOfA() {
        // Given
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // When
        int expected = 0;
        int actual = list.indexOf(0);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    // Get middle element
    public void indexOfB() {
        // Given
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // When
        int expected = 2;
        int actual = list.indexOf(20);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    // Get last element
    public void indexOfC() {
        // Given
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // When
        int expected = 4;
        int actual = list.indexOf(40);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void containsItemTestA() {
        // Given
        LinkedList<String> list = new LinkedList<>();
        list.add("first");
        list.add("two");
        list.add("third");
        list.add("fourth");
        list.add("fifth");

        // When
        boolean actual = list.contains("two");

        // Then
        Assertions.assertTrue(actual);
    }

    @Test
    public void containsItemTestB() {
        // Given
        LinkedList<String> list = new LinkedList<>();
        list.add("first");
        list.add("two");
        list.add("third");
        list.add("fourth");
        list.add("fifth");

        // When
        boolean actual = list.contains("one hundred");

        // Then
        Assertions.assertFalse(actual);
    }









    //    @Test
//    public void constructorTest() {
//        // Given
//        LinkedList<String>list = new LinkedList<>();
//
//        // When
//
//        // Then
//          Assertions.assertEquals(expected, actual);
//    }
}
