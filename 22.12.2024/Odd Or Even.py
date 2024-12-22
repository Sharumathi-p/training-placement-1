def check_odd_or_even(num):
    if num % 2 == 0:
        return "Even"
    else:
        return "Odd"

num = 42
print(num, "is", check_odd_or_even(num))

num = 27
print(num, "is", check_odd_or_even(num))
