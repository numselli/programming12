public class invoice {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    invoice(String id, String desc, int qty, double unitPrice){
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }


    public void setDesc(String desc) {
        this.desc = desc;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }
    public String getDesc() {
        return desc;
    }
    public int getQty() {
        return qty;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public double getTotal(){
        return unitPrice*qty;
    }

    public String toString(){
        return String.format("InvoiceItem[id=%s, desc=%s, qty=%d, unitPrice=%f]", id, desc, qty, unitPrice);
    }
}
