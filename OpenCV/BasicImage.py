import cv2

# Input & Show Image
img = cv2.imread("image/cat.jpg",0) # 0 = GrayScale 1 = RGBImage -1 = Add alpha
img = cv2.resize(img, (400, 400)) # ปรับขนาดภาพ กว้าง * ยาว
cv2.imshow("Title", img) # คำสั่งที่ใช้แสดงภาพ
# cv2.waitKey(delay=5000) # Delay 5 วิ
cv2.waitKey(delay=0) # ถ้าใส่ 0 จะไม่นับถอยหลัง
cv2.destroyAllWindows() # ปิดหน้าต่างทั้งหมด

# Export Image
cv2.imwrite("image/cat_GrayScale.jpg",img)