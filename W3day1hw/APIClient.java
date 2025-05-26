package week3.day1hw;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("Endpoint String is: "+endpoint);
	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("Endpoint String is: "+endpoint);
		System.out.println("Request Body is: "+requestBody);
		if(requestStatus) { System.out.println("Status is checked"); }
		else { System.out.println("Status not checked"); }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient apc = new APIClient();
		apc.sendRequest("First send request method");
		apc.sendRequest("second send request method", "Body of the request", true);

	}

}
