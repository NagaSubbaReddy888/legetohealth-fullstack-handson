package com.org;

public class UserData {
	User user1 = new User(1, "Ramu", 20);
	User user2 = new User(2, "Ravi", 21);
	User user3 = new User(3,"Raju", 22);
    User user4 = new User(4,"Rani",23);
    
	User[] userarray = { user1, user2, user3 ,user4};

	public void findUser(int id) throws UserNotFoundException {
		User output = new User();
		for (int i = 0; i < userarray.length; i++) {
			if (id == userarray[i].getId()) {
				output = userarray[i];
			}
		}

		if (output.getId() != 0) {
			System.out.println(output);
		} else {
			throw new UserNotFoundException("User id " + id + " is not found");
		}
	}
}
