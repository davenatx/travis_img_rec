# travis_img_rec

We recieved the Travis County Clerk's index and images from 1974 - 1982.  We used the index to target a subset of document types to rename the images in document number format and to geneate image only souce type 'I' records on the title plant.  This was done to index these images to our system.  We also have some pre-1982 survey records keyed on our system.  This project is designed to identify source type 'I' records that also exist as source type 'R' in the survey records.

The CSV files were created from the sql queries outlined in the misc directory.  Basically, we matched 'I' records to 'R' records.

This program reads the CSV file, does some QC between the 'I' and 'R' record like confirming the volume/pages match, etc.  Then, it copies the source type 'I' images from the Image Repostiory to the preindex directory.

After this program completes, the target 'R' images are ready to index in the preindex directory.

## 1978
```
2017-06-20 16:16:09,453 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1686496 I record has VolPage: 6054/1132 and R record has VolPage: 6064/1132
2017-06-20 16:16:09,453 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1688269 I record has VolPage: 6056/1967 and R record has VolPage: 6056/1979
2017-06-20 16:16:09,453 WARN CSVParser$ FileMd Mismatch!  Document Number: 1689330 I record has FileMd: 124 and R record has FileMd: 125
2017-06-20 16:16:09,453 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1693340 I record has VolPage: 6061/38 and R record has VolPage: 6061/40
2017-06-20 16:16:09,453 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1696546 I record has VolPage: 6064/1874 and R record has VolPage: 6041/1874
2017-06-20 16:16:09,468 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1699741 I record has VolPage: 6066/1090 and R record has VolPage: 6066/1092
2017-06-20 16:16:09,468 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1709581 I record has VolPage: 6082/447 and R record has VolPage: 6082/477
2017-06-20 16:16:09,468 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1709581 I record has VolPage: 6082/447 and R record has VolPage: 6082/477
2017-06-20 16:16:09,468 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1709581 I record has VolPage: 6082/447 and R record has VolPage: 6082/477
2017-06-20 16:16:09,468 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1717121 I record has VolPage: 6087/1127 and R record has VolPage: 6078/1127
2017-06-20 16:16:09,468 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1713875 I record has VolPage: 6092/1686 and R record has VolPage: 39/52
2017-06-20 16:16:09,468 WARN CSVParser$ FileMd Mismatch!  Document Number: 1713875 I record has FileMd: 303 and R record has FileMd: 310
2017-06-20 16:16:09,468 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1714473 I record has VolPage: 6093/1966 and R record has VolPage: 6903/1966
2017-06-20 16:16:09,468 WARN CSVParser$ FileMd Mismatch!  Document Number: 1715499 I record has FileMd: 306 and R record has FileMd: 307
2017-06-20 16:16:09,468 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1721442 I record has VolPage: 6099/650 and R record has VolPage: 5099/650
2017-06-20 16:16:09,468 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1740127 I record has VolPage: 6131/859 and R record has VolPage: 6156/1620
2017-06-20 16:16:09,468 WARN CSVParser$ FileMd Mismatch!  Document Number: 1740127 I record has FileMd: 411 and R record has FileMd: 426
2017-06-20 16:16:09,468 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1740447 I record has VolPage: 6131/1041 and R record has VolPage: 149/485
2017-06-20 16:16:09,468 WARN CSVParser$ FileMd Mismatch!  Document Number: 1740447 I record has FileMd: 411 and R record has FileMd: 329
2017-06-20 16:16:09,468 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1744707 I record has VolPage: 6151/852 and R record has VolPage: 6151/1852
2017-06-20 16:16:09,468 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1748396 I record has VolPage: 6154/553 and R record has VolPage: 1654/553
2017-06-20 16:16:09,468 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1749291 I record has VolPage: 6155/1162 and R record has VolPage: 6155/1164
2017-06-20 16:16:09,484 WARN CSVParser$ FileMd Mismatch!  Document Number: 1755252 I record has FileMd: 502 and R record has FileMd: 522
2017-06-20 16:16:09,484 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1763433 I record has VolPage: 6168/1258 and R record has VolPage: 6168/1253
2017-06-20 16:16:09,484 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1767822 I record has VolPage: 6176/1268 and R record has VolPage: 6176/1269
2017-06-20 16:16:09,484 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1774406 I record has VolPage: 6181/2340 and R record has VolPage: 6181/2400
2017-06-20 16:16:09,484 WARN CSVParser$ FileMd Mismatch!  Document Number: 1780236 I record has FileMd: 608 and R record has FileMd: 607
2017-06-20 16:16:09,484 WARN CSVParser$ FileMd Mismatch!  Document Number: 1780236 I record has FileMd: 608 and R record has FileMd: 607
2017-06-20 16:16:09,484 WARN CSVParser$ FileMd Mismatch!  Document Number: 1780236 I record has FileMd: 608 and R record has FileMd: 607
2017-06-20 16:16:09,484 WARN CSVParser$ FileMd Mismatch!  Document Number: 1780236 I record has FileMd: 608 and R record has FileMd: 607
2017-06-20 16:16:09,484 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1790128 I record has VolPage: 6197/1433 and R record has VolPage: 6194/1433
2017-06-20 16:16:09,484 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1790157 I record has VolPage: 6197/1463 and R record has VolPage: 6196/1463
2017-06-20 16:16:09,484 WARN CSVParser$ FileMd Mismatch!  Document Number: 1790647 I record has FileMd: 620 and R record has FileMd: 602
2017-06-20 16:16:09,484 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1808214 I record has VolPage: 6213/1430 and R record has VolPage: 6213/143
2017-06-20 16:16:09,484 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1809194 I record has VolPage: 6214/1920 and R record has VolPage: 6214/1919
2017-06-20 16:16:09,484 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1813028 I record has VolPage: 6245/1384 and R record has VolPage: 6045/1384
2017-06-20 16:16:09,484 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1814686 I record has VolPage: 6246/2371 and R record has VolPage: 6246/2066
2017-06-20 16:16:09,484 WARN CSVParser$ FileMd Mismatch!  Document Number: 1814686 I record has FileMd: 724 and R record has FileMd: 721
2017-06-20 16:16:09,484 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1819089 I record has VolPage: 6250/2300 and R record has VolPage: 6350/2300
2017-06-20 16:16:09,484 WARN CSVParser$ FileMd Mismatch!  Document Number: 1820225 I record has FileMd: 801 and R record has FileMd: 731
2017-06-20 16:16:09,499 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1820227 I record has VolPage: 6251/492 and R record has VolPage: 6351/492
2017-06-20 16:16:09,499 WARN CSVParser$ FileMd Mismatch!  Document Number: 1820227 I record has FileMd: 801 and R record has FileMd: 731
2017-06-20 16:16:09,499 WARN CSVParser$ FileMd Mismatch!  Document Number: 1827525 I record has FileMd: 810 and R record has FileMd: 809
2017-06-20 16:16:09,499 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1842816 I record has VolPage: 6287/389 and R record has VolPage: 6287/395
2017-06-20 16:16:09,499 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1856090 I record has VolPage: 6299/125 and R record has VolPage: 6299/127
2017-06-20 16:16:09,499 WARN CSVParser$ FileMd Mismatch!  Document Number: 1883006 I record has FileMd: 1023 and R record has FileMd: 1024
2017-06-20 16:16:09,499 WARN CSVParser$ FileMd Mismatch!  Document Number: 1884855 I record has FileMd: 1026 and R record has FileMd: 1025
2017-06-20 16:16:09,499 WARN CSVParser$ FileMd Mismatch!  Document Number: 1884860 I record has FileMd: 1026 and R record has FileMd: 1025
2017-06-20 16:16:09,499 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1909561 I record has VolPage: 6409/891 and R record has VolPage: 6358/1334
2017-06-20 16:16:09,499 WARN CSVParser$ FileMd Mismatch!  Document Number: 1909561 I record has FileMd: 1201 and R record has FileMd: 1130
2017-06-20 16:16:09,499 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1910598 I record has VolPage: 6410/1469 and R record has VolPage: 32/493
2017-06-20 16:16:09,499 WARN CSVParser$ FileMd Mismatch!  Document Number: 1910598 I record has FileMd: 1204 and R record has FileMd: 1215
2017-06-20 16:16:09,499 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1920952 I record has VolPage: 6419/1855 and R record has VolPage: 6819/1855
2017-06-20 16:16:09,499 WARN CSVParser$ FileMd Mismatch!  Document Number: 1922360 I record has FileMd: 1220 and R record has FileMd: 1221
2017-06-20 16:16:09,499 WARN CSVParser$ FileMd Mismatch!  Document Number: 1922408 I record has FileMd: 1220 and R record has FileMd: 1221
2017-06-20 16:16:09,546 WARN CSVParser$ Parsed record length: 920, Deduped Record Length: 814
```

