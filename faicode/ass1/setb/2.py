def calculate_interest(p, r, t):
    si = (p * r * t) / 100
    ci = p * ((1 + r / 100) ** t) - p
    return si, ci

p = float(input("Enter Principal (Rs): "))
r = float(input("Enter Rate (%): "))
t = float(input("Enter Time (years): "))

si, ci = calculate_interest(p, r, t)

print("Simple Interest: Rs.", si)
print("Compound Interest: Rs.", ci)
print("Difference: Rs.", abs(ci - si))
