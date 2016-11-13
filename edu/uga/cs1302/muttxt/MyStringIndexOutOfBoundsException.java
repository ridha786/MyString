package edu.uga.cs1302.muttxt;
/**                                                                                                                                                                                  
 *                                                                                                                                                                                   
 * @author Ridha Ali                                                                                                                                                                 
 * This class extends IndexOutOfBoundsException class to create                                                                                                                      
 * a class that helps catch exceptions in the MyString class                                                                                                                         
 */
public class MyStringIndexOutOfBoundsException extends IndexOutOfBoundsException {
    /**                                                                                                                                                                              
     * This is a constructor for index out of bounds                                                                                                                                 
     */
    public MyStringIndexOutOfBoundsException(){
        super();
    }

    /**                                                                                                                                                                              
     * Another constructor that takes in an error message                                                                                                                            
     * @param eerMsg takes in a string                                                                                                                                               
     */
    public MyStringIndexOutOfBoundsException(String eerMsg){
        super(eerMsg);
    }
    /**                                                                                                                                                                              
     * Another constructor that takes in an int                                                                                                                                      
     * @param index takes in an int                                                                                                                                                  
     */
    public MyStringIndexOutOfBoundsException(int index){
        super("MyString index out of range: " + index);
    }

}
