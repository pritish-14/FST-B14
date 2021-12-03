def fib(number):
    if number <= 1:
        return number
    else:
        return fib(number-1) + fib(number-2)


fibNum = int(input("How many Fibonnaci numbers to generate? "))
if fibNum < 0:
    print("Please enter a positive number")
else:
    print("Fibonacci Sequence: ")
    for i in range(fibNum):
        print(fib(i))