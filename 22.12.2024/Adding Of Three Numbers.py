def add_three_numbers(num1, num2, num3):
    return num1 + num2 + num3

try:
    number1 = float(input("Enter the first number: "))
    number2 = float(input("Enter the second number: "))
    number3 = float(input("Enter the third number: "))
    total = add_three_numbers(number1, number2, number3)
    print("The sum of", number1, ",", number2, "and", number3, "is:", total)
except ValueError:
    print("Please enter valid numbers.")
