package LogicalProgram;

import java.awt.List;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseStr {
public static void main(String[] args) {
	String input = " kavitha";
    char[] h=input.toCharArray();
    List<character> lic= new LinkedList<>();
    for(char c: h)
   lic.add(c);
    Collections.reverse(lic);
    ListIterator li = lic.listIterator();  
    while(li.hasNext())
   {
    	System.out.print(li.next());}  
  }
}

