package week3.day2hw;

public class JavaConnection extends MySqlConnection {

	@Override
	public void executeQuery() {
		// TODO Auto-generated method stub
		System.out.println("Query Executed");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.executeQuery();
		
		

	}

}
