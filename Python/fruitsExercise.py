#Create a Python program that demonstrates the use of lists and common list operations.
#Your program should perform the following tasks:
#1. Initialize an empty list called fruits.
#2. Add the following fruits to the list: "apple", "banana", "cherry", "date", "elderberry".
#3. Print the list of fruits.
#4. Check if "banana" is in the list and print the result (True or False).
#5. Remove "cherry" from the list.
#6. Add "grape" to the end of the list.
#7. Print the updated list of fruits.

fruits = [0]
fruits = ["apple", "banana", "cherry", "date", "elderberry"]
print(fruits)
if "banana" in fruits:
    print("yes")
fruits.remove("cherry")
fruits.insert(len(fruits), "grape")
print(fruits)