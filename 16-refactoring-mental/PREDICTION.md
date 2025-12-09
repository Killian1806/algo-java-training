# Ma prédiction - Exercice 16

## Fonction `estPositif`

**Version actuelle :** 5 lignes

**Ma version simplifiée :**
```java
public static boolean estPositif(int n) {
    return n > 0;
}
```

---

## Fonction `valeurAbsolue`

**Version actuelle :** 7 lignes

**Ma version simplifiée :**
```java
public static int valeurAbsolue(int n) {
    return (n < 0) ? -n : n;
}
```

---

## Fonction `estPair`

**Version actuelle :** 7 lignes

**Ma version simplifiée :**
```java
public static boolean estPair(int n) {
    return n % 2 == 0;
}
```

---

## Fonction `max`

**Version actuelle :** 8 lignes

**Ma version simplifiée :**
```java
public static int max(int a, int b) {
    return (a > b) ? a : b;
}
```

---

## Fonction `signe`

**Version actuelle :** 12 lignes

**Ma version simplifiée :**
```java
public static String signe(int n) {
    if (n > 0) {
        return "positif";
    } else if (n < 0) {
        return "negatif";
    } else {
        return "zero";
    }
}
```
