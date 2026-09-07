import pandas as pd
from sklearn.preprocessing import LabelEncoder

df = pd.read_csv("StudentData.csv")

print("Statistical Description:")
print(df.describe())

print("\nShape of Dataset:")
print(df.shape)

print("\nFirst Three Rows:")
print(df.head(3))

df["Age"] = df["Age"].fillna(df["Age"].mean())
df["Fees"] = df["Fees"].fillna(df["Fees"].mean())

print("\nAfter Handling Missing Values:")
print(df)

df = pd.get_dummies(df, columns=["City"])
le = LabelEncoder()
df["Admitted"] = le.fit_transform(df["Admitted"])

print("\nAfter Categorical Encoding:")
print(df)
