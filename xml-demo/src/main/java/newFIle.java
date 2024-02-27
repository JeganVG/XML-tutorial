import org.json.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class newFIle {
	public static void main(String args[]) {
		Gson gson = new Gson();
		user u = new user("jegan", 21);
		System.out.println(u);
		String json = gson.toJson(new user("jegan", 21));
		
		
		System.out.println(json);
		user n = gson.fromJson(json, user.class);
		
		System.out.println(n.age);
		System.out.println(n.user);
	}

}
