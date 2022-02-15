import java.util.*;
class SearchOccurenceCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		System.out.println("Enter the Character of which you want to Check Occurence");
		char ch=sc.next().charAt(0);
		char[] ch1=s.toCharArray();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(ch==ch1[i]) {
				count++;
			}
		}
		System.out.println("Count of "+ch+" is: "+count);
	}
}
