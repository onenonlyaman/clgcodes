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