class SaleProduct extends Product {
    private final double discount;

    SaleProduct(String productName, int productPrice, int productStock, double discount) {
        super(productName, productPrice, productStock);
        this.discount = discount;

    }
    // Skapat en ny metod för rabattera produktens original pris.
    // Returnerar sedan det nya priset efter rea-avdraget på originalpris från productPrice i classen Product
    double getDiscountedPrice() {
        return getProductPrice() * discount;
    }

    // Skapat en ny metod för att få rabatten och multiplicerat med 100 för att visa rabatten i procentvärde.
    // Returnerar det nya värdet till discount.
    double getDiscount() {
        return discount * 100;
    }

}