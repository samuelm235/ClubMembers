
import java.util.ArrayList;
public class ClubMembers
{
private ArrayList<MemberInfo> memberList;
public ClubMembers()
{
    memberList = new ArrayList<MemberInfo>();
}
public ClubMembers(ArrayList<MemberInfo> m)
{
    memberList = m;
}

public void addMembers(String[] names, int gradYear)
{
    for(String n : names)
    {
        memberList.add(new MemberInfo(n, gradYear, true));
    } 
}

public ArrayList<MemberInfo> getList()
{
    return memberList;
}
public ArrayList<MemberInfo> removeMembers(int year)
{
    ArrayList<MemberInfo> goodBoys = new ArrayList<MemberInfo>();
    for(int i = 0; i < memberList.size(); i ++)
    {
    
        if((memberList.get(i).getGradYear() <= year)) 
        {
            if((memberList.get(i)).inGoodStanding()) goodBoys.add(memberList.get(i));
            memberList.remove(i);
            i--;
        }
    }
    
    return goodBoys;
}

}