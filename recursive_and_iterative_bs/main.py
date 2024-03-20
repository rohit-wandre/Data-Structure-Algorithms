a = [8,19,21,24,36,56]

# Recursive BS
# def bs(a,i,j,x):
#     if(i==j):
#         if a[i] == x:
#             return i
#         else:
#             return -1
#     else:        
#         mid = (i+j)//2 
#         if(x==a[mid]):
#             return mid
#         elif x<a[mid]:
#             return bs(a,i,mid-1,x)
#         else:  
#             return bs(a,mid+1,j,x)
#         return -1 

# print(bs(a,0,len(a)-1,56))


# Iterative BS
def bs(a,i,j,x):
    while(i<=j):
        if(i==j):
            if a[i] == x:
                return i
            else:
                return -1
        else:
            mid = (i+j)//2
            if x == a[mid]:
                return mid
            elif x<a[mid]:
                j = mid-1
            else:
                i = mid+1
                
print(bs(a,0,len(a)-1,56))            
                
                
    