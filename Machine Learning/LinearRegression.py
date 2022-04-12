import numpy as np
import matplotlib.pyplot as plt

# Linear Regression การถดถอยเชิงเส้น
# ใช้ plot กราฟดูความสัมฟันธ์ระหว่างตัวแปร 2 ตัว
# สูตรคือ y = ax+b : a = ค่าคงที่  x = sample space  b = ค่าคงที่ระยะตัดแกน y

# สุ่มค่าใส่ในตัวแปร x
x = np.linspace(-5,5,100)
# print(x)
y = 2*x+1

plt.plot(x,y,'-r',label="y = 2x + 1")
plt.xlabel('x')
plt.ylabel('y')
plt.legend(loc="upper left")
plt.title("Graph y = 2x +1")
plt.grid()
plt.show()