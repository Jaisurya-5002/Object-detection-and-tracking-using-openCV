def palindrome(s):
    left=0;right=s.len()-1
    while left<right:
        if s[left]!=s[right]:
            return False
        left+=1
        right-=1
    return True
s=' '.join(c.lower() for c in s if c.isnum())
print(palindrome(s))