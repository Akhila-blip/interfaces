interface Banks
{
float rateOfInterest();
}
class SBI implements Banks
{
public float rateOfInterest()
{
return 9.15f;
}
}
class PNB implements Banks
{
public float rateOfInterest()
{
return 9.7f;
}
}
class TestInterface2
{
public static void main(String args[])
{
Banks b=new SBI();
System.out.println("ROI:"+b.rateOfInterest());
}
}