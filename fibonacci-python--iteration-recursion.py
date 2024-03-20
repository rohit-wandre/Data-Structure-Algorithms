#Iterative approach -- fibonacci series upto nth number
# n = 13 
# f = 0
# s = 1 
# print(f)
# print(s)
# n = n -2 
# while(n>0):
#     nxt = f+s
#     print(nxt)
#     f=s 
#     s=nxt 
#     n-=1 
    
# Recursive approach
n = 3 #nth fibonacci number
def fib(n):
    if n==0:
        return 0
    elif n==1:
        return 1 
    else:
        return (fib(n-1)+fib(n-2)) 

print(fib(n))    
    