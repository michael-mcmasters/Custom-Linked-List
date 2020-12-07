package test.java.com.company.customlinkedlist.linkedlist;

import com.company.linkedlist.LinkedList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class LinkedListTest {

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
}
