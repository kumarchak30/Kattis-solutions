text = input()
key = input()
key = [int(key[i:i+3]) - 1 for i in range(0, len(key), 3)]
phrase = ''
for c in key:
    phrase += text[c]
print(phrase)