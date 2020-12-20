package com.idPassword;

public class IdPassword {
    protected String id;
    protected String password;

    public IdPassword(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String check_idPwd(String Id_user,String Password_user){
        if (id.equals(Id_user) && password.equals(Password_user))
        {
           return ("Authentication successful");
        }
        else {
            return ("Authentication failed");
        }
    }
}
