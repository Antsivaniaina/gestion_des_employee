[Setup]
AppName="Gestion des Employées"
AppVersion=1.0
DefaultDirName={pf}\"Gestion des Employées"
OutputDir="G:\projetjava\Gestion_des_employes\dist\"
OutputBaseFilename=Gestion_des_employées_Setup
Compression=lzma2
SolidCompression=yes

[Files]
Source: "G:\projetjava\Gestion_des_employes\dist\Gestion_des_Employ_es.jar"; DestDir: "{app}"; Flags: ignoreversion
Source: "G:\projetjava\Gestion_des_employes\dist\Projet_Java.db"; DestDir: "{app}"; Flags: ignoreversion
Source: "G:\projetjava\Gestion_des_employes\dist\conf.properties"; DestDir: "{app}"; Flags: ignoreversion
Source: "G:\projetjava\Gestion_des_employes\dist\lib\*"; DestDir: "{app}\lib"; Flags: recursesubdirs createallsubdirs
Source: "C:\Users\Antsivaniaina\Downloads\Programs\jre-8u371-windows-x64.exe"; DestDir: "{tmp}"; Flags: deleteafterinstall

[Icons]
Name: "{commondesktop}\Gestion_des_employées"; Filename: "{app}\Gestion_des_Employ_es.jar"; WorkingDir: "{app}"; IconFilename: "{app}\Gestion_des_Employ_es.jar"



[Run]
Filename: "{tmp}\jre-8u371-windows-x64.exe"; Parameters: "/s"; StatusMsg: "Eto ampanatontosana ny angatahanao izahay ... Mahandrasa kely azafady ..."; Flags: waituntilterminated
