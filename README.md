# SortingMadness
Aplikacja służąca do sortowania zbiorów danych różnymi algorytmami. Ma pomóc użytkownikowi w ocenie, która metoda może się najlepiej sprawdzić w konkretnych przypadkach oraz, oczywiście, w uporządkowaniu danych. Dane liczbowe są sortowane standardowo, natomiast tekstowe - leksykograficznie. Należy zaimplementować co najmniej 6 różnych metod sortowania. Aplikacja będzie dostępna poprzez GUI, a także jako zdalne API, dzięki czemu można zintegrować z istniejącymi narzędziami.

<a href="https://docs.google.com/spreadsheets/d/e/2PACX-1vSGgroDVhmkMiD2cUJbTqPbxFOiqqmapfAT0G7Vh1thQ-CVYWhWyENtSvMRt6HsWg/pub?output=xlsx">Arkusz projektu</a> 


# Formaty danych


## Sortowanie liczb (/numbers-sort)

Wejściowy format danych:

```
{
  "data": [8, 3, 5, 1],
  "algorithm": "quick/bubble/merge/insert/choose/bogo/auto/...",
  "order": "asc/desc",
  "iterations": 0
}
```

Wyjściowy format danych:

```
{
  "result": [1, 3, 5, 8],
  "algorithm": "quick/bubble/merge/insert/choose/bogo/auto/...",
  "time": 0.0005 // [s]
}
```

## Sortowanie obiektów według atrybutu (/objects-sort)

Wejściowy format danych:

```
{
  "data": [[8, 3, 5], [1, 3, 6]],
  "algorithm": "quick/bubble/merge/insert/choose/bogo/auto/...",
  "order": "asc/desc",
  "index": 0,
  "iterations": 0
}
```

Wyjściowy format danych:

```
{
  "result": [[1, 3, 6], [8, 3, 5]],
  "algorithm": "quick/bubble/merge/insert/choose/bogo/auto/...",
  "time": 0.002 // [s]
}
```