## 1979
```
2017-06-21 07:51:53,195 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1941682 I record has VolPage: 6454/1360 and R record has VolPage: 6454/1369
2017-06-21 07:51:53,199 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1964356 I record has VolPage: 6475/1675 and R record has VolPage: 34/9
2017-06-21 07:51:53,200 WARN CSVParser$ FileMd Mismatch!  Document Number: 1964356 I record has FileMd: 227 and R record has FileMd: 301
2017-06-21 07:51:53,201 WARN CSVParser$ FileMd Mismatch!  Document Number: 1977417 I record has FileMd: 316 and R record has FileMd: 309
2017-06-21 07:51:53,202 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1979037 I record has VolPage: 6504/2053 and R record has VolPage: /
2017-06-21 07:51:53,202 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1981708 I record has VolPage: 6507/1248 and R record has VolPage: 6506/1248
2017-06-21 07:51:53,203 WARN CSVParser$ FileMd Mismatch!  Document Number: 1981708 I record has FileMd: 323 and R record has FileMd: 322
2017-06-21 07:51:53,204 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 1985381 I record has VolPage: 6510/716 and R record has VolPage: 6501/716
2017-06-21 07:51:53,204 WARN CSVParser$ FileMd Mismatch!  Document Number: 1999377 I record has FileMd: 419 and R record has FileMd: 418
2017-06-21 07:51:53,205 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2001671 I record has VolPage: 6557/139 and R record has VolPage: 6557/140
2017-06-21 07:51:53,206 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2008299 I record has VolPage: 6563/1249 and R record has VolPage: 6463/1249
2017-06-21 07:51:53,208 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2071201 I record has VolPage: 6634/589 and R record has VolPage: 6660/991
2017-06-21 07:51:53,209 WARN CSVParser$ FileMd Mismatch!  Document Number: 2071201 I record has FileMd: 725 and R record has FileMd: 808
2017-06-21 07:51:53,210 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2073077 I record has VolPage: 6636/1609 and R record has VolPage: 6636/609
2017-06-21 07:51:53,211 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2078668 I record has VolPage: 6658/1905 and R record has VolPage: 6657/1905
2017-06-21 07:51:53,212 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2078668 I record has VolPage: 6658/1905 and R record has VolPage: 6657/1905
2017-06-21 07:51:53,213 WARN CSVParser$ FileMd Mismatch!  Document Number: 2096670 I record has FileMd: 829 and R record has FileMd: 828
2017-06-21 07:51:53,214 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2104364 I record has VolPage: 6700/653 and R record has VolPage: 6700/655
2017-06-21 07:51:53,215 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2113407 I record has VolPage: 6707/302 and R record has VolPage: 6691/335
2017-06-21 07:51:53,216 WARN CSVParser$ FileMd Mismatch!  Document Number: 2113407 I record has FileMd: 917 and R record has FileMd: 914
2017-06-21 07:51:53,217 WARN CSVParser$ FileMd Mismatch!  Document Number: 2127343 I record has FileMd: 1004 and R record has FileMd: 1003
2017-06-21 07:51:53,218 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2142936 I record has VolPage: 6758/1228 and R record has VolPage: 6756/1228
2017-06-21 07:51:53,219 WARN CSVParser$ FileMd Mismatch!  Document Number: 2149852 I record has FileMd: 1031 and R record has FileMd: 1030
2017-06-21 07:51:53,220 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2159827 I record has VolPage: 6773/200 and R record has VolPage: 6772/200
2017-06-21 07:51:53,221 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2171160 I record has VolPage: 6804/1222 and R record has VolPage: 6804/1122
2017-06-21 07:51:53,222 WARN CSVParser$ FileMd Mismatch!  Document Number: 2171182 I record has FileMd: 1129 and R record has FileMd: 1130
2017-06-21 07:51:53,223 WARN CSVParser$ FileMd Mismatch!  Document Number: 2171188 I record has FileMd: 1129 and R record has FileMd: 1130
2017-06-21 07:51:53,224 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2173803 I record has VolPage: 6805/2349 and R record has VolPage: 6805/2350
2017-06-21 07:51:53,225 WARN CSVParser$ FileMd Mismatch!  Document Number: 2190967 I record has FileMd: 1227 and R record has FileMd: 1228
2017-06-21 07:51:53,268 WARN CSVParser$ Parsed record length: 979, Deduped Record Length: 901
```

