def sum(numbers):
    sum=0
    for number in numbers:
        sum = sum+number
    return sum

numList = [10,20,30]
result = sum(numList)
print(result)