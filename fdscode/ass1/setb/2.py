import pandas as pd

student_data = {
    'Name': ['Suvidha', 'Sucheta', 'Smita', 'Rohini', 'Priyanka'],
    'Marks': [98, 99, 97, 96, 95],
    'City': ['Nashik', 'Nashik', 'Dhule', 'Pathardi', 'Trambakeshwar']
}

df = pd.DataFrame(student_data)

print(df.loc[0:1])