import pandas as pd
data = {
    "Employee_ID": [101, 102, 103, 104, 105, 106, 107, 108, 109, 110],
    "Department": ["HR", "IT", "Finance", "HR", "IT",
                   "Finance", "HR", "IT", "Finance", "HR"],
    "Age": [25, 30, 28, 35, 26, 40, 32, 29, 38, 31],
    "Salary": [30000, 45000, 40000, 50000, 42000,
               55000, 48000, 46000, 53000, 47000]
}

df = pd.DataFrame(data)

print("Employee DataFrame:")
print(df)

random_sample = df.sample(n=5, random_state=1)

print("\nSimple Random Sampling (5 Employees):")
print(random_sample)

systematic_sample = df.iloc[::3]

print("\nSystematic Sampling (Every 3rd Employee):")
print(systematic_sample)

stratified_sample = df.groupby("Department").sample(n=1, random_state=1)

print("\nStratified Sampling (1 Employee from each Department):")
print(stratified_sample)