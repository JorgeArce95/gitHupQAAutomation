package pojo;



public class currenciesData {


    private String euros;
    private String libra;
    private String dollar;

    public currenciesData(String _euros, String _libra, String _dollar) {
        this.euros = _euros;
        this.libra = _libra;
        this.dollar = _dollar;

    }
    public String  getEuros() {

        return euros;

    }
    public String  getLibra() {

        return libra;

    }
    public String  getDollar() {

        return dollar;

    }

}
