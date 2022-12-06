package IntegerList;

import Exceptions.EmptyArgumentException;
import Exceptions.OutOfBondException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListTest {
    private IntegerList integerList;
    private static Integer first = 1;
    private static Integer second = 2;
    private static Integer test = 3;

    @BeforeEach
    void setUp() {
        {
            integerList = new IntegerList(3);
            integerList.add(first);
            integerList.add(second);
        }

    }


    @Test
    void addIntegerToArray() {
        integerList.add(test);
        assertEquals(test,integerList.get(2));
    }
    @Test
    void addIntegerToArrayException() {
        assertThrows(OutOfBondException.class,()-> integerList.get(-1));
        assertThrows(EmptyArgumentException.class, ()->integerList.add(null));
    }

    @Test
    void addIntegerToArrayIndex() {
        integerList.add(0, test);
        assertEquals(test, integerList.get(0));
        assertEquals(first, integerList.get(1));
        assertEquals(second, integerList.get(2));
        assertEquals(3, integerList.size());
    }

    @Test
    void setIntegerToArray() {
        integerList.set(0, test);
        assertEquals(test, integerList.get(0));
    }

    @Test
    void arrayRemove() {
        integerList.remove(first);
        assertEquals(1, integerList.size());
        assertEquals(second, integerList.get(0));
    }

    @Test
    void arrayRemoveIndex() {
        integerList.remove(0);
        assertEquals(1, integerList.size());
        assertEquals(second, integerList.get(0));
    }

    @Test
    void arrayContains() {
        integerList.add(first);
        assertTrue(integerList.contains(first));
    }

    @Test
    void arrayIndexOf() {
        assertEquals(0, integerList.indexOf(first));
    }

    @Test
    void arrayLastIndexOf() {
        integerList.add(first);
        assertEquals(2, integerList.lastIndexOf(first));
    }

    @Test
    void arrayGet() {
        assertEquals(first, integerList.get(0));
    }

    @Test
    void arrayTestEquals() {
        IntegerList check = new IntegerList(2);
        check.add(first);
        check.add(second);
        assertTrue(integerList.equals(check));
    }


    @Test
    void size() {

        assertEquals(2, integerList.size());
    }

    @Test
    void arrayIsEmpty() {
        integerList.clear();
        assertTrue(integerList.isEmpty());
    }

    @Test
    void arrayClear() {
        integerList.clear();
        assertEquals(0, integerList.size());
    }


    @Test
    void arrayBinarySearch() {
        assertEquals(integerList.binarySearch(new Integer[]{1,3,2},3), integerList.binarySearch(new Integer[]{1,2,3}, 2));
    }
}