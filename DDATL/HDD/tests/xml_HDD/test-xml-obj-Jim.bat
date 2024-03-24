@echo off
python %~f0\..\sut-xml-load.py %1
java -jar C:\Users\JJP\PycharmProjects\pythonProject\OCL.jar
python %~f0\..\sut-xml-load01.py %1 | find "FAIL" >NUL 2>&1