nums = [10,20,10,40,50,60,70]
target = 50

l = 0 
r = len(nums)-1
temp = 0 
while(l<r):
    temp = nums[l]+nums[r]
    if temp == target:
        print(l,r)
        break 
    elif temp < target:
        l+=1 
        
    else:
        r-=1 


        