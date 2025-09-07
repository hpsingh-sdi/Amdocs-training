Python Assignment

######Tuples######

#1
product = ("Laptop",50000,"Black",'Samsung','Electronics')
print("Products : ",product)

#2
print(product[1])   #second element in product tuple

#3
result = product[-2:]   #Last two elements
print(result)

#4
if "Electronics" in product:
    print("Present")
else:
    print("Not Present")

#5
prices = (1000,1500,1200,1200,1100,900)
print(prices.count(1000))

#6
min = min(prices)
max = max(prices)
print("Min : ",min," Max : ",max)

#7
for item in product:
    print(item)

#8
new_product = list(product)
new_product[1]=55000
product = tuple(new_product)
print(product)

#9
tuple2 = ('In Stock',)
product = product+tuple2
print(product)

#10
new_product = list(product)
new_product.remove("Electronics")
product = tuple(new_product)
print(product)

#11
a,b,*rest = product
print(a,b,*rest)

#12
prod1 = ('iPhone',50000)
prod2 = ('TV',100000)
prod3 = ('Fridge',30000)

final_tuple = (prod1,prod2,prod3)  #nested tuple
print(final_tuple[1][0])

######Functions######

num2 = 20
def fun1(num1):
    def factorial(a):
        result = 1
        for i in range(1,a):
            result *= i
        return result
    def area(a,b):
        return a*b
    
    res1 = factorial(num1)
    res2 = area(num1,num2)
    return res1, res2

m, n = fun1(5)
print(m,n)

