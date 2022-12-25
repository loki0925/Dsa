 public static void check(String s)
    {
        int groups=0;
        boolean flag=false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1'&&flag==false)
            {
                groups++;
                flag=true;
            }
            else if(s.charAt(i)=='0')
            {
                flag=false;
            }
        }
        System.out.println(groups);
    }