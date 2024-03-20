a = ['#','#','#','#','#','#','#',30,50,-10,-20,5,60,70]

# Q.Find last #

def sol(a,i,j):
    while(i<=j):
        if i==j:
            if a[i]=='#':
                return i 
            else:
                return -1 
        else:
            mid = (i+j)//2 
            if a[mid]!='#' and a[mid-1]=='#':
                return mid-1
            if a[mid]=='#' and a[mid+1]!='#':
                return mid 
            else:
                if a[mid]=='#' and a[mid+1]=='#':
                    i = mid+1 
                else:
                    j = mid-1
                    
print(sol(a,0,len(a)-1))                    
                    
                    
                    
                
                
            