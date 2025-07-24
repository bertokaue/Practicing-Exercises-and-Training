#Task 5:
#Create a list called fruits with the following elements: apple, banana, cherry, date, elderberry, fig, grape.
#Write a program called fruits.py to print the following:
#- The first fruit in the list.
#- The last fruit in the list
#- Only print “cherry”, “date”, “elderberry” in a list using slicing
#- The first three fruits using slicing
#- All fruits except the last one using slicing
#- Every second fruits in the list using slicing.

fruits = ["apple", "banana", "cherry", "date", "elderberry", "fig", "grape"]
print("The first fruit is: " + fruits[0])
print("The last fruit is: " + fruits[len(fruits) - 1])
print(fruits[2:5])
print(fruits[:3])
print(fruits[:-1])
print(fruits[::2])