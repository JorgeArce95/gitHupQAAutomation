package pojo;

public class registerData {

    private String name;
    private String lastName;
    private String telephone;
    private String password;

    public registerData(String _name, String _lastName, String _telephone, String _password) {
        this.name = _name;
        this.lastName = _lastName;
        this.telephone = _telephone;
        this.password = _password;
    }
    public String  getName() {

        return name;

    }
    public String  getLastName() {

        return lastName;

    }
    public String  getTelephone() {

        return telephone;

    }
    public  String getPassword(){

        return password;
    }

}
