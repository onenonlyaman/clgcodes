import pandas as pd

df = pd.read_csv("Iris.csv")

print("First 5 Rows:")
print(df.head())
print("\nDataset Description:")
print(df.describe())

print("\nMean of Numeric Attributes:")
print(df.mean(numeric_only=True))

print("\nMissing Values:")
print(df.isnull().sum())

if df.isnull().values.any():
    print("\nThe dataset contains missing values.")
else:
    print("\nThe dataset does not contain any missing values.")