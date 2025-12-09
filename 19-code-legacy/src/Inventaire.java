public class Inventaire {
    private Produit[] prods;
    private int nb;

    public Inventaire(int taille) {
        prods = new Produit[taille];
        nb = 0;
    }

    public void ajouter(Produit p) {
        if (nb < prods.length) {
            prods[nb] = p;
            nb++;
        }
    }

    public Produit chercher(String nom) {
        for (int i = 0; i < nb; i++) {
            if (prods[i].getNom().equals(nom)) {
                return prods[i];
            }
        }
        return null;
    }

    public void afficher() {
        for (int i = 0; i < nb; i++) {
            System.out.println(prods[i].getNom() + " : " +
                prods[i].getPrix() + " x " + prods[i].getQuantite());
        }
    }

    public double valeurTotale() {
        double total = 0;
        for (int i = 0; i < nb; i++) {
            total = total + prods[i].valeur();
        }
        return total;
    }

    // TODO: Ajouter la méthode afficherCher(double seuil)
    // qui affiche les produits dont le prix est supérieur au seuil
    
}
