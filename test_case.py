# TEST CASE

def addition(x, y):
    return x + y

def subtraction(x, y):
    return x - y

def multiplication(x, y):
    return x * y

def division(x, y):
    if y != 0:
        return x / y
    else:
        return "Error: Division by zero is not allowed."

print("Select operation:")
print("1. Addition")
print("2. Subtraction")
print("3. Multiplication")
print("4. Division")

choice = input("Enter your choice (1/2/3/4): ")

num1 = float(input("Enter the first number: "))
num2 = float(input("Enter the second number: "))

if choice == '1':
    print(f"Result: {num1} + {num2} = {addition(num1, num2)}")

elif choice == '2':
    print(f"Result: {num1} - {num2} = {subtraction(num1, num2)}")

elif choice == '3':
    print(f"Result: {num1} * {num2} = {multiplication(num1, num2)}")

elif choice == '4':
    print(f"Result: {num1} / {num2} = {division(num1, num2)}")

else:
    print("Invalid option.")