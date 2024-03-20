public class Main
{
    static int Max(int ls,int rs,int cs)
    {
        if(ls>rs&&ls>cs)
         return ls;
        else if(rs>ls&&rs>cs)
         return rs;
        else
         return cs;
    }
    static int cross_sum(int a[],int mid,int p,int q )
    {
        int lbs=0,lts=0,rbs=0,rts=0;
        for(int i=mid;i>=p;i--)
        {
            lts=lts+a[i];
            if(lts>lbs)
            {
                lbs=lts;
            }
        }
        for(int j=mid+1;j<=q;j++)
        {
            rts=rts+a[j];
            if(rts>rbs)
            {
                rbs=rts;
            }
        }
        return(lbs+rbs);
    }
    static int DAC_CMSS(int a[],int p,int q)
    {
        if(p==q)
         return a[p];
        else
        {
            int mid=(p+q)/2;
            
            int ls=DAC_CMSS(a,p,mid);
            int rs=DAC_CMSS(a,mid+1,q);
            
            int cs=cross_sum(a,mid,p,q);
            return(Max(ls,cs,rs));
        }
    }
	public static void main(String[] args) {
		int a[]={-2,1,-3,4,-1,2,1,-5,4};
		int ans=DAC_CMSS(a,0,a.length-1);
		System.out.println(ans);
	}
}