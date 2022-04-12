from fontTools.merge import cmap
from sklearn import datasets
from scipy.io import loadmat
import matplotlib.pyplot as plt
import pylab

MNist_raw = loadmat("mnist-original.mat")
MNist = {
    "data" : MNist_raw["data"].T,
    "target" : MNist_raw["label"][0]
}
x = MNist["data"]
y = MNist["target"]

number = x[6434]
number_img = number.reshape(28,28)
print(y[6434])
plt.imshow(number_img,plt.cm.binary,interpolation="nearest")
plt.show()

# MNist_Dataset = datasets.load_digits()
# print(MNist_Dataset.target[9])
# # pylab.imshow(MNist_Dataset.images[9],cmap=pylab.cm.gray_r)
# # pylab.show()
# print(MNist_Dataset.target[9])
# plt.imshow(MNist_Dataset.images[9],cmap=plt.get_cmap("gray"))
# plt.show()