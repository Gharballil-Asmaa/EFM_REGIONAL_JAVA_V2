public class Main {
    public static void main(String[] args) throws Exception {

        Boutique b1 = new Boutique();
        b1.ajouter(new Produit(1, 2121.2));
        b1.ajouter(new Produit(2, 2121.2, 238.32));
        b1.enregistrer("src\\data.txt");


    }
}