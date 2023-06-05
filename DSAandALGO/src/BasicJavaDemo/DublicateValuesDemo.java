package BasicJavaDemo;

public class DublicateValuesDemo {

	public static void main(String[] args) {
		String s[]= {"salim","nadeem","hasan","akash","salim","akash","salim"};
		int count=0;
		for(int i=0; i<s.length; i++) {
			for(int j=i+1;j<s.length; j++) {
				if(s[j]==s[i]) {
					count++;
				break;}
				
			}
			
		}
		System.out.println("No of Dublicate Values are= "+count);
		
	}

}
