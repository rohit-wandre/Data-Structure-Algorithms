s = "hello"
s = list(s)
# print(s)

vowels = ('a','A','e','E','i','I','o','O','u','U')
vowels_idx = []

for i in range(0,len(s)):
    if s[i] in vowels:
        vowels_idx.append(i)
print(vowels_idx)


i = 0
j = len(vowels_idx)-1

# s = "leetcode"
while i<j:
    temp = ""
    i_1 = vowels_idx[i]
    j_1 = vowels_idx[j]
    temp = s[i_1]
    s[i_1] = s[j_1]
    s[j_1] = temp 
    i+=1 
    j-=1
s = ''.join(s)
print(s)
    
    
    
    