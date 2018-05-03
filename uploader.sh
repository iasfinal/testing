while true
do
	cd serv_up	
	unzip *.zip
	rm *.zip
	mv * /home/alpha306/repo/final_push/services
	
	cd /home/alpha306/repo/final_push
	
	cd work_up
	unzip *.zip
	rm *.zip
	mv * /home/alpha306/repo/final_push/workflows

	cd /home/alpha306/repo/final_push

	cd xml_up
	unzip *.zip
	rm *.zip
	mv * /home/alpha306/repo/final_push/xml

	cd /home/alpha306/repo/final_push
	
	sleep 10
done
