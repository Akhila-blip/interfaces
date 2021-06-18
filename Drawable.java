interface Drawable
{
int i=10;
void draw();
}

class Rectangle implements Drawable
{
public void draw()
{
System.out.println("drawing rectangle");
}
}
class Circle implements Drawable
{
public void draw()
{
System.out.println("drawing circle");
}
}
class TestInterface1
{
public static void main(String args[])
{
Drawable d=new Circle();
d.draw();

}
}