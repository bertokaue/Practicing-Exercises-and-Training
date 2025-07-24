# Write a program unikey.py that generates a UniKey from a person's name, for example:
# Name: Paul Simpson
# UniKey: psim1234
# A UniKey is formed by combining the first letter of the first name with the first three letters of the last name, and then appending a four-digit code.
import random

print("Hello. This is you UniKey Generator. Please, Let us know your full name and we will generate and unique key especially for you :)")
firstName = input("Type ONLY your First Name: ")
lastName = input("Type ONLY your Last Name: ")

randomNumber = random.randint(0,9)

print(firstName[0] + lastName[:3] + str(random.randint(1000,9999)))

# I had to research some ways to implement randomized numbers at the end, so we could create an Unique Identifier for each person.
# Even though we can't validate it as really unique, it is a nice exercise about generating "credentials"
# We could implement some validation to make sure it is not a repeated UniKey, but it is not the intention of this class. Maybe for a future project.