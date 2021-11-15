import java.util.*;



public class q2{

    public static void main(String []args){
       int x1=0;
       int x2=0;
       int x3=0;
       int x4=0;
       int x5=0;
       int x6=0;
       int x7=0;
       int x8=0;
       int[] memory=new int[100];    
       x1=6;
       x2=5;
       x3=4; // and 
       x8=0;
       memory[x8]=x3;
       x4=7; //or
       x8=1;
       memory[x8]=x4;
       x5=x3*x4;
       x8=2;
       //ABC
       memory[x8]=x5;
       x6=x5;
       x8=1;
       x7=memory[x8];
       x8=x6+x7;

       System.out.println(x1);
       System.out.println(x2);
       System.out.println(x3);
       System.out.println(x4);

       System.out.println(x5);
       System.out.println(x6);
       System.out.println(x7);
       System.out.println(x8);




       for(int i=0;i<3;i++){
           System.out.print("memory: ");
           System.out.println(memory[i]);
       }



        }
}
/*

li $r1, 6 

li $r2, 5 

and $r3, $r1, $r2 

li $r8, 0 

store $r3, $r8 

or $r4, $r1, $r2 

li $r8, 1 

store $r4, $r8 

mult $r5, $r3, $r4 

li $r8, 2 
ABC
store $r5, $r8 

move $r6, $r5 

li $r8, 1 

load $r7, $r8 

add $r8, $r6, $r7 

halt 
*/