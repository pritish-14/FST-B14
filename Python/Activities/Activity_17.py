import pandas

data = {
    "Usernames" : ["admin","Charles","Deku"],
    "Passwords" : ["password","Charle13","AllMight"]
}

dataframe = pandas.DataFrame(data)

dataframe.to_csv("Auth_File.csv")