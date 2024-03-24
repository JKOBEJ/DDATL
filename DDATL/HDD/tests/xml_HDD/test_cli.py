
# Copyright (c) 2016-2021 Renata Hodovan, Akos Kiss.
#
# Licensed under the BSD 3-Clause License
# <LICENSE.rst or https://opensource.org/licenses/BSD-3-Clause>.
# This file may not be copied, modified, or distributed except
# according to those terms.

import os
from shutil import copyfile

def test_cli():
    list = [
        16,
        41,
        42,
        48,
        61,
        64,
        67,
        72,
        78,
        79,
        86,
        89,
        93,
        98,
    ]
    for i in range(1,101):
        if i in list :

            p1 = "C:/Users/jjp/Desktop/yuan/models_Ecore2Maude/scenarios"
            p2 = "scenario"+str(i)

            p3 = "AutomaticModel_ecore" + str(i) + ".xmi"
            path = os.path.join(p1,p2,p3)
            source = path
            target = "C:\\Users\\jjp\\Desktop\\OCL\\ModelTrans_Test\\scenarios\\scenario1\\AutomaticModel_ecore1.xmi"
            # adding exception handling
            try:
                copyfile(source, target)
            except IOError as e:
                exit(1)
            except:
                exit(1)
            os.system('picireny --input="C:/Users/jjp/Desktop/OCL/ModelTrans_Test/scenarios/scenario1/AutomaticModel_ecore1.xmi" --test="D:/PycharmProjects/HDD/tests/xml_resources/test-xml-demo.bat" --grammar HTMLLexer.g4 HTMLParser.g4 --start htmlDocument')