## 1980
```
2017-06-21 07:53:34,538 WARN CSVParser$ FileMd Mismatch!  Document Number: 2200568 I record has FileMd: 110 and R record has FileMd: 109
2017-06-21 07:53:34,543 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2210209 I record has VolPage: 6867/449 and R record has VolPage: 6867/497
2017-06-21 07:53:34,543 WARN CSVParser$ FileMd Mismatch!  Document Number: 2219027 I record has FileMd: 206 and R record has FileMd: 207
2017-06-21 07:53:34,545 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2234179 I record has VolPage: 6888/1072 and R record has VolPage: 6866/1072
2017-06-21 07:53:34,545 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2234179 I record has VolPage: 6888/1072 and R record has VolPage: 6866/1072
2017-06-21 07:53:34,546 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2234179 I record has VolPage: 6888/1072 and R record has VolPage: 6866/1072
2017-06-21 07:53:34,546 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2234179 I record has VolPage: 6888/1072 and R record has VolPage: 6866/1072
2017-06-21 07:53:34,546 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2234179 I record has VolPage: 6888/1072 and R record has VolPage: 6866/1072
2017-06-21 07:53:34,547 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2234179 I record has VolPage: 6888/1072 and R record has VolPage: 6866/1072
2017-06-21 07:53:34,548 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2234179 I record has VolPage: 6888/1072 and R record has VolPage: 6866/1072
2017-06-21 07:53:34,549 WARN CSVParser$ FileMd Mismatch!  Document Number: 2250265 I record has FileMd: 312 and R record has FileMd: 311
2017-06-21 07:53:34,550 WARN CSVParser$ FileMd Mismatch!  Document Number: 2244398 I record has FileMd: 314 and R record has FileMd: 315
2017-06-21 07:53:34,551 WARN CSVParser$ FileMd Mismatch!  Document Number: 2262904 I record has FileMd: 408 and R record has FileMd: 407
2017-06-21 07:53:34,552 WARN CSVParser$ FileMd Mismatch!  Document Number: 2264243 I record has FileMd: 409 and R record has FileMd: 205
2017-06-21 07:53:34,553 WARN CSVParser$ FileMd Mismatch!  Document Number: 2272293 I record has FileMd: 421 and R record has FileMd: 422
2017-06-21 07:53:34,554 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2272467 I record has VolPage: 6850/441 and R record has VolPage: 6950/441
2017-06-21 07:53:34,555 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2289820 I record has VolPage: 6993/1062 and R record has VolPage: 6993/966
2017-06-21 07:53:34,557 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2312555 I record has VolPage: 7013/1085 and R record has VolPage: /
2017-06-21 07:53:34,558 WARN CSVParser$ FileMd Mismatch!  Document Number: 2317118 I record has FileMd: 626 and R record has FileMd: 624
2017-06-21 07:53:34,558 WARN CSVParser$ FileMd Mismatch!  Document Number: 2317121 I record has FileMd: 626 and R record has FileMd: 624
2017-06-21 07:53:34,559 WARN CSVParser$ FileMd Mismatch!  Document Number: 2317124 I record has FileMd: 626 and R record has FileMd: 624
2017-06-21 07:53:34,560 WARN CSVParser$ FileMd Mismatch!  Document Number: 2317128 I record has FileMd: 626 and R record has FileMd: 624
2017-06-21 07:53:34,560 WARN CSVParser$ FileMd Mismatch!  Document Number: 2317226 I record has FileMd: 626 and R record has FileMd: 628
2017-06-21 07:53:34,562 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2328205 I record has VolPage: 7027/2135 and R record has VolPage: 7027/2134
2017-06-21 07:53:34,563 WARN CSVParser$ FileMd Mismatch!  Document Number: 2329768 I record has FileMd: 716 and R record has FileMd: 715
2017-06-21 07:53:34,564 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2345339 I record has VolPage: 7041/725 and R record has VolPage: 173/501
2017-06-21 07:53:34,565 WARN CSVParser$ FileMd Mismatch!  Document Number: 2348102 I record has FileMd: 807 and R record has FileMd: 806
2017-06-21 07:53:34,566 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2357225 I record has VolPage: 7084/2049 and R record has VolPage: 7084/2050
2017-06-21 07:53:34,567 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2357225 I record has VolPage: 7084/2049 and R record has VolPage: 7084/2050
2017-06-21 07:53:34,568 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2368208 I record has VolPage: 7093/30 and R record has VolPage: 7093/28
2017-06-21 07:53:34,569 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2368208 I record has VolPage: 7093/30 and R record has VolPage: 7093/28
2017-06-21 07:53:34,570 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2368208 I record has VolPage: 7093/30 and R record has VolPage: 7093/28
2017-06-21 07:53:34,571 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2368208 I record has VolPage: 7093/30 and R record has VolPage: 7093/28
2017-06-21 07:53:34,572 WARN CSVParser$ FileMd Mismatch!  Document Number: 2368232 I record has FileMd: 902 and R record has FileMd: 903
2017-06-21 07:53:34,572 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2369179 I record has VolPage: 7094/615 and R record has VolPage: 174/304
2017-06-21 07:53:34,574 WARN CSVParser$ FileMd Mismatch!  Document Number: 2369179 I record has FileMd: 902 and R record has FileMd: 821
2017-06-21 07:53:34,574 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2369179 I record has VolPage: 7094/615 and R record has VolPage: 174/304
2017-06-21 07:53:34,575 WARN CSVParser$ FileMd Mismatch!  Document Number: 2369179 I record has FileMd: 902 and R record has FileMd: 821
2017-06-21 07:53:34,576 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2381142 I record has VolPage: 7104/2191 and R record has VolPage: 175/182
2017-06-21 07:53:34,577 WARN CSVParser$ FileMd Mismatch!  Document Number: 2381142 I record has FileMd: 916 and R record has FileMd: 929
2017-06-21 07:53:34,578 WARN CSVParser$ FileMd Mismatch!  Document Number: 2382415 I record has FileMd: 918 and R record has FileMd: 917
2017-06-21 07:53:34,579 WARN CSVParser$ FileMd Mismatch!  Document Number: 2387148 I record has FileMd: 923 and R record has FileMd: 924
2017-06-21 07:53:34,580 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2429458 I record has VolPage: 7177/2269 and R record has VolPage: 40/50
2017-06-21 07:53:34,582 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2433723 I record has VolPage: 7181/1930 and R record has VolPage: 7181/2030
2017-06-21 07:53:34,583 WARN CSVParser$ FileMd Mismatch!  Document Number: 2433723 I record has FileMd: 1112 and R record has FileMd: 1118
2017-06-21 07:53:34,584 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2458816 I record has VolPage: 7235/844 and R record has VolPage: 7235/846
2017-06-21 07:53:34,585 WARN CSVParser$ FileMd Mismatch!  Document Number: 2458949 I record has FileMd: 1217 and R record has FileMd: 1216
2017-06-21 07:53:34,586 WARN CSVParser$ FileMd Mismatch!  Document Number: 2469582 I record has FileMd: 1231 and R record has FileMd: 1223
2017-06-21 07:53:34,628 WARN CSVParser$ Parsed record length: 1116, Deduped Record Length: 980
```

