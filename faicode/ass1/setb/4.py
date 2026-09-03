user_input = input("You: ").lower()

if "hello" in user_input or "hi" in user_input:
    reply = "Hi!"
elif "name" in user_input:
    reply = "I am your assistant"
elif "bye" in user_input:
    reply = "Bye!"
else:
    reply = "Sorry, I don't understand that."

print("Chatbot:", reply)
