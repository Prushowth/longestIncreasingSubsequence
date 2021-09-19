package longestIncreasingSubsequence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GreaterNumCheck {
	public List<Integer> al1 = new ArrayList<Integer>();
	public List<Integer> al2 = new ArrayList<Integer>();
	public void numberCheck() {
		Array1 a1 = new Array1();
		for (int i=0;i<a1.newArray.length;i++) {
			for(int j=i+1;j<a1.newArray.length;j++) {
				if(a1.newArray[i]<a1.newArray[j]) {
					al1.add(a1.newArray[j]);
				}
				}
			int x= (int)al1.size();
			int y = (int)al2.size();
			if(x>y) {
				al2.clear();
				for (int p=0;i<al1.size();p++) {
					al2.add(al1.get(p));
				}
				al1.clear();
			}else {
				al1.clear();
			}
		}
		for(int i=0;i<al2.size();i++) {
			System.out.println(al2.get(i));
		}
		
	}
	
	public void display() {
		GreaterNumCheck n1 = new GreaterNumCheck();
		for(int i=0;i<n1.al2.size();i++) {
			System.out.println(n1.al2.get(i));
		}
		
	}
}
