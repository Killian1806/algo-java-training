# Ma prédiction - Exercice 14

## BUG 1 : fonction `moyenne`

**Ligne suspecte :** for (int i = 0; i <= t.length; i++)

**Description du bug :** Dépassement de la capacité du tableau

**Ce qui va se passer :** erreur de type index out of range

**Correction proposée :** for (int i = 0; i < t.length; i++)

---

## BUG 2 : fonction `estTrie`

**Ligne suspecte :** for (int i = 0; i < t.length; i++)
                        if (t[i] > t[i + 1])

**Description du bug :** La condition if va sortir du tableau car i+1 mais pour le dernier le i+1 va sortir

**Ce qui va se passer :** erreur de type index out of range

**Correction proposée :** for (int i = 0; i < t.length - 1; i++)

---

## BUG 3 : fonction `inverse`

**Ligne suspecte :** for (int i = 0; i < t.length; i++)

**Description du bug :** Il y a une première inversion qui fait que les éléments sont au bonne endroite mais il y a une deuxième inversion qui replace les éléments comme ils étaient de base

**Ce qui va se passer :** Deux inversement du tableau qui le renvoie dans son état d'origine

**Correction proposée :** (int i = 0; i < t.length / 2; i++)

---

## BUG 4 : fonction `compter`

**Ligne suspecte :** return count;

**Description du bug :** Sorti du code trop tôt car la ligne est mal indenté

**Ce qui va se passer :** Si val est présent la fonction va toujours renvoyer 1 même s'il y en a plusieurs

**Correction proposée :** retirer une indentation devant le return
