class p6
{
public static void main(String[]args)
{

if(args.length !=3)
{
System.out.println("please enter marks for exactly for three sub");
return;
}

int marks1=Integer.parseInt(args[0]);
int marks2=Integer.parseInt(args[1]);
int marks3=Integer.parseInt(args[2]);

int total=marks1+marks2+marks3;
double percentage=(total/3.0);

System.out.println("total is: "+total);
System.out.println("percentage is: "+percentage+ "%");

if(percentage>=60)
{
System.out.println("A grad");
}
else if (percentage<60 && percentage>=50)
{
System.out.println("B grad");
}
else if (percentage<50 && percentage>=40)
{
System.out.println("C grad");
}
else
{
System.out.println("F grad");
}

}

}

    Output

C:\Prit\WAD=4\Practical 1>java p6 58 90 90
total is: 238
percentage is: 79.33333333333333%
A grad