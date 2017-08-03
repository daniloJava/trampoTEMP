@echo off 
start javaw -jar "C:\Program Files (x86)\Criaturinha\Prodesp-1-1-2\LocalService1-1-2.jar"
sc create LocalAssinatura binPath= "C:\Program Files (x86)\Criaturinha\Prodesp-1-1-2\LocalDoCapeta.bat" start= auto