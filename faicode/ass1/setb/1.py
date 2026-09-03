students = {
    "Aman": 85.5,
    "Rahul": 92.0,
    "Priya": 78.4,
    "Neha": 88.6
}

topper = max(students, key=students.get)

print("Records:", students)
print("Topper:", topper, "with Percentage:", students[topper])
