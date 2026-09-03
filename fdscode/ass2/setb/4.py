import pandas as pd

df = pd.read_csv("Iris.csv")

print("Sample Records:")
sample = df.sample(n=5, random_state=1)
print("Random Samples:")
print(sample)

print("\nMaximum Values:")
print(df.max(numeric_only=True))

print("\nMinimum Values:")
print(df.min(numeric_only=True))

print("\nNumber of Records for Each Species:")
print(df["Species"].value_counts())