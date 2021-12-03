firstlist = list(input("Enter list 1 values ").split(", "))
secondlist = list(input("Enter list 2 values ").split(", "))

newlist = []

for num in firstlist:
    if(int(num) % 2 != 0):
        newlist.append(num)

for num in secondlist:
    if(int(num) % 2 == 0):
        newlist.append(num)

print(f"The new list is {newlist}")