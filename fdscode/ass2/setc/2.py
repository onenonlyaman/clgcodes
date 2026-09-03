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