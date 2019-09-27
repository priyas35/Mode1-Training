/**
 * 
 */
function strDemo(){
	var res="";
	var str="Welcome to HTML Programming";
	var len=str.length;
	res +="Length is "+len+"<br/>";
	res +="Lower-case String is <b>"+str.toLowerCase()+"</b><br/>";
	res +="Upper-case String is <b>"+str.toUpperCase()+"</b><br/>";
	res +="First occurance of'a' is <b>"+str.indexOf("a")+"</b><br/>";
	res +="Char at 5th position is <b>"+str.charAt(5)+"</b><br/>";
	res +="replaced String is <b>"+str.replace("HTML","HTML 5")+"</b><br/>";
	document.getElementById("res").innerHTML=res;
}