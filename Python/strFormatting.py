# You've seen how to construct strings in Python. The + operator can concatenate two strings.
# However, we can use str.format() to do the above but in a much nicer way.
# Check out the number padding section at PyFormat, and complete the program below so that the:
# • percentage downloaded is formatted to 2 decimal places
# • megabytes downloaded is at least 6 characters wide, with leading zeroes as required.

percent = 12.3456789
megabytes = 4100
# message = f"You have downloaded {percent:.2f}% so far, with a total of {megabytes:0>6} megabytes"
# The above text was my first try but out of the scope for this exercise. We need to use .format to make it work.

#message = 'Progress: {:.2f}%, {:0>6} MB'.format(percent, megabytes)
# This was my second try and it worked completely fine. BUT, {:0>6} is a flexible way of padding, and could end up accepting strings, booleans or floats.
# The problem with that is that it gets hard to debug and it is less secure.

message = 'Progress: {:.2f}%, {:06d} MB'.format(percent, megabytes)
# {:06d} does the same thing but accepts integer only, if someone enters a string it will automatically show an error message.

print(message)