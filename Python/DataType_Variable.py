# Data Type & Variable
# ชื่อตัวแปร = ค่าที่เก็บในตัวแปร

x = 20 # integer
y = 3.99 # float
z = True # boolean
arr = [x, y, z, "Anupat"] # list
arr2 = x, y, z, "Anupat" # tuple

print("ผลลัพธ์ = "+str(x)) # แปลงค่า integer เป็น str
print(y)
print(z)
print(arr)

#เช็ก DataType F โดยจะแสดงผลชื่อ DataType ออกมา
print(type(y))
print(type("Anupat"))
print(type(z))
print(type(arr))
print(type(arr2))

#Type Coversion
a = 10
b = 3.14
c = "20"

c1 = int(c) # "20" = > 20 == string => int 
a1 = str(a) # 10 => "10" == int => string 
b1 = float(b) # string => float
b2 = str(b) # float => string
a2 = float(a) # int => float
b3 = int(b) # float => int

# บวกเลข 
result1 = float(a) + b # 10+3.14 = 13.14
result2 = str(a) + c # "10" + "20" ="1020"

print("Result 1 : " , result1)
print("Result 2 : " , result2)

