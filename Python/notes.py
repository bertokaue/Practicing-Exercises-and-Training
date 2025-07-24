#Boolean Example
foo = True
bar = False
flag = foo
flag = foo and bar
print("flag = " + str(flag))
print()

#Integer Example
a = 45
b = 23
c = a + b
print(str(a) + " + " + str(b) + " = " + str(c))
print()

#Float Example
radius = 0.51238761523
area = radius * radius * 3.141592659
print(" The area of a circle of radius " + str(radius) + " is " + str(area))
print()

#String Example
word1 = "Hello "
word2 = "World!"
twoWords = word1 + word2
print (twoWords)
print()

#Length Example
word1Len = len(word1)
print("The string \"word1\" has " + str(word1Len) + " characters.")
print("The string \"twoWords\" has " + str(len(twoWords)) + " characters.")
print()

isEqual = (word1 == word2)
print("Does string \"word1\" matches string \"word2\"? Answer: " + str(isEqual))

# How Input works?

#x = int(input("Enter your X value here: ")) 
#y = int(input("Enter your Y value here: ")) 
#print("The sum of " + str(x) + " and " + str(y) + " is: " + str(x+y))

#Simple Calculations Example: What does this print?
x = 6
y = ++x
z = (x + --y)
n = 0
n += 1
print("x = " + str(x))
print("y = " + str(y))
print("z = " + str(z))
print("n = " + str(n))

x = 5
r = 1.2
s = x * r
print("x = " + str(x))
print("r = " + str(r))
print("s = " + str(s))

s = s - 1.1
print("s = " + str(s))


