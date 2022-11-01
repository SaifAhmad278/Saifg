package project2;

public class Between_Dollar {
	public static void main(String[]args)
	{
		String str="Saif";
		String str_1="";
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length-1;i++)
		{
			str_1=str_1+arr[i]+"$";
		}
		System.out.println(str_1+ arr[arr.length-1]);
		}

}
