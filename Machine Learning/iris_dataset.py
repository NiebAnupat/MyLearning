import seaborn as sb
import matplotlib.pyplot as plt
from sklearn import datasets
from sklearn.model_selection import train_test_split

# Load dataset
#iris_dataset = datasets.load_iris()
iris_dataset = sb.load_dataset("iris")

sb.set()
sb.pairplot(iris_dataset,hue="species",size=2)
plt.show()

# split dataset
# x_train,x_test,y_train,y_test = train_test_split(iris_dataset["data"],iris_dataset["target"],test_size=0.2,random_state=0)
# print(x_train.shape)
# print(x_test.shape)
# print(y_train.shape)
# print(y_test.shape)

# total 150
# train 75% = 112
# test 25# = 38

# total 150
# train 80% = 120
# test 20# = 30