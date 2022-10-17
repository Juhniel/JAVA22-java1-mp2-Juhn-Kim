class Customer {
    private int productAmount;
    private double productSum;

    Customer(int productAmount, int productSum){
        this.productAmount = productAmount;
        this.productSum = productSum;
    }

    // Skapat en ny metod för antal produkter ska uppdateras till kunden.
    // Ökar värdet med 1
    public int setUpdateProductAmount(){
       return productAmount++;
    }

    // Skapat en ny metod för totala priset. Summerar priserna till totalsumman och uppdaterar det nya priset.
    void setUpdateProductSum(double productPrice){
        productSum += productPrice;
    }

    // Skapat en ny metod för att hämta produktens totalsumma
    // returnerar totalsumman
    double getProductSum(){
        return productSum;
    }

    // Skapat en ny metod för att hämta produkternas antal
    // returnerar produktantalet
    public int getProductAmount() {
        return productAmount;
    }

}