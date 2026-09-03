import pandas as pd

df = pd.read_csv("employee_data.csv")

salary = df["salary"]

print("Count:", salary.count())
print("Mean:", salary.mean())
print("Median:", salary.median())
print("Variance:", salary.var())
print("Std Deviation:", salary.std())
print("Minimum:", salary.min())
print("Q1 (25%):", salary.quantile(0.25))
print("Q2 (50%):", salary.quantile(0.50))
print("Q3 (75%):", salary.quantile(0.75))
print("Maximum:", salary.max())