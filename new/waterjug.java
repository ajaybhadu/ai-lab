import java.util.Scanner;
public class waterjug
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the jugs");
int a = sc.nextInt();
int b = sc.nextInt();
int i,jug1,jug2,j1 = 0,j2 = 0;
boolean flag = false;
int state[] = new int[2];
System.out.println("Enter the states of the jugs");
state[0] = sc.nextInt();
state[1] = sc.nextInt();
if(a > b)
{
jug1 = a;
jug2 = b;
}
else
{
jug1 = b;
jug2 = a;
}
for(i = 0;i < 50;i++)
{
if(j1 == state[0] && j2 == state[1])
{
flag = true;
break;
}
else
{
System.out.println(j1 + " " + j2);
if(j1 == 0 && j2 < jug2)
{
j1 = jug1;
}
else if(j2 == jug2)
{
j2 = 0;
}
else if(j1 == jug1)
{
j1 = j1 - jug2 + j2;
j2 = jug2;
}
else
{
j2 = j1;
j1 = 0;
}
}
}
for(i = 0;i < 50;i++)
{
if(j1 == state[0] && j2 == state[1])
{
flag = true;
break;
}
else
{
System.out.println(j1 + " " + j2);
if(j1 == 0 && j2 < jug2)
{
j1 = jug1;
}
else if(j2 == jug2)
{
j2 = 0;
}
else if(j1 == jug1)
{
j1 = j1 - jug2 + j2;
j2 = jug2;
}
else
{
j2 = j1;
j1 = 0;
}
}
}
if(flag == true)
{
System.out.println(j1 + " " + j2);
System.out.println("Final Stage Reached");
}
else
System.out.println("Final Stage Not Possible");
sc.close();
}
}
