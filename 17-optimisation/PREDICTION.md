# Ma prédiction - Exercice 17

## Fonction `moyenneInef`

**Problème identifié :** recalcule de la somme de tous les éléments déjà passé à chaque itération

**Nombre d'opérations actuelles (pour n éléments) :** n² 

**Version optimisée :**
```java
public static double moyenneEff(int[] t) {
    if (t.length == 0) {
        return 0.0;
    }
    int somme = 0;
    for (int element : t) {
        somme += element;
    }
    return (double) somme / t.length;
}
```

---

## Fonction `contientDoublonInef`

**Problème identifié :** Compare chaque paire deux fois

**Version optimisée :**
```java
public static boolean contientDoublonEff(int[] t) {
    for (int element : t) {
        if (elementsVus.contains(element)) {
            return true;
        }
        elementsVus.add(element);
    }
    return false;
}
```

---

## Fonction `premierEtDernierInef`

**Problème identifié :** Parcourt du tableau deux fois

**Version optimisée :**
```java
public static String premierEtDernierEff(int[] t) {
    if (t.length == 0) {
        return "Tableau vide";
    }
    int premier = t[0];
    int dernier = t[t.length - 1];
    return premier + " et " + dernier;
}
```

---

## Fonction `rechercheInef`

**Problème identifié :** Continue le parcours du tableau une fois la valeur trouvée

**Version optimisée :**
```java
public static int rechercheEff(int[] t, int val) {
    for (int i = 0; i < t.length; i++) {
        if (t[i] == val) {
            return i; 
        }
    }
    return -1;
}
```
