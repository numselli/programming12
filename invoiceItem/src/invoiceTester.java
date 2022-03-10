public class invoiceTester {
    public static void main(String[] args) throws Exception {
        invoice workInvoice = new invoice("C63528A52274A35D1C07BD9E55A83C6EB073DE81", "contract IT work", 3, 25.00);

        workInvoice.setDesc("temp Desc");
        workInvoice.setDesc("contract IT work");

        workInvoice.setQty(0);
        workInvoice.setQty(3);

        workInvoice.setUnitPrice(0);
        workInvoice.setUnitPrice(25.00);

        System.out.printf("id: $s\n", workInvoice.getId());
        System.out.printf("description: $s\n", workInvoice.getDesc());
        System.out.printf("Qty: $s\n", workInvoice.getQty());
        System.out.printf("UnitPrice: $s\n", workInvoice.getUnitPrice());
        System.out.printf("total: $%f\n", workInvoice.getTotal());
        System.out.printf("as String: %s\n", workInvoice.toString());
    }
}
