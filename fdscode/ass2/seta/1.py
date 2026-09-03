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