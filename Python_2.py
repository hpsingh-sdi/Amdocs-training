#Python Assignment

#1
print(*range(10,21,2))

#2
while True:
    num = int(input("Enter a positive number : "))
    if num == 0:
        break;
    print("you entered:",num)

#3
n = int(input("Enter a number : "))
i = 1
fact = 1
while i < n:
    fact = fact * i
    i = i+1
print(fact)


#4 (using nested if-else)
score = int(input("Enter score: "))

if score > 90:
    grade = "A"
else:
    if score > 80:
        grade = "B"
    else:
        if score > 70:
            grade = "C"
        else:
            if score > 60:
                grade = "D"
            else:
                grade = "F"

print("Grade:", grade)

#5
day = int(input("Enter a number (1-7): "))

match day:
    case 1:
        print("Monday")
    case 2:
        print("Tuesday")
    case 3:
        print("Wednesday")
    case 4:
        print("Thursday")
    case 5:
        print("Friday")
    case 6:
        print("Saturday")
    case 7:
        print("Sunday")
    case _:
        print("Invalid input")

#6
scores = []

scores.extend([85, 90, 78, 92, 88])

scores.insert(2, 80)

scores.remove(92)

scores.sort()

scores.reverse()

print("Max score:", max(scores))
print("Min score:", min(scores))

print("Is 90 in the list?", 90 in scores)

print("Total scores:", len(scores))

print("First 3 scores:", scores[:3])

print("All scores:")
for s in scores:
    print(s)

print("Last score:", scores[-1])

scores[2] = 95
print("Updated scores:", scores)

copied_scores = scores.copy()
print("Copied list:", copied_scores)
