from scipy.io import loadmat
import numpy as np
import matplotlib.pyplot as plt
from sklearn.linear_model import SGDClassifier

def displayImage(image) :
    plt.imshow(image.reshape(28,28),cmap=plt.cm.binary,interpolation='nearest')
    plt.show()

def displayPredict(clf,Actually_y,x) :
    print("Actually = ",Actually_y)
    print("Prediction = ",clf.predict([x])[0])

# Gradient Descent เป็นวิธีการนึงที่ใช้วนการวนหาค่าที่น้อยที่สุด ใช้ในการลดจำนวน Lose Function ของ Model
# Stochastic Gradient Descen
MNist_raw = loadmat("mnist-original.mat")
MNist = {
    "data" : MNist_raw["data"].T,
    "target" : MNist_raw["label"][0]
}
x = MNist["data"]
y = MNist["target"]

# Train , Test Set
# Train Set : 1-60000
# Test Set : 60001-70000
# Class 0-9
x_train,x_test,y_train,y_test = x[0:60000],x[60000:],y[0:60000],y[60000:]

# ต้องการจัดกลุ่มข้อมูลที่มีเป็นเลข 0 และไม่ใช่เลข 0
# Class 0,Other
# Data --> Model --> Class 0? --> True:False
predict_number = 5
y_train_0 = (y_train==0)
y_test_0 = (y_test==0)

sgd_clf = SGDClassifier()
sgd_clf.fit(x_train,y_train_0)
displayImage(x_test[predict_number])
displayPredict(sgd_clf,y_test_0[predict_number],x_test[predict_number])

