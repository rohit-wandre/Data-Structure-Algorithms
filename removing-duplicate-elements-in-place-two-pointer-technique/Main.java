public class Main
{
	public static void main(String[] args) {
		
		/*---------------------------------TWO POINTER TECHNIQUE--------------------------------*/
		
		// TIME COMPLEXITY: O(N)
		// SPACE COMPLEXITY: O(1) IN-PLACE ALGO
		
		
		/* ALGORITHM:
		   
		1. INITIALIZE READPOINTER WITH 2 POS OF ARRAY AS 1ST ELEMENT IS ALREADY UNIQUE
		2. INITIALIZE writePointer ALSO WITH 2 POS 
		3. ITERATE OVER THE ARRAY FROM POS 2 AND CHECK IF THE ELEMENT POINTED BY readPointer IS SAME AS THAT OF ELEMENT
		   POINTED BY writePointer?
		4. IF YES,GO ON NEXT ELEMENT
		5. ELSE, COPY ELEMENT OF readPointer TO writePointer
		6. INCREMENT THE writePointer.
		7. ALL THE UNIQUE ELEMENTS WILL GET SHIFTED IN THE FRONT OF ARRAY AND writePointer WILL
		   CONTAIN THE LENGTH OF UNIQUE ELEMENTS IN THE ARRAY
		*/
		
		int arr[]={0,0,1,1,1,2,2,3,3,4};
		int n=arr.length;
		int writePointer=1;
		for(int readPointer=1;readPointer<n;readPointer++) // 1st element will always be unique
		{
		    if(arr[readPointer]!=arr[readPointer-1])
		    {
		        arr[writePointer]=arr[readPointer];
		        writePointer++;
		    }
		}
		for(int i=0;i<writePointer;i++)
		{
		    System.out.print(arr[i]+" ");
		}
	}
}
