def calculateSum(num):
    if num<=1:
        return num
    else:
        return num+calculateSum(num-1)

result = calculateSum(int(input("Enter the number ")))
print(result)
