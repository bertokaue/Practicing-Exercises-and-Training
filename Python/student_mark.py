#Task 6:
#Write a program student_mark.py to create two lists:
#Students = [“Alice", “Bob", “Charlie"]
#Marks = [85, 92, 78]
#Use zip() to combine the student names and their marks, and print the result as a list of pairs.
#Create another list of new students and their marks:
#New_students = [“Diana", “Ethan"]
#New_marks = [88, 91]
#Concatenate the students list with new_students and marks list with new_marks. Use zip() again on
#the updated lists and print the full list of students with their marks. 

students = ["Alice", "Bob", "Charlie"]
marks = [85, 92, 78]

zipped = zip(students, marks)
zippeddata = list(zipped)
print(zippeddata)

new_students = ["Diana", "Ethan"] + students
new_marks = [88, 91] + marks
zipped = zip(new_students, new_marks)
zippeddata = list(zipped)
print(zippeddata)
