def is_even(number):
    if number % 2 == 0:
        return True
    else:
        return False
num = int(input("Enter a number: "))
if is_even(num):
    print(f"{num} is an even number.")
else:
    print(f"{num} is not an even number.")
