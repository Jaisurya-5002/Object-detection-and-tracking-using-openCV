def palindrome(n):
    original = n
    rev = 0
    while n > 0:
        rev = rev * 10 + n % 10
        n //= 10
    return original == rev
print(palindromenumber(121))  # True
