#Write a program celsius.py that converts a Fahrenheit temperature to Celsius

print("Type your Farenheit temperature and get it in Celsius degrees instead :)")
fahrenheit = float(input("Farenheit temperature: "))
celsius = (fahrenheit-32) * 5/9 
print(f"{fahrenheit:.2f}" + " degrees Fahrenheit is equal to " + f"{celsius:.2f}" + " degrees Celsius")

# I wasn't sure about how to show only 2 numbers after the ., so i researched online
# First I found f'%.2f' %fahrenheit, and used it. But upon checking it deeper I saw that this is the old way to do it, mostly used in python2
# Then I updated it to the most modern way, built in for python3 that is f"{fahrenheit:.2f}"