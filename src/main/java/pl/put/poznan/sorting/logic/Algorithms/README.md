# Poradnik użytkowania, bo w sumie to nawet nwm jakie komentarze gdzie by trzeba było wsadzić i później to zrobię, a maina nie zlokalizowałem więc też nigdzie nie mam gdzie to wstawić.

## Potrzebne importy:
* import Algorithms.Sorters;
* import java.util.Arrays;
* import java.util.Comparator;

## Użytkowanie:
Sorters.[tutaj algorytm, są w pliku sorters i poniżej].sort([dane], Comparator.[naturalOrder/reverseOrder] ())
Przykład:  
Sorters.QUICK.sort(data, Comparator.naturalOrder());
## Dane:
int[] trzeba zamieniać na Integer[]  
float trzeba zamieniać na Float[]  
String[] można po prostu wrzucić  
Przy pomocy czarnej magii te algorytmy przyjmują każdy z tych typów danych, nwm jak sobie poradzą z obiektami ale Integer[] i Float[] są obiektami więc raczej nie będzie problemu

# BogoSort nie ma ograniczeń, na razie go nie używać

## Oznaczenia algorytmów:
* BUBBLE
* BOGO
* HEAP
* INSERTION
* MERGE
* QUICK
* SELECTION  
Chyba dacie radę rozszyfrować do którego jaki algorytm jest.