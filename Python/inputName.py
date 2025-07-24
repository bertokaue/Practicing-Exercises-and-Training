#Task 1
#Write a program that simulates a short conversation with a friend named Alex. Your program should 
#take a single command-line argument which represents the user’s name and print a dialogue as shown below.
#Example output (if the input argument is "Sarah"):
#Sarah: "Hey Alex, are you free to hang out?"
#Alex: "Hey Sarah! Sure, let’s meet at the park!"
#Sarah: "Awesome! See you there!"
#Please complete the following codes:

def main():
        #TODO: your codes
	name = input("What name should be shown in the conversation? ")
	print(name + ": Hey Alex, are you free to hang out?")
	print("Alex: Hey Sarah! Sure, let’s meet at the park!")
	print(name + ": Awesome! See you there!")

if __name__ == '__main__':
        main()
