# Ma prédiction - Exercice 06

## Traçage ligne par ligne

**Lignes 3-4 :** Initialisation
- a = 5
- b = 3

---

### Appel 1 : `addition(a, b)` (ligne 6)

**Entrée dans la fonction `addition` :**
- Paramètre x reçoit : 5
- Paramètre y reçoit : 3

**Ligne 17 :** `int somme = x + y;`
- Calcul : 5 + 3 = 8
- somme = 8

**Ligne 18 :** `return somme;`
- Valeur retournée : 8

**Retour dans main :**
- resultat1 = 8

**Ligne 7 :** Affichage
```
addition(5, 3) = 8
```

---

### Appel 2 : `carre(a)` (ligne 9)

**Entrée dans la fonction `carre` :**
- Paramètre n reçoit : 5

**Ligne 22 :** `return n * n;`
- Calcul : 5 * 5 = 25
- Valeur retournée : 25

**Retour dans main :**
- resultat2 = 25

**Ligne 10 :** Affichage
```
carre(5) = 25
```

---

### Appel 3 : `addition(carre(2), b)` (ligne 12)

**Étape 1 : Évaluation de `carre(2)`**
- Paramètre n reçoit : 2
- Calcul : 2 * 2 = 4
- Valeur retournée : 4

**Étape 2 : Appel de `addition(carre(2), b)`**
- Paramètre x reçoit : 4
- Paramètre y reçoit : 3
- Calcul : 4 + 3 = 7
- Valeur retournée : 7

**Retour dans main :**
- resultat3 = 7

**Ligne 13 :** Affichage
```
addition(carre(2), 3) = 7
```
