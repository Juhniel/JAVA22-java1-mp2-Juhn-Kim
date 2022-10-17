class Product {
    private final String productName;
    private double productPrice;
    private int productStock;

    Product(String productName, double productPrice, int productStock){
        this.productName= productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
    }

    // Skapat en ny metod för att hämta produktens namn från respektive objekt
    // Returnerar sedan namnet på produkten.
    public String getProductName() {
        return productName;
    }

    // Skapat en ny metod för att hämta produktens pris från respektive objekt
    // Returnerar sedan priset.
    public double getProductPrice() {
        return productPrice;
    }

    // Skapat en ny metod för att hämta produktens antal från respektive objekt
    // Returnerar sedan priset.
    public int getProductStock() {
        return productStock;
    }
    // Skapat en ny metod för att minska värdet i produkten för respektive objekt
    // Om productStock är mindre eller lika med 0 så sätts productStock till 0.
    // Annars minska värdet med 1

    public void setProductStock() {
        if(productStock <= 0){
            productStock = 0;
            System.out.println(productName + " IS SOLD OUT!");
            System.out.println("________________________________________________\n");
        }
        else {
            this.productStock--;
        }
    }
}