import pandas as pd

data = {
    "City": ["Mumbai", "Pune", "Nagpur", "Mumbai", "Pune", "Nagpur", "Mumbai", "Pune", "Nagpur", "Mumbai"],
    "Age": [18, 19, 20, 21, None, 22, 23, 24, 25, 26],
    "Fees": [35000, 42000, 39000, None, 41000, 45000, 48000, 52000, 56000, 60000],
    "Admitted": ["Yes", "No", "Yes", "Yes", "No", "Yes", "No", "Yes", "No", "Yes"]
}

df = pd.DataFrame(data)
df.to_csv("StudentData.csv", index=False)

print("Student Data:")
print(df)
print("\nShape:", df.shape)
print("\nMissing Values:")
print(df.isnull().sum())
