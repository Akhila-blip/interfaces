interface Drawable3
{
void draw();
default void msg()
{
System.out.println("default method");
}
}
class Rectangle implements Drawable3
{
public void draw()
{
System.out.println("drawing Rectangle");
}
}
class TestInterfaceDefault
{
public static void main(String args[])
{
Drawable3 =new Rectangle();
d.draw();
d.msg();
}
}