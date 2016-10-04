import java.util.Scanner;
import java.io.*;
public class medi{
public static void main(String args[])throws IOException{
Scanner scanner = new Scanner(System.in);
System.out.println("wat is ur disease");
String disease = scanner.nextLine();
String fever,cough,headche,cold;
if (disease.contains("fever") )
{
System.out.println(" daily 1 crocin\n take rest\n");
}
else if(disease.contains("cough"))
{
System.out.println("drink chericof at regular intervals\n reduce ur stress\n");
}
else if (disease.contains("headache"))
{
System.out.println("apply iodex cream\n sleep for 1 hour\n");
}
else if(disease.contains("cold"))
{
System.out.println("daily 1 sinarest tab at nyt\n dont go out in cool breeze\n");
}
}}
