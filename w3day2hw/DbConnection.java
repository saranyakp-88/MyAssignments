package week3.day2hw;

public interface DbConnection {

	public abstract void connect();
	public abstract void disconnect();
	public abstract void executeUpdate();
	
}
