@echo off 
start javaw -jar "C:\Program Files (x86)\Criaturinha\Prodesp-1-1-0\LocalService1-1-0.jar"
sc create LocalAssinatura binPath= "C:\Program Files (x86)\Criaturinha\Prodesp-1-1-0\LocalDoCapeta.bat" start= auto