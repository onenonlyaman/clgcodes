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