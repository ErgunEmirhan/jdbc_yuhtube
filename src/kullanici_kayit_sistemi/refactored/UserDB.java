package kullanici_kayit_sistemi.refactored;

class UserDB extends DataBase<User>{
	
	static DynamicArray<User> dataBaseArray = new DynamicArray();
	
	static boolean existByEmail(String mail){
		for(User user : (User[]) dataBaseArray.getTypeArray()){
			if (user.getMail().equals(mail)){
				return true;
			}
		}
		return false;
	}

	public static boolean existByTc(String tcno) {
		for(User user : (User[]) dataBaseArray.getTypeArray()){
			if (user.getTC().equals(tcno)){
				return true;
			}
		}
		return false;
	}

	static User findByUsernameAndPassword(String username, String password){
		for (User user : (User[])dataBaseArray.getTypeArray()){
			if (user.getUserName().equals(username)&& user.getPassword().equals(password)){
				return user;
			}
		}
		return null;
	}


	public static int findTcNoIndex(String tcno) {
		User[] userArray = (User[]) dataBaseArray.getTypeArray();
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
	
	public static boolean existByUserName(String username) {
		
		for(User user : (User[])dataBaseArray.getTypeArray()){
			if (user.getUserName().equals(username)){
				return true;
			}
		}
		return false;
	}

	public static void updatePasword(String newPassword, int userIndex) {
		User[] userArray = (User[]) dataBaseArray.getTypeArray();
		if (userArray != null){
			userArray[userIndex].setPassword(newPassword);
		}

	}
	


	public static User findByTcEmail(String tc, String mail) {
		for (User user : (User[])dataBaseArray.getTypeArray()){
			if (user.getTC().equals(tc) && user.getMail().equals(mail)){
				return user;
			}
		}
		return null;
	}
	
}