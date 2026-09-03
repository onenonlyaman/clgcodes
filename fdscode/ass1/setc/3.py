import pandas as pd

student_data = {
    'Name': ['Suvidha', 'Sucheta', 'Smita', 'Rohini', 'Priyanka'],
    'Marks': [98, 99, 97, 96, 95],
    'City': ['Nashik', 'Nashik', 'Dhule', 'Pathardi', 'Trambakeshwar']
}

df = pd.DataFrame(student_data)

print("Number of Observations:", len(df))
print("Missing Values per Column:\n", df.isnull().sum())
print("Total Missing Values:", df.isnull().sum().sum())