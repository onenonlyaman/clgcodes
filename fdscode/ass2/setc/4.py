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