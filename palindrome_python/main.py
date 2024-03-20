s = "c1 O$d@eeD o1c"
s_trimmed = s.replace(' ','')
s_lowered = s_trimmed.lower()
s_cleaned = ''.join(chr for chr in s_lowered if chr.isalnum())
# print(s_cleaned)

# METHOD-1 USING while loop
# i = 0
# j = len(s_cleaned)-1 
# flag = True 
# while(i<j):
#     if s_cleaned[i]!=s_cleaned[j]:
#         flag=False
#         break
#     i+=1 
#     j-=1 
# if flag:
#     print("Palindrome")
# else:
#     print("Not Palindrome")
  
  
# METHOD-2 USING reversed()
# s_cleaned_reversed = ''.join(reversed(s_cleaned))
# if s_cleaned == s_cleaned_reversed:
#     print("Palindrome")
# else:
#     print("Not Palindrome")


# # METHOD-3 USING string slicing 
# if s_cleaned == s_cleaned[::-1]:
#         print("Palindrome")
# else:
#      print("Not Palindrome")


str_test = "ROHIT WANDRE"

# print(str_test[:len(str_test)-1])
# print(str_test[0::2]) 

#slice() 

s1 = slice(1)
s2 = slice(1,5)
s3 = slice(1,6,2)

print(str_test[s3])



