class comp implements Comparator<List<Integer>>{
    // You have to write the comparator as per the logic given in the problem statement
  	// The entire code has already been written in the backend
  	@Override
  	public int compare(List<Integer> a ,List<Integer> b)
  	{
  	    int res=0;
  	    
  	    if(a.equals(a))
  	    {
  	        res=0;
  	    }
  	    else
  	    {
  	        int i=0;
  	        boolean flag=true;
  	        while(i<a.size()&&i<b.size())
  	        {
  	           if(a.get(i)>b.get(i))
  	           {
  	               res=1;
  	               flag=false;
  	               break;
  	               
  	           }
  	           else if(a.get(i)<b.get(i))
  	           {
  	              res=-1; 
  	              flag=false;
  	              break;
  	           }
  	           i++;
  	        }
  	        if(flag)
  	        {
  	            if(a.size()>b.size())
  	            {
  	                res=1;
  	            }
  	            else
  	            {
  	                res=-1;
  	            }
  	        }
  	      
  	    }
  	    return res;
  	}
}
