#range by 1
print('Addition by 1')
for i in range(12,16):
    print(i)


#range by twos
print()
print('Addition by 2')
for i in range (0, 11, 2):
    print(i)


#range subtraction
print()
print('Subtraction')
for i in range(5, -1, -1):
    print(i)

#import random
print()
print('Random')
import random
for i in range(5):
    print(random.randint(1,10))
