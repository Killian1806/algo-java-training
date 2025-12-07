# Ma prédiction - Exercice 08

## Pile d'appels

Dessine la pile au fur et à mesure :

```
Étape 1: [main]
Étape 2: [main, a]
Étape 3: [main, a, b]
Étape 4: [main, a, b, c]
Étape 5: [main, a, b]  ← retour de c
Étape 6: [main, a]       ← retour de b
Étape 7: [main]            ← retour de a
```

---

## Traçage dans l'ordre d'exécution

**main :** `a(5)` est appelé
```
main: debut
```

**a :** reçoit x = 5
```

```

**a :** appelle `b(x + 1)` → b(6)

**b :** reçoit y = 6
```

```

**b :** appelle `c(y + 1)` → c(7)

**c :** reçoit z = 7
```


```

**c :** retourne z * 3 = 7 * 3 = 21

**Retour dans b :** val = 21
```

```
**b :** retourne val + 10 = 21 + 10 = 31

**Retour dans a :** val = 31
```

```
**a :** retourne val * 2 = 31 * 2 = 62

**Retour dans main :** resultat = 62
```


```
