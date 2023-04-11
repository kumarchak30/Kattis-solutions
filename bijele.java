import java.util.*;
import java.io.*;

public class bijele
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int king = scan.nextInt();
        int queen = scan.nextInt();
        int rooks = scan.nextInt();
        int bishops = scan.nextInt();
        int knights = scan.nextInt();
        int pawns = scan.nextInt();
        
        if(king < 1)
        { 
            System.out.print(1-king + " "); 
        }
        else if(king > 1)
        {
            System.out.print( 1-king+ " ");
        }
        else { 
            System.out.print( 0+ " ");
        }
        
        
        if(queen < 1){
            System.out.print( 1-queen+ " "); 
            
        }
        else if(queen > 1){
            System.out.print( 1-queen+ " ");
            
        }
        else { 
            System.out.print( 0+ " "); 
            
        }
        
        if(rooks < 2){
            System.out.print( 2-rooks+ " ");
        }
        else if(rooks > 1){
            System.out.print( 2-rooks+ " ");
            
        }
        else { 
            System.out.print( 0+ " "); 
            
        }
        
        if(bishops < 2){
            System.out.print( 2-bishops+ " ");
        }
        else if(bishops > 1){
            System.out.print( 2-bishops+ " ");
            
        }
        else { 
            System.out.print( 0+ " "); 
            
        }
        
        if(knights < 2){ 
            System.out.print( 2-knights+ " "); 
            
        }
        else if(knights > 1){ 
            System.out.print( 2-knights+ " ");
            
        }
        else { 
            System.out.print( 0+ " "); 
            
        }
        
        if(pawns < 8){ 
            System.out.print( 8-pawns+ " "); 
            
        }
        else if(pawns > 1){
            System.out.print( 8-pawns+ " ");
            
        }
        else { 
            System.out.print( 0+ " "); 
            
        }
    }
    
    
}