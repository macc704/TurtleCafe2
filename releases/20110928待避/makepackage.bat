call ant makedir
cd working
call makebin
call make
cd ..
call ant createzip
call ant clean
