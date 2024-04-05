nums = [0,1,0,3,12]

l = 0 
r = l 

while(l<=len(nums)-1 and r<=len(nums)-1):
    if nums[r] !=0:
        temp = 0 
        temp = nums[l]
        nums[l] = nums[r]
        nums[r] = temp 
        l +=1  
        r +=1 
    else:
        r+=1 
  
print(nums) 