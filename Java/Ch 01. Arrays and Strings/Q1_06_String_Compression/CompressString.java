public class CompressString{


	static char[] charArray;
	static int n;
	static String run(String x){

		StringBuilder str = new StringBuilder();

		charArray = x.toCharArray();
		n = charArray.length;
		int j = 0;
		int count = 0;
		for(int i=1; i<n ;i++){
			if(charArray[i-1] != charArray[i]){
				j=i;
				//System.out.println(c[i-1]+":"+ (i - count));
				str.append(charArray[i-1]+""+(i-count));
				count = i;
			}
		}
		//System.out.println(c[n-1]+":"+(n-j));
		str.append(charArray[n-1]+""+(n-j));
		//System.out.println(str);
	

		if(str.length() == (2*x.length())){
			return x;
		}
		else{
			return str.toString();
		}

		
	}

	public static void main(String[] args){
	
		String x = "aaabbccddeeeeaabbd";
		String y = "abcdefghi";
		
		String result1 = run(x);
		String result2 = run(y);
		
		System.out.println(result1);
		System.out.println(result2);
		
	}		
	
}
