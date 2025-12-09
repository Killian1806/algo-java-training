# Ma prédiction - Exercice 19

## Partie 1 : Comprendre l'existant

### Classe `Produit`

**Attributs (noms cryptiques) :**
- `n` représente : Nom du produit
- `p` représente : Prix du produit
- `q` représente : Quantité

**Méthode `valeur()` :**
- Que calcule-t-elle ? Calcule la valeur totale du stock (p*q)

---

### Classe `Inventaire`

**Attributs :**
- `prods` représente : tableau des objets Produit
- `nb` représente : nombre actuel de produits différents

**Méthodes :**
- `ajouter(Produit p)` : Ajouter un Produit au tableau 
- `chercher(String nom)` : Parcours l'inventaire et retroune le Produit qui correspond au nom
- `afficher()` : Affiche le nom, le prix et la quantité de chaque produit
- `valeurTotale()` : Clacule et retourne le prix

---

## Partie 2 : Prédire la sortie actuelle

```

=== Inventaire ===
Pomme : 2.5 x 100
Pain : 1.2 x 50
Lait : 0.95 x 75
Beurre : 2.1 x 30

=== Recherche 'Pain' ===
Trouve : Pain a 1.2 euros

=== Valeur totale ===
Valeur : 444.25 euros

```

---

## Partie 3 : Ajouter la fonctionnalité

**Fonctionnalité demandée :** 
Ajouter une méthode `afficherCher(double seuil)` qui affiche les produits dont le prix est supérieur au seuil.

**Ma méthode :**
```java
public void afficherCher(double seuil) {
    for (int i = 0; i < nb; i++) {
        if (prods[i].getPrix() > seuil) {
            System.out.println(prods[i].getNom() + " : " +
                prods[i].getPrix() + " x " + prods[i].getQuantite());
        }
    }
}
```

**Sortie attendue pour `afficherCher(2.0)` :**
```
=== Produits chers (>2 euros) ===
Pomme : 2.5 x 100
Beurre : 2.1 x 30

```
