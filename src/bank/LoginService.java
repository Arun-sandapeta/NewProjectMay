package bank;

public class LoginService {

    static int maxAttempts = 3;

    public String login(User userInput) {


        String bankUserName = "Arun";
        String bankPassword = "arun";

        if (!userInput.isLocked) {
            if (userInput.name.equals(bankUserName) && userInput.password.equals(bankPassword)) {
                System.out.println("login successful");
            } else {
                userInput.NumOfAttempts = userInput.NumOfAttempts + 1;

                if (userInput.NumOfAttempts >= maxAttempts) {
                    userInput.isLocked = true;

                } else {
                    return "you have entered wrong credientials you have left with" + (maxAttempts - userInput.NumOfAttempts);
                }
            }
        } else {
            return "user is locked";
        }return "";
    }

}



