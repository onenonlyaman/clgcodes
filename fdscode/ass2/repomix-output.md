This file is a merged representation of a subset of the codebase, containing files not matching ignore patterns, combined into a single document by Repomix.

# File Summary

## Purpose
This file contains a packed representation of a subset of the repository's contents that is considered the most important context.
It is designed to be easily consumable by AI systems for analysis, code review,
or other automated processes.

## File Format
The content is organized as follows:
1. This summary section
2. Repository information
3. Directory structure
4. Repository files (if enabled)
5. Multiple file entries, each consisting of:
  a. A header with the file path (## File: path/to/file)
  b. The full contents of the file in a code block

## Usage Guidelines
- This file should be treated as read-only. Any changes should be made to the
  original repository files, not this packed version.
- When processing this file, use the file path to distinguish
  between different files in the repository.
- Be aware that this file may contain sensitive information. Handle it with
  the same level of security as you would the original repository.

## Notes
- Some files may have been excluded based on .gitignore rules and Repomix's configuration
- Binary files are not included in this packed representation. Please refer to the Repository Structure section for a complete list of file paths, including binary files
- Files matching these patterns are excluded: setb/*.csv
- Files matching patterns in .gitignore are excluded
- Files matching default ignore patterns are excluded
- Files are sorted by Git change count (files with more changes are at the bottom)

# Directory Structure
```
seta/1.py
seta/2.py
seta/3.py
seta/4.py
seta/5.py
setb/1.py
setb/2.py
setb/3.py
setb/4.py
setc/1.py
setc/2.py
setc/3.py
setc/4.py
```

# Files

## File: seta/1.py
```python
import pandas as pd
dictionary = {
    'id': [1, 2, 3, 4],
    'name': ["Sonal", "Sakshi", "Vrunda", "Amit"],
    'marks': [90, 80, 70, 60]
}

df = pd.DataFrame(dictionary)

print("Mean:", df['marks'].mean())
print("Median:", df['marks'].median())
print("Mode:", df['marks'].mode())
```

## File: seta/2.py
```python
import pandas as pd
dictionary = {
    'month': ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"],
    'sales': [120, 150, 130, 170, 160, 180, 200, 190, 210, 220, 230, 240]
}

df = pd.DataFrame(dictionary)

max_sales = df['sales'].max()
min_sales = df['sales'].min()
range_sales = max_sales - min_sales
variance_sales = df['sales'].var()
sd_sales = df['sales'].std()

print("Range:", range_sales)
print("Variance:", variance_sales)
print("Standard Deviation:", sd_sales)
```

## File: seta/3.py
```python
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
```

## File: seta/4.py
```python
# Create a DataFrame containing 2D coordinates of multiple data points. Write a Python program to select
# any two points and compute the Euclidean distance between them using numpy.linalg.norm(), showing
# both the difference vector and the final distance
import pandas as pd
import numpy as np

l = [[1, 2], [3, 4], [5, 6], [7, 8], [9, 10]]
df = pd.DataFrame(l, columns=['x', 'y'])

point1 = df.iloc[0].values
point2 = df.iloc[1].values

difference_vector = point2 - point1
distance = np.linalg.norm(difference_vector)

print("Point 1:", point1)
print("Point 2:", point2)
print("Difference Vector:", difference_vector)
print("Distance:", distance)
```

## File: seta/5.py
```python
import numpy as np
import matplotlib.pyplot as plt

ages = np.array([22, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90])

bins = np.arange(20, 100, 10)

hist, bin_edges = np.histogram(ages, bins=bins)

print("Histogram Frequencies:")
for i in range(len(hist)):
    print(bin_edges[i], "-", bin_edges[i+1], ":", hist[i])

plt.hist(ages, bins=bins, edgecolor='black')

plt.xlabel("Age")
plt.ylabel("Frequency")
plt.title("Histogram of Employee Ages")

plt.show()
```

## File: setb/1.py
```python
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
```

## File: setb/2.py
```python
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
```

## File: setb/3.py
```python
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
```

## File: setb/4.py
```python
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
```

## File: setc/1.py
```python
import pandas as pd
from scipy.spatial.distance import pdist, squareform

data = {
    "X": [2, 4, 6, 8],
    "Y": [3, 5, 7, 9]
}

df = pd.DataFrame(data)

print("Dataset:")
print(df)

euclidean = squareform(pdist(df, metric='euclidean'))

print("\nEuclidean Distance Matrix:")
print(pd.DataFrame(euclidean))

manhattan = squareform(pdist(df, metric='cityblock'))

print("\nManhattan Distance Matrix:")
print(pd.DataFrame(manhattan))
```

## File: setc/2.py
```python
import numpy as np

data = np.array([
    [10, 20, 30],
    [15, 25, 35],
    [20, 30, 40]
])

weights = np.array([1, 2, 3])

axis = 0

weighted_arithmetic = np.average(data, axis=axis, weights=weights)

weighted_harmonic = np.sum(weights) / np.sum(weights / data, axis=axis)

weighted_geometric = np.exp(
    np.sum(weights * np.log(data), axis=axis) / np.sum(weights)
)

print("Dataset:")
print(data)

print("\nWeights:")
print(weights)

print("\nWeighted Arithmetic Mean:")
print(weighted_arithmetic)

print("\nWeighted Harmonic Mean:")
print(weighted_harmonic)

print("\nWeighted Geometric Mean:")
print(weighted_geometric)
```

## File: setc/3.py
```python
import numpy as np

A = np.array([
    [1, 2, 3, 4],
    [2, 3, 4, 5]
])

B = np.array([
    [2, 3, 4, 5],
    [3, 4, 5, 6]
])

axis = 1

def normalized_cross_correlation(x, y):
    x = x - np.mean(x)
    y = y - np.mean(y)

    corr = np.correlate(x, y, mode='full')
    corr = corr / (np.std(x) * np.std(y) * len(x))

    lags = np.arange(-len(x) + 1, len(x))
    max_lag = lags[np.argmax(corr)]

    return corr, max_lag

if axis == 0:
    for i in range(A.shape[1]):
        corr, lag = normalized_cross_correlation(A[:, i], B[:, i])
        print(f"\nColumn {i + 1}")
        print("Correlation:", corr)
        print("Lag of Maximum Correlation:", lag)

elif axis == 1:
    for i in range(A.shape[0]):
        corr, lag = normalized_cross_correlation(A[i], B[i])
        print(f"\nRow {i + 1}")
        print("Correlation:", corr)
        print("Lag of Maximum Correlation:", lag)
```

## File: setc/4.py
```python
import numpy as np

data = np.array([10, 12, 15, 18, 20, 22, 25, 27, 30, 100])

print("Original Dataset:")
print(data)

print("\nOriginal Statistics")
print("Mean:", np.mean(data))
print("Median:", np.median(data))
print("Standard Deviation:", np.std(data))

Q1 = np.percentile(data, 25)
Q3 = np.percentile(data, 75)
IQR = Q3 - Q1

lower = Q1 - 1.5 * IQR
upper = Q3 + 1.5 * IQR

iqr_outliers = data[(data < lower) | (data > upper)]
iqr_clean = data[(data >= lower) & (data <= upper)]

print("\nIQR Outliers:", iqr_outliers)

z_scores = (data - np.mean(data)) / np.std(data)

z_outliers = data[np.abs(z_scores) > 2]
z_clean = data[np.abs(z_scores) <= 2]

print("Z-Score Outliers:", z_outliers)

median = np.median(data)
MAD = np.median(np.abs(data - median))

modified_z = 0.6745 * (data - median) / MAD

mod_outliers = data[np.abs(modified_z) > 3.5]
mod_clean = data[np.abs(modified_z) <= 3.5]

print("Modified Z-Score Outliers:", mod_outliers)

print("\nResults After Removing IQR Outliers")
print("Mean:", np.mean(iqr_clean))
print("Median:", np.median(iqr_clean))
print("Standard Deviation:", np.std(iqr_clean))
```
