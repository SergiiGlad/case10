import java.io.IOException;
import java.util.Scanner;

public class case10 {

    public static String m_state( int c ){
    String state = "";
    
    switch ( c ) {
    case 1:state = "to North";break; 
    case 2:state = "to East";break; 
    case 3:state = "to South";break; 
    case 4:state = "to West";break;
    }
    return state; 
    
    }
    

    public static void main( String[] argv ) throws IOException {
    
       
    int c = 0;
    
    Scanner input = new Scanner( System.in );
    
    System.out.println(" Input default place");
    System.out.println(" 1 - North");
    System.out.println(" 2 - East");
    System.out.println(" 3 - South");
    System.out.println(" 4 - West");
    
    c = input.nextInt();
    
    String state = m_state( c );
    
    System.out.println("You are satying "+state);
    
    System.out.println("Control robot");
    System.out.println("0 - go straight");
    System.out.println("1 - turn left");
    System.out.println("-1 - turn right");   
 
    System.out.println("Pls input direction");
 
    int n;
    do {
    
        n = input.nextInt();
        c = c + n;
        c = c % 4; 
        c = c == 0 ? 4 : c;
        
        state = m_state( c );
        
        System.out.println( "Your direction "+state); 
                
        }
 
    while ( true );
    
    
    }

}
