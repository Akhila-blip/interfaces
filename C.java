interface A{

public void m1(int i);


}


interface B
{

public void m1();

}

class C implements A,B

{
 public void m1()
{
 System.out.println("I am sriram");
 }
public void m1(int i)
{
System.out.println("I am sriram");
 }
 public static void main(String[] arg)
{
	 
 C c=new C();
 c.m1();
 c.m2();
	  
 A a=new C();
 a.m1();
	  
 C c1=(C)a;
 c1.m1();
 c1.m2();
	 
 B b=new C();
	 
 b.m2();
 C c2=(C)a;
 c2.m2();
 c2.m1();
}
}

	 