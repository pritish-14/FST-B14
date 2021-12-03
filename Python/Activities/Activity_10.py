# numbers = (1,2,10,20,12,15)
numbers = tuple(input("Enter values to the tuple ").split(","))

print("The number divisible by 5 are :")
for number in numbers:
    num = int(number)
    if(num%5 == 0):
        print(num)