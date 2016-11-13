package edu.uga.cs1302.test;
import edu.uga.cs1302.muttxt.*;
import static org.junit.Assert.*;
import org.junit.Test;
import java.lang.IndexOutOfBoundsException;
/**                                                                                                                                                                                  
 *                                                                                                                                                                                   
 * @author Ridha Ali                                                                                                                                                                 
 *                                                                                                                                                                                   
 */
public class MyStringTest extends MyStringIndexOutOfBoundsException {

    @Test
        public void testMyString() {
        MyString test = new MyString();
        boolean result = test instanceof MyString;
        assertEquals(true, result);

    }
    @Test
        public void testmyLength(){
        MyString test = new MyString();
        int result = test.myLength();
        assertEquals(0, result);

    }
    @Test
        public void testmyToCharArray(){
        MyString test = new MyString();
        char [] result = test.myToCharArray();
        char[] array = new char [5];
        boolean answer = true;
        for (int i=0; i < result.length; i++){
            if(result[i]!= array[i]){
                answer = false;
                break;
            }
        }
        assertEquals(true, answer);
    }
    @Test
    public void testSetAt(){
    MyString test = new MyString();
    test.setAt(0, 'a');
    MyString result = new MyString('a');
    assertEquals(test, result);
}

    @Test
        public void testSetAt2(){
        MyString test = new MyString();
        test.setAt(3, 'b');
        MyString result = new MyString();
        result.setAt(3, 'b');
        assertEquals(test, result);
    }
    @Test
        public void testSetAt3(){
        MyString test = new MyString();
        test.setAt(4, 'c');
        MyString result = new MyString();
        result.setAt(4, 'c');
        assertEquals(test, result);
    }

    @Test
        public void testEquals(){
        int test = 5;
        MyString result = new MyString();
        boolean answer = result.equals(test);
        assertEquals(false, answer);

    }
    @Test
        public void testEquals2(){
        MyString test1 = new MyString('a');
        MyString test2 = new MyString('b');
        boolean answer = test1.equals(test2);
        assertEquals(false, answer);
    }
    @Test
        public void testEqual3(){
        MyString test1 = new MyString('a');
        MyString test2 = new MyString('a');
        boolean answer = test1.equals(test2);
        assertEquals(true, answer);
    }
    @Test
        public void testMyCharAt(){
        MyString test1 = new MyString('a');
        char result = test1.myCharAt(0);
        assertEquals('a', result);
    }
    @Test
        public void testMySubstring(){
        MyString test1 = new MyString('a');
        test1.setAt(1, 'b');
        test1.setAt(2, 'c');
        test1.setAt(3, 'd');
        MyString result = test1.mySubString(1, 3);
        MyString result2 = new MyString('b');
        result2.setAt(1, 'c');
        assertEquals(result2, result);
    }
    @Test
        public void testMyConcat(){
        MyString test1 = new MyString('a');
        MyString test2 = new MyString('b');
        MyString result = test1.myConcat(test2);
        MyString answer = new MyString('a');
        answer.setAt(1, 'b');
        assertEquals(answer, result);
    }
    }

        