## 1981
```
2017-06-21 07:55:40,243 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2476896 I record has VolPage: 7255/299 and R record has VolPage: 40/308
2017-06-21 07:55:40,246 WARN CSVParser$ FileMd Mismatch!  Document Number: 2476896 I record has FileMd: 112 and R record has FileMd: 113
2017-06-21 07:55:40,247 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2482389 I record has VolPage: 7263/582 and R record has VolPage: 179/528
2017-06-21 07:55:40,248 WARN CSVParser$ FileMd Mismatch!  Document Number: 2482389 I record has FileMd: 116 and R record has FileMd: 128
2017-06-21 07:55:40,249 WARN CSVParser$ FileMd Mismatch!  Document Number: 2490152 I record has FileMd: 127 and R record has FileMd: 128
2017-06-21 07:55:40,249 WARN CSVParser$ FileMd Mismatch!  Document Number: 2490152 I record has FileMd: 127 and R record has FileMd: 128
2017-06-21 07:55:40,250 WARN CSVParser$ FileMd Mismatch!  Document Number: 2493539 I record has FileMd: 130 and R record has FileMd: 120
2017-06-21 07:55:40,252 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2526862 I record has VolPage: 7342/252 and R record has VolPage: 7342/253
2017-06-21 07:55:40,253 WARN CSVParser$ FileMd Mismatch!  Document Number: 2532497 I record has FileMd: 319 and R record has FileMd: 320
2017-06-21 07:55:40,254 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2537186 I record has VolPage: 7358/358 and R record has VolPage: 7517/300
2017-06-21 07:55:40,254 WARN CSVParser$ FileMd Mismatch!  Document Number: 2537186 I record has FileMd: 327 and R record has FileMd: 724
2017-06-21 07:55:40,255 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2538282 I record has VolPage: 7360/178 and R record has VolPage: 183/538
2017-06-21 07:55:40,256 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2545824 I record has VolPage: 7372/169 and R record has VolPage: 7372/269
2017-06-21 07:55:40,257 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2545824 I record has VolPage: 7372/169 and R record has VolPage: 7372/269
2017-06-21 07:55:40,258 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2545824 I record has VolPage: 7372/169 and R record has VolPage: 7372/269
2017-06-21 07:55:40,259 WARN CSVParser$ FileMd Mismatch!  Document Number: 2546249 I record has FileMd: 407 and R record has FileMd: 406
2017-06-21 07:55:40,260 WARN CSVParser$ FileMd Mismatch!  Document Number: 2559182 I record has FileMd: 424 and R record has FileMd: 423
2017-06-21 07:55:40,262 WARN CSVParser$ FileMd Mismatch!  Document Number: 2604288 I record has FileMd: 617 and R record has FileMd: 517
2017-06-21 07:55:40,263 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2622919 I record has VolPage: 7495/73 and R record has VolPage: 7495/3
2017-06-21 07:55:40,264 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2623236 I record has VolPage: 7495/390 and R record has VolPage: 7495/388
2017-06-21 07:55:40,265 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2625339 I record has VolPage: 7498/598 and R record has VolPage: 186/450
2017-06-21 07:55:40,266 WARN CSVParser$ FileMd Mismatch!  Document Number: 2625339 I record has FileMd: 710 and R record has FileMd: 713
2017-06-21 07:55:40,267 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2631714 I record has VolPage: 7508/456 and R record has VolPage: 187/144
2017-06-21 07:55:40,267 WARN CSVParser$ FileMd Mismatch!  Document Number: 2631714 I record has FileMd: 717 and R record has FileMd: 720
2017-06-21 07:55:40,268 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2631714 I record has VolPage: 7508/456 and R record has VolPage: 187/144
2017-06-21 07:55:40,269 WARN CSVParser$ FileMd Mismatch!  Document Number: 2631714 I record has FileMd: 717 and R record has FileMd: 720
2017-06-21 07:55:40,270 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2643738 I record has VolPage: 7527/317 and R record has VolPage: 7572/317
2017-06-21 07:55:40,271 WARN CSVParser$ FileMd Mismatch!  Document Number: 2651864 I record has FileMd: 811 and R record has FileMd: 810
2017-06-21 07:55:40,272 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2671831 I record has VolPage: 7565/998 and R record has VolPage: 7656/998
2017-06-21 07:55:40,273 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2671831 I record has VolPage: 7565/998 and R record has VolPage: 7656/998
2017-06-21 07:55:40,274 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2674125 I record has VolPage: 7568/287 and R record has VolPage: 7578/271
2017-06-21 07:55:40,275 WARN CSVParser$ FileMd Mismatch!  Document Number: 2674125 I record has FileMd: 903 and R record has FileMd: 916
2017-06-21 07:55:40,275 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2674511 I record has VolPage: 7568/673 and R record has VolPage: 7468/673
2017-06-21 07:55:40,276 WARN CSVParser$ FileMd Mismatch!  Document Number: 2675498 I record has FileMd: 904 and R record has FileMd: 909
2017-06-21 07:55:40,277 WARN CSVParser$ FileMd Mismatch!  Document Number: 2678870 I record has FileMd: 909 and R record has FileMd: 910
2017-06-21 07:55:40,278 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2690523 I record has VolPage: 7584/427 and R record has VolPage: 7514/427
2017-06-21 07:55:40,279 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2635571 I record has VolPage: 7589/18 and R record has VolPage: 7514/553
2017-06-21 07:55:40,280 WARN CSVParser$ FileMd Mismatch!  Document Number: 2635571 I record has FileMd: 1001 and R record has FileMd: 723
2017-06-21 07:55:40,281 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2635571 I record has VolPage: 7589/18 and R record has VolPage: 7514/553
2017-06-21 07:55:40,282 WARN CSVParser$ FileMd Mismatch!  Document Number: 2635571 I record has FileMd: 1001 and R record has FileMd: 723
2017-06-21 07:55:40,282 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2635613 I record has VolPage: 7589/60 and R record has VolPage: 7514/595
2017-06-21 07:55:40,283 WARN CSVParser$ FileMd Mismatch!  Document Number: 2635613 I record has FileMd: 1001 and R record has FileMd: 723
2017-06-21 07:55:40,284 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2635631 I record has VolPage: 7589/78 and R record has VolPage: 7515/13
2017-06-21 07:55:40,285 WARN CSVParser$ FileMd Mismatch!  Document Number: 2635631 I record has FileMd: 1001 and R record has FileMd: 723
2017-06-21 07:55:40,285 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2635631 I record has VolPage: 7589/78 and R record has VolPage: 7515/13
2017-06-21 07:55:40,286 WARN CSVParser$ FileMd Mismatch!  Document Number: 2635631 I record has FileMd: 1001 and R record has FileMd: 723
2017-06-21 07:55:40,287 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2635978 I record has VolPage: 7589/425 and R record has VolPage: 7515/360
2017-06-21 07:55:40,288 WARN CSVParser$ FileMd Mismatch!  Document Number: 2635978 I record has FileMd: 1001 and R record has FileMd: 723
2017-06-21 07:55:40,289 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2636355 I record has VolPage: 7589/802 and R record has VolPage: 187/280
2017-06-21 07:55:40,290 WARN CSVParser$ FileMd Mismatch!  Document Number: 2636355 I record has FileMd: 1001 and R record has FileMd: 724
2017-06-21 07:55:40,290 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2636376 I record has VolPage: 7589/823 and R record has VolPage: 7516/93
2017-06-21 07:55:40,291 WARN CSVParser$ FileMd Mismatch!  Document Number: 2636376 I record has FileMd: 1001 and R record has FileMd: 724
2017-06-21 07:55:40,292 WARN CSVParser$ FileMd Mismatch!  Document Number: 2728399 I record has FileMd: 1112 and R record has FileMd: 812
2017-06-21 07:55:40,293 WARN CSVParser$ FileMd Mismatch!  Document Number: 2738380 I record has FileMd: 1130 and R record has FileMd: 1120
2017-06-21 07:55:40,294 WARN CSVParser$ FileMd Mismatch!  Document Number: 2747418 I record has FileMd: 1211 and R record has FileMd: 1214
2017-06-21 07:55:40,335 WARN CSVParser$ Parsed record length: 1021, Deduped Record Length: 899
```

## 1982
```
2017-06-21 07:57:05,041 WARN CSVParser$ FileMd Mismatch!  Document Number: 2777168 I record has FileMd: 127 and R record has FileMd: 128
2017-06-21 07:57:05,045 WARN CSVParser$ FileMd Mismatch!  Document Number: 2780015 I record has FileMd: 201 and R record has FileMd: 202
2017-06-21 07:57:05,046 WARN CSVParser$ FileMd Mismatch!  Document Number: 2787338 I record has FileMd: 210 and R record has FileMd: 212
2017-06-21 07:57:05,046 WARN CSVParser$ FileMd Mismatch!  Document Number: 2789425 I record has FileMd: 210 and R record has FileMd: 205
2017-06-21 07:57:05,047 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2793326 I record has VolPage: 7685/887 and R record has VolPage: 7685/891
2017-06-21 07:57:05,048 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2817162 I record has VolPage: 7709/716 and R record has VolPage: 77/716
2017-06-21 07:57:05,049 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2831859 I record has VolPage: 7724/258 and R record has VolPage: 7724/257
2017-06-21 07:57:05,050 WARN CSVParser$ FileMd Mismatch!  Document Number: 2831912 I record has FileMd: 409 and R record has FileMd: 412
2017-06-21 07:57:05,050 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2848732 I record has VolPage: 7734/61 and R record has VolPage: 7733/61
2017-06-21 07:57:05,051 WARN CSVParser$ FileMd Mismatch!  Document Number: 2848732 I record has FileMd: 422 and R record has FileMd: 503
2017-06-21 07:57:05,051 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2844156 I record has VolPage: 7736/441 and R record has VolPage: 7736/431
2017-06-21 07:57:05,052 WARN CSVParser$ FileMd Mismatch!  Document Number: 2853752 I record has FileMd: 427 and R record has FileMd: 510
2017-06-21 07:57:05,053 WARN CSVParser$ Volume/Page Mismatch!  Document Number: 2845202 I record has VolPage: 7737/487 and R record has VolPage: 7735/487
2017-06-21 07:57:05,054 WARN CSVParser$ FileMd Mismatch!  Document Number: 2845342 I record has FileMd: 428 and R record has FileMd: 429
2017-06-21 07:57:05,055 WARN CSVParser$ FileMd Mismatch!  Document Number: 2845345 I record has FileMd: 428 and R record has FileMd: 429
2017-06-21 07:57:05,084 WARN CSVParser$ Parsed record length: 301, Deduped Record Length: 254
```
