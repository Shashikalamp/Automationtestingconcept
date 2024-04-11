package Seleniumjavapracticecode;
import java.util.HashSet;

public class ExtractvowelfmString {

	public static void main(String[] args) {
		String s = "BangAlore";
	HashSet<Character>set= new HashSet<>();
             set.add('a');
			set.add('e');
			set.add('i');
			set.add('o');
			set.add('u');
			for(int i=0;i<s.length();i++) {
				char ch = s.charAt(i);
			if(set.contains(Character.toLowerCase(ch))) {
				System.out.println(ch);
		}
			
			}	
		}
	}
		
	