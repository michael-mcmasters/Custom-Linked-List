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
