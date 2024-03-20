arr = [26,77,1,90,44,10,2]

target = 1310
arr.sort()

# def sol(arr,target,a,b):
#     while(a!=b):
#         if arr[a]+arr[b]==target:
#             return arr[a],arr[b]
#         elif arr[a]+arr[b]<target:
#             a=a+1 
#         else:
#             b=b-1
#     return "Not found"         


# print(sol(arr,target,0,len(arr)-1))

def sol(arr,target):
    for a in range(0,len(arr)-2):
        b=a+1
        c=len(arr)-1 
        while(b!=c):
            if arr[a]+arr[b]+arr[c]==target:
                return True 
            elif arr[a]+arr[b]+arr[c]<target:
                b=b+1 
            else:
                c=c-1
    return False            
            
print(sol(arr,target))            
    
