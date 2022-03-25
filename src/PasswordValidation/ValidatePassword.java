package PasswordValidation;

public class ValidatePassword {
   
	public String[] checkpasswords(String[] passwords, String checkString)
	{
		char c=checkString.charAt(0);
		int ups=Character.getNumericValue(c);
		char l=checkString.charAt(checkString.length()-1);
		int sum=Character.getNumericValue(l);
		String chec=checkString.substring(checkString.length()-4, checkString.length()-1);
		StringBuffer sb=new StringBuffer(chec);
		sb.reverse();
		String lastpast=sb.toString();
		String str="",result="";
		for(int i=0;i<passwords.length;i++)
		{
			
			int upper=0;int incount=0;
			for(int j=0;j<passwords[i].length()-1;j++) {
				char ch=passwords[i].charAt(j);
				if(ch>='A'&&ch<='Z')
				{
					upper++;
				}
				if(ch>='0'&&ch<='9')
				{
					incount+=Character.getNumericValue(ch);
				}
				if(upper==ups&&incount==sum) {
					str=passwords[i];
					result=str;
				}
			}
			upper=0;
			incount=0;
		}
		System.out.println(result);
		return result.split("");
	}

public static void main(String args[]) {
	String[] passwords= {"P@sswORD1", "20passWORD20", "PASS6word"};
	String checkString="4dro6";
	ValidatePassword vp=new ValidatePassword();
	vp.checkpasswords(passwords, checkString);
}
}
;