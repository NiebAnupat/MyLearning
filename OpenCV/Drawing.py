import cv2

# Read Image
img = cv2.imread("image/cat.jpg",1)
img = cv2.resize(img, (700, 700))
cv2.imshow("Title", img)
cv2.waitKey(delay=0)
cv2.destroyAllWindows()

# Draw Line
# line(image, start(x,y), end(x,y), color(BGR), thickness)
cv2.line(img,(0,0),(700,700),(0,0,255),10)
cv2.arrowedLine(img,(20,0),(400,350),(255,0,0),10)
cv2.imshow("Title", img)
cv2.waitKey(delay=0)
cv2.destroyAllWindows()

# Draw Rectangle
# rectangle(image, มุมบนซ้าย(x,y), มุมล่างขวา(x,y), color(BGR), thickness)
cv2.rectangle(img,(250,250),(450,450),(0,255,0),10)
cv2.imshow("Title", img)
cv2.waitKey(delay=0)
cv2.destroyAllWindows()

# Draw Circle
# rectangle(image, center(x,y), radius , color(BGR), thickness)
cv2.circle(img,(420,535),80,(230,100,140),-1)
cv2.imshow("Title", img)
cv2.waitKey(delay=0)
cv2.destroyAllWindows()

# Text
# putText(image , Text , positions(x,y) , Font , Size , Color , Thickness)
cv2.putText(img,"Test Text",(20,222),cv2.FONT_HERSHEY_COMPLEX,2.5,(100,23,240),cv2.LINE_4)
cv2.imshow("Title", img)
cv2.waitKey(delay=0)
cv2.destroyAllWindows()