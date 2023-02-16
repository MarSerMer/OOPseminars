package org.example;

public class Main {
    public static void main(String[] args) {
        VendingMachine store = new VendingMachine();
        store.addProduct(new Products("Chips", 72.99))
                .addProduct(new Products("Coke",59.49))
                .addProduct(new Products("Bread",52.29))
                .addProduct(new Products("Juice",55.25));
        store.addProduct(new PerishableProducts("Milk", 62.99, 5));


/*        for (Products a: store.getProducts()){
            System.out.println(a);
        }*/
        System.out.println(store);
/*        System.out.println("Trying to search:");
        System.out.println(store.findProduct("Chips"));*/

        store.buy("Coke", 59.49);
        System.out.println(store);
        //System.out.println(store.getMoney()); в новом оверрайде тустринга и так будет выводиться

        store.buy("Bread",52.29);
        System.out.println(store);

        store.buy("Juice",55.25);
        System.out.println(store);

        store.addProduct(new Beer("Beer0", 60.00));
        store.addProduct(new Beer("Beer", 75.00, 12));
        System.out.println(store);

        store.buy("Milk", 62.99);
        System.out.println(store);

        store.addProduct(new Water("WaterSp", 29.00, "sparkling"));
        store.addProduct(new Water("WaterSt", 29.00, "still"));
        System.out.println(store);

        store.buy("Beer0", 60.00);
        System.out.println(store);

        store.addProduct(new ForAllergicPeople("Bar for allergy sufferers", 20.00, "nuts"));
        store.addProduct(new ForAllergicPeople("Bar for allergy sufferers", 20.00, "gluten"));
        store.addProduct(new ForAllergicPeople("Bar for allergy sufferers", 20.00, "eggs"));
        System.out.println(store);

        store.buy("Bar for allergy sufferers", 20.00);
        System.out.println(store);

    }
}