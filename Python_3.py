import os
import shutil

# 1. Write Operation
def write_students():
    with open("students.txt", "w") as f:
        n = int(input("Enter number of students: "))
        for i in range(n):
            name = input(f"Enter name of student {i+1}: ")
            roll = input("Enter roll number: ")
            marks = input("Enter marks: ")
            f.write(f"{name}, {roll}, {marks}\n")
    print("Data written to students.txt")

# 2. Read Operation
def read_students():
    if os.path.exists("students.txt"):
        with open("students.txt", "r") as f:
            print("\n--- Student Records ---")
            print(f.read())
    else:
        print("students.txt not found.")

# 3. Rename Operation
def rename_file():
    if os.path.exists("students.txt"):
        os.rename("students.txt", "student_records.txt")
        print("File renamed to student_records.txt")
    else:
        print("students.txt not found.")

# 4. Directory Operations
def directory_operations():
    # Create directory
    if not os.path.exists("SchoolData"):
        os.mkdir("SchoolData")
        print("Directory SchoolData created.")

    # Move 
    if os.path.exists("student_records.txt"):
        shutil.move("student_records.txt", "SchoolData/student_records.txt")
        print("student_records.txt moved into SchoolData directory.")

    # List 
    print("\nFiles inside SchoolData directory:")
    print(os.listdir("SchoolData"))

# 5. Delete Operation
def delete_operations():
    file_path = "SchoolData/student_records.txt"
    dir_path = "SchoolData"

    # Delete 
    if os.path.exists(file_path):
        os.remove(file_path)
        print("student_records.txt deleted from SchoolData directory.")

    # Delete
    if os.path.exists(dir_path):
        os.rmdir(dir_path)
        print("SchoolData directory deleted.")

#  Menu 
while True:
    print("\nStudent Record File Menu ")
    print("1. Write student records")
    print("2. Read student records")
    print("3. Rename file")
    print("4. Directory operations")
    print("5. Delete operations")
    print("6. Exit")

    choice = input("Enter your choice : ")

    if choice == "1":
        write_students()
    elif choice == "2":
        read_students()
    elif choice == "3":
        rename_file()
    elif choice == "4":
        directory_operations()
    elif choice == "5":
        delete_operations()
    elif choice == "6":
        print("Exiting program... Goodbye!")
        break
    else:
        print("Invalid choice, please try again.")
