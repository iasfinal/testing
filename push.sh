while true
	do	
	no=1
	x=$(git status services workflows xml|awk 'END {print $NF}')
	echo $x
	if [ $x == 'clean' ]; then
	               echo nothing to do
	else
		git add services workflows xml
		git commit -m " "+$no
		git push -u origin master
	            fi
	 sleep 10
	 done
