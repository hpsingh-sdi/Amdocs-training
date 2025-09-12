products = [
    ("Laptop", 50000, 10),
    ("Mobile", 20000, 15),
    ("Headphones", 1500, 25)
]

# (a) Function to display products
def display_products():
    if not products:
        print("No products in inventory.")
    else:
        print("\n--- Product List ---")
        for name, price, qty in products:
            print(f"Name: {name}, Price: {price}, Quantity: {qty}")
        print("--------------------")

# (b) Function to add a new product
def add_product(name, price, qty):
    products.append((name, price, qty))
    print(f"Product '{name}' added successfully!")

# (c) Function to update stock quantity
def update_stock(product_name, new_qty):
    for i, (name, price, qty) in enumerate(products):
        if name.lower() == product_name.lower():
            products[i] = (name, price, new_qty)
            print(f"Stock updated for {name}. New quantity: {new_qty}")
            return
    print(f"Product '{product_name}' not found.")

# (d) Function to calculate total inventory value
def total_value():
    total = 0
    for name, price, qty in products:
        total += price * qty
    return total


#  Menu 
while True:
    print("\nProduct Inventory Menu ")
    print("1. Display Products")
    print("2. Add Product")
    print("3. Update Stock")
    print("4. Show Total Inventory Value")
    print("5. Exit")

    choice = input("Enter your choice : ")

    if choice == "1":
        display_products()
    elif choice == "2":
        name = input("Enter product name: ")
        price = int(input("Enter product price: "))
        qty = int(input("Enter product quantity: "))
        add_product(name, price, qty)
    elif choice == "3":
        product_name = input("Enter product name to update: ")
        new_qty = int(input("Enter new quantity: "))
        update_stock(product_name, new_qty)
    elif choice == "4":
        print("Total Inventory Value:", total_value())
    elif choice == "5":
        print("Exiting program")
        break
    else:
        print("Invalid choice. Please enter between 1 and 5.")
