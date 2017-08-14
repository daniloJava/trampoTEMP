@echo off 
start javaw -jar "C:\Program Files (x86)\AssinaturaProdesp\Prodesp-1-1-2\LocalService1-1-2.jar"
sc create LocalAssinatura binPath= "C:\Program Files (x86)\AssinaturaProdesp\Prodesp-1-1-2\LocalService.bat" start= auto