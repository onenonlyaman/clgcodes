import os
import pandas as pd
import numpy as np

if os.path.exists("Student_Marks.csv"):
    df = pd.read_csv("Student_Marks.csv")
else:
    df = pd.read_csv("https://raw.githubusercontent.com/selva86/datasets/master/Student_Marks.csv")

print("Top 5 Records:")
print(df.head(5))

labels = ["Poor", "Below_Average", "Average", "Above_Average", "Excellent"]
df["Performance"] = pd.cut(df["Marks"], bins=5, labels=labels)

print("\nFirst 10 Rows of Updated Dataset:")
print(df.head(10))
