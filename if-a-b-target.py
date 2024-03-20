a=[100,200,300,400,500,600,700,800]
 
#Q. check if a+b>target O(nlogn)

def sol(a,i,j,target):
    for x in range(0,len(a)-1): #O(n)
        mid = ((x+1)+j)//2  # O(logn)
        if a[x] + a[mid] > target:
            return True
        continue     
    return False    
print(sol(a,0,len(a)-1,10000))            
            
            