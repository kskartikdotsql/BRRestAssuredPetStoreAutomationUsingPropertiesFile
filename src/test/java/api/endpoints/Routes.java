package api.endpoints;

/*
maintain only the url's, we get from swagger
 
swagger uri: https://petstore.swagger.io

create user(post): https://petstore.swagger.io/v2/user
get user(get): https://petstore.swagger.io/v2/user/{username}
update user(put): https://petstore.swagger.io/v2/user/{username}
delete user(delete): https://petstore.swagger.io/v2/user/{username}
 */

public class Routes {
	
	public static String base_url = "https://petstore.swagger.io/v2";
	
	//user module from swagger 
	public static String post_url = base_url + "/user";
	public static String get_url = base_url + "/user/{username}";
	public static String update_url = base_url + "/user/{username}";
	public static String delete_url = base_url + "/user/{username}";
	
	//store module from swagger
	  //--here we create store module url's
	
	//pet module from swagger
	  //--here we create pet module url's
	
	

}
