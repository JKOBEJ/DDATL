#!/usr/bin/env python3

import sys


with open(sys.argv[1], 'r',encoding="utf-8") as f:
    x = f.read()

print(x)
# s = repr(j)

# print(sys)

# with open("C:\\Users\\JJP\\PycharmProjects\\pythonProject\\ModelTrans_Test\\scenarios\\scenario1\\AutomaticModel_BibTex1.xmi","w") as f1:
#     f1.write(x)
#     f1.close()

# with open("C:\\Users\\JJP\\Desktop\\test1.txt","a") as f2:
#     f2.write(sys.argv[1])
#     f2.write("\n\n")
#     f2.close()

