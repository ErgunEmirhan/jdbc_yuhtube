package week04.day03;

class UserDB {
	static UserList userList = new UserList();
	
	static User save(User user){
		return userList.add(user);
	}
	static User[] findAll(){
		User[] userArray = userList.getUserArray();
		if (userArray == null){
			System.out.println("There is no user! Array is null");
			return null;
		}
		for(User user : userArray){
			System.out.println(user);
		}
		return userArray;
	}
	static boolean findEmail(String mail){
		User[] userArray = userList.getUserArray();
		if (userArray == null){
			return false;
		}
		for(User user : userArray){
			if (user.getMail().equals(mail)){
				return true;
			}
		}
		return false;
	}
	
	public static boolean findTcNo(String tcno) {
		User[] userArray = userList.getUserArray();
		if (userArray == null){
			return false;
		}
		for(User user : userArray){
			if (user.getTC().equals(tcno)){
				return true;
			}
		}
		return false;
	}
	public static int findTcNoIndex(String tcno) {
		User[] userArray = userList.getUserArray();
		if (userArray == null){
			return -1;
		}
		for(int i = 0; i< userArray.length; i++){
			if (userArray[i].getTC().equals(tcno)){
				return i;
			}
		}
		return -1;
	}
	public static int findUsernameIndex(String username) {
		User[] userArray = userList.getUserArray();
		if (userArray == null){
			return -1;
		}
		for(int i = 0; i< userArray.length; i++){
			if (userArray[i].getUserName().equals(username)){
				return i;
			}
		}
		return -1;
	}
	public static boolean isRightUser(int tcIndex, String username){
		User[] userArray = userList.getUserArray();
		if (userArray[tcIndex].getUserName().equals(username)){
			return true;
		}
		return false;
	}
	public static boolean isRightUser(String password, int userIndex){
		User[] userArray = userList.getUserArray();
		if (userArray[userIndex].getPassword().equals(password)){
			return true;
		}
		return false;
	}
	public static boolean findUserName(String username) {
		User[] userArray = userList.getUserArray();
		if (userArray == null){
			return false;
		}
		for(User user : userArray){
			if (user.getUserName().equals(username)){
				return true;
			}
		}
		return false;
	}
	
	public static void updatePasword(String newPassword, int userIndex) {
		User[] userArray = userList.getUserArray();
		if (userArray != null){
			userArray[userIndex].setPassword(newPassword);
		}
		
	}
}