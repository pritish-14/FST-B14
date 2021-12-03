import pandas
from pandas import ExcelWriter

data = {
    "FirstName" : ["Satvik","Avinash","Lahari"],
    "LastName" : ["Shah","Kati","Rath"],
    "Email" : ["satshah@example.com","avinashk@example.com","lahri.rath@example.com"],
    "PhoneNumber" : ["4537829158", "4892184058", "4528727830"]
}

dataframe = pandas.DataFrame(data)
print(dataframe)

writer = ExcelWriter("sample.xlsx")
dataframe.to_excel(writer,"Sheet1",index=False)
writer.save()