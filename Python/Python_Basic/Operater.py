# ตัวดำเนินการทางคณิตศาสตร์
x = 10
y = 3

print("ผลบวก" , x+y) # 10 + 3 = 13
print("ผลลบ" , x-y) # 10 - 3 = 7
print("ผลคูณ", x*y) # 10 * 3 = 30
print("ผลหาร", x/y) # 10 / 3 = 3.3333333333333335
print("หารปัดเศษ", x//y) # 10 // 3 = 3
print("ยกกำลัง", x**y) # 10^3 = 1000
print("หารเอาเศษ", x%y) # 10 % 3 = 1

#ตัวดำเนินการเปรียบเทียบ​
# นำข้อมูลอย่างน้อย 2 ค่ามาเปรียบเทียบกัน
# ชนิดข้อมูลเหมือนกัน
# คำตอบ 2 คำตอบ => จริง / เท็จ

x,y,z = 8, 7,5

print("ค่า x มากกว่า y หรือไม่ ? : ",x>y)
print("ค่า x น้อยกว่า y หรือไม่ ? :", x<y)
print("ค่า x เท่ากับ y หรือไม่ ? :", x==y)
print("ค่า x ไม่เท่ากับ y หรือไม่ ?",x!=y)

print("ค่า x มากกว่า หรือ เท่ากับ ค่า y หรือไม่ ?",x>=y)
print("ค่า x น้อยกว่า หรือ เท่ากับ ค่า y หรือไม่ ?", x<=y)

#และ
print("ค่า x มากกว่า y และ y มากกว่า z หรือไม่ ? : ",x>y>z)
print("ค่า x น้อยกว่า y และ y น้อยกว่า z หรือไม่ ? : ",x<y<z)

#ตัวดำเนินการทางตรรกศาสตร์
#AND = และ
#OR = หรือ
#NOT = ไม่

#คำตอบที่ได้ => จริง / เท็จ

x = (10>5) #ค่า x = bool
y = (10==5) #ค่า y = bool

# z = (5>10) and (10==5)
# 5>10 and 10 == 5 
z = (10>5) or (10==5)

print(not z)
