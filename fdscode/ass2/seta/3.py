# Create a DataFrame containing the salaries (in thousands) of 25 employees in a company. Write a
# Python program to calculate the quartiles (Q1, Q2, Q3) and selected percentiles (25th, 50th, 75th, 90th),
# and detect outliers using both the IQR and Z-score methods.
import pandas as pd
salaries = [120, 150, 130, 170, 160, 180, 200, 190, 600, 220, 230, 240, 120, 150, 130, 170, 160, 180, 200, 190, 210, 220, 230, 240, 340]

df = pd.DataFrame(salaries, columns=['Salary'])

df['Q1'] = df['Salary'].quantile(0.25)
df['Q2'] = df['Salary'].quantile(0.50)
df['Q3'] = df['Salary'].quantile(0.75)
df['90th Percentile'] = df['Salary'].quantile(0.90)

Q1 = df['Q1'][0]
Q3 = df['Q3'][0]
IQR = Q3 - Q1

lower_bound = Q1 - 1.5 * IQR
upper_bound = Q3 + 1.5 * IQR

outliers_iqr = df[(df['Salary'] < lower_bound) | (df['Salary'] > upper_bound)]

print("Quartiles:")
print("Q1:", Q1)
print("Q2:", Q3)
print("Q3:", Q3)

print("\nSelected Percentiles:")
print("25th Percentile: ", df['Q1'][0])
print("50th Percentile: ", df['Q2'][0])
print("75th Percentile: ", df['Q3'][0])
print("90th Percentile: ", df['90th Percentile'][0])

print("\nOutliers (IQR Method):")
print(outliers_iqr)