# Flags

1) Download *svg files
2) Add prefix:
 - open cmd in folder
 - run following command: `(Get-ChildItem -File) | Rename-Item -NewName {$_.Name -replace "^","ic_flag_1x1_"}`
3) Import all drawables using:
https://stackoverflow.com/a/61960728/3753104
```
Tools → Resource Manager
Select the Drawable tab
Click the + button in the top left corner
Select Import Drawables
```
