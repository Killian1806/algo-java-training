# Ma prédiction - Exercice 10

## Phase 1 : Empilage (appels récursifs)

**Appel 1 :** factorielle(4)
- Pile : [main, fact(4)]
- n = 4, n <= 1 ? False
- Appelle factorielle(3)

**Appel 2 :** factorielle(3)
- Pile : [main, fact(4), fact(3)]
- n = 3, n <= 1 ? False
- Appelle factorielle(2)

**Appel 3 :** factorielle(2)
- Pile : [main, fact(4), fact(3), fact(2)]
- n = 2, n <= 1 ? False
- Appelle factorielle(1)

**Appel 4 :** factorielle(1)
- Pile : [main, fact(4), fact(3), fact(2), fact(1)]
- n = 1, n <= 1 ? True
- Cas de base ! return 1

---

## Phase 2 : Dépilage (retours)

**Retour de fact(1) :** retourne 1
- Pile : [main, fact(4), fact(3), fact(2)]

**Dans fact(2) :** sousResultat = 1
- resultat = 2 * 1 = 2
- Retourne 2

**Dans fact(3) :** sousResultat = 2
- resultat = 3 * 2 = 6
- Retourne 6

**Dans fact(4) :** sousResultat = 6
- resultat = 4 * 6 = 24
- Retourne 24

**Dans main :** resultat = 24


