
package javaexample7;

public class JavaExample7 {
    
    public static void main(String[] args) {
        
        //casting
        int a=76536;
        byte b= (byte) a;
        long c=(long) a;
        System.out.println("a: "+a+"   "+"b: "+b+"   "+"c: "+c);
        System.out.println();
        
        // characters are between [0 , 65535] unicode
        // 
        char myChar='A';
        int d=(int) myChar;
        System.out.println("A char: "+d+" unicode.");
        System.out.println("68 as character: "+(char) 68);
        System.out.println("Z unicode: "+(int) 'Z');
        
    }
    
}
