python %~f0\..\sut-xml-load-copy.py %1
cd C:\Users\jjp\Desktop\OCL
java -jar OCL.jar
python %~f0\..\OCL.py %1 | find "FAIL" >NUL 2>&1

