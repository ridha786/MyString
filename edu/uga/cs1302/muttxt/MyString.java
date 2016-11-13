package edu.uga.cs1302.muttxt;
/**                                                                                                                                                                                  
 * @author Ridha Ali                                                                                                                                                                 
 * This class creates a MyString class and it's constructors                                                                                                                         
 * and it's methods.                                                                                                                                                                 
 */
public class MyString extends MyStringIndexOutOfBoundsException {
    private char [] charArray;
    int size;
    int DEFAULT_SIZE =5;
    /**                                                                                                                                                                              
     * This is a constructor                                                                                                                                                         
     */
    public MyString(){
        charArray = new char [5];
        size = DEFAULT_SIZE;
    }
    /**                                                                                                                                                                              
     * This constructor takes in a char in the parameter                                                                                                                             
     * and creates a MyString object with the char.                                                                                                                                  
     * @param ch takes in a char                                                                                                                                                     
     */
    public MyString(char ch){
        charArray = new char[5];
        charArray[0] = ch;
    }
    /**                                                                                                                                                                              
     * This constructor takes an int and creates a MyString                                                                                                                          
     * object of that size.                                                                                                                                                          
     * @param index takes in an int                                                                                                                                                  
     */
    // Extra constructor I made                                                                                                                                                      
    public MyString(int index){
        charArray = new char[index];
    }
    /**                                                                                                                                                                              
     * This constructor takes another MyString object                                                                                                                                
     * and replaces the old one with the new one                                                                                                                                     
     * @param otherMyString takes in another MyString object                                                                                                                         
     *                                                                                                                                                                               
     */
    public MyString(MyString otherMyString){
         if(otherMyString == null){
             throw new IllegalArgumentException();
         }
         charArray = new char [otherMyString.myLength()];
         for (int i= 0; i < otherMyString.myLength(); i++){
             charArray[i] = otherMyString.myCharAt(i);
         }

     }

    /**                                                                                                                                                                              
     * This makes compares to objects for equality.                                                                                                                                  
     * @param o takes in an object                                                                                                                                                   
     * @return this returns a boolean stating true                                                                                                                                   
     * or false if the objects match                                                                                                                                                 
     */
    public boolean equals (Object o){
        boolean equals = true;

        if (o instanceof MyString){
            MyString ex= (MyString) o;
            for (int i = 0; i< ex.myLength(); i++){
                if (ex.myCharAt(i) != this.myCharAt(i)){
                    equals= false;
                    break;

                }
                else
                    equals = true;

            }

        }

        else
            equals = false;
        return equals;

    }
    /**                                                                                                                                                                              
     * This method returns the cahr at a given index                                                                                                                                 
     * @param index takes in an int                                                                                                                                                  
     * @return this returns the char at the index                                                                                                                                    
     *                                                                                                                                                                               
     */

    public char myCharAt(int index){
        if(index < 0 || index > charArray.length){
            throw new MyStringIndexOutOfBoundsException(index);
        }
        return charArray[index];
    }
    /**                                                                                                                                                                              
     * This combines two MyString objects into one                                                                                                                                   
     * MyString object                                                                                                                                                               
     * @param otherMyString takes in another MyString                                                                                                                                
     * @return this returns a newly combined MyString object    
    *                                                                                                                                                                               
     */
    public MyString myConcat(MyString otherMyString){
        MyString finished = this;
        int newSize = this.myLength() + otherMyString.myLength();
        if (otherMyString == null){
            throw new IllegalArgumentException();
        }
        if (otherMyString.myLength() == 0)
            {
                finished = this;
            }

        else {
            //used an extra MyString to fill with both                                                                                                                               
            MyString  finished2 = new MyString(newSize);

            for (int i = 0; i < this.myLength(); i++){
                finished2.setAt(i, this.myCharAt(i) );
            }
            for (int i = this.myLength(); i <newSize; i++)
                {
                    finished2.setAt(i, otherMyString.myCharAt(i));
                }
            finished = finished2;
        }
        return finished;
    }
    /**                                                                                                                                                                              
     * This prints out the MyString Object                                                                                                                                           
     */
    public void myLineDisplay(){
        for(int i=0; i < charArray.length; i++){
            System.out.print(charArray[i]);
        }
        System.out.println();
    }
    /**                                                                                                                                                                              
     * This returns the index of a char in the MyString                                                                                                                              
     * @param ch takes in a char                                                                                                                                                     
     * @return the index of the char                                                                                                                                                 
     */
    public int myIndexOf (char ch){
        int index = -1;
        for(int i=0; i < charArray.length; i++){
            if (charArray[i] == ch){
                index = i;
                break;
            }
        }
        return index;
    }
    /**                                                                                                                                                                              
     * This counts the number of items in the object                                                                                                                                 
     * @return the length of the MyString Object                                                                                                                                     
     */
    public int myLength(){
        int counter =0;
        for (int i = 0; i <charArray.length; i++){
            if(charArray[i]!=(0)){
                counter++;
            }
        }

        return counter;
    }

    /**                                                                                                                                                                              
     * This sets a char at the given index                                                                                                                                           
     * @param index takes in an int                                                                                                                                                  
     * @param ch takes in a char                                                                                                                                                     
     */
    public void setAt(int index, char ch){
        if (index < charArray.length)
            charArray[index] = ch;
        else if (index == charArray.length ){
            char [] tempArray = new char [index + 1];
            for (int i = 0; i < charArray.length; i++){
                tempArray[i] = charArray[i];
            }
            tempArray[index] = ch;
        }

        else
            throw new MyStringIndexOutOfBoundsException(index);

    }
    /**                                                                                                                                                                              
     * This creates a new substring of the MyString object                                                                                                                           
     * from the given indexes                                                                                                                                                        
     * @param low takes in an int                                                                                                                                                    
     * @param high takes in an int                                                                                                                                                   
     * @return returns a new MyString object containing                                                                                                                              
     * the substring                                                                                                                                                                 
     */
    public MyString mySubString(int low, int high){
        MyString sub = new MyString();
        if (low < 0 || low > charArray.length || high < 0 || high > charArray.length){
            throw new MyStringIndexOutOfBoundsException();
        }
        if (low == high){

        }
        else
            for(int i=low, counter = 0; i < high; i++, counter++){
                sub.setAt(counter, charArray[i]);
            }


        return sub;
    }
    /**                                                                                                                                                                              
     * This turns the MyString object into an                                                                                                                                        
     * array of chars                                                                                                                                                                
     * @return returns an array of chars                                                                                                                                             
     */
    public char [] myToCharArray(){
        char [] newArray = charArray;
        return newArray;
    }
}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        