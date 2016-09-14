import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Pro47123 {
	static String kPad[]={"","","ABC","DEF","GHI","JKL","MNO","PRS","TUV","WXY"};
	public static String check(String str){
		StringBuffer sb=new StringBuffer("");
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch!='-'){
				if(Character.isDigit(ch))
					sb.append(ch);
				else
					for(int j=2;j<kPad.length;j++)
						if(kPad[j].contains(ch+"")){
							sb.append(j);
							break;
						}
			}
			if(sb.length()==3)
				sb.append('-');
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		TreeMap<String,Integer> tm=new TreeMap<>();
		String str;
		for(int i=0;i<N;i++){
			str=check(s.next());
			if(!tm.containsKey(str))
				tm.put(str, 0);
			tm.put(str,tm.get(str)+1);
		}
		Set<String> st=tm.keySet();
		Iterator<String> ia=st.iterator();
		while(ia.hasNext()){
			str=ia.next();
			int n=tm.get(str);
			if(n>=2)
				System.out.println(str+" "+n);
		}
	}
}
