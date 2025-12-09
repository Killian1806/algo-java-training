# Ma prédiction - Exercice 20 (Challenge Final)

## Partie 1 : Références (Liste chaînée)

**Schéma mémoire après lignes 11-12 :**
```
a ──→ [Noeud: valeur=1, suivant=b]
              │
              ▼
b ──→ [Noeud: valeur=2, suivant=c]
              │
              ▼
c ──→ [Noeud: valeur=3, suivant=null]
```

**Traçage de la boucle while :**
- Tour 1 : courant = a, affiche 1, courant devient b
- Tour 2 : courant = b, affiche 2, courant devient c
- Tour 3 : courant = c, affiche 3, courant devient null
- Sortie : courant = null, condition fausse

**Affichage :**
```
1 -> 2 -> 3 -> null

```

---

## Partie 2 : Récursion

**Pile d'appels :**
```
sommeRecursive(a) : 1 + sommeRecursive(b)
  sommeRecursive(b) : 2 + sommeRecursive(c)
    sommeRecursive(c) : 3 + sommeRecursive(null)
      sommeRecursive(null) : return 0
```

**Dépilage :**
- sommeRecursive(null) retourne 0
- sommeRecursive(c) retourne 3 + 0 = 3
- sommeRecursive(b) retourne 2 + 3 = 5
- sommeRecursive(a) retourne 1 + 5 = 6

**Résultat :** 6

---

## Partie 3 : Bug à trouver

**Que fait la fonction `compterOccurrences` ?**
Elle compte le nombre de fois que la valeur apparaît dans un tableau

**Quel est le bug ?**
- Ligne problématique : break;
- Description : dans la condition if (t[i] == val) breakforce l'arrêt immediat donc la fonction ne passe pas au dela de la première occurrence

**Résultat actuel :** 1
**Résultat attendu :** 3

**Correction proposée :**
```java
public static int compterOccurrences(int[] t, int val) {
    int count = 0;
    for (int i = 0; i < t.length; i++) {
        if (t[i] == val) {
            count++;
        }
    }
    return count;
}
```

---

## Partie 4 : Architecture

**Après les 3 `ajouter()` :**
- elements = [10, 20, 30, ...]
- taille = 3

**somme() :** 10 + 20 + 30 = 60

**Après doubler() :**
- elements = [20, 40, 60, ...]

**somme() :** 20 + 40 + 60 = 120
