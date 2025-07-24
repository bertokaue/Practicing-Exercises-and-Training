#Task 2:
#You are tracking your calorie intake from two sources over 5 days:
#meals: calorie consumed from regular meals each day.
#snacks: calories consumed from snacks each day.
#Write a program that:
#1. Prints the meals and snacks lists.
#2. Computes a new list total_calories by adding the calorie from meals and snacks per day.
#3. Prints the daily total calories.
#meals = [1500, 1600, 1550, 1700, 1650]
#snacks = [200, 250, 180, 220, 210]
#Please complete the following codes:

def main():
        #TODO: your codes here
        meals = [1500, 1600, 1550, 1700, 1650]
        snacks = [200, 250, 180, 220, 210]

        print("These are the calories consumed by MEALS from day 1 to 5: " + str(meals))
        print("These are the calories consumed by SNACKS from day 1 to 5: " + str(snacks))

        total_calories = meals[0] + snacks[0], meals[1] + snacks[1], meals[2] + snacks[2], meals[3] + snacks[3], meals[4] + snacks[4]

        print("These are the TOTAL calories consumed by all the meals and snacks from day 1 to 5: " + str(total_calories))
        
if __name__ == '__main__':
        main()
