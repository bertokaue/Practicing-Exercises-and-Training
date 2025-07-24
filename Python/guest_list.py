#Task 3:
#i. Write a program called guest_list.py that stores the names of a few guests (“Alice”, “Bob”, “Charlie”, “Diana”) in a list guests. 
#Print each guest’s name with a personalized message like “Welcome, <NAME>” by accessing them one by one.
#ii. Add two more names(“Eve”, “Frank”) to the end of the guest list using .append() and print the updated list.
#iii. To the above program, insert a new guest “Grace” at the beginning of the list using .insert().
#iv. One guest “Charlie” can’t make it. Remove them from the list using .remove() and rewrite the program.
#v. Rewrite the program by adding a statement how many people are invited using len().
#vi. Revise the program to check if “Bob” and “Zara” are in the guest list.

guests = [ "Alice", "Bob", "Charlie", "Diana"]
guests.append("Eve")
guests.append("Frank")
guests.insert(0, "Grace")
guests.remove("Charlie")

print("Welcome, " + guests[0] + "!")
print("Welcome, " + guests[1] + "!")
print("Welcome, " + guests[2] + "!")
print("Welcome, " + guests[3] + "!")
print("Welcome, " + guests[4] + "!")
print("Welcome, " + guests[5] + "!")
#print("Welcome, " + guests[6] + "!")

print()
print("We have a total of " + str(len(guests)) + " people coming to the party! YHAAAA")
print("Unfortunately, Zara is not coming today. But the good new is, Bob is coming!!!")