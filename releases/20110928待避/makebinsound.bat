echo makebinone sound

cd sound/src
:: copy ..\..\..\src\ConsoleTextArea.java ConsoleTextArea.java
copy ..\..\..\src\Turtle.java Turtle.java
copy ..\..\..\src\TurtleLaunchApplet.java TurtleLaunchApplet.java

:: xcopy ..\..\..\src\blib\sound\BSound.java .\ /S /E /H /C /Y /R
:: xcopy ..\..\..\src\obpro .\obpro\ /S /E /H /C /Y /R

cd ..
mkdir bin
copy src\*.jpg bin\*.jpg
copy src\*.gif bin\*.gif
copy src\*.png bin\*.png
copy src\*.mid bin\*.mid
copy src\*.wav bin\*.wav
copy src\*.mp3 bin\*.mp3
javac -target 1.5 -sourcepath src -d bin src/*.java
jar cvf binary.jar -C bin .
cd ..

make‚É‚ ‚Á‚½‚â‚Â
:: 20090309 editted by hashiyaman
rem for /D %%i in (intro* chapter* sound*) do	xcopy %%i\src html4\%%i\src\ /S /E /H /C /Y /R
rem xcopy introduction_cns\html html4\introduction_cns\html\ /EXCLUDE:copy_exclude_list.txt /S /E /H /C /Y /R