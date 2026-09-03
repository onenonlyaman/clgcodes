# FAI Code Collection

## Assignment 1

### Set A

#### 1. Print Welcome Message (`ass1/seta/1.py`)
```python
print("Welcome to Artificial Intelligence")
```

#### 2. Basic Arithmetic Operations (`ass1/seta/2.py`)
```python
a = float(input("Enter first number: "))
b = float(input("Enter second number: "))

print("Sum:", a + b)
print("Difference:", a - b)
print("Product:", a * b)
print("Division:", a / b)
```

#### 3. Employee Details (`ass1/seta/3.py`)
```python
name = input("Enter Name: ")
emp_no = input("Enter Employee Number: ")
salary = float(input("Enter Salary: "))

print("Name:", name)
print("Emp No:", emp_no)
print("Salary:", salary)
```

#### 4. List Operations (`ass1/seta/4.py`)
```python
players = ["Aman", "Rahul"]
print("Initial:", players)

players.append("Priya")
print("After append:", players)

players.extend(["Neha", "Rohan"])
print("After extend:", players)

players.insert(1, "Suresh")
print("After insert:", players)

players.remove("Rahul")
print("After remove:", players)

del players[0]
print("After delete:", players)
```

#### 5. Indentation using `if` Statement (`ass1/seta/5.py`)
```python
marks = int(input("Enter marks: "))

if marks >= 40:
    print("Status: Passed")
    print("Congratulations!")
else:
    print("Status: Failed")
    print("Better luck next time!")
```

---

### Set B

#### 1. Dictionary Student Record Topper (`ass1/setb/1.py`)
```python
students = {
    "Aman": 85.5,
    "Rahul": 92.0,
    "Priya": 78.4,
    "Neha": 88.6
}

topper = max(students, key=students.get)

print("Records:", students)
print("Topper:", topper, "with Percentage:", students[topper])
```

#### 2. Simple and Compound Interest Difference (`ass1/setb/2.py`)
```python
def calculate_interest(p, r, t):
    si = (p * r * t) / 100
    ci = p * ((1 + r / 100) ** t) - p
    return si, ci

p = float(input("Enter Principal (Rs): "))
r = float(input("Enter Rate (%): "))
t = float(input("Enter Time (years): "))

si, ci = calculate_interest(p, r, t)

print("Simple Interest   : Rs.", si)
print("Compound Interest : Rs.", ci)
print("Difference        : Rs.", abs(ci - si))
```

#### 3. Simple Reflex Agent for Fan Control (`ass1/setb/3.py`)
```python
temp = float(input("Enter room temperature in °C: "))

if temp > 35:
    action = "Turn Fan to High Speed"
elif temp > 25:
    action = "Turn Fan to Medium Speed"
elif temp > 18:
    action = "Turn Fan to Low Speed"
else:
    action = "Turn Fan OFF"

print("Action:", action)
```

#### 4. Rule-Based Chatbot (`ass1/setb/4.py`)
```python
user_input = input("You: ").lower()

if "hello" in user_input or "hi" in user_input:
    reply = "Namaste! How can I help you?"
elif "name" in user_input:
    reply = "I am Mitti, your AI assistant."
elif "bye" in user_input:
    reply = "Goodbye! Have a great day."
else:
    reply = "Sorry, I don't understand that."

print("Bot:", reply)
```

---

### Set C

#### 1. Model-Based Agent with Internal State (`ass1/setc/1.py`)
```python
memory = {"Room A": "Clean", "Room B": "Dirty"}

room = input("Enter Room (Room A/Room B): ")
perception = input("Enter Current Perception (Clean/Dirty): ")

if perception == "Dirty":
    action = "Clean the Room"
    memory[room] = "Clean"
elif memory[room] == "Clean":
    action = "Move to Next Room"
else:
    action = "Do Nothing"

print("Action Executed:", action)
print("Updated Memory State:", memory)
```

#### 2. Intelligent Agent Structure (`ass1/setc/2.py`)
```python
perception = input("Enter Perception (obstacle / clear / destination): ").lower()

if perception == "obstacle":
    decision = "Stop and Turn Right"
elif perception == "clear":
    decision = "Move Forward"
elif perception == "destination":
    decision = "Stop Vehicle"
else:
    decision = "Wait"

action = decision
print("Action Executed:", action)
```
