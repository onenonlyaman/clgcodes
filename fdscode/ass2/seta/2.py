import pandas as pd
dictionary = {
    'month': ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"],
    'sales': [120, 150, 130, 170, 160, 180, 200, 190, 210, 220, 230, 240]
}

df = pd.DataFrame(dictionary)

max_sales = df['sales'].max()
min_sales = df['sales'].min()
range_sales = max_sales - min_sales
variance_sales = df['sales'].var()
sd_sales = df['sales'].std()

print("Range:", range_sales)
print("Variance:", variance_sales)
print("Standard Deviation:", sd_sales)