package EX8;

class Connection{
	static int i = 0;
	private Connection() {
		System.out.println("new Connection created: " + i);
		i++;
	}
	
	public static Connection makeConnection() {
		
		return new Connection();
	}
	
}

class ConnectionManager{
	
	static int connectionLeft = 4;
	
	private static Connection[] a = new Connection[5];
	
	ConnectionManager() {
		for (int i = 0; i<5; i++) {
			a[i] = Connection.makeConnection();
		}
	}
	
	public static Connection getConnection() {
		if (connectionLeft >=0) {
			System.out.println("only " + connectionLeft + " Connections left" );
			return a[connectionLeft--];
		}
		else
		    return null;
		
	}
	
}

public class EX8 {
	
	public static void main(String[] args) {
		
		ConnectionManager b = new ConnectionManager();
		b.getConnection();
		b.getConnection();
		b.getConnection();
		b.getConnection();
		b.getConnection();
		b.getConnection();
	}

}
