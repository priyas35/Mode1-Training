/**
 * 
 */

var i=0;
questions=[
           "1.what is oop",
           "2.who introduced JAVA",
           "3.how to declare generics",
           "4.string.format() used for",
           ];

function show(){
	//alert("hi");
	document.getElementById("question").innerHTML=questions[i];
}
function nextQuestion(){
	i=i+1;
	if(i< 4){
		show();
	}else{
		alert("Exam over");
	}
}