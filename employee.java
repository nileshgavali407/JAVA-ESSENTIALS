class employee
{
  String name;
  int age;
  String city;
 employee(String n, int a, String c)
{
   name=n;
   age=a;
   city=c;
}
void display()
{
  System.out.println("The Name is "+name);
  System.out.println("The Age is "+age);
  System.out.println("The City is "+city);
}
public static void main(String args[])
{
  employee e = new employee("Nilesh",25,"Nashik");
  employee e1 = new employee("Akash",27,"Mumbai");
  e.display();
  e1.display();
}
}
