import pandas as pd
MyFriend = [[1,"เนี๊ยบ","อนุภัทร"],[2,"เนย","สุกัลยา"],[3,"มุก","พิมุกต์"],[4,"ไอซ์","สุชานาถ"],[5,"อิง","ธนรัฐ"],[6,"พี","พิพัฒต์"]]
#columns = ["รหัส","ชื่อเล่น","ชื่อจริง"]
df = pd.DataFrame(MyFriend,columns = ["รหัส","ชื่อเล่น","ชื่อจริง"])
#print(df)
#print(df[["ชื่อเล่น","ชื่อจริง"]])
print(df.loc[1,["ชื่อเล่น","ชื่อจริง"]])