#!/usr/bin/env python3

import json
import sys


with open(sys.argv[1], 'r') as f:
    j = json.load(f)


print("%s" % repr(j))
s = repr(j)

print(sys)

with open("C:\\Users\\JJP\\Desktop\\test.txt","a") as f1:
    f1.write(s)
    f1.write("\n\n")
    f1.close()

with open("C:\\Users\\JJP\\Desktop\\test1.txt","a") as f2:
    f2.write(sys.argv[1])
    f2.write("\n\n")
    f2.close()

