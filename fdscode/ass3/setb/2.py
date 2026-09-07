import os
import pandas as pd
from sklearn.preprocessing import MinMaxScaler, StandardScaler, Normalizer, Binarizer

if os.path.exists("diabetes.csv"):
    df = pd.read_csv("diabetes.csv")
else:
    df = pd.read_csv("https://raw.githubusercontent.com/jbrownlee/Datasets/master/pima-indians-diabetes.data.csv")

print("Loaded Dataset:")
print(df.head())

scaler = MinMaxScaler()
rescaled = scaler.fit_transform(df)
print("\nRescaled Data (0 to 1):")
print(rescaled[:5].round(2))

std_scaler = StandardScaler()
standardized = std_scaler.fit_transform(df)
print("\nStandardized Data (Mean=0, Std=1):")
print(standardized[:5].round(2))

normalizer = Normalizer()
normalized = normalizer.fit_transform(df)
print("\nNormalized Data (Unit Norm):")
print(normalized[:5].round(2))

binarizer = Binarizer(threshold=0.5)
binarized = binarizer.fit_transform(df)
print("\nBinarized Data:")
print(binarized[:5])
