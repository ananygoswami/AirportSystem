import java.io.*;
import java.util.*;

class Ticket{
	
	
static double rate = 3500;
static void create(String username, String password, int tickets){
	try
	{
	String store = "";
	String det="";
	double cost = (rate*tickets)*1.18;
	if(cost>=10000)
		cost=0.85*cost;
	store="username is:" +username+"\npassword is:"+password+"\nnumber of tickets:"+String.valueOf(tickets)+"\ncost of tickets is:"+String.valueOf(cost)+
"\n ********************************************* \n THANKYOU";
	FileOutputStream fo = new FileOutputStream(username+".txt");
	fo.write(store.getBytes());
	}
	catch(Exception e)
	{System.out.println(e);}
}



static void display(String username){
	try{
	FileInputStream fo = new FileInputStream(username+".txt");
	String store = "";
	int i;
	while((i=fo.read())!=-1){
		store+=(char)i;
	}
	String details[] = store.split("\\r?\\n");
	for(i=0;i<details.length;i++){
		System.out.println(details[i]);
	}
	}catch(Exception e){}
}


static String password(String username){
	String PASS = ""; 
	try
	{
	FileInputStream fo = new FileInputStream(username+".txt");
	String store = "";
	int i;
	while((i=fo.read())!=-1){
		store=store+(char)i;
	}

	String details[] = store.split("\\r?\\n");
	String[] P=details[1].split(":");
	PASS=P[1];
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return PASS;
}	

}						