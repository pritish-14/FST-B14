fruit_dict = {
    "apple" : 70,
    "mango" : 50,
    "orange" : 55
}

fruit_name = input("Enter a fruit name to check ").lower()

if(fruit_name in fruit_dict):
    print("Fruit is available")
else:
    print("Fruit is not available")