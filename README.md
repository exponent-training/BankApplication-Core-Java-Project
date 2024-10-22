# BankApplication-Core-Java-Project

Steps to generate Runnable Jar:
	1. Click on File tab, select Export from the menu.
	2. Export window will get open, type Runnable Jar file in export wizard.
	3. Click on Runnable Jar file & then Next.
	4. Runnable Jar file Export window will get open.
	5. Add Runnable Jar file specifications as mention below:
		1. Launch configuration : Mention the class name having main method present in the class.(for example: Controller class having main method) .
		2. Export Destination: Mention the path of destinaltion folder along with whatever jar file name you want to create with .jar extension
		(for example:- D:\Runnablefiles\BankAdminController.jar)
		3.Click on Finish.
		4. Your jar file get created.
		5. Now go to your folder location where you have placed runnable jar file and then open cmd.
		6. In cmd run the command java -jar BankAdminController.jar
		7. Now your application will be running on cmd.