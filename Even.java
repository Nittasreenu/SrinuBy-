/*class Student
{
public static void main(String[] args)
{
System.out.println("hello all");
}
}*/


class Sales
{
public static void main(String[] args)
{
	int c_p=20000,s_p=20000;
	int profit=s_p-c_p;
	int loss =c_p-s_p;
	
	if(c_p<s_p)
	System.out.println("profit :"+profit);
	else if(c_p==s_p) 
	System.out.println("no loss and no profit");
	else
	System.out.println("loss :"+loss);
}
}

class Even
{
public static void main(String[] args)
{
	int num=7;
	if(num%2==0)
	System.out.println("even : "+num);
	else 
	System.out.println("odd : "+num);
}
}