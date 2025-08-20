package electricity;

public class power {
	public static void main(String[]args) {
	int a=450;
	if(a<=50)
	{
		System.out.println(a*1);
	}
	else if(a <=100)
	{
		System.out.println(50*1 +(a-50)*2);
	}
	else if(a <=200)
	{
		System.out.println(50*1+50*2+(a-100)*3);
	}
	else
	{
		System.out.println(50*1+50*2+50*3+(a-200)*4);
	}
}
}
