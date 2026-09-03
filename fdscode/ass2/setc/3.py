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