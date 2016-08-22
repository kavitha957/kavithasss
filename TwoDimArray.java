package program1;

public class TwoDimArray {
public static void main(String[] args) {
	String str="thepotcallingkettleblack";
	int len=6;
	int val=str.length()/len;
	char c[][]=new char[val][len];
	char s[]=new char[str.length()];
	for(int i=0;i<str.length();i++)
	{
		s[i]=str.charAt(i);
	}int temp=0;
	for(int i=0;i<val;i++)
	{
		
		for(int j=0;j<len;j++)
		{
			c[i][j]=s[temp];
			temp++;
			System.out.print(c[i][j]);
		}
		System.out.println();
	}
}
}
