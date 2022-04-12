import cv2

# Input & Show
video = cv2.VideoCapture("image/Video.mp4")
while (video.isOpened()):
    check,frame = video.read()
    if check == True :
        frame = cv2.cvtColor(frame,cv2.COLOR_BGR2GRAY) # เปลี่ยนเป็นภาพ GrayScale
        cv2.imshow("Output",frame,)
        if cv2.waitKey(1) & 0xFF == ord("e"):break
    else : break
video.release()
cv2.destroyAllWindows()

# Output
cap = cv2.VideoCapture(0)
fourcc = cv2.VideoWriter_fourcc(*'XVID')
result = cv2.VideoWriter("image/Output.avi",fourcc,60.0,(640,480)) # ไฟล์ ,รูปแบบ , FPS , ขนาด
while (cap.isOpened()):
    check,frame = cap.read()
    if check == True :
        cv2.imshow("Output",frame)
        result.write(frame) # สั่งเขียน Video
        if cv2.waitKey(1) & 0xFF == ord("e"):break
    else : break

result.release()
cap.release()
cv2.destroyAllWindows()