# Power of an element - Divide & Conquer 

# Given a>1,n>=1 , find a^n 

a=2
n=6

def power_DAC(a,n):
    if n==1:
        return a 
    else:
        mid = n//2
        b = power_DAC(a,mid)
        res = b*b 
        if n%2==0:
            return res
        else:
            return a*res 
            
print(power_DAC(2,5))            
            