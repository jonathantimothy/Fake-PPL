import java.util.List

public class User (
    private String U_ID;
    private String U_Password;
    private Boolean  U_loginstatus;
    private Date U_tgldaftar;
)

public User(
    String U_ID, String U_Password, Boolean U_loginstatus,
    Date U_tgldaftar){
        this.U_ID = U_ID;
        this.U_Password = U_Password;
        this.U_loginstatus = U_loginstatus ;
        this.U_tgldaftar = U_tgldaftar;
    }

    public verificate(){
        
    }