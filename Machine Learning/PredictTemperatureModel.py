import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn import metrics

dataset = pd.read_csv("Weather.csv",low_memory=False)

# Train & Test Set
x = dataset["MinTemp"].values.reshape(-1,1)
y = dataset["MaxTemp"].values.reshape(-1,1)
# Train 80% Test 20%
x_train,x_test,y_train,y_test = train_test_split(x,y,test_size=0.2,random_state=0)

# Training Algorithms
model = LinearRegression()
model.fit(x_train,y_train)

# Test Model
y_pred = model.predict(x_test) # นำข้อมูลที่แบ่งไว้ไปพยากรณ์ผลลัพธ์ที่จะเกิดขึ้นแล้วเก็บไว้ในตัวแปร y_pred แล้วถึงนำผลไปเปรียบเทียบกับข้อมูลของจริงว่าตรงกันมากน้อยแค่ไหน

# plt.scatter(x_test,y_test,c='r') # ชุดข้อมูลจริง
# plt.plot(x_test,y_pred,c='b',linewidth=2) # ชุดข้อมูลที่ทำนายได้
# plt.show()

# Compare predictdata and testdata
df = pd.DataFrame({"Actually" : y_test.flatten(), "Predicted" : y_pred.flatten()})
df1 = df.head(20)
# df1.plot(kind="bar",figsize=(16,10))
# plt.show()

# วัดผลความแม่นยำ
print("MAE : ",metrics.mean_absolute_error(y_test,y_pred)) # ค่าความเข้าใกล้ระหว่าง y_pred และ y_test ยื่งเข้าใกล้ 0 ยิ่งแม่นยำ
print("MSE : ",metrics.mean_squared_error(y_test,y_pred)) # ค่าความผันแปรของ y_pred และ y_test
print("RMSE : ",np.sqrt(metrics.mean_squared_error(y_test,y_pred)))
print("Score : {:.2f} %".format(metrics.r2_score(y_test,y_pred)*100)) # แสดงค่าความแม่นยำโดยรวม

# print(dataset.describe())
# dataset.plot(x='MinTemp', y='MaxTemp',style='o')
# plt.title("Min & Max Temp")
# plt.xlabel("Mim Temp")
# plt.ylabel("Max Temp")
# plt.show()