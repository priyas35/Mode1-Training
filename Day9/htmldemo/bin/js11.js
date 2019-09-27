/**
 * 
 */
function show(){
	var res="";
	var obj=new Date();
	var fullyear=obj.getFullYear();
	var future=new Date("December 31, "+fullyear);
	var diff=future.getTime() - obj.getTime();
	res+="Today's Date "+obj.getDate()+"<br/>";
	var days=Math.ceil(diff/(1000*60*60*24));
	var res="only<u>"+days+"</u> days left 'till New year day!";
	
	document.getElementById("res").innerHTML=res;
	
}