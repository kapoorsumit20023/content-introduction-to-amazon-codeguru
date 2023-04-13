def add_numbers(a, b):
    result = a + b
    return result

def main():
    x = 5
    y = 10
    result = add_numbers(x, y)
    print(f"The sum of {x} and {y} is {result}")

if __name__ == "__main__":
    main()

def divide_numbers(a, b):
    # Intentionally introduce an issue: division by zero
    result = a / b
    return result
