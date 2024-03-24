import sys


with open(sys.argv[1], 'r',encoding="utf-8") as f:
    x = f.read()
result=x

with open("C:\\Users\\jjp\\Desktop\\OCL\\ModelTrans_Test\\scenarios\\scenario1\\AutomaticModel_ecore1.xmi","w") as f1:
    f1.write(result)

f1.close()
f.close()