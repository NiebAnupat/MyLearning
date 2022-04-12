import numpy as np
import matplotlib.pyplot as plt

# การกระจายข้อมูล (Scatter)
# ใช้ plot แผนภาพการประจายของข้อมูลเป็นกลุ่ม ๆ
# สูตรคือ y = ax+c : a = ค่าคงที่  x = sample space  c = ค่าคงที่ระยะตัดแกน y
# ค่าคงที่ที่ใส่ไปจะทำให้เกิดการกระจายตัวของข้อมูล


# สุ่มค่าใส่ในตัวแปรแต่ละตัว
x = np.random.rand(50) * 10
a = np.random.rand() * 100
c = np.random.randn(50)
y = 2*x+c

plt.scatter(x, y,)
plt.xlabel('x')
plt.ylabel('y')
plt.show()

