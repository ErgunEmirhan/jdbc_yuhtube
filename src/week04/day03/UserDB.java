package week04.day03;

class UserDB {
	static UserList userList = new UserList();
	
	static User save(User user){
		return userList.add(user);
	}
	public static User update(User user) {
		int index = 0;
		for (User arrUser : userList.getUserArray()){
			if (user.getId() == arrUser.getId()){
				return userList.replace(index,user);
			}
			index++;
		}
		return null;
	}
	
	static User[] findAll(){
		User[] userArray = userList.getUserArray();
		for(User user : userArray){
			System.out.println(user);
		}
		return userArray;
	}
	static boolean existByEmail(String mail){
		/*User[] userArray = userList.getUserArray();
		if (userArray == null){
			return false;
		}
		for(User user : userArray){
			if (user.getMail().equals(mail)){
				return true;
			}
		}
		return false;*/ //Benim Çözüm
		for(User user : userList.getUserArray()){
			if (user.getMail().equals(mail)){
				return true;
			}
		}
		return false;
	}
	
	public static boolean existByTc(String tcno) {
		/*User[] userArray = userList.getUserArray();
		if (userArray == null){
			return false;
		}
		for(User user : userArray){
			if (user.getTC().equals(tcno)){
				return true;
			}
		}
		return false;*/ // benim çözüm
		for(User user : userList.getUserArray()){
			if (user.getTC().equals(tcno)){
				return true;
			}
		}
		return false;
	}
	
	static User findByUsernameAndPassword(String username, String password){
		for (User user : userList.getUserArray()){
			if (user.getUserName().equals(username)&& user.getPassword().equals(password)){
				return user;
			}
		}
		return null;
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
	/*public static int findUsernameIndex(String username) {
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
	}*/ // benim çözüm
	public static boolean existByUserName(String username) {
		/*User[] userArray = userList.getUserArray();
		if (userArray == null){
			return false;
		}
		for(User user : userArray){
			if (user.getUserName().equals(username)){
				return true;
			}
		}
		return false;*/ // Benim çözüm
		for(User user : userList.getUserArray()){
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
	
	public static User findById(int id) {
		User[] userArray = userList.getUserArray();
		for (User user : userArray){
			if (user.getId() == id){
				return  user;
			}
		}
		return null;
		
	}
	
	
	public static User findByTcEmail(String tc, String mail) {
		for (User user: userList.getUserArray()){
			if (user.getTC().equals(tc) && user.getMail().equals(mail)){
				return user;
			}
		}
		return null;
	}
}