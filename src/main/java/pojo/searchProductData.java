package pojo;

public class searchProductData {


    private String product;
    private String messageAlert;

    public searchProductData(String _product, String _messageAlert) {
        this.product = _product;
        this.messageAlert = _messageAlert;

    }
    public String  getProduct() {

        return product;

    }
    public String  getMessageAlert() {

        return messageAlert;

    }

}
