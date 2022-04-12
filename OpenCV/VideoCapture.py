import cv2

# เปิดกล้องด้วย OpenCV
cap = cv2.VideoCapture(0) # กำหนดกล้อง
while (True):
    check,frame = cap.read() # รับภาพจากกล้อง frame by frame
    cv2.imshow("Output",frame)
    if cv2.waitKey(1) & 0xFF == ord("e"):break # กดตัว e เพื่อออกจากลูปแสดงผลภาพจากกล้อง

cap.release()
cv2.destroyAllWindows()
