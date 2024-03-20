public class MyClass {
    public static void main(String args[]) {
      
      
      int arr[]={10,9,11,23,22,6,1};
      int n=arr.length;
    // -------------------- BUBBLE SORT----------------------------
         //for(int i=0;i<n-1;i++)
    //   {
    //       boolean swap=true;
    //       for(int j=0;j<n-i-1;j++)
    //       {
    //           if(arr[j]>arr[j+1])
    //           {
    //               int temp;
    //               temp=arr[j];
    //               arr[j]=arr[j+1];
    //               arr[j+1]=temp;
    //               swap=false;
    //           }
    //       }
    //       if(swap)
    //       {
    //           break;
    //       }
    //   }
      
      /*----------------- SELECTION SORT--------------------*/
      
    //   for(int i=0;i<n-1;i++)
    //   {
    //       int min=i;
    //       for(int j=i+1;j<n;j++)
    //       {
    //           if(arr[j]<arr[min]) // To sort in descending order, just reverse '<' to '>''
    //           {
    //               min=j;
    //           }
    //       }
    //       if(i!=min)
    //       {
    //           int temp=arr[i];
    //           arr[i]=arr[min];
    //           arr[min]=temp;
    //       }
    //   }
    
    //------------------------INSERTION SORT------------------------------------//
      int j;
      for(int i=1;i<n;i++)
      {
          int temp=arr[i];
          
          for(j=i-1;j>=0&&temp<arr[j];j--)
          {
              arr[j+1]=arr[j];
          }
          arr[j+1]=temp;
      }
      
      
      
      for(int i=0;i<n;i++)
      {
          System.out.print(arr[i]+" ");
      }
      
      
    }
}