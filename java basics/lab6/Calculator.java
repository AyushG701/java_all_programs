package lab6;
// method overloading
/*Conditions for  method overloading 
same function name but 
 1. different data types if no of parameter  are same 
 2. different  number of parameters if data types are same 

 * 
*/

public class Calculator {
    
    public int operation(int a, int b) {
        return  a + b;

    }

    public int operation (int a, int b ,int c){
        return a + b + c;
    }

    public float operation (float a, float b) {
        return a + b;
    }

    
}
