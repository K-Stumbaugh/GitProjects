def collatz(number):
    
    if number % 2 == 0:
        print(number // 2)
        return number // 2
    
    elif number % 2 == 1:
        result = 3 * number + 1
        print(result)
        return result

n = int(input())
while n != 1:
    n = collatz(n)

"""if number is even print 'number // 2'
if number is odd print and return 3*number + 1
"""