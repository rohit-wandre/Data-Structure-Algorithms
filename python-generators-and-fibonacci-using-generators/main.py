# A Python program to demonstrate use of  
# generator object with next()  
  
# A generator function 
# def simpleGeneratorFun(): 
#     yield 1
   
# # x is a generator object 
# x = simpleGeneratorFun() 
# for i in x:
#     print(i)
  
# Iterating over the generator object using next 
  
# In Python 3, __next__() 
# print(next(x)) 
# print(next(x)) 
# print(next(x))

def fib(n):
    a,b=0,1 
    while a<n:
        yield a 
        a,b=b,a+b

for i in fib(5):
    print(i)
    
    