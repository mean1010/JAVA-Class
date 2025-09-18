@echo off
echo === Current Git Status ===
git status

echo.
echo === Current Remote Repositories ===
git remote -v

echo.
echo === Removing old remote repositories ===
git remote remove origin
git remote remove upstream

echo.
echo === Adding new JAVA-Class repository ===
git remote add origin https://github.com/mean1010/JAVA-Class.git

echo.
echo === Verifying new remote ===
git remote -v

echo.
echo === Setting upstream branch ===
git branch -M main
git push -u origin main

echo.
echo Setup complete!
pause
