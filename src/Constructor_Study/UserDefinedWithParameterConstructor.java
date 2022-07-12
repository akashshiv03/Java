package Constructor_Study;

public class UserDefinedWithParameterConstructor
{
  int a;
  int b;
  int c;
public UserDefinedWithParameterConstructor()// user defined without parameter constructor
{
  a=10;
  b=20;
  c=30;
}
public UserDefinedWithParameterConstructor(int x)// user defined with one parameter constructor
{
  a=x;
}
public UserDefinedWithParameterConstructor(int x, int y)//// user defined with two parameter constructor
{
  a=x;
  b=y;
}
public UserDefinedWithParameterConstructor(int x, int y, int z)
{
  a=x;
  b=y;
  c=z;
}
public static void main(String[] args) 
{
   UserDefinedWithParameterConstructor udc= new
   UserDefinedWithParameterConstructor();
   udc.addition();// calling method with zero parameter constructor
   UserDefinedWithParameterConstructor udc1= new
   UserDefinedWithParameterConstructor(1000);
   udc1.addition();
   UserDefinedWithParameterConstructor udc2= new
   UserDefinedWithParameterConstructor(80, 90);
   udc2.addition();
   UserDefinedWithParameterConstructor udc3= new
   UserDefinedWithParameterConstructor(20, 30, 40);
   udc3.addition();
}
public void addition()// method without parameter
{
  int sum=a+b+c;
  System.out.println("addition is "+sum);
}
}
