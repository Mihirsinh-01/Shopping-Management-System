package item;

public class Cls
{
public Cls()
{
try
{
new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
}
catch(Exception E)
{
System.out.println(E);
}


}
}