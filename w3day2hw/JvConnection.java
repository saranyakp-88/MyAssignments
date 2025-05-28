package week3.day2hw;

public class JvConnection implements DbConnection {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Class - Interface connect method");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Class - Interface disconnect method");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Class - Interface execute update method");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JvConnection jvc = new JvConnection();
		jvc.connect();
		jvc.disconnect();
		jvc.executeUpdate();

	}


}
