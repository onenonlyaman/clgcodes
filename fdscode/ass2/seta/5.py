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