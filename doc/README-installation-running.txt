Installing Eclipse

	Unzip Eclipse in $ECLIPSE_DIR
	
	
Installing the server

	cd $ECLIPSE_DIR$/eclipse
	
	Copy FormatterEclipseServer.zip to $ECLIPSE_DIR$/eclipse 
   
	Unzip FormatterEclipseServer.zip - which creates plugins/*.jar and res 
   	
First time - unblocking the port

	sudo ufw allow 8846/tcp

Running the server as headless Eclipse

	cd $ECLISE_DIR/eclipse

	screen
	
	Ctrl-a Shift-a  # To give a meaningful name to the current window:
	   
	./eclipse -nosplash -application FormatterEclipseServer.id -debug -consoleLog deployment 

	References:
		http://blogs.operationaldynamics.com/andrew/software/java-gnome/eclipse-code-format-from-command-line
		
		
Accessing the web site

	http://annieying.ca:8846/Formatter
