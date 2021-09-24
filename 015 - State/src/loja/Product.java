package loja;

public class Product {
    private String name;
    private int price;

    Product() {};
    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFormattedPrice() {
        String format = "";
        String priceToString = String.valueOf(this.price);
        if (priceToString.length() == 2) {
            format = "0";
        } else if (priceToString.length() == 1) {
            format = "00";
        }

        String fp = format + priceToString;
        int pos = fp.length() - 2;
        fp = fp.substring(0, pos) + "," + fp.substring(pos);

        return fp;
    }
}
