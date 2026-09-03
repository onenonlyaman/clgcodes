import pandas as pd

student_data = {
    'Name': ['Suvidha', 'Sucheta', 'Smita', 'Rohini', 'Priyanka'],
    'Marks': [98, 99, 97, 96, 95],
    'City': ['Nashik', 'Nashik', 'Dhule', 'Pathardi', 'Trambakeshwar']
}

df = pd.DataFrame(student_data)

extra_rows = pd.DataFrame([
    {'Name': 'Suvidha', 'Marks': 98, 'City': 'Nashik'},      
    {'Name': 'Sucheta', 'Marks': 99, 'City': 'Nashik'},      
    {'Name': 'Ankita', 'Marks': None, 'City': 'Pune'},     
    {'Name': None, 'Marks': 90, 'City': 'Mumbai'},         
    {'Name': 'Pooja', 'Marks': 92, 'City': None}          
])

df_updated = pd.concat([df, extra_rows], ignore_index=True)

df_updated['remarks'] = None

print("Updated DataFrame:\n")
print(df_updated)