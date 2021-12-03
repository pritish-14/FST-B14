import pandas

Auth_File = pandas.read_csv("Auth_File.csv")

print(Auth_File)
print("===========================")
print(Auth_File["Usernames"])
print("===========================")
print(Auth_File["Usernames"][1], "|" ,Auth_File["Passwords"][1])
print("===========================")
print(Auth_File.sort_values("Usernames"))
print("===========================")
print(Auth_File.sort_values("Passwords", ascending=False))