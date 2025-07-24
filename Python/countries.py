#Task 4:
#Write a program the stores five countries in the world you’d like to visit. Print the following outputs:
#i. The original list
#ii. The list of countries in alphabetical order
#iii. Reverse the order of countries in the list

countries = ["New Zealand", "Germany", "French", "Italy", "Argentina"]

print(countries)
print(sorted(countries))
#revcountries = countries.reverse() // Somehow it is outputting "None"

#reverter = reversed(countries)
#revcountries = list(reverter)
#print(revcountries)

countries.reverse()
print(countries)