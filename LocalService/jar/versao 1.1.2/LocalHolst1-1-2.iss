<<<<<<< HEAD
; Script generated by the Inno Setup Script Wizard.
; SEE THE DOCUMENTATION FOR DETAILS ON CREATING INNO SETUP SCRIPT FILES!

[Setup]
; NOTE: The value of AppId uniquely identifies this application.
; Do not use the same AppId value in installers for other applications.
; (To generate a new GUID, click Tools | Generate GUID inside the IDE.)
AppId={{A302206E-EAC8-4EAB-9D96-118E429235C2}
AppName=Prodesp 1.1.2
AppVersion=1.1.2
;AppVerName=Prodesp 1.1.2
AppPublisher=Prodesp
AppPublisherURL=http://www.example.com/
AppSupportURL=http://www.example.com/
AppUpdatesURL=http://www.example.com/
DefaultDirName={pf}\Criaturinha\Prodesp-1-1-2
DisableDirPage=yes
DefaultGroupName=Prodesp
DisableProgramGroupPage=yes
OutputDir=C:\Users\Magna18\Desktop
OutputBaseFilename=setup1-1-2
Compression=lzma
SolidCompression=yes

[Languages]
Name: "brazilianportuguese"; MessagesFile: "compiler:Languages\BrazilianPortuguese.isl"

[Files]
Source: "C:\Users\Magna18\Downloads\TesteCriatura\versao 1.1.2\LocalDoCapeta.bat"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\Magna18\Downloads\TesteCriatura\versao 1.1.2\LocalDoCapeta.bat"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\Magna18\Downloads\TesteCriatura\versao 1.1.2\LocalService1-1-2.jar"; DestDir: "{app}"; Flags: ignoreversion
; NOTE: Don't use "Flags: ignoreversion" on any shared system files

[Icons]
Name: "{group}\Localholst"; Filename: "{app}\LocalDoCapeta.bat"

[Run]
Filename: "{app}\LocalDoCapeta.bat"; Description: "{cm:LaunchProgram,Localholst}"; Flags: shellexec postinstall skipifsilent

=======
; Script generated by the Inno Setup Script Wizard.
; SEE THE DOCUMENTATION FOR DETAILS ON CREATING INNO SETUP SCRIPT FILES!

[Setup]
; NOTE: The value of AppId uniquely identifies this application.
; Do not use the same AppId value in installers for other applications.
; (To generate a new GUID, click Tools | Generate GUID inside the IDE.)
AppId={{1F6E43CF-71CD-4E09-B669-D8F0AA350A09}
AppName=Assinatura Prodesp
AppVersion=1.1.2
;AppVerName=Assinatura Prodesp 1.1.1
AppPublisher=Prodesp
AppPublisherURL=http://www.example.com/
AppSupportURL=http://www.example.com/
AppUpdatesURL=http://www.example.com/
DefaultDirName={pf}\AssinaturaProdesp\Prodesp-1-1-2
DisableDirPage=yes
DefaultGroupName=Assinatura Prodesp v1-1-2
DisableProgramGroupPage=yes
OutputDir=setup
OutputBaseFilename=setup1-1-2
Compression=lzma
SolidCompression=yes

[Languages]
Name: brazilianportuguese; MessagesFile: compiler:Languages\BrazilianPortuguese.isl

[Tasks]
Name: desktopicon; Description: {cm:CreateDesktopIcon}; GroupDescription: {cm:AdditionalIcons}; Flags: unchecked

[Files]
Source: LocalService.bat; DestDir: {app}; Flags: ignoreversion
Source: LocalService.bat; DestDir: {app}; Flags: ignoreversion
Source: LocalService1-1-2.jar; DestDir: {app}; Flags: ignoreversion
; NOTE: Don't use "Flags: ignoreversion" on any shared system files

[Icons]
Name: {group}\Assinatura Prodesp; Filename: {app}\LocalService.bat
Name: {commondesktop}\Assinatura Prodesp; Filename: {app}\LocalService.bat; Tasks: desktopicon

[Run]
Filename: {app}\LocalService.bat; Description: {cm:LaunchProgram,Assinatura Prodesp}; Flags: shellexec postinstall skipifsilent
>>>>>>> home
