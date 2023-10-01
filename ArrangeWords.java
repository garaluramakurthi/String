package Strings;

public class ArrangeWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Html3 java1 css5 python2 c++4";
		String[]sr=s.split(" ");
		String s1[]=new String[sr.length];
		for(int i=0;i<sr.length;i++) {
			int l=sr[i].length()-1;
			char ch=sr[i].charAt(l);
			int k=Integer.parseInt(ch+"");
			s1[k-1]=sr[i].substring(0,1);
		}
		String res=" ";
		for(String r:s1) {
			res=res+r+" ";
		}System.out.println(res);
		

	}

}
