package javainvoketest;

public class MyEndpoint {
public String methodA(){
	System.out.println("MethodA is called");
	return "MethodA";
	
}
	
public String methodB(String msg){
	System.out.println("MethodB is called");
	return "Out ="+msg;
	
}

}
