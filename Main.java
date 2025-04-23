import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ClubMembers c = new ClubMembers();
        String[] members = {"MEEP", "MOOP", "BEEP", "Jebediah"};
        c.addMembers(members, 2025);
        System.out.println(c.getList());
        ArrayList<MemberInfo> mems = new ArrayList<>(); 
        mems.add(new MemberInfo("Smith, Jane", 2019, false));
        mems.add(new MemberInfo("Fox, Steve", 2018, true));
        mems.add(new MemberInfo("Xin Michael", 2017, false));
        mems.add(new MemberInfo("Garcia, Maria", 2020, true));
        ClubMembers c2 = new ClubMembers(mems);
        System.out.println(c2.getList());
        System.out.println(c2.removeMembers(2018));
        System.out.println(c2.getList());
    }
}
