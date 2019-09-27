package com.hcl.obj;

public class Agent {
	public StringBuilder show(String agentId,String fullName,int maritalStatus,String zipCode){
		StringBuilder sbError=new StringBuilder();
		boolean isValid=true;
		if(agentId.charAt(0)!= 'A'){
			sbError.append("AgentId needs to start with 'A'"+"\r\n");
			isValid=false;
		}
		if(fullName.indexOf(' ')== -1){
			sbError.append("Fullname must contain space"+"\r\n");
			isValid=false;
			
		}
		if(fullName.length() >=20){
			
				sbError.append("Fullname must be lesser than 20"+"\r\n");
				isValid=false;
		}
		if(maritalStatus != 0 && maritalStatus !=1){
			sbError.append("only  0 and 1 is accepted..."+"\r\n");
			isValid=false;
		}
		if(zipCode.length() >6){
			sbError.append("cannot exceed 6 characters"+"\r\n");
			isValid=false;
		}
		if(isValid==true){
			sbError.append("agentId "+agentId + "\r\n");
			sbError.append("FullName "+fullName +"\r\n");
			sbError.append("maritalStatus "+maritalStatus +"\r\n");
			sbError.append("zipCode "+zipCode +"\r\n");
		}
		return sbError;
			
		}
	
		public static void main(String[] args) {
			
			String agentId,fullName,zipCode;
			agentId="A578";
			fullName="Priya sri ";
			int maritalStatus=0;
			zipCode="ladsenh";
			StringBuilder sbRes=new Agent().show(agentId, fullName, maritalStatus,zipCode);
			System.out.println(sbRes);
	}

}
