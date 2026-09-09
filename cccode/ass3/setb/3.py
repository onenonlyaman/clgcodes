num = int(input("Enter decimal number: "))

if num == 0:
    print("Hexadecimal: 0")
else:
    hex_chars = "0123456789ABCDEF"
    hex_val = ""
    temp = num
    while temp > 0:
        rem = temp % 16
        hex_val = hex_chars[rem] + hex_val
        temp //= 16
    print("Hexadecimal:", hex_val)
