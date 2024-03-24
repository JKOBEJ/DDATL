# DDATL

Implementation of the Source model simplification in Model Transformations.  Here is a brief introduction to the content of each folder:



## HDD

A python3 package "Picireny " is needed to execute it, and you can use this HDD tool by customizing the "test_cli. py" file. Our HDD Moudle implementation is located in the "\HDD\tests\xml_HDD" directory.



## OCL

This is a JAVA project that includes the process of Failure-revealing capability checking. You can execute this process by running the "TestOcl.java" file in the "\OCL\src" directory.



## OCL_jar

This folder contains the jar package corresponding to the JAVA project mentioned above, which includes the necessary jars for ATL Transformation and OCL checking process.



## SBFL

This folder contains the entire SBFL evaluation process,  and you can execute this process by running the "FaultLocalizationMT_Main.java" file in the "\SBFL\src\es\us\eii\fault\localization\mt\main" directory. The execution results will be displayed on the console and saved in Excel files.



## result data

This folder contains our experimental evaluation results. Among them, "reducion_result" corresponds to the evaluation result in RQ1 of the article, and "SPFL_result" corresponds to the result in RQ2.



### reduction_result

- before_reduction: Initial source model set before simplification	
- after_reduction: Final source model set after simplification in In different testing "scenarios".



### SPFL_result

- models_XXX_yuan: SBFL results of the initial source model set.
- models_XXX_after: SBFL results after using simplification method.
- models_XXX_gen:  SBFL results of using simplification method as a source model generator.