import numpy as np
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression

# จำลองข้อมูล
x = np.random.rand(50) * 10
y = 2*x+np.random.rand(50)

# Linear Regression Model
model = LinearRegression()

# Train Algorithms
# x ที่ส่งเข้าไปใน model ต้องเป็น Array 2D
x_2D = x.reshape(-1,1)
model.fit(x_2D, y) # ส่งข้อมูลเข้าไป Train ใน Model

# print(model.score(x_2D,y)) # วัดค่าตัวแปรตอบสนองหรือการพยากรณ์หาค่า y
# print(model.intercept_)
# print(model.coef_)

# Test Model
xfit = np.linspace(-1,11)
xfit_2D = xfit.reshape(-1,1)
yfit = model.predict(xfit_2D)

# Analysis Model
plt.scatter(x, y)
plt.plot(xfit, yfit)
plt.xlabel('xfit')
plt.ylabel('yfit')
plt.show()