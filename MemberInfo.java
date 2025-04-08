public class MemberInfo
{
private String name;
private int gradYear;
private boolean standing;
public MemberInfo(String n, int g, boolean hasGoodStanding)
{ 
    name = n;
    gradYear = g;
    standing = hasGoodStanding;
}

public int getGradYear()
{ return gradYear; }

public boolean inGoodStanding()
{ return standing; }

public String toString()
{
    String s = "\nName: " + name + "\n";
    s += "Year: " + gradYear + "\n";
    return s + "Good Standing: " + standing + "\n";

}
}