# travis_img_rec

We recieved the Travis County Clerk's index and images from 1974 - 1982.  We used the index to target a subset of document types to rename the images in document number format and to geneate image only souce type 'I' records on the title plant.  This was done to index these images to our system.  We also have some pre-1982 survey records keyed on our system.  This project is designed to identify source type 'I' records that also exist as source type 'R' in the survey records.

The CSV files were created from the sql queries outlined in the misc directory.  Basically, we matched 'I' records to 'R' records.

This program reads the CSV file, does some QC between the 'I' and 'R' record like confirming the volume/pages match, etc.  Then, it copies the source type 'I' images from the Image Repostiory to the preindex directory.

After this program completes, the target 'R' images are ready to index in the preindex directory.

# 1978 Log File
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
2017-06-20 16:16:09,562 INFO CopyFiles$ Processing DocNum: 1752481, FileYear: 1978, FileMd: 428, Files: List(Z:\I\1978\04\28\1752481.001, Z:\I\1978\04\28\1752481.002)
2017-06-20 16:16:09,562 INFO CopyFiles$ Copying: Z:\I\1978\04\28\1752481.001 to: ./preindex/1978/1752481.001
2017-06-20 16:16:09,577 INFO CopyFiles$ Copying: Z:\I\1978\04\28\1752481.002 to: ./preindex/1978/1752481.002
2017-06-20 16:16:09,593 INFO CopyFiles$ Processing DocNum: 1785081, FileYear: 1978, FileMd: 531, Files: List(Z:\I\1978\05\31\1785081.001, Z:\I\1978\05\31\1785081.002, Z:\I\1978\05\31\1785081.003)
2017-06-20 16:16:09,593 INFO CopyFiles$ Copying: Z:\I\1978\05\31\1785081.001 to: ./preindex/1978/1785081.001
2017-06-20 16:16:09,609 INFO CopyFiles$ Copying: Z:\I\1978\05\31\1785081.002 to: ./preindex/1978/1785081.002
2017-06-20 16:16:09,609 INFO CopyFiles$ Copying: Z:\I\1978\05\31\1785081.003 to: ./preindex/1978/1785081.003
2017-06-20 16:16:09,640 INFO CopyFiles$ Processing DocNum: 1814610, FileYear: 1978, FileMd: 724, Files: List(Z:\I\1978\07\24\1814610.001, Z:\I\1978\07\24\1814610.002, Z:\I\1978\07\24\1814610.003, Z:\I\1978\07\24\1814610.004, Z:\I\1978\07\24\1814610.005)
2017-06-20 16:16:09,640 INFO CopyFiles$ Copying: Z:\I\1978\07\24\1814610.001 to: ./preindex/1978/1814610.001
2017-06-20 16:16:09,655 INFO CopyFiles$ Copying: Z:\I\1978\07\24\1814610.002 to: ./preindex/1978/1814610.002
2017-06-20 16:16:09,655 INFO CopyFiles$ Copying: Z:\I\1978\07\24\1814610.003 to: ./preindex/1978/1814610.003
2017-06-20 16:16:09,671 INFO CopyFiles$ Copying: Z:\I\1978\07\24\1814610.004 to: ./preindex/1978/1814610.004
2017-06-20 16:16:09,671 INFO CopyFiles$ Copying: Z:\I\1978\07\24\1814610.005 to: ./preindex/1978/1814610.005
2017-06-20 16:16:09,687 INFO CopyFiles$ Processing DocNum: 1739845, FileYear: 1978, FileMd: 410, Files: List(Z:\I\1978\04\10\1739845.001, Z:\I\1978\04\10\1739845.002)
2017-06-20 16:16:09,702 INFO CopyFiles$ Copying: Z:\I\1978\04\10\1739845.001 to: ./preindex/1978/1739845.001
2017-06-20 16:16:09,702 INFO CopyFiles$ Copying: Z:\I\1978\04\10\1739845.002 to: ./preindex/1978/1739845.002
2017-06-20 16:16:09,718 INFO CopyFiles$ Processing DocNum: 1804025, FileYear: 1978, FileMd: 710, Files: List(Z:\I\1978\07\10\1804025.001, Z:\I\1978\07\10\1804025.002, Z:\I\1978\07\10\1804025.003, Z:\I\1978\07\10\1804025.004, Z:\I\1978\07\10\1804025.005, Z:\I\1978\07\10\1804025.006, Z:\I\1978\07\10\1804025.007, Z:\I\1978\07\10\1804025.008, Z:\I\1978\07\10\1804025.009)
2017-06-20 16:16:09,718 INFO CopyFiles$ Copying: Z:\I\1978\07\10\1804025.001 to: ./preindex/1978/1804025.001
2017-06-20 16:16:09,733 INFO CopyFiles$ Copying: Z:\I\1978\07\10\1804025.002 to: ./preindex/1978/1804025.002
2017-06-20 16:16:09,733 INFO CopyFiles$ Copying: Z:\I\1978\07\10\1804025.003 to: ./preindex/1978/1804025.003
2017-06-20 16:16:09,749 INFO CopyFiles$ Copying: Z:\I\1978\07\10\1804025.004 to: ./preindex/1978/1804025.004
2017-06-20 16:16:09,765 INFO CopyFiles$ Copying: Z:\I\1978\07\10\1804025.005 to: ./preindex/1978/1804025.005
2017-06-20 16:16:09,765 INFO CopyFiles$ Copying: Z:\I\1978\07\10\1804025.006 to: ./preindex/1978/1804025.006
2017-06-20 16:16:09,780 INFO CopyFiles$ Copying: Z:\I\1978\07\10\1804025.007 to: ./preindex/1978/1804025.007
2017-06-20 16:16:09,796 INFO CopyFiles$ Copying: Z:\I\1978\07\10\1804025.008 to: ./preindex/1978/1804025.008
2017-06-20 16:16:09,796 INFO CopyFiles$ Copying: Z:\I\1978\07\10\1804025.009 to: ./preindex/1978/1804025.009
2017-06-20 16:16:09,811 INFO CopyFiles$ Processing DocNum: 1898928, FileYear: 1978, FileMd: 1115, Files: List(Z:\I\1978\11\15\1898928.001, Z:\I\1978\11\15\1898928.002)
2017-06-20 16:16:09,811 INFO CopyFiles$ Copying: Z:\I\1978\11\15\1898928.001 to: ./preindex/1978/1898928.001
2017-06-20 16:16:09,811 INFO CopyFiles$ Copying: Z:\I\1978\11\15\1898928.002 to: ./preindex/1978/1898928.002
2017-06-20 16:16:09,827 INFO CopyFiles$ Processing DocNum: 1907036, FileYear: 1978, FileMd: 1128, Files: List(Z:\I\1978\11\28\1907036.001, Z:\I\1978\11\28\1907036.002, Z:\I\1978\11\28\1907036.003, Z:\I\1978\11\28\1907036.004, Z:\I\1978\11\28\1907036.005)
2017-06-20 16:16:09,827 INFO CopyFiles$ Copying: Z:\I\1978\11\28\1907036.001 to: ./preindex/1978/1907036.001
2017-06-20 16:16:09,843 INFO CopyFiles$ Copying: Z:\I\1978\11\28\1907036.002 to: ./preindex/1978/1907036.002
2017-06-20 16:16:09,843 INFO CopyFiles$ Copying: Z:\I\1978\11\28\1907036.003 to: ./preindex/1978/1907036.003
2017-06-20 16:16:09,858 INFO CopyFiles$ Copying: Z:\I\1978\11\28\1907036.004 to: ./preindex/1978/1907036.004
2017-06-20 16:16:09,858 INFO CopyFiles$ Copying: Z:\I\1978\11\28\1907036.005 to: ./preindex/1978/1907036.005
2017-06-20 16:16:09,874 INFO CopyFiles$ Processing DocNum: 1743124, FileYear: 1978, FileMd: 414, Files: List(Z:\I\1978\04\14\1743124.001, Z:\I\1978\04\14\1743124.002, Z:\I\1978\04\14\1743124.003)
2017-06-20 16:16:09,874 INFO CopyFiles$ Copying: Z:\I\1978\04\14\1743124.001 to: ./preindex/1978/1743124.001
2017-06-20 16:16:09,889 INFO CopyFiles$ Copying: Z:\I\1978\04\14\1743124.002 to: ./preindex/1978/1743124.002
2017-06-20 16:16:09,889 INFO CopyFiles$ Copying: Z:\I\1978\04\14\1743124.003 to: ./preindex/1978/1743124.003
2017-06-20 16:16:09,905 INFO CopyFiles$ Processing DocNum: 1902120, FileYear: 1978, FileMd: 1120, Files: List(Z:\I\1978\11\20\1902120.001, Z:\I\1978\11\20\1902120.002)
2017-06-20 16:16:09,905 INFO CopyFiles$ Copying: Z:\I\1978\11\20\1902120.001 to: ./preindex/1978/1902120.001
2017-06-20 16:16:09,921 INFO CopyFiles$ Copying: Z:\I\1978\11\20\1902120.002 to: ./preindex/1978/1902120.002
2017-06-20 16:16:09,921 INFO CopyFiles$ Processing DocNum: 1817546, FileYear: 1978, FileMd: 727, Files: List(Z:\I\1978\07\27\1817546.001, Z:\I\1978\07\27\1817546.002)
2017-06-20 16:16:09,936 INFO CopyFiles$ Copying: Z:\I\1978\07\27\1817546.001 to: ./preindex/1978/1817546.001
2017-06-20 16:16:09,936 INFO CopyFiles$ Copying: Z:\I\1978\07\27\1817546.002 to: ./preindex/1978/1817546.002
2017-06-20 16:16:09,952 INFO CopyFiles$ Processing DocNum: 1793014, FileYear: 1978, FileMd: 623, Files: List(Z:\I\1978\06\23\1793014.001, Z:\I\1978\06\23\1793014.002)
2017-06-20 16:16:09,952 INFO CopyFiles$ Copying: Z:\I\1978\06\23\1793014.001 to: ./preindex/1978/1793014.001
2017-06-20 16:16:09,967 INFO CopyFiles$ Copying: Z:\I\1978\06\23\1793014.002 to: ./preindex/1978/1793014.002
2017-06-20 16:16:09,967 INFO CopyFiles$ Processing DocNum: 1890755, FileYear: 1978, FileMd: 1102, Files: List(Z:\I\1978\11\02\1890755.001, Z:\I\1978\11\02\1890755.002, Z:\I\1978\11\02\1890755.003, Z:\I\1978\11\02\1890755.004)
2017-06-20 16:16:09,983 INFO CopyFiles$ Copying: Z:\I\1978\11\02\1890755.001 to: ./preindex/1978/1890755.001
2017-06-20 16:16:09,983 INFO CopyFiles$ Copying: Z:\I\1978\11\02\1890755.002 to: ./preindex/1978/1890755.002
2017-06-20 16:16:09,983 INFO CopyFiles$ Copying: Z:\I\1978\11\02\1890755.003 to: ./preindex/1978/1890755.003
2017-06-20 16:16:09,999 INFO CopyFiles$ Copying: Z:\I\1978\11\02\1890755.004 to: ./preindex/1978/1890755.004
2017-06-20 16:16:10,014 INFO CopyFiles$ Processing DocNum: 1787273, FileYear: 1978, FileMd: 615, Files: List(Z:\I\1978\06\15\1787273.001, Z:\I\1978\06\15\1787273.002, Z:\I\1978\06\15\1787273.003, Z:\I\1978\06\15\1787273.004)
2017-06-20 16:16:10,014 INFO CopyFiles$ Copying: Z:\I\1978\06\15\1787273.001 to: ./preindex/1978/1787273.001
2017-06-20 16:16:10,014 INFO CopyFiles$ Copying: Z:\I\1978\06\15\1787273.002 to: ./preindex/1978/1787273.002
2017-06-20 16:16:10,030 INFO CopyFiles$ Copying: Z:\I\1978\06\15\1787273.003 to: ./preindex/1978/1787273.003
2017-06-20 16:16:10,030 INFO CopyFiles$ Copying: Z:\I\1978\06\15\1787273.004 to: ./preindex/1978/1787273.004
2017-06-20 16:16:10,045 INFO CopyFiles$ Processing DocNum: 1711517, FileYear: 1978, FileMd: 228, Files: List(Z:\I\1978\02\28\1711517.001, Z:\I\1978\02\28\1711517.002)
2017-06-20 16:16:10,045 INFO CopyFiles$ Copying: Z:\I\1978\02\28\1711517.001 to: ./preindex/1978/1711517.001
2017-06-20 16:16:10,061 INFO CopyFiles$ Copying: Z:\I\1978\02\28\1711517.002 to: ./preindex/1978/1711517.002
2017-06-20 16:16:10,061 INFO CopyFiles$ Processing DocNum: 1681166, FileYear: 1978, FileMd: 111, Files: List(Z:\I\1978\01\11\1681166.001, Z:\I\1978\01\11\1681166.002, Z:\I\1978\01\11\1681166.003, Z:\I\1978\01\11\1681166.004)
2017-06-20 16:16:10,077 INFO CopyFiles$ Copying: Z:\I\1978\01\11\1681166.001 to: ./preindex/1978/1681166.001
2017-06-20 16:16:10,077 INFO CopyFiles$ Copying: Z:\I\1978\01\11\1681166.002 to: ./preindex/1978/1681166.002
2017-06-20 16:16:10,077 INFO CopyFiles$ Copying: Z:\I\1978\01\11\1681166.003 to: ./preindex/1978/1681166.003
2017-06-20 16:16:10,092 INFO CopyFiles$ Copying: Z:\I\1978\01\11\1681166.004 to: ./preindex/1978/1681166.004
2017-06-20 16:16:10,108 INFO CopyFiles$ Processing DocNum: 1798436, FileYear: 1978, FileMd: 630, Files: List(Z:\I\1978\06\30\1798436.001, Z:\I\1978\06\30\1798436.002, Z:\I\1978\06\30\1798436.003)
2017-06-20 16:16:10,108 INFO CopyFiles$ Copying: Z:\I\1978\06\30\1798436.001 to: ./preindex/1978/1798436.001
2017-06-20 16:16:10,108 INFO CopyFiles$ Copying: Z:\I\1978\06\30\1798436.002 to: ./preindex/1978/1798436.002
2017-06-20 16:16:10,123 INFO CopyFiles$ Copying: Z:\I\1978\06\30\1798436.003 to: ./preindex/1978/1798436.003
2017-06-20 16:16:10,123 INFO CopyFiles$ Processing DocNum: 1876038, FileYear: 1978, FileMd: 1012, Files: List(Z:\I\1978\10\12\1876038.001, Z:\I\1978\10\12\1876038.002)
2017-06-20 16:16:10,139 INFO CopyFiles$ Copying: Z:\I\1978\10\12\1876038.001 to: ./preindex/1978/1876038.001
2017-06-20 16:16:10,139 INFO CopyFiles$ Copying: Z:\I\1978\10\12\1876038.002 to: ./preindex/1978/1876038.002
2017-06-20 16:16:10,155 INFO CopyFiles$ Processing DocNum: 1684673, FileYear: 1978, FileMd: 117, Files: List(Z:\I\1978\01\17\1684673.001, Z:\I\1978\01\17\1684673.002, Z:\I\1978\01\17\1684673.003)
2017-06-20 16:16:10,155 INFO CopyFiles$ Copying: Z:\I\1978\01\17\1684673.001 to: ./preindex/1978/1684673.001
2017-06-20 16:16:10,155 INFO CopyFiles$ Copying: Z:\I\1978\01\17\1684673.002 to: ./preindex/1978/1684673.002
2017-06-20 16:16:10,170 INFO CopyFiles$ Copying: Z:\I\1978\01\17\1684673.003 to: ./preindex/1978/1684673.003
2017-06-20 16:16:10,170 INFO CopyFiles$ Processing DocNum: 1834720, FileYear: 1978, FileMd: 817, Files: List(Z:\I\1978\08\17\1834720.001, Z:\I\1978\08\17\1834720.002, Z:\I\1978\08\17\1834720.003, Z:\I\1978\08\17\1834720.004)
2017-06-20 16:16:10,186 INFO CopyFiles$ Copying: Z:\I\1978\08\17\1834720.001 to: ./preindex/1978/1834720.001
2017-06-20 16:16:10,186 INFO CopyFiles$ Copying: Z:\I\1978\08\17\1834720.002 to: ./preindex/1978/1834720.002
2017-06-20 16:16:10,186 INFO CopyFiles$ Copying: Z:\I\1978\08\17\1834720.003 to: ./preindex/1978/1834720.003
2017-06-20 16:16:10,201 INFO CopyFiles$ Copying: Z:\I\1978\08\17\1834720.004 to: ./preindex/1978/1834720.004
2017-06-20 16:16:10,201 INFO CopyFiles$ Processing DocNum: 1746709, FileYear: 1978, FileMd: 420, Files: List(Z:\I\1978\04\20\1746709.001, Z:\I\1978\04\20\1746709.002, Z:\I\1978\04\20\1746709.003)
2017-06-20 16:16:10,217 INFO CopyFiles$ Copying: Z:\I\1978\04\20\1746709.001 to: ./preindex/1978/1746709.001
2017-06-20 16:16:10,217 INFO CopyFiles$ Copying: Z:\I\1978\04\20\1746709.002 to: ./preindex/1978/1746709.002
2017-06-20 16:16:10,233 INFO CopyFiles$ Copying: Z:\I\1978\04\20\1746709.003 to: ./preindex/1978/1746709.003
2017-06-20 16:16:10,248 INFO CopyFiles$ Processing DocNum: 1819564, FileYear: 1978, FileMd: 731, Files: List(Z:\I\1978\07\31\1819564.001, Z:\I\1978\07\31\1819564.002, Z:\I\1978\07\31\1819564.003, Z:\I\1978\07\31\1819564.004)
2017-06-20 16:16:10,248 INFO CopyFiles$ Copying: Z:\I\1978\07\31\1819564.001 to: ./preindex/1978/1819564.001
2017-06-20 16:16:10,248 INFO CopyFiles$ Copying: Z:\I\1978\07\31\1819564.002 to: ./preindex/1978/1819564.002
2017-06-20 16:16:10,248 INFO CopyFiles$ Copying: Z:\I\1978\07\31\1819564.003 to: ./preindex/1978/1819564.003
2017-06-20 16:16:10,264 INFO CopyFiles$ Copying: Z:\I\1978\07\31\1819564.004 to: ./preindex/1978/1819564.004
2017-06-20 16:16:10,295 INFO CopyFiles$ Processing DocNum: 1906031, FileYear: 1978, FileMd: 1127, Files: List(Z:\I\1978\11\27\1906031.001, Z:\I\1978\11\27\1906031.002)
2017-06-20 16:16:10,295 INFO CopyFiles$ Copying: Z:\I\1978\11\27\1906031.001 to: ./preindex/1978/1906031.001
2017-06-20 16:16:10,295 INFO CopyFiles$ Copying: Z:\I\1978\11\27\1906031.002 to: ./preindex/1978/1906031.002
2017-06-20 16:16:10,311 INFO CopyFiles$ Processing DocNum: 1803310, FileYear: 1978, FileMd: 707, Files: List(Z:\I\1978\07\07\1803310.001, Z:\I\1978\07\07\1803310.002, Z:\I\1978\07\07\1803310.003)
2017-06-20 16:16:10,311 INFO CopyFiles$ Copying: Z:\I\1978\07\07\1803310.001 to: ./preindex/1978/1803310.001
2017-06-20 16:16:10,326 INFO CopyFiles$ Copying: Z:\I\1978\07\07\1803310.002 to: ./preindex/1978/1803310.002
2017-06-20 16:16:10,326 INFO CopyFiles$ Copying: Z:\I\1978\07\07\1803310.003 to: ./preindex/1978/1803310.003
2017-06-20 16:16:10,342 INFO CopyFiles$ Processing DocNum: 1851603, FileYear: 1978, FileMd: 911, Files: List(Z:\I\1978\09\11\1851603.001, Z:\I\1978\09\11\1851603.002)
2017-06-20 16:16:10,357 INFO CopyFiles$ Copying: Z:\I\1978\09\11\1851603.001 to: ./preindex/1978/1851603.001
2017-06-20 16:16:10,373 INFO CopyFiles$ Copying: Z:\I\1978\09\11\1851603.002 to: ./preindex/1978/1851603.002
2017-06-20 16:16:10,373 INFO CopyFiles$ Processing DocNum: 1853510, FileYear: 1978, FileMd: 912, Files: List(Z:\I\1978\09\12\1853510.001, Z:\I\1978\09\12\1853510.002, Z:\I\1978\09\12\1853510.003, Z:\I\1978\09\12\1853510.004, Z:\I\1978\09\12\1853510.005, Z:\I\1978\09\12\1853510.006, Z:\I\1978\09\12\1853510.007)
2017-06-20 16:16:10,389 INFO CopyFiles$ Copying: Z:\I\1978\09\12\1853510.001 to: ./preindex/1978/1853510.001
2017-06-20 16:16:10,389 INFO CopyFiles$ Copying: Z:\I\1978\09\12\1853510.002 to: ./preindex/1978/1853510.002
2017-06-20 16:16:10,389 INFO CopyFiles$ Copying: Z:\I\1978\09\12\1853510.003 to: ./preindex/1978/1853510.003
2017-06-20 16:16:10,404 INFO CopyFiles$ Copying: Z:\I\1978\09\12\1853510.004 to: ./preindex/1978/1853510.004
2017-06-20 16:16:10,404 INFO CopyFiles$ Copying: Z:\I\1978\09\12\1853510.005 to: ./preindex/1978/1853510.005
2017-06-20 16:16:10,420 INFO CopyFiles$ Copying: Z:\I\1978\09\12\1853510.006 to: ./preindex/1978/1853510.006
2017-06-20 16:16:10,420 INFO CopyFiles$ Copying: Z:\I\1978\09\12\1853510.007 to: ./preindex/1978/1853510.007
2017-06-20 16:16:10,435 INFO CopyFiles$ Processing DocNum: 1909876, FileYear: 1978, FileMd: 1201, Files: List(Z:\I\1978\12\01\1909876.001, Z:\I\1978\12\01\1909876.002, Z:\I\1978\12\01\1909876.003, Z:\I\1978\12\01\1909876.004, Z:\I\1978\12\01\1909876.005)
2017-06-20 16:16:10,435 INFO CopyFiles$ Copying: Z:\I\1978\12\01\1909876.001 to: ./preindex/1978/1909876.001
2017-06-20 16:16:10,435 INFO CopyFiles$ Copying: Z:\I\1978\12\01\1909876.002 to: ./preindex/1978/1909876.002
2017-06-20 16:16:10,451 INFO CopyFiles$ Copying: Z:\I\1978\12\01\1909876.003 to: ./preindex/1978/1909876.003
2017-06-20 16:16:10,451 INFO CopyFiles$ Copying: Z:\I\1978\12\01\1909876.004 to: ./preindex/1978/1909876.004
2017-06-20 16:16:10,451 INFO CopyFiles$ Copying: Z:\I\1978\12\01\1909876.005 to: ./preindex/1978/1909876.005
2017-06-20 16:16:10,467 INFO CopyFiles$ Processing DocNum: 1914427, FileYear: 1978, FileMd: 1208, Files: List(Z:\I\1978\12\08\1914427.001, Z:\I\1978\12\08\1914427.002, Z:\I\1978\12\08\1914427.003, Z:\I\1978\12\08\1914427.004, Z:\I\1978\12\08\1914427.005)
2017-06-20 16:16:10,467 INFO CopyFiles$ Copying: Z:\I\1978\12\08\1914427.001 to: ./preindex/1978/1914427.001
2017-06-20 16:16:10,482 INFO CopyFiles$ Copying: Z:\I\1978\12\08\1914427.002 to: ./preindex/1978/1914427.002
2017-06-20 16:16:10,482 INFO CopyFiles$ Copying: Z:\I\1978\12\08\1914427.003 to: ./preindex/1978/1914427.003
2017-06-20 16:16:10,482 INFO CopyFiles$ Copying: Z:\I\1978\12\08\1914427.004 to: ./preindex/1978/1914427.004
2017-06-20 16:16:10,498 INFO CopyFiles$ Copying: Z:\I\1978\12\08\1914427.005 to: ./preindex/1978/1914427.005
2017-06-20 16:16:10,498 INFO CopyFiles$ Processing DocNum: 1813067, FileYear: 1978, FileMd: 720, Files: List(Z:\I\1978\07\20\1813067.001, Z:\I\1978\07\20\1813067.002, Z:\I\1978\07\20\1813067.003, Z:\I\1978\07\20\1813067.004)
2017-06-20 16:16:10,513 INFO CopyFiles$ Copying: Z:\I\1978\07\20\1813067.001 to: ./preindex/1978/1813067.001
2017-06-20 16:16:10,513 INFO CopyFiles$ Copying: Z:\I\1978\07\20\1813067.002 to: ./preindex/1978/1813067.002
2017-06-20 16:16:10,513 INFO CopyFiles$ Copying: Z:\I\1978\07\20\1813067.003 to: ./preindex/1978/1813067.003
2017-06-20 16:16:10,513 INFO CopyFiles$ Copying: Z:\I\1978\07\20\1813067.004 to: ./preindex/1978/1813067.004
2017-06-20 16:16:10,529 INFO CopyFiles$ Processing DocNum: 1854167, FileYear: 1978, FileMd: 913, Files: List(Z:\I\1978\09\13\1854167.001, Z:\I\1978\09\13\1854167.002, Z:\I\1978\09\13\1854167.003)
2017-06-20 16:16:10,545 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1854167.001 to: ./preindex/1978/1854167.001
2017-06-20 16:16:10,545 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1854167.002 to: ./preindex/1978/1854167.002
2017-06-20 16:16:10,560 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1854167.003 to: ./preindex/1978/1854167.003
2017-06-20 16:16:10,576 INFO CopyFiles$ Processing DocNum: 1820727, FileYear: 1978, FileMd: 801, Files: List(Z:\I\1978\08\01\1820727.001, Z:\I\1978\08\01\1820727.002)
2017-06-20 16:16:10,576 INFO CopyFiles$ Copying: Z:\I\1978\08\01\1820727.001 to: ./preindex/1978/1820727.001
2017-06-20 16:16:10,576 INFO CopyFiles$ Copying: Z:\I\1978\08\01\1820727.002 to: ./preindex/1978/1820727.002
2017-06-20 16:16:10,591 INFO CopyFiles$ Processing DocNum: 1908207, FileYear: 1978, FileMd: 1129, Files: List(Z:\I\1978\11\29\1908207.001, Z:\I\1978\11\29\1908207.002, Z:\I\1978\11\29\1908207.003)
2017-06-20 16:16:10,591 INFO CopyFiles$ Copying: Z:\I\1978\11\29\1908207.001 to: ./preindex/1978/1908207.001
2017-06-20 16:16:10,591 INFO CopyFiles$ Copying: Z:\I\1978\11\29\1908207.002 to: ./preindex/1978/1908207.002
2017-06-20 16:16:10,607 INFO CopyFiles$ Copying: Z:\I\1978\11\29\1908207.003 to: ./preindex/1978/1908207.003
2017-06-20 16:16:10,607 INFO CopyFiles$ Processing DocNum: 1785872, FileYear: 1978, FileMd: 613, Files: List(Z:\I\1978\06\13\1785872.001, Z:\I\1978\06\13\1785872.002, Z:\I\1978\06\13\1785872.003, Z:\I\1978\06\13\1785872.004, Z:\I\1978\06\13\1785872.005)
2017-06-20 16:16:10,623 INFO CopyFiles$ Copying: Z:\I\1978\06\13\1785872.001 to: ./preindex/1978/1785872.001
2017-06-20 16:16:10,623 INFO CopyFiles$ Copying: Z:\I\1978\06\13\1785872.002 to: ./preindex/1978/1785872.002
2017-06-20 16:16:10,638 INFO CopyFiles$ Copying: Z:\I\1978\06\13\1785872.003 to: ./preindex/1978/1785872.003
2017-06-20 16:16:10,638 INFO CopyFiles$ Copying: Z:\I\1978\06\13\1785872.004 to: ./preindex/1978/1785872.004
2017-06-20 16:16:10,654 INFO CopyFiles$ Copying: Z:\I\1978\06\13\1785872.005 to: ./preindex/1978/1785872.005
2017-06-20 16:16:10,669 INFO CopyFiles$ Processing DocNum: 1781255, FileYear: 1978, FileMd: 607, Files: List(Z:\I\1978\06\07\1781255.001, Z:\I\1978\06\07\1781255.002, Z:\I\1978\06\07\1781255.003, Z:\I\1978\06\07\1781255.004)
2017-06-20 16:16:10,669 INFO CopyFiles$ Copying: Z:\I\1978\06\07\1781255.001 to: ./preindex/1978/1781255.001
2017-06-20 16:16:10,669 INFO CopyFiles$ Copying: Z:\I\1978\06\07\1781255.002 to: ./preindex/1978/1781255.002
2017-06-20 16:16:10,685 INFO CopyFiles$ Copying: Z:\I\1978\06\07\1781255.003 to: ./preindex/1978/1781255.003
2017-06-20 16:16:10,685 INFO CopyFiles$ Copying: Z:\I\1978\06\07\1781255.004 to: ./preindex/1978/1781255.004
2017-06-20 16:16:10,701 INFO CopyFiles$ Processing DocNum: 1774468, FileYear: 1978, FileMd: 526, Files: List(Z:\I\1978\05\26\1774468.001, Z:\I\1978\05\26\1774468.002, Z:\I\1978\05\26\1774468.003, Z:\I\1978\05\26\1774468.004)
2017-06-20 16:16:10,701 INFO CopyFiles$ Copying: Z:\I\1978\05\26\1774468.001 to: ./preindex/1978/1774468.001
2017-06-20 16:16:10,701 INFO CopyFiles$ Copying: Z:\I\1978\05\26\1774468.002 to: ./preindex/1978/1774468.002
2017-06-20 16:16:10,716 INFO CopyFiles$ Copying: Z:\I\1978\05\26\1774468.003 to: ./preindex/1978/1774468.003
2017-06-20 16:16:10,716 INFO CopyFiles$ Copying: Z:\I\1978\05\26\1774468.004 to: ./preindex/1978/1774468.004
2017-06-20 16:16:10,732 INFO CopyFiles$ Processing DocNum: 1925921, FileYear: 1978, FileMd: 1228, Files: List(Z:\I\1978\12\28\1925921.001, Z:\I\1978\12\28\1925921.002)
2017-06-20 16:16:10,732 INFO CopyFiles$ Copying: Z:\I\1978\12\28\1925921.001 to: ./preindex/1978/1925921.001
2017-06-20 16:16:10,732 INFO CopyFiles$ Copying: Z:\I\1978\12\28\1925921.002 to: ./preindex/1978/1925921.002
2017-06-20 16:16:10,747 INFO CopyFiles$ Processing DocNum: 1734506, FileYear: 1978, FileMd: 405, Files: List(Z:\I\1978\04\05\1734506.001, Z:\I\1978\04\05\1734506.002, Z:\I\1978\04\05\1734506.003, Z:\I\1978\04\05\1734506.004)
2017-06-20 16:16:10,747 INFO CopyFiles$ Copying: Z:\I\1978\04\05\1734506.001 to: ./preindex/1978/1734506.001
2017-06-20 16:16:10,747 INFO CopyFiles$ Copying: Z:\I\1978\04\05\1734506.002 to: ./preindex/1978/1734506.002
2017-06-20 16:16:10,763 INFO CopyFiles$ Copying: Z:\I\1978\04\05\1734506.003 to: ./preindex/1978/1734506.003
2017-06-20 16:16:10,763 INFO CopyFiles$ Copying: Z:\I\1978\04\05\1734506.004 to: ./preindex/1978/1734506.004
2017-06-20 16:16:10,779 INFO CopyFiles$ Processing DocNum: 1897309, FileYear: 1978, FileMd: 1113, Files: List(Z:\I\1978\11\13\1897309.001, Z:\I\1978\11\13\1897309.002, Z:\I\1978\11\13\1897309.003)
2017-06-20 16:16:10,794 INFO CopyFiles$ Copying: Z:\I\1978\11\13\1897309.001 to: ./preindex/1978/1897309.001
2017-06-20 16:16:10,794 INFO CopyFiles$ Copying: Z:\I\1978\11\13\1897309.002 to: ./preindex/1978/1897309.002
2017-06-20 16:16:10,810 INFO CopyFiles$ Copying: Z:\I\1978\11\13\1897309.003 to: ./preindex/1978/1897309.003
2017-06-20 16:16:10,810 INFO CopyFiles$ Processing DocNum: 1697100, FileYear: 1978, FileMd: 206, Files: List(Z:\I\1978\02\06\1697100.001, Z:\I\1978\02\06\1697100.002)
2017-06-20 16:16:10,810 INFO CopyFiles$ Copying: Z:\I\1978\02\06\1697100.001 to: ./preindex/1978/1697100.001
2017-06-20 16:16:10,825 INFO CopyFiles$ Copying: Z:\I\1978\02\06\1697100.002 to: ./preindex/1978/1697100.002
2017-06-20 16:16:10,825 INFO CopyFiles$ Processing DocNum: 1676747, FileYear: 1978, FileMd: 105, Files: List(Z:\I\1978\01\05\1676747.001, Z:\I\1978\01\05\1676747.002, Z:\I\1978\01\05\1676747.003)
2017-06-20 16:16:10,841 INFO CopyFiles$ Copying: Z:\I\1978\01\05\1676747.001 to: ./preindex/1978/1676747.001
2017-06-20 16:16:10,841 INFO CopyFiles$ Copying: Z:\I\1978\01\05\1676747.002 to: ./preindex/1978/1676747.002
2017-06-20 16:16:10,857 INFO CopyFiles$ Copying: Z:\I\1978\01\05\1676747.003 to: ./preindex/1978/1676747.003
2017-06-20 16:16:10,872 INFO CopyFiles$ Processing DocNum: 1764262, FileYear: 1978, FileMd: 512, Files: List(Z:\I\1978\05\12\1764262.001, Z:\I\1978\05\12\1764262.002, Z:\I\1978\05\12\1764262.003)
2017-06-20 16:16:10,872 INFO CopyFiles$ Copying: Z:\I\1978\05\12\1764262.001 to: ./preindex/1978/1764262.001
2017-06-20 16:16:10,872 INFO CopyFiles$ Copying: Z:\I\1978\05\12\1764262.002 to: ./preindex/1978/1764262.002
2017-06-20 16:16:10,888 INFO CopyFiles$ Copying: Z:\I\1978\05\12\1764262.003 to: ./preindex/1978/1764262.003
2017-06-20 16:16:10,888 INFO CopyFiles$ Processing DocNum: 1809194, FileYear: 1978, FileMd: 717, Files: List(Z:\I\1978\07\17\1809194.001, Z:\I\1978\07\17\1809194.002, Z:\I\1978\07\17\1809194.003)
2017-06-20 16:16:10,903 INFO CopyFiles$ Copying: Z:\I\1978\07\17\1809194.001 to: ./preindex/1978/1809194.001
2017-06-20 16:16:10,903 INFO CopyFiles$ Copying: Z:\I\1978\07\17\1809194.002 to: ./preindex/1978/1809194.002
2017-06-20 16:16:10,903 INFO CopyFiles$ Copying: Z:\I\1978\07\17\1809194.003 to: ./preindex/1978/1809194.003
2017-06-20 16:16:10,919 INFO CopyFiles$ Processing DocNum: 1699645, FileYear: 1978, FileMd: 209, Files: List(Z:\I\1978\02\09\1699645.001, Z:\I\1978\02\09\1699645.002, Z:\I\1978\02\09\1699645.003)
2017-06-20 16:16:10,919 INFO CopyFiles$ Copying: Z:\I\1978\02\09\1699645.001 to: ./preindex/1978/1699645.001
2017-06-20 16:16:10,935 INFO CopyFiles$ Copying: Z:\I\1978\02\09\1699645.002 to: ./preindex/1978/1699645.002
2017-06-20 16:16:10,935 INFO CopyFiles$ Copying: Z:\I\1978\02\09\1699645.003 to: ./preindex/1978/1699645.003
2017-06-20 16:16:10,950 INFO CopyFiles$ Processing DocNum: 1794624, FileYear: 1978, FileMd: 627, Files: List(Z:\I\1978\06\27\1794624.001, Z:\I\1978\06\27\1794624.002, Z:\I\1978\06\27\1794624.003, Z:\I\1978\06\27\1794624.004)
2017-06-20 16:16:10,950 INFO CopyFiles$ Copying: Z:\I\1978\06\27\1794624.001 to: ./preindex/1978/1794624.001
2017-06-20 16:16:10,950 INFO CopyFiles$ Copying: Z:\I\1978\06\27\1794624.002 to: ./preindex/1978/1794624.002
2017-06-20 16:16:10,966 INFO CopyFiles$ Copying: Z:\I\1978\06\27\1794624.003 to: ./preindex/1978/1794624.003
2017-06-20 16:16:10,966 INFO CopyFiles$ Copying: Z:\I\1978\06\27\1794624.004 to: ./preindex/1978/1794624.004
2017-06-20 16:16:10,981 INFO CopyFiles$ Processing DocNum: 1803957, FileYear: 1978, FileMd: 710, Files: List(Z:\I\1978\07\10\1803957.001, Z:\I\1978\07\10\1803957.002, Z:\I\1978\07\10\1803957.003, Z:\I\1978\07\10\1803957.004)
2017-06-20 16:16:10,981 INFO CopyFiles$ Copying: Z:\I\1978\07\10\1803957.001 to: ./preindex/1978/1803957.001
2017-06-20 16:16:10,981 INFO CopyFiles$ Copying: Z:\I\1978\07\10\1803957.002 to: ./preindex/1978/1803957.002
2017-06-20 16:16:10,997 INFO CopyFiles$ Copying: Z:\I\1978\07\10\1803957.003 to: ./preindex/1978/1803957.003
2017-06-20 16:16:10,997 INFO CopyFiles$ Copying: Z:\I\1978\07\10\1803957.004 to: ./preindex/1978/1803957.004
2017-06-20 16:16:11,013 INFO CopyFiles$ Processing DocNum: 1920974, FileYear: 1978, FileMd: 1219, Files: List(Z:\I\1978\12\19\1920974.001, Z:\I\1978\12\19\1920974.002)
2017-06-20 16:16:11,013 INFO CopyFiles$ Copying: Z:\I\1978\12\19\1920974.001 to: ./preindex/1978/1920974.001
2017-06-20 16:16:11,013 INFO CopyFiles$ Copying: Z:\I\1978\12\19\1920974.002 to: ./preindex/1978/1920974.002
2017-06-20 16:16:11,028 INFO CopyFiles$ Processing DocNum: 1905674, FileYear: 1978, FileMd: 1127, Files: List(Z:\I\1978\11\27\1905674.001, Z:\I\1978\11\27\1905674.002, Z:\I\1978\11\27\1905674.003, Z:\I\1978\11\27\1905674.004)
2017-06-20 16:16:11,028 INFO CopyFiles$ Copying: Z:\I\1978\11\27\1905674.001 to: ./preindex/1978/1905674.001
2017-06-20 16:16:11,028 INFO CopyFiles$ Copying: Z:\I\1978\11\27\1905674.002 to: ./preindex/1978/1905674.002
2017-06-20 16:16:11,028 INFO CopyFiles$ Copying: Z:\I\1978\11\27\1905674.003 to: ./preindex/1978/1905674.003
2017-06-20 16:16:11,044 INFO CopyFiles$ Copying: Z:\I\1978\11\27\1905674.004 to: ./preindex/1978/1905674.004
2017-06-20 16:16:11,044 INFO CopyFiles$ Processing DocNum: 1690075, FileYear: 1978, FileMd: 125, Files: List(Z:\I\1978\01\25\1690075.001, Z:\I\1978\01\25\1690075.002, Z:\I\1978\01\25\1690075.003, Z:\I\1978\01\25\1690075.004)
2017-06-20 16:16:11,059 INFO CopyFiles$ Copying: Z:\I\1978\01\25\1690075.001 to: ./preindex/1978/1690075.001
2017-06-20 16:16:11,059 INFO CopyFiles$ Copying: Z:\I\1978\01\25\1690075.002 to: ./preindex/1978/1690075.002
2017-06-20 16:16:11,075 INFO CopyFiles$ Copying: Z:\I\1978\01\25\1690075.003 to: ./preindex/1978/1690075.003
2017-06-20 16:16:11,075 INFO CopyFiles$ Copying: Z:\I\1978\01\25\1690075.004 to: ./preindex/1978/1690075.004
2017-06-20 16:16:11,091 INFO CopyFiles$ Processing DocNum: 1755510, FileYear: 1978, FileMd: 502, Files: List(Z:\I\1978\05\02\1755510.001, Z:\I\1978\05\02\1755510.002, Z:\I\1978\05\02\1755510.003, Z:\I\1978\05\02\1755510.004, Z:\I\1978\05\02\1755510.005)
2017-06-20 16:16:11,091 INFO CopyFiles$ Copying: Z:\I\1978\05\02\1755510.001 to: ./preindex/1978/1755510.001
2017-06-20 16:16:11,091 INFO CopyFiles$ Copying: Z:\I\1978\05\02\1755510.002 to: ./preindex/1978/1755510.002
2017-06-20 16:16:11,106 INFO CopyFiles$ Copying: Z:\I\1978\05\02\1755510.003 to: ./preindex/1978/1755510.003
2017-06-20 16:16:11,122 INFO CopyFiles$ Copying: Z:\I\1978\05\02\1755510.004 to: ./preindex/1978/1755510.004
2017-06-20 16:16:11,122 INFO CopyFiles$ Copying: Z:\I\1978\05\02\1755510.005 to: ./preindex/1978/1755510.005
2017-06-20 16:16:11,137 INFO CopyFiles$ Processing DocNum: 1881051, FileYear: 1978, FileMd: 1020, Files: List(Z:\I\1978\10\20\1881051.001, Z:\I\1978\10\20\1881051.002, Z:\I\1978\10\20\1881051.003, Z:\I\1978\10\20\1881051.004, Z:\I\1978\10\20\1881051.005, Z:\I\1978\10\20\1881051.006, Z:\I\1978\10\20\1881051.007, Z:\I\1978\10\20\1881051.008, Z:\I\1978\10\20\1881051.009, Z:\I\1978\10\20\1881051.010, Z:\I\1978\10\20\1881051.011, Z:\I\1978\10\20\1881051.012, Z:\I\1978\10\20\1881051.013, Z:\I\1978\10\20\1881051.014)
2017-06-20 16:16:11,137 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881051.001 to: ./preindex/1978/1881051.001
2017-06-20 16:16:11,137 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881051.002 to: ./preindex/1978/1881051.002
2017-06-20 16:16:11,153 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881051.003 to: ./preindex/1978/1881051.003
2017-06-20 16:16:11,153 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881051.004 to: ./preindex/1978/1881051.004
2017-06-20 16:16:11,153 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881051.005 to: ./preindex/1978/1881051.005
2017-06-20 16:16:11,169 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881051.006 to: ./preindex/1978/1881051.006
2017-06-20 16:16:11,184 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881051.007 to: ./preindex/1978/1881051.007
2017-06-20 16:16:11,184 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881051.008 to: ./preindex/1978/1881051.008
2017-06-20 16:16:11,184 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881051.009 to: ./preindex/1978/1881051.009
2017-06-20 16:16:11,200 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881051.010 to: ./preindex/1978/1881051.010
2017-06-20 16:16:11,200 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881051.011 to: ./preindex/1978/1881051.011
2017-06-20 16:16:11,215 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881051.012 to: ./preindex/1978/1881051.012
2017-06-20 16:16:11,231 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881051.013 to: ./preindex/1978/1881051.013
2017-06-20 16:16:11,231 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881051.014 to: ./preindex/1978/1881051.014
2017-06-20 16:16:11,247 INFO CopyFiles$ Processing DocNum: 1919148, FileYear: 1978, FileMd: 1215, Files: List(Z:\I\1978\12\15\1919148.001, Z:\I\1978\12\15\1919148.002, Z:\I\1978\12\15\1919148.003)
2017-06-20 16:16:11,247 INFO CopyFiles$ Copying: Z:\I\1978\12\15\1919148.001 to: ./preindex/1978/1919148.001
2017-06-20 16:16:11,247 INFO CopyFiles$ Copying: Z:\I\1978\12\15\1919148.002 to: ./preindex/1978/1919148.002
2017-06-20 16:16:11,262 INFO CopyFiles$ Copying: Z:\I\1978\12\15\1919148.003 to: ./preindex/1978/1919148.003
2017-06-20 16:16:11,262 INFO CopyFiles$ Processing DocNum: 1686156, FileYear: 1978, FileMd: 119, Files: List(Z:\I\1978\01\19\1686156.001, Z:\I\1978\01\19\1686156.002, Z:\I\1978\01\19\1686156.003, Z:\I\1978\01\19\1686156.004)
2017-06-20 16:16:11,278 INFO CopyFiles$ Copying: Z:\I\1978\01\19\1686156.001 to: ./preindex/1978/1686156.001
2017-06-20 16:16:11,278 INFO CopyFiles$ Copying: Z:\I\1978\01\19\1686156.002 to: ./preindex/1978/1686156.002
2017-06-20 16:16:11,293 INFO CopyFiles$ Copying: Z:\I\1978\01\19\1686156.003 to: ./preindex/1978/1686156.003
2017-06-20 16:16:11,293 INFO CopyFiles$ Copying: Z:\I\1978\01\19\1686156.004 to: ./preindex/1978/1686156.004
2017-06-20 16:16:11,309 INFO CopyFiles$ Processing DocNum: 1911364, FileYear: 1978, FileMd: 1207, Files: List(Z:\I\1978\12\07\1911364.001, Z:\I\1978\12\07\1911364.002, Z:\I\1978\12\07\1911364.003, Z:\I\1978\12\07\1911364.004)
2017-06-20 16:16:11,309 INFO CopyFiles$ Copying: Z:\I\1978\12\07\1911364.001 to: ./preindex/1978/1911364.001
2017-06-20 16:16:11,309 INFO CopyFiles$ Copying: Z:\I\1978\12\07\1911364.002 to: ./preindex/1978/1911364.002
2017-06-20 16:16:11,325 INFO CopyFiles$ Copying: Z:\I\1978\12\07\1911364.003 to: ./preindex/1978/1911364.003
2017-06-20 16:16:11,325 INFO CopyFiles$ Copying: Z:\I\1978\12\07\1911364.004 to: ./preindex/1978/1911364.004
2017-06-20 16:16:11,340 INFO CopyFiles$ Processing DocNum: 1701101, FileYear: 1978, FileMd: 213, Files: List(Z:\I\1978\02\13\1701101.001, Z:\I\1978\02\13\1701101.002, Z:\I\1978\02\13\1701101.003, Z:\I\1978\02\13\1701101.004)
2017-06-20 16:16:11,340 INFO CopyFiles$ Copying: Z:\I\1978\02\13\1701101.001 to: ./preindex/1978/1701101.001
2017-06-20 16:16:11,356 INFO CopyFiles$ Copying: Z:\I\1978\02\13\1701101.002 to: ./preindex/1978/1701101.002
2017-06-20 16:16:11,356 INFO CopyFiles$ Copying: Z:\I\1978\02\13\1701101.003 to: ./preindex/1978/1701101.003
2017-06-20 16:16:11,356 INFO CopyFiles$ Copying: Z:\I\1978\02\13\1701101.004 to: ./preindex/1978/1701101.004
2017-06-20 16:16:11,371 INFO CopyFiles$ Processing DocNum: 1771732, FileYear: 1978, FileMd: 523, Files: List(Z:\I\1978\05\23\1771732.001, Z:\I\1978\05\23\1771732.002)
2017-06-20 16:16:11,371 INFO CopyFiles$ Copying: Z:\I\1978\05\23\1771732.001 to: ./preindex/1978/1771732.001
2017-06-20 16:16:11,387 INFO CopyFiles$ Copying: Z:\I\1978\05\23\1771732.002 to: ./preindex/1978/1771732.002
2017-06-20 16:16:11,387 INFO CopyFiles$ Processing DocNum: 1920134, FileYear: 1978, FileMd: 1218, Files: List(Z:\I\1978\12\18\1920134.001, Z:\I\1978\12\18\1920134.002)
2017-06-20 16:16:11,387 INFO CopyFiles$ Copying: Z:\I\1978\12\18\1920134.001 to: ./preindex/1978/1920134.001
2017-06-20 16:16:11,403 INFO CopyFiles$ Copying: Z:\I\1978\12\18\1920134.002 to: ./preindex/1978/1920134.002
2017-06-20 16:16:11,418 INFO CopyFiles$ Processing DocNum: 1789021, FileYear: 1978, FileMd: 616, Files: List(Z:\I\1978\06\16\1789021.001, Z:\I\1978\06\16\1789021.002, Z:\I\1978\06\16\1789021.003, Z:\I\1978\06\16\1789021.004)
2017-06-20 16:16:11,418 INFO CopyFiles$ Copying: Z:\I\1978\06\16\1789021.001 to: ./preindex/1978/1789021.001
2017-06-20 16:16:11,434 INFO CopyFiles$ Copying: Z:\I\1978\06\16\1789021.002 to: ./preindex/1978/1789021.002
2017-06-20 16:16:11,449 INFO CopyFiles$ Copying: Z:\I\1978\06\16\1789021.003 to: ./preindex/1978/1789021.003
2017-06-20 16:16:11,465 INFO CopyFiles$ Copying: Z:\I\1978\06\16\1789021.004 to: ./preindex/1978/1789021.004
2017-06-20 16:16:11,481 INFO CopyFiles$ Processing DocNum: 1743335, FileYear: 1978, FileMd: 414, Files: List(Z:\I\1978\04\14\1743335.001, Z:\I\1978\04\14\1743335.002, Z:\I\1978\04\14\1743335.003, Z:\I\1978\04\14\1743335.004)
2017-06-20 16:16:11,481 INFO CopyFiles$ Copying: Z:\I\1978\04\14\1743335.001 to: ./preindex/1978/1743335.001
2017-06-20 16:16:11,496 INFO CopyFiles$ Copying: Z:\I\1978\04\14\1743335.002 to: ./preindex/1978/1743335.002
2017-06-20 16:16:11,496 INFO CopyFiles$ Copying: Z:\I\1978\04\14\1743335.003 to: ./preindex/1978/1743335.003
2017-06-20 16:16:11,512 INFO CopyFiles$ Copying: Z:\I\1978\04\14\1743335.004 to: ./preindex/1978/1743335.004
2017-06-20 16:16:11,527 INFO CopyFiles$ Processing DocNum: 1683265, FileYear: 1978, FileMd: 113, Files: List(Z:\I\1978\01\13\1683265.001, Z:\I\1978\01\13\1683265.002, Z:\I\1978\01\13\1683265.003)
2017-06-20 16:16:11,543 INFO CopyFiles$ Copying: Z:\I\1978\01\13\1683265.001 to: ./preindex/1978/1683265.001
2017-06-20 16:16:11,543 INFO CopyFiles$ Copying: Z:\I\1978\01\13\1683265.002 to: ./preindex/1978/1683265.002
2017-06-20 16:16:11,559 INFO CopyFiles$ Copying: Z:\I\1978\01\13\1683265.003 to: ./preindex/1978/1683265.003
2017-06-20 16:16:11,574 INFO CopyFiles$ Processing DocNum: 1781596, FileYear: 1978, FileMd: 607, Files: List(Z:\I\1978\06\07\1781596.001, Z:\I\1978\06\07\1781596.002, Z:\I\1978\06\07\1781596.003, Z:\I\1978\06\07\1781596.004)
2017-06-20 16:16:11,590 INFO CopyFiles$ Copying: Z:\I\1978\06\07\1781596.001 to: ./preindex/1978/1781596.001
2017-06-20 16:16:11,590 INFO CopyFiles$ Copying: Z:\I\1978\06\07\1781596.002 to: ./preindex/1978/1781596.002
2017-06-20 16:16:11,590 INFO CopyFiles$ Copying: Z:\I\1978\06\07\1781596.003 to: ./preindex/1978/1781596.003
2017-06-20 16:16:11,605 INFO CopyFiles$ Copying: Z:\I\1978\06\07\1781596.004 to: ./preindex/1978/1781596.004
2017-06-20 16:16:11,605 INFO CopyFiles$ Processing DocNum: 1750376, FileYear: 1978, FileMd: 426, Files: List(Z:\I\1978\04\26\1750376.001, Z:\I\1978\04\26\1750376.002, Z:\I\1978\04\26\1750376.003, Z:\I\1978\04\26\1750376.004)
2017-06-20 16:16:11,605 INFO CopyFiles$ Copying: Z:\I\1978\04\26\1750376.001 to: ./preindex/1978/1750376.001
2017-06-20 16:16:11,621 INFO CopyFiles$ Copying: Z:\I\1978\04\26\1750376.002 to: ./preindex/1978/1750376.002
2017-06-20 16:16:11,621 INFO CopyFiles$ Copying: Z:\I\1978\04\26\1750376.003 to: ./preindex/1978/1750376.003
2017-06-20 16:16:11,621 INFO CopyFiles$ Copying: Z:\I\1978\04\26\1750376.004 to: ./preindex/1978/1750376.004
2017-06-20 16:16:11,637 INFO CopyFiles$ Processing DocNum: 1799533, FileYear: 1978, FileMd: 703, Files: List(Z:\I\1978\07\03\1799533.001, Z:\I\1978\07\03\1799533.002)
2017-06-20 16:16:11,637 INFO CopyFiles$ Copying: Z:\I\1978\07\03\1799533.001 to: ./preindex/1978/1799533.001
2017-06-20 16:16:11,652 INFO CopyFiles$ Copying: Z:\I\1978\07\03\1799533.002 to: ./preindex/1978/1799533.002
2017-06-20 16:16:11,652 INFO CopyFiles$ Processing DocNum: 1711675, FileYear: 1978, FileMd: 228, Files: List(Z:\I\1978\02\28\1711675.001, Z:\I\1978\02\28\1711675.002)
2017-06-20 16:16:11,668 INFO CopyFiles$ Copying: Z:\I\1978\02\28\1711675.001 to: ./preindex/1978/1711675.001
2017-06-20 16:16:11,668 INFO CopyFiles$ Copying: Z:\I\1978\02\28\1711675.002 to: ./preindex/1978/1711675.002
2017-06-20 16:16:11,683 INFO CopyFiles$ Processing DocNum: 1903456, FileYear: 1978, FileMd: 1121, Files: List(Z:\I\1978\11\21\1903456.001, Z:\I\1978\11\21\1903456.002, Z:\I\1978\11\21\1903456.003)
2017-06-20 16:16:11,683 INFO CopyFiles$ Copying: Z:\I\1978\11\21\1903456.001 to: ./preindex/1978/1903456.001
2017-06-20 16:16:11,683 INFO CopyFiles$ Copying: Z:\I\1978\11\21\1903456.002 to: ./preindex/1978/1903456.002
2017-06-20 16:16:11,699 INFO CopyFiles$ Copying: Z:\I\1978\11\21\1903456.003 to: ./preindex/1978/1903456.003
2017-06-20 16:16:11,715 INFO CopyFiles$ Processing DocNum: 1745695, FileYear: 1978, FileMd: 419, Files: List(Z:\I\1978\04\19\1745695.001, Z:\I\1978\04\19\1745695.002, Z:\I\1978\04\19\1745695.003, Z:\I\1978\04\19\1745695.004, Z:\I\1978\04\19\1745695.005)
2017-06-20 16:16:11,715 INFO CopyFiles$ Copying: Z:\I\1978\04\19\1745695.001 to: ./preindex/1978/1745695.001
2017-06-20 16:16:11,715 INFO CopyFiles$ Copying: Z:\I\1978\04\19\1745695.002 to: ./preindex/1978/1745695.002
2017-06-20 16:16:11,730 INFO CopyFiles$ Copying: Z:\I\1978\04\19\1745695.003 to: ./preindex/1978/1745695.003
2017-06-20 16:16:11,730 INFO CopyFiles$ Copying: Z:\I\1978\04\19\1745695.004 to: ./preindex/1978/1745695.004
2017-06-20 16:16:11,746 INFO CopyFiles$ Copying: Z:\I\1978\04\19\1745695.005 to: ./preindex/1978/1745695.005
2017-06-20 16:16:11,761 INFO CopyFiles$ Processing DocNum: 1699744, FileYear: 1978, FileMd: 209, Files: List(Z:\I\1978\02\09\1699744.001, Z:\I\1978\02\09\1699744.002, Z:\I\1978\02\09\1699744.003, Z:\I\1978\02\09\1699744.004)
2017-06-20 16:16:11,761 INFO CopyFiles$ Copying: Z:\I\1978\02\09\1699744.001 to: ./preindex/1978/1699744.001
2017-06-20 16:16:11,777 INFO CopyFiles$ Copying: Z:\I\1978\02\09\1699744.002 to: ./preindex/1978/1699744.002
2017-06-20 16:16:11,777 INFO CopyFiles$ Copying: Z:\I\1978\02\09\1699744.003 to: ./preindex/1978/1699744.003
2017-06-20 16:16:11,793 INFO CopyFiles$ Copying: Z:\I\1978\02\09\1699744.004 to: ./preindex/1978/1699744.004
2017-06-20 16:16:11,793 INFO CopyFiles$ Processing DocNum: 1817481, FileYear: 1978, FileMd: 727, Files: List(Z:\I\1978\07\27\1817481.001, Z:\I\1978\07\27\1817481.002, Z:\I\1978\07\27\1817481.003)
2017-06-20 16:16:11,793 INFO CopyFiles$ Copying: Z:\I\1978\07\27\1817481.001 to: ./preindex/1978/1817481.001
2017-06-20 16:16:11,808 INFO CopyFiles$ Copying: Z:\I\1978\07\27\1817481.002 to: ./preindex/1978/1817481.002
2017-06-20 16:16:11,808 INFO CopyFiles$ Copying: Z:\I\1978\07\27\1817481.003 to: ./preindex/1978/1817481.003
2017-06-20 16:16:11,824 INFO CopyFiles$ Processing DocNum: 1700764, FileYear: 1978, FileMd: 213, Files: List(Z:\I\1978\02\13\1700764.001, Z:\I\1978\02\13\1700764.002, Z:\I\1978\02\13\1700764.003)
2017-06-20 16:16:11,824 INFO CopyFiles$ Copying: Z:\I\1978\02\13\1700764.001 to: ./preindex/1978/1700764.001
2017-06-20 16:16:11,839 INFO CopyFiles$ Copying: Z:\I\1978\02\13\1700764.002 to: ./preindex/1978/1700764.002
2017-06-20 16:16:11,839 INFO CopyFiles$ Copying: Z:\I\1978\02\13\1700764.003 to: ./preindex/1978/1700764.003
2017-06-20 16:16:11,855 INFO CopyFiles$ Processing DocNum: 1721442, FileYear: 1978, FileMd: 314, Files: List(Z:\I\1978\03\14\1721442.001, Z:\I\1978\03\14\1721442.002)
2017-06-20 16:16:11,855 INFO CopyFiles$ Copying: Z:\I\1978\03\14\1721442.001 to: ./preindex/1978/1721442.001
2017-06-20 16:16:11,871 INFO CopyFiles$ Copying: Z:\I\1978\03\14\1721442.002 to: ./preindex/1978/1721442.002
2017-06-20 16:16:11,871 INFO CopyFiles$ Processing DocNum: 1750330, FileYear: 1978, FileMd: 426, Files: List(Z:\I\1978\04\26\1750330.001, Z:\I\1978\04\26\1750330.002, Z:\I\1978\04\26\1750330.003, Z:\I\1978\04\26\1750330.004, Z:\I\1978\04\26\1750330.005)
2017-06-20 16:16:11,871 INFO CopyFiles$ Copying: Z:\I\1978\04\26\1750330.001 to: ./preindex/1978/1750330.001
2017-06-20 16:16:11,886 INFO CopyFiles$ Copying: Z:\I\1978\04\26\1750330.002 to: ./preindex/1978/1750330.002
2017-06-20 16:16:11,902 INFO CopyFiles$ Copying: Z:\I\1978\04\26\1750330.003 to: ./preindex/1978/1750330.003
2017-06-20 16:16:11,902 INFO CopyFiles$ Copying: Z:\I\1978\04\26\1750330.004 to: ./preindex/1978/1750330.004
2017-06-20 16:16:11,902 INFO CopyFiles$ Copying: Z:\I\1978\04\26\1750330.005 to: ./preindex/1978/1750330.005
2017-06-20 16:16:11,917 INFO CopyFiles$ Processing DocNum: 1866932, FileYear: 1978, FileMd: 1002, Files: List(Z:\I\1978\10\02\1866932.001, Z:\I\1978\10\02\1866932.002, Z:\I\1978\10\02\1866932.003)
2017-06-20 16:16:11,917 INFO CopyFiles$ Copying: Z:\I\1978\10\02\1866932.001 to: ./preindex/1978/1866932.001
2017-06-20 16:16:11,917 INFO CopyFiles$ Copying: Z:\I\1978\10\02\1866932.002 to: ./preindex/1978/1866932.002
2017-06-20 16:16:11,933 INFO CopyFiles$ Copying: Z:\I\1978\10\02\1866932.003 to: ./preindex/1978/1866932.003
2017-06-20 16:16:11,949 INFO CopyFiles$ Processing DocNum: 1733127, FileYear: 1978, FileMd: 403, Files: List(Z:\I\1978\04\03\1733127.001, Z:\I\1978\04\03\1733127.002, Z:\I\1978\04\03\1733127.003)
2017-06-20 16:16:11,964 INFO CopyFiles$ Copying: Z:\I\1978\04\03\1733127.001 to: ./preindex/1978/1733127.001
2017-06-20 16:16:11,964 INFO CopyFiles$ Copying: Z:\I\1978\04\03\1733127.002 to: ./preindex/1978/1733127.002
2017-06-20 16:16:11,964 INFO CopyFiles$ Copying: Z:\I\1978\04\03\1733127.003 to: ./preindex/1978/1733127.003
2017-06-20 16:16:11,995 INFO CopyFiles$ Processing DocNum: 1845005, FileYear: 1978, FileMd: 831, Files: List(Z:\I\1978\08\31\1845005.001, Z:\I\1978\08\31\1845005.002, Z:\I\1978\08\31\1845005.003)
2017-06-20 16:16:11,995 INFO CopyFiles$ Copying: Z:\I\1978\08\31\1845005.001 to: ./preindex/1978/1845005.001
2017-06-20 16:16:11,995 INFO CopyFiles$ Copying: Z:\I\1978\08\31\1845005.002 to: ./preindex/1978/1845005.002
2017-06-20 16:16:12,011 INFO CopyFiles$ Copying: Z:\I\1978\08\31\1845005.003 to: ./preindex/1978/1845005.003
2017-06-20 16:16:12,011 INFO CopyFiles$ Processing DocNum: 1761550, FileYear: 1978, FileMd: 510, Files: List(Z:\I\1978\05\10\1761550.001, Z:\I\1978\05\10\1761550.002, Z:\I\1978\05\10\1761550.003, Z:\I\1978\05\10\1761550.004, Z:\I\1978\05\10\1761550.005, Z:\I\1978\05\10\1761550.006)
2017-06-20 16:16:12,027 INFO CopyFiles$ Copying: Z:\I\1978\05\10\1761550.001 to: ./preindex/1978/1761550.001
2017-06-20 16:16:12,027 INFO CopyFiles$ Copying: Z:\I\1978\05\10\1761550.002 to: ./preindex/1978/1761550.002
2017-06-20 16:16:12,042 INFO CopyFiles$ Copying: Z:\I\1978\05\10\1761550.003 to: ./preindex/1978/1761550.003
2017-06-20 16:16:12,042 INFO CopyFiles$ Copying: Z:\I\1978\05\10\1761550.004 to: ./preindex/1978/1761550.004
2017-06-20 16:16:12,058 INFO CopyFiles$ Copying: Z:\I\1978\05\10\1761550.005 to: ./preindex/1978/1761550.005
2017-06-20 16:16:12,073 INFO CopyFiles$ Copying: Z:\I\1978\05\10\1761550.006 to: ./preindex/1978/1761550.006
2017-06-20 16:16:12,089 INFO CopyFiles$ Processing DocNum: 1879953, FileYear: 1978, FileMd: 1018, Files: List(Z:\I\1978\10\18\1879953.001, Z:\I\1978\10\18\1879953.002, Z:\I\1978\10\18\1879953.003, Z:\I\1978\10\18\1879953.004, Z:\I\1978\10\18\1879953.005, Z:\I\1978\10\18\1879953.006, Z:\I\1978\10\18\1879953.007)
2017-06-20 16:16:12,089 INFO CopyFiles$ Copying: Z:\I\1978\10\18\1879953.001 to: ./preindex/1978/1879953.001
2017-06-20 16:16:12,089 INFO CopyFiles$ Copying: Z:\I\1978\10\18\1879953.002 to: ./preindex/1978/1879953.002
2017-06-20 16:16:12,105 INFO CopyFiles$ Copying: Z:\I\1978\10\18\1879953.003 to: ./preindex/1978/1879953.003
2017-06-20 16:16:12,105 INFO CopyFiles$ Copying: Z:\I\1978\10\18\1879953.004 to: ./preindex/1978/1879953.004
2017-06-20 16:16:12,120 INFO CopyFiles$ Copying: Z:\I\1978\10\18\1879953.005 to: ./preindex/1978/1879953.005
2017-06-20 16:16:12,120 INFO CopyFiles$ Copying: Z:\I\1978\10\18\1879953.006 to: ./preindex/1978/1879953.006
2017-06-20 16:16:12,120 INFO CopyFiles$ Copying: Z:\I\1978\10\18\1879953.007 to: ./preindex/1978/1879953.007
2017-06-20 16:16:12,136 INFO CopyFiles$ Processing DocNum: 1912264, FileYear: 1978, FileMd: 1206, Files: List(Z:\I\1978\12\06\1912264.001, Z:\I\1978\12\06\1912264.002, Z:\I\1978\12\06\1912264.003, Z:\I\1978\12\06\1912264.004)
2017-06-20 16:16:12,136 INFO CopyFiles$ Copying: Z:\I\1978\12\06\1912264.001 to: ./preindex/1978/1912264.001
2017-06-20 16:16:12,136 INFO CopyFiles$ Copying: Z:\I\1978\12\06\1912264.002 to: ./preindex/1978/1912264.002
2017-06-20 16:16:12,151 INFO CopyFiles$ Copying: Z:\I\1978\12\06\1912264.003 to: ./preindex/1978/1912264.003
2017-06-20 16:16:12,151 INFO CopyFiles$ Copying: Z:\I\1978\12\06\1912264.004 to: ./preindex/1978/1912264.004
2017-06-20 16:16:12,167 INFO CopyFiles$ Processing DocNum: 1817567, FileYear: 1978, FileMd: 727, Files: List(Z:\I\1978\07\27\1817567.001, Z:\I\1978\07\27\1817567.002, Z:\I\1978\07\27\1817567.003)
2017-06-20 16:16:12,167 INFO CopyFiles$ Copying: Z:\I\1978\07\27\1817567.001 to: ./preindex/1978/1817567.001
2017-06-20 16:16:12,183 INFO CopyFiles$ Copying: Z:\I\1978\07\27\1817567.002 to: ./preindex/1978/1817567.002
2017-06-20 16:16:12,183 INFO CopyFiles$ Copying: Z:\I\1978\07\27\1817567.003 to: ./preindex/1978/1817567.003
2017-06-20 16:16:12,198 INFO CopyFiles$ Processing DocNum: 1904207, FileYear: 1978, FileMd: 1122, Files: List(Z:\I\1978\11\22\1904207.001, Z:\I\1978\11\22\1904207.002, Z:\I\1978\11\22\1904207.003, Z:\I\1978\11\22\1904207.004)
2017-06-20 16:16:12,198 INFO CopyFiles$ Copying: Z:\I\1978\11\22\1904207.001 to: ./preindex/1978/1904207.001
2017-06-20 16:16:12,214 INFO CopyFiles$ Copying: Z:\I\1978\11\22\1904207.002 to: ./preindex/1978/1904207.002
2017-06-20 16:16:12,214 INFO CopyFiles$ Copying: Z:\I\1978\11\22\1904207.003 to: ./preindex/1978/1904207.003
2017-06-20 16:16:12,214 INFO CopyFiles$ Copying: Z:\I\1978\11\22\1904207.004 to: ./preindex/1978/1904207.004
2017-06-20 16:16:12,229 INFO CopyFiles$ Processing DocNum: 1921351, FileYear: 1978, FileMd: 1219, Files: List(Z:\I\1978\12\19\1921351.001, Z:\I\1978\12\19\1921351.002, Z:\I\1978\12\19\1921351.003, Z:\I\1978\12\19\1921351.004)
2017-06-20 16:16:12,229 INFO CopyFiles$ Copying: Z:\I\1978\12\19\1921351.001 to: ./preindex/1978/1921351.001
2017-06-20 16:16:12,229 INFO CopyFiles$ Copying: Z:\I\1978\12\19\1921351.002 to: ./preindex/1978/1921351.002
2017-06-20 16:16:12,245 INFO CopyFiles$ Copying: Z:\I\1978\12\19\1921351.003 to: ./preindex/1978/1921351.003
2017-06-20 16:16:12,245 INFO CopyFiles$ Copying: Z:\I\1978\12\19\1921351.004 to: ./preindex/1978/1921351.004
2017-06-20 16:16:12,261 INFO CopyFiles$ Processing DocNum: 1826607, FileYear: 1978, FileMd: 808, Files: List(Z:\I\1978\08\08\1826607.001, Z:\I\1978\08\08\1826607.002, Z:\I\1978\08\08\1826607.003, Z:\I\1978\08\08\1826607.004)
2017-06-20 16:16:12,261 INFO CopyFiles$ Copying: Z:\I\1978\08\08\1826607.001 to: ./preindex/1978/1826607.001
2017-06-20 16:16:12,261 INFO CopyFiles$ Copying: Z:\I\1978\08\08\1826607.002 to: ./preindex/1978/1826607.002
2017-06-20 16:16:12,276 INFO CopyFiles$ Copying: Z:\I\1978\08\08\1826607.003 to: ./preindex/1978/1826607.003
2017-06-20 16:16:12,276 INFO CopyFiles$ Copying: Z:\I\1978\08\08\1826607.004 to: ./preindex/1978/1826607.004
2017-06-20 16:16:12,292 INFO CopyFiles$ Processing DocNum: 1762798, FileYear: 1978, FileMd: 511, Files: List(Z:\I\1978\05\11\1762798.001, Z:\I\1978\05\11\1762798.002)
2017-06-20 16:16:12,307 INFO CopyFiles$ Copying: Z:\I\1978\05\11\1762798.001 to: ./preindex/1978/1762798.001
2017-06-20 16:16:12,307 INFO CopyFiles$ Copying: Z:\I\1978\05\11\1762798.002 to: ./preindex/1978/1762798.002
2017-06-20 16:16:12,307 INFO CopyFiles$ Processing DocNum: 1746909, FileYear: 1978, FileMd: 420, Files: List(Z:\I\1978\04\20\1746909.001, Z:\I\1978\04\20\1746909.002, Z:\I\1978\04\20\1746909.003)
2017-06-20 16:16:12,323 INFO CopyFiles$ Copying: Z:\I\1978\04\20\1746909.001 to: ./preindex/1978/1746909.001
2017-06-20 16:16:12,323 INFO CopyFiles$ Copying: Z:\I\1978\04\20\1746909.002 to: ./preindex/1978/1746909.002
2017-06-20 16:16:12,323 INFO CopyFiles$ Copying: Z:\I\1978\04\20\1746909.003 to: ./preindex/1978/1746909.003
2017-06-20 16:16:12,339 INFO CopyFiles$ Processing DocNum: 1914203, FileYear: 1978, FileMd: 1212, Files: List(Z:\I\1978\12\12\1914203.001, Z:\I\1978\12\12\1914203.002, Z:\I\1978\12\12\1914203.003, Z:\I\1978\12\12\1914203.004, Z:\I\1978\12\12\1914203.005)
2017-06-20 16:16:12,339 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914203.001 to: ./preindex/1978/1914203.001
2017-06-20 16:16:12,339 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914203.002 to: ./preindex/1978/1914203.002
2017-06-20 16:16:12,354 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914203.003 to: ./preindex/1978/1914203.003
2017-06-20 16:16:12,354 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914203.004 to: ./preindex/1978/1914203.004
2017-06-20 16:16:12,354 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914203.005 to: ./preindex/1978/1914203.005
2017-06-20 16:16:12,370 INFO CopyFiles$ Processing DocNum: 1870426, FileYear: 1978, FileMd: 1004, Files: List(Z:\I\1978\10\04\1870426.001, Z:\I\1978\10\04\1870426.002, Z:\I\1978\10\04\1870426.003, Z:\I\1978\10\04\1870426.004, Z:\I\1978\10\04\1870426.005, Z:\I\1978\10\04\1870426.006)
2017-06-20 16:16:12,385 INFO CopyFiles$ Copying: Z:\I\1978\10\04\1870426.001 to: ./preindex/1978/1870426.001
2017-06-20 16:16:12,385 INFO CopyFiles$ Copying: Z:\I\1978\10\04\1870426.002 to: ./preindex/1978/1870426.002
2017-06-20 16:16:12,401 INFO CopyFiles$ Copying: Z:\I\1978\10\04\1870426.003 to: ./preindex/1978/1870426.003
2017-06-20 16:16:12,401 INFO CopyFiles$ Copying: Z:\I\1978\10\04\1870426.004 to: ./preindex/1978/1870426.004
2017-06-20 16:16:12,417 INFO CopyFiles$ Copying: Z:\I\1978\10\04\1870426.005 to: ./preindex/1978/1870426.005
2017-06-20 16:16:12,417 INFO CopyFiles$ Copying: Z:\I\1978\10\04\1870426.006 to: ./preindex/1978/1870426.006
2017-06-20 16:16:12,417 INFO CopyFiles$ Processing DocNum: 1798456, FileYear: 1978, FileMd: 630, Files: List(Z:\I\1978\06\30\1798456.001, Z:\I\1978\06\30\1798456.002)
2017-06-20 16:16:12,417 INFO CopyFiles$ Copying: Z:\I\1978\06\30\1798456.001 to: ./preindex/1978/1798456.001
2017-06-20 16:16:12,432 INFO CopyFiles$ Copying: Z:\I\1978\06\30\1798456.002 to: ./preindex/1978/1798456.002
2017-06-20 16:16:12,448 INFO CopyFiles$ Processing DocNum: 1698698, FileYear: 1978, FileMd: 208, Files: List(Z:\I\1978\02\08\1698698.001, Z:\I\1978\02\08\1698698.002, Z:\I\1978\02\08\1698698.003, Z:\I\1978\02\08\1698698.004, Z:\I\1978\02\08\1698698.005)
2017-06-20 16:16:12,463 INFO CopyFiles$ Copying: Z:\I\1978\02\08\1698698.001 to: ./preindex/1978/1698698.001
2017-06-20 16:16:12,463 INFO CopyFiles$ Copying: Z:\I\1978\02\08\1698698.002 to: ./preindex/1978/1698698.002
2017-06-20 16:16:12,479 INFO CopyFiles$ Copying: Z:\I\1978\02\08\1698698.003 to: ./preindex/1978/1698698.003
2017-06-20 16:16:12,479 INFO CopyFiles$ Copying: Z:\I\1978\02\08\1698698.004 to: ./preindex/1978/1698698.004
2017-06-20 16:16:12,495 INFO CopyFiles$ Copying: Z:\I\1978\02\08\1698698.005 to: ./preindex/1978/1698698.005
2017-06-20 16:16:12,510 INFO CopyFiles$ Processing DocNum: 1816844, FileYear: 1978, FileMd: 726, Files: List(Z:\I\1978\07\26\1816844.001, Z:\I\1978\07\26\1816844.002, Z:\I\1978\07\26\1816844.003)
2017-06-20 16:16:12,526 INFO CopyFiles$ Copying: Z:\I\1978\07\26\1816844.001 to: ./preindex/1978/1816844.001
2017-06-20 16:16:12,526 INFO CopyFiles$ Copying: Z:\I\1978\07\26\1816844.002 to: ./preindex/1978/1816844.002
2017-06-20 16:16:12,541 INFO CopyFiles$ Copying: Z:\I\1978\07\26\1816844.003 to: ./preindex/1978/1816844.003
2017-06-20 16:16:12,557 INFO CopyFiles$ Processing DocNum: 1883764, FileYear: 1978, FileMd: 1024, Files: List(Z:\I\1978\10\24\1883764.001, Z:\I\1978\10\24\1883764.002, Z:\I\1978\10\24\1883764.003, Z:\I\1978\10\24\1883764.004, Z:\I\1978\10\24\1883764.005, Z:\I\1978\10\24\1883764.006)
2017-06-20 16:16:12,557 INFO CopyFiles$ Copying: Z:\I\1978\10\24\1883764.001 to: ./preindex/1978/1883764.001
2017-06-20 16:16:12,557 INFO CopyFiles$ Copying: Z:\I\1978\10\24\1883764.002 to: ./preindex/1978/1883764.002
2017-06-20 16:16:12,573 INFO CopyFiles$ Copying: Z:\I\1978\10\24\1883764.003 to: ./preindex/1978/1883764.003
2017-06-20 16:16:12,573 INFO CopyFiles$ Copying: Z:\I\1978\10\24\1883764.004 to: ./preindex/1978/1883764.004
2017-06-20 16:16:12,588 INFO CopyFiles$ Copying: Z:\I\1978\10\24\1883764.005 to: ./preindex/1978/1883764.005
2017-06-20 16:16:12,588 INFO CopyFiles$ Copying: Z:\I\1978\10\24\1883764.006 to: ./preindex/1978/1883764.006
2017-06-20 16:16:12,604 INFO CopyFiles$ Processing DocNum: 1688954, FileYear: 1978, FileMd: 124, Files: List(Z:\I\1978\01\24\1688954.001, Z:\I\1978\01\24\1688954.002)
2017-06-20 16:16:12,604 INFO CopyFiles$ Copying: Z:\I\1978\01\24\1688954.001 to: ./preindex/1978/1688954.001
2017-06-20 16:16:12,604 INFO CopyFiles$ Copying: Z:\I\1978\01\24\1688954.002 to: ./preindex/1978/1688954.002
2017-06-20 16:16:12,619 INFO CopyFiles$ Processing DocNum: 1866528, FileYear: 1978, FileMd: 929, Files: List(Z:\I\1978\09\29\1866528.001, Z:\I\1978\09\29\1866528.002, Z:\I\1978\09\29\1866528.003, Z:\I\1978\09\29\1866528.004, Z:\I\1978\09\29\1866528.005, Z:\I\1978\09\29\1866528.006)
2017-06-20 16:16:12,635 INFO CopyFiles$ Copying: Z:\I\1978\09\29\1866528.001 to: ./preindex/1978/1866528.001
2017-06-20 16:16:12,635 INFO CopyFiles$ Copying: Z:\I\1978\09\29\1866528.002 to: ./preindex/1978/1866528.002
2017-06-20 16:16:12,635 INFO CopyFiles$ Copying: Z:\I\1978\09\29\1866528.003 to: ./preindex/1978/1866528.003
2017-06-20 16:16:12,651 INFO CopyFiles$ Copying: Z:\I\1978\09\29\1866528.004 to: ./preindex/1978/1866528.004
2017-06-20 16:16:12,651 INFO CopyFiles$ Copying: Z:\I\1978\09\29\1866528.005 to: ./preindex/1978/1866528.005
2017-06-20 16:16:12,666 INFO CopyFiles$ Copying: Z:\I\1978\09\29\1866528.006 to: ./preindex/1978/1866528.006
2017-06-20 16:16:12,666 INFO CopyFiles$ Processing DocNum: 1763275, FileYear: 1978, FileMd: 511, Files: List(Z:\I\1978\05\11\1763275.001, Z:\I\1978\05\11\1763275.002, Z:\I\1978\05\11\1763275.003, Z:\I\1978\05\11\1763275.004)
2017-06-20 16:16:12,666 INFO CopyFiles$ Copying: Z:\I\1978\05\11\1763275.001 to: ./preindex/1978/1763275.001
2017-06-20 16:16:12,682 INFO CopyFiles$ Copying: Z:\I\1978\05\11\1763275.002 to: ./preindex/1978/1763275.002
2017-06-20 16:16:12,697 INFO CopyFiles$ Copying: Z:\I\1978\05\11\1763275.003 to: ./preindex/1978/1763275.003
2017-06-20 16:16:12,713 INFO CopyFiles$ Copying: Z:\I\1978\05\11\1763275.004 to: ./preindex/1978/1763275.004
2017-06-20 16:16:12,729 INFO CopyFiles$ Processing DocNum: 1890624, FileYear: 1978, FileMd: 1102, Files: List(Z:\I\1978\11\02\1890624.001, Z:\I\1978\11\02\1890624.002, Z:\I\1978\11\02\1890624.003, Z:\I\1978\11\02\1890624.004, Z:\I\1978\11\02\1890624.005)
2017-06-20 16:16:12,729 INFO CopyFiles$ Copying: Z:\I\1978\11\02\1890624.001 to: ./preindex/1978/1890624.001
2017-06-20 16:16:12,729 INFO CopyFiles$ Copying: Z:\I\1978\11\02\1890624.002 to: ./preindex/1978/1890624.002
2017-06-20 16:16:12,744 INFO CopyFiles$ Copying: Z:\I\1978\11\02\1890624.003 to: ./preindex/1978/1890624.003
2017-06-20 16:16:12,760 INFO CopyFiles$ Copying: Z:\I\1978\11\02\1890624.004 to: ./preindex/1978/1890624.004
2017-06-20 16:16:12,760 INFO CopyFiles$ Copying: Z:\I\1978\11\02\1890624.005 to: ./preindex/1978/1890624.005
2017-06-20 16:16:12,760 INFO CopyFiles$ Processing DocNum: 1755880, FileYear: 1978, FileMd: 504, Files: List(Z:\I\1978\05\04\1755880.001, Z:\I\1978\05\04\1755880.002, Z:\I\1978\05\04\1755880.003)
2017-06-20 16:16:12,775 INFO CopyFiles$ Copying: Z:\I\1978\05\04\1755880.001 to: ./preindex/1978/1755880.001
2017-06-20 16:16:12,775 INFO CopyFiles$ Copying: Z:\I\1978\05\04\1755880.002 to: ./preindex/1978/1755880.002
2017-06-20 16:16:12,775 INFO CopyFiles$ Copying: Z:\I\1978\05\04\1755880.003 to: ./preindex/1978/1755880.003
2017-06-20 16:16:12,791 INFO CopyFiles$ Processing DocNum: 1903678, FileYear: 1978, FileMd: 1121, Files: List(Z:\I\1978\11\21\1903678.001, Z:\I\1978\11\21\1903678.002, Z:\I\1978\11\21\1903678.003)
2017-06-20 16:16:12,791 INFO CopyFiles$ Copying: Z:\I\1978\11\21\1903678.001 to: ./preindex/1978/1903678.001
2017-06-20 16:16:12,791 INFO CopyFiles$ Copying: Z:\I\1978\11\21\1903678.002 to: ./preindex/1978/1903678.002
2017-06-20 16:16:12,807 INFO CopyFiles$ Copying: Z:\I\1978\11\21\1903678.003 to: ./preindex/1978/1903678.003
2017-06-20 16:16:12,807 INFO CopyFiles$ Processing DocNum: 1677421, FileYear: 1978, FileMd: 105, Files: List(Z:\I\1978\01\05\1677421.001, Z:\I\1978\01\05\1677421.002, Z:\I\1978\01\05\1677421.003, Z:\I\1978\01\05\1677421.004)
2017-06-20 16:16:12,807 INFO CopyFiles$ Copying: Z:\I\1978\01\05\1677421.001 to: ./preindex/1978/1677421.001
2017-06-20 16:16:12,822 INFO CopyFiles$ Copying: Z:\I\1978\01\05\1677421.002 to: ./preindex/1978/1677421.002
2017-06-20 16:16:12,822 INFO CopyFiles$ Copying: Z:\I\1978\01\05\1677421.003 to: ./preindex/1978/1677421.003
2017-06-20 16:16:12,838 INFO CopyFiles$ Copying: Z:\I\1978\01\05\1677421.004 to: ./preindex/1978/1677421.004
2017-06-20 16:16:12,838 INFO CopyFiles$ Processing DocNum: 1773312, FileYear: 1978, FileMd: 525, Files: List(Z:\I\1978\05\25\1773312.001, Z:\I\1978\05\25\1773312.002, Z:\I\1978\05\25\1773312.003, Z:\I\1978\05\25\1773312.004, Z:\I\1978\05\25\1773312.005, Z:\I\1978\05\25\1773312.006, Z:\I\1978\05\25\1773312.007, Z:\I\1978\05\25\1773312.008, Z:\I\1978\05\25\1773312.009)
2017-06-20 16:16:12,853 INFO CopyFiles$ Copying: Z:\I\1978\05\25\1773312.001 to: ./preindex/1978/1773312.001
2017-06-20 16:16:12,853 INFO CopyFiles$ Copying: Z:\I\1978\05\25\1773312.002 to: ./preindex/1978/1773312.002
2017-06-20 16:16:12,853 INFO CopyFiles$ Copying: Z:\I\1978\05\25\1773312.003 to: ./preindex/1978/1773312.003
2017-06-20 16:16:12,869 INFO CopyFiles$ Copying: Z:\I\1978\05\25\1773312.004 to: ./preindex/1978/1773312.004
2017-06-20 16:16:12,869 INFO CopyFiles$ Copying: Z:\I\1978\05\25\1773312.005 to: ./preindex/1978/1773312.005
2017-06-20 16:16:12,885 INFO CopyFiles$ Copying: Z:\I\1978\05\25\1773312.006 to: ./preindex/1978/1773312.006
2017-06-20 16:16:12,885 INFO CopyFiles$ Copying: Z:\I\1978\05\25\1773312.007 to: ./preindex/1978/1773312.007
2017-06-20 16:16:12,885 INFO CopyFiles$ Copying: Z:\I\1978\05\25\1773312.008 to: ./preindex/1978/1773312.008
2017-06-20 16:16:12,900 INFO CopyFiles$ Copying: Z:\I\1978\05\25\1773312.009 to: ./preindex/1978/1773312.009
2017-06-20 16:16:12,916 INFO CopyFiles$ Processing DocNum: 1712256, FileYear: 1978, FileMd: 301, Files: List(Z:\I\1978\03\01\1712256.001, Z:\I\1978\03\01\1712256.002, Z:\I\1978\03\01\1712256.003, Z:\I\1978\03\01\1712256.004, Z:\I\1978\03\01\1712256.005, Z:\I\1978\03\01\1712256.006, Z:\I\1978\03\01\1712256.007)
2017-06-20 16:16:12,916 INFO CopyFiles$ Copying: Z:\I\1978\03\01\1712256.001 to: ./preindex/1978/1712256.001
2017-06-20 16:16:12,931 INFO CopyFiles$ Copying: Z:\I\1978\03\01\1712256.002 to: ./preindex/1978/1712256.002
2017-06-20 16:16:12,931 INFO CopyFiles$ Copying: Z:\I\1978\03\01\1712256.003 to: ./preindex/1978/1712256.003
2017-06-20 16:16:12,931 INFO CopyFiles$ Copying: Z:\I\1978\03\01\1712256.004 to: ./preindex/1978/1712256.004
2017-06-20 16:16:12,947 INFO CopyFiles$ Copying: Z:\I\1978\03\01\1712256.005 to: ./preindex/1978/1712256.005
2017-06-20 16:16:12,947 INFO CopyFiles$ Copying: Z:\I\1978\03\01\1712256.006 to: ./preindex/1978/1712256.006
2017-06-20 16:16:12,963 INFO CopyFiles$ Copying: Z:\I\1978\03\01\1712256.007 to: ./preindex/1978/1712256.007
2017-06-20 16:16:12,963 INFO CopyFiles$ Processing DocNum: 1708289, FileYear: 1978, FileMd: 223, Files: List(Z:\I\1978\02\23\1708289.001, Z:\I\1978\02\23\1708289.002, Z:\I\1978\02\23\1708289.003, Z:\I\1978\02\23\1708289.004)
2017-06-20 16:16:12,978 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1708289.001 to: ./preindex/1978/1708289.001
2017-06-20 16:16:12,978 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1708289.002 to: ./preindex/1978/1708289.002
2017-06-20 16:16:12,978 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1708289.003 to: ./preindex/1978/1708289.003
2017-06-20 16:16:12,994 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1708289.004 to: ./preindex/1978/1708289.004
2017-06-20 16:16:12,994 INFO CopyFiles$ Processing DocNum: 1686496, FileYear: 1978, FileMd: 119, Files: List(Z:\I\1978\01\19\1686496.001, Z:\I\1978\01\19\1686496.002, Z:\I\1978\01\19\1686496.003)
2017-06-20 16:16:12,994 INFO CopyFiles$ Copying: Z:\I\1978\01\19\1686496.001 to: ./preindex/1978/1686496.001
2017-06-20 16:16:13,009 INFO CopyFiles$ Copying: Z:\I\1978\01\19\1686496.002 to: ./preindex/1978/1686496.002
2017-06-20 16:16:13,009 INFO CopyFiles$ Copying: Z:\I\1978\01\19\1686496.003 to: ./preindex/1978/1686496.003
2017-06-20 16:16:13,025 INFO CopyFiles$ Processing DocNum: 1887961, FileYear: 1978, FileMd: 1031, Files: List(Z:\I\1978\10\31\1887961.001, Z:\I\1978\10\31\1887961.002, Z:\I\1978\10\31\1887961.003, Z:\I\1978\10\31\1887961.004, Z:\I\1978\10\31\1887961.005)
2017-06-20 16:16:13,025 INFO CopyFiles$ Copying: Z:\I\1978\10\31\1887961.001 to: ./preindex/1978/1887961.001
2017-06-20 16:16:13,025 INFO CopyFiles$ Copying: Z:\I\1978\10\31\1887961.002 to: ./preindex/1978/1887961.002
2017-06-20 16:16:13,041 INFO CopyFiles$ Copying: Z:\I\1978\10\31\1887961.003 to: ./preindex/1978/1887961.003
2017-06-20 16:16:13,041 INFO CopyFiles$ Copying: Z:\I\1978\10\31\1887961.004 to: ./preindex/1978/1887961.004
2017-06-20 16:16:13,056 INFO CopyFiles$ Copying: Z:\I\1978\10\31\1887961.005 to: ./preindex/1978/1887961.005
2017-06-20 16:16:13,056 INFO CopyFiles$ Processing DocNum: 1854234, FileYear: 1978, FileMd: 913, Files: List(Z:\I\1978\09\13\1854234.001, Z:\I\1978\09\13\1854234.002, Z:\I\1978\09\13\1854234.003, Z:\I\1978\09\13\1854234.004)
2017-06-20 16:16:13,072 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1854234.001 to: ./preindex/1978/1854234.001
2017-06-20 16:16:13,087 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1854234.002 to: ./preindex/1978/1854234.002
2017-06-20 16:16:13,103 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1854234.003 to: ./preindex/1978/1854234.003
2017-06-20 16:16:13,103 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1854234.004 to: ./preindex/1978/1854234.004
2017-06-20 16:16:13,119 INFO CopyFiles$ Processing DocNum: 1760395, FileYear: 1978, FileMd: 509, Files: List(Z:\I\1978\05\09\1760395.001, Z:\I\1978\05\09\1760395.002, Z:\I\1978\05\09\1760395.003)
2017-06-20 16:16:13,134 INFO CopyFiles$ Copying: Z:\I\1978\05\09\1760395.001 to: ./preindex/1978/1760395.001
2017-06-20 16:16:13,150 INFO CopyFiles$ Copying: Z:\I\1978\05\09\1760395.002 to: ./preindex/1978/1760395.002
2017-06-20 16:16:13,150 INFO CopyFiles$ Copying: Z:\I\1978\05\09\1760395.003 to: ./preindex/1978/1760395.003
2017-06-20 16:16:13,181 INFO CopyFiles$ Processing DocNum: 1879311, FileYear: 1978, FileMd: 1017, Files: List(Z:\I\1978\10\17\1879311.001, Z:\I\1978\10\17\1879311.002, Z:\I\1978\10\17\1879311.003, Z:\I\1978\10\17\1879311.004, Z:\I\1978\10\17\1879311.005)
2017-06-20 16:16:13,181 INFO CopyFiles$ Copying: Z:\I\1978\10\17\1879311.001 to: ./preindex/1978/1879311.001
2017-06-20 16:16:13,181 INFO CopyFiles$ Copying: Z:\I\1978\10\17\1879311.002 to: ./preindex/1978/1879311.002
2017-06-20 16:16:13,197 INFO CopyFiles$ Copying: Z:\I\1978\10\17\1879311.003 to: ./preindex/1978/1879311.003
2017-06-20 16:16:13,212 INFO CopyFiles$ Copying: Z:\I\1978\10\17\1879311.004 to: ./preindex/1978/1879311.004
2017-06-20 16:16:13,212 INFO CopyFiles$ Copying: Z:\I\1978\10\17\1879311.005 to: ./preindex/1978/1879311.005
2017-06-20 16:16:13,212 INFO CopyFiles$ Processing DocNum: 1914239, FileYear: 1978, FileMd: 1212, Files: List(Z:\I\1978\12\12\1914239.001, Z:\I\1978\12\12\1914239.002, Z:\I\1978\12\12\1914239.003, Z:\I\1978\12\12\1914239.004, Z:\I\1978\12\12\1914239.005, Z:\I\1978\12\12\1914239.006, Z:\I\1978\12\12\1914239.007, Z:\I\1978\12\12\1914239.008, Z:\I\1978\12\12\1914239.009, Z:\I\1978\12\12\1914239.010, Z:\I\1978\12\12\1914239.011, Z:\I\1978\12\12\1914239.012, Z:\I\1978\12\12\1914239.013, Z:\I\1978\12\12\1914239.014, Z:\I\1978\12\12\1914239.015, Z:\I\1978\12\12\1914239.016, Z:\I\1978\12\12\1914239.017, Z:\I\1978\12\12\1914239.018, Z:\I\1978\12\12\1914239.019, Z:\I\1978\12\12\1914239.020, Z:\I\1978\12\12\1914239.021)
2017-06-20 16:16:13,228 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914239.001 to: ./preindex/1978/1914239.001
2017-06-20 16:16:13,228 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914239.002 to: ./preindex/1978/1914239.002
2017-06-20 16:16:13,243 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914239.003 to: ./preindex/1978/1914239.003
2017-06-20 16:16:13,259 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914239.004 to: ./preindex/1978/1914239.004
2017-06-20 16:16:13,259 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914239.005 to: ./preindex/1978/1914239.005
2017-06-20 16:16:13,275 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914239.006 to: ./preindex/1978/1914239.006
2017-06-20 16:16:13,290 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914239.007 to: ./preindex/1978/1914239.007
2017-06-20 16:16:13,290 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914239.008 to: ./preindex/1978/1914239.008
2017-06-20 16:16:13,306 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914239.009 to: ./preindex/1978/1914239.009
2017-06-20 16:16:13,321 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914239.010 to: ./preindex/1978/1914239.010
2017-06-20 16:16:13,321 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914239.011 to: ./preindex/1978/1914239.011
2017-06-20 16:16:13,321 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914239.012 to: ./preindex/1978/1914239.012
2017-06-20 16:16:13,337 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914239.013 to: ./preindex/1978/1914239.013
2017-06-20 16:16:13,353 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914239.014 to: ./preindex/1978/1914239.014
2017-06-20 16:16:13,368 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914239.015 to: ./preindex/1978/1914239.015
2017-06-20 16:16:13,368 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914239.016 to: ./preindex/1978/1914239.016
2017-06-20 16:16:13,384 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914239.017 to: ./preindex/1978/1914239.017
2017-06-20 16:16:13,399 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914239.018 to: ./preindex/1978/1914239.018
2017-06-20 16:16:13,399 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914239.019 to: ./preindex/1978/1914239.019
2017-06-20 16:16:13,399 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914239.020 to: ./preindex/1978/1914239.020
2017-06-20 16:16:13,415 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914239.021 to: ./preindex/1978/1914239.021
2017-06-20 16:16:13,415 INFO CopyFiles$ Processing DocNum: 1775016, FileYear: 1978, FileMd: 530, Files: List(Z:\I\1978\05\30\1775016.001, Z:\I\1978\05\30\1775016.002, Z:\I\1978\05\30\1775016.003)
2017-06-20 16:16:13,431 INFO CopyFiles$ Copying: Z:\I\1978\05\30\1775016.001 to: ./preindex/1978/1775016.001
2017-06-20 16:16:13,431 INFO CopyFiles$ Copying: Z:\I\1978\05\30\1775016.002 to: ./preindex/1978/1775016.002
2017-06-20 16:16:13,446 INFO CopyFiles$ Copying: Z:\I\1978\05\30\1775016.003 to: ./preindex/1978/1775016.003
2017-06-20 16:16:13,446 INFO CopyFiles$ Processing DocNum: 1903385, FileYear: 1978, FileMd: 1121, Files: List(Z:\I\1978\11\21\1903385.001, Z:\I\1978\11\21\1903385.002)
2017-06-20 16:16:13,446 INFO CopyFiles$ Copying: Z:\I\1978\11\21\1903385.001 to: ./preindex/1978/1903385.001
2017-06-20 16:16:13,446 INFO CopyFiles$ Copying: Z:\I\1978\11\21\1903385.002 to: ./preindex/1978/1903385.002
2017-06-20 16:16:13,462 INFO CopyFiles$ Processing DocNum: 1755252, FileYear: 1978, FileMd: 502, Files: List(Z:\I\1978\05\02\1755252.001, Z:\I\1978\05\02\1755252.002, Z:\I\1978\05\02\1755252.003, Z:\I\1978\05\02\1755252.004)
2017-06-20 16:16:13,462 INFO CopyFiles$ Copying: Z:\I\1978\05\02\1755252.001 to: ./preindex/1978/1755252.001
2017-06-20 16:16:13,477 INFO CopyFiles$ Copying: Z:\I\1978\05\02\1755252.002 to: ./preindex/1978/1755252.002
2017-06-20 16:16:13,493 INFO CopyFiles$ Copying: Z:\I\1978\05\02\1755252.003 to: ./preindex/1978/1755252.003
2017-06-20 16:16:13,493 INFO CopyFiles$ Copying: Z:\I\1978\05\02\1755252.004 to: ./preindex/1978/1755252.004
2017-06-20 16:16:13,509 INFO CopyFiles$ Processing DocNum: 1844094, FileYear: 1978, FileMd: 830, Files: List(Z:\I\1978\08\30\1844094.001, Z:\I\1978\08\30\1844094.002, Z:\I\1978\08\30\1844094.003, Z:\I\1978\08\30\1844094.004, Z:\I\1978\08\30\1844094.005, Z:\I\1978\08\30\1844094.006, Z:\I\1978\08\30\1844094.007, Z:\I\1978\08\30\1844094.008)
2017-06-20 16:16:13,509 INFO CopyFiles$ Copying: Z:\I\1978\08\30\1844094.001 to: ./preindex/1978/1844094.001
2017-06-20 16:16:13,524 INFO CopyFiles$ Copying: Z:\I\1978\08\30\1844094.002 to: ./preindex/1978/1844094.002
2017-06-20 16:16:13,524 INFO CopyFiles$ Copying: Z:\I\1978\08\30\1844094.003 to: ./preindex/1978/1844094.003
2017-06-20 16:16:13,540 INFO CopyFiles$ Copying: Z:\I\1978\08\30\1844094.004 to: ./preindex/1978/1844094.004
2017-06-20 16:16:13,540 INFO CopyFiles$ Copying: Z:\I\1978\08\30\1844094.005 to: ./preindex/1978/1844094.005
2017-06-20 16:16:13,555 INFO CopyFiles$ Copying: Z:\I\1978\08\30\1844094.006 to: ./preindex/1978/1844094.006
2017-06-20 16:16:13,587 INFO CopyFiles$ Copying: Z:\I\1978\08\30\1844094.007 to: ./preindex/1978/1844094.007
2017-06-20 16:16:13,602 INFO CopyFiles$ Copying: Z:\I\1978\08\30\1844094.008 to: ./preindex/1978/1844094.008
2017-06-20 16:16:13,618 INFO CopyFiles$ Processing DocNum: 1847677, FileYear: 1978, FileMd: 905, Files: List(Z:\I\1978\09\05\1847677.001, Z:\I\1978\09\05\1847677.002, Z:\I\1978\09\05\1847677.003, Z:\I\1978\09\05\1847677.004, Z:\I\1978\09\05\1847677.005)
2017-06-20 16:16:13,633 INFO CopyFiles$ Copying: Z:\I\1978\09\05\1847677.001 to: ./preindex/1978/1847677.001
2017-06-20 16:16:13,633 INFO CopyFiles$ Copying: Z:\I\1978\09\05\1847677.002 to: ./preindex/1978/1847677.002
2017-06-20 16:16:13,649 INFO CopyFiles$ Copying: Z:\I\1978\09\05\1847677.003 to: ./preindex/1978/1847677.003
2017-06-20 16:16:13,649 INFO CopyFiles$ Copying: Z:\I\1978\09\05\1847677.004 to: ./preindex/1978/1847677.004
2017-06-20 16:16:13,665 INFO CopyFiles$ Copying: Z:\I\1978\09\05\1847677.005 to: ./preindex/1978/1847677.005
2017-06-20 16:16:13,680 INFO CopyFiles$ Processing DocNum: 1735382, FileYear: 1978, FileMd: 404, Files: List(Z:\I\1978\04\04\1735382.001, Z:\I\1978\04\04\1735382.002)
2017-06-20 16:16:13,680 INFO CopyFiles$ Copying: Z:\I\1978\04\04\1735382.001 to: ./preindex/1978/1735382.001
2017-06-20 16:16:13,696 INFO CopyFiles$ Copying: Z:\I\1978\04\04\1735382.002 to: ./preindex/1978/1735382.002
2017-06-20 16:16:13,696 INFO CopyFiles$ Processing DocNum: 1897305, FileYear: 1978, FileMd: 1113, Files: List(Z:\I\1978\11\13\1897305.001, Z:\I\1978\11\13\1897305.002, Z:\I\1978\11\13\1897305.003, Z:\I\1978\11\13\1897305.004)
2017-06-20 16:16:13,696 INFO CopyFiles$ Copying: Z:\I\1978\11\13\1897305.001 to: ./preindex/1978/1897305.001
2017-06-20 16:16:13,711 INFO CopyFiles$ Copying: Z:\I\1978\11\13\1897305.002 to: ./preindex/1978/1897305.002
2017-06-20 16:16:13,711 INFO CopyFiles$ Copying: Z:\I\1978\11\13\1897305.003 to: ./preindex/1978/1897305.003
2017-06-20 16:16:13,727 INFO CopyFiles$ Copying: Z:\I\1978\11\13\1897305.004 to: ./preindex/1978/1897305.004
2017-06-20 16:16:13,743 INFO CopyFiles$ Processing DocNum: 1927413, FileYear: 1978, FileMd: 1229, Files: List(Z:\I\1978\12\29\1927413.001, Z:\I\1978\12\29\1927413.002, Z:\I\1978\12\29\1927413.003, Z:\I\1978\12\29\1927413.004, Z:\I\1978\12\29\1927413.005, Z:\I\1978\12\29\1927413.006, Z:\I\1978\12\29\1927413.007, Z:\I\1978\12\29\1927413.008, Z:\I\1978\12\29\1927413.009, Z:\I\1978\12\29\1927413.010, Z:\I\1978\12\29\1927413.011, Z:\I\1978\12\29\1927413.012)
2017-06-20 16:16:13,743 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927413.001 to: ./preindex/1978/1927413.001
2017-06-20 16:16:13,758 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927413.002 to: ./preindex/1978/1927413.002
2017-06-20 16:16:13,758 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927413.003 to: ./preindex/1978/1927413.003
2017-06-20 16:16:13,774 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927413.004 to: ./preindex/1978/1927413.004
2017-06-20 16:16:13,789 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927413.005 to: ./preindex/1978/1927413.005
2017-06-20 16:16:13,789 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927413.006 to: ./preindex/1978/1927413.006
2017-06-20 16:16:13,805 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927413.007 to: ./preindex/1978/1927413.007
2017-06-20 16:16:13,805 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927413.008 to: ./preindex/1978/1927413.008
2017-06-20 16:16:13,805 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927413.009 to: ./preindex/1978/1927413.009
2017-06-20 16:16:13,821 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927413.010 to: ./preindex/1978/1927413.010
2017-06-20 16:16:13,821 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927413.011 to: ./preindex/1978/1927413.011
2017-06-20 16:16:13,836 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927413.012 to: ./preindex/1978/1927413.012
2017-06-20 16:16:13,836 INFO CopyFiles$ Processing DocNum: 1865524, FileYear: 1978, FileMd: 928, Files: List(Z:\I\1978\09\28\1865524.001, Z:\I\1978\09\28\1865524.002, Z:\I\1978\09\28\1865524.003)
2017-06-20 16:16:13,836 INFO CopyFiles$ Copying: Z:\I\1978\09\28\1865524.001 to: ./preindex/1978/1865524.001
2017-06-20 16:16:13,852 INFO CopyFiles$ Copying: Z:\I\1978\09\28\1865524.002 to: ./preindex/1978/1865524.002
2017-06-20 16:16:13,867 INFO CopyFiles$ Copying: Z:\I\1978\09\28\1865524.003 to: ./preindex/1978/1865524.003
2017-06-20 16:16:13,867 INFO CopyFiles$ Processing DocNum: 1796105, FileYear: 1978, FileMd: 628, Files: List(Z:\I\1978\06\28\1796105.001, Z:\I\1978\06\28\1796105.002, Z:\I\1978\06\28\1796105.003, Z:\I\1978\06\28\1796105.004, Z:\I\1978\06\28\1796105.005, Z:\I\1978\06\28\1796105.006, Z:\I\1978\06\28\1796105.007)
2017-06-20 16:16:13,883 INFO CopyFiles$ Copying: Z:\I\1978\06\28\1796105.001 to: ./preindex/1978/1796105.001
2017-06-20 16:16:13,883 INFO CopyFiles$ Copying: Z:\I\1978\06\28\1796105.002 to: ./preindex/1978/1796105.002
2017-06-20 16:16:13,883 INFO CopyFiles$ Copying: Z:\I\1978\06\28\1796105.003 to: ./preindex/1978/1796105.003
2017-06-20 16:16:13,899 INFO CopyFiles$ Copying: Z:\I\1978\06\28\1796105.004 to: ./preindex/1978/1796105.004
2017-06-20 16:16:13,899 INFO CopyFiles$ Copying: Z:\I\1978\06\28\1796105.005 to: ./preindex/1978/1796105.005
2017-06-20 16:16:13,899 INFO CopyFiles$ Copying: Z:\I\1978\06\28\1796105.006 to: ./preindex/1978/1796105.006
2017-06-20 16:16:13,914 INFO CopyFiles$ Copying: Z:\I\1978\06\28\1796105.007 to: ./preindex/1978/1796105.007
2017-06-20 16:16:13,914 INFO CopyFiles$ Processing DocNum: 1806362, FileYear: 1978, FileMd: 712, Files: List(Z:\I\1978\07\12\1806362.001, Z:\I\1978\07\12\1806362.002, Z:\I\1978\07\12\1806362.003)
2017-06-20 16:16:13,914 INFO CopyFiles$ Copying: Z:\I\1978\07\12\1806362.001 to: ./preindex/1978/1806362.001
2017-06-20 16:16:13,930 INFO CopyFiles$ Copying: Z:\I\1978\07\12\1806362.002 to: ./preindex/1978/1806362.002
2017-06-20 16:16:13,930 INFO CopyFiles$ Copying: Z:\I\1978\07\12\1806362.003 to: ./preindex/1978/1806362.003
2017-06-20 16:16:13,945 INFO CopyFiles$ Processing DocNum: 1876466, FileYear: 1978, FileMd: 1013, Files: List(Z:\I\1978\10\13\1876466.001, Z:\I\1978\10\13\1876466.002, Z:\I\1978\10\13\1876466.003)
2017-06-20 16:16:13,945 INFO CopyFiles$ Copying: Z:\I\1978\10\13\1876466.001 to: ./preindex/1978/1876466.001
2017-06-20 16:16:13,945 INFO CopyFiles$ Copying: Z:\I\1978\10\13\1876466.002 to: ./preindex/1978/1876466.002
2017-06-20 16:16:13,961 INFO CopyFiles$ Copying: Z:\I\1978\10\13\1876466.003 to: ./preindex/1978/1876466.003
2017-06-20 16:16:13,977 INFO CopyFiles$ Processing DocNum: 1856296, FileYear: 1978, FileMd: 915, Files: List(Z:\I\1978\09\15\1856296.001, Z:\I\1978\09\15\1856296.002, Z:\I\1978\09\15\1856296.003, Z:\I\1978\09\15\1856296.004)
2017-06-20 16:16:13,977 INFO CopyFiles$ Copying: Z:\I\1978\09\15\1856296.001 to: ./preindex/1978/1856296.001
2017-06-20 16:16:13,977 INFO CopyFiles$ Copying: Z:\I\1978\09\15\1856296.002 to: ./preindex/1978/1856296.002
2017-06-20 16:16:13,977 INFO CopyFiles$ Copying: Z:\I\1978\09\15\1856296.003 to: ./preindex/1978/1856296.003
2017-06-20 16:16:13,992 INFO CopyFiles$ Copying: Z:\I\1978\09\15\1856296.004 to: ./preindex/1978/1856296.004
2017-06-20 16:16:14,008 INFO CopyFiles$ Processing DocNum: 1789636, FileYear: 1978, FileMd: 619, Files: List(Z:\I\1978\06\19\1789636.001, Z:\I\1978\06\19\1789636.002, Z:\I\1978\06\19\1789636.003, Z:\I\1978\06\19\1789636.004, Z:\I\1978\06\19\1789636.005, Z:\I\1978\06\19\1789636.006, Z:\I\1978\06\19\1789636.007)
2017-06-20 16:16:14,008 INFO CopyFiles$ Copying: Z:\I\1978\06\19\1789636.001 to: ./preindex/1978/1789636.001
2017-06-20 16:16:14,008 INFO CopyFiles$ Copying: Z:\I\1978\06\19\1789636.002 to: ./preindex/1978/1789636.002
2017-06-20 16:16:14,023 INFO CopyFiles$ Copying: Z:\I\1978\06\19\1789636.003 to: ./preindex/1978/1789636.003
2017-06-20 16:16:14,023 INFO CopyFiles$ Copying: Z:\I\1978\06\19\1789636.004 to: ./preindex/1978/1789636.004
2017-06-20 16:16:14,023 INFO CopyFiles$ Copying: Z:\I\1978\06\19\1789636.005 to: ./preindex/1978/1789636.005
2017-06-20 16:16:14,055 INFO CopyFiles$ Copying: Z:\I\1978\06\19\1789636.006 to: ./preindex/1978/1789636.006
2017-06-20 16:16:14,055 INFO CopyFiles$ Copying: Z:\I\1978\06\19\1789636.007 to: ./preindex/1978/1789636.007
2017-06-20 16:16:14,055 INFO CopyFiles$ Processing DocNum: 1793160, FileYear: 1978, FileMd: 623, Files: List(Z:\I\1978\06\23\1793160.001, Z:\I\1978\06\23\1793160.002, Z:\I\1978\06\23\1793160.003)
2017-06-20 16:16:14,055 INFO CopyFiles$ Copying: Z:\I\1978\06\23\1793160.001 to: ./preindex/1978/1793160.001
2017-06-20 16:16:14,070 INFO CopyFiles$ Copying: Z:\I\1978\06\23\1793160.002 to: ./preindex/1978/1793160.002
2017-06-20 16:16:14,070 INFO CopyFiles$ Copying: Z:\I\1978\06\23\1793160.003 to: ./preindex/1978/1793160.003
2017-06-20 16:16:14,086 INFO CopyFiles$ Processing DocNum: 1740414, FileYear: 1978, FileMd: 411, Files: List(Z:\I\1978\04\11\1740414.001, Z:\I\1978\04\11\1740414.002, Z:\I\1978\04\11\1740414.003)
2017-06-20 16:16:14,086 INFO CopyFiles$ Copying: Z:\I\1978\04\11\1740414.001 to: ./preindex/1978/1740414.001
2017-06-20 16:16:14,101 INFO CopyFiles$ Copying: Z:\I\1978\04\11\1740414.002 to: ./preindex/1978/1740414.002
2017-06-20 16:16:14,101 INFO CopyFiles$ Copying: Z:\I\1978\04\11\1740414.003 to: ./preindex/1978/1740414.003
2017-06-20 16:16:14,117 INFO CopyFiles$ Processing DocNum: 1884984, FileYear: 1978, FileMd: 1026, Files: List(Z:\I\1978\10\26\1884984.001, Z:\I\1978\10\26\1884984.002)
2017-06-20 16:16:14,117 INFO CopyFiles$ Copying: Z:\I\1978\10\26\1884984.001 to: ./preindex/1978/1884984.001
2017-06-20 16:16:14,133 INFO CopyFiles$ Copying: Z:\I\1978\10\26\1884984.002 to: ./preindex/1978/1884984.002
2017-06-20 16:16:14,148 INFO CopyFiles$ Processing DocNum: 1805134, FileYear: 1978, FileMd: 711, Files: List(Z:\I\1978\07\11\1805134.001, Z:\I\1978\07\11\1805134.002, Z:\I\1978\07\11\1805134.003, Z:\I\1978\07\11\1805134.004)
2017-06-20 16:16:14,148 INFO CopyFiles$ Copying: Z:\I\1978\07\11\1805134.001 to: ./preindex/1978/1805134.001
2017-06-20 16:16:14,148 INFO CopyFiles$ Copying: Z:\I\1978\07\11\1805134.002 to: ./preindex/1978/1805134.002
2017-06-20 16:16:14,164 INFO CopyFiles$ Copying: Z:\I\1978\07\11\1805134.003 to: ./preindex/1978/1805134.003
2017-06-20 16:16:14,164 INFO CopyFiles$ Copying: Z:\I\1978\07\11\1805134.004 to: ./preindex/1978/1805134.004
2017-06-20 16:16:14,179 INFO CopyFiles$ Processing DocNum: 1814439, FileYear: 1978, FileMd: 724, Files: List(Z:\I\1978\07\24\1814439.001, Z:\I\1978\07\24\1814439.002)
2017-06-20 16:16:14,179 INFO CopyFiles$ Copying: Z:\I\1978\07\24\1814439.001 to: ./preindex/1978/1814439.001
2017-06-20 16:16:14,179 INFO CopyFiles$ Copying: Z:\I\1978\07\24\1814439.002 to: ./preindex/1978/1814439.002
2017-06-20 16:16:14,195 INFO CopyFiles$ Processing DocNum: 1808698, FileYear: 1978, FileMd: 714, Files: List(Z:\I\1978\07\14\1808698.001, Z:\I\1978\07\14\1808698.002)
2017-06-20 16:16:14,195 INFO CopyFiles$ Copying: Z:\I\1978\07\14\1808698.001 to: ./preindex/1978/1808698.001
2017-06-20 16:16:14,195 INFO CopyFiles$ Copying: Z:\I\1978\07\14\1808698.002 to: ./preindex/1978/1808698.002
2017-06-20 16:16:14,211 INFO CopyFiles$ Processing DocNum: 1676839, FileYear: 1978, FileMd: 105, Files: List(Z:\I\1978\01\05\1676839.001, Z:\I\1978\01\05\1676839.002, Z:\I\1978\01\05\1676839.003, Z:\I\1978\01\05\1676839.004, Z:\I\1978\01\05\1676839.005)
2017-06-20 16:16:14,211 INFO CopyFiles$ Copying: Z:\I\1978\01\05\1676839.001 to: ./preindex/1978/1676839.001
2017-06-20 16:16:14,226 INFO CopyFiles$ Copying: Z:\I\1978\01\05\1676839.002 to: ./preindex/1978/1676839.002
2017-06-20 16:16:14,226 INFO CopyFiles$ Copying: Z:\I\1978\01\05\1676839.003 to: ./preindex/1978/1676839.003
2017-06-20 16:16:14,242 INFO CopyFiles$ Copying: Z:\I\1978\01\05\1676839.004 to: ./preindex/1978/1676839.004
2017-06-20 16:16:14,242 INFO CopyFiles$ Copying: Z:\I\1978\01\05\1676839.005 to: ./preindex/1978/1676839.005
2017-06-20 16:16:14,257 INFO CopyFiles$ Processing DocNum: 1740127, FileYear: 1978, FileMd: 411, Files: List(Z:\I\1978\04\11\1740127.001, Z:\I\1978\04\11\1740127.002)
2017-06-20 16:16:14,257 INFO CopyFiles$ Copying: Z:\I\1978\04\11\1740127.001 to: ./preindex/1978/1740127.001
2017-06-20 16:16:14,257 INFO CopyFiles$ Copying: Z:\I\1978\04\11\1740127.002 to: ./preindex/1978/1740127.002
2017-06-20 16:16:14,273 INFO CopyFiles$ Processing DocNum: 1781914, FileYear: 1978, FileMd: 608, Files: List(Z:\I\1978\06\08\1781914.001, Z:\I\1978\06\08\1781914.002, Z:\I\1978\06\08\1781914.003)
2017-06-20 16:16:14,273 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1781914.001 to: ./preindex/1978/1781914.001
2017-06-20 16:16:14,273 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1781914.002 to: ./preindex/1978/1781914.002
2017-06-20 16:16:14,289 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1781914.003 to: ./preindex/1978/1781914.003
2017-06-20 16:16:14,289 INFO CopyFiles$ Processing DocNum: 1860881, FileYear: 1978, FileMd: 921, Files: List(Z:\I\1978\09\21\1860881.001, Z:\I\1978\09\21\1860881.002, Z:\I\1978\09\21\1860881.003, Z:\I\1978\09\21\1860881.004, Z:\I\1978\09\21\1860881.005, Z:\I\1978\09\21\1860881.006, Z:\I\1978\09\21\1860881.007, Z:\I\1978\09\21\1860881.008)
2017-06-20 16:16:14,304 INFO CopyFiles$ Copying: Z:\I\1978\09\21\1860881.001 to: ./preindex/1978/1860881.001
2017-06-20 16:16:14,304 INFO CopyFiles$ Copying: Z:\I\1978\09\21\1860881.002 to: ./preindex/1978/1860881.002
2017-06-20 16:16:14,304 INFO CopyFiles$ Copying: Z:\I\1978\09\21\1860881.003 to: ./preindex/1978/1860881.003
2017-06-20 16:16:14,320 INFO CopyFiles$ Copying: Z:\I\1978\09\21\1860881.004 to: ./preindex/1978/1860881.004
2017-06-20 16:16:14,320 INFO CopyFiles$ Copying: Z:\I\1978\09\21\1860881.005 to: ./preindex/1978/1860881.005
2017-06-20 16:16:14,335 INFO CopyFiles$ Copying: Z:\I\1978\09\21\1860881.006 to: ./preindex/1978/1860881.006
2017-06-20 16:16:14,335 INFO CopyFiles$ Copying: Z:\I\1978\09\21\1860881.007 to: ./preindex/1978/1860881.007
2017-06-20 16:16:14,335 INFO CopyFiles$ Copying: Z:\I\1978\09\21\1860881.008 to: ./preindex/1978/1860881.008
2017-06-20 16:16:14,351 INFO CopyFiles$ Processing DocNum: 1907669, FileYear: 1978, FileMd: 1129, Files: List(Z:\I\1978\11\29\1907669.001, Z:\I\1978\11\29\1907669.002)
2017-06-20 16:16:14,351 INFO CopyFiles$ Copying: Z:\I\1978\11\29\1907669.001 to: ./preindex/1978/1907669.001
2017-06-20 16:16:14,367 INFO CopyFiles$ Copying: Z:\I\1978\11\29\1907669.002 to: ./preindex/1978/1907669.002
2017-06-20 16:16:14,367 INFO CopyFiles$ Processing DocNum: 1700495, FileYear: 1978, FileMd: 210, Files: List(Z:\I\1978\02\10\1700495.001, Z:\I\1978\02\10\1700495.002, Z:\I\1978\02\10\1700495.003, Z:\I\1978\02\10\1700495.004, Z:\I\1978\02\10\1700495.005, Z:\I\1978\02\10\1700495.006)
2017-06-20 16:16:14,382 INFO CopyFiles$ Copying: Z:\I\1978\02\10\1700495.001 to: ./preindex/1978/1700495.001
2017-06-20 16:16:14,382 INFO CopyFiles$ Copying: Z:\I\1978\02\10\1700495.002 to: ./preindex/1978/1700495.002
2017-06-20 16:16:14,398 INFO CopyFiles$ Copying: Z:\I\1978\02\10\1700495.003 to: ./preindex/1978/1700495.003
2017-06-20 16:16:14,398 INFO CopyFiles$ Copying: Z:\I\1978\02\10\1700495.004 to: ./preindex/1978/1700495.004
2017-06-20 16:16:14,398 INFO CopyFiles$ Copying: Z:\I\1978\02\10\1700495.005 to: ./preindex/1978/1700495.005
2017-06-20 16:16:14,413 INFO CopyFiles$ Copying: Z:\I\1978\02\10\1700495.006 to: ./preindex/1978/1700495.006
2017-06-20 16:16:14,429 INFO CopyFiles$ Processing DocNum: 1738086, FileYear: 1978, FileMd: 407, Files: List(Z:\I\1978\04\07\1738086.001, Z:\I\1978\04\07\1738086.002)
2017-06-20 16:16:14,429 INFO CopyFiles$ Copying: Z:\I\1978\04\07\1738086.001 to: ./preindex/1978/1738086.001
2017-06-20 16:16:14,429 INFO CopyFiles$ Copying: Z:\I\1978\04\07\1738086.002 to: ./preindex/1978/1738086.002
2017-06-20 16:16:14,445 INFO CopyFiles$ Processing DocNum: 1810209, FileYear: 1978, FileMd: 718, Files: List(Z:\I\1978\07\18\1810209.001, Z:\I\1978\07\18\1810209.002, Z:\I\1978\07\18\1810209.003, Z:\I\1978\07\18\1810209.004, Z:\I\1978\07\18\1810209.005)
2017-06-20 16:16:14,445 INFO CopyFiles$ Copying: Z:\I\1978\07\18\1810209.001 to: ./preindex/1978/1810209.001
2017-06-20 16:16:14,460 INFO CopyFiles$ Copying: Z:\I\1978\07\18\1810209.002 to: ./preindex/1978/1810209.002
2017-06-20 16:16:14,460 INFO CopyFiles$ Copying: Z:\I\1978\07\18\1810209.003 to: ./preindex/1978/1810209.003
2017-06-20 16:16:14,476 INFO CopyFiles$ Copying: Z:\I\1978\07\18\1810209.004 to: ./preindex/1978/1810209.004
2017-06-20 16:16:14,476 INFO CopyFiles$ Copying: Z:\I\1978\07\18\1810209.005 to: ./preindex/1978/1810209.005
2017-06-20 16:16:14,476 INFO CopyFiles$ Processing DocNum: 1776310, FileYear: 1978, FileMd: 531, Files: List(Z:\I\1978\05\31\1776310.001, Z:\I\1978\05\31\1776310.002, Z:\I\1978\05\31\1776310.003)
2017-06-20 16:16:14,476 INFO CopyFiles$ Copying: Z:\I\1978\05\31\1776310.001 to: ./preindex/1978/1776310.001
2017-06-20 16:16:14,491 INFO CopyFiles$ Copying: Z:\I\1978\05\31\1776310.002 to: ./preindex/1978/1776310.002
2017-06-20 16:16:14,491 INFO CopyFiles$ Copying: Z:\I\1978\05\31\1776310.003 to: ./preindex/1978/1776310.003
2017-06-20 16:16:14,507 INFO CopyFiles$ Processing DocNum: 1863790, FileYear: 1978, FileMd: 926, Files: List(Z:\I\1978\09\26\1863790.001, Z:\I\1978\09\26\1863790.002, Z:\I\1978\09\26\1863790.003)
2017-06-20 16:16:14,507 INFO CopyFiles$ Copying: Z:\I\1978\09\26\1863790.001 to: ./preindex/1978/1863790.001
2017-06-20 16:16:14,507 INFO CopyFiles$ Copying: Z:\I\1978\09\26\1863790.002 to: ./preindex/1978/1863790.002
2017-06-20 16:16:14,523 INFO CopyFiles$ Copying: Z:\I\1978\09\26\1863790.003 to: ./preindex/1978/1863790.003
2017-06-20 16:16:14,523 INFO CopyFiles$ Processing DocNum: 1761576, FileYear: 1978, FileMd: 510, Files: List(Z:\I\1978\05\10\1761576.001, Z:\I\1978\05\10\1761576.002, Z:\I\1978\05\10\1761576.003)
2017-06-20 16:16:14,523 INFO CopyFiles$ Copying: Z:\I\1978\05\10\1761576.001 to: ./preindex/1978/1761576.001
2017-06-20 16:16:14,538 INFO CopyFiles$ Copying: Z:\I\1978\05\10\1761576.002 to: ./preindex/1978/1761576.002
2017-06-20 16:16:14,538 INFO CopyFiles$ Copying: Z:\I\1978\05\10\1761576.003 to: ./preindex/1978/1761576.003
2017-06-20 16:16:14,554 INFO CopyFiles$ Processing DocNum: 1825039, FileYear: 1978, FileMd: 804, Files: List(Z:\I\1978\08\04\1825039.001, Z:\I\1978\08\04\1825039.002, Z:\I\1978\08\04\1825039.003, Z:\I\1978\08\04\1825039.004, Z:\I\1978\08\04\1825039.005, Z:\I\1978\08\04\1825039.006)
2017-06-20 16:16:14,569 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825039.001 to: ./preindex/1978/1825039.001
2017-06-20 16:16:14,569 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825039.002 to: ./preindex/1978/1825039.002
2017-06-20 16:16:14,569 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825039.003 to: ./preindex/1978/1825039.003
2017-06-20 16:16:14,585 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825039.004 to: ./preindex/1978/1825039.004
2017-06-20 16:16:14,585 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825039.005 to: ./preindex/1978/1825039.005
2017-06-20 16:16:14,601 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825039.006 to: ./preindex/1978/1825039.006
2017-06-20 16:16:14,616 INFO CopyFiles$ Processing DocNum: 1783983, FileYear: 1978, FileMd: 612, Files: List(Z:\I\1978\06\12\1783983.001, Z:\I\1978\06\12\1783983.002)
2017-06-20 16:16:14,616 INFO CopyFiles$ Copying: Z:\I\1978\06\12\1783983.001 to: ./preindex/1978/1783983.001
2017-06-20 16:16:14,616 INFO CopyFiles$ Copying: Z:\I\1978\06\12\1783983.002 to: ./preindex/1978/1783983.002
2017-06-20 16:16:14,632 INFO CopyFiles$ Processing DocNum: 1820227, FileYear: 1978, FileMd: 801, Files: List(Z:\I\1978\08\01\1820227.001, Z:\I\1978\08\01\1820227.002, Z:\I\1978\08\01\1820227.003, Z:\I\1978\08\01\1820227.004, Z:\I\1978\08\01\1820227.005)
2017-06-20 16:16:14,632 INFO CopyFiles$ Copying: Z:\I\1978\08\01\1820227.001 to: ./preindex/1978/1820227.001
2017-06-20 16:16:14,632 INFO CopyFiles$ Copying: Z:\I\1978\08\01\1820227.002 to: ./preindex/1978/1820227.002
2017-06-20 16:16:14,632 INFO CopyFiles$ Copying: Z:\I\1978\08\01\1820227.003 to: ./preindex/1978/1820227.003
2017-06-20 16:16:14,647 INFO CopyFiles$ Copying: Z:\I\1978\08\01\1820227.004 to: ./preindex/1978/1820227.004
2017-06-20 16:16:14,647 INFO CopyFiles$ Copying: Z:\I\1978\08\01\1820227.005 to: ./preindex/1978/1820227.005
2017-06-20 16:16:14,663 INFO CopyFiles$ Processing DocNum: 1886477, FileYear: 1978, FileMd: 1027, Files: List(Z:\I\1978\10\27\1886477.001, Z:\I\1978\10\27\1886477.002, Z:\I\1978\10\27\1886477.003, Z:\I\1978\10\27\1886477.004)
2017-06-20 16:16:14,679 INFO CopyFiles$ Copying: Z:\I\1978\10\27\1886477.001 to: ./preindex/1978/1886477.001
2017-06-20 16:16:14,679 INFO CopyFiles$ Copying: Z:\I\1978\10\27\1886477.002 to: ./preindex/1978/1886477.002
2017-06-20 16:16:14,694 INFO CopyFiles$ Copying: Z:\I\1978\10\27\1886477.003 to: ./preindex/1978/1886477.003
2017-06-20 16:16:14,694 INFO CopyFiles$ Copying: Z:\I\1978\10\27\1886477.004 to: ./preindex/1978/1886477.004
2017-06-20 16:16:14,710 INFO CopyFiles$ Processing DocNum: 1774921, FileYear: 1978, FileMd: 530, Files: List(Z:\I\1978\05\30\1774921.001, Z:\I\1978\05\30\1774921.002, Z:\I\1978\05\30\1774921.003)
2017-06-20 16:16:14,710 INFO CopyFiles$ Copying: Z:\I\1978\05\30\1774921.001 to: ./preindex/1978/1774921.001
2017-06-20 16:16:14,710 INFO CopyFiles$ Copying: Z:\I\1978\05\30\1774921.002 to: ./preindex/1978/1774921.002
2017-06-20 16:16:14,710 INFO CopyFiles$ Copying: Z:\I\1978\05\30\1774921.003 to: ./preindex/1978/1774921.003
2017-06-20 16:16:14,725 INFO CopyFiles$ Processing DocNum: 1780236, FileYear: 1978, FileMd: 608, Files: List(Z:\I\1978\06\08\1780236.001, Z:\I\1978\06\08\1780236.002, Z:\I\1978\06\08\1780236.003, Z:\I\1978\06\08\1780236.004, Z:\I\1978\06\08\1780236.005, Z:\I\1978\06\08\1780236.006, Z:\I\1978\06\08\1780236.007)
2017-06-20 16:16:14,725 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1780236.001 to: ./preindex/1978/1780236.001
2017-06-20 16:16:14,741 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1780236.002 to: ./preindex/1978/1780236.002
2017-06-20 16:16:14,757 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1780236.003 to: ./preindex/1978/1780236.003
2017-06-20 16:16:14,772 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1780236.004 to: ./preindex/1978/1780236.004
2017-06-20 16:16:14,788 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1780236.005 to: ./preindex/1978/1780236.005
2017-06-20 16:16:14,788 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1780236.006 to: ./preindex/1978/1780236.006
2017-06-20 16:16:14,803 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1780236.007 to: ./preindex/1978/1780236.007
2017-06-20 16:16:14,803 INFO CopyFiles$ Processing DocNum: 1854501, FileYear: 1978, FileMd: 913, Files: List(Z:\I\1978\09\13\1854501.001, Z:\I\1978\09\13\1854501.002)
2017-06-20 16:16:14,803 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1854501.001 to: ./preindex/1978/1854501.001
2017-06-20 16:16:14,819 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1854501.002 to: ./preindex/1978/1854501.002
2017-06-20 16:16:14,835 INFO CopyFiles$ Processing DocNum: 1767822, FileYear: 1978, FileMd: 517, Files: List(Z:\I\1978\05\17\1767822.001, Z:\I\1978\05\17\1767822.002)
2017-06-20 16:16:14,850 INFO CopyFiles$ Copying: Z:\I\1978\05\17\1767822.001 to: ./preindex/1978/1767822.001
2017-06-20 16:16:14,850 INFO CopyFiles$ Copying: Z:\I\1978\05\17\1767822.002 to: ./preindex/1978/1767822.002
2017-06-20 16:16:14,866 INFO CopyFiles$ Processing DocNum: 1701098, FileYear: 1978, FileMd: 213, Files: List(Z:\I\1978\02\13\1701098.001, Z:\I\1978\02\13\1701098.002, Z:\I\1978\02\13\1701098.003)
2017-06-20 16:16:14,866 INFO CopyFiles$ Copying: Z:\I\1978\02\13\1701098.001 to: ./preindex/1978/1701098.001
2017-06-20 16:16:14,866 INFO CopyFiles$ Copying: Z:\I\1978\02\13\1701098.002 to: ./preindex/1978/1701098.002
2017-06-20 16:16:14,881 INFO CopyFiles$ Copying: Z:\I\1978\02\13\1701098.003 to: ./preindex/1978/1701098.003
2017-06-20 16:16:14,897 INFO CopyFiles$ Processing DocNum: 1864243, FileYear: 1978, FileMd: 926, Files: List(Z:\I\1978\09\26\1864243.001, Z:\I\1978\09\26\1864243.002, Z:\I\1978\09\26\1864243.003, Z:\I\1978\09\26\1864243.004, Z:\I\1978\09\26\1864243.005, Z:\I\1978\09\26\1864243.006, Z:\I\1978\09\26\1864243.007)
2017-06-20 16:16:14,897 INFO CopyFiles$ Copying: Z:\I\1978\09\26\1864243.001 to: ./preindex/1978/1864243.001
2017-06-20 16:16:14,913 INFO CopyFiles$ Copying: Z:\I\1978\09\26\1864243.002 to: ./preindex/1978/1864243.002
2017-06-20 16:16:14,913 INFO CopyFiles$ Copying: Z:\I\1978\09\26\1864243.003 to: ./preindex/1978/1864243.003
2017-06-20 16:16:14,928 INFO CopyFiles$ Copying: Z:\I\1978\09\26\1864243.004 to: ./preindex/1978/1864243.004
2017-06-20 16:16:14,928 INFO CopyFiles$ Copying: Z:\I\1978\09\26\1864243.005 to: ./preindex/1978/1864243.005
2017-06-20 16:16:14,944 INFO CopyFiles$ Copying: Z:\I\1978\09\26\1864243.006 to: ./preindex/1978/1864243.006
2017-06-20 16:16:14,944 INFO CopyFiles$ Copying: Z:\I\1978\09\26\1864243.007 to: ./preindex/1978/1864243.007
2017-06-20 16:16:14,959 INFO CopyFiles$ Processing DocNum: 1900584, FileYear: 1978, FileMd: 1116, Files: List(Z:\I\1978\11\16\1900584.001, Z:\I\1978\11\16\1900584.002, Z:\I\1978\11\16\1900584.003)
2017-06-20 16:16:14,959 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900584.001 to: ./preindex/1978/1900584.001
2017-06-20 16:16:14,975 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900584.002 to: ./preindex/1978/1900584.002
2017-06-20 16:16:14,975 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900584.003 to: ./preindex/1978/1900584.003
2017-06-20 16:16:14,991 INFO CopyFiles$ Processing DocNum: 1707931, FileYear: 1978, FileMd: 223, Files: List(Z:\I\1978\02\23\1707931.001, Z:\I\1978\02\23\1707931.002)
2017-06-20 16:16:14,991 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1707931.001 to: ./preindex/1978/1707931.001
2017-06-20 16:16:14,991 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1707931.002 to: ./preindex/1978/1707931.002
2017-06-20 16:16:15,006 INFO CopyFiles$ Processing DocNum: 1905765, FileYear: 1978, FileMd: 1127, Files: List(Z:\I\1978\11\27\1905765.001, Z:\I\1978\11\27\1905765.002, Z:\I\1978\11\27\1905765.003)
2017-06-20 16:16:15,006 INFO CopyFiles$ Copying: Z:\I\1978\11\27\1905765.001 to: ./preindex/1978/1905765.001
2017-06-20 16:16:15,006 INFO CopyFiles$ Copying: Z:\I\1978\11\27\1905765.002 to: ./preindex/1978/1905765.002
2017-06-20 16:16:15,022 INFO CopyFiles$ Copying: Z:\I\1978\11\27\1905765.003 to: ./preindex/1978/1905765.003
2017-06-20 16:16:15,022 INFO CopyFiles$ Processing DocNum: 1807163, FileYear: 1978, FileMd: 713, Files: List(Z:\I\1978\07\13\1807163.001, Z:\I\1978\07\13\1807163.002)
2017-06-20 16:16:15,022 INFO CopyFiles$ Copying: Z:\I\1978\07\13\1807163.001 to: ./preindex/1978/1807163.001
2017-06-20 16:16:15,037 INFO CopyFiles$ Copying: Z:\I\1978\07\13\1807163.002 to: ./preindex/1978/1807163.002
2017-06-20 16:16:15,037 INFO CopyFiles$ Processing DocNum: 1741262, FileYear: 1978, FileMd: 412, Files: List(Z:\I\1978\04\12\1741262.001, Z:\I\1978\04\12\1741262.002, Z:\I\1978\04\12\1741262.003, Z:\I\1978\04\12\1741262.004)
2017-06-20 16:16:15,053 INFO CopyFiles$ Copying: Z:\I\1978\04\12\1741262.001 to: ./preindex/1978/1741262.001
2017-06-20 16:16:15,053 INFO CopyFiles$ Copying: Z:\I\1978\04\12\1741262.002 to: ./preindex/1978/1741262.002
2017-06-20 16:16:15,069 INFO CopyFiles$ Copying: Z:\I\1978\04\12\1741262.003 to: ./preindex/1978/1741262.003
2017-06-20 16:16:15,069 INFO CopyFiles$ Copying: Z:\I\1978\04\12\1741262.004 to: ./preindex/1978/1741262.004
2017-06-20 16:16:15,084 INFO CopyFiles$ Processing DocNum: 1791828, FileYear: 1978, FileMd: 622, Files: List(Z:\I\1978\06\22\1791828.001, Z:\I\1978\06\22\1791828.002, Z:\I\1978\06\22\1791828.003, Z:\I\1978\06\22\1791828.004)
2017-06-20 16:16:15,084 INFO CopyFiles$ Copying: Z:\I\1978\06\22\1791828.001 to: ./preindex/1978/1791828.001
2017-06-20 16:16:15,100 INFO CopyFiles$ Copying: Z:\I\1978\06\22\1791828.002 to: ./preindex/1978/1791828.002
2017-06-20 16:16:15,100 INFO CopyFiles$ Copying: Z:\I\1978\06\22\1791828.003 to: ./preindex/1978/1791828.003
2017-06-20 16:16:15,115 INFO CopyFiles$ Copying: Z:\I\1978\06\22\1791828.004 to: ./preindex/1978/1791828.004
2017-06-20 16:16:15,131 INFO CopyFiles$ Processing DocNum: 1732231, FileYear: 1978, FileMd: 331, Files: List(Z:\I\1978\03\31\1732231.001, Z:\I\1978\03\31\1732231.002, Z:\I\1978\03\31\1732231.003)
2017-06-20 16:16:15,131 INFO CopyFiles$ Copying: Z:\I\1978\03\31\1732231.001 to: ./preindex/1978/1732231.001
2017-06-20 16:16:15,131 INFO CopyFiles$ Copying: Z:\I\1978\03\31\1732231.002 to: ./preindex/1978/1732231.002
2017-06-20 16:16:15,131 INFO CopyFiles$ Copying: Z:\I\1978\03\31\1732231.003 to: ./preindex/1978/1732231.003
2017-06-20 16:16:15,147 INFO CopyFiles$ Processing DocNum: 1732978, FileYear: 1978, FileMd: 331, Files: List(Z:\I\1978\03\31\1732978.001, Z:\I\1978\03\31\1732978.002, Z:\I\1978\03\31\1732978.003, Z:\I\1978\03\31\1732978.004, Z:\I\1978\03\31\1732978.005, Z:\I\1978\03\31\1732978.006, Z:\I\1978\03\31\1732978.007, Z:\I\1978\03\31\1732978.008)
2017-06-20 16:16:15,147 INFO CopyFiles$ Copying: Z:\I\1978\03\31\1732978.001 to: ./preindex/1978/1732978.001
2017-06-20 16:16:15,147 INFO CopyFiles$ Copying: Z:\I\1978\03\31\1732978.002 to: ./preindex/1978/1732978.002
2017-06-20 16:16:15,162 INFO CopyFiles$ Copying: Z:\I\1978\03\31\1732978.003 to: ./preindex/1978/1732978.003
2017-06-20 16:16:15,162 INFO CopyFiles$ Copying: Z:\I\1978\03\31\1732978.004 to: ./preindex/1978/1732978.004
2017-06-20 16:16:15,178 INFO CopyFiles$ Copying: Z:\I\1978\03\31\1732978.005 to: ./preindex/1978/1732978.005
2017-06-20 16:16:15,193 INFO CopyFiles$ Copying: Z:\I\1978\03\31\1732978.006 to: ./preindex/1978/1732978.006
2017-06-20 16:16:15,209 INFO CopyFiles$ Copying: Z:\I\1978\03\31\1732978.007 to: ./preindex/1978/1732978.007
2017-06-20 16:16:15,225 INFO CopyFiles$ Copying: Z:\I\1978\03\31\1732978.008 to: ./preindex/1978/1732978.008
2017-06-20 16:16:15,225 INFO CopyFiles$ Processing DocNum: 1675237, FileYear: 1978, FileMd: 103, Files: List(Z:\I\1978\01\03\1675237.001, Z:\I\1978\01\03\1675237.002, Z:\I\1978\01\03\1675237.003)
2017-06-20 16:16:15,240 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675237.001 to: ./preindex/1978/1675237.001
2017-06-20 16:16:15,240 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675237.002 to: ./preindex/1978/1675237.002
2017-06-20 16:16:15,256 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675237.003 to: ./preindex/1978/1675237.003
2017-06-20 16:16:15,256 INFO CopyFiles$ Processing DocNum: 1682898, FileYear: 1978, FileMd: 113, Files: List(Z:\I\1978\01\13\1682898.001, Z:\I\1978\01\13\1682898.002, Z:\I\1978\01\13\1682898.003, Z:\I\1978\01\13\1682898.004)
2017-06-20 16:16:15,256 INFO CopyFiles$ Copying: Z:\I\1978\01\13\1682898.001 to: ./preindex/1978/1682898.001
2017-06-20 16:16:15,287 INFO CopyFiles$ Copying: Z:\I\1978\01\13\1682898.002 to: ./preindex/1978/1682898.002
2017-06-20 16:16:15,303 INFO CopyFiles$ Copying: Z:\I\1978\01\13\1682898.003 to: ./preindex/1978/1682898.003
2017-06-20 16:16:15,318 INFO CopyFiles$ Copying: Z:\I\1978\01\13\1682898.004 to: ./preindex/1978/1682898.004
2017-06-20 16:16:15,334 INFO CopyFiles$ Processing DocNum: 1904256, FileYear: 1978, FileMd: 1122, Files: List(Z:\I\1978\11\22\1904256.001, Z:\I\1978\11\22\1904256.002, Z:\I\1978\11\22\1904256.003)
2017-06-20 16:16:15,334 INFO CopyFiles$ Copying: Z:\I\1978\11\22\1904256.001 to: ./preindex/1978/1904256.001
2017-06-20 16:16:15,334 INFO CopyFiles$ Copying: Z:\I\1978\11\22\1904256.002 to: ./preindex/1978/1904256.002
2017-06-20 16:16:15,349 INFO CopyFiles$ Copying: Z:\I\1978\11\22\1904256.003 to: ./preindex/1978/1904256.003
2017-06-20 16:16:15,349 INFO CopyFiles$ Processing DocNum: 1681762, FileYear: 1978, FileMd: 112, Files: List(Z:\I\1978\01\12\1681762.001, Z:\I\1978\01\12\1681762.002, Z:\I\1978\01\12\1681762.003, Z:\I\1978\01\12\1681762.004, Z:\I\1978\01\12\1681762.005, Z:\I\1978\01\12\1681762.006, Z:\I\1978\01\12\1681762.007, Z:\I\1978\01\12\1681762.008, Z:\I\1978\01\12\1681762.009, Z:\I\1978\01\12\1681762.010)
2017-06-20 16:16:15,349 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681762.001 to: ./preindex/1978/1681762.001
2017-06-20 16:16:15,365 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681762.002 to: ./preindex/1978/1681762.002
2017-06-20 16:16:15,365 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681762.003 to: ./preindex/1978/1681762.003
2017-06-20 16:16:15,381 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681762.004 to: ./preindex/1978/1681762.004
2017-06-20 16:16:15,381 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681762.005 to: ./preindex/1978/1681762.005
2017-06-20 16:16:15,396 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681762.006 to: ./preindex/1978/1681762.006
2017-06-20 16:16:15,396 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681762.007 to: ./preindex/1978/1681762.007
2017-06-20 16:16:15,396 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681762.008 to: ./preindex/1978/1681762.008
2017-06-20 16:16:15,412 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681762.009 to: ./preindex/1978/1681762.009
2017-06-20 16:16:15,412 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681762.010 to: ./preindex/1978/1681762.010
2017-06-20 16:16:15,427 INFO CopyFiles$ Processing DocNum: 1814278, FileYear: 1978, FileMd: 721, Files: List(Z:\I\1978\07\21\1814278.001, Z:\I\1978\07\21\1814278.002, Z:\I\1978\07\21\1814278.003)
2017-06-20 16:16:15,427 INFO CopyFiles$ Copying: Z:\I\1978\07\21\1814278.001 to: ./preindex/1978/1814278.001
2017-06-20 16:16:15,427 INFO CopyFiles$ Copying: Z:\I\1978\07\21\1814278.002 to: ./preindex/1978/1814278.002
2017-06-20 16:16:15,443 INFO CopyFiles$ Copying: Z:\I\1978\07\21\1814278.003 to: ./preindex/1978/1814278.003
2017-06-20 16:16:15,459 INFO CopyFiles$ Processing DocNum: 1896403, FileYear: 1978, FileMd: 1110, Files: List(Z:\I\1978\11\10\1896403.001, Z:\I\1978\11\10\1896403.002, Z:\I\1978\11\10\1896403.003, Z:\I\1978\11\10\1896403.004)
2017-06-20 16:16:15,459 INFO CopyFiles$ Copying: Z:\I\1978\11\10\1896403.001 to: ./preindex/1978/1896403.001
2017-06-20 16:16:15,459 INFO CopyFiles$ Copying: Z:\I\1978\11\10\1896403.002 to: ./preindex/1978/1896403.002
2017-06-20 16:16:15,474 INFO CopyFiles$ Copying: Z:\I\1978\11\10\1896403.003 to: ./preindex/1978/1896403.003
2017-06-20 16:16:15,474 INFO CopyFiles$ Copying: Z:\I\1978\11\10\1896403.004 to: ./preindex/1978/1896403.004
2017-06-20 16:16:15,490 INFO CopyFiles$ Processing DocNum: 1805144, FileYear: 1978, FileMd: 711, Files: List(Z:\I\1978\07\11\1805144.001, Z:\I\1978\07\11\1805144.002, Z:\I\1978\07\11\1805144.003, Z:\I\1978\07\11\1805144.004)
2017-06-20 16:16:15,490 INFO CopyFiles$ Copying: Z:\I\1978\07\11\1805144.001 to: ./preindex/1978/1805144.001
2017-06-20 16:16:15,505 INFO CopyFiles$ Copying: Z:\I\1978\07\11\1805144.002 to: ./preindex/1978/1805144.002
2017-06-20 16:16:15,505 INFO CopyFiles$ Copying: Z:\I\1978\07\11\1805144.003 to: ./preindex/1978/1805144.003
2017-06-20 16:16:15,521 INFO CopyFiles$ Copying: Z:\I\1978\07\11\1805144.004 to: ./preindex/1978/1805144.004
2017-06-20 16:16:15,521 INFO CopyFiles$ Processing DocNum: 1675416, FileYear: 1978, FileMd: 103, Files: List(Z:\I\1978\01\03\1675416.001, Z:\I\1978\01\03\1675416.002, Z:\I\1978\01\03\1675416.003)
2017-06-20 16:16:15,521 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675416.001 to: ./preindex/1978/1675416.001
2017-06-20 16:16:15,537 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675416.002 to: ./preindex/1978/1675416.002
2017-06-20 16:16:15,537 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675416.003 to: ./preindex/1978/1675416.003
2017-06-20 16:16:15,552 INFO CopyFiles$ Processing DocNum: 1682776, FileYear: 1978, FileMd: 113, Files: List(Z:\I\1978\01\13\1682776.001, Z:\I\1978\01\13\1682776.002, Z:\I\1978\01\13\1682776.003)
2017-06-20 16:16:15,552 INFO CopyFiles$ Copying: Z:\I\1978\01\13\1682776.001 to: ./preindex/1978/1682776.001
2017-06-20 16:16:15,568 INFO CopyFiles$ Copying: Z:\I\1978\01\13\1682776.002 to: ./preindex/1978/1682776.002
2017-06-20 16:16:15,568 INFO CopyFiles$ Copying: Z:\I\1978\01\13\1682776.003 to: ./preindex/1978/1682776.003
2017-06-20 16:16:15,568 INFO CopyFiles$ Processing DocNum: 1825012, FileYear: 1978, FileMd: 804, Files: List(Z:\I\1978\08\04\1825012.001, Z:\I\1978\08\04\1825012.002, Z:\I\1978\08\04\1825012.003, Z:\I\1978\08\04\1825012.004, Z:\I\1978\08\04\1825012.005, Z:\I\1978\08\04\1825012.006, Z:\I\1978\08\04\1825012.007, Z:\I\1978\08\04\1825012.008, Z:\I\1978\08\04\1825012.009, Z:\I\1978\08\04\1825012.010, Z:\I\1978\08\04\1825012.011, Z:\I\1978\08\04\1825012.012, Z:\I\1978\08\04\1825012.013, Z:\I\1978\08\04\1825012.014, Z:\I\1978\08\04\1825012.015, Z:\I\1978\08\04\1825012.016)
2017-06-20 16:16:15,583 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825012.001 to: ./preindex/1978/1825012.001
2017-06-20 16:16:15,583 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825012.002 to: ./preindex/1978/1825012.002
2017-06-20 16:16:15,599 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825012.003 to: ./preindex/1978/1825012.003
2017-06-20 16:16:15,599 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825012.004 to: ./preindex/1978/1825012.004
2017-06-20 16:16:15,615 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825012.005 to: ./preindex/1978/1825012.005
2017-06-20 16:16:15,615 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825012.006 to: ./preindex/1978/1825012.006
2017-06-20 16:16:15,630 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825012.007 to: ./preindex/1978/1825012.007
2017-06-20 16:16:15,630 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825012.008 to: ./preindex/1978/1825012.008
2017-06-20 16:16:15,630 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825012.009 to: ./preindex/1978/1825012.009
2017-06-20 16:16:15,646 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825012.010 to: ./preindex/1978/1825012.010
2017-06-20 16:16:15,646 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825012.011 to: ./preindex/1978/1825012.011
2017-06-20 16:16:15,661 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825012.012 to: ./preindex/1978/1825012.012
2017-06-20 16:16:15,661 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825012.013 to: ./preindex/1978/1825012.013
2017-06-20 16:16:15,661 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825012.014 to: ./preindex/1978/1825012.014
2017-06-20 16:16:15,677 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825012.015 to: ./preindex/1978/1825012.015
2017-06-20 16:16:15,693 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825012.016 to: ./preindex/1978/1825012.016
2017-06-20 16:16:15,693 INFO CopyFiles$ Processing DocNum: 1723220, FileYear: 1978, FileMd: 316, Files: List(Z:\I\1978\03\16\1723220.001, Z:\I\1978\03\16\1723220.002, Z:\I\1978\03\16\1723220.003, Z:\I\1978\03\16\1723220.004, Z:\I\1978\03\16\1723220.005, Z:\I\1978\03\16\1723220.006, Z:\I\1978\03\16\1723220.007)
2017-06-20 16:16:15,693 INFO CopyFiles$ Copying: Z:\I\1978\03\16\1723220.001 to: ./preindex/1978/1723220.001
2017-06-20 16:16:15,708 INFO CopyFiles$ Copying: Z:\I\1978\03\16\1723220.002 to: ./preindex/1978/1723220.002
2017-06-20 16:16:15,708 INFO CopyFiles$ Copying: Z:\I\1978\03\16\1723220.003 to: ./preindex/1978/1723220.003
2017-06-20 16:16:15,724 INFO CopyFiles$ Copying: Z:\I\1978\03\16\1723220.004 to: ./preindex/1978/1723220.004
2017-06-20 16:16:15,724 INFO CopyFiles$ Copying: Z:\I\1978\03\16\1723220.005 to: ./preindex/1978/1723220.005
2017-06-20 16:16:15,724 INFO CopyFiles$ Copying: Z:\I\1978\03\16\1723220.006 to: ./preindex/1978/1723220.006
2017-06-20 16:16:15,739 INFO CopyFiles$ Copying: Z:\I\1978\03\16\1723220.007 to: ./preindex/1978/1723220.007
2017-06-20 16:16:15,739 INFO CopyFiles$ Processing DocNum: 1906031, FileYear: 1978, FileMd: 1127, Files: List(Z:\I\1978\11\27\1906031.001, Z:\I\1978\11\27\1906031.002)
2017-06-20 16:16:15,739 INFO CopyFiles$ Copying: Z:\I\1978\11\27\1906031.001 to: ./preindex/1978/1906031.001
2017-06-20 16:16:15,755 INFO CopyFiles$ Copying: Z:\I\1978\11\27\1906031.002 to: ./preindex/1978/1906031.002
2017-06-20 16:16:15,755 INFO CopyFiles$ Processing DocNum: 1772588, FileYear: 1978, FileMd: 524, Files: List(Z:\I\1978\05\24\1772588.001, Z:\I\1978\05\24\1772588.002, Z:\I\1978\05\24\1772588.003)
2017-06-20 16:16:15,771 INFO CopyFiles$ Copying: Z:\I\1978\05\24\1772588.001 to: ./preindex/1978/1772588.001
2017-06-20 16:16:15,786 INFO CopyFiles$ Copying: Z:\I\1978\05\24\1772588.002 to: ./preindex/1978/1772588.002
2017-06-20 16:16:15,802 INFO CopyFiles$ Copying: Z:\I\1978\05\24\1772588.003 to: ./preindex/1978/1772588.003
2017-06-20 16:16:15,833 INFO CopyFiles$ Processing DocNum: 1703838, FileYear: 1978, FileMd: 216, Files: List(Z:\I\1978\02\16\1703838.001, Z:\I\1978\02\16\1703838.002, Z:\I\1978\02\16\1703838.003)
2017-06-20 16:16:15,833 INFO CopyFiles$ Copying: Z:\I\1978\02\16\1703838.001 to: ./preindex/1978/1703838.001
2017-06-20 16:16:15,849 INFO CopyFiles$ Copying: Z:\I\1978\02\16\1703838.002 to: ./preindex/1978/1703838.002
2017-06-20 16:16:15,864 INFO CopyFiles$ Copying: Z:\I\1978\02\16\1703838.003 to: ./preindex/1978/1703838.003
2017-06-20 16:16:15,864 INFO CopyFiles$ Processing DocNum: 1835718, FileYear: 1978, FileMd: 818, Files: List(Z:\I\1978\08\18\1835718.001, Z:\I\1978\08\18\1835718.002, Z:\I\1978\08\18\1835718.003, Z:\I\1978\08\18\1835718.004, Z:\I\1978\08\18\1835718.005)
2017-06-20 16:16:15,880 INFO CopyFiles$ Copying: Z:\I\1978\08\18\1835718.001 to: ./preindex/1978/1835718.001
2017-06-20 16:16:15,895 INFO CopyFiles$ Copying: Z:\I\1978\08\18\1835718.002 to: ./preindex/1978/1835718.002
2017-06-20 16:16:15,911 INFO CopyFiles$ Copying: Z:\I\1978\08\18\1835718.003 to: ./preindex/1978/1835718.003
2017-06-20 16:16:15,927 INFO CopyFiles$ Copying: Z:\I\1978\08\18\1835718.004 to: ./preindex/1978/1835718.004
2017-06-20 16:16:15,942 INFO CopyFiles$ Copying: Z:\I\1978\08\18\1835718.005 to: ./preindex/1978/1835718.005
2017-06-20 16:16:15,958 INFO CopyFiles$ Processing DocNum: 1729867, FileYear: 1978, FileMd: 328, Files: List(Z:\I\1978\03\28\1729867.001, Z:\I\1978\03\28\1729867.002)
2017-06-20 16:16:15,958 INFO CopyFiles$ Copying: Z:\I\1978\03\28\1729867.001 to: ./preindex/1978/1729867.001
2017-06-20 16:16:15,973 INFO CopyFiles$ Copying: Z:\I\1978\03\28\1729867.002 to: ./preindex/1978/1729867.002
2017-06-20 16:16:15,989 INFO CopyFiles$ Processing DocNum: 1805100, FileYear: 1978, FileMd: 711, Files: List(Z:\I\1978\07\11\1805100.001, Z:\I\1978\07\11\1805100.002, Z:\I\1978\07\11\1805100.003, Z:\I\1978\07\11\1805100.004)
2017-06-20 16:16:15,989 INFO CopyFiles$ Copying: Z:\I\1978\07\11\1805100.001 to: ./preindex/1978/1805100.001
2017-06-20 16:16:16,005 INFO CopyFiles$ Copying: Z:\I\1978\07\11\1805100.002 to: ./preindex/1978/1805100.002
2017-06-20 16:16:16,036 INFO CopyFiles$ Copying: Z:\I\1978\07\11\1805100.003 to: ./preindex/1978/1805100.003
2017-06-20 16:16:16,036 INFO CopyFiles$ Copying: Z:\I\1978\07\11\1805100.004 to: ./preindex/1978/1805100.004
2017-06-20 16:16:16,051 INFO CopyFiles$ Processing DocNum: 1816111, FileYear: 1978, FileMd: 725, Files: List(Z:\I\1978\07\25\1816111.001, Z:\I\1978\07\25\1816111.002, Z:\I\1978\07\25\1816111.003)
2017-06-20 16:16:16,067 INFO CopyFiles$ Copying: Z:\I\1978\07\25\1816111.001 to: ./preindex/1978/1816111.001
2017-06-20 16:16:16,067 INFO CopyFiles$ Copying: Z:\I\1978\07\25\1816111.002 to: ./preindex/1978/1816111.002
2017-06-20 16:16:16,083 INFO CopyFiles$ Copying: Z:\I\1978\07\25\1816111.003 to: ./preindex/1978/1816111.003
2017-06-20 16:16:16,098 INFO CopyFiles$ Processing DocNum: 1736709, FileYear: 1978, FileMd: 406, Files: List(Z:\I\1978\04\06\1736709.001, Z:\I\1978\04\06\1736709.002, Z:\I\1978\04\06\1736709.003, Z:\I\1978\04\06\1736709.004, Z:\I\1978\04\06\1736709.005)
2017-06-20 16:16:16,098 INFO CopyFiles$ Copying: Z:\I\1978\04\06\1736709.001 to: ./preindex/1978/1736709.001
2017-06-20 16:16:16,114 INFO CopyFiles$ Copying: Z:\I\1978\04\06\1736709.002 to: ./preindex/1978/1736709.002
2017-06-20 16:16:16,114 INFO CopyFiles$ Copying: Z:\I\1978\04\06\1736709.003 to: ./preindex/1978/1736709.003
2017-06-20 16:16:16,129 INFO CopyFiles$ Copying: Z:\I\1978\04\06\1736709.004 to: ./preindex/1978/1736709.004
2017-06-20 16:16:16,129 INFO CopyFiles$ Copying: Z:\I\1978\04\06\1736709.005 to: ./preindex/1978/1736709.005
2017-06-20 16:16:16,145 INFO CopyFiles$ Processing DocNum: 1848320, FileYear: 1978, FileMd: 906, Files: List(Z:\I\1978\09\06\1848320.001, Z:\I\1978\09\06\1848320.002, Z:\I\1978\09\06\1848320.003, Z:\I\1978\09\06\1848320.004)
2017-06-20 16:16:16,161 INFO CopyFiles$ Copying: Z:\I\1978\09\06\1848320.001 to: ./preindex/1978/1848320.001
2017-06-20 16:16:16,161 INFO CopyFiles$ Copying: Z:\I\1978\09\06\1848320.002 to: ./preindex/1978/1848320.002
2017-06-20 16:16:16,176 INFO CopyFiles$ Copying: Z:\I\1978\09\06\1848320.003 to: ./preindex/1978/1848320.003
2017-06-20 16:16:16,176 INFO CopyFiles$ Copying: Z:\I\1978\09\06\1848320.004 to: ./preindex/1978/1848320.004
2017-06-20 16:16:16,192 INFO CopyFiles$ Processing DocNum: 1913794, FileYear: 1978, FileMd: 1208, Files: List(Z:\I\1978\12\08\1913794.001, Z:\I\1978\12\08\1913794.002, Z:\I\1978\12\08\1913794.003)
2017-06-20 16:16:16,192 INFO CopyFiles$ Copying: Z:\I\1978\12\08\1913794.001 to: ./preindex/1978/1913794.001
2017-06-20 16:16:16,192 INFO CopyFiles$ Copying: Z:\I\1978\12\08\1913794.002 to: ./preindex/1978/1913794.002
2017-06-20 16:16:16,207 INFO CopyFiles$ Copying: Z:\I\1978\12\08\1913794.003 to: ./preindex/1978/1913794.003
2017-06-20 16:16:16,223 INFO CopyFiles$ Processing DocNum: 1678500, FileYear: 1978, FileMd: 106, Files: List(Z:\I\1978\01\06\1678500.001, Z:\I\1978\01\06\1678500.002, Z:\I\1978\01\06\1678500.003)
2017-06-20 16:16:16,223 INFO CopyFiles$ Copying: Z:\I\1978\01\06\1678500.001 to: ./preindex/1978/1678500.001
2017-06-20 16:16:16,254 INFO CopyFiles$ Copying: Z:\I\1978\01\06\1678500.002 to: ./preindex/1978/1678500.002
2017-06-20 16:16:16,270 INFO CopyFiles$ Copying: Z:\I\1978\01\06\1678500.003 to: ./preindex/1978/1678500.003
2017-06-20 16:16:16,285 INFO CopyFiles$ Processing DocNum: 1771648, FileYear: 1978, FileMd: 523, Files: List(Z:\I\1978\05\23\1771648.001, Z:\I\1978\05\23\1771648.002)
2017-06-20 16:16:16,285 INFO CopyFiles$ Copying: Z:\I\1978\05\23\1771648.001 to: ./preindex/1978/1771648.001
2017-06-20 16:16:16,317 INFO CopyFiles$ Copying: Z:\I\1978\05\23\1771648.002 to: ./preindex/1978/1771648.002
2017-06-20 16:16:16,332 INFO CopyFiles$ Processing DocNum: 1884185, FileYear: 1978, FileMd: 1025, Files: List(Z:\I\1978\10\25\1884185.001, Z:\I\1978\10\25\1884185.002, Z:\I\1978\10\25\1884185.003, Z:\I\1978\10\25\1884185.004, Z:\I\1978\10\25\1884185.005)
2017-06-20 16:16:16,332 INFO CopyFiles$ Copying: Z:\I\1978\10\25\1884185.001 to: ./preindex/1978/1884185.001
2017-06-20 16:16:16,348 INFO CopyFiles$ Copying: Z:\I\1978\10\25\1884185.002 to: ./preindex/1978/1884185.002
2017-06-20 16:16:16,348 INFO CopyFiles$ Copying: Z:\I\1978\10\25\1884185.003 to: ./preindex/1978/1884185.003
2017-06-20 16:16:16,363 INFO CopyFiles$ Copying: Z:\I\1978\10\25\1884185.004 to: ./preindex/1978/1884185.004
2017-06-20 16:16:16,379 INFO CopyFiles$ Copying: Z:\I\1978\10\25\1884185.005 to: ./preindex/1978/1884185.005
2017-06-20 16:16:16,379 INFO CopyFiles$ Processing DocNum: 1839270, FileYear: 1978, FileMd: 824, Files: List(Z:\I\1978\08\24\1839270.001, Z:\I\1978\08\24\1839270.002, Z:\I\1978\08\24\1839270.003, Z:\I\1978\08\24\1839270.004, Z:\I\1978\08\24\1839270.005, Z:\I\1978\08\24\1839270.006)
2017-06-20 16:16:16,395 INFO CopyFiles$ Copying: Z:\I\1978\08\24\1839270.001 to: ./preindex/1978/1839270.001
2017-06-20 16:16:16,410 INFO CopyFiles$ Copying: Z:\I\1978\08\24\1839270.002 to: ./preindex/1978/1839270.002
2017-06-20 16:16:16,410 INFO CopyFiles$ Copying: Z:\I\1978\08\24\1839270.003 to: ./preindex/1978/1839270.003
2017-06-20 16:16:16,426 INFO CopyFiles$ Copying: Z:\I\1978\08\24\1839270.004 to: ./preindex/1978/1839270.004
2017-06-20 16:16:16,426 INFO CopyFiles$ Copying: Z:\I\1978\08\24\1839270.005 to: ./preindex/1978/1839270.005
2017-06-20 16:16:16,441 INFO CopyFiles$ Copying: Z:\I\1978\08\24\1839270.006 to: ./preindex/1978/1839270.006
2017-06-20 16:16:16,457 INFO CopyFiles$ Processing DocNum: 1924021, FileYear: 1978, FileMd: 1222, Files: List(Z:\I\1978\12\22\1924021.001, Z:\I\1978\12\22\1924021.002, Z:\I\1978\12\22\1924021.003, Z:\I\1978\12\22\1924021.004)
2017-06-20 16:16:16,457 INFO CopyFiles$ Copying: Z:\I\1978\12\22\1924021.001 to: ./preindex/1978/1924021.001
2017-06-20 16:16:16,473 INFO CopyFiles$ Copying: Z:\I\1978\12\22\1924021.002 to: ./preindex/1978/1924021.002
2017-06-20 16:16:16,473 INFO CopyFiles$ Copying: Z:\I\1978\12\22\1924021.003 to: ./preindex/1978/1924021.003
2017-06-20 16:16:16,488 INFO CopyFiles$ Copying: Z:\I\1978\12\22\1924021.004 to: ./preindex/1978/1924021.004
2017-06-20 16:16:16,488 INFO CopyFiles$ Processing DocNum: 1736137, FileYear: 1978, FileMd: 405, Files: List(Z:\I\1978\04\05\1736137.001, Z:\I\1978\04\05\1736137.002, Z:\I\1978\04\05\1736137.003)
2017-06-20 16:16:16,488 INFO CopyFiles$ Copying: Z:\I\1978\04\05\1736137.001 to: ./preindex/1978/1736137.001
2017-06-20 16:16:16,504 INFO CopyFiles$ Copying: Z:\I\1978\04\05\1736137.002 to: ./preindex/1978/1736137.002
2017-06-20 16:16:16,519 INFO CopyFiles$ Copying: Z:\I\1978\04\05\1736137.003 to: ./preindex/1978/1736137.003
2017-06-20 16:16:16,519 INFO CopyFiles$ Processing DocNum: 1910437, FileYear: 1978, FileMd: 1204, Files: List(Z:\I\1978\12\04\1910437.001, Z:\I\1978\12\04\1910437.002)
2017-06-20 16:16:16,519 INFO CopyFiles$ Copying: Z:\I\1978\12\04\1910437.001 to: ./preindex/1978/1910437.001
2017-06-20 16:16:16,535 INFO CopyFiles$ Copying: Z:\I\1978\12\04\1910437.002 to: ./preindex/1978/1910437.002
2017-06-20 16:16:16,551 INFO CopyFiles$ Processing DocNum: 1918139, FileYear: 1978, FileMd: 1218, Files: List(Z:\I\1978\12\18\1918139.001, Z:\I\1978\12\18\1918139.002, Z:\I\1978\12\18\1918139.003, Z:\I\1978\12\18\1918139.004)
2017-06-20 16:16:16,551 INFO CopyFiles$ Copying: Z:\I\1978\12\18\1918139.001 to: ./preindex/1978/1918139.001
2017-06-20 16:16:16,566 INFO CopyFiles$ Copying: Z:\I\1978\12\18\1918139.002 to: ./preindex/1978/1918139.002
2017-06-20 16:16:16,582 INFO CopyFiles$ Copying: Z:\I\1978\12\18\1918139.003 to: ./preindex/1978/1918139.003
2017-06-20 16:16:16,597 INFO CopyFiles$ Copying: Z:\I\1978\12\18\1918139.004 to: ./preindex/1978/1918139.004
2017-06-20 16:16:16,597 INFO CopyFiles$ Processing DocNum: 1830436, FileYear: 1978, FileMd: 811, Files: List(Z:\I\1978\08\11\1830436.001, Z:\I\1978\08\11\1830436.002, Z:\I\1978\08\11\1830436.003, Z:\I\1978\08\11\1830436.004, Z:\I\1978\08\11\1830436.005)
2017-06-20 16:16:16,613 INFO CopyFiles$ Copying: Z:\I\1978\08\11\1830436.001 to: ./preindex/1978/1830436.001
2017-06-20 16:16:16,613 INFO CopyFiles$ Copying: Z:\I\1978\08\11\1830436.002 to: ./preindex/1978/1830436.002
2017-06-20 16:16:16,629 INFO CopyFiles$ Copying: Z:\I\1978\08\11\1830436.003 to: ./preindex/1978/1830436.003
2017-06-20 16:16:16,629 INFO CopyFiles$ Copying: Z:\I\1978\08\11\1830436.004 to: ./preindex/1978/1830436.004
2017-06-20 16:16:16,644 INFO CopyFiles$ Copying: Z:\I\1978\08\11\1830436.005 to: ./preindex/1978/1830436.005
2017-06-20 16:16:16,644 INFO CopyFiles$ Processing DocNum: 1734510, FileYear: 1978, FileMd: 405, Files: List(Z:\I\1978\04\05\1734510.001, Z:\I\1978\04\05\1734510.002, Z:\I\1978\04\05\1734510.003, Z:\I\1978\04\05\1734510.004, Z:\I\1978\04\05\1734510.005, Z:\I\1978\04\05\1734510.006)
2017-06-20 16:16:16,644 INFO CopyFiles$ Copying: Z:\I\1978\04\05\1734510.001 to: ./preindex/1978/1734510.001
2017-06-20 16:16:16,660 INFO CopyFiles$ Copying: Z:\I\1978\04\05\1734510.002 to: ./preindex/1978/1734510.002
2017-06-20 16:16:16,675 INFO CopyFiles$ Copying: Z:\I\1978\04\05\1734510.003 to: ./preindex/1978/1734510.003
2017-06-20 16:16:16,691 INFO CopyFiles$ Copying: Z:\I\1978\04\05\1734510.004 to: ./preindex/1978/1734510.004
2017-06-20 16:16:16,707 INFO CopyFiles$ Copying: Z:\I\1978\04\05\1734510.005 to: ./preindex/1978/1734510.005
2017-06-20 16:16:16,722 INFO CopyFiles$ Copying: Z:\I\1978\04\05\1734510.006 to: ./preindex/1978/1734510.006
2017-06-20 16:16:16,753 INFO CopyFiles$ Processing DocNum: 1796918, FileYear: 1978, FileMd: 629, Files: List(Z:\I\1978\06\29\1796918.001, Z:\I\1978\06\29\1796918.002)
2017-06-20 16:16:16,753 INFO CopyFiles$ Copying: Z:\I\1978\06\29\1796918.001 to: ./preindex/1978/1796918.001
2017-06-20 16:16:16,769 INFO CopyFiles$ Copying: Z:\I\1978\06\29\1796918.002 to: ./preindex/1978/1796918.002
2017-06-20 16:16:16,769 INFO CopyFiles$ Processing DocNum: 1839181, FileYear: 1978, FileMd: 824, Files: List(Z:\I\1978\08\24\1839181.001, Z:\I\1978\08\24\1839181.002, Z:\I\1978\08\24\1839181.003, Z:\I\1978\08\24\1839181.004)
2017-06-20 16:16:16,769 INFO CopyFiles$ Copying: Z:\I\1978\08\24\1839181.001 to: ./preindex/1978/1839181.001
2017-06-20 16:16:16,785 INFO CopyFiles$ Copying: Z:\I\1978\08\24\1839181.002 to: ./preindex/1978/1839181.002
2017-06-20 16:16:16,785 INFO CopyFiles$ Copying: Z:\I\1978\08\24\1839181.003 to: ./preindex/1978/1839181.003
2017-06-20 16:16:16,800 INFO CopyFiles$ Copying: Z:\I\1978\08\24\1839181.004 to: ./preindex/1978/1839181.004
2017-06-20 16:16:16,800 INFO CopyFiles$ Processing DocNum: 1725243, FileYear: 1978, FileMd: 321, Files: List(Z:\I\1978\03\21\1725243.001, Z:\I\1978\03\21\1725243.002)
2017-06-20 16:16:16,816 INFO CopyFiles$ Copying: Z:\I\1978\03\21\1725243.001 to: ./preindex/1978/1725243.001
2017-06-20 16:16:16,831 INFO CopyFiles$ Copying: Z:\I\1978\03\21\1725243.002 to: ./preindex/1978/1725243.002
2017-06-20 16:16:16,847 INFO CopyFiles$ Processing DocNum: 1884855, FileYear: 1978, FileMd: 1026, Files: List(Z:\I\1978\10\26\1884855.001, Z:\I\1978\10\26\1884855.002, Z:\I\1978\10\26\1884855.003, Z:\I\1978\10\26\1884855.004, Z:\I\1978\10\26\1884855.005)
2017-06-20 16:16:16,847 INFO CopyFiles$ Copying: Z:\I\1978\10\26\1884855.001 to: ./preindex/1978/1884855.001
2017-06-20 16:16:16,863 INFO CopyFiles$ Copying: Z:\I\1978\10\26\1884855.002 to: ./preindex/1978/1884855.002
2017-06-20 16:16:16,863 INFO CopyFiles$ Copying: Z:\I\1978\10\26\1884855.003 to: ./preindex/1978/1884855.003
2017-06-20 16:16:16,878 INFO CopyFiles$ Copying: Z:\I\1978\10\26\1884855.004 to: ./preindex/1978/1884855.004
2017-06-20 16:16:16,894 INFO CopyFiles$ Copying: Z:\I\1978\10\26\1884855.005 to: ./preindex/1978/1884855.005
2017-06-20 16:16:16,894 INFO CopyFiles$ Processing DocNum: 1926514, FileYear: 1978, FileMd: 1229, Files: List(Z:\I\1978\12\29\1926514.001, Z:\I\1978\12\29\1926514.002, Z:\I\1978\12\29\1926514.003)
2017-06-20 16:16:16,894 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1926514.001 to: ./preindex/1978/1926514.001
2017-06-20 16:16:16,925 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1926514.002 to: ./preindex/1978/1926514.002
2017-06-20 16:16:16,925 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1926514.003 to: ./preindex/1978/1926514.003
2017-06-20 16:16:16,941 INFO CopyFiles$ Processing DocNum: 1714366, FileYear: 1978, FileMd: 306, Files: List(Z:\I\1978\03\06\1714366.001, Z:\I\1978\03\06\1714366.002, Z:\I\1978\03\06\1714366.003, Z:\I\1978\03\06\1714366.004, Z:\I\1978\03\06\1714366.005)
2017-06-20 16:16:16,956 INFO CopyFiles$ Copying: Z:\I\1978\03\06\1714366.001 to: ./preindex/1978/1714366.001
2017-06-20 16:16:16,956 INFO CopyFiles$ Copying: Z:\I\1978\03\06\1714366.002 to: ./preindex/1978/1714366.002
2017-06-20 16:16:16,972 INFO CopyFiles$ Copying: Z:\I\1978\03\06\1714366.003 to: ./preindex/1978/1714366.003
2017-06-20 16:16:16,987 INFO CopyFiles$ Copying: Z:\I\1978\03\06\1714366.004 to: ./preindex/1978/1714366.004
2017-06-20 16:16:16,987 INFO CopyFiles$ Copying: Z:\I\1978\03\06\1714366.005 to: ./preindex/1978/1714366.005
2017-06-20 16:16:17,003 INFO CopyFiles$ Processing DocNum: 1749237, FileYear: 1978, FileMd: 425, Files: List(Z:\I\1978\04\25\1749237.001, Z:\I\1978\04\25\1749237.002, Z:\I\1978\04\25\1749237.003)
2017-06-20 16:16:17,019 INFO CopyFiles$ Copying: Z:\I\1978\04\25\1749237.001 to: ./preindex/1978/1749237.001
2017-06-20 16:16:17,019 INFO CopyFiles$ Copying: Z:\I\1978\04\25\1749237.002 to: ./preindex/1978/1749237.002
2017-06-20 16:16:17,034 INFO CopyFiles$ Copying: Z:\I\1978\04\25\1749237.003 to: ./preindex/1978/1749237.003
2017-06-20 16:16:17,034 INFO CopyFiles$ Processing DocNum: 1737252, FileYear: 1978, FileMd: 406, Files: List(Z:\I\1978\04\06\1737252.001, Z:\I\1978\04\06\1737252.002, Z:\I\1978\04\06\1737252.003, Z:\I\1978\04\06\1737252.004)
2017-06-20 16:16:17,034 INFO CopyFiles$ Copying: Z:\I\1978\04\06\1737252.001 to: ./preindex/1978/1737252.001
2017-06-20 16:16:17,050 INFO CopyFiles$ Copying: Z:\I\1978\04\06\1737252.002 to: ./preindex/1978/1737252.002
2017-06-20 16:16:17,065 INFO CopyFiles$ Copying: Z:\I\1978\04\06\1737252.003 to: ./preindex/1978/1737252.003
2017-06-20 16:16:17,081 INFO CopyFiles$ Copying: Z:\I\1978\04\06\1737252.004 to: ./preindex/1978/1737252.004
2017-06-20 16:16:17,097 INFO CopyFiles$ Processing DocNum: 1695366, FileYear: 1978, FileMd: 202, Files: List(Z:\I\1978\02\02\1695366.001, Z:\I\1978\02\02\1695366.002, Z:\I\1978\02\02\1695366.003)
2017-06-20 16:16:17,097 INFO CopyFiles$ Copying: Z:\I\1978\02\02\1695366.001 to: ./preindex/1978/1695366.001
2017-06-20 16:16:17,112 INFO CopyFiles$ Copying: Z:\I\1978\02\02\1695366.002 to: ./preindex/1978/1695366.002
2017-06-20 16:16:17,128 INFO CopyFiles$ Copying: Z:\I\1978\02\02\1695366.003 to: ./preindex/1978/1695366.003
2017-06-20 16:16:17,143 INFO CopyFiles$ Processing DocNum: 1871182, FileYear: 1978, FileMd: 1005, Files: List(Z:\I\1978\10\05\1871182.001, Z:\I\1978\10\05\1871182.002, Z:\I\1978\10\05\1871182.003, Z:\I\1978\10\05\1871182.004)
2017-06-20 16:16:17,159 INFO CopyFiles$ Copying: Z:\I\1978\10\05\1871182.001 to: ./preindex/1978/1871182.001
2017-06-20 16:16:17,175 INFO CopyFiles$ Copying: Z:\I\1978\10\05\1871182.002 to: ./preindex/1978/1871182.002
2017-06-20 16:16:17,190 INFO CopyFiles$ Copying: Z:\I\1978\10\05\1871182.003 to: ./preindex/1978/1871182.003
2017-06-20 16:16:17,190 INFO CopyFiles$ Copying: Z:\I\1978\10\05\1871182.004 to: ./preindex/1978/1871182.004
2017-06-20 16:16:17,221 INFO CopyFiles$ Processing DocNum: 1773307, FileYear: 1978, FileMd: 525, Files: List(Z:\I\1978\05\25\1773307.001, Z:\I\1978\05\25\1773307.002, Z:\I\1978\05\25\1773307.003)
2017-06-20 16:16:17,221 INFO CopyFiles$ Copying: Z:\I\1978\05\25\1773307.001 to: ./preindex/1978/1773307.001
2017-06-20 16:16:17,237 INFO CopyFiles$ Copying: Z:\I\1978\05\25\1773307.002 to: ./preindex/1978/1773307.002
2017-06-20 16:16:17,253 INFO CopyFiles$ Copying: Z:\I\1978\05\25\1773307.003 to: ./preindex/1978/1773307.003
2017-06-20 16:16:17,268 INFO CopyFiles$ Processing DocNum: 1856246, FileYear: 1978, FileMd: 915, Files: List(Z:\I\1978\09\15\1856246.001, Z:\I\1978\09\15\1856246.002, Z:\I\1978\09\15\1856246.003, Z:\I\1978\09\15\1856246.004, Z:\I\1978\09\15\1856246.005)
2017-06-20 16:16:17,268 INFO CopyFiles$ Copying: Z:\I\1978\09\15\1856246.001 to: ./preindex/1978/1856246.001
2017-06-20 16:16:17,299 INFO CopyFiles$ Copying: Z:\I\1978\09\15\1856246.002 to: ./preindex/1978/1856246.002
2017-06-20 16:16:17,315 INFO CopyFiles$ Copying: Z:\I\1978\09\15\1856246.003 to: ./preindex/1978/1856246.003
2017-06-20 16:16:17,315 INFO CopyFiles$ Copying: Z:\I\1978\09\15\1856246.004 to: ./preindex/1978/1856246.004
2017-06-20 16:16:17,331 INFO CopyFiles$ Copying: Z:\I\1978\09\15\1856246.005 to: ./preindex/1978/1856246.005
2017-06-20 16:16:17,346 INFO CopyFiles$ Processing DocNum: 1854501, FileYear: 1978, FileMd: 913, Files: List(Z:\I\1978\09\13\1854501.001, Z:\I\1978\09\13\1854501.002)
2017-06-20 16:16:17,346 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1854501.001 to: ./preindex/1978/1854501.001
2017-06-20 16:16:17,362 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1854501.002 to: ./preindex/1978/1854501.002
2017-06-20 16:16:17,362 INFO CopyFiles$ Processing DocNum: 1688937, FileYear: 1978, FileMd: 124, Files: List(Z:\I\1978\01\24\1688937.001, Z:\I\1978\01\24\1688937.002, Z:\I\1978\01\24\1688937.003, Z:\I\1978\01\24\1688937.004, Z:\I\1978\01\24\1688937.005)
2017-06-20 16:16:17,362 INFO CopyFiles$ Copying: Z:\I\1978\01\24\1688937.001 to: ./preindex/1978/1688937.001
2017-06-20 16:16:17,377 INFO CopyFiles$ Copying: Z:\I\1978\01\24\1688937.002 to: ./preindex/1978/1688937.002
2017-06-20 16:16:17,393 INFO CopyFiles$ Copying: Z:\I\1978\01\24\1688937.003 to: ./preindex/1978/1688937.003
2017-06-20 16:16:17,409 INFO CopyFiles$ Copying: Z:\I\1978\01\24\1688937.004 to: ./preindex/1978/1688937.004
2017-06-20 16:16:17,424 INFO CopyFiles$ Copying: Z:\I\1978\01\24\1688937.005 to: ./preindex/1978/1688937.005
2017-06-20 16:16:17,455 INFO CopyFiles$ Processing DocNum: 1821821, FileYear: 1978, FileMd: 802, Files: List(Z:\I\1978\08\02\1821821.001, Z:\I\1978\08\02\1821821.002, Z:\I\1978\08\02\1821821.003, Z:\I\1978\08\02\1821821.004)
2017-06-20 16:16:17,471 INFO CopyFiles$ Copying: Z:\I\1978\08\02\1821821.001 to: ./preindex/1978/1821821.001
2017-06-20 16:16:17,471 INFO CopyFiles$ Copying: Z:\I\1978\08\02\1821821.002 to: ./preindex/1978/1821821.002
2017-06-20 16:16:17,487 INFO CopyFiles$ Copying: Z:\I\1978\08\02\1821821.003 to: ./preindex/1978/1821821.003
2017-06-20 16:16:17,502 INFO CopyFiles$ Copying: Z:\I\1978\08\02\1821821.004 to: ./preindex/1978/1821821.004
2017-06-20 16:16:17,502 INFO CopyFiles$ Processing DocNum: 1912451, FileYear: 1978, FileMd: 1206, Files: List(Z:\I\1978\12\06\1912451.001, Z:\I\1978\12\06\1912451.002, Z:\I\1978\12\06\1912451.003)
2017-06-20 16:16:17,502 INFO CopyFiles$ Copying: Z:\I\1978\12\06\1912451.001 to: ./preindex/1978/1912451.001
2017-06-20 16:16:17,518 INFO CopyFiles$ Copying: Z:\I\1978\12\06\1912451.002 to: ./preindex/1978/1912451.002
2017-06-20 16:16:17,533 INFO CopyFiles$ Copying: Z:\I\1978\12\06\1912451.003 to: ./preindex/1978/1912451.003
2017-06-20 16:16:17,549 INFO CopyFiles$ Processing DocNum: 1750346, FileYear: 1978, FileMd: 426, Files: List(Z:\I\1978\04\26\1750346.001, Z:\I\1978\04\26\1750346.002, Z:\I\1978\04\26\1750346.003)
2017-06-20 16:16:17,549 INFO CopyFiles$ Copying: Z:\I\1978\04\26\1750346.001 to: ./preindex/1978/1750346.001
2017-06-20 16:16:17,565 INFO CopyFiles$ Copying: Z:\I\1978\04\26\1750346.002 to: ./preindex/1978/1750346.002
2017-06-20 16:16:17,565 INFO CopyFiles$ Copying: Z:\I\1978\04\26\1750346.003 to: ./preindex/1978/1750346.003
2017-06-20 16:16:17,580 INFO CopyFiles$ Processing DocNum: 1787445, FileYear: 1978, FileMd: 615, Files: List(Z:\I\1978\06\15\1787445.001, Z:\I\1978\06\15\1787445.002, Z:\I\1978\06\15\1787445.003, Z:\I\1978\06\15\1787445.004)
2017-06-20 16:16:17,580 INFO CopyFiles$ Copying: Z:\I\1978\06\15\1787445.001 to: ./preindex/1978/1787445.001
2017-06-20 16:16:17,596 INFO CopyFiles$ Copying: Z:\I\1978\06\15\1787445.002 to: ./preindex/1978/1787445.002
2017-06-20 16:16:17,611 INFO CopyFiles$ Copying: Z:\I\1978\06\15\1787445.003 to: ./preindex/1978/1787445.003
2017-06-20 16:16:17,611 INFO CopyFiles$ Copying: Z:\I\1978\06\15\1787445.004 to: ./preindex/1978/1787445.004
2017-06-20 16:16:17,627 INFO CopyFiles$ Processing DocNum: 1728745, FileYear: 1978, FileMd: 324, Files: List(Z:\I\1978\03\24\1728745.001, Z:\I\1978\03\24\1728745.002, Z:\I\1978\03\24\1728745.003)
2017-06-20 16:16:17,643 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1728745.001 to: ./preindex/1978/1728745.001
2017-06-20 16:16:17,658 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1728745.002 to: ./preindex/1978/1728745.002
2017-06-20 16:16:17,674 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1728745.003 to: ./preindex/1978/1728745.003
2017-06-20 16:16:17,689 INFO CopyFiles$ Processing DocNum: 1867555, FileYear: 1978, FileMd: 1002, Files: List(Z:\I\1978\10\02\1867555.001, Z:\I\1978\10\02\1867555.002, Z:\I\1978\10\02\1867555.003, Z:\I\1978\10\02\1867555.004)
2017-06-20 16:16:17,689 INFO CopyFiles$ Copying: Z:\I\1978\10\02\1867555.001 to: ./preindex/1978/1867555.001
2017-06-20 16:16:17,689 INFO CopyFiles$ Copying: Z:\I\1978\10\02\1867555.002 to: ./preindex/1978/1867555.002
2017-06-20 16:16:17,705 INFO CopyFiles$ Copying: Z:\I\1978\10\02\1867555.003 to: ./preindex/1978/1867555.003
2017-06-20 16:16:17,721 INFO CopyFiles$ Copying: Z:\I\1978\10\02\1867555.004 to: ./preindex/1978/1867555.004
2017-06-20 16:16:17,736 INFO CopyFiles$ Processing DocNum: 1681996, FileYear: 1978, FileMd: 112, Files: List(Z:\I\1978\01\12\1681996.001, Z:\I\1978\01\12\1681996.002)
2017-06-20 16:16:17,736 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681996.001 to: ./preindex/1978/1681996.001
2017-06-20 16:16:17,752 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681996.002 to: ./preindex/1978/1681996.002
2017-06-20 16:16:17,783 INFO CopyFiles$ Processing DocNum: 1685624, FileYear: 1978, FileMd: 118, Files: List(Z:\I\1978\01\18\1685624.001, Z:\I\1978\01\18\1685624.002, Z:\I\1978\01\18\1685624.003, Z:\I\1978\01\18\1685624.004)
2017-06-20 16:16:17,783 INFO CopyFiles$ Copying: Z:\I\1978\01\18\1685624.001 to: ./preindex/1978/1685624.001
2017-06-20 16:16:17,799 INFO CopyFiles$ Copying: Z:\I\1978\01\18\1685624.002 to: ./preindex/1978/1685624.002
2017-06-20 16:16:17,830 INFO CopyFiles$ Copying: Z:\I\1978\01\18\1685624.003 to: ./preindex/1978/1685624.003
2017-06-20 16:16:17,845 INFO CopyFiles$ Copying: Z:\I\1978\01\18\1685624.004 to: ./preindex/1978/1685624.004
2017-06-20 16:16:17,861 INFO CopyFiles$ Processing DocNum: 1722161, FileYear: 1978, FileMd: 315, Files: List(Z:\I\1978\03\15\1722161.001, Z:\I\1978\03\15\1722161.002, Z:\I\1978\03\15\1722161.003, Z:\I\1978\03\15\1722161.004)
2017-06-20 16:16:17,877 INFO CopyFiles$ Copying: Z:\I\1978\03\15\1722161.001 to: ./preindex/1978/1722161.001
2017-06-20 16:16:17,892 INFO CopyFiles$ Copying: Z:\I\1978\03\15\1722161.002 to: ./preindex/1978/1722161.002
2017-06-20 16:16:17,892 INFO CopyFiles$ Copying: Z:\I\1978\03\15\1722161.003 to: ./preindex/1978/1722161.003
2017-06-20 16:16:17,908 INFO CopyFiles$ Copying: Z:\I\1978\03\15\1722161.004 to: ./preindex/1978/1722161.004
2017-06-20 16:16:17,908 INFO CopyFiles$ Processing DocNum: 1815384, FileYear: 1978, FileMd: 724, Files: List(Z:\I\1978\07\24\1815384.001, Z:\I\1978\07\24\1815384.002, Z:\I\1978\07\24\1815384.003)
2017-06-20 16:16:17,908 INFO CopyFiles$ Copying: Z:\I\1978\07\24\1815384.001 to: ./preindex/1978/1815384.001
2017-06-20 16:16:17,923 INFO CopyFiles$ Copying: Z:\I\1978\07\24\1815384.002 to: ./preindex/1978/1815384.002
2017-06-20 16:16:17,939 INFO CopyFiles$ Copying: Z:\I\1978\07\24\1815384.003 to: ./preindex/1978/1815384.003
2017-06-20 16:16:17,939 INFO CopyFiles$ Processing DocNum: 1805260, FileYear: 1978, FileMd: 711, Files: List(Z:\I\1978\07\11\1805260.001, Z:\I\1978\07\11\1805260.002)
2017-06-20 16:16:17,939 INFO CopyFiles$ Copying: Z:\I\1978\07\11\1805260.001 to: ./preindex/1978/1805260.001
2017-06-20 16:16:17,955 INFO CopyFiles$ Copying: Z:\I\1978\07\11\1805260.002 to: ./preindex/1978/1805260.002
2017-06-20 16:16:17,986 INFO CopyFiles$ Processing DocNum: 1711995, FileYear: 1978, FileMd: 301, Files: List(Z:\I\1978\03\01\1711995.001, Z:\I\1978\03\01\1711995.002, Z:\I\1978\03\01\1711995.003, Z:\I\1978\03\01\1711995.004)
2017-06-20 16:16:17,986 INFO CopyFiles$ Copying: Z:\I\1978\03\01\1711995.001 to: ./preindex/1978/1711995.001
2017-06-20 16:16:18,017 INFO CopyFiles$ Copying: Z:\I\1978\03\01\1711995.002 to: ./preindex/1978/1711995.002
2017-06-20 16:16:18,017 INFO CopyFiles$ Copying: Z:\I\1978\03\01\1711995.003 to: ./preindex/1978/1711995.003
2017-06-20 16:16:18,033 INFO CopyFiles$ Copying: Z:\I\1978\03\01\1711995.004 to: ./preindex/1978/1711995.004
2017-06-20 16:16:18,048 INFO CopyFiles$ Processing DocNum: 1739798, FileYear: 1978, FileMd: 410, Files: List(Z:\I\1978\04\10\1739798.001, Z:\I\1978\04\10\1739798.002, Z:\I\1978\04\10\1739798.003, Z:\I\1978\04\10\1739798.004, Z:\I\1978\04\10\1739798.005)
2017-06-20 16:16:18,048 INFO CopyFiles$ Copying: Z:\I\1978\04\10\1739798.001 to: ./preindex/1978/1739798.001
2017-06-20 16:16:18,079 INFO CopyFiles$ Copying: Z:\I\1978\04\10\1739798.002 to: ./preindex/1978/1739798.002
2017-06-20 16:16:18,095 INFO CopyFiles$ Copying: Z:\I\1978\04\10\1739798.003 to: ./preindex/1978/1739798.003
2017-06-20 16:16:18,111 INFO CopyFiles$ Copying: Z:\I\1978\04\10\1739798.004 to: ./preindex/1978/1739798.004
2017-06-20 16:16:18,126 INFO CopyFiles$ Copying: Z:\I\1978\04\10\1739798.005 to: ./preindex/1978/1739798.005
2017-06-20 16:16:18,142 INFO CopyFiles$ Processing DocNum: 1869307, FileYear: 1978, FileMd: 1004, Files: List(Z:\I\1978\10\04\1869307.001, Z:\I\1978\10\04\1869307.002, Z:\I\1978\10\04\1869307.003, Z:\I\1978\10\04\1869307.004)
2017-06-20 16:16:18,142 INFO CopyFiles$ Copying: Z:\I\1978\10\04\1869307.001 to: ./preindex/1978/1869307.001
2017-06-20 16:16:18,157 INFO CopyFiles$ Copying: Z:\I\1978\10\04\1869307.002 to: ./preindex/1978/1869307.002
2017-06-20 16:16:18,173 INFO CopyFiles$ Copying: Z:\I\1978\10\04\1869307.003 to: ./preindex/1978/1869307.003
2017-06-20 16:16:18,189 INFO CopyFiles$ Copying: Z:\I\1978\10\04\1869307.004 to: ./preindex/1978/1869307.004
2017-06-20 16:16:18,204 INFO CopyFiles$ Processing DocNum: 1860872, FileYear: 1978, FileMd: 921, Files: List(Z:\I\1978\09\21\1860872.001, Z:\I\1978\09\21\1860872.002, Z:\I\1978\09\21\1860872.003, Z:\I\1978\09\21\1860872.004, Z:\I\1978\09\21\1860872.005, Z:\I\1978\09\21\1860872.006, Z:\I\1978\09\21\1860872.007, Z:\I\1978\09\21\1860872.008, Z:\I\1978\09\21\1860872.009)
2017-06-20 16:16:18,204 INFO CopyFiles$ Copying: Z:\I\1978\09\21\1860872.001 to: ./preindex/1978/1860872.001
2017-06-20 16:16:18,220 INFO CopyFiles$ Copying: Z:\I\1978\09\21\1860872.002 to: ./preindex/1978/1860872.002
2017-06-20 16:16:18,235 INFO CopyFiles$ Copying: Z:\I\1978\09\21\1860872.003 to: ./preindex/1978/1860872.003
2017-06-20 16:16:18,251 INFO CopyFiles$ Copying: Z:\I\1978\09\21\1860872.004 to: ./preindex/1978/1860872.004
2017-06-20 16:16:18,267 INFO CopyFiles$ Copying: Z:\I\1978\09\21\1860872.005 to: ./preindex/1978/1860872.005
2017-06-20 16:16:18,267 INFO CopyFiles$ Copying: Z:\I\1978\09\21\1860872.006 to: ./preindex/1978/1860872.006
2017-06-20 16:16:18,282 INFO CopyFiles$ Copying: Z:\I\1978\09\21\1860872.007 to: ./preindex/1978/1860872.007
2017-06-20 16:16:18,282 INFO CopyFiles$ Copying: Z:\I\1978\09\21\1860872.008 to: ./preindex/1978/1860872.008
2017-06-20 16:16:18,298 INFO CopyFiles$ Copying: Z:\I\1978\09\21\1860872.009 to: ./preindex/1978/1860872.009
2017-06-20 16:16:18,313 INFO CopyFiles$ Processing DocNum: 1790709, FileYear: 1978, FileMd: 620, Files: List(Z:\I\1978\06\20\1790709.001, Z:\I\1978\06\20\1790709.002, Z:\I\1978\06\20\1790709.003, Z:\I\1978\06\20\1790709.004)
2017-06-20 16:16:18,329 INFO CopyFiles$ Copying: Z:\I\1978\06\20\1790709.001 to: ./preindex/1978/1790709.001
2017-06-20 16:16:18,345 INFO CopyFiles$ Copying: Z:\I\1978\06\20\1790709.002 to: ./preindex/1978/1790709.002
2017-06-20 16:16:18,345 INFO CopyFiles$ Copying: Z:\I\1978\06\20\1790709.003 to: ./preindex/1978/1790709.003
2017-06-20 16:16:18,360 INFO CopyFiles$ Copying: Z:\I\1978\06\20\1790709.004 to: ./preindex/1978/1790709.004
2017-06-20 16:16:18,376 INFO CopyFiles$ Processing DocNum: 1907654, FileYear: 1978, FileMd: 1129, Files: List(Z:\I\1978\11\29\1907654.001, Z:\I\1978\11\29\1907654.002, Z:\I\1978\11\29\1907654.003)
2017-06-20 16:16:18,376 INFO CopyFiles$ Copying: Z:\I\1978\11\29\1907654.001 to: ./preindex/1978/1907654.001
2017-06-20 16:16:18,391 INFO CopyFiles$ Copying: Z:\I\1978\11\29\1907654.002 to: ./preindex/1978/1907654.002
2017-06-20 16:16:18,407 INFO CopyFiles$ Copying: Z:\I\1978\11\29\1907654.003 to: ./preindex/1978/1907654.003
2017-06-20 16:16:18,423 INFO CopyFiles$ Processing DocNum: 1842515, FileYear: 1978, FileMd: 829, Files: List(Z:\I\1978\08\29\1842515.001, Z:\I\1978\08\29\1842515.002, Z:\I\1978\08\29\1842515.003)
2017-06-20 16:16:18,438 INFO CopyFiles$ Copying: Z:\I\1978\08\29\1842515.001 to: ./preindex/1978/1842515.001
2017-06-20 16:16:18,454 INFO CopyFiles$ Copying: Z:\I\1978\08\29\1842515.002 to: ./preindex/1978/1842515.002
2017-06-20 16:16:18,469 INFO CopyFiles$ Copying: Z:\I\1978\08\29\1842515.003 to: ./preindex/1978/1842515.003
2017-06-20 16:16:18,501 INFO CopyFiles$ Processing DocNum: 1819721, FileYear: 1978, FileMd: 731, Files: List(Z:\I\1978\07\31\1819721.001, Z:\I\1978\07\31\1819721.002, Z:\I\1978\07\31\1819721.003)
2017-06-20 16:16:18,501 INFO CopyFiles$ Copying: Z:\I\1978\07\31\1819721.001 to: ./preindex/1978/1819721.001
2017-06-20 16:16:18,516 INFO CopyFiles$ Copying: Z:\I\1978\07\31\1819721.002 to: ./preindex/1978/1819721.002
2017-06-20 16:16:18,532 INFO CopyFiles$ Copying: Z:\I\1978\07\31\1819721.003 to: ./preindex/1978/1819721.003
2017-06-20 16:16:18,547 INFO CopyFiles$ Processing DocNum: 1724412, FileYear: 1978, FileMd: 320, Files: List(Z:\I\1978\03\20\1724412.001, Z:\I\1978\03\20\1724412.002, Z:\I\1978\03\20\1724412.003, Z:\I\1978\03\20\1724412.004)
2017-06-20 16:16:18,547 INFO CopyFiles$ Copying: Z:\I\1978\03\20\1724412.001 to: ./preindex/1978/1724412.001
2017-06-20 16:16:18,563 INFO CopyFiles$ Copying: Z:\I\1978\03\20\1724412.002 to: ./preindex/1978/1724412.002
2017-06-20 16:16:18,579 INFO CopyFiles$ Copying: Z:\I\1978\03\20\1724412.003 to: ./preindex/1978/1724412.003
2017-06-20 16:16:18,579 INFO CopyFiles$ Copying: Z:\I\1978\03\20\1724412.004 to: ./preindex/1978/1724412.004
2017-06-20 16:16:18,594 INFO CopyFiles$ Processing DocNum: 1854270, FileYear: 1978, FileMd: 913, Files: List(Z:\I\1978\09\13\1854270.001, Z:\I\1978\09\13\1854270.002, Z:\I\1978\09\13\1854270.003)
2017-06-20 16:16:18,594 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1854270.001 to: ./preindex/1978/1854270.001
2017-06-20 16:16:18,610 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1854270.002 to: ./preindex/1978/1854270.002
2017-06-20 16:16:18,625 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1854270.003 to: ./preindex/1978/1854270.003
2017-06-20 16:16:18,625 INFO CopyFiles$ Processing DocNum: 1678497, FileYear: 1978, FileMd: 106, Files: List(Z:\I\1978\01\06\1678497.001, Z:\I\1978\01\06\1678497.002, Z:\I\1978\01\06\1678497.003)
2017-06-20 16:16:18,641 INFO CopyFiles$ Copying: Z:\I\1978\01\06\1678497.001 to: ./preindex/1978/1678497.001
2017-06-20 16:16:18,657 INFO CopyFiles$ Copying: Z:\I\1978\01\06\1678497.002 to: ./preindex/1978/1678497.002
2017-06-20 16:16:18,672 INFO CopyFiles$ Copying: Z:\I\1978\01\06\1678497.003 to: ./preindex/1978/1678497.003
2017-06-20 16:16:18,703 INFO CopyFiles$ Processing DocNum: 1743082, FileYear: 1978, FileMd: 414, Files: List(Z:\I\1978\04\14\1743082.001, Z:\I\1978\04\14\1743082.002)
2017-06-20 16:16:18,703 INFO CopyFiles$ Copying: Z:\I\1978\04\14\1743082.001 to: ./preindex/1978/1743082.001
2017-06-20 16:16:18,719 INFO CopyFiles$ Copying: Z:\I\1978\04\14\1743082.002 to: ./preindex/1978/1743082.002
2017-06-20 16:16:18,750 INFO CopyFiles$ Processing DocNum: 1851692, FileYear: 1978, FileMd: 911, Files: List(Z:\I\1978\09\11\1851692.001, Z:\I\1978\09\11\1851692.002)
2017-06-20 16:16:18,766 INFO CopyFiles$ Copying: Z:\I\1978\09\11\1851692.001 to: ./preindex/1978/1851692.001
2017-06-20 16:16:18,781 INFO CopyFiles$ Copying: Z:\I\1978\09\11\1851692.002 to: ./preindex/1978/1851692.002
2017-06-20 16:16:18,797 INFO CopyFiles$ Processing DocNum: 1815836, FileYear: 1978, FileMd: 725, Files: List(Z:\I\1978\07\25\1815836.001, Z:\I\1978\07\25\1815836.002)
2017-06-20 16:16:18,797 INFO CopyFiles$ Copying: Z:\I\1978\07\25\1815836.001 to: ./preindex/1978/1815836.001
2017-06-20 16:16:18,828 INFO CopyFiles$ Copying: Z:\I\1978\07\25\1815836.002 to: ./preindex/1978/1815836.002
2017-06-20 16:16:18,828 INFO CopyFiles$ Processing DocNum: 1767368, FileYear: 1978, FileMd: 517, Files: List(Z:\I\1978\05\17\1767368.001, Z:\I\1978\05\17\1767368.002, Z:\I\1978\05\17\1767368.003)
2017-06-20 16:16:18,828 INFO CopyFiles$ Copying: Z:\I\1978\05\17\1767368.001 to: ./preindex/1978/1767368.001
2017-06-20 16:16:18,844 INFO CopyFiles$ Copying: Z:\I\1978\05\17\1767368.002 to: ./preindex/1978/1767368.002
2017-06-20 16:16:18,859 INFO CopyFiles$ Copying: Z:\I\1978\05\17\1767368.003 to: ./preindex/1978/1767368.003
2017-06-20 16:16:18,875 INFO CopyFiles$ Processing DocNum: 1876463, FileYear: 1978, FileMd: 1013, Files: List(Z:\I\1978\10\13\1876463.001, Z:\I\1978\10\13\1876463.002, Z:\I\1978\10\13\1876463.003)
2017-06-20 16:16:18,875 INFO CopyFiles$ Copying: Z:\I\1978\10\13\1876463.001 to: ./preindex/1978/1876463.001
2017-06-20 16:16:18,891 INFO CopyFiles$ Copying: Z:\I\1978\10\13\1876463.002 to: ./preindex/1978/1876463.002
2017-06-20 16:16:18,891 INFO CopyFiles$ Copying: Z:\I\1978\10\13\1876463.003 to: ./preindex/1978/1876463.003
2017-06-20 16:16:18,906 INFO CopyFiles$ Processing DocNum: 1755510, FileYear: 1978, FileMd: 502, Files: List(Z:\I\1978\05\02\1755510.001, Z:\I\1978\05\02\1755510.002, Z:\I\1978\05\02\1755510.003, Z:\I\1978\05\02\1755510.004, Z:\I\1978\05\02\1755510.005)
2017-06-20 16:16:18,906 INFO CopyFiles$ Copying: Z:\I\1978\05\02\1755510.001 to: ./preindex/1978/1755510.001
2017-06-20 16:16:18,906 INFO CopyFiles$ Copying: Z:\I\1978\05\02\1755510.002 to: ./preindex/1978/1755510.002
2017-06-20 16:16:18,922 INFO CopyFiles$ Copying: Z:\I\1978\05\02\1755510.003 to: ./preindex/1978/1755510.003
2017-06-20 16:16:18,922 INFO CopyFiles$ Copying: Z:\I\1978\05\02\1755510.004 to: ./preindex/1978/1755510.004
2017-06-20 16:16:18,922 INFO CopyFiles$ Copying: Z:\I\1978\05\02\1755510.005 to: ./preindex/1978/1755510.005
2017-06-20 16:16:18,937 INFO CopyFiles$ Processing DocNum: 1809197, FileYear: 1978, FileMd: 717, Files: List(Z:\I\1978\07\17\1809197.001, Z:\I\1978\07\17\1809197.002, Z:\I\1978\07\17\1809197.003, Z:\I\1978\07\17\1809197.004)
2017-06-20 16:16:18,937 INFO CopyFiles$ Copying: Z:\I\1978\07\17\1809197.001 to: ./preindex/1978/1809197.001
2017-06-20 16:16:18,937 INFO CopyFiles$ Copying: Z:\I\1978\07\17\1809197.002 to: ./preindex/1978/1809197.002
2017-06-20 16:16:18,953 INFO CopyFiles$ Copying: Z:\I\1978\07\17\1809197.003 to: ./preindex/1978/1809197.003
2017-06-20 16:16:18,969 INFO CopyFiles$ Copying: Z:\I\1978\07\17\1809197.004 to: ./preindex/1978/1809197.004
2017-06-20 16:16:18,969 INFO CopyFiles$ Processing DocNum: 1803036, FileYear: 1978, FileMd: 707, Files: List(Z:\I\1978\07\07\1803036.001, Z:\I\1978\07\07\1803036.002, Z:\I\1978\07\07\1803036.003, Z:\I\1978\07\07\1803036.004)
2017-06-20 16:16:18,969 INFO CopyFiles$ Copying: Z:\I\1978\07\07\1803036.001 to: ./preindex/1978/1803036.001
2017-06-20 16:16:18,984 INFO CopyFiles$ Copying: Z:\I\1978\07\07\1803036.002 to: ./preindex/1978/1803036.002
2017-06-20 16:16:18,984 INFO CopyFiles$ Copying: Z:\I\1978\07\07\1803036.003 to: ./preindex/1978/1803036.003
2017-06-20 16:16:19,000 INFO CopyFiles$ Copying: Z:\I\1978\07\07\1803036.004 to: ./preindex/1978/1803036.004
2017-06-20 16:16:19,000 INFO CopyFiles$ Processing DocNum: 1791812, FileYear: 1978, FileMd: 622, Files: List(Z:\I\1978\06\22\1791812.001, Z:\I\1978\06\22\1791812.002, Z:\I\1978\06\22\1791812.003)
2017-06-20 16:16:19,000 INFO CopyFiles$ Copying: Z:\I\1978\06\22\1791812.001 to: ./preindex/1978/1791812.001
2017-06-20 16:16:19,015 INFO CopyFiles$ Copying: Z:\I\1978\06\22\1791812.002 to: ./preindex/1978/1791812.002
2017-06-20 16:16:19,031 INFO CopyFiles$ Copying: Z:\I\1978\06\22\1791812.003 to: ./preindex/1978/1791812.003
2017-06-20 16:16:19,047 INFO CopyFiles$ Processing DocNum: 1723687, FileYear: 1978, FileMd: 317, Files: List(Z:\I\1978\03\17\1723687.001, Z:\I\1978\03\17\1723687.002, Z:\I\1978\03\17\1723687.003)
2017-06-20 16:16:19,047 INFO CopyFiles$ Copying: Z:\I\1978\03\17\1723687.001 to: ./preindex/1978/1723687.001
2017-06-20 16:16:19,078 INFO CopyFiles$ Copying: Z:\I\1978\03\17\1723687.002 to: ./preindex/1978/1723687.002
2017-06-20 16:16:19,078 INFO CopyFiles$ Copying: Z:\I\1978\03\17\1723687.003 to: ./preindex/1978/1723687.003
2017-06-20 16:16:19,093 INFO CopyFiles$ Processing DocNum: 1797962, FileYear: 1978, FileMd: 630, Files: List(Z:\I\1978\06\30\1797962.001, Z:\I\1978\06\30\1797962.002, Z:\I\1978\06\30\1797962.003, Z:\I\1978\06\30\1797962.004, Z:\I\1978\06\30\1797962.005, Z:\I\1978\06\30\1797962.006, Z:\I\1978\06\30\1797962.007, Z:\I\1978\06\30\1797962.008, Z:\I\1978\06\30\1797962.009, Z:\I\1978\06\30\1797962.010, Z:\I\1978\06\30\1797962.011, Z:\I\1978\06\30\1797962.012, Z:\I\1978\06\30\1797962.013, Z:\I\1978\06\30\1797962.014)
2017-06-20 16:16:19,093 INFO CopyFiles$ Copying: Z:\I\1978\06\30\1797962.001 to: ./preindex/1978/1797962.001
2017-06-20 16:16:19,109 INFO CopyFiles$ Copying: Z:\I\1978\06\30\1797962.002 to: ./preindex/1978/1797962.002
2017-06-20 16:16:19,125 INFO CopyFiles$ Copying: Z:\I\1978\06\30\1797962.003 to: ./preindex/1978/1797962.003
2017-06-20 16:16:19,140 INFO CopyFiles$ Copying: Z:\I\1978\06\30\1797962.004 to: ./preindex/1978/1797962.004
2017-06-20 16:16:19,156 INFO CopyFiles$ Copying: Z:\I\1978\06\30\1797962.005 to: ./preindex/1978/1797962.005
2017-06-20 16:16:19,171 INFO CopyFiles$ Copying: Z:\I\1978\06\30\1797962.006 to: ./preindex/1978/1797962.006
2017-06-20 16:16:19,187 INFO CopyFiles$ Copying: Z:\I\1978\06\30\1797962.007 to: ./preindex/1978/1797962.007
2017-06-20 16:16:19,203 INFO CopyFiles$ Copying: Z:\I\1978\06\30\1797962.008 to: ./preindex/1978/1797962.008
2017-06-20 16:16:19,218 INFO CopyFiles$ Copying: Z:\I\1978\06\30\1797962.009 to: ./preindex/1978/1797962.009
2017-06-20 16:16:19,249 INFO CopyFiles$ Copying: Z:\I\1978\06\30\1797962.010 to: ./preindex/1978/1797962.010
2017-06-20 16:16:19,265 INFO CopyFiles$ Copying: Z:\I\1978\06\30\1797962.011 to: ./preindex/1978/1797962.011
2017-06-20 16:16:19,281 INFO CopyFiles$ Copying: Z:\I\1978\06\30\1797962.012 to: ./preindex/1978/1797962.012
2017-06-20 16:16:19,296 INFO CopyFiles$ Copying: Z:\I\1978\06\30\1797962.013 to: ./preindex/1978/1797962.013
2017-06-20 16:16:19,296 INFO CopyFiles$ Copying: Z:\I\1978\06\30\1797962.014 to: ./preindex/1978/1797962.014
2017-06-20 16:16:19,312 INFO CopyFiles$ Processing DocNum: 1717109, FileYear: 1978, FileMd: 223, Files: List(Z:\I\1978\02\23\1717109.001, Z:\I\1978\02\23\1717109.002)
2017-06-20 16:16:19,312 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1717109.001 to: ./preindex/1978/1717109.001
2017-06-20 16:16:19,327 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1717109.002 to: ./preindex/1978/1717109.002
2017-06-20 16:16:19,359 INFO CopyFiles$ Processing DocNum: 1901117, FileYear: 1978, FileMd: 1117, Files: List(Z:\I\1978\11\17\1901117.001, Z:\I\1978\11\17\1901117.002, Z:\I\1978\11\17\1901117.003)
2017-06-20 16:16:19,359 INFO CopyFiles$ Copying: Z:\I\1978\11\17\1901117.001 to: ./preindex/1978/1901117.001
2017-06-20 16:16:19,374 INFO CopyFiles$ Copying: Z:\I\1978\11\17\1901117.002 to: ./preindex/1978/1901117.002
2017-06-20 16:16:19,374 INFO CopyFiles$ Copying: Z:\I\1978\11\17\1901117.003 to: ./preindex/1978/1901117.003
2017-06-20 16:16:19,390 INFO CopyFiles$ Processing DocNum: 1865755, FileYear: 1978, FileMd: 928, Files: List(Z:\I\1978\09\28\1865755.001, Z:\I\1978\09\28\1865755.002, Z:\I\1978\09\28\1865755.003, Z:\I\1978\09\28\1865755.004, Z:\I\1978\09\28\1865755.005)
2017-06-20 16:16:19,390 INFO CopyFiles$ Copying: Z:\I\1978\09\28\1865755.001 to: ./preindex/1978/1865755.001
2017-06-20 16:16:19,405 INFO CopyFiles$ Copying: Z:\I\1978\09\28\1865755.002 to: ./preindex/1978/1865755.002
2017-06-20 16:16:19,421 INFO CopyFiles$ Copying: Z:\I\1978\09\28\1865755.003 to: ./preindex/1978/1865755.003
2017-06-20 16:16:19,437 INFO CopyFiles$ Copying: Z:\I\1978\09\28\1865755.004 to: ./preindex/1978/1865755.004
2017-06-20 16:16:19,452 INFO CopyFiles$ Copying: Z:\I\1978\09\28\1865755.005 to: ./preindex/1978/1865755.005
2017-06-20 16:16:19,452 INFO CopyFiles$ Processing DocNum: 1712278, FileYear: 1978, FileMd: 301, Files: List(Z:\I\1978\03\01\1712278.001, Z:\I\1978\03\01\1712278.002, Z:\I\1978\03\01\1712278.003, Z:\I\1978\03\01\1712278.004, Z:\I\1978\03\01\1712278.005, Z:\I\1978\03\01\1712278.006, Z:\I\1978\03\01\1712278.007, Z:\I\1978\03\01\1712278.008, Z:\I\1978\03\01\1712278.009)
2017-06-20 16:16:19,452 INFO CopyFiles$ Copying: Z:\I\1978\03\01\1712278.001 to: ./preindex/1978/1712278.001
2017-06-20 16:16:19,483 INFO CopyFiles$ Copying: Z:\I\1978\03\01\1712278.002 to: ./preindex/1978/1712278.002
2017-06-20 16:16:19,483 INFO CopyFiles$ Copying: Z:\I\1978\03\01\1712278.003 to: ./preindex/1978/1712278.003
2017-06-20 16:16:19,499 INFO CopyFiles$ Copying: Z:\I\1978\03\01\1712278.004 to: ./preindex/1978/1712278.004
2017-06-20 16:16:19,530 INFO CopyFiles$ Copying: Z:\I\1978\03\01\1712278.005 to: ./preindex/1978/1712278.005
2017-06-20 16:16:19,546 INFO CopyFiles$ Copying: Z:\I\1978\03\01\1712278.006 to: ./preindex/1978/1712278.006
2017-06-20 16:16:19,546 INFO CopyFiles$ Copying: Z:\I\1978\03\01\1712278.007 to: ./preindex/1978/1712278.007
2017-06-20 16:16:19,561 INFO CopyFiles$ Copying: Z:\I\1978\03\01\1712278.008 to: ./preindex/1978/1712278.008
2017-06-20 16:16:19,577 INFO CopyFiles$ Copying: Z:\I\1978\03\01\1712278.009 to: ./preindex/1978/1712278.009
2017-06-20 16:16:19,593 INFO CopyFiles$ Processing DocNum: 1675410, FileYear: 1978, FileMd: 103, Files: List(Z:\I\1978\01\03\1675410.001, Z:\I\1978\01\03\1675410.002, Z:\I\1978\01\03\1675410.003)
2017-06-20 16:16:19,593 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675410.001 to: ./preindex/1978/1675410.001
2017-06-20 16:16:19,608 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675410.002 to: ./preindex/1978/1675410.002
2017-06-20 16:16:19,608 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675410.003 to: ./preindex/1978/1675410.003
2017-06-20 16:16:19,624 INFO CopyFiles$ Processing DocNum: 1873967, FileYear: 1978, FileMd: 1010, Files: List(Z:\I\1978\10\10\1873967.001, Z:\I\1978\10\10\1873967.002, Z:\I\1978\10\10\1873967.003, Z:\I\1978\10\10\1873967.004, Z:\I\1978\10\10\1873967.005, Z:\I\1978\10\10\1873967.006)
2017-06-20 16:16:19,639 INFO CopyFiles$ Copying: Z:\I\1978\10\10\1873967.001 to: ./preindex/1978/1873967.001
2017-06-20 16:16:19,655 INFO CopyFiles$ Copying: Z:\I\1978\10\10\1873967.002 to: ./preindex/1978/1873967.002
2017-06-20 16:16:19,671 INFO CopyFiles$ Copying: Z:\I\1978\10\10\1873967.003 to: ./preindex/1978/1873967.003
2017-06-20 16:16:19,686 INFO CopyFiles$ Copying: Z:\I\1978\10\10\1873967.004 to: ./preindex/1978/1873967.004
2017-06-20 16:16:19,702 INFO CopyFiles$ Copying: Z:\I\1978\10\10\1873967.005 to: ./preindex/1978/1873967.005
2017-06-20 16:16:19,717 INFO CopyFiles$ Copying: Z:\I\1978\10\10\1873967.006 to: ./preindex/1978/1873967.006
2017-06-20 16:16:19,733 INFO CopyFiles$ Processing DocNum: 1920952, FileYear: 1978, FileMd: 1219, Files: List(Z:\I\1978\12\19\1920952.001, Z:\I\1978\12\19\1920952.002, Z:\I\1978\12\19\1920952.003, Z:\I\1978\12\19\1920952.004, Z:\I\1978\12\19\1920952.005, Z:\I\1978\12\19\1920952.006, Z:\I\1978\12\19\1920952.007, Z:\I\1978\12\19\1920952.008, Z:\I\1978\12\19\1920952.009)
2017-06-20 16:16:19,733 INFO CopyFiles$ Copying: Z:\I\1978\12\19\1920952.001 to: ./preindex/1978/1920952.001
2017-06-20 16:16:19,749 INFO CopyFiles$ Copying: Z:\I\1978\12\19\1920952.002 to: ./preindex/1978/1920952.002
2017-06-20 16:16:19,764 INFO CopyFiles$ Copying: Z:\I\1978\12\19\1920952.003 to: ./preindex/1978/1920952.003
2017-06-20 16:16:19,780 INFO CopyFiles$ Copying: Z:\I\1978\12\19\1920952.004 to: ./preindex/1978/1920952.004
2017-06-20 16:16:19,780 INFO CopyFiles$ Copying: Z:\I\1978\12\19\1920952.005 to: ./preindex/1978/1920952.005
2017-06-20 16:16:19,795 INFO CopyFiles$ Copying: Z:\I\1978\12\19\1920952.006 to: ./preindex/1978/1920952.006
2017-06-20 16:16:19,811 INFO CopyFiles$ Copying: Z:\I\1978\12\19\1920952.007 to: ./preindex/1978/1920952.007
2017-06-20 16:16:19,811 INFO CopyFiles$ Copying: Z:\I\1978\12\19\1920952.008 to: ./preindex/1978/1920952.008
2017-06-20 16:16:19,827 INFO CopyFiles$ Copying: Z:\I\1978\12\19\1920952.009 to: ./preindex/1978/1920952.009
2017-06-20 16:16:19,842 INFO CopyFiles$ Processing DocNum: 1729802, FileYear: 1978, FileMd: 328, Files: List(Z:\I\1978\03\28\1729802.001, Z:\I\1978\03\28\1729802.002, Z:\I\1978\03\28\1729802.003)
2017-06-20 16:16:19,842 INFO CopyFiles$ Copying: Z:\I\1978\03\28\1729802.001 to: ./preindex/1978/1729802.001
2017-06-20 16:16:19,858 INFO CopyFiles$ Copying: Z:\I\1978\03\28\1729802.002 to: ./preindex/1978/1729802.002
2017-06-20 16:16:19,858 INFO CopyFiles$ Copying: Z:\I\1978\03\28\1729802.003 to: ./preindex/1978/1729802.003
2017-06-20 16:16:19,873 INFO CopyFiles$ Processing DocNum: 1920329, FileYear: 1978, FileMd: 1218, Files: List(Z:\I\1978\12\18\1920329.001, Z:\I\1978\12\18\1920329.002, Z:\I\1978\12\18\1920329.003, Z:\I\1978\12\18\1920329.004)
2017-06-20 16:16:19,873 INFO CopyFiles$ Copying: Z:\I\1978\12\18\1920329.001 to: ./preindex/1978/1920329.001
2017-06-20 16:16:19,889 INFO CopyFiles$ Copying: Z:\I\1978\12\18\1920329.002 to: ./preindex/1978/1920329.002
2017-06-20 16:16:19,905 INFO CopyFiles$ Copying: Z:\I\1978\12\18\1920329.003 to: ./preindex/1978/1920329.003
2017-06-20 16:16:19,920 INFO CopyFiles$ Copying: Z:\I\1978\12\18\1920329.004 to: ./preindex/1978/1920329.004
2017-06-20 16:16:19,936 INFO CopyFiles$ Processing DocNum: 1821709, FileYear: 1978, FileMd: 802, Files: List(Z:\I\1978\08\02\1821709.001, Z:\I\1978\08\02\1821709.002, Z:\I\1978\08\02\1821709.003, Z:\I\1978\08\02\1821709.004, Z:\I\1978\08\02\1821709.005, Z:\I\1978\08\02\1821709.006)
2017-06-20 16:16:19,936 INFO CopyFiles$ Copying: Z:\I\1978\08\02\1821709.001 to: ./preindex/1978/1821709.001
2017-06-20 16:16:19,967 INFO CopyFiles$ Copying: Z:\I\1978\08\02\1821709.002 to: ./preindex/1978/1821709.002
2017-06-20 16:16:19,967 INFO CopyFiles$ Copying: Z:\I\1978\08\02\1821709.003 to: ./preindex/1978/1821709.003
2017-06-20 16:16:19,983 INFO CopyFiles$ Copying: Z:\I\1978\08\02\1821709.004 to: ./preindex/1978/1821709.004
2017-06-20 16:16:19,998 INFO CopyFiles$ Copying: Z:\I\1978\08\02\1821709.005 to: ./preindex/1978/1821709.005
2017-06-20 16:16:20,014 INFO CopyFiles$ Copying: Z:\I\1978\08\02\1821709.006 to: ./preindex/1978/1821709.006
2017-06-20 16:16:20,045 INFO CopyFiles$ Processing DocNum: 1711501, FileYear: 1978, FileMd: 228, Files: List(Z:\I\1978\02\28\1711501.001, Z:\I\1978\02\28\1711501.002, Z:\I\1978\02\28\1711501.003)
2017-06-20 16:16:20,045 INFO CopyFiles$ Copying: Z:\I\1978\02\28\1711501.001 to: ./preindex/1978/1711501.001
2017-06-20 16:16:20,061 INFO CopyFiles$ Copying: Z:\I\1978\02\28\1711501.002 to: ./preindex/1978/1711501.002
2017-06-20 16:16:20,076 INFO CopyFiles$ Copying: Z:\I\1978\02\28\1711501.003 to: ./preindex/1978/1711501.003
2017-06-20 16:16:20,092 INFO CopyFiles$ Processing DocNum: 1697507, FileYear: 1978, FileMd: 207, Files: List(Z:\I\1978\02\07\1697507.001, Z:\I\1978\02\07\1697507.002)
2017-06-20 16:16:20,092 INFO CopyFiles$ Copying: Z:\I\1978\02\07\1697507.001 to: ./preindex/1978/1697507.001
2017-06-20 16:16:20,107 INFO CopyFiles$ Copying: Z:\I\1978\02\07\1697507.002 to: ./preindex/1978/1697507.002
2017-06-20 16:16:20,123 INFO CopyFiles$ Processing DocNum: 1826413, FileYear: 1978, FileMd: 807, Files: List(Z:\I\1978\08\07\1826413.001, Z:\I\1978\08\07\1826413.002, Z:\I\1978\08\07\1826413.003, Z:\I\1978\08\07\1826413.004)
2017-06-20 16:16:20,123 INFO CopyFiles$ Copying: Z:\I\1978\08\07\1826413.001 to: ./preindex/1978/1826413.001
2017-06-20 16:16:20,139 INFO CopyFiles$ Copying: Z:\I\1978\08\07\1826413.002 to: ./preindex/1978/1826413.002
2017-06-20 16:16:20,154 INFO CopyFiles$ Copying: Z:\I\1978\08\07\1826413.003 to: ./preindex/1978/1826413.003
2017-06-20 16:16:20,154 INFO CopyFiles$ Copying: Z:\I\1978\08\07\1826413.004 to: ./preindex/1978/1826413.004
2017-06-20 16:16:20,170 INFO CopyFiles$ Processing DocNum: 1793339, FileYear: 1978, FileMd: 623, Files: List(Z:\I\1978\06\23\1793339.001, Z:\I\1978\06\23\1793339.002, Z:\I\1978\06\23\1793339.003)
2017-06-20 16:16:20,170 INFO CopyFiles$ Copying: Z:\I\1978\06\23\1793339.001 to: ./preindex/1978/1793339.001
2017-06-20 16:16:20,185 INFO CopyFiles$ Copying: Z:\I\1978\06\23\1793339.002 to: ./preindex/1978/1793339.002
2017-06-20 16:16:20,185 INFO CopyFiles$ Copying: Z:\I\1978\06\23\1793339.003 to: ./preindex/1978/1793339.003
2017-06-20 16:16:20,201 INFO CopyFiles$ Processing DocNum: 1675413, FileYear: 1978, FileMd: 103, Files: List(Z:\I\1978\01\03\1675413.001, Z:\I\1978\01\03\1675413.002, Z:\I\1978\01\03\1675413.003)
2017-06-20 16:16:20,201 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675413.001 to: ./preindex/1978/1675413.001
2017-06-20 16:16:20,217 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675413.002 to: ./preindex/1978/1675413.002
2017-06-20 16:16:20,232 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675413.003 to: ./preindex/1978/1675413.003
2017-06-20 16:16:20,248 INFO CopyFiles$ Processing DocNum: 1849834, FileYear: 1978, FileMd: 907, Files: List(Z:\I\1978\09\07\1849834.001, Z:\I\1978\09\07\1849834.002, Z:\I\1978\09\07\1849834.003, Z:\I\1978\09\07\1849834.004)
2017-06-20 16:16:20,248 INFO CopyFiles$ Copying: Z:\I\1978\09\07\1849834.001 to: ./preindex/1978/1849834.001
2017-06-20 16:16:20,263 INFO CopyFiles$ Copying: Z:\I\1978\09\07\1849834.002 to: ./preindex/1978/1849834.002
2017-06-20 16:16:20,279 INFO CopyFiles$ Copying: Z:\I\1978\09\07\1849834.003 to: ./preindex/1978/1849834.003
2017-06-20 16:16:20,295 INFO CopyFiles$ Copying: Z:\I\1978\09\07\1849834.004 to: ./preindex/1978/1849834.004
2017-06-20 16:16:20,310 INFO CopyFiles$ Processing DocNum: 1687220, FileYear: 1978, FileMd: 120, Files: List(Z:\I\1978\01\20\1687220.001, Z:\I\1978\01\20\1687220.002, Z:\I\1978\01\20\1687220.003)
2017-06-20 16:16:20,310 INFO CopyFiles$ Copying: Z:\I\1978\01\20\1687220.001 to: ./preindex/1978/1687220.001
2017-06-20 16:16:20,341 INFO CopyFiles$ Copying: Z:\I\1978\01\20\1687220.002 to: ./preindex/1978/1687220.002
2017-06-20 16:16:20,341 INFO CopyFiles$ Copying: Z:\I\1978\01\20\1687220.003 to: ./preindex/1978/1687220.003
2017-06-20 16:16:20,357 INFO CopyFiles$ Processing DocNum: 1721191, FileYear: 1978, FileMd: 314, Files: List(Z:\I\1978\03\14\1721191.001, Z:\I\1978\03\14\1721191.002, Z:\I\1978\03\14\1721191.003)
2017-06-20 16:16:20,373 INFO CopyFiles$ Copying: Z:\I\1978\03\14\1721191.001 to: ./preindex/1978/1721191.001
2017-06-20 16:16:20,388 INFO CopyFiles$ Copying: Z:\I\1978\03\14\1721191.002 to: ./preindex/1978/1721191.002
2017-06-20 16:16:20,419 INFO CopyFiles$ Copying: Z:\I\1978\03\14\1721191.003 to: ./preindex/1978/1721191.003
2017-06-20 16:16:20,451 INFO CopyFiles$ Processing DocNum: 1715853, FileYear: 1978, FileMd: 307, Files: List(Z:\I\1978\03\07\1715853.001, Z:\I\1978\03\07\1715853.002, Z:\I\1978\03\07\1715853.003)
2017-06-20 16:16:20,451 INFO CopyFiles$ Copying: Z:\I\1978\03\07\1715853.001 to: ./preindex/1978/1715853.001
2017-06-20 16:16:20,466 INFO CopyFiles$ Copying: Z:\I\1978\03\07\1715853.002 to: ./preindex/1978/1715853.002
2017-06-20 16:16:20,466 INFO CopyFiles$ Copying: Z:\I\1978\03\07\1715853.003 to: ./preindex/1978/1715853.003
2017-06-20 16:16:20,497 INFO CopyFiles$ Processing DocNum: 1763433, FileYear: 1978, FileMd: 511, Files: List(Z:\I\1978\05\11\1763433.001, Z:\I\1978\05\11\1763433.002)
2017-06-20 16:16:20,497 INFO CopyFiles$ Copying: Z:\I\1978\05\11\1763433.001 to: ./preindex/1978/1763433.001
2017-06-20 16:16:20,529 INFO CopyFiles$ Copying: Z:\I\1978\05\11\1763433.002 to: ./preindex/1978/1763433.002
2017-06-20 16:16:20,560 INFO CopyFiles$ Processing DocNum: 1707382, FileYear: 1978, FileMd: 222, Files: List(Z:\I\1978\02\22\1707382.001, Z:\I\1978\02\22\1707382.002, Z:\I\1978\02\22\1707382.003)
2017-06-20 16:16:20,560 INFO CopyFiles$ Copying: Z:\I\1978\02\22\1707382.001 to: ./preindex/1978/1707382.001
2017-06-20 16:16:20,575 INFO CopyFiles$ Copying: Z:\I\1978\02\22\1707382.002 to: ./preindex/1978/1707382.002
2017-06-20 16:16:20,576 INFO CopyFiles$ Copying: Z:\I\1978\02\22\1707382.003 to: ./preindex/1978/1707382.003
2017-06-20 16:16:20,597 INFO CopyFiles$ Processing DocNum: 1768644, FileYear: 1978, FileMd: 518, Files: List(Z:\I\1978\05\18\1768644.001, Z:\I\1978\05\18\1768644.002)
2017-06-20 16:16:20,617 INFO CopyFiles$ Copying: Z:\I\1978\05\18\1768644.001 to: ./preindex/1978/1768644.001
2017-06-20 16:16:20,627 INFO CopyFiles$ Copying: Z:\I\1978\05\18\1768644.002 to: ./preindex/1978/1768644.002
2017-06-20 16:16:20,647 INFO CopyFiles$ Processing DocNum: 1694259, FileYear: 1978, FileMd: 201, Files: List(Z:\I\1978\02\01\1694259.001, Z:\I\1978\02\01\1694259.002, Z:\I\1978\02\01\1694259.003)
2017-06-20 16:16:20,657 INFO CopyFiles$ Copying: Z:\I\1978\02\01\1694259.001 to: ./preindex/1978/1694259.001
2017-06-20 16:16:20,683 INFO CopyFiles$ Copying: Z:\I\1978\02\01\1694259.002 to: ./preindex/1978/1694259.002
2017-06-20 16:16:20,714 INFO CopyFiles$ Copying: Z:\I\1978\02\01\1694259.003 to: ./preindex/1978/1694259.003
2017-06-20 16:16:20,730 INFO CopyFiles$ Processing DocNum: 1900609, FileYear: 1978, FileMd: 1116, Files: List(Z:\I\1978\11\16\1900609.001, Z:\I\1978\11\16\1900609.002, Z:\I\1978\11\16\1900609.003)
2017-06-20 16:16:20,730 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900609.001 to: ./preindex/1978/1900609.001
2017-06-20 16:16:20,745 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900609.002 to: ./preindex/1978/1900609.002
2017-06-20 16:16:20,777 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900609.003 to: ./preindex/1978/1900609.003
2017-06-20 16:16:20,777 INFO CopyFiles$ Processing DocNum: 1905692, FileYear: 1978, FileMd: 1127, Files: List(Z:\I\1978\11\27\1905692.001, Z:\I\1978\11\27\1905692.002, Z:\I\1978\11\27\1905692.003)
2017-06-20 16:16:20,777 INFO CopyFiles$ Copying: Z:\I\1978\11\27\1905692.001 to: ./preindex/1978/1905692.001
2017-06-20 16:16:20,792 INFO CopyFiles$ Copying: Z:\I\1978\11\27\1905692.002 to: ./preindex/1978/1905692.002
2017-06-20 16:16:20,808 INFO CopyFiles$ Copying: Z:\I\1978\11\27\1905692.003 to: ./preindex/1978/1905692.003
2017-06-20 16:16:20,823 INFO CopyFiles$ Processing DocNum: 1828171, FileYear: 1978, FileMd: 809, Files: List(Z:\I\1978\08\09\1828171.001, Z:\I\1978\08\09\1828171.002, Z:\I\1978\08\09\1828171.003)
2017-06-20 16:16:20,823 INFO CopyFiles$ Copying: Z:\I\1978\08\09\1828171.001 to: ./preindex/1978/1828171.001
2017-06-20 16:16:20,839 INFO CopyFiles$ Copying: Z:\I\1978\08\09\1828171.002 to: ./preindex/1978/1828171.002
2017-06-20 16:16:20,855 INFO CopyFiles$ Copying: Z:\I\1978\08\09\1828171.003 to: ./preindex/1978/1828171.003
2017-06-20 16:16:20,886 INFO CopyFiles$ Processing DocNum: 1744777, FileYear: 1978, FileMd: 418, Files: List(Z:\I\1978\04\18\1744777.001, Z:\I\1978\04\18\1744777.002)
2017-06-20 16:16:20,901 INFO CopyFiles$ Copying: Z:\I\1978\04\18\1744777.001 to: ./preindex/1978/1744777.001
2017-06-20 16:16:20,901 INFO CopyFiles$ Copying: Z:\I\1978\04\18\1744777.002 to: ./preindex/1978/1744777.002
2017-06-20 16:16:20,917 INFO CopyFiles$ Processing DocNum: 1782919, FileYear: 1978, FileMd: 609, Files: List(Z:\I\1978\06\09\1782919.001, Z:\I\1978\06\09\1782919.002, Z:\I\1978\06\09\1782919.003)
2017-06-20 16:16:20,933 INFO CopyFiles$ Copying: Z:\I\1978\06\09\1782919.001 to: ./preindex/1978/1782919.001
2017-06-20 16:16:20,933 INFO CopyFiles$ Copying: Z:\I\1978\06\09\1782919.002 to: ./preindex/1978/1782919.002
2017-06-20 16:16:20,948 INFO CopyFiles$ Copying: Z:\I\1978\06\09\1782919.003 to: ./preindex/1978/1782919.003
2017-06-20 16:16:20,964 INFO CopyFiles$ Processing DocNum: 1883006, FileYear: 1978, FileMd: 1023, Files: List(Z:\I\1978\10\23\1883006.001, Z:\I\1978\10\23\1883006.002, Z:\I\1978\10\23\1883006.003)
2017-06-20 16:16:20,964 INFO CopyFiles$ Copying: Z:\I\1978\10\23\1883006.001 to: ./preindex/1978/1883006.001
2017-06-20 16:16:20,979 INFO CopyFiles$ Copying: Z:\I\1978\10\23\1883006.002 to: ./preindex/1978/1883006.002
2017-06-20 16:16:20,995 INFO CopyFiles$ Copying: Z:\I\1978\10\23\1883006.003 to: ./preindex/1978/1883006.003
2017-06-20 16:16:21,011 INFO CopyFiles$ Processing DocNum: 1799744, FileYear: 1978, FileMd: 703, Files: List(Z:\I\1978\07\03\1799744.001, Z:\I\1978\07\03\1799744.002, Z:\I\1978\07\03\1799744.003, Z:\I\1978\07\03\1799744.004)
2017-06-20 16:16:21,011 INFO CopyFiles$ Copying: Z:\I\1978\07\03\1799744.001 to: ./preindex/1978/1799744.001
2017-06-20 16:16:21,026 INFO CopyFiles$ Copying: Z:\I\1978\07\03\1799744.002 to: ./preindex/1978/1799744.002
2017-06-20 16:16:21,042 INFO CopyFiles$ Copying: Z:\I\1978\07\03\1799744.003 to: ./preindex/1978/1799744.003
2017-06-20 16:16:21,042 INFO CopyFiles$ Copying: Z:\I\1978\07\03\1799744.004 to: ./preindex/1978/1799744.004
2017-06-20 16:16:21,073 INFO CopyFiles$ Processing DocNum: 1785495, FileYear: 1978, FileMd: 613, Files: List(Z:\I\1978\06\13\1785495.001, Z:\I\1978\06\13\1785495.002, Z:\I\1978\06\13\1785495.003)
2017-06-20 16:16:21,073 INFO CopyFiles$ Copying: Z:\I\1978\06\13\1785495.001 to: ./preindex/1978/1785495.001
2017-06-20 16:16:21,104 INFO CopyFiles$ Copying: Z:\I\1978\06\13\1785495.002 to: ./preindex/1978/1785495.002
2017-06-20 16:16:21,120 INFO CopyFiles$ Copying: Z:\I\1978\06\13\1785495.003 to: ./preindex/1978/1785495.003
2017-06-20 16:16:21,135 INFO CopyFiles$ Processing DocNum: 1867787, FileYear: 1978, FileMd: 1002, Files: List(Z:\I\1978\10\02\1867787.001, Z:\I\1978\10\02\1867787.002, Z:\I\1978\10\02\1867787.003)
2017-06-20 16:16:21,135 INFO CopyFiles$ Copying: Z:\I\1978\10\02\1867787.001 to: ./preindex/1978/1867787.001
2017-06-20 16:16:21,182 INFO CopyFiles$ Copying: Z:\I\1978\10\02\1867787.002 to: ./preindex/1978/1867787.002
2017-06-20 16:16:21,198 INFO CopyFiles$ Copying: Z:\I\1978\10\02\1867787.003 to: ./preindex/1978/1867787.003
2017-06-20 16:16:21,198 INFO CopyFiles$ Processing DocNum: 1688956, FileYear: 1978, FileMd: 124, Files: List(Z:\I\1978\01\24\1688956.001, Z:\I\1978\01\24\1688956.002, Z:\I\1978\01\24\1688956.003)
2017-06-20 16:16:21,198 INFO CopyFiles$ Copying: Z:\I\1978\01\24\1688956.001 to: ./preindex/1978/1688956.001
2017-06-20 16:16:21,213 INFO CopyFiles$ Copying: Z:\I\1978\01\24\1688956.002 to: ./preindex/1978/1688956.002
2017-06-20 16:16:21,245 INFO CopyFiles$ Copying: Z:\I\1978\01\24\1688956.003 to: ./preindex/1978/1688956.003
2017-06-20 16:16:21,260 INFO CopyFiles$ Processing DocNum: 1682757, FileYear: 1978, FileMd: 113, Files: List(Z:\I\1978\01\13\1682757.001, Z:\I\1978\01\13\1682757.002, Z:\I\1978\01\13\1682757.003, Z:\I\1978\01\13\1682757.004, Z:\I\1978\01\13\1682757.005)
2017-06-20 16:16:21,276 INFO CopyFiles$ Copying: Z:\I\1978\01\13\1682757.001 to: ./preindex/1978/1682757.001
2017-06-20 16:16:21,291 INFO CopyFiles$ Copying: Z:\I\1978\01\13\1682757.002 to: ./preindex/1978/1682757.002
2017-06-20 16:16:21,307 INFO CopyFiles$ Copying: Z:\I\1978\01\13\1682757.003 to: ./preindex/1978/1682757.003
2017-06-20 16:16:21,323 INFO CopyFiles$ Copying: Z:\I\1978\01\13\1682757.004 to: ./preindex/1978/1682757.004
2017-06-20 16:16:21,323 INFO CopyFiles$ Copying: Z:\I\1978\01\13\1682757.005 to: ./preindex/1978/1682757.005
2017-06-20 16:16:21,338 INFO CopyFiles$ Processing DocNum: 1881065, FileYear: 1978, FileMd: 1020, Files: List(Z:\I\1978\10\20\1881065.001, Z:\I\1978\10\20\1881065.002, Z:\I\1978\10\20\1881065.003, Z:\I\1978\10\20\1881065.004, Z:\I\1978\10\20\1881065.005, Z:\I\1978\10\20\1881065.006, Z:\I\1978\10\20\1881065.007, Z:\I\1978\10\20\1881065.008, Z:\I\1978\10\20\1881065.009, Z:\I\1978\10\20\1881065.010, Z:\I\1978\10\20\1881065.011, Z:\I\1978\10\20\1881065.012)
2017-06-20 16:16:21,338 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.001 to: ./preindex/1978/1881065.001
2017-06-20 16:16:21,354 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.002 to: ./preindex/1978/1881065.002
2017-06-20 16:16:21,354 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.003 to: ./preindex/1978/1881065.003
2017-06-20 16:16:21,354 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.004 to: ./preindex/1978/1881065.004
2017-06-20 16:16:21,369 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.005 to: ./preindex/1978/1881065.005
2017-06-20 16:16:21,369 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.006 to: ./preindex/1978/1881065.006
2017-06-20 16:16:21,385 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.007 to: ./preindex/1978/1881065.007
2017-06-20 16:16:21,385 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.008 to: ./preindex/1978/1881065.008
2017-06-20 16:16:21,385 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.009 to: ./preindex/1978/1881065.009
2017-06-20 16:16:21,401 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.010 to: ./preindex/1978/1881065.010
2017-06-20 16:16:21,401 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.011 to: ./preindex/1978/1881065.011
2017-06-20 16:16:21,416 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.012 to: ./preindex/1978/1881065.012
2017-06-20 16:16:21,432 INFO CopyFiles$ Processing DocNum: 1898518, FileYear: 1978, FileMd: 1114, Files: List(Z:\I\1978\11\14\1898518.001, Z:\I\1978\11\14\1898518.002, Z:\I\1978\11\14\1898518.003, Z:\I\1978\11\14\1898518.004, Z:\I\1978\11\14\1898518.005, Z:\I\1978\11\14\1898518.006)
2017-06-20 16:16:21,432 INFO CopyFiles$ Copying: Z:\I\1978\11\14\1898518.001 to: ./preindex/1978/1898518.001
2017-06-20 16:16:21,447 INFO CopyFiles$ Copying: Z:\I\1978\11\14\1898518.002 to: ./preindex/1978/1898518.002
2017-06-20 16:16:21,447 INFO CopyFiles$ Copying: Z:\I\1978\11\14\1898518.003 to: ./preindex/1978/1898518.003
2017-06-20 16:16:21,463 INFO CopyFiles$ Copying: Z:\I\1978\11\14\1898518.004 to: ./preindex/1978/1898518.004
2017-06-20 16:16:21,463 INFO CopyFiles$ Copying: Z:\I\1978\11\14\1898518.005 to: ./preindex/1978/1898518.005
2017-06-20 16:16:21,463 INFO CopyFiles$ Copying: Z:\I\1978\11\14\1898518.006 to: ./preindex/1978/1898518.006
2017-06-20 16:16:21,479 INFO CopyFiles$ Processing DocNum: 1775637, FileYear: 1978, FileMd: 531, Files: List(Z:\I\1978\05\31\1775637.001, Z:\I\1978\05\31\1775637.002)
2017-06-20 16:16:21,479 INFO CopyFiles$ Copying: Z:\I\1978\05\31\1775637.001 to: ./preindex/1978/1775637.001
2017-06-20 16:16:21,494 INFO CopyFiles$ Copying: Z:\I\1978\05\31\1775637.002 to: ./preindex/1978/1775637.002
2017-06-20 16:16:21,510 INFO CopyFiles$ Processing DocNum: 1700482, FileYear: 1978, FileMd: 210, Files: List(Z:\I\1978\02\10\1700482.001, Z:\I\1978\02\10\1700482.002, Z:\I\1978\02\10\1700482.003, Z:\I\1978\02\10\1700482.004, Z:\I\1978\02\10\1700482.005, Z:\I\1978\02\10\1700482.006)
2017-06-20 16:16:21,510 INFO CopyFiles$ Copying: Z:\I\1978\02\10\1700482.001 to: ./preindex/1978/1700482.001
2017-06-20 16:16:21,525 INFO CopyFiles$ Copying: Z:\I\1978\02\10\1700482.002 to: ./preindex/1978/1700482.002
2017-06-20 16:16:21,525 INFO CopyFiles$ Copying: Z:\I\1978\02\10\1700482.003 to: ./preindex/1978/1700482.003
2017-06-20 16:16:21,525 INFO CopyFiles$ Copying: Z:\I\1978\02\10\1700482.004 to: ./preindex/1978/1700482.004
2017-06-20 16:16:21,541 INFO CopyFiles$ Copying: Z:\I\1978\02\10\1700482.005 to: ./preindex/1978/1700482.005
2017-06-20 16:16:21,541 INFO CopyFiles$ Copying: Z:\I\1978\02\10\1700482.006 to: ./preindex/1978/1700482.006
2017-06-20 16:16:21,557 INFO CopyFiles$ Processing DocNum: 1702238, FileYear: 1978, FileMd: 214, Files: List(Z:\I\1978\02\14\1702238.001, Z:\I\1978\02\14\1702238.002, Z:\I\1978\02\14\1702238.003, Z:\I\1978\02\14\1702238.004, Z:\I\1978\02\14\1702238.005, Z:\I\1978\02\14\1702238.006, Z:\I\1978\02\14\1702238.007)
2017-06-20 16:16:21,557 INFO CopyFiles$ Copying: Z:\I\1978\02\14\1702238.001 to: ./preindex/1978/1702238.001
2017-06-20 16:16:21,572 INFO CopyFiles$ Copying: Z:\I\1978\02\14\1702238.002 to: ./preindex/1978/1702238.002
2017-06-20 16:16:21,588 INFO CopyFiles$ Copying: Z:\I\1978\02\14\1702238.003 to: ./preindex/1978/1702238.003
2017-06-20 16:16:21,603 INFO CopyFiles$ Copying: Z:\I\1978\02\14\1702238.004 to: ./preindex/1978/1702238.004
2017-06-20 16:16:21,619 INFO CopyFiles$ Copying: Z:\I\1978\02\14\1702238.005 to: ./preindex/1978/1702238.005
2017-06-20 16:16:21,635 INFO CopyFiles$ Copying: Z:\I\1978\02\14\1702238.006 to: ./preindex/1978/1702238.006
2017-06-20 16:16:21,635 INFO CopyFiles$ Copying: Z:\I\1978\02\14\1702238.007 to: ./preindex/1978/1702238.007
2017-06-20 16:16:21,650 INFO CopyFiles$ Processing DocNum: 1865561, FileYear: 1978, FileMd: 928, Files: List(Z:\I\1978\09\28\1865561.001, Z:\I\1978\09\28\1865561.002)
2017-06-20 16:16:21,650 INFO CopyFiles$ Copying: Z:\I\1978\09\28\1865561.001 to: ./preindex/1978/1865561.001
2017-06-20 16:16:21,666 INFO CopyFiles$ Copying: Z:\I\1978\09\28\1865561.002 to: ./preindex/1978/1865561.002
2017-06-20 16:16:21,681 INFO CopyFiles$ Processing DocNum: 1792593, FileYear: 1978, FileMd: 622, Files: List(Z:\I\1978\06\22\1792593.001, Z:\I\1978\06\22\1792593.002)
2017-06-20 16:16:21,681 INFO CopyFiles$ Copying: Z:\I\1978\06\22\1792593.001 to: ./preindex/1978/1792593.001
2017-06-20 16:16:21,697 INFO CopyFiles$ Copying: Z:\I\1978\06\22\1792593.002 to: ./preindex/1978/1792593.002
2017-06-20 16:16:21,713 INFO CopyFiles$ Processing DocNum: 1921973, FileYear: 1978, FileMd: 1220, Files: List(Z:\I\1978\12\20\1921973.001, Z:\I\1978\12\20\1921973.002, Z:\I\1978\12\20\1921973.003, Z:\I\1978\12\20\1921973.004, Z:\I\1978\12\20\1921973.005, Z:\I\1978\12\20\1921973.006)
2017-06-20 16:16:21,713 INFO CopyFiles$ Copying: Z:\I\1978\12\20\1921973.001 to: ./preindex/1978/1921973.001
2017-06-20 16:16:21,728 INFO CopyFiles$ Copying: Z:\I\1978\12\20\1921973.002 to: ./preindex/1978/1921973.002
2017-06-20 16:16:21,728 INFO CopyFiles$ Copying: Z:\I\1978\12\20\1921973.003 to: ./preindex/1978/1921973.003
2017-06-20 16:16:21,744 INFO CopyFiles$ Copying: Z:\I\1978\12\20\1921973.004 to: ./preindex/1978/1921973.004
2017-06-20 16:16:21,744 INFO CopyFiles$ Copying: Z:\I\1978\12\20\1921973.005 to: ./preindex/1978/1921973.005
2017-06-20 16:16:21,759 INFO CopyFiles$ Copying: Z:\I\1978\12\20\1921973.006 to: ./preindex/1978/1921973.006
2017-06-20 16:16:21,759 INFO CopyFiles$ Processing DocNum: 1814686, FileYear: 1978, FileMd: 724, Files: List(Z:\I\1978\07\24\1814686.001, Z:\I\1978\07\24\1814686.002, Z:\I\1978\07\24\1814686.003)
2017-06-20 16:16:21,759 INFO CopyFiles$ Copying: Z:\I\1978\07\24\1814686.001 to: ./preindex/1978/1814686.001
2017-06-20 16:16:21,775 INFO CopyFiles$ Copying: Z:\I\1978\07\24\1814686.002 to: ./preindex/1978/1814686.002
2017-06-20 16:16:21,791 INFO CopyFiles$ Copying: Z:\I\1978\07\24\1814686.003 to: ./preindex/1978/1814686.003
2017-06-20 16:16:21,806 INFO CopyFiles$ Processing DocNum: 1748237, FileYear: 1978, FileMd: 424, Files: List(Z:\I\1978\04\24\1748237.001, Z:\I\1978\04\24\1748237.002)
2017-06-20 16:16:21,806 INFO CopyFiles$ Copying: Z:\I\1978\04\24\1748237.001 to: ./preindex/1978/1748237.001
2017-06-20 16:16:21,822 INFO CopyFiles$ Copying: Z:\I\1978\04\24\1748237.002 to: ./preindex/1978/1748237.002
2017-06-20 16:16:21,822 INFO CopyFiles$ Processing DocNum: 1761463, FileYear: 1978, FileMd: 510, Files: List(Z:\I\1978\05\10\1761463.001, Z:\I\1978\05\10\1761463.002, Z:\I\1978\05\10\1761463.003)
2017-06-20 16:16:21,822 INFO CopyFiles$ Copying: Z:\I\1978\05\10\1761463.001 to: ./preindex/1978/1761463.001
2017-06-20 16:16:21,838 INFO CopyFiles$ Copying: Z:\I\1978\05\10\1761463.002 to: ./preindex/1978/1761463.002
2017-06-20 16:16:21,849 INFO CopyFiles$ Copying: Z:\I\1978\05\10\1761463.003 to: ./preindex/1978/1761463.003
2017-06-20 16:16:21,899 INFO CopyFiles$ Processing DocNum: 1674718, FileYear: 1978, FileMd: 104, Files: List(Z:\I\1978\01\04\1674718.001, Z:\I\1978\01\04\1674718.002, Z:\I\1978\01\04\1674718.003, Z:\I\1978\01\04\1674718.004, Z:\I\1978\01\04\1674718.005, Z:\I\1978\01\04\1674718.006, Z:\I\1978\01\04\1674718.007, Z:\I\1978\01\04\1674718.008, Z:\I\1978\01\04\1674718.009, Z:\I\1978\01\04\1674718.010, Z:\I\1978\01\04\1674718.011, Z:\I\1978\01\04\1674718.012, Z:\I\1978\01\04\1674718.013, Z:\I\1978\01\04\1674718.014, Z:\I\1978\01\04\1674718.015, Z:\I\1978\01\04\1674718.016, Z:\I\1978\01\04\1674718.017, Z:\I\1978\01\04\1674718.018, Z:\I\1978\01\04\1674718.019, Z:\I\1978\01\04\1674718.020, Z:\I\1978\01\04\1674718.021, Z:\I\1978\01\04\1674718.022)
2017-06-20 16:16:21,899 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1674718.001 to: ./preindex/1978/1674718.001
2017-06-20 16:16:21,919 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1674718.002 to: ./preindex/1978/1674718.002
2017-06-20 16:16:21,919 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1674718.003 to: ./preindex/1978/1674718.003
2017-06-20 16:16:21,935 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1674718.004 to: ./preindex/1978/1674718.004
2017-06-20 16:16:21,951 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1674718.005 to: ./preindex/1978/1674718.005
2017-06-20 16:16:21,951 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1674718.006 to: ./preindex/1978/1674718.006
2017-06-20 16:16:21,951 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1674718.007 to: ./preindex/1978/1674718.007
2017-06-20 16:16:21,966 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1674718.008 to: ./preindex/1978/1674718.008
2017-06-20 16:16:21,966 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1674718.009 to: ./preindex/1978/1674718.009
2017-06-20 16:16:21,982 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1674718.010 to: ./preindex/1978/1674718.010
2017-06-20 16:16:21,982 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1674718.011 to: ./preindex/1978/1674718.011
2017-06-20 16:16:21,982 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1674718.012 to: ./preindex/1978/1674718.012
2017-06-20 16:16:21,997 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1674718.013 to: ./preindex/1978/1674718.013
2017-06-20 16:16:21,997 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1674718.014 to: ./preindex/1978/1674718.014
2017-06-20 16:16:22,013 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1674718.015 to: ./preindex/1978/1674718.015
2017-06-20 16:16:22,013 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1674718.016 to: ./preindex/1978/1674718.016
2017-06-20 16:16:22,013 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1674718.017 to: ./preindex/1978/1674718.017
2017-06-20 16:16:22,029 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1674718.018 to: ./preindex/1978/1674718.018
2017-06-20 16:16:22,029 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1674718.019 to: ./preindex/1978/1674718.019
2017-06-20 16:16:22,029 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1674718.020 to: ./preindex/1978/1674718.020
2017-06-20 16:16:22,044 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1674718.021 to: ./preindex/1978/1674718.021
2017-06-20 16:16:22,044 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1674718.022 to: ./preindex/1978/1674718.022
2017-06-20 16:16:22,060 INFO CopyFiles$ Processing DocNum: 1849853, FileYear: 1978, FileMd: 912, Files: List(Z:\I\1978\09\12\1849853.001, Z:\I\1978\09\12\1849853.002)
2017-06-20 16:16:22,060 INFO CopyFiles$ Copying: Z:\I\1978\09\12\1849853.001 to: ./preindex/1978/1849853.001
2017-06-20 16:16:22,075 INFO CopyFiles$ Copying: Z:\I\1978\09\12\1849853.002 to: ./preindex/1978/1849853.002
2017-06-20 16:16:22,091 INFO CopyFiles$ Processing DocNum: 1747397, FileYear: 1978, FileMd: 420, Files: List(Z:\I\1978\04\20\1747397.001, Z:\I\1978\04\20\1747397.002, Z:\I\1978\04\20\1747397.003)
2017-06-20 16:16:22,091 INFO CopyFiles$ Copying: Z:\I\1978\04\20\1747397.001 to: ./preindex/1978/1747397.001
2017-06-20 16:16:22,107 INFO CopyFiles$ Copying: Z:\I\1978\04\20\1747397.002 to: ./preindex/1978/1747397.002
2017-06-20 16:16:22,122 INFO CopyFiles$ Copying: Z:\I\1978\04\20\1747397.003 to: ./preindex/1978/1747397.003
2017-06-20 16:16:22,138 INFO CopyFiles$ Processing DocNum: 1925394, FileYear: 1978, FileMd: 1228, Files: List(Z:\I\1978\12\28\1925394.001, Z:\I\1978\12\28\1925394.002)
2017-06-20 16:16:22,138 INFO CopyFiles$ Copying: Z:\I\1978\12\28\1925394.001 to: ./preindex/1978/1925394.001
2017-06-20 16:16:22,153 INFO CopyFiles$ Copying: Z:\I\1978\12\28\1925394.002 to: ./preindex/1978/1925394.002
2017-06-20 16:16:22,169 INFO CopyFiles$ Processing DocNum: 1716550, FileYear: 1978, FileMd: 308, Files: List(Z:\I\1978\03\08\1716550.001, Z:\I\1978\03\08\1716550.002, Z:\I\1978\03\08\1716550.003, Z:\I\1978\03\08\1716550.004, Z:\I\1978\03\08\1716550.005, Z:\I\1978\03\08\1716550.006)
2017-06-20 16:16:22,169 INFO CopyFiles$ Copying: Z:\I\1978\03\08\1716550.001 to: ./preindex/1978/1716550.001
2017-06-20 16:16:22,185 INFO CopyFiles$ Copying: Z:\I\1978\03\08\1716550.002 to: ./preindex/1978/1716550.002
2017-06-20 16:16:22,200 INFO CopyFiles$ Copying: Z:\I\1978\03\08\1716550.003 to: ./preindex/1978/1716550.003
2017-06-20 16:16:22,216 INFO CopyFiles$ Copying: Z:\I\1978\03\08\1716550.004 to: ./preindex/1978/1716550.004
2017-06-20 16:16:22,216 INFO CopyFiles$ Copying: Z:\I\1978\03\08\1716550.005 to: ./preindex/1978/1716550.005
2017-06-20 16:16:22,231 INFO CopyFiles$ Copying: Z:\I\1978\03\08\1716550.006 to: ./preindex/1978/1716550.006
2017-06-20 16:16:22,247 INFO CopyFiles$ Processing DocNum: 1789287, FileYear: 1978, FileMd: 619, Files: List(Z:\I\1978\06\19\1789287.001, Z:\I\1978\06\19\1789287.002, Z:\I\1978\06\19\1789287.003)
2017-06-20 16:16:22,247 INFO CopyFiles$ Copying: Z:\I\1978\06\19\1789287.001 to: ./preindex/1978/1789287.001
2017-06-20 16:16:22,263 INFO CopyFiles$ Copying: Z:\I\1978\06\19\1789287.002 to: ./preindex/1978/1789287.002
2017-06-20 16:16:22,263 INFO CopyFiles$ Copying: Z:\I\1978\06\19\1789287.003 to: ./preindex/1978/1789287.003
2017-06-20 16:16:22,263 INFO CopyFiles$ Processing DocNum: 1700227, FileYear: 1978, FileMd: 210, Files: List(Z:\I\1978\02\10\1700227.001, Z:\I\1978\02\10\1700227.002)
2017-06-20 16:16:22,263 INFO CopyFiles$ Copying: Z:\I\1978\02\10\1700227.001 to: ./preindex/1978/1700227.001
2017-06-20 16:16:22,294 INFO CopyFiles$ Copying: Z:\I\1978\02\10\1700227.002 to: ./preindex/1978/1700227.002
2017-06-20 16:16:22,294 INFO CopyFiles$ Processing DocNum: 1708336, FileYear: 1978, FileMd: 223, Files: List(Z:\I\1978\02\23\1708336.001, Z:\I\1978\02\23\1708336.002, Z:\I\1978\02\23\1708336.003, Z:\I\1978\02\23\1708336.004)
2017-06-20 16:16:22,294 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1708336.001 to: ./preindex/1978/1708336.001
2017-06-20 16:16:22,309 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1708336.002 to: ./preindex/1978/1708336.002
2017-06-20 16:16:22,325 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1708336.003 to: ./preindex/1978/1708336.003
2017-06-20 16:16:22,341 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1708336.004 to: ./preindex/1978/1708336.004
2017-06-20 16:16:22,341 INFO CopyFiles$ Processing DocNum: 1890629, FileYear: 1978, FileMd: 1102, Files: List(Z:\I\1978\11\02\1890629.001, Z:\I\1978\11\02\1890629.002, Z:\I\1978\11\02\1890629.003, Z:\I\1978\11\02\1890629.004, Z:\I\1978\11\02\1890629.005)
2017-06-20 16:16:22,356 INFO CopyFiles$ Copying: Z:\I\1978\11\02\1890629.001 to: ./preindex/1978/1890629.001
2017-06-20 16:16:22,356 INFO CopyFiles$ Copying: Z:\I\1978\11\02\1890629.002 to: ./preindex/1978/1890629.002
2017-06-20 16:16:22,356 INFO CopyFiles$ Copying: Z:\I\1978\11\02\1890629.003 to: ./preindex/1978/1890629.003
2017-06-20 16:16:22,372 INFO CopyFiles$ Copying: Z:\I\1978\11\02\1890629.004 to: ./preindex/1978/1890629.004
2017-06-20 16:16:22,372 INFO CopyFiles$ Copying: Z:\I\1978\11\02\1890629.005 to: ./preindex/1978/1890629.005
2017-06-20 16:16:22,387 INFO CopyFiles$ Processing DocNum: 1844825, FileYear: 1978, FileMd: 831, Files: List(Z:\I\1978\08\31\1844825.001, Z:\I\1978\08\31\1844825.002, Z:\I\1978\08\31\1844825.003, Z:\I\1978\08\31\1844825.004)
2017-06-20 16:16:22,387 INFO CopyFiles$ Copying: Z:\I\1978\08\31\1844825.001 to: ./preindex/1978/1844825.001
2017-06-20 16:16:22,403 INFO CopyFiles$ Copying: Z:\I\1978\08\31\1844825.002 to: ./preindex/1978/1844825.002
2017-06-20 16:16:22,434 INFO CopyFiles$ Copying: Z:\I\1978\08\31\1844825.003 to: ./preindex/1978/1844825.003
2017-06-20 16:16:22,450 INFO CopyFiles$ Copying: Z:\I\1978\08\31\1844825.004 to: ./preindex/1978/1844825.004
2017-06-20 16:16:22,450 INFO CopyFiles$ Processing DocNum: 1797425, FileYear: 1978, FileMd: 629, Files: List(Z:\I\1978\06\29\1797425.001, Z:\I\1978\06\29\1797425.002, Z:\I\1978\06\29\1797425.003, Z:\I\1978\06\29\1797425.004, Z:\I\1978\06\29\1797425.005)
2017-06-20 16:16:22,465 INFO CopyFiles$ Copying: Z:\I\1978\06\29\1797425.001 to: ./preindex/1978/1797425.001
2017-06-20 16:16:22,481 INFO CopyFiles$ Copying: Z:\I\1978\06\29\1797425.002 to: ./preindex/1978/1797425.002
2017-06-20 16:16:22,497 INFO CopyFiles$ Copying: Z:\I\1978\06\29\1797425.003 to: ./preindex/1978/1797425.003
2017-06-20 16:16:22,497 INFO CopyFiles$ Copying: Z:\I\1978\06\29\1797425.004 to: ./preindex/1978/1797425.004
2017-06-20 16:16:22,512 INFO CopyFiles$ Copying: Z:\I\1978\06\29\1797425.005 to: ./preindex/1978/1797425.005
2017-06-20 16:16:22,512 INFO CopyFiles$ Processing DocNum: 1853139, FileYear: 1978, FileMd: 912, Files: List(Z:\I\1978\09\12\1853139.001, Z:\I\1978\09\12\1853139.002, Z:\I\1978\09\12\1853139.003, Z:\I\1978\09\12\1853139.004)
2017-06-20 16:16:22,512 INFO CopyFiles$ Copying: Z:\I\1978\09\12\1853139.001 to: ./preindex/1978/1853139.001
2017-06-20 16:16:22,528 INFO CopyFiles$ Copying: Z:\I\1978\09\12\1853139.002 to: ./preindex/1978/1853139.002
2017-06-20 16:16:22,543 INFO CopyFiles$ Copying: Z:\I\1978\09\12\1853139.003 to: ./preindex/1978/1853139.003
2017-06-20 16:16:22,543 INFO CopyFiles$ Copying: Z:\I\1978\09\12\1853139.004 to: ./preindex/1978/1853139.004
2017-06-20 16:16:22,575 INFO CopyFiles$ Processing DocNum: 1888992, FileYear: 1978, FileMd: 1101, Files: List(Z:\I\1978\11\01\1888992.001, Z:\I\1978\11\01\1888992.002, Z:\I\1978\11\01\1888992.003, Z:\I\1978\11\01\1888992.004, Z:\I\1978\11\01\1888992.005)
2017-06-20 16:16:22,575 INFO CopyFiles$ Copying: Z:\I\1978\11\01\1888992.001 to: ./preindex/1978/1888992.001
2017-06-20 16:16:22,575 INFO CopyFiles$ Copying: Z:\I\1978\11\01\1888992.002 to: ./preindex/1978/1888992.002
2017-06-20 16:16:22,590 INFO CopyFiles$ Copying: Z:\I\1978\11\01\1888992.003 to: ./preindex/1978/1888992.003
2017-06-20 16:16:22,590 INFO CopyFiles$ Copying: Z:\I\1978\11\01\1888992.004 to: ./preindex/1978/1888992.004
2017-06-20 16:16:22,606 INFO CopyFiles$ Copying: Z:\I\1978\11\01\1888992.005 to: ./preindex/1978/1888992.005
2017-06-20 16:16:22,621 INFO CopyFiles$ Processing DocNum: 1800565, FileYear: 1978, FileMd: 705, Files: List(Z:\I\1978\07\05\1800565.001, Z:\I\1978\07\05\1800565.002, Z:\I\1978\07\05\1800565.003, Z:\I\1978\07\05\1800565.004, Z:\I\1978\07\05\1800565.005)
2017-06-20 16:16:22,621 INFO CopyFiles$ Copying: Z:\I\1978\07\05\1800565.001 to: ./preindex/1978/1800565.001
2017-06-20 16:16:22,653 INFO CopyFiles$ Copying: Z:\I\1978\07\05\1800565.002 to: ./preindex/1978/1800565.002
2017-06-20 16:16:22,653 INFO CopyFiles$ Copying: Z:\I\1978\07\05\1800565.003 to: ./preindex/1978/1800565.003
2017-06-20 16:16:22,668 INFO CopyFiles$ Copying: Z:\I\1978\07\05\1800565.004 to: ./preindex/1978/1800565.004
2017-06-20 16:16:22,684 INFO CopyFiles$ Copying: Z:\I\1978\07\05\1800565.005 to: ./preindex/1978/1800565.005
2017-06-20 16:16:22,699 INFO CopyFiles$ Processing DocNum: 1801104, FileYear: 1978, FileMd: 705, Files: List(Z:\I\1978\07\05\1801104.001, Z:\I\1978\07\05\1801104.002, Z:\I\1978\07\05\1801104.003, Z:\I\1978\07\05\1801104.004, Z:\I\1978\07\05\1801104.005, Z:\I\1978\07\05\1801104.006)
2017-06-20 16:16:22,699 INFO CopyFiles$ Copying: Z:\I\1978\07\05\1801104.001 to: ./preindex/1978/1801104.001
2017-06-20 16:16:22,715 INFO CopyFiles$ Copying: Z:\I\1978\07\05\1801104.002 to: ./preindex/1978/1801104.002
2017-06-20 16:16:22,731 INFO CopyFiles$ Copying: Z:\I\1978\07\05\1801104.003 to: ./preindex/1978/1801104.003
2017-06-20 16:16:22,731 INFO CopyFiles$ Copying: Z:\I\1978\07\05\1801104.004 to: ./preindex/1978/1801104.004
2017-06-20 16:16:22,746 INFO CopyFiles$ Copying: Z:\I\1978\07\05\1801104.005 to: ./preindex/1978/1801104.005
2017-06-20 16:16:22,762 INFO CopyFiles$ Copying: Z:\I\1978\07\05\1801104.006 to: ./preindex/1978/1801104.006
2017-06-20 16:16:22,777 INFO CopyFiles$ Processing DocNum: 1849698, FileYear: 1978, FileMd: 907, Files: List(Z:\I\1978\09\07\1849698.001, Z:\I\1978\09\07\1849698.002, Z:\I\1978\09\07\1849698.003, Z:\I\1978\09\07\1849698.004)
2017-06-20 16:16:22,777 INFO CopyFiles$ Copying: Z:\I\1978\09\07\1849698.001 to: ./preindex/1978/1849698.001
2017-06-20 16:16:22,793 INFO CopyFiles$ Copying: Z:\I\1978\09\07\1849698.002 to: ./preindex/1978/1849698.002
2017-06-20 16:16:22,809 INFO CopyFiles$ Copying: Z:\I\1978\09\07\1849698.003 to: ./preindex/1978/1849698.003
2017-06-20 16:16:22,824 INFO CopyFiles$ Copying: Z:\I\1978\09\07\1849698.004 to: ./preindex/1978/1849698.004
2017-06-20 16:16:22,840 INFO CopyFiles$ Processing DocNum: 1904247, FileYear: 1978, FileMd: 1122, Files: List(Z:\I\1978\11\22\1904247.001, Z:\I\1978\11\22\1904247.002, Z:\I\1978\11\22\1904247.003)
2017-06-20 16:16:22,840 INFO CopyFiles$ Copying: Z:\I\1978\11\22\1904247.001 to: ./preindex/1978/1904247.001
2017-06-20 16:16:22,855 INFO CopyFiles$ Copying: Z:\I\1978\11\22\1904247.002 to: ./preindex/1978/1904247.002
2017-06-20 16:16:22,871 INFO CopyFiles$ Copying: Z:\I\1978\11\22\1904247.003 to: ./preindex/1978/1904247.003
2017-06-20 16:16:22,887 INFO CopyFiles$ Processing DocNum: 1851680, FileYear: 1978, FileMd: 911, Files: List(Z:\I\1978\09\11\1851680.001, Z:\I\1978\09\11\1851680.002)
2017-06-20 16:16:22,887 INFO CopyFiles$ Copying: Z:\I\1978\09\11\1851680.001 to: ./preindex/1978/1851680.001
2017-06-20 16:16:22,918 INFO CopyFiles$ Copying: Z:\I\1978\09\11\1851680.002 to: ./preindex/1978/1851680.002
2017-06-20 16:16:22,933 INFO CopyFiles$ Processing DocNum: 1740698, FileYear: 1978, FileMd: 411, Files: List(Z:\I\1978\04\11\1740698.001, Z:\I\1978\04\11\1740698.002, Z:\I\1978\04\11\1740698.003)
2017-06-20 16:16:22,933 INFO CopyFiles$ Copying: Z:\I\1978\04\11\1740698.001 to: ./preindex/1978/1740698.001
2017-06-20 16:16:22,949 INFO CopyFiles$ Copying: Z:\I\1978\04\11\1740698.002 to: ./preindex/1978/1740698.002
2017-06-20 16:16:22,980 INFO CopyFiles$ Copying: Z:\I\1978\04\11\1740698.003 to: ./preindex/1978/1740698.003
2017-06-20 16:16:22,980 INFO CopyFiles$ Processing DocNum: 1737244, FileYear: 1978, FileMd: 406, Files: List(Z:\I\1978\04\06\1737244.001, Z:\I\1978\04\06\1737244.002, Z:\I\1978\04\06\1737244.003, Z:\I\1978\04\06\1737244.004)
2017-06-20 16:16:22,980 INFO CopyFiles$ Copying: Z:\I\1978\04\06\1737244.001 to: ./preindex/1978/1737244.001
2017-06-20 16:16:22,996 INFO CopyFiles$ Copying: Z:\I\1978\04\06\1737244.002 to: ./preindex/1978/1737244.002
2017-06-20 16:16:22,996 INFO CopyFiles$ Copying: Z:\I\1978\04\06\1737244.003 to: ./preindex/1978/1737244.003
2017-06-20 16:16:23,011 INFO CopyFiles$ Copying: Z:\I\1978\04\06\1737244.004 to: ./preindex/1978/1737244.004
2017-06-20 16:16:23,027 INFO CopyFiles$ Processing DocNum: 1716458, FileYear: 1978, FileMd: 308, Files: List(Z:\I\1978\03\08\1716458.001, Z:\I\1978\03\08\1716458.002, Z:\I\1978\03\08\1716458.003, Z:\I\1978\03\08\1716458.004)
2017-06-20 16:16:23,027 INFO CopyFiles$ Copying: Z:\I\1978\03\08\1716458.001 to: ./preindex/1978/1716458.001
2017-06-20 16:16:23,027 INFO CopyFiles$ Copying: Z:\I\1978\03\08\1716458.002 to: ./preindex/1978/1716458.002
2017-06-20 16:16:23,043 INFO CopyFiles$ Copying: Z:\I\1978\03\08\1716458.003 to: ./preindex/1978/1716458.003
2017-06-20 16:16:23,058 INFO CopyFiles$ Copying: Z:\I\1978\03\08\1716458.004 to: ./preindex/1978/1716458.004
2017-06-20 16:16:23,074 INFO CopyFiles$ Processing DocNum: 1785993, FileYear: 1978, FileMd: 614, Files: List(Z:\I\1978\06\14\1785993.001, Z:\I\1978\06\14\1785993.002, Z:\I\1978\06\14\1785993.003)
2017-06-20 16:16:23,074 INFO CopyFiles$ Copying: Z:\I\1978\06\14\1785993.001 to: ./preindex/1978/1785993.001
2017-06-20 16:16:23,089 INFO CopyFiles$ Copying: Z:\I\1978\06\14\1785993.002 to: ./preindex/1978/1785993.002
2017-06-20 16:16:23,121 INFO CopyFiles$ Copying: Z:\I\1978\06\14\1785993.003 to: ./preindex/1978/1785993.003
2017-06-20 16:16:23,136 INFO CopyFiles$ Processing DocNum: 1743332, FileYear: 1978, FileMd: 414, Files: List(Z:\I\1978\04\14\1743332.001, Z:\I\1978\04\14\1743332.002, Z:\I\1978\04\14\1743332.003)
2017-06-20 16:16:23,136 INFO CopyFiles$ Copying: Z:\I\1978\04\14\1743332.001 to: ./preindex/1978/1743332.001
2017-06-20 16:16:23,152 INFO CopyFiles$ Copying: Z:\I\1978\04\14\1743332.002 to: ./preindex/1978/1743332.002
2017-06-20 16:16:23,183 INFO CopyFiles$ Copying: Z:\I\1978\04\14\1743332.003 to: ./preindex/1978/1743332.003
2017-06-20 16:16:23,199 INFO CopyFiles$ Processing DocNum: 1755210, FileYear: 1978, FileMd: 502, Files: List(Z:\I\1978\05\02\1755210.001, Z:\I\1978\05\02\1755210.002)
2017-06-20 16:16:23,199 INFO CopyFiles$ Copying: Z:\I\1978\05\02\1755210.001 to: ./preindex/1978/1755210.001
2017-06-20 16:16:23,214 INFO CopyFiles$ Copying: Z:\I\1978\05\02\1755210.002 to: ./preindex/1978/1755210.002
2017-06-20 16:16:23,230 INFO CopyFiles$ Processing DocNum: 1881065, FileYear: 1978, FileMd: 1020, Files: List(Z:\I\1978\10\20\1881065.001, Z:\I\1978\10\20\1881065.002, Z:\I\1978\10\20\1881065.003, Z:\I\1978\10\20\1881065.004, Z:\I\1978\10\20\1881065.005, Z:\I\1978\10\20\1881065.006, Z:\I\1978\10\20\1881065.007, Z:\I\1978\10\20\1881065.008, Z:\I\1978\10\20\1881065.009, Z:\I\1978\10\20\1881065.010, Z:\I\1978\10\20\1881065.011, Z:\I\1978\10\20\1881065.012)
2017-06-20 16:16:23,230 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.001 to: ./preindex/1978/1881065.001
2017-06-20 16:16:23,245 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.002 to: ./preindex/1978/1881065.002
2017-06-20 16:16:23,245 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.003 to: ./preindex/1978/1881065.003
2017-06-20 16:16:23,245 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.004 to: ./preindex/1978/1881065.004
2017-06-20 16:16:23,261 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.005 to: ./preindex/1978/1881065.005
2017-06-20 16:16:23,261 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.006 to: ./preindex/1978/1881065.006
2017-06-20 16:16:23,277 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.007 to: ./preindex/1978/1881065.007
2017-06-20 16:16:23,277 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.008 to: ./preindex/1978/1881065.008
2017-06-20 16:16:23,277 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.009 to: ./preindex/1978/1881065.009
2017-06-20 16:16:23,292 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.010 to: ./preindex/1978/1881065.010
2017-06-20 16:16:23,292 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.011 to: ./preindex/1978/1881065.011
2017-06-20 16:16:23,292 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.012 to: ./preindex/1978/1881065.012
2017-06-20 16:16:23,323 INFO CopyFiles$ Processing DocNum: 1915246, FileYear: 1978, FileMd: 1211, Files: List(Z:\I\1978\12\11\1915246.001, Z:\I\1978\12\11\1915246.002, Z:\I\1978\12\11\1915246.003)
2017-06-20 16:16:23,323 INFO CopyFiles$ Copying: Z:\I\1978\12\11\1915246.001 to: ./preindex/1978/1915246.001
2017-06-20 16:16:23,339 INFO CopyFiles$ Copying: Z:\I\1978\12\11\1915246.002 to: ./preindex/1978/1915246.002
2017-06-20 16:16:23,355 INFO CopyFiles$ Copying: Z:\I\1978\12\11\1915246.003 to: ./preindex/1978/1915246.003
2017-06-20 16:16:23,355 INFO CopyFiles$ Processing DocNum: 1738134, FileYear: 1978, FileMd: 407, Files: List(Z:\I\1978\04\07\1738134.001, Z:\I\1978\04\07\1738134.002, Z:\I\1978\04\07\1738134.003)
2017-06-20 16:16:23,370 INFO CopyFiles$ Copying: Z:\I\1978\04\07\1738134.001 to: ./preindex/1978/1738134.001
2017-06-20 16:16:23,386 INFO CopyFiles$ Copying: Z:\I\1978\04\07\1738134.002 to: ./preindex/1978/1738134.002
2017-06-20 16:16:23,401 INFO CopyFiles$ Copying: Z:\I\1978\04\07\1738134.003 to: ./preindex/1978/1738134.003
2017-06-20 16:16:23,417 INFO CopyFiles$ Processing DocNum: 1721194, FileYear: 1978, FileMd: 314, Files: List(Z:\I\1978\03\14\1721194.001, Z:\I\1978\03\14\1721194.002, Z:\I\1978\03\14\1721194.003)
2017-06-20 16:16:23,417 INFO CopyFiles$ Copying: Z:\I\1978\03\14\1721194.001 to: ./preindex/1978/1721194.001
2017-06-20 16:16:23,433 INFO CopyFiles$ Copying: Z:\I\1978\03\14\1721194.002 to: ./preindex/1978/1721194.002
2017-06-20 16:16:23,433 INFO CopyFiles$ Copying: Z:\I\1978\03\14\1721194.003 to: ./preindex/1978/1721194.003
2017-06-20 16:16:23,433 INFO CopyFiles$ Processing DocNum: 1800559, FileYear: 1978, FileMd: 705, Files: List(Z:\I\1978\07\05\1800559.001, Z:\I\1978\07\05\1800559.002, Z:\I\1978\07\05\1800559.003, Z:\I\1978\07\05\1800559.004, Z:\I\1978\07\05\1800559.005, Z:\I\1978\07\05\1800559.006)
2017-06-20 16:16:23,433 INFO CopyFiles$ Copying: Z:\I\1978\07\05\1800559.001 to: ./preindex/1978/1800559.001
2017-06-20 16:16:23,464 INFO CopyFiles$ Copying: Z:\I\1978\07\05\1800559.002 to: ./preindex/1978/1800559.002
2017-06-20 16:16:23,464 INFO CopyFiles$ Copying: Z:\I\1978\07\05\1800559.003 to: ./preindex/1978/1800559.003
2017-06-20 16:16:23,479 INFO CopyFiles$ Copying: Z:\I\1978\07\05\1800559.004 to: ./preindex/1978/1800559.004
2017-06-20 16:16:23,495 INFO CopyFiles$ Copying: Z:\I\1978\07\05\1800559.005 to: ./preindex/1978/1800559.005
2017-06-20 16:16:23,495 INFO CopyFiles$ Copying: Z:\I\1978\07\05\1800559.006 to: ./preindex/1978/1800559.006
2017-06-20 16:16:23,526 INFO CopyFiles$ Processing DocNum: 1708034, FileYear: 1978, FileMd: 223, Files: List(Z:\I\1978\02\23\1708034.001, Z:\I\1978\02\23\1708034.002, Z:\I\1978\02\23\1708034.003)
2017-06-20 16:16:23,526 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1708034.001 to: ./preindex/1978/1708034.001
2017-06-20 16:16:23,573 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1708034.002 to: ./preindex/1978/1708034.002
2017-06-20 16:16:23,589 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1708034.003 to: ./preindex/1978/1708034.003
2017-06-20 16:16:23,604 INFO CopyFiles$ Processing DocNum: 1781600, FileYear: 1978, FileMd: 607, Files: List(Z:\I\1978\06\07\1781600.001, Z:\I\1978\06\07\1781600.002, Z:\I\1978\06\07\1781600.003, Z:\I\1978\06\07\1781600.004, Z:\I\1978\06\07\1781600.005)
2017-06-20 16:16:23,604 INFO CopyFiles$ Copying: Z:\I\1978\06\07\1781600.001 to: ./preindex/1978/1781600.001
2017-06-20 16:16:23,620 INFO CopyFiles$ Copying: Z:\I\1978\06\07\1781600.002 to: ./preindex/1978/1781600.002
2017-06-20 16:16:23,620 INFO CopyFiles$ Copying: Z:\I\1978\06\07\1781600.003 to: ./preindex/1978/1781600.003
2017-06-20 16:16:23,635 INFO CopyFiles$ Copying: Z:\I\1978\06\07\1781600.004 to: ./preindex/1978/1781600.004
2017-06-20 16:16:23,635 INFO CopyFiles$ Copying: Z:\I\1978\06\07\1781600.005 to: ./preindex/1978/1781600.005
2017-06-20 16:16:23,651 INFO CopyFiles$ Processing DocNum: 1900352, FileYear: 1978, FileMd: 1116, Files: List(Z:\I\1978\11\16\1900352.001, Z:\I\1978\11\16\1900352.002, Z:\I\1978\11\16\1900352.003)
2017-06-20 16:16:23,651 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900352.001 to: ./preindex/1978/1900352.001
2017-06-20 16:16:23,667 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900352.002 to: ./preindex/1978/1900352.002
2017-06-20 16:16:23,667 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900352.003 to: ./preindex/1978/1900352.003
2017-06-20 16:16:23,698 INFO CopyFiles$ Processing DocNum: 1691975, FileYear: 1978, FileMd: 127, Files: List(Z:\I\1978\01\27\1691975.001, Z:\I\1978\01\27\1691975.002, Z:\I\1978\01\27\1691975.003)
2017-06-20 16:16:23,698 INFO CopyFiles$ Copying: Z:\I\1978\01\27\1691975.001 to: ./preindex/1978/1691975.001
2017-06-20 16:16:23,713 INFO CopyFiles$ Copying: Z:\I\1978\01\27\1691975.002 to: ./preindex/1978/1691975.002
2017-06-20 16:16:23,729 INFO CopyFiles$ Copying: Z:\I\1978\01\27\1691975.003 to: ./preindex/1978/1691975.003
2017-06-20 16:16:23,760 INFO CopyFiles$ Processing DocNum: 1855272, FileYear: 1978, FileMd: 914, Files: List(Z:\I\1978\09\14\1855272.001, Z:\I\1978\09\14\1855272.002)
2017-06-20 16:16:23,760 INFO CopyFiles$ Copying: Z:\I\1978\09\14\1855272.001 to: ./preindex/1978/1855272.001
2017-06-20 16:16:23,776 INFO CopyFiles$ Copying: Z:\I\1978\09\14\1855272.002 to: ./preindex/1978/1855272.002
2017-06-20 16:16:23,791 INFO CopyFiles$ Processing DocNum: 1914218, FileYear: 1978, FileMd: 1212, Files: List(Z:\I\1978\12\12\1914218.001, Z:\I\1978\12\12\1914218.002, Z:\I\1978\12\12\1914218.003, Z:\I\1978\12\12\1914218.004, Z:\I\1978\12\12\1914218.005, Z:\I\1978\12\12\1914218.006)
2017-06-20 16:16:23,791 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914218.001 to: ./preindex/1978/1914218.001
2017-06-20 16:16:23,791 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914218.002 to: ./preindex/1978/1914218.002
2017-06-20 16:16:23,807 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914218.003 to: ./preindex/1978/1914218.003
2017-06-20 16:16:23,807 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914218.004 to: ./preindex/1978/1914218.004
2017-06-20 16:16:23,807 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914218.005 to: ./preindex/1978/1914218.005
2017-06-20 16:16:23,823 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914218.006 to: ./preindex/1978/1914218.006
2017-06-20 16:16:23,823 INFO CopyFiles$ Processing DocNum: 1855122, FileYear: 1978, FileMd: 914, Files: List(Z:\I\1978\09\14\1855122.001, Z:\I\1978\09\14\1855122.002, Z:\I\1978\09\14\1855122.003, Z:\I\1978\09\14\1855122.004, Z:\I\1978\09\14\1855122.005)
2017-06-20 16:16:23,823 INFO CopyFiles$ Copying: Z:\I\1978\09\14\1855122.001 to: ./preindex/1978/1855122.001
2017-06-20 16:16:23,838 INFO CopyFiles$ Copying: Z:\I\1978\09\14\1855122.002 to: ./preindex/1978/1855122.002
2017-06-20 16:16:23,838 INFO CopyFiles$ Copying: Z:\I\1978\09\14\1855122.003 to: ./preindex/1978/1855122.003
2017-06-20 16:16:23,854 INFO CopyFiles$ Copying: Z:\I\1978\09\14\1855122.004 to: ./preindex/1978/1855122.004
2017-06-20 16:16:23,854 INFO CopyFiles$ Copying: Z:\I\1978\09\14\1855122.005 to: ./preindex/1978/1855122.005
2017-06-20 16:16:23,869 INFO CopyFiles$ Processing DocNum: 1914213, FileYear: 1978, FileMd: 1212, Files: List(Z:\I\1978\12\12\1914213.001, Z:\I\1978\12\12\1914213.002, Z:\I\1978\12\12\1914213.003, Z:\I\1978\12\12\1914213.004, Z:\I\1978\12\12\1914213.005)
2017-06-20 16:16:23,869 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914213.001 to: ./preindex/1978/1914213.001
2017-06-20 16:16:23,885 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914213.002 to: ./preindex/1978/1914213.002
2017-06-20 16:16:23,885 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914213.003 to: ./preindex/1978/1914213.003
2017-06-20 16:16:23,885 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914213.004 to: ./preindex/1978/1914213.004
2017-06-20 16:16:23,901 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914213.005 to: ./preindex/1978/1914213.005
2017-06-20 16:16:23,901 INFO CopyFiles$ Processing DocNum: 1782643, FileYear: 1978, FileMd: 608, Files: List(Z:\I\1978\06\08\1782643.001, Z:\I\1978\06\08\1782643.002, Z:\I\1978\06\08\1782643.003)
2017-06-20 16:16:23,901 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1782643.001 to: ./preindex/1978/1782643.001
2017-06-20 16:16:23,916 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1782643.002 to: ./preindex/1978/1782643.002
2017-06-20 16:16:23,932 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1782643.003 to: ./preindex/1978/1782643.003
2017-06-20 16:16:23,932 INFO CopyFiles$ Processing DocNum: 1814542, FileYear: 1978, FileMd: 724, Files: List(Z:\I\1978\07\24\1814542.001, Z:\I\1978\07\24\1814542.002, Z:\I\1978\07\24\1814542.003, Z:\I\1978\07\24\1814542.004)
2017-06-20 16:16:23,932 INFO CopyFiles$ Copying: Z:\I\1978\07\24\1814542.001 to: ./preindex/1978/1814542.001
2017-06-20 16:16:23,947 INFO CopyFiles$ Copying: Z:\I\1978\07\24\1814542.002 to: ./preindex/1978/1814542.002
2017-06-20 16:16:23,963 INFO CopyFiles$ Copying: Z:\I\1978\07\24\1814542.003 to: ./preindex/1978/1814542.003
2017-06-20 16:16:23,963 INFO CopyFiles$ Copying: Z:\I\1978\07\24\1814542.004 to: ./preindex/1978/1814542.004
2017-06-20 16:16:23,979 INFO CopyFiles$ Processing DocNum: 1888988, FileYear: 1978, FileMd: 1101, Files: List(Z:\I\1978\11\01\1888988.001, Z:\I\1978\11\01\1888988.002, Z:\I\1978\11\01\1888988.003, Z:\I\1978\11\01\1888988.004)
2017-06-20 16:16:23,979 INFO CopyFiles$ Copying: Z:\I\1978\11\01\1888988.001 to: ./preindex/1978/1888988.001
2017-06-20 16:16:23,994 INFO CopyFiles$ Copying: Z:\I\1978\11\01\1888988.002 to: ./preindex/1978/1888988.002
2017-06-20 16:16:23,994 INFO CopyFiles$ Copying: Z:\I\1978\11\01\1888988.003 to: ./preindex/1978/1888988.003
2017-06-20 16:16:24,010 INFO CopyFiles$ Copying: Z:\I\1978\11\01\1888988.004 to: ./preindex/1978/1888988.004
2017-06-20 16:16:24,010 INFO CopyFiles$ Processing DocNum: 1905768, FileYear: 1978, FileMd: 1127, Files: List(Z:\I\1978\11\27\1905768.001, Z:\I\1978\11\27\1905768.002, Z:\I\1978\11\27\1905768.003)
2017-06-20 16:16:24,010 INFO CopyFiles$ Copying: Z:\I\1978\11\27\1905768.001 to: ./preindex/1978/1905768.001
2017-06-20 16:16:24,025 INFO CopyFiles$ Copying: Z:\I\1978\11\27\1905768.002 to: ./preindex/1978/1905768.002
2017-06-20 16:16:24,025 INFO CopyFiles$ Copying: Z:\I\1978\11\27\1905768.003 to: ./preindex/1978/1905768.003
2017-06-20 16:16:24,041 INFO CopyFiles$ Processing DocNum: 1899214, FileYear: 1978, FileMd: 1115, Files: List(Z:\I\1978\11\15\1899214.001, Z:\I\1978\11\15\1899214.002, Z:\I\1978\11\15\1899214.003, Z:\I\1978\11\15\1899214.004)
2017-06-20 16:16:24,041 INFO CopyFiles$ Copying: Z:\I\1978\11\15\1899214.001 to: ./preindex/1978/1899214.001
2017-06-20 16:16:24,057 INFO CopyFiles$ Copying: Z:\I\1978\11\15\1899214.002 to: ./preindex/1978/1899214.002
2017-06-20 16:16:24,057 INFO CopyFiles$ Copying: Z:\I\1978\11\15\1899214.003 to: ./preindex/1978/1899214.003
2017-06-20 16:16:24,072 INFO CopyFiles$ Copying: Z:\I\1978\11\15\1899214.004 to: ./preindex/1978/1899214.004
2017-06-20 16:16:24,088 INFO CopyFiles$ Processing DocNum: 1846477, FileYear: 1978, FileMd: 901, Files: List(Z:\I\1978\09\01\1846477.001, Z:\I\1978\09\01\1846477.002, Z:\I\1978\09\01\1846477.003)
2017-06-20 16:16:24,088 INFO CopyFiles$ Copying: Z:\I\1978\09\01\1846477.001 to: ./preindex/1978/1846477.001
2017-06-20 16:16:24,103 INFO CopyFiles$ Copying: Z:\I\1978\09\01\1846477.002 to: ./preindex/1978/1846477.002
2017-06-20 16:16:24,103 INFO CopyFiles$ Copying: Z:\I\1978\09\01\1846477.003 to: ./preindex/1978/1846477.003
2017-06-20 16:16:24,119 INFO CopyFiles$ Processing DocNum: 1762900, FileYear: 1978, FileMd: 511, Files: List(Z:\I\1978\05\11\1762900.001, Z:\I\1978\05\11\1762900.002)
2017-06-20 16:16:24,119 INFO CopyFiles$ Copying: Z:\I\1978\05\11\1762900.001 to: ./preindex/1978/1762900.001
2017-06-20 16:16:24,150 INFO CopyFiles$ Copying: Z:\I\1978\05\11\1762900.002 to: ./preindex/1978/1762900.002
2017-06-20 16:16:24,166 INFO CopyFiles$ Processing DocNum: 1882897, FileYear: 1978, FileMd: 1023, Files: List(Z:\I\1978\10\23\1882897.001, Z:\I\1978\10\23\1882897.002, Z:\I\1978\10\23\1882897.003)
2017-06-20 16:16:24,166 INFO CopyFiles$ Copying: Z:\I\1978\10\23\1882897.001 to: ./preindex/1978/1882897.001
2017-06-20 16:16:24,181 INFO CopyFiles$ Copying: Z:\I\1978\10\23\1882897.002 to: ./preindex/1978/1882897.002
2017-06-20 16:16:24,181 INFO CopyFiles$ Copying: Z:\I\1978\10\23\1882897.003 to: ./preindex/1978/1882897.003
2017-06-20 16:16:24,197 INFO CopyFiles$ Processing DocNum: 1905771, FileYear: 1978, FileMd: 1127, Files: List(Z:\I\1978\11\27\1905771.001, Z:\I\1978\11\27\1905771.002, Z:\I\1978\11\27\1905771.003)
2017-06-20 16:16:24,197 INFO CopyFiles$ Copying: Z:\I\1978\11\27\1905771.001 to: ./preindex/1978/1905771.001
2017-06-20 16:16:24,197 INFO CopyFiles$ Copying: Z:\I\1978\11\27\1905771.002 to: ./preindex/1978/1905771.002
2017-06-20 16:16:24,213 INFO CopyFiles$ Copying: Z:\I\1978\11\27\1905771.003 to: ./preindex/1978/1905771.003
2017-06-20 16:16:24,213 INFO CopyFiles$ Processing DocNum: 1710900, FileYear: 1978, FileMd: 228, Files: List(Z:\I\1978\02\28\1710900.001)
2017-06-20 16:16:24,213 INFO CopyFiles$ Copying: Z:\I\1978\02\28\1710900.001 to: ./preindex/1978/1710900.001
2017-06-20 16:16:24,244 INFO CopyFiles$ Processing DocNum: 1782616, FileYear: 1978, FileMd: 608, Files: List(Z:\I\1978\06\08\1782616.001, Z:\I\1978\06\08\1782616.002, Z:\I\1978\06\08\1782616.003)
2017-06-20 16:16:24,244 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1782616.001 to: ./preindex/1978/1782616.001
2017-06-20 16:16:24,244 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1782616.002 to: ./preindex/1978/1782616.002
2017-06-20 16:16:24,259 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1782616.003 to: ./preindex/1978/1782616.003
2017-06-20 16:16:24,259 INFO CopyFiles$ Processing DocNum: 1721332, FileYear: 1978, FileMd: 314, Files: List(Z:\I\1978\03\14\1721332.001, Z:\I\1978\03\14\1721332.002)
2017-06-20 16:16:24,259 INFO CopyFiles$ Copying: Z:\I\1978\03\14\1721332.001 to: ./preindex/1978/1721332.001
2017-06-20 16:16:24,275 INFO CopyFiles$ Copying: Z:\I\1978\03\14\1721332.002 to: ./preindex/1978/1721332.002
2017-06-20 16:16:24,275 INFO CopyFiles$ Processing DocNum: 1701636, FileYear: 1978, FileMd: 214, Files: List(Z:\I\1978\02\14\1701636.001, Z:\I\1978\02\14\1701636.002)
2017-06-20 16:16:24,291 INFO CopyFiles$ Copying: Z:\I\1978\02\14\1701636.001 to: ./preindex/1978/1701636.001
2017-06-20 16:16:24,306 INFO CopyFiles$ Copying: Z:\I\1978\02\14\1701636.002 to: ./preindex/1978/1701636.002
2017-06-20 16:16:24,322 INFO CopyFiles$ Processing DocNum: 1782713, FileYear: 1978, FileMd: 608, Files: List(Z:\I\1978\06\08\1782713.001, Z:\I\1978\06\08\1782713.002, Z:\I\1978\06\08\1782713.003, Z:\I\1978\06\08\1782713.004, Z:\I\1978\06\08\1782713.005)
2017-06-20 16:16:24,322 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1782713.001 to: ./preindex/1978/1782713.001
2017-06-20 16:16:24,322 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1782713.002 to: ./preindex/1978/1782713.002
2017-06-20 16:16:24,337 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1782713.003 to: ./preindex/1978/1782713.003
2017-06-20 16:16:24,337 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1782713.004 to: ./preindex/1978/1782713.004
2017-06-20 16:16:24,337 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1782713.005 to: ./preindex/1978/1782713.005
2017-06-20 16:16:24,353 INFO CopyFiles$ Processing DocNum: 1914182, FileYear: 1978, FileMd: 1212, Files: List(Z:\I\1978\12\12\1914182.001, Z:\I\1978\12\12\1914182.002, Z:\I\1978\12\12\1914182.003, Z:\I\1978\12\12\1914182.004, Z:\I\1978\12\12\1914182.005, Z:\I\1978\12\12\1914182.006)
2017-06-20 16:16:24,353 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914182.001 to: ./preindex/1978/1914182.001
2017-06-20 16:16:24,369 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914182.002 to: ./preindex/1978/1914182.002
2017-06-20 16:16:24,369 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914182.003 to: ./preindex/1978/1914182.003
2017-06-20 16:16:24,369 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914182.004 to: ./preindex/1978/1914182.004
2017-06-20 16:16:24,384 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914182.005 to: ./preindex/1978/1914182.005
2017-06-20 16:16:24,384 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914182.006 to: ./preindex/1978/1914182.006
2017-06-20 16:16:24,400 INFO CopyFiles$ Processing DocNum: 1700794, FileYear: 1978, FileMd: 213, Files: List(Z:\I\1978\02\13\1700794.001, Z:\I\1978\02\13\1700794.002, Z:\I\1978\02\13\1700794.003)
2017-06-20 16:16:24,400 INFO CopyFiles$ Copying: Z:\I\1978\02\13\1700794.001 to: ./preindex/1978/1700794.001
2017-06-20 16:16:24,415 INFO CopyFiles$ Copying: Z:\I\1978\02\13\1700794.002 to: ./preindex/1978/1700794.002
2017-06-20 16:16:24,415 INFO CopyFiles$ Copying: Z:\I\1978\02\13\1700794.003 to: ./preindex/1978/1700794.003
2017-06-20 16:16:24,431 INFO CopyFiles$ Processing DocNum: 1886208, FileYear: 1978, FileMd: 1027, Files: List(Z:\I\1978\10\27\1886208.001, Z:\I\1978\10\27\1886208.002)
2017-06-20 16:16:24,431 INFO CopyFiles$ Copying: Z:\I\1978\10\27\1886208.001 to: ./preindex/1978/1886208.001
2017-06-20 16:16:24,447 INFO CopyFiles$ Copying: Z:\I\1978\10\27\1886208.002 to: ./preindex/1978/1886208.002
2017-06-20 16:16:24,462 INFO CopyFiles$ Processing DocNum: 1903549, FileYear: 1978, FileMd: 1121, Files: List(Z:\I\1978\11\21\1903549.001, Z:\I\1978\11\21\1903549.002, Z:\I\1978\11\21\1903549.003, Z:\I\1978\11\21\1903549.004, Z:\I\1978\11\21\1903549.005, Z:\I\1978\11\21\1903549.006)
2017-06-20 16:16:24,462 INFO CopyFiles$ Copying: Z:\I\1978\11\21\1903549.001 to: ./preindex/1978/1903549.001
2017-06-20 16:16:24,462 INFO CopyFiles$ Copying: Z:\I\1978\11\21\1903549.002 to: ./preindex/1978/1903549.002
2017-06-20 16:16:24,478 INFO CopyFiles$ Copying: Z:\I\1978\11\21\1903549.003 to: ./preindex/1978/1903549.003
2017-06-20 16:16:24,478 INFO CopyFiles$ Copying: Z:\I\1978\11\21\1903549.004 to: ./preindex/1978/1903549.004
2017-06-20 16:16:24,493 INFO CopyFiles$ Copying: Z:\I\1978\11\21\1903549.005 to: ./preindex/1978/1903549.005
2017-06-20 16:16:24,493 INFO CopyFiles$ Copying: Z:\I\1978\11\21\1903549.006 to: ./preindex/1978/1903549.006
2017-06-20 16:16:24,509 INFO CopyFiles$ Processing DocNum: 1849467, FileYear: 1978, FileMd: 907, Files: List(Z:\I\1978\09\07\1849467.001, Z:\I\1978\09\07\1849467.002, Z:\I\1978\09\07\1849467.003)
2017-06-20 16:16:24,509 INFO CopyFiles$ Copying: Z:\I\1978\09\07\1849467.001 to: ./preindex/1978/1849467.001
2017-06-20 16:16:24,525 INFO CopyFiles$ Copying: Z:\I\1978\09\07\1849467.002 to: ./preindex/1978/1849467.002
2017-06-20 16:16:24,540 INFO CopyFiles$ Copying: Z:\I\1978\09\07\1849467.003 to: ./preindex/1978/1849467.003
2017-06-20 16:16:24,571 INFO CopyFiles$ Processing DocNum: 1742400, FileYear: 1978, FileMd: 413, Files: List(Z:\I\1978\04\13\1742400.001, Z:\I\1978\04\13\1742400.002, Z:\I\1978\04\13\1742400.003, Z:\I\1978\04\13\1742400.004, Z:\I\1978\04\13\1742400.005, Z:\I\1978\04\13\1742400.006, Z:\I\1978\04\13\1742400.007, Z:\I\1978\04\13\1742400.008)
2017-06-20 16:16:24,571 INFO CopyFiles$ Copying: Z:\I\1978\04\13\1742400.001 to: ./preindex/1978/1742400.001
2017-06-20 16:16:24,603 INFO CopyFiles$ Copying: Z:\I\1978\04\13\1742400.002 to: ./preindex/1978/1742400.002
2017-06-20 16:16:24,618 INFO CopyFiles$ Copying: Z:\I\1978\04\13\1742400.003 to: ./preindex/1978/1742400.003
2017-06-20 16:16:24,634 INFO CopyFiles$ Copying: Z:\I\1978\04\13\1742400.004 to: ./preindex/1978/1742400.004
2017-06-20 16:16:24,649 INFO CopyFiles$ Copying: Z:\I\1978\04\13\1742400.005 to: ./preindex/1978/1742400.005
2017-06-20 16:16:24,649 INFO CopyFiles$ Copying: Z:\I\1978\04\13\1742400.006 to: ./preindex/1978/1742400.006
2017-06-20 16:16:24,665 INFO CopyFiles$ Copying: Z:\I\1978\04\13\1742400.007 to: ./preindex/1978/1742400.007
2017-06-20 16:16:24,696 INFO CopyFiles$ Copying: Z:\I\1978\04\13\1742400.008 to: ./preindex/1978/1742400.008
2017-06-20 16:16:24,712 INFO CopyFiles$ Processing DocNum: 1914208, FileYear: 1978, FileMd: 1212, Files: List(Z:\I\1978\12\12\1914208.001, Z:\I\1978\12\12\1914208.002, Z:\I\1978\12\12\1914208.003, Z:\I\1978\12\12\1914208.004, Z:\I\1978\12\12\1914208.005)
2017-06-20 16:16:24,712 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914208.001 to: ./preindex/1978/1914208.001
2017-06-20 16:16:24,712 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914208.002 to: ./preindex/1978/1914208.002
2017-06-20 16:16:24,712 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914208.003 to: ./preindex/1978/1914208.003
2017-06-20 16:16:24,727 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914208.004 to: ./preindex/1978/1914208.004
2017-06-20 16:16:24,727 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914208.005 to: ./preindex/1978/1914208.005
2017-06-20 16:16:24,743 INFO CopyFiles$ Processing DocNum: 1715499, FileYear: 1978, FileMd: 306, Files: List(Z:\I\1978\03\06\1715499.001, Z:\I\1978\03\06\1715499.002, Z:\I\1978\03\06\1715499.003)
2017-06-20 16:16:24,743 INFO CopyFiles$ Copying: Z:\I\1978\03\06\1715499.001 to: ./preindex/1978/1715499.001
2017-06-20 16:16:24,743 INFO CopyFiles$ Copying: Z:\I\1978\03\06\1715499.002 to: ./preindex/1978/1715499.002
2017-06-20 16:16:24,759 INFO CopyFiles$ Copying: Z:\I\1978\03\06\1715499.003 to: ./preindex/1978/1715499.003
2017-06-20 16:16:24,774 INFO CopyFiles$ Processing DocNum: 1712161, FileYear: 1978, FileMd: 301, Files: List(Z:\I\1978\03\01\1712161.001, Z:\I\1978\03\01\1712161.002)
2017-06-20 16:16:24,774 INFO CopyFiles$ Copying: Z:\I\1978\03\01\1712161.001 to: ./preindex/1978/1712161.001
2017-06-20 16:16:24,790 INFO CopyFiles$ Copying: Z:\I\1978\03\01\1712161.002 to: ./preindex/1978/1712161.002
2017-06-20 16:16:24,805 INFO CopyFiles$ Processing DocNum: 1790128, FileYear: 1978, FileMd: 620, Files: List(Z:\I\1978\06\20\1790128.001, Z:\I\1978\06\20\1790128.002)
2017-06-20 16:16:24,805 INFO CopyFiles$ Copying: Z:\I\1978\06\20\1790128.001 to: ./preindex/1978/1790128.001
2017-06-20 16:16:24,821 INFO CopyFiles$ Copying: Z:\I\1978\06\20\1790128.002 to: ./preindex/1978/1790128.002
2017-06-20 16:16:24,837 INFO CopyFiles$ Processing DocNum: 1894167, FileYear: 1978, FileMd: 1107, Files: List(Z:\I\1978\11\07\1894167.001, Z:\I\1978\11\07\1894167.002, Z:\I\1978\11\07\1894167.003, Z:\I\1978\11\07\1894167.004)
2017-06-20 16:16:24,837 INFO CopyFiles$ Copying: Z:\I\1978\11\07\1894167.001 to: ./preindex/1978/1894167.001
2017-06-20 16:16:24,852 INFO CopyFiles$ Copying: Z:\I\1978\11\07\1894167.002 to: ./preindex/1978/1894167.002
2017-06-20 16:16:24,868 INFO CopyFiles$ Copying: Z:\I\1978\11\07\1894167.003 to: ./preindex/1978/1894167.003
2017-06-20 16:16:24,868 INFO CopyFiles$ Copying: Z:\I\1978\11\07\1894167.004 to: ./preindex/1978/1894167.004
2017-06-20 16:16:24,883 INFO CopyFiles$ Processing DocNum: 1728741, FileYear: 1978, FileMd: 324, Files: List(Z:\I\1978\03\24\1728741.001, Z:\I\1978\03\24\1728741.002, Z:\I\1978\03\24\1728741.003, Z:\I\1978\03\24\1728741.004)
2017-06-20 16:16:24,883 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1728741.001 to: ./preindex/1978/1728741.001
2017-06-20 16:16:24,899 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1728741.002 to: ./preindex/1978/1728741.002
2017-06-20 16:16:24,915 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1728741.003 to: ./preindex/1978/1728741.003
2017-06-20 16:16:24,915 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1728741.004 to: ./preindex/1978/1728741.004
2017-06-20 16:16:24,930 INFO CopyFiles$ Processing DocNum: 1884860, FileYear: 1978, FileMd: 1026, Files: List(Z:\I\1978\10\26\1884860.001, Z:\I\1978\10\26\1884860.002, Z:\I\1978\10\26\1884860.003, Z:\I\1978\10\26\1884860.004)
2017-06-20 16:16:24,930 INFO CopyFiles$ Copying: Z:\I\1978\10\26\1884860.001 to: ./preindex/1978/1884860.001
2017-06-20 16:16:24,930 INFO CopyFiles$ Copying: Z:\I\1978\10\26\1884860.002 to: ./preindex/1978/1884860.002
2017-06-20 16:16:24,930 INFO CopyFiles$ Copying: Z:\I\1978\10\26\1884860.003 to: ./preindex/1978/1884860.003
2017-06-20 16:16:24,946 INFO CopyFiles$ Copying: Z:\I\1978\10\26\1884860.004 to: ./preindex/1978/1884860.004
2017-06-20 16:16:24,961 INFO CopyFiles$ Processing DocNum: 1729454, FileYear: 1978, FileMd: 327, Files: List(Z:\I\1978\03\27\1729454.001, Z:\I\1978\03\27\1729454.002, Z:\I\1978\03\27\1729454.003, Z:\I\1978\03\27\1729454.004)
2017-06-20 16:16:24,961 INFO CopyFiles$ Copying: Z:\I\1978\03\27\1729454.001 to: ./preindex/1978/1729454.001
2017-06-20 16:16:24,977 INFO CopyFiles$ Copying: Z:\I\1978\03\27\1729454.002 to: ./preindex/1978/1729454.002
2017-06-20 16:16:24,977 INFO CopyFiles$ Copying: Z:\I\1978\03\27\1729454.003 to: ./preindex/1978/1729454.003
2017-06-20 16:16:24,993 INFO CopyFiles$ Copying: Z:\I\1978\03\27\1729454.004 to: ./preindex/1978/1729454.004
2017-06-20 16:16:24,993 INFO CopyFiles$ Processing DocNum: 1813926, FileYear: 1978, FileMd: 721, Files: List(Z:\I\1978\07\21\1813926.001, Z:\I\1978\07\21\1813926.002, Z:\I\1978\07\21\1813926.003)
2017-06-20 16:16:24,993 INFO CopyFiles$ Copying: Z:\I\1978\07\21\1813926.001 to: ./preindex/1978/1813926.001
2017-06-20 16:16:25,008 INFO CopyFiles$ Copying: Z:\I\1978\07\21\1813926.002 to: ./preindex/1978/1813926.002
2017-06-20 16:16:25,008 INFO CopyFiles$ Copying: Z:\I\1978\07\21\1813926.003 to: ./preindex/1978/1813926.003
2017-06-20 16:16:25,024 INFO CopyFiles$ Processing DocNum: 1900804, FileYear: 1978, FileMd: 1116, Files: List(Z:\I\1978\11\16\1900804.001, Z:\I\1978\11\16\1900804.002, Z:\I\1978\11\16\1900804.003)
2017-06-20 16:16:25,024 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900804.001 to: ./preindex/1978/1900804.001
2017-06-20 16:16:25,039 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900804.002 to: ./preindex/1978/1900804.002
2017-06-20 16:16:25,039 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900804.003 to: ./preindex/1978/1900804.003
2017-06-20 16:16:25,055 INFO CopyFiles$ Processing DocNum: 1728768, FileYear: 1978, FileMd: 324, Files: List(Z:\I\1978\03\24\1728768.001, Z:\I\1978\03\24\1728768.002, Z:\I\1978\03\24\1728768.003, Z:\I\1978\03\24\1728768.004, Z:\I\1978\03\24\1728768.005)
2017-06-20 16:16:25,055 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1728768.001 to: ./preindex/1978/1728768.001
2017-06-20 16:16:25,055 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1728768.002 to: ./preindex/1978/1728768.002
2017-06-20 16:16:25,071 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1728768.003 to: ./preindex/1978/1728768.003
2017-06-20 16:16:25,086 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1728768.004 to: ./preindex/1978/1728768.004
2017-06-20 16:16:25,086 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1728768.005 to: ./preindex/1978/1728768.005
2017-06-20 16:16:25,102 INFO CopyFiles$ Processing DocNum: 1814294, FileYear: 1978, FileMd: 721, Files: List(Z:\I\1978\07\21\1814294.001, Z:\I\1978\07\21\1814294.002)
2017-06-20 16:16:25,102 INFO CopyFiles$ Copying: Z:\I\1978\07\21\1814294.001 to: ./preindex/1978/1814294.001
2017-06-20 16:16:25,102 INFO CopyFiles$ Copying: Z:\I\1978\07\21\1814294.002 to: ./preindex/1978/1814294.002
2017-06-20 16:16:25,117 INFO CopyFiles$ Processing DocNum: 1686992, FileYear: 1978, FileMd: 120, Files: List(Z:\I\1978\01\20\1686992.001, Z:\I\1978\01\20\1686992.002, Z:\I\1978\01\20\1686992.003)
2017-06-20 16:16:25,117 INFO CopyFiles$ Copying: Z:\I\1978\01\20\1686992.001 to: ./preindex/1978/1686992.001
2017-06-20 16:16:25,133 INFO CopyFiles$ Copying: Z:\I\1978\01\20\1686992.002 to: ./preindex/1978/1686992.002
2017-06-20 16:16:25,149 INFO CopyFiles$ Copying: Z:\I\1978\01\20\1686992.003 to: ./preindex/1978/1686992.003
2017-06-20 16:16:25,180 INFO CopyFiles$ Processing DocNum: 1871444, FileYear: 1978, FileMd: 1005, Files: List(Z:\I\1978\10\05\1871444.001, Z:\I\1978\10\05\1871444.002, Z:\I\1978\10\05\1871444.003, Z:\I\1978\10\05\1871444.004, Z:\I\1978\10\05\1871444.005, Z:\I\1978\10\05\1871444.006, Z:\I\1978\10\05\1871444.007, Z:\I\1978\10\05\1871444.008, Z:\I\1978\10\05\1871444.009, Z:\I\1978\10\05\1871444.010)
2017-06-20 16:16:25,180 INFO CopyFiles$ Copying: Z:\I\1978\10\05\1871444.001 to: ./preindex/1978/1871444.001
2017-06-20 16:16:25,195 INFO CopyFiles$ Copying: Z:\I\1978\10\05\1871444.002 to: ./preindex/1978/1871444.002
2017-06-20 16:16:25,211 INFO CopyFiles$ Copying: Z:\I\1978\10\05\1871444.003 to: ./preindex/1978/1871444.003
2017-06-20 16:16:25,227 INFO CopyFiles$ Copying: Z:\I\1978\10\05\1871444.004 to: ./preindex/1978/1871444.004
2017-06-20 16:16:25,242 INFO CopyFiles$ Copying: Z:\I\1978\10\05\1871444.005 to: ./preindex/1978/1871444.005
2017-06-20 16:16:25,258 INFO CopyFiles$ Copying: Z:\I\1978\10\05\1871444.006 to: ./preindex/1978/1871444.006
2017-06-20 16:16:25,273 INFO CopyFiles$ Copying: Z:\I\1978\10\05\1871444.007 to: ./preindex/1978/1871444.007
2017-06-20 16:16:25,289 INFO CopyFiles$ Copying: Z:\I\1978\10\05\1871444.008 to: ./preindex/1978/1871444.008
2017-06-20 16:16:25,305 INFO CopyFiles$ Copying: Z:\I\1978\10\05\1871444.009 to: ./preindex/1978/1871444.009
2017-06-20 16:16:25,320 INFO CopyFiles$ Copying: Z:\I\1978\10\05\1871444.010 to: ./preindex/1978/1871444.010
2017-06-20 16:16:25,320 INFO CopyFiles$ Processing DocNum: 1898432, FileYear: 1978, FileMd: 1114, Files: List(Z:\I\1978\11\14\1898432.001, Z:\I\1978\11\14\1898432.002, Z:\I\1978\11\14\1898432.003, Z:\I\1978\11\14\1898432.004)
2017-06-20 16:16:25,336 INFO CopyFiles$ Copying: Z:\I\1978\11\14\1898432.001 to: ./preindex/1978/1898432.001
2017-06-20 16:16:25,336 INFO CopyFiles$ Copying: Z:\I\1978\11\14\1898432.002 to: ./preindex/1978/1898432.002
2017-06-20 16:16:25,351 INFO CopyFiles$ Copying: Z:\I\1978\11\14\1898432.003 to: ./preindex/1978/1898432.003
2017-06-20 16:16:25,351 INFO CopyFiles$ Copying: Z:\I\1978\11\14\1898432.004 to: ./preindex/1978/1898432.004
2017-06-20 16:16:25,351 INFO CopyFiles$ Processing DocNum: 1686982, FileYear: 1978, FileMd: 120, Files: List(Z:\I\1978\01\20\1686982.001, Z:\I\1978\01\20\1686982.002)
2017-06-20 16:16:25,351 INFO CopyFiles$ Copying: Z:\I\1978\01\20\1686982.001 to: ./preindex/1978/1686982.001
2017-06-20 16:16:25,383 INFO CopyFiles$ Copying: Z:\I\1978\01\20\1686982.002 to: ./preindex/1978/1686982.002
2017-06-20 16:16:25,398 INFO CopyFiles$ Processing DocNum: 1890014, FileYear: 1978, FileMd: 1102, Files: List(Z:\I\1978\11\02\1890014.001, Z:\I\1978\11\02\1890014.002, Z:\I\1978\11\02\1890014.003, Z:\I\1978\11\02\1890014.004)
2017-06-20 16:16:25,398 INFO CopyFiles$ Copying: Z:\I\1978\11\02\1890014.001 to: ./preindex/1978/1890014.001
2017-06-20 16:16:25,414 INFO CopyFiles$ Copying: Z:\I\1978\11\02\1890014.002 to: ./preindex/1978/1890014.002
2017-06-20 16:16:25,414 INFO CopyFiles$ Copying: Z:\I\1978\11\02\1890014.003 to: ./preindex/1978/1890014.003
2017-06-20 16:16:25,414 INFO CopyFiles$ Copying: Z:\I\1978\11\02\1890014.004 to: ./preindex/1978/1890014.004
2017-06-20 16:16:25,445 INFO CopyFiles$ Processing DocNum: 1802013, FileYear: 1978, FileMd: 706, Files: List(Z:\I\1978\07\06\1802013.001, Z:\I\1978\07\06\1802013.002)
2017-06-20 16:16:25,445 INFO CopyFiles$ Copying: Z:\I\1978\07\06\1802013.001 to: ./preindex/1978/1802013.001
2017-06-20 16:16:25,461 INFO CopyFiles$ Copying: Z:\I\1978\07\06\1802013.002 to: ./preindex/1978/1802013.002
2017-06-20 16:16:25,476 INFO CopyFiles$ Processing DocNum: 1793163, FileYear: 1978, FileMd: 623, Files: List(Z:\I\1978\06\23\1793163.001, Z:\I\1978\06\23\1793163.002)
2017-06-20 16:16:25,476 INFO CopyFiles$ Copying: Z:\I\1978\06\23\1793163.001 to: ./preindex/1978/1793163.001
2017-06-20 16:16:25,492 INFO CopyFiles$ Copying: Z:\I\1978\06\23\1793163.002 to: ./preindex/1978/1793163.002
2017-06-20 16:16:25,507 INFO CopyFiles$ Processing DocNum: 1862351, FileYear: 1978, FileMd: 925, Files: List(Z:\I\1978\09\25\1862351.001, Z:\I\1978\09\25\1862351.002, Z:\I\1978\09\25\1862351.003)
2017-06-20 16:16:25,507 INFO CopyFiles$ Copying: Z:\I\1978\09\25\1862351.001 to: ./preindex/1978/1862351.001
2017-06-20 16:16:25,523 INFO CopyFiles$ Copying: Z:\I\1978\09\25\1862351.002 to: ./preindex/1978/1862351.002
2017-06-20 16:16:25,539 INFO CopyFiles$ Copying: Z:\I\1978\09\25\1862351.003 to: ./preindex/1978/1862351.003
2017-06-20 16:16:25,539 INFO CopyFiles$ Processing DocNum: 1820684, FileYear: 1978, FileMd: 801, Files: List(Z:\I\1978\08\01\1820684.001, Z:\I\1978\08\01\1820684.002)
2017-06-20 16:16:25,539 INFO CopyFiles$ Copying: Z:\I\1978\08\01\1820684.001 to: ./preindex/1978/1820684.001
2017-06-20 16:16:25,554 INFO CopyFiles$ Copying: Z:\I\1978\08\01\1820684.002 to: ./preindex/1978/1820684.002
2017-06-20 16:16:25,570 INFO CopyFiles$ Processing DocNum: 1847389, FileYear: 1978, FileMd: 905, Files: List(Z:\I\1978\09\05\1847389.001, Z:\I\1978\09\05\1847389.002, Z:\I\1978\09\05\1847389.003, Z:\I\1978\09\05\1847389.004)
2017-06-20 16:16:25,570 INFO CopyFiles$ Copying: Z:\I\1978\09\05\1847389.001 to: ./preindex/1978/1847389.001
2017-06-20 16:16:25,585 INFO CopyFiles$ Copying: Z:\I\1978\09\05\1847389.002 to: ./preindex/1978/1847389.002
2017-06-20 16:16:25,601 INFO CopyFiles$ Copying: Z:\I\1978\09\05\1847389.003 to: ./preindex/1978/1847389.003
2017-06-20 16:16:25,601 INFO CopyFiles$ Copying: Z:\I\1978\09\05\1847389.004 to: ./preindex/1978/1847389.004
2017-06-20 16:16:25,617 INFO CopyFiles$ Processing DocNum: 1699737, FileYear: 1978, FileMd: 209, Files: List(Z:\I\1978\02\09\1699737.001, Z:\I\1978\02\09\1699737.002, Z:\I\1978\02\09\1699737.003, Z:\I\1978\02\09\1699737.004)
2017-06-20 16:16:25,617 INFO CopyFiles$ Copying: Z:\I\1978\02\09\1699737.001 to: ./preindex/1978/1699737.001
2017-06-20 16:16:25,632 INFO CopyFiles$ Copying: Z:\I\1978\02\09\1699737.002 to: ./preindex/1978/1699737.002
2017-06-20 16:16:25,632 INFO CopyFiles$ Copying: Z:\I\1978\02\09\1699737.003 to: ./preindex/1978/1699737.003
2017-06-20 16:16:25,648 INFO CopyFiles$ Copying: Z:\I\1978\02\09\1699737.004 to: ./preindex/1978/1699737.004
2017-06-20 16:16:25,663 INFO CopyFiles$ Processing DocNum: 1808681, FileYear: 1978, FileMd: 714, Files: List(Z:\I\1978\07\14\1808681.001, Z:\I\1978\07\14\1808681.002, Z:\I\1978\07\14\1808681.003, Z:\I\1978\07\14\1808681.004)
2017-06-20 16:16:25,663 INFO CopyFiles$ Copying: Z:\I\1978\07\14\1808681.001 to: ./preindex/1978/1808681.001
2017-06-20 16:16:25,679 INFO CopyFiles$ Copying: Z:\I\1978\07\14\1808681.002 to: ./preindex/1978/1808681.002
2017-06-20 16:16:25,695 INFO CopyFiles$ Copying: Z:\I\1978\07\14\1808681.003 to: ./preindex/1978/1808681.003
2017-06-20 16:16:25,710 INFO CopyFiles$ Copying: Z:\I\1978\07\14\1808681.004 to: ./preindex/1978/1808681.004
2017-06-20 16:16:25,726 INFO CopyFiles$ Processing DocNum: 1802402, FileYear: 1978, FileMd: 707, Files: List(Z:\I\1978\07\07\1802402.001, Z:\I\1978\07\07\1802402.002, Z:\I\1978\07\07\1802402.003, Z:\I\1978\07\07\1802402.004, Z:\I\1978\07\07\1802402.005)
2017-06-20 16:16:25,726 INFO CopyFiles$ Copying: Z:\I\1978\07\07\1802402.001 to: ./preindex/1978/1802402.001
2017-06-20 16:16:25,741 INFO CopyFiles$ Copying: Z:\I\1978\07\07\1802402.002 to: ./preindex/1978/1802402.002
2017-06-20 16:16:25,741 INFO CopyFiles$ Copying: Z:\I\1978\07\07\1802402.003 to: ./preindex/1978/1802402.003
2017-06-20 16:16:25,757 INFO CopyFiles$ Copying: Z:\I\1978\07\07\1802402.004 to: ./preindex/1978/1802402.004
2017-06-20 16:16:25,773 INFO CopyFiles$ Copying: Z:\I\1978\07\07\1802402.005 to: ./preindex/1978/1802402.005
2017-06-20 16:16:25,773 INFO CopyFiles$ Processing DocNum: 1901120, FileYear: 1978, FileMd: 1117, Files: List(Z:\I\1978\11\17\1901120.001, Z:\I\1978\11\17\1901120.002, Z:\I\1978\11\17\1901120.003)
2017-06-20 16:16:25,773 INFO CopyFiles$ Copying: Z:\I\1978\11\17\1901120.001 to: ./preindex/1978/1901120.001
2017-06-20 16:16:25,788 INFO CopyFiles$ Copying: Z:\I\1978\11\17\1901120.002 to: ./preindex/1978/1901120.002
2017-06-20 16:16:25,788 INFO CopyFiles$ Copying: Z:\I\1978\11\17\1901120.003 to: ./preindex/1978/1901120.003
2017-06-20 16:16:25,788 INFO CopyFiles$ Processing DocNum: 1740616, FileYear: 1978, FileMd: 411, Files: List(Z:\I\1978\04\11\1740616.001, Z:\I\1978\04\11\1740616.002, Z:\I\1978\04\11\1740616.003)
2017-06-20 16:16:25,804 INFO CopyFiles$ Copying: Z:\I\1978\04\11\1740616.001 to: ./preindex/1978/1740616.001
2017-06-20 16:16:25,819 INFO CopyFiles$ Copying: Z:\I\1978\04\11\1740616.002 to: ./preindex/1978/1740616.002
2017-06-20 16:16:25,835 INFO CopyFiles$ Copying: Z:\I\1978\04\11\1740616.003 to: ./preindex/1978/1740616.003
2017-06-20 16:16:25,835 INFO CopyFiles$ Processing DocNum: 1904179, FileYear: 1978, FileMd: 1122, Files: List(Z:\I\1978\11\22\1904179.001, Z:\I\1978\11\22\1904179.002, Z:\I\1978\11\22\1904179.003)
2017-06-20 16:16:25,835 INFO CopyFiles$ Copying: Z:\I\1978\11\22\1904179.001 to: ./preindex/1978/1904179.001
2017-06-20 16:16:25,851 INFO CopyFiles$ Copying: Z:\I\1978\11\22\1904179.002 to: ./preindex/1978/1904179.002
2017-06-20 16:16:25,866 INFO CopyFiles$ Copying: Z:\I\1978\11\22\1904179.003 to: ./preindex/1978/1904179.003
2017-06-20 16:16:25,866 INFO CopyFiles$ Processing DocNum: 1707975, FileYear: 1978, FileMd: 223, Files: List(Z:\I\1978\02\23\1707975.001, Z:\I\1978\02\23\1707975.002)
2017-06-20 16:16:25,866 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1707975.001 to: ./preindex/1978/1707975.001
2017-06-20 16:16:25,897 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1707975.002 to: ./preindex/1978/1707975.002
2017-06-20 16:16:25,913 INFO CopyFiles$ Processing DocNum: 1837308, FileYear: 1978, FileMd: 822, Files: List(Z:\I\1978\08\22\1837308.001, Z:\I\1978\08\22\1837308.002, Z:\I\1978\08\22\1837308.003, Z:\I\1978\08\22\1837308.004)
2017-06-20 16:16:25,913 INFO CopyFiles$ Copying: Z:\I\1978\08\22\1837308.001 to: ./preindex/1978/1837308.001
2017-06-20 16:16:25,929 INFO CopyFiles$ Copying: Z:\I\1978\08\22\1837308.002 to: ./preindex/1978/1837308.002
2017-06-20 16:16:25,929 INFO CopyFiles$ Copying: Z:\I\1978\08\22\1837308.003 to: ./preindex/1978/1837308.003
2017-06-20 16:16:25,944 INFO CopyFiles$ Copying: Z:\I\1978\08\22\1837308.004 to: ./preindex/1978/1837308.004
2017-06-20 16:16:25,944 INFO CopyFiles$ Processing DocNum: 1834447, FileYear: 1978, FileMd: 817, Files: List(Z:\I\1978\08\17\1834447.001, Z:\I\1978\08\17\1834447.002)
2017-06-20 16:16:25,944 INFO CopyFiles$ Copying: Z:\I\1978\08\17\1834447.001 to: ./preindex/1978/1834447.001
2017-06-20 16:16:25,960 INFO CopyFiles$ Copying: Z:\I\1978\08\17\1834447.002 to: ./preindex/1978/1834447.002
2017-06-20 16:16:25,991 INFO CopyFiles$ Processing DocNum: 1791399, FileYear: 1978, FileMd: 621, Files: List(Z:\I\1978\06\21\1791399.001, Z:\I\1978\06\21\1791399.002, Z:\I\1978\06\21\1791399.003, Z:\I\1978\06\21\1791399.004, Z:\I\1978\06\21\1791399.005, Z:\I\1978\06\21\1791399.006, Z:\I\1978\06\21\1791399.007, Z:\I\1978\06\21\1791399.008)
2017-06-20 16:16:25,991 INFO CopyFiles$ Copying: Z:\I\1978\06\21\1791399.001 to: ./preindex/1978/1791399.001
2017-06-20 16:16:26,007 INFO CopyFiles$ Copying: Z:\I\1978\06\21\1791399.002 to: ./preindex/1978/1791399.002
2017-06-20 16:16:26,007 INFO CopyFiles$ Copying: Z:\I\1978\06\21\1791399.003 to: ./preindex/1978/1791399.003
2017-06-20 16:16:26,007 INFO CopyFiles$ Copying: Z:\I\1978\06\21\1791399.004 to: ./preindex/1978/1791399.004
2017-06-20 16:16:26,022 INFO CopyFiles$ Copying: Z:\I\1978\06\21\1791399.005 to: ./preindex/1978/1791399.005
2017-06-20 16:16:26,022 INFO CopyFiles$ Copying: Z:\I\1978\06\21\1791399.006 to: ./preindex/1978/1791399.006
2017-06-20 16:16:26,022 INFO CopyFiles$ Copying: Z:\I\1978\06\21\1791399.007 to: ./preindex/1978/1791399.007
2017-06-20 16:16:26,038 INFO CopyFiles$ Copying: Z:\I\1978\06\21\1791399.008 to: ./preindex/1978/1791399.008
2017-06-20 16:16:26,038 INFO CopyFiles$ Processing DocNum: 1881065, FileYear: 1978, FileMd: 1020, Files: List(Z:\I\1978\10\20\1881065.001, Z:\I\1978\10\20\1881065.002, Z:\I\1978\10\20\1881065.003, Z:\I\1978\10\20\1881065.004, Z:\I\1978\10\20\1881065.005, Z:\I\1978\10\20\1881065.006, Z:\I\1978\10\20\1881065.007, Z:\I\1978\10\20\1881065.008, Z:\I\1978\10\20\1881065.009, Z:\I\1978\10\20\1881065.010, Z:\I\1978\10\20\1881065.011, Z:\I\1978\10\20\1881065.012)
2017-06-20 16:16:26,038 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.001 to: ./preindex/1978/1881065.001
2017-06-20 16:16:26,053 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.002 to: ./preindex/1978/1881065.002
2017-06-20 16:16:26,053 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.003 to: ./preindex/1978/1881065.003
2017-06-20 16:16:26,053 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.004 to: ./preindex/1978/1881065.004
2017-06-20 16:16:26,053 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.005 to: ./preindex/1978/1881065.005
2017-06-20 16:16:26,069 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.006 to: ./preindex/1978/1881065.006
2017-06-20 16:16:26,069 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.007 to: ./preindex/1978/1881065.007
2017-06-20 16:16:26,069 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.008 to: ./preindex/1978/1881065.008
2017-06-20 16:16:26,085 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.009 to: ./preindex/1978/1881065.009
2017-06-20 16:16:26,085 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.010 to: ./preindex/1978/1881065.010
2017-06-20 16:16:26,085 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.011 to: ./preindex/1978/1881065.011
2017-06-20 16:16:26,100 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881065.012 to: ./preindex/1978/1881065.012
2017-06-20 16:16:26,100 INFO CopyFiles$ Processing DocNum: 1927170, FileYear: 1978, FileMd: 1229, Files: List(Z:\I\1978\12\29\1927170.001)
2017-06-20 16:16:26,100 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927170.001 to: ./preindex/1978/1927170.001
2017-06-20 16:16:26,131 INFO CopyFiles$ Processing DocNum: 1831993, FileYear: 1978, FileMd: 728, Files: List(Z:\I\1978\07\28\1831993.001, Z:\I\1978\07\28\1831993.002, Z:\I\1978\07\28\1831993.003, Z:\I\1978\07\28\1831993.004, Z:\I\1978\07\28\1831993.005, Z:\I\1978\07\28\1831993.006)
2017-06-20 16:16:26,131 INFO CopyFiles$ Copying: Z:\I\1978\07\28\1831993.001 to: ./preindex/1978/1831993.001
2017-06-20 16:16:26,147 INFO CopyFiles$ Copying: Z:\I\1978\07\28\1831993.002 to: ./preindex/1978/1831993.002
2017-06-20 16:16:26,147 INFO CopyFiles$ Copying: Z:\I\1978\07\28\1831993.003 to: ./preindex/1978/1831993.003
2017-06-20 16:16:26,163 INFO CopyFiles$ Copying: Z:\I\1978\07\28\1831993.004 to: ./preindex/1978/1831993.004
2017-06-20 16:16:26,163 INFO CopyFiles$ Copying: Z:\I\1978\07\28\1831993.005 to: ./preindex/1978/1831993.005
2017-06-20 16:16:26,178 INFO CopyFiles$ Copying: Z:\I\1978\07\28\1831993.006 to: ./preindex/1978/1831993.006
2017-06-20 16:16:26,178 INFO CopyFiles$ Processing DocNum: 1699730, FileYear: 1978, FileMd: 209, Files: List(Z:\I\1978\02\09\1699730.001, Z:\I\1978\02\09\1699730.002, Z:\I\1978\02\09\1699730.003)
2017-06-20 16:16:26,178 INFO CopyFiles$ Copying: Z:\I\1978\02\09\1699730.001 to: ./preindex/1978/1699730.001
2017-06-20 16:16:26,194 INFO CopyFiles$ Copying: Z:\I\1978\02\09\1699730.002 to: ./preindex/1978/1699730.002
2017-06-20 16:16:26,194 INFO CopyFiles$ Copying: Z:\I\1978\02\09\1699730.003 to: ./preindex/1978/1699730.003
2017-06-20 16:16:26,209 INFO CopyFiles$ Processing DocNum: 1678048, FileYear: 1978, FileMd: 106, Files: List(Z:\I\1978\01\06\1678048.001, Z:\I\1978\01\06\1678048.002, Z:\I\1978\01\06\1678048.003)
2017-06-20 16:16:26,209 INFO CopyFiles$ Copying: Z:\I\1978\01\06\1678048.001 to: ./preindex/1978/1678048.001
2017-06-20 16:16:26,225 INFO CopyFiles$ Copying: Z:\I\1978\01\06\1678048.002 to: ./preindex/1978/1678048.002
2017-06-20 16:16:26,256 INFO CopyFiles$ Copying: Z:\I\1978\01\06\1678048.003 to: ./preindex/1978/1678048.003
2017-06-20 16:16:26,272 INFO CopyFiles$ Processing DocNum: 1914198, FileYear: 1978, FileMd: 1212, Files: List(Z:\I\1978\12\12\1914198.001, Z:\I\1978\12\12\1914198.002, Z:\I\1978\12\12\1914198.003, Z:\I\1978\12\12\1914198.004, Z:\I\1978\12\12\1914198.005)
2017-06-20 16:16:26,272 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914198.001 to: ./preindex/1978/1914198.001
2017-06-20 16:16:26,272 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914198.002 to: ./preindex/1978/1914198.002
2017-06-20 16:16:26,287 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914198.003 to: ./preindex/1978/1914198.003
2017-06-20 16:16:26,287 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914198.004 to: ./preindex/1978/1914198.004
2017-06-20 16:16:26,287 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914198.005 to: ./preindex/1978/1914198.005
2017-06-20 16:16:26,303 INFO CopyFiles$ Processing DocNum: 1889011, FileYear: 1978, FileMd: 1101, Files: List(Z:\I\1978\11\01\1889011.001, Z:\I\1978\11\01\1889011.002, Z:\I\1978\11\01\1889011.003)
2017-06-20 16:16:26,303 INFO CopyFiles$ Copying: Z:\I\1978\11\01\1889011.001 to: ./preindex/1978/1889011.001
2017-06-20 16:16:26,319 INFO CopyFiles$ Copying: Z:\I\1978\11\01\1889011.002 to: ./preindex/1978/1889011.002
2017-06-20 16:16:26,319 INFO CopyFiles$ Copying: Z:\I\1978\11\01\1889011.003 to: ./preindex/1978/1889011.003
2017-06-20 16:16:26,334 INFO CopyFiles$ Processing DocNum: 1813353, FileYear: 1978, FileMd: 720, Files: List(Z:\I\1978\07\20\1813353.001, Z:\I\1978\07\20\1813353.002, Z:\I\1978\07\20\1813353.003)
2017-06-20 16:16:26,334 INFO CopyFiles$ Copying: Z:\I\1978\07\20\1813353.001 to: ./preindex/1978/1813353.001
2017-06-20 16:16:26,350 INFO CopyFiles$ Copying: Z:\I\1978\07\20\1813353.002 to: ./preindex/1978/1813353.002
2017-06-20 16:16:26,365 INFO CopyFiles$ Copying: Z:\I\1978\07\20\1813353.003 to: ./preindex/1978/1813353.003
2017-06-20 16:16:26,365 INFO CopyFiles$ Processing DocNum: 1690032, FileYear: 1978, FileMd: 125, Files: List(Z:\I\1978\01\25\1690032.001, Z:\I\1978\01\25\1690032.002, Z:\I\1978\01\25\1690032.003)
2017-06-20 16:16:26,365 INFO CopyFiles$ Copying: Z:\I\1978\01\25\1690032.001 to: ./preindex/1978/1690032.001
2017-06-20 16:16:26,397 INFO CopyFiles$ Copying: Z:\I\1978\01\25\1690032.002 to: ./preindex/1978/1690032.002
2017-06-20 16:16:26,412 INFO CopyFiles$ Copying: Z:\I\1978\01\25\1690032.003 to: ./preindex/1978/1690032.003
2017-06-20 16:16:26,428 INFO CopyFiles$ Processing DocNum: 1890643, FileYear: 1978, FileMd: 1102, Files: List(Z:\I\1978\11\02\1890643.001, Z:\I\1978\11\02\1890643.002, Z:\I\1978\11\02\1890643.003)
2017-06-20 16:16:26,428 INFO CopyFiles$ Copying: Z:\I\1978\11\02\1890643.001 to: ./preindex/1978/1890643.001
2017-06-20 16:16:26,443 INFO CopyFiles$ Copying: Z:\I\1978\11\02\1890643.002 to: ./preindex/1978/1890643.002
2017-06-20 16:16:26,443 INFO CopyFiles$ Copying: Z:\I\1978\11\02\1890643.003 to: ./preindex/1978/1890643.003
2017-06-20 16:16:26,443 INFO CopyFiles$ Processing DocNum: 1699726, FileYear: 1978, FileMd: 209, Files: List(Z:\I\1978\02\09\1699726.001, Z:\I\1978\02\09\1699726.002, Z:\I\1978\02\09\1699726.003, Z:\I\1978\02\09\1699726.004)
2017-06-20 16:16:26,459 INFO CopyFiles$ Copying: Z:\I\1978\02\09\1699726.001 to: ./preindex/1978/1699726.001
2017-06-20 16:16:26,475 INFO CopyFiles$ Copying: Z:\I\1978\02\09\1699726.002 to: ./preindex/1978/1699726.002
2017-06-20 16:16:26,475 INFO CopyFiles$ Copying: Z:\I\1978\02\09\1699726.003 to: ./preindex/1978/1699726.003
2017-06-20 16:16:26,490 INFO CopyFiles$ Copying: Z:\I\1978\02\09\1699726.004 to: ./preindex/1978/1699726.004
2017-06-20 16:16:26,506 INFO CopyFiles$ Processing DocNum: 1920214, FileYear: 1978, FileMd: 1218, Files: List(Z:\I\1978\12\18\1920214.001, Z:\I\1978\12\18\1920214.002, Z:\I\1978\12\18\1920214.003, Z:\I\1978\12\18\1920214.004, Z:\I\1978\12\18\1920214.005)
2017-06-20 16:16:26,506 INFO CopyFiles$ Copying: Z:\I\1978\12\18\1920214.001 to: ./preindex/1978/1920214.001
2017-06-20 16:16:26,521 INFO CopyFiles$ Copying: Z:\I\1978\12\18\1920214.002 to: ./preindex/1978/1920214.002
2017-06-20 16:16:26,521 INFO CopyFiles$ Copying: Z:\I\1978\12\18\1920214.003 to: ./preindex/1978/1920214.003
2017-06-20 16:16:26,537 INFO CopyFiles$ Copying: Z:\I\1978\12\18\1920214.004 to: ./preindex/1978/1920214.004
2017-06-20 16:16:26,537 INFO CopyFiles$ Copying: Z:\I\1978\12\18\1920214.005 to: ./preindex/1978/1920214.005
2017-06-20 16:16:26,553 INFO CopyFiles$ Processing DocNum: 1879936, FileYear: 1978, FileMd: 1018, Files: List(Z:\I\1978\10\18\1879936.001, Z:\I\1978\10\18\1879936.002, Z:\I\1978\10\18\1879936.003, Z:\I\1978\10\18\1879936.004, Z:\I\1978\10\18\1879936.005, Z:\I\1978\10\18\1879936.006)
2017-06-20 16:16:26,553 INFO CopyFiles$ Copying: Z:\I\1978\10\18\1879936.001 to: ./preindex/1978/1879936.001
2017-06-20 16:16:26,568 INFO CopyFiles$ Copying: Z:\I\1978\10\18\1879936.002 to: ./preindex/1978/1879936.002
2017-06-20 16:16:26,584 INFO CopyFiles$ Copying: Z:\I\1978\10\18\1879936.003 to: ./preindex/1978/1879936.003
2017-06-20 16:16:26,599 INFO CopyFiles$ Copying: Z:\I\1978\10\18\1879936.004 to: ./preindex/1978/1879936.004
2017-06-20 16:16:26,615 INFO CopyFiles$ Copying: Z:\I\1978\10\18\1879936.005 to: ./preindex/1978/1879936.005
2017-06-20 16:16:26,631 INFO CopyFiles$ Copying: Z:\I\1978\10\18\1879936.006 to: ./preindex/1978/1879936.006
2017-06-20 16:16:26,631 INFO CopyFiles$ Processing DocNum: 1691789, FileYear: 1978, FileMd: 127, Files: List(Z:\I\1978\01\27\1691789.001, Z:\I\1978\01\27\1691789.002, Z:\I\1978\01\27\1691789.003, Z:\I\1978\01\27\1691789.004)
2017-06-20 16:16:26,631 INFO CopyFiles$ Copying: Z:\I\1978\01\27\1691789.001 to: ./preindex/1978/1691789.001
2017-06-20 16:16:26,677 INFO CopyFiles$ Copying: Z:\I\1978\01\27\1691789.002 to: ./preindex/1978/1691789.002
2017-06-20 16:16:26,693 INFO CopyFiles$ Copying: Z:\I\1978\01\27\1691789.003 to: ./preindex/1978/1691789.003
2017-06-20 16:16:26,709 INFO CopyFiles$ Copying: Z:\I\1978\01\27\1691789.004 to: ./preindex/1978/1691789.004
2017-06-20 16:16:26,724 INFO CopyFiles$ Processing DocNum: 1813948, FileYear: 1978, FileMd: 721, Files: List(Z:\I\1978\07\21\1813948.001, Z:\I\1978\07\21\1813948.002, Z:\I\1978\07\21\1813948.003)
2017-06-20 16:16:26,724 INFO CopyFiles$ Copying: Z:\I\1978\07\21\1813948.001 to: ./preindex/1978/1813948.001
2017-06-20 16:16:26,740 INFO CopyFiles$ Copying: Z:\I\1978\07\21\1813948.002 to: ./preindex/1978/1813948.002
2017-06-20 16:16:26,755 INFO CopyFiles$ Copying: Z:\I\1978\07\21\1813948.003 to: ./preindex/1978/1813948.003
2017-06-20 16:16:26,771 INFO CopyFiles$ Processing DocNum: 1797976, FileYear: 1978, FileMd: 630, Files: List(Z:\I\1978\06\30\1797976.001, Z:\I\1978\06\30\1797976.002, Z:\I\1978\06\30\1797976.003, Z:\I\1978\06\30\1797976.004, Z:\I\1978\06\30\1797976.005, Z:\I\1978\06\30\1797976.006, Z:\I\1978\06\30\1797976.007, Z:\I\1978\06\30\1797976.008, Z:\I\1978\06\30\1797976.009, Z:\I\1978\06\30\1797976.010)
2017-06-20 16:16:26,771 INFO CopyFiles$ Copying: Z:\I\1978\06\30\1797976.001 to: ./preindex/1978/1797976.001
2017-06-20 16:16:26,787 INFO CopyFiles$ Copying: Z:\I\1978\06\30\1797976.002 to: ./preindex/1978/1797976.002
2017-06-20 16:16:26,787 INFO CopyFiles$ Copying: Z:\I\1978\06\30\1797976.003 to: ./preindex/1978/1797976.003
2017-06-20 16:16:26,802 INFO CopyFiles$ Copying: Z:\I\1978\06\30\1797976.004 to: ./preindex/1978/1797976.004
2017-06-20 16:16:26,802 INFO CopyFiles$ Copying: Z:\I\1978\06\30\1797976.005 to: ./preindex/1978/1797976.005
2017-06-20 16:16:26,818 INFO CopyFiles$ Copying: Z:\I\1978\06\30\1797976.006 to: ./preindex/1978/1797976.006
2017-06-20 16:16:26,833 INFO CopyFiles$ Copying: Z:\I\1978\06\30\1797976.007 to: ./preindex/1978/1797976.007
2017-06-20 16:16:26,833 INFO CopyFiles$ Copying: Z:\I\1978\06\30\1797976.008 to: ./preindex/1978/1797976.008
2017-06-20 16:16:26,849 INFO CopyFiles$ Copying: Z:\I\1978\06\30\1797976.009 to: ./preindex/1978/1797976.009
2017-06-20 16:16:26,849 INFO CopyFiles$ Copying: Z:\I\1978\06\30\1797976.010 to: ./preindex/1978/1797976.010
2017-06-20 16:16:26,865 INFO CopyFiles$ Processing DocNum: 1733133, FileYear: 1978, FileMd: 403, Files: List(Z:\I\1978\04\03\1733133.001, Z:\I\1978\04\03\1733133.002, Z:\I\1978\04\03\1733133.003)
2017-06-20 16:16:26,865 INFO CopyFiles$ Copying: Z:\I\1978\04\03\1733133.001 to: ./preindex/1978/1733133.001
2017-06-20 16:16:26,896 INFO CopyFiles$ Copying: Z:\I\1978\04\03\1733133.002 to: ./preindex/1978/1733133.002
2017-06-20 16:16:26,911 INFO CopyFiles$ Copying: Z:\I\1978\04\03\1733133.003 to: ./preindex/1978/1733133.003
2017-06-20 16:16:26,927 INFO CopyFiles$ Processing DocNum: 1900013, FileYear: 1978, FileMd: 1116, Files: List(Z:\I\1978\11\16\1900013.001, Z:\I\1978\11\16\1900013.002, Z:\I\1978\11\16\1900013.003)
2017-06-20 16:16:26,927 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900013.001 to: ./preindex/1978/1900013.001
2017-06-20 16:16:26,943 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900013.002 to: ./preindex/1978/1900013.002
2017-06-20 16:16:26,958 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900013.003 to: ./preindex/1978/1900013.003
2017-06-20 16:16:26,974 INFO CopyFiles$ Processing DocNum: 1717175, FileYear: 1978, FileMd: 309, Files: List(Z:\I\1978\03\09\1717175.001, Z:\I\1978\03\09\1717175.002, Z:\I\1978\03\09\1717175.003, Z:\I\1978\03\09\1717175.004, Z:\I\1978\03\09\1717175.005, Z:\I\1978\03\09\1717175.006, Z:\I\1978\03\09\1717175.007, Z:\I\1978\03\09\1717175.008, Z:\I\1978\03\09\1717175.009, Z:\I\1978\03\09\1717175.010, Z:\I\1978\03\09\1717175.011)
2017-06-20 16:16:26,974 INFO CopyFiles$ Copying: Z:\I\1978\03\09\1717175.001 to: ./preindex/1978/1717175.001
2017-06-20 16:16:26,989 INFO CopyFiles$ Copying: Z:\I\1978\03\09\1717175.002 to: ./preindex/1978/1717175.002
2017-06-20 16:16:27,005 INFO CopyFiles$ Copying: Z:\I\1978\03\09\1717175.003 to: ./preindex/1978/1717175.003
2017-06-20 16:16:27,005 INFO CopyFiles$ Copying: Z:\I\1978\03\09\1717175.004 to: ./preindex/1978/1717175.004
2017-06-20 16:16:27,021 INFO CopyFiles$ Copying: Z:\I\1978\03\09\1717175.005 to: ./preindex/1978/1717175.005
2017-06-20 16:16:27,036 INFO CopyFiles$ Copying: Z:\I\1978\03\09\1717175.006 to: ./preindex/1978/1717175.006
2017-06-20 16:16:27,052 INFO CopyFiles$ Copying: Z:\I\1978\03\09\1717175.007 to: ./preindex/1978/1717175.007
2017-06-20 16:16:27,067 INFO CopyFiles$ Copying: Z:\I\1978\03\09\1717175.008 to: ./preindex/1978/1717175.008
2017-06-20 16:16:27,067 INFO CopyFiles$ Copying: Z:\I\1978\03\09\1717175.009 to: ./preindex/1978/1717175.009
2017-06-20 16:16:27,083 INFO CopyFiles$ Copying: Z:\I\1978\03\09\1717175.010 to: ./preindex/1978/1717175.010
2017-06-20 16:16:27,099 INFO CopyFiles$ Copying: Z:\I\1978\03\09\1717175.011 to: ./preindex/1978/1717175.011
2017-06-20 16:16:27,114 INFO CopyFiles$ Processing DocNum: 1695510, FileYear: 1978, FileMd: 203, Files: List(Z:\I\1978\02\03\1695510.001, Z:\I\1978\02\03\1695510.002, Z:\I\1978\02\03\1695510.003, Z:\I\1978\02\03\1695510.004, Z:\I\1978\02\03\1695510.005)
2017-06-20 16:16:27,114 INFO CopyFiles$ Copying: Z:\I\1978\02\03\1695510.001 to: ./preindex/1978/1695510.001
2017-06-20 16:16:27,130 INFO CopyFiles$ Copying: Z:\I\1978\02\03\1695510.002 to: ./preindex/1978/1695510.002
2017-06-20 16:16:27,145 INFO CopyFiles$ Copying: Z:\I\1978\02\03\1695510.003 to: ./preindex/1978/1695510.003
2017-06-20 16:16:27,161 INFO CopyFiles$ Copying: Z:\I\1978\02\03\1695510.004 to: ./preindex/1978/1695510.004
2017-06-20 16:16:27,177 INFO CopyFiles$ Copying: Z:\I\1978\02\03\1695510.005 to: ./preindex/1978/1695510.005
2017-06-20 16:16:27,208 INFO CopyFiles$ Processing DocNum: 1827525, FileYear: 1978, FileMd: 810, Files: List(Z:\I\1978\08\10\1827525.001, Z:\I\1978\08\10\1827525.002)
2017-06-20 16:16:27,208 INFO CopyFiles$ Copying: Z:\I\1978\08\10\1827525.001 to: ./preindex/1978/1827525.001
2017-06-20 16:16:27,223 INFO CopyFiles$ Copying: Z:\I\1978\08\10\1827525.002 to: ./preindex/1978/1827525.002
2017-06-20 16:16:27,223 INFO CopyFiles$ Processing DocNum: 1782713, FileYear: 1978, FileMd: 608, Files: List(Z:\I\1978\06\08\1782713.001, Z:\I\1978\06\08\1782713.002, Z:\I\1978\06\08\1782713.003, Z:\I\1978\06\08\1782713.004, Z:\I\1978\06\08\1782713.005)
2017-06-20 16:16:27,223 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1782713.001 to: ./preindex/1978/1782713.001
2017-06-20 16:16:27,223 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1782713.002 to: ./preindex/1978/1782713.002
2017-06-20 16:16:27,239 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1782713.003 to: ./preindex/1978/1782713.003
2017-06-20 16:16:27,239 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1782713.004 to: ./preindex/1978/1782713.004
2017-06-20 16:16:27,239 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1782713.005 to: ./preindex/1978/1782713.005
2017-06-20 16:16:27,270 INFO CopyFiles$ Processing DocNum: 1712672, FileYear: 1978, FileMd: 303, Files: List(Z:\I\1978\03\03\1712672.001, Z:\I\1978\03\03\1712672.002, Z:\I\1978\03\03\1712672.003, Z:\I\1978\03\03\1712672.004, Z:\I\1978\03\03\1712672.005)
2017-06-20 16:16:27,270 INFO CopyFiles$ Copying: Z:\I\1978\03\03\1712672.001 to: ./preindex/1978/1712672.001
2017-06-20 16:16:27,301 INFO CopyFiles$ Copying: Z:\I\1978\03\03\1712672.002 to: ./preindex/1978/1712672.002
2017-06-20 16:16:27,317 INFO CopyFiles$ Copying: Z:\I\1978\03\03\1712672.003 to: ./preindex/1978/1712672.003
2017-06-20 16:16:27,333 INFO CopyFiles$ Copying: Z:\I\1978\03\03\1712672.004 to: ./preindex/1978/1712672.004
2017-06-20 16:16:27,348 INFO CopyFiles$ Copying: Z:\I\1978\03\03\1712672.005 to: ./preindex/1978/1712672.005
2017-06-20 16:16:27,348 INFO CopyFiles$ Processing DocNum: 1750312, FileYear: 1978, FileMd: 426, Files: List(Z:\I\1978\04\26\1750312.001, Z:\I\1978\04\26\1750312.002, Z:\I\1978\04\26\1750312.003)
2017-06-20 16:16:27,364 INFO CopyFiles$ Copying: Z:\I\1978\04\26\1750312.001 to: ./preindex/1978/1750312.001
2017-06-20 16:16:27,379 INFO CopyFiles$ Copying: Z:\I\1978\04\26\1750312.002 to: ./preindex/1978/1750312.002
2017-06-20 16:16:27,395 INFO CopyFiles$ Copying: Z:\I\1978\04\26\1750312.003 to: ./preindex/1978/1750312.003
2017-06-20 16:16:27,426 INFO CopyFiles$ Processing DocNum: 1832832, FileYear: 1978, FileMd: 815, Files: List(Z:\I\1978\08\15\1832832.001, Z:\I\1978\08\15\1832832.002, Z:\I\1978\08\15\1832832.003)
2017-06-20 16:16:27,426 INFO CopyFiles$ Copying: Z:\I\1978\08\15\1832832.001 to: ./preindex/1978/1832832.001
2017-06-20 16:16:27,442 INFO CopyFiles$ Copying: Z:\I\1978\08\15\1832832.002 to: ./preindex/1978/1832832.002
2017-06-20 16:16:27,457 INFO CopyFiles$ Copying: Z:\I\1978\08\15\1832832.003 to: ./preindex/1978/1832832.003
2017-06-20 16:16:27,473 INFO CopyFiles$ Processing DocNum: 1851564, FileYear: 1978, FileMd: 911, Files: List(Z:\I\1978\09\11\1851564.001, Z:\I\1978\09\11\1851564.002)
2017-06-20 16:16:27,473 INFO CopyFiles$ Copying: Z:\I\1978\09\11\1851564.001 to: ./preindex/1978/1851564.001
2017-06-20 16:16:27,504 INFO CopyFiles$ Copying: Z:\I\1978\09\11\1851564.002 to: ./preindex/1978/1851564.002
2017-06-20 16:16:27,520 INFO CopyFiles$ Processing DocNum: 1830739, FileYear: 1978, FileMd: 811, Files: List(Z:\I\1978\08\11\1830739.001, Z:\I\1978\08\11\1830739.002)
2017-06-20 16:16:27,520 INFO CopyFiles$ Copying: Z:\I\1978\08\11\1830739.001 to: ./preindex/1978/1830739.001
2017-06-20 16:16:27,535 INFO CopyFiles$ Copying: Z:\I\1978\08\11\1830739.002 to: ./preindex/1978/1830739.002
2017-06-20 16:16:27,535 INFO CopyFiles$ Processing DocNum: 1790540, FileYear: 1978, FileMd: 620, Files: List(Z:\I\1978\06\20\1790540.001, Z:\I\1978\06\20\1790540.002, Z:\I\1978\06\20\1790540.003, Z:\I\1978\06\20\1790540.004)
2017-06-20 16:16:27,535 INFO CopyFiles$ Copying: Z:\I\1978\06\20\1790540.001 to: ./preindex/1978/1790540.001
2017-06-20 16:16:27,551 INFO CopyFiles$ Copying: Z:\I\1978\06\20\1790540.002 to: ./preindex/1978/1790540.002
2017-06-20 16:16:27,551 INFO CopyFiles$ Copying: Z:\I\1978\06\20\1790540.003 to: ./preindex/1978/1790540.003
2017-06-20 16:16:27,567 INFO CopyFiles$ Copying: Z:\I\1978\06\20\1790540.004 to: ./preindex/1978/1790540.004
2017-06-20 16:16:27,567 INFO CopyFiles$ Processing DocNum: 1700934, FileYear: 1978, FileMd: 213, Files: List(Z:\I\1978\02\13\1700934.001, Z:\I\1978\02\13\1700934.002, Z:\I\1978\02\13\1700934.003, Z:\I\1978\02\13\1700934.004, Z:\I\1978\02\13\1700934.005)
2017-06-20 16:16:27,567 INFO CopyFiles$ Copying: Z:\I\1978\02\13\1700934.001 to: ./preindex/1978/1700934.001
2017-06-20 16:16:27,582 INFO CopyFiles$ Copying: Z:\I\1978\02\13\1700934.002 to: ./preindex/1978/1700934.002
2017-06-20 16:16:27,582 INFO CopyFiles$ Copying: Z:\I\1978\02\13\1700934.003 to: ./preindex/1978/1700934.003
2017-06-20 16:16:27,598 INFO CopyFiles$ Copying: Z:\I\1978\02\13\1700934.004 to: ./preindex/1978/1700934.004
2017-06-20 16:16:27,598 INFO CopyFiles$ Copying: Z:\I\1978\02\13\1700934.005 to: ./preindex/1978/1700934.005
2017-06-20 16:16:27,613 INFO CopyFiles$ Processing DocNum: 1906103, FileYear: 1978, FileMd: 1127, Files: List(Z:\I\1978\11\27\1906103.001, Z:\I\1978\11\27\1906103.002, Z:\I\1978\11\27\1906103.003)
2017-06-20 16:16:27,613 INFO CopyFiles$ Copying: Z:\I\1978\11\27\1906103.001 to: ./preindex/1978/1906103.001
2017-06-20 16:16:27,629 INFO CopyFiles$ Copying: Z:\I\1978\11\27\1906103.002 to: ./preindex/1978/1906103.002
2017-06-20 16:16:27,645 INFO CopyFiles$ Copying: Z:\I\1978\11\27\1906103.003 to: ./preindex/1978/1906103.003
2017-06-20 16:16:27,660 INFO CopyFiles$ Processing DocNum: 1766811, FileYear: 1978, FileMd: 519, Files: List(Z:\I\1978\05\19\1766811.001, Z:\I\1978\05\19\1766811.002, Z:\I\1978\05\19\1766811.003)
2017-06-20 16:16:27,660 INFO CopyFiles$ Copying: Z:\I\1978\05\19\1766811.001 to: ./preindex/1978/1766811.001
2017-06-20 16:16:27,676 INFO CopyFiles$ Copying: Z:\I\1978\05\19\1766811.002 to: ./preindex/1978/1766811.002
2017-06-20 16:16:27,676 INFO CopyFiles$ Copying: Z:\I\1978\05\19\1766811.003 to: ./preindex/1978/1766811.003
2017-06-20 16:16:27,691 INFO CopyFiles$ Processing DocNum: 1885962, FileYear: 1978, FileMd: 1027, Files: List(Z:\I\1978\10\27\1885962.001, Z:\I\1978\10\27\1885962.002, Z:\I\1978\10\27\1885962.003)
2017-06-20 16:16:27,691 INFO CopyFiles$ Copying: Z:\I\1978\10\27\1885962.001 to: ./preindex/1978/1885962.001
2017-06-20 16:16:27,738 INFO CopyFiles$ Copying: Z:\I\1978\10\27\1885962.002 to: ./preindex/1978/1885962.002
2017-06-20 16:16:27,738 INFO CopyFiles$ Copying: Z:\I\1978\10\27\1885962.003 to: ./preindex/1978/1885962.003
2017-06-20 16:16:27,754 INFO CopyFiles$ Processing DocNum: 1907053, FileYear: 1978, FileMd: 1128, Files: List(Z:\I\1978\11\28\1907053.001, Z:\I\1978\11\28\1907053.002, Z:\I\1978\11\28\1907053.003)
2017-06-20 16:16:27,754 INFO CopyFiles$ Copying: Z:\I\1978\11\28\1907053.001 to: ./preindex/1978/1907053.001
2017-06-20 16:16:27,769 INFO CopyFiles$ Copying: Z:\I\1978\11\28\1907053.002 to: ./preindex/1978/1907053.002
2017-06-20 16:16:27,785 INFO CopyFiles$ Copying: Z:\I\1978\11\28\1907053.003 to: ./preindex/1978/1907053.003
2017-06-20 16:16:27,801 INFO CopyFiles$ Processing DocNum: 1902069, FileYear: 1978, FileMd: 1120, Files: List(Z:\I\1978\11\20\1902069.001, Z:\I\1978\11\20\1902069.002, Z:\I\1978\11\20\1902069.003, Z:\I\1978\11\20\1902069.004)
2017-06-20 16:16:27,801 INFO CopyFiles$ Copying: Z:\I\1978\11\20\1902069.001 to: ./preindex/1978/1902069.001
2017-06-20 16:16:27,816 INFO CopyFiles$ Copying: Z:\I\1978\11\20\1902069.002 to: ./preindex/1978/1902069.002
2017-06-20 16:16:27,816 INFO CopyFiles$ Copying: Z:\I\1978\11\20\1902069.003 to: ./preindex/1978/1902069.003
2017-06-20 16:16:27,832 INFO CopyFiles$ Copying: Z:\I\1978\11\20\1902069.004 to: ./preindex/1978/1902069.004
2017-06-20 16:16:27,832 INFO CopyFiles$ Processing DocNum: 1856293, FileYear: 1978, FileMd: 915, Files: List(Z:\I\1978\09\15\1856293.001, Z:\I\1978\09\15\1856293.002, Z:\I\1978\09\15\1856293.003)
2017-06-20 16:16:27,832 INFO CopyFiles$ Copying: Z:\I\1978\09\15\1856293.001 to: ./preindex/1978/1856293.001
2017-06-20 16:16:27,847 INFO CopyFiles$ Copying: Z:\I\1978\09\15\1856293.002 to: ./preindex/1978/1856293.002
2017-06-20 16:16:27,863 INFO CopyFiles$ Copying: Z:\I\1978\09\15\1856293.003 to: ./preindex/1978/1856293.003
2017-06-20 16:16:27,879 INFO CopyFiles$ Processing DocNum: 1927165, FileYear: 1978, FileMd: 1229, Files: List(Z:\I\1978\12\29\1927165.001)
2017-06-20 16:16:27,879 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927165.001 to: ./preindex/1978/1927165.001
2017-06-20 16:16:27,894 INFO CopyFiles$ Processing DocNum: 1842686, FileYear: 1978, FileMd: 829, Files: List(Z:\I\1978\08\29\1842686.001, Z:\I\1978\08\29\1842686.002, Z:\I\1978\08\29\1842686.003)
2017-06-20 16:16:27,894 INFO CopyFiles$ Copying: Z:\I\1978\08\29\1842686.001 to: ./preindex/1978/1842686.001
2017-06-20 16:16:27,941 INFO CopyFiles$ Copying: Z:\I\1978\08\29\1842686.002 to: ./preindex/1978/1842686.002
2017-06-20 16:16:27,957 INFO CopyFiles$ Copying: Z:\I\1978\08\29\1842686.003 to: ./preindex/1978/1842686.003
2017-06-20 16:16:27,972 INFO CopyFiles$ Processing DocNum: 1726330, FileYear: 1978, FileMd: 322, Files: List(Z:\I\1978\03\22\1726330.001, Z:\I\1978\03\22\1726330.002, Z:\I\1978\03\22\1726330.003)
2017-06-20 16:16:27,972 INFO CopyFiles$ Copying: Z:\I\1978\03\22\1726330.001 to: ./preindex/1978/1726330.001
2017-06-20 16:16:27,988 INFO CopyFiles$ Copying: Z:\I\1978\03\22\1726330.002 to: ./preindex/1978/1726330.002
2017-06-20 16:16:28,003 INFO CopyFiles$ Copying: Z:\I\1978\03\22\1726330.003 to: ./preindex/1978/1726330.003
2017-06-20 16:16:28,003 INFO CopyFiles$ Processing DocNum: 1854484, FileYear: 1978, FileMd: 913, Files: List(Z:\I\1978\09\13\1854484.001, Z:\I\1978\09\13\1854484.002, Z:\I\1978\09\13\1854484.003, Z:\I\1978\09\13\1854484.004)
2017-06-20 16:16:28,003 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1854484.001 to: ./preindex/1978/1854484.001
2017-06-20 16:16:28,035 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1854484.002 to: ./preindex/1978/1854484.002
2017-06-20 16:16:28,035 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1854484.003 to: ./preindex/1978/1854484.003
2017-06-20 16:16:28,050 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1854484.004 to: ./preindex/1978/1854484.004
2017-06-20 16:16:28,066 INFO CopyFiles$ Processing DocNum: 1711193, FileYear: 1978, FileMd: 228, Files: List(Z:\I\1978\02\28\1711193.001, Z:\I\1978\02\28\1711193.002, Z:\I\1978\02\28\1711193.003)
2017-06-20 16:16:28,066 INFO CopyFiles$ Copying: Z:\I\1978\02\28\1711193.001 to: ./preindex/1978/1711193.001
2017-06-20 16:16:28,081 INFO CopyFiles$ Copying: Z:\I\1978\02\28\1711193.002 to: ./preindex/1978/1711193.002
2017-06-20 16:16:28,097 INFO CopyFiles$ Copying: Z:\I\1978\02\28\1711193.003 to: ./preindex/1978/1711193.003
2017-06-20 16:16:28,128 INFO CopyFiles$ Processing DocNum: 1733025, FileYear: 1978, FileMd: 331, Files: List(Z:\I\1978\03\31\1733025.001, Z:\I\1978\03\31\1733025.002, Z:\I\1978\03\31\1733025.003, Z:\I\1978\03\31\1733025.004)
2017-06-20 16:16:28,128 INFO CopyFiles$ Copying: Z:\I\1978\03\31\1733025.001 to: ./preindex/1978/1733025.001
2017-06-20 16:16:28,144 INFO CopyFiles$ Copying: Z:\I\1978\03\31\1733025.002 to: ./preindex/1978/1733025.002
2017-06-20 16:16:28,144 INFO CopyFiles$ Copying: Z:\I\1978\03\31\1733025.003 to: ./preindex/1978/1733025.003
2017-06-20 16:16:28,159 INFO CopyFiles$ Copying: Z:\I\1978\03\31\1733025.004 to: ./preindex/1978/1733025.004
2017-06-20 16:16:28,159 INFO CopyFiles$ Processing DocNum: 1832872, FileYear: 1978, FileMd: 815, Files: List(Z:\I\1978\08\15\1832872.001, Z:\I\1978\08\15\1832872.002)
2017-06-20 16:16:28,159 INFO CopyFiles$ Copying: Z:\I\1978\08\15\1832872.001 to: ./preindex/1978/1832872.001
2017-06-20 16:16:28,175 INFO CopyFiles$ Copying: Z:\I\1978\08\15\1832872.002 to: ./preindex/1978/1832872.002
2017-06-20 16:16:28,191 INFO CopyFiles$ Processing DocNum: 1881221, FileYear: 1978, FileMd: 1020, Files: List(Z:\I\1978\10\20\1881221.001, Z:\I\1978\10\20\1881221.002)
2017-06-20 16:16:28,191 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881221.001 to: ./preindex/1978/1881221.001
2017-06-20 16:16:28,206 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881221.002 to: ./preindex/1978/1881221.002
2017-06-20 16:16:28,222 INFO CopyFiles$ Processing DocNum: 1790157, FileYear: 1978, FileMd: 620, Files: List(Z:\I\1978\06\20\1790157.001, Z:\I\1978\06\20\1790157.002)
2017-06-20 16:16:28,222 INFO CopyFiles$ Copying: Z:\I\1978\06\20\1790157.001 to: ./preindex/1978/1790157.001
2017-06-20 16:16:28,237 INFO CopyFiles$ Copying: Z:\I\1978\06\20\1790157.002 to: ./preindex/1978/1790157.002
2017-06-20 16:16:28,253 INFO CopyFiles$ Processing DocNum: 1927457, FileYear: 1978, FileMd: 1229, Files: List(Z:\I\1978\12\29\1927457.001, Z:\I\1978\12\29\1927457.002, Z:\I\1978\12\29\1927457.003)
2017-06-20 16:16:28,253 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927457.001 to: ./preindex/1978/1927457.001
2017-06-20 16:16:28,253 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927457.002 to: ./preindex/1978/1927457.002
2017-06-20 16:16:28,269 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927457.003 to: ./preindex/1978/1927457.003
2017-06-20 16:16:28,284 INFO CopyFiles$ Processing DocNum: 1731291, FileYear: 1978, FileMd: 330, Files: List(Z:\I\1978\03\30\1731291.001, Z:\I\1978\03\30\1731291.002, Z:\I\1978\03\30\1731291.003, Z:\I\1978\03\30\1731291.004, Z:\I\1978\03\30\1731291.005)
2017-06-20 16:16:28,284 INFO CopyFiles$ Copying: Z:\I\1978\03\30\1731291.001 to: ./preindex/1978/1731291.001
2017-06-20 16:16:28,300 INFO CopyFiles$ Copying: Z:\I\1978\03\30\1731291.002 to: ./preindex/1978/1731291.002
2017-06-20 16:16:28,315 INFO CopyFiles$ Copying: Z:\I\1978\03\30\1731291.003 to: ./preindex/1978/1731291.003
2017-06-20 16:16:28,315 INFO CopyFiles$ Copying: Z:\I\1978\03\30\1731291.004 to: ./preindex/1978/1731291.004
2017-06-20 16:16:28,331 INFO CopyFiles$ Copying: Z:\I\1978\03\30\1731291.005 to: ./preindex/1978/1731291.005
2017-06-20 16:16:28,347 INFO CopyFiles$ Processing DocNum: 1918135, FileYear: 1978, FileMd: 1218, Files: List(Z:\I\1978\12\18\1918135.001, Z:\I\1978\12\18\1918135.002, Z:\I\1978\12\18\1918135.003, Z:\I\1978\12\18\1918135.004)
2017-06-20 16:16:28,347 INFO CopyFiles$ Copying: Z:\I\1978\12\18\1918135.001 to: ./preindex/1978/1918135.001
2017-06-20 16:16:28,362 INFO CopyFiles$ Copying: Z:\I\1978\12\18\1918135.002 to: ./preindex/1978/1918135.002
2017-06-20 16:16:28,362 INFO CopyFiles$ Copying: Z:\I\1978\12\18\1918135.003 to: ./preindex/1978/1918135.003
2017-06-20 16:16:28,362 INFO CopyFiles$ Copying: Z:\I\1978\12\18\1918135.004 to: ./preindex/1978/1918135.004
2017-06-20 16:16:28,378 INFO CopyFiles$ Processing DocNum: 1922408, FileYear: 1978, FileMd: 1220, Files: List(Z:\I\1978\12\20\1922408.001, Z:\I\1978\12\20\1922408.002, Z:\I\1978\12\20\1922408.003, Z:\I\1978\12\20\1922408.004, Z:\I\1978\12\20\1922408.005, Z:\I\1978\12\20\1922408.006, Z:\I\1978\12\20\1922408.007, Z:\I\1978\12\20\1922408.008, Z:\I\1978\12\20\1922408.009, Z:\I\1978\12\20\1922408.010, Z:\I\1978\12\20\1922408.011, Z:\I\1978\12\20\1922408.012, Z:\I\1978\12\20\1922408.013, Z:\I\1978\12\20\1922408.014, Z:\I\1978\12\20\1922408.015, Z:\I\1978\12\20\1922408.016, Z:\I\1978\12\20\1922408.017, Z:\I\1978\12\20\1922408.018)
2017-06-20 16:16:28,378 INFO CopyFiles$ Copying: Z:\I\1978\12\20\1922408.001 to: ./preindex/1978/1922408.001
2017-06-20 16:16:28,393 INFO CopyFiles$ Copying: Z:\I\1978\12\20\1922408.002 to: ./preindex/1978/1922408.002
2017-06-20 16:16:28,393 INFO CopyFiles$ Copying: Z:\I\1978\12\20\1922408.003 to: ./preindex/1978/1922408.003
2017-06-20 16:16:28,409 INFO CopyFiles$ Copying: Z:\I\1978\12\20\1922408.004 to: ./preindex/1978/1922408.004
2017-06-20 16:16:28,425 INFO CopyFiles$ Copying: Z:\I\1978\12\20\1922408.005 to: ./preindex/1978/1922408.005
2017-06-20 16:16:28,425 INFO CopyFiles$ Copying: Z:\I\1978\12\20\1922408.006 to: ./preindex/1978/1922408.006
2017-06-20 16:16:28,440 INFO CopyFiles$ Copying: Z:\I\1978\12\20\1922408.007 to: ./preindex/1978/1922408.007
2017-06-20 16:16:28,440 INFO CopyFiles$ Copying: Z:\I\1978\12\20\1922408.008 to: ./preindex/1978/1922408.008
2017-06-20 16:16:28,440 INFO CopyFiles$ Copying: Z:\I\1978\12\20\1922408.009 to: ./preindex/1978/1922408.009
2017-06-20 16:16:28,456 INFO CopyFiles$ Copying: Z:\I\1978\12\20\1922408.010 to: ./preindex/1978/1922408.010
2017-06-20 16:16:28,456 INFO CopyFiles$ Copying: Z:\I\1978\12\20\1922408.011 to: ./preindex/1978/1922408.011
2017-06-20 16:16:28,471 INFO CopyFiles$ Copying: Z:\I\1978\12\20\1922408.012 to: ./preindex/1978/1922408.012
2017-06-20 16:16:28,471 INFO CopyFiles$ Copying: Z:\I\1978\12\20\1922408.013 to: ./preindex/1978/1922408.013
2017-06-20 16:16:28,487 INFO CopyFiles$ Copying: Z:\I\1978\12\20\1922408.014 to: ./preindex/1978/1922408.014
2017-06-20 16:16:28,503 INFO CopyFiles$ Copying: Z:\I\1978\12\20\1922408.015 to: ./preindex/1978/1922408.015
2017-06-20 16:16:28,518 INFO CopyFiles$ Copying: Z:\I\1978\12\20\1922408.016 to: ./preindex/1978/1922408.016
2017-06-20 16:16:28,518 INFO CopyFiles$ Copying: Z:\I\1978\12\20\1922408.017 to: ./preindex/1978/1922408.017
2017-06-20 16:16:28,518 INFO CopyFiles$ Copying: Z:\I\1978\12\20\1922408.018 to: ./preindex/1978/1922408.018
2017-06-20 16:16:28,534 INFO CopyFiles$ Processing DocNum: 1728270, FileYear: 1978, FileMd: 324, Files: List(Z:\I\1978\03\24\1728270.001, Z:\I\1978\03\24\1728270.002, Z:\I\1978\03\24\1728270.003, Z:\I\1978\03\24\1728270.004)
2017-06-20 16:16:28,534 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1728270.001 to: ./preindex/1978/1728270.001
2017-06-20 16:16:28,549 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1728270.002 to: ./preindex/1978/1728270.002
2017-06-20 16:16:28,549 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1728270.003 to: ./preindex/1978/1728270.003
2017-06-20 16:16:28,565 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1728270.004 to: ./preindex/1978/1728270.004
2017-06-20 16:16:28,581 INFO CopyFiles$ Processing DocNum: 1688167, FileYear: 1978, FileMd: 123, Files: List(Z:\I\1978\01\23\1688167.001, Z:\I\1978\01\23\1688167.002, Z:\I\1978\01\23\1688167.003)
2017-06-20 16:16:28,581 INFO CopyFiles$ Copying: Z:\I\1978\01\23\1688167.001 to: ./preindex/1978/1688167.001
2017-06-20 16:16:28,596 INFO CopyFiles$ Copying: Z:\I\1978\01\23\1688167.002 to: ./preindex/1978/1688167.002
2017-06-20 16:16:28,596 INFO CopyFiles$ Copying: Z:\I\1978\01\23\1688167.003 to: ./preindex/1978/1688167.003
2017-06-20 16:16:28,612 INFO CopyFiles$ Processing DocNum: 1740403, FileYear: 1978, FileMd: 411, Files: List(Z:\I\1978\04\11\1740403.001, Z:\I\1978\04\11\1740403.002)
2017-06-20 16:16:28,612 INFO CopyFiles$ Copying: Z:\I\1978\04\11\1740403.001 to: ./preindex/1978/1740403.001
2017-06-20 16:16:28,627 INFO CopyFiles$ Copying: Z:\I\1978\04\11\1740403.002 to: ./preindex/1978/1740403.002
2017-06-20 16:16:28,643 INFO CopyFiles$ Processing DocNum: 1887496, FileYear: 1978, FileMd: 1030, Files: List(Z:\I\1978\10\30\1887496.001, Z:\I\1978\10\30\1887496.002)
2017-06-20 16:16:28,643 INFO CopyFiles$ Copying: Z:\I\1978\10\30\1887496.001 to: ./preindex/1978/1887496.001
2017-06-20 16:16:28,659 INFO CopyFiles$ Copying: Z:\I\1978\10\30\1887496.002 to: ./preindex/1978/1887496.002
2017-06-20 16:16:28,674 INFO CopyFiles$ Processing DocNum: 1785996, FileYear: 1978, FileMd: 614, Files: List(Z:\I\1978\06\14\1785996.001, Z:\I\1978\06\14\1785996.002, Z:\I\1978\06\14\1785996.003)
2017-06-20 16:16:28,674 INFO CopyFiles$ Copying: Z:\I\1978\06\14\1785996.001 to: ./preindex/1978/1785996.001
2017-06-20 16:16:28,690 INFO CopyFiles$ Copying: Z:\I\1978\06\14\1785996.002 to: ./preindex/1978/1785996.002
2017-06-20 16:16:28,705 INFO CopyFiles$ Copying: Z:\I\1978\06\14\1785996.003 to: ./preindex/1978/1785996.003
2017-06-20 16:16:28,737 INFO CopyFiles$ Processing DocNum: 1676096, FileYear: 1978, FileMd: 104, Files: List(Z:\I\1978\01\04\1676096.001, Z:\I\1978\01\04\1676096.002, Z:\I\1978\01\04\1676096.003)
2017-06-20 16:16:28,737 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1676096.001 to: ./preindex/1978/1676096.001
2017-06-20 16:16:28,752 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1676096.002 to: ./preindex/1978/1676096.002
2017-06-20 16:16:28,768 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1676096.003 to: ./preindex/1978/1676096.003
2017-06-20 16:16:28,768 INFO CopyFiles$ Processing DocNum: 1896967, FileYear: 1978, FileMd: 1110, Files: List(Z:\I\1978\11\10\1896967.001, Z:\I\1978\11\10\1896967.002, Z:\I\1978\11\10\1896967.003, Z:\I\1978\11\10\1896967.004)
2017-06-20 16:16:28,768 INFO CopyFiles$ Copying: Z:\I\1978\11\10\1896967.001 to: ./preindex/1978/1896967.001
2017-06-20 16:16:28,783 INFO CopyFiles$ Copying: Z:\I\1978\11\10\1896967.002 to: ./preindex/1978/1896967.002
2017-06-20 16:16:28,799 INFO CopyFiles$ Copying: Z:\I\1978\11\10\1896967.003 to: ./preindex/1978/1896967.003
2017-06-20 16:16:28,799 INFO CopyFiles$ Copying: Z:\I\1978\11\10\1896967.004 to: ./preindex/1978/1896967.004
2017-06-20 16:16:28,815 INFO CopyFiles$ Processing DocNum: 1726817, FileYear: 1978, FileMd: 322, Files: List(Z:\I\1978\03\22\1726817.001, Z:\I\1978\03\22\1726817.002, Z:\I\1978\03\22\1726817.003)
2017-06-20 16:16:28,815 INFO CopyFiles$ Copying: Z:\I\1978\03\22\1726817.001 to: ./preindex/1978/1726817.001
2017-06-20 16:16:28,830 INFO CopyFiles$ Copying: Z:\I\1978\03\22\1726817.002 to: ./preindex/1978/1726817.002
2017-06-20 16:16:28,846 INFO CopyFiles$ Copying: Z:\I\1978\03\22\1726817.003 to: ./preindex/1978/1726817.003
2017-06-20 16:16:28,861 INFO CopyFiles$ Processing DocNum: 1675445, FileYear: 1978, FileMd: 103, Files: List(Z:\I\1978\01\03\1675445.001, Z:\I\1978\01\03\1675445.002, Z:\I\1978\01\03\1675445.003, Z:\I\1978\01\03\1675445.004, Z:\I\1978\01\03\1675445.005, Z:\I\1978\01\03\1675445.006, Z:\I\1978\01\03\1675445.007, Z:\I\1978\01\03\1675445.008)
2017-06-20 16:16:28,861 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675445.001 to: ./preindex/1978/1675445.001
2017-06-20 16:16:28,877 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675445.002 to: ./preindex/1978/1675445.002
2017-06-20 16:16:28,893 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675445.003 to: ./preindex/1978/1675445.003
2017-06-20 16:16:28,908 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675445.004 to: ./preindex/1978/1675445.004
2017-06-20 16:16:28,908 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675445.005 to: ./preindex/1978/1675445.005
2017-06-20 16:16:28,924 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675445.006 to: ./preindex/1978/1675445.006
2017-06-20 16:16:28,924 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675445.007 to: ./preindex/1978/1675445.007
2017-06-20 16:16:28,939 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675445.008 to: ./preindex/1978/1675445.008
2017-06-20 16:16:28,939 INFO CopyFiles$ Processing DocNum: 1819178, FileYear: 1978, FileMd: 728, Files: List(Z:\I\1978\07\28\1819178.001, Z:\I\1978\07\28\1819178.002, Z:\I\1978\07\28\1819178.003)
2017-06-20 16:16:28,939 INFO CopyFiles$ Copying: Z:\I\1978\07\28\1819178.001 to: ./preindex/1978/1819178.001
2017-06-20 16:16:28,971 INFO CopyFiles$ Copying: Z:\I\1978\07\28\1819178.002 to: ./preindex/1978/1819178.002
2017-06-20 16:16:28,986 INFO CopyFiles$ Copying: Z:\I\1978\07\28\1819178.003 to: ./preindex/1978/1819178.003
2017-06-20 16:16:29,002 INFO CopyFiles$ Processing DocNum: 1882900, FileYear: 1978, FileMd: 1023, Files: List(Z:\I\1978\10\23\1882900.001, Z:\I\1978\10\23\1882900.002, Z:\I\1978\10\23\1882900.003, Z:\I\1978\10\23\1882900.004, Z:\I\1978\10\23\1882900.005, Z:\I\1978\10\23\1882900.006)
2017-06-20 16:16:29,002 INFO CopyFiles$ Copying: Z:\I\1978\10\23\1882900.001 to: ./preindex/1978/1882900.001
2017-06-20 16:16:29,002 INFO CopyFiles$ Copying: Z:\I\1978\10\23\1882900.002 to: ./preindex/1978/1882900.002
2017-06-20 16:16:29,002 INFO CopyFiles$ Copying: Z:\I\1978\10\23\1882900.003 to: ./preindex/1978/1882900.003
2017-06-20 16:16:29,017 INFO CopyFiles$ Copying: Z:\I\1978\10\23\1882900.004 to: ./preindex/1978/1882900.004
2017-06-20 16:16:29,017 INFO CopyFiles$ Copying: Z:\I\1978\10\23\1882900.005 to: ./preindex/1978/1882900.005
2017-06-20 16:16:29,033 INFO CopyFiles$ Copying: Z:\I\1978\10\23\1882900.006 to: ./preindex/1978/1882900.006
2017-06-20 16:16:29,033 INFO CopyFiles$ Processing DocNum: 1759027, FileYear: 1978, FileMd: 424, Files: List(Z:\I\1978\04\24\1759027.001, Z:\I\1978\04\24\1759027.002, Z:\I\1978\04\24\1759027.003, Z:\I\1978\04\24\1759027.004, Z:\I\1978\04\24\1759027.005, Z:\I\1978\04\24\1759027.006)
2017-06-20 16:16:29,033 INFO CopyFiles$ Copying: Z:\I\1978\04\24\1759027.001 to: ./preindex/1978/1759027.001
2017-06-20 16:16:29,064 INFO CopyFiles$ Copying: Z:\I\1978\04\24\1759027.002 to: ./preindex/1978/1759027.002
2017-06-20 16:16:29,080 INFO CopyFiles$ Copying: Z:\I\1978\04\24\1759027.003 to: ./preindex/1978/1759027.003
2017-06-20 16:16:29,111 INFO CopyFiles$ Copying: Z:\I\1978\04\24\1759027.004 to: ./preindex/1978/1759027.004
2017-06-20 16:16:29,127 INFO CopyFiles$ Copying: Z:\I\1978\04\24\1759027.005 to: ./preindex/1978/1759027.005
2017-06-20 16:16:29,142 INFO CopyFiles$ Copying: Z:\I\1978\04\24\1759027.006 to: ./preindex/1978/1759027.006
2017-06-20 16:16:29,158 INFO CopyFiles$ Processing DocNum: 1750354, FileYear: 1978, FileMd: 426, Files: List(Z:\I\1978\04\26\1750354.001, Z:\I\1978\04\26\1750354.002, Z:\I\1978\04\26\1750354.003, Z:\I\1978\04\26\1750354.004, Z:\I\1978\04\26\1750354.005)
2017-06-20 16:16:29,158 INFO CopyFiles$ Copying: Z:\I\1978\04\26\1750354.001 to: ./preindex/1978/1750354.001
2017-06-20 16:16:29,173 INFO CopyFiles$ Copying: Z:\I\1978\04\26\1750354.002 to: ./preindex/1978/1750354.002
2017-06-20 16:16:29,189 INFO CopyFiles$ Copying: Z:\I\1978\04\26\1750354.003 to: ./preindex/1978/1750354.003
2017-06-20 16:16:29,205 INFO CopyFiles$ Copying: Z:\I\1978\04\26\1750354.004 to: ./preindex/1978/1750354.004
2017-06-20 16:16:29,205 INFO CopyFiles$ Copying: Z:\I\1978\04\26\1750354.005 to: ./preindex/1978/1750354.005
2017-06-20 16:16:29,205 INFO CopyFiles$ Processing DocNum: 1889014, FileYear: 1978, FileMd: 1101, Files: List(Z:\I\1978\11\01\1889014.001, Z:\I\1978\11\01\1889014.002, Z:\I\1978\11\01\1889014.003)
2017-06-20 16:16:29,205 INFO CopyFiles$ Copying: Z:\I\1978\11\01\1889014.001 to: ./preindex/1978/1889014.001
2017-06-20 16:16:29,220 INFO CopyFiles$ Copying: Z:\I\1978\11\01\1889014.002 to: ./preindex/1978/1889014.002
2017-06-20 16:16:29,220 INFO CopyFiles$ Copying: Z:\I\1978\11\01\1889014.003 to: ./preindex/1978/1889014.003
2017-06-20 16:16:29,236 INFO CopyFiles$ Processing DocNum: 1709581, FileYear: 1978, FileMd: 215, Files: List(Z:\I\1978\02\15\1709581.001, Z:\I\1978\02\15\1709581.002, Z:\I\1978\02\15\1709581.003, Z:\I\1978\02\15\1709581.004, Z:\I\1978\02\15\1709581.005, Z:\I\1978\02\15\1709581.006)
2017-06-20 16:16:29,251 INFO CopyFiles$ Copying: Z:\I\1978\02\15\1709581.001 to: ./preindex/1978/1709581.001
2017-06-20 16:16:29,267 INFO CopyFiles$ Copying: Z:\I\1978\02\15\1709581.002 to: ./preindex/1978/1709581.002
2017-06-20 16:16:29,283 INFO CopyFiles$ Copying: Z:\I\1978\02\15\1709581.003 to: ./preindex/1978/1709581.003
2017-06-20 16:16:29,298 INFO CopyFiles$ Copying: Z:\I\1978\02\15\1709581.004 to: ./preindex/1978/1709581.004
2017-06-20 16:16:29,314 INFO CopyFiles$ Copying: Z:\I\1978\02\15\1709581.005 to: ./preindex/1978/1709581.005
2017-06-20 16:16:29,314 INFO CopyFiles$ Copying: Z:\I\1978\02\15\1709581.006 to: ./preindex/1978/1709581.006
2017-06-20 16:16:29,329 INFO CopyFiles$ Processing DocNum: 1886608, FileYear: 1978, FileMd: 1027, Files: List(Z:\I\1978\10\27\1886608.001, Z:\I\1978\10\27\1886608.002, Z:\I\1978\10\27\1886608.003, Z:\I\1978\10\27\1886608.004, Z:\I\1978\10\27\1886608.005)
2017-06-20 16:16:29,329 INFO CopyFiles$ Copying: Z:\I\1978\10\27\1886608.001 to: ./preindex/1978/1886608.001
2017-06-20 16:16:29,329 INFO CopyFiles$ Copying: Z:\I\1978\10\27\1886608.002 to: ./preindex/1978/1886608.002
2017-06-20 16:16:29,345 INFO CopyFiles$ Copying: Z:\I\1978\10\27\1886608.003 to: ./preindex/1978/1886608.003
2017-06-20 16:16:29,345 INFO CopyFiles$ Copying: Z:\I\1978\10\27\1886608.004 to: ./preindex/1978/1886608.004
2017-06-20 16:16:29,345 INFO CopyFiles$ Copying: Z:\I\1978\10\27\1886608.005 to: ./preindex/1978/1886608.005
2017-06-20 16:16:29,361 INFO CopyFiles$ Processing DocNum: 1898926, FileYear: 1978, FileMd: 1115, Files: List(Z:\I\1978\11\15\1898926.001, Z:\I\1978\11\15\1898926.002)
2017-06-20 16:16:29,361 INFO CopyFiles$ Copying: Z:\I\1978\11\15\1898926.001 to: ./preindex/1978/1898926.001
2017-06-20 16:16:29,361 INFO CopyFiles$ Copying: Z:\I\1978\11\15\1898926.002 to: ./preindex/1978/1898926.002
2017-06-20 16:16:29,376 INFO CopyFiles$ Processing DocNum: 1732337, FileYear: 1978, FileMd: 331, Files: List(Z:\I\1978\03\31\1732337.001, Z:\I\1978\03\31\1732337.002)
2017-06-20 16:16:29,376 INFO CopyFiles$ Copying: Z:\I\1978\03\31\1732337.001 to: ./preindex/1978/1732337.001
2017-06-20 16:16:29,392 INFO CopyFiles$ Copying: Z:\I\1978\03\31\1732337.002 to: ./preindex/1978/1732337.002
2017-06-20 16:16:29,392 INFO CopyFiles$ Processing DocNum: 1901338, FileYear: 1978, FileMd: 1117, Files: List(Z:\I\1978\11\17\1901338.001, Z:\I\1978\11\17\1901338.002, Z:\I\1978\11\17\1901338.003)
2017-06-20 16:16:29,392 INFO CopyFiles$ Copying: Z:\I\1978\11\17\1901338.001 to: ./preindex/1978/1901338.001
2017-06-20 16:16:29,423 INFO CopyFiles$ Copying: Z:\I\1978\11\17\1901338.002 to: ./preindex/1978/1901338.002
2017-06-20 16:16:29,423 INFO CopyFiles$ Copying: Z:\I\1978\11\17\1901338.003 to: ./preindex/1978/1901338.003
2017-06-20 16:16:29,439 INFO CopyFiles$ Processing DocNum: 1808184, FileYear: 1978, FileMd: 714, Files: List(Z:\I\1978\07\14\1808184.001, Z:\I\1978\07\14\1808184.002)
2017-06-20 16:16:29,439 INFO CopyFiles$ Copying: Z:\I\1978\07\14\1808184.001 to: ./preindex/1978/1808184.001
2017-06-20 16:16:29,454 INFO CopyFiles$ Copying: Z:\I\1978\07\14\1808184.002 to: ./preindex/1978/1808184.002
2017-06-20 16:16:29,470 INFO CopyFiles$ Processing DocNum: 1781726, FileYear: 1978, FileMd: 607, Files: List(Z:\I\1978\06\07\1781726.001, Z:\I\1978\06\07\1781726.002, Z:\I\1978\06\07\1781726.003)
2017-06-20 16:16:29,470 INFO CopyFiles$ Copying: Z:\I\1978\06\07\1781726.001 to: ./preindex/1978/1781726.001
2017-06-20 16:16:29,485 INFO CopyFiles$ Copying: Z:\I\1978\06\07\1781726.002 to: ./preindex/1978/1781726.002
2017-06-20 16:16:29,501 INFO CopyFiles$ Copying: Z:\I\1978\06\07\1781726.003 to: ./preindex/1978/1781726.003
2017-06-20 16:16:29,501 INFO CopyFiles$ Processing DocNum: 1846438, FileYear: 1978, FileMd: 901, Files: List(Z:\I\1978\09\01\1846438.001, Z:\I\1978\09\01\1846438.002, Z:\I\1978\09\01\1846438.003, Z:\I\1978\09\01\1846438.004)
2017-06-20 16:16:29,501 INFO CopyFiles$ Copying: Z:\I\1978\09\01\1846438.001 to: ./preindex/1978/1846438.001
2017-06-20 16:16:29,532 INFO CopyFiles$ Copying: Z:\I\1978\09\01\1846438.002 to: ./preindex/1978/1846438.002
2017-06-20 16:16:29,532 INFO CopyFiles$ Copying: Z:\I\1978\09\01\1846438.003 to: ./preindex/1978/1846438.003
2017-06-20 16:16:29,532 INFO CopyFiles$ Copying: Z:\I\1978\09\01\1846438.004 to: ./preindex/1978/1846438.004
2017-06-20 16:16:29,548 INFO CopyFiles$ Processing DocNum: 1734502, FileYear: 1978, FileMd: 405, Files: List(Z:\I\1978\04\05\1734502.001, Z:\I\1978\04\05\1734502.002, Z:\I\1978\04\05\1734502.003, Z:\I\1978\04\05\1734502.004)
2017-06-20 16:16:29,548 INFO CopyFiles$ Copying: Z:\I\1978\04\05\1734502.001 to: ./preindex/1978/1734502.001
2017-06-20 16:16:29,579 INFO CopyFiles$ Copying: Z:\I\1978\04\05\1734502.002 to: ./preindex/1978/1734502.002
2017-06-20 16:16:29,595 INFO CopyFiles$ Copying: Z:\I\1978\04\05\1734502.003 to: ./preindex/1978/1734502.003
2017-06-20 16:16:29,595 INFO CopyFiles$ Copying: Z:\I\1978\04\05\1734502.004 to: ./preindex/1978/1734502.004
2017-06-20 16:16:29,610 INFO CopyFiles$ Processing DocNum: 1837839, FileYear: 1978, FileMd: 822, Files: List(Z:\I\1978\08\22\1837839.001, Z:\I\1978\08\22\1837839.002, Z:\I\1978\08\22\1837839.003, Z:\I\1978\08\22\1837839.004)
2017-06-20 16:16:29,610 INFO CopyFiles$ Copying: Z:\I\1978\08\22\1837839.001 to: ./preindex/1978/1837839.001
2017-06-20 16:16:29,626 INFO CopyFiles$ Copying: Z:\I\1978\08\22\1837839.002 to: ./preindex/1978/1837839.002
2017-06-20 16:16:29,641 INFO CopyFiles$ Copying: Z:\I\1978\08\22\1837839.003 to: ./preindex/1978/1837839.003
2017-06-20 16:16:29,641 INFO CopyFiles$ Copying: Z:\I\1978\08\22\1837839.004 to: ./preindex/1978/1837839.004
2017-06-20 16:16:29,657 INFO CopyFiles$ Processing DocNum: 1684170, FileYear: 1978, FileMd: 116, Files: List(Z:\I\1978\01\16\1684170.001, Z:\I\1978\01\16\1684170.002, Z:\I\1978\01\16\1684170.003, Z:\I\1978\01\16\1684170.004)
2017-06-20 16:16:29,673 INFO CopyFiles$ Copying: Z:\I\1978\01\16\1684170.001 to: ./preindex/1978/1684170.001
2017-06-20 16:16:29,688 INFO CopyFiles$ Copying: Z:\I\1978\01\16\1684170.002 to: ./preindex/1978/1684170.002
2017-06-20 16:16:29,704 INFO CopyFiles$ Copying: Z:\I\1978\01\16\1684170.003 to: ./preindex/1978/1684170.003
2017-06-20 16:16:29,719 INFO CopyFiles$ Copying: Z:\I\1978\01\16\1684170.004 to: ./preindex/1978/1684170.004
2017-06-20 16:16:29,719 INFO CopyFiles$ Processing DocNum: 1846323, FileYear: 1978, FileMd: 901, Files: List(Z:\I\1978\09\01\1846323.001, Z:\I\1978\09\01\1846323.002, Z:\I\1978\09\01\1846323.003)
2017-06-20 16:16:29,719 INFO CopyFiles$ Copying: Z:\I\1978\09\01\1846323.001 to: ./preindex/1978/1846323.001
2017-06-20 16:16:29,735 INFO CopyFiles$ Copying: Z:\I\1978\09\01\1846323.002 to: ./preindex/1978/1846323.002
2017-06-20 16:16:29,766 INFO CopyFiles$ Copying: Z:\I\1978\09\01\1846323.003 to: ./preindex/1978/1846323.003
2017-06-20 16:16:29,797 INFO CopyFiles$ Processing DocNum: 1806527, FileYear: 1978, FileMd: 712, Files: List(Z:\I\1978\07\12\1806527.001, Z:\I\1978\07\12\1806527.002, Z:\I\1978\07\12\1806527.003)
2017-06-20 16:16:29,797 INFO CopyFiles$ Copying: Z:\I\1978\07\12\1806527.001 to: ./preindex/1978/1806527.001
2017-06-20 16:16:29,813 INFO CopyFiles$ Copying: Z:\I\1978\07\12\1806527.002 to: ./preindex/1978/1806527.002
2017-06-20 16:16:29,813 INFO CopyFiles$ Copying: Z:\I\1978\07\12\1806527.003 to: ./preindex/1978/1806527.003
2017-06-20 16:16:29,829 INFO CopyFiles$ Processing DocNum: 1900486, FileYear: 1978, FileMd: 1116, Files: List(Z:\I\1978\11\16\1900486.001, Z:\I\1978\11\16\1900486.002, Z:\I\1978\11\16\1900486.003, Z:\I\1978\11\16\1900486.004)
2017-06-20 16:16:29,829 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900486.001 to: ./preindex/1978/1900486.001
2017-06-20 16:16:29,844 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900486.002 to: ./preindex/1978/1900486.002
2017-06-20 16:16:29,860 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900486.003 to: ./preindex/1978/1900486.003
2017-06-20 16:16:29,860 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900486.004 to: ./preindex/1978/1900486.004
2017-06-20 16:16:29,875 INFO CopyFiles$ Processing DocNum: 1871143, FileYear: 1978, FileMd: 1005, Files: List(Z:\I\1978\10\05\1871143.001, Z:\I\1978\10\05\1871143.002, Z:\I\1978\10\05\1871143.003)
2017-06-20 16:16:29,875 INFO CopyFiles$ Copying: Z:\I\1978\10\05\1871143.001 to: ./preindex/1978/1871143.001
2017-06-20 16:16:29,891 INFO CopyFiles$ Copying: Z:\I\1978\10\05\1871143.002 to: ./preindex/1978/1871143.002
2017-06-20 16:16:29,922 INFO CopyFiles$ Copying: Z:\I\1978\10\05\1871143.003 to: ./preindex/1978/1871143.003
2017-06-20 16:16:29,938 INFO CopyFiles$ Processing DocNum: 1723725, FileYear: 1978, FileMd: 317, Files: List(Z:\I\1978\03\17\1723725.001, Z:\I\1978\03\17\1723725.002, Z:\I\1978\03\17\1723725.003, Z:\I\1978\03\17\1723725.004)
2017-06-20 16:16:29,938 INFO CopyFiles$ Copying: Z:\I\1978\03\17\1723725.001 to: ./preindex/1978/1723725.001
2017-06-20 16:16:29,938 INFO CopyFiles$ Copying: Z:\I\1978\03\17\1723725.002 to: ./preindex/1978/1723725.002
2017-06-20 16:16:29,953 INFO CopyFiles$ Copying: Z:\I\1978\03\17\1723725.003 to: ./preindex/1978/1723725.003
2017-06-20 16:16:29,969 INFO CopyFiles$ Copying: Z:\I\1978\03\17\1723725.004 to: ./preindex/1978/1723725.004
2017-06-20 16:16:29,985 INFO CopyFiles$ Processing DocNum: 1857435, FileYear: 1978, FileMd: 918, Files: List(Z:\I\1978\09\18\1857435.001, Z:\I\1978\09\18\1857435.002, Z:\I\1978\09\18\1857435.003, Z:\I\1978\09\18\1857435.004, Z:\I\1978\09\18\1857435.005, Z:\I\1978\09\18\1857435.006, Z:\I\1978\09\18\1857435.007, Z:\I\1978\09\18\1857435.008)
2017-06-20 16:16:29,985 INFO CopyFiles$ Copying: Z:\I\1978\09\18\1857435.001 to: ./preindex/1978/1857435.001
2017-06-20 16:16:30,000 INFO CopyFiles$ Copying: Z:\I\1978\09\18\1857435.002 to: ./preindex/1978/1857435.002
2017-06-20 16:16:30,016 INFO CopyFiles$ Copying: Z:\I\1978\09\18\1857435.003 to: ./preindex/1978/1857435.003
2017-06-20 16:16:30,016 INFO CopyFiles$ Copying: Z:\I\1978\09\18\1857435.004 to: ./preindex/1978/1857435.004
2017-06-20 16:16:30,031 INFO CopyFiles$ Copying: Z:\I\1978\09\18\1857435.005 to: ./preindex/1978/1857435.005
2017-06-20 16:16:30,031 INFO CopyFiles$ Copying: Z:\I\1978\09\18\1857435.006 to: ./preindex/1978/1857435.006
2017-06-20 16:16:30,047 INFO CopyFiles$ Copying: Z:\I\1978\09\18\1857435.007 to: ./preindex/1978/1857435.007
2017-06-20 16:16:30,047 INFO CopyFiles$ Copying: Z:\I\1978\09\18\1857435.008 to: ./preindex/1978/1857435.008
2017-06-20 16:16:30,047 INFO CopyFiles$ Processing DocNum: 1889686, FileYear: 1978, FileMd: 1101, Files: List(Z:\I\1978\11\01\1889686.001, Z:\I\1978\11\01\1889686.002, Z:\I\1978\11\01\1889686.003, Z:\I\1978\11\01\1889686.004)
2017-06-20 16:16:30,047 INFO CopyFiles$ Copying: Z:\I\1978\11\01\1889686.001 to: ./preindex/1978/1889686.001
2017-06-20 16:16:30,078 INFO CopyFiles$ Copying: Z:\I\1978\11\01\1889686.002 to: ./preindex/1978/1889686.002
2017-06-20 16:16:30,078 INFO CopyFiles$ Copying: Z:\I\1978\11\01\1889686.003 to: ./preindex/1978/1889686.003
2017-06-20 16:16:30,094 INFO CopyFiles$ Copying: Z:\I\1978\11\01\1889686.004 to: ./preindex/1978/1889686.004
2017-06-20 16:16:30,094 INFO CopyFiles$ Processing DocNum: 1707290, FileYear: 1978, FileMd: 222, Files: List(Z:\I\1978\02\22\1707290.001, Z:\I\1978\02\22\1707290.002, Z:\I\1978\02\22\1707290.003, Z:\I\1978\02\22\1707290.004)
2017-06-20 16:16:30,094 INFO CopyFiles$ Copying: Z:\I\1978\02\22\1707290.001 to: ./preindex/1978/1707290.001
2017-06-20 16:16:30,109 INFO CopyFiles$ Copying: Z:\I\1978\02\22\1707290.002 to: ./preindex/1978/1707290.002
2017-06-20 16:16:30,109 INFO CopyFiles$ Copying: Z:\I\1978\02\22\1707290.003 to: ./preindex/1978/1707290.003
2017-06-20 16:16:30,125 INFO CopyFiles$ Copying: Z:\I\1978\02\22\1707290.004 to: ./preindex/1978/1707290.004
2017-06-20 16:16:30,141 INFO CopyFiles$ Processing DocNum: 1888396, FileYear: 1978, FileMd: 1031, Files: List(Z:\I\1978\10\31\1888396.001, Z:\I\1978\10\31\1888396.002, Z:\I\1978\10\31\1888396.003, Z:\I\1978\10\31\1888396.004)
2017-06-20 16:16:30,141 INFO CopyFiles$ Copying: Z:\I\1978\10\31\1888396.001 to: ./preindex/1978/1888396.001
2017-06-20 16:16:30,156 INFO CopyFiles$ Copying: Z:\I\1978\10\31\1888396.002 to: ./preindex/1978/1888396.002
2017-06-20 16:16:30,156 INFO CopyFiles$ Copying: Z:\I\1978\10\31\1888396.003 to: ./preindex/1978/1888396.003
2017-06-20 16:16:30,172 INFO CopyFiles$ Copying: Z:\I\1978\10\31\1888396.004 to: ./preindex/1978/1888396.004
2017-06-20 16:16:30,172 INFO CopyFiles$ Processing DocNum: 1847393, FileYear: 1978, FileMd: 905, Files: List(Z:\I\1978\09\05\1847393.001, Z:\I\1978\09\05\1847393.002, Z:\I\1978\09\05\1847393.003, Z:\I\1978\09\05\1847393.004)
2017-06-20 16:16:30,172 INFO CopyFiles$ Copying: Z:\I\1978\09\05\1847393.001 to: ./preindex/1978/1847393.001
2017-06-20 16:16:30,187 INFO CopyFiles$ Copying: Z:\I\1978\09\05\1847393.002 to: ./preindex/1978/1847393.002
2017-06-20 16:16:30,187 INFO CopyFiles$ Copying: Z:\I\1978\09\05\1847393.003 to: ./preindex/1978/1847393.003
2017-06-20 16:16:30,187 INFO CopyFiles$ Copying: Z:\I\1978\09\05\1847393.004 to: ./preindex/1978/1847393.004
2017-06-20 16:16:30,203 INFO CopyFiles$ Processing DocNum: 1918143, FileYear: 1978, FileMd: 1218, Files: List(Z:\I\1978\12\18\1918143.001, Z:\I\1978\12\18\1918143.002, Z:\I\1978\12\18\1918143.003)
2017-06-20 16:16:30,203 INFO CopyFiles$ Copying: Z:\I\1978\12\18\1918143.001 to: ./preindex/1978/1918143.001
2017-06-20 16:16:30,203 INFO CopyFiles$ Copying: Z:\I\1978\12\18\1918143.002 to: ./preindex/1978/1918143.002
2017-06-20 16:16:30,219 INFO CopyFiles$ Copying: Z:\I\1978\12\18\1918143.003 to: ./preindex/1978/1918143.003
2017-06-20 16:16:30,234 INFO CopyFiles$ Processing DocNum: 1821702, FileYear: 1978, FileMd: 802, Files: List(Z:\I\1978\08\02\1821702.001, Z:\I\1978\08\02\1821702.002, Z:\I\1978\08\02\1821702.003, Z:\I\1978\08\02\1821702.004, Z:\I\1978\08\02\1821702.005, Z:\I\1978\08\02\1821702.006, Z:\I\1978\08\02\1821702.007)
2017-06-20 16:16:30,234 INFO CopyFiles$ Copying: Z:\I\1978\08\02\1821702.001 to: ./preindex/1978/1821702.001
2017-06-20 16:16:30,250 INFO CopyFiles$ Copying: Z:\I\1978\08\02\1821702.002 to: ./preindex/1978/1821702.002
2017-06-20 16:16:30,250 INFO CopyFiles$ Copying: Z:\I\1978\08\02\1821702.003 to: ./preindex/1978/1821702.003
2017-06-20 16:16:30,265 INFO CopyFiles$ Copying: Z:\I\1978\08\02\1821702.004 to: ./preindex/1978/1821702.004
2017-06-20 16:16:30,265 INFO CopyFiles$ Copying: Z:\I\1978\08\02\1821702.005 to: ./preindex/1978/1821702.005
2017-06-20 16:16:30,281 INFO CopyFiles$ Copying: Z:\I\1978\08\02\1821702.006 to: ./preindex/1978/1821702.006
2017-06-20 16:16:30,281 INFO CopyFiles$ Copying: Z:\I\1978\08\02\1821702.007 to: ./preindex/1978/1821702.007
2017-06-20 16:16:30,297 INFO CopyFiles$ Processing DocNum: 1736227, FileYear: 1978, FileMd: 405, Files: List(Z:\I\1978\04\05\1736227.001, Z:\I\1978\04\05\1736227.002)
2017-06-20 16:16:30,297 INFO CopyFiles$ Copying: Z:\I\1978\04\05\1736227.001 to: ./preindex/1978/1736227.001
2017-06-20 16:16:30,297 INFO CopyFiles$ Copying: Z:\I\1978\04\05\1736227.002 to: ./preindex/1978/1736227.002
2017-06-20 16:16:30,312 INFO CopyFiles$ Processing DocNum: 1915058, FileYear: 1978, FileMd: 1211, Files: List(Z:\I\1978\12\11\1915058.001, Z:\I\1978\12\11\1915058.002)
2017-06-20 16:16:30,312 INFO CopyFiles$ Copying: Z:\I\1978\12\11\1915058.001 to: ./preindex/1978/1915058.001
2017-06-20 16:16:30,328 INFO CopyFiles$ Copying: Z:\I\1978\12\11\1915058.002 to: ./preindex/1978/1915058.002
2017-06-20 16:16:30,343 INFO CopyFiles$ Processing DocNum: 1822087, FileYear: 1978, FileMd: 802, Files: List(Z:\I\1978\08\02\1822087.001, Z:\I\1978\08\02\1822087.002, Z:\I\1978\08\02\1822087.003)
2017-06-20 16:16:30,343 INFO CopyFiles$ Copying: Z:\I\1978\08\02\1822087.001 to: ./preindex/1978/1822087.001
2017-06-20 16:16:30,343 INFO CopyFiles$ Copying: Z:\I\1978\08\02\1822087.002 to: ./preindex/1978/1822087.002
2017-06-20 16:16:30,359 INFO CopyFiles$ Copying: Z:\I\1978\08\02\1822087.003 to: ./preindex/1978/1822087.003
2017-06-20 16:16:30,375 INFO CopyFiles$ Processing DocNum: 1739793, FileYear: 1978, FileMd: 410, Files: List(Z:\I\1978\04\10\1739793.001, Z:\I\1978\04\10\1739793.002, Z:\I\1978\04\10\1739793.003, Z:\I\1978\04\10\1739793.004, Z:\I\1978\04\10\1739793.005)
2017-06-20 16:16:30,375 INFO CopyFiles$ Copying: Z:\I\1978\04\10\1739793.001 to: ./preindex/1978/1739793.001
2017-06-20 16:16:30,390 INFO CopyFiles$ Copying: Z:\I\1978\04\10\1739793.002 to: ./preindex/1978/1739793.002
2017-06-20 16:16:30,406 INFO CopyFiles$ Copying: Z:\I\1978\04\10\1739793.003 to: ./preindex/1978/1739793.003
2017-06-20 16:16:30,421 INFO CopyFiles$ Copying: Z:\I\1978\04\10\1739793.004 to: ./preindex/1978/1739793.004
2017-06-20 16:16:30,437 INFO CopyFiles$ Copying: Z:\I\1978\04\10\1739793.005 to: ./preindex/1978/1739793.005
2017-06-20 16:16:30,453 INFO CopyFiles$ Processing DocNum: 1790305, FileYear: 1978, FileMd: 620, Files: List(Z:\I\1978\06\20\1790305.001, Z:\I\1978\06\20\1790305.002)
2017-06-20 16:16:30,453 INFO CopyFiles$ Copying: Z:\I\1978\06\20\1790305.001 to: ./preindex/1978/1790305.001
2017-06-20 16:16:30,468 INFO CopyFiles$ Copying: Z:\I\1978\06\20\1790305.002 to: ./preindex/1978/1790305.002
2017-06-20 16:16:30,484 INFO CopyFiles$ Processing DocNum: 1884819, FileYear: 1978, FileMd: 1025, Files: List(Z:\I\1978\10\25\1884819.001, Z:\I\1978\10\25\1884819.002, Z:\I\1978\10\25\1884819.003)
2017-06-20 16:16:30,484 INFO CopyFiles$ Copying: Z:\I\1978\10\25\1884819.001 to: ./preindex/1978/1884819.001
2017-06-20 16:16:30,499 INFO CopyFiles$ Copying: Z:\I\1978\10\25\1884819.002 to: ./preindex/1978/1884819.002
2017-06-20 16:16:30,499 INFO CopyFiles$ Copying: Z:\I\1978\10\25\1884819.003 to: ./preindex/1978/1884819.003
2017-06-20 16:16:30,515 INFO CopyFiles$ Processing DocNum: 1911368, FileYear: 1978, FileMd: 1205, Files: List(Z:\I\1978\12\05\1911368.001, Z:\I\1978\12\05\1911368.002, Z:\I\1978\12\05\1911368.003, Z:\I\1978\12\05\1911368.004, Z:\I\1978\12\05\1911368.005, Z:\I\1978\12\05\1911368.006)
2017-06-20 16:16:30,515 INFO CopyFiles$ Copying: Z:\I\1978\12\05\1911368.001 to: ./preindex/1978/1911368.001
2017-06-20 16:16:30,531 INFO CopyFiles$ Copying: Z:\I\1978\12\05\1911368.002 to: ./preindex/1978/1911368.002
2017-06-20 16:16:30,546 INFO CopyFiles$ Copying: Z:\I\1978\12\05\1911368.003 to: ./preindex/1978/1911368.003
2017-06-20 16:16:30,546 INFO CopyFiles$ Copying: Z:\I\1978\12\05\1911368.004 to: ./preindex/1978/1911368.004
2017-06-20 16:16:30,546 INFO CopyFiles$ Copying: Z:\I\1978\12\05\1911368.005 to: ./preindex/1978/1911368.005
2017-06-20 16:16:30,562 INFO CopyFiles$ Copying: Z:\I\1978\12\05\1911368.006 to: ./preindex/1978/1911368.006
2017-06-20 16:16:30,562 INFO CopyFiles$ Processing DocNum: 1728765, FileYear: 1978, FileMd: 324, Files: List(Z:\I\1978\03\24\1728765.001, Z:\I\1978\03\24\1728765.002, Z:\I\1978\03\24\1728765.003)
2017-06-20 16:16:30,562 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1728765.001 to: ./preindex/1978/1728765.001
2017-06-20 16:16:30,577 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1728765.002 to: ./preindex/1978/1728765.002
2017-06-20 16:16:30,577 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1728765.003 to: ./preindex/1978/1728765.003
2017-06-20 16:16:30,609 INFO CopyFiles$ Processing DocNum: 1753475, FileYear: 1978, FileMd: 428, Files: List(Z:\I\1978\04\28\1753475.001, Z:\I\1978\04\28\1753475.002, Z:\I\1978\04\28\1753475.003)
2017-06-20 16:16:30,609 INFO CopyFiles$ Copying: Z:\I\1978\04\28\1753475.001 to: ./preindex/1978/1753475.001
2017-06-20 16:16:30,624 INFO CopyFiles$ Copying: Z:\I\1978\04\28\1753475.002 to: ./preindex/1978/1753475.002
2017-06-20 16:16:30,640 INFO CopyFiles$ Copying: Z:\I\1978\04\28\1753475.003 to: ./preindex/1978/1753475.003
2017-06-20 16:16:30,640 INFO CopyFiles$ Processing DocNum: 1750349, FileYear: 1978, FileMd: 426, Files: List(Z:\I\1978\04\26\1750349.001, Z:\I\1978\04\26\1750349.002, Z:\I\1978\04\26\1750349.003, Z:\I\1978\04\26\1750349.004, Z:\I\1978\04\26\1750349.005)
2017-06-20 16:16:30,640 INFO CopyFiles$ Copying: Z:\I\1978\04\26\1750349.001 to: ./preindex/1978/1750349.001
2017-06-20 16:16:30,640 INFO CopyFiles$ Copying: Z:\I\1978\04\26\1750349.002 to: ./preindex/1978/1750349.002
2017-06-20 16:16:30,655 INFO CopyFiles$ Copying: Z:\I\1978\04\26\1750349.003 to: ./preindex/1978/1750349.003
2017-06-20 16:16:30,671 INFO CopyFiles$ Copying: Z:\I\1978\04\26\1750349.004 to: ./preindex/1978/1750349.004
2017-06-20 16:16:30,671 INFO CopyFiles$ Copying: Z:\I\1978\04\26\1750349.005 to: ./preindex/1978/1750349.005
2017-06-20 16:16:30,687 INFO CopyFiles$ Processing DocNum: 1775317, FileYear: 1978, FileMd: 530, Files: List(Z:\I\1978\05\30\1775317.001, Z:\I\1978\05\30\1775317.002, Z:\I\1978\05\30\1775317.003)
2017-06-20 16:16:30,687 INFO CopyFiles$ Copying: Z:\I\1978\05\30\1775317.001 to: ./preindex/1978/1775317.001
2017-06-20 16:16:30,702 INFO CopyFiles$ Copying: Z:\I\1978\05\30\1775317.002 to: ./preindex/1978/1775317.002
2017-06-20 16:16:30,702 INFO CopyFiles$ Copying: Z:\I\1978\05\30\1775317.003 to: ./preindex/1978/1775317.003
2017-06-20 16:16:30,718 INFO CopyFiles$ Processing DocNum: 1741722, FileYear: 1978, FileMd: 412, Files: List(Z:\I\1978\04\12\1741722.001, Z:\I\1978\04\12\1741722.002, Z:\I\1978\04\12\1741722.003)
2017-06-20 16:16:30,718 INFO CopyFiles$ Copying: Z:\I\1978\04\12\1741722.001 to: ./preindex/1978/1741722.001
2017-06-20 16:16:30,733 INFO CopyFiles$ Copying: Z:\I\1978\04\12\1741722.002 to: ./preindex/1978/1741722.002
2017-06-20 16:16:30,749 INFO CopyFiles$ Copying: Z:\I\1978\04\12\1741722.003 to: ./preindex/1978/1741722.003
2017-06-20 16:16:30,765 INFO CopyFiles$ Processing DocNum: 1700223, FileYear: 1978, FileMd: 210, Files: List(Z:\I\1978\02\10\1700223.001, Z:\I\1978\02\10\1700223.002, Z:\I\1978\02\10\1700223.003, Z:\I\1978\02\10\1700223.004)
2017-06-20 16:16:30,765 INFO CopyFiles$ Copying: Z:\I\1978\02\10\1700223.001 to: ./preindex/1978/1700223.001
2017-06-20 16:16:30,780 INFO CopyFiles$ Copying: Z:\I\1978\02\10\1700223.002 to: ./preindex/1978/1700223.002
2017-06-20 16:16:30,796 INFO CopyFiles$ Copying: Z:\I\1978\02\10\1700223.003 to: ./preindex/1978/1700223.003
2017-06-20 16:16:30,796 INFO CopyFiles$ Copying: Z:\I\1978\02\10\1700223.004 to: ./preindex/1978/1700223.004
2017-06-20 16:16:30,811 INFO CopyFiles$ Processing DocNum: 1783731, FileYear: 1978, FileMd: 609, Files: List(Z:\I\1978\06\09\1783731.001, Z:\I\1978\06\09\1783731.002, Z:\I\1978\06\09\1783731.003, Z:\I\1978\06\09\1783731.004)
2017-06-20 16:16:30,811 INFO CopyFiles$ Copying: Z:\I\1978\06\09\1783731.001 to: ./preindex/1978/1783731.001
2017-06-20 16:16:30,843 INFO CopyFiles$ Copying: Z:\I\1978\06\09\1783731.002 to: ./preindex/1978/1783731.002
2017-06-20 16:16:30,843 INFO CopyFiles$ Copying: Z:\I\1978\06\09\1783731.003 to: ./preindex/1978/1783731.003
2017-06-20 16:16:30,858 INFO CopyFiles$ Copying: Z:\I\1978\06\09\1783731.004 to: ./preindex/1978/1783731.004
2017-06-20 16:16:30,858 INFO CopyFiles$ Processing DocNum: 1700930, FileYear: 1978, FileMd: 213, Files: List(Z:\I\1978\02\13\1700930.001, Z:\I\1978\02\13\1700930.002, Z:\I\1978\02\13\1700930.003, Z:\I\1978\02\13\1700930.004)
2017-06-20 16:16:30,858 INFO CopyFiles$ Copying: Z:\I\1978\02\13\1700930.001 to: ./preindex/1978/1700930.001
2017-06-20 16:16:30,874 INFO CopyFiles$ Copying: Z:\I\1978\02\13\1700930.002 to: ./preindex/1978/1700930.002
2017-06-20 16:16:30,889 INFO CopyFiles$ Copying: Z:\I\1978\02\13\1700930.003 to: ./preindex/1978/1700930.003
2017-06-20 16:16:30,889 INFO CopyFiles$ Copying: Z:\I\1978\02\13\1700930.004 to: ./preindex/1978/1700930.004
2017-06-20 16:16:30,905 INFO CopyFiles$ Processing DocNum: 1825028, FileYear: 1978, FileMd: 804, Files: List(Z:\I\1978\08\04\1825028.001, Z:\I\1978\08\04\1825028.002, Z:\I\1978\08\04\1825028.003, Z:\I\1978\08\04\1825028.004, Z:\I\1978\08\04\1825028.005)
2017-06-20 16:16:30,905 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825028.001 to: ./preindex/1978/1825028.001
2017-06-20 16:16:30,921 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825028.002 to: ./preindex/1978/1825028.002
2017-06-20 16:16:30,921 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825028.003 to: ./preindex/1978/1825028.003
2017-06-20 16:16:30,936 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825028.004 to: ./preindex/1978/1825028.004
2017-06-20 16:16:30,936 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825028.005 to: ./preindex/1978/1825028.005
2017-06-20 16:16:30,936 INFO CopyFiles$ Processing DocNum: 1857129, FileYear: 1978, FileMd: 918, Files: List(Z:\I\1978\09\18\1857129.001, Z:\I\1978\09\18\1857129.002)
2017-06-20 16:16:30,936 INFO CopyFiles$ Copying: Z:\I\1978\09\18\1857129.001 to: ./preindex/1978/1857129.001
2017-06-20 16:16:30,967 INFO CopyFiles$ Copying: Z:\I\1978\09\18\1857129.002 to: ./preindex/1978/1857129.002
2017-06-20 16:16:30,967 INFO CopyFiles$ Processing DocNum: 1808174, FileYear: 1978, FileMd: 714, Files: List(Z:\I\1978\07\14\1808174.001, Z:\I\1978\07\14\1808174.002)
2017-06-20 16:16:30,967 INFO CopyFiles$ Copying: Z:\I\1978\07\14\1808174.001 to: ./preindex/1978/1808174.001
2017-06-20 16:16:30,999 INFO CopyFiles$ Copying: Z:\I\1978\07\14\1808174.002 to: ./preindex/1978/1808174.002
2017-06-20 16:16:31,014 INFO CopyFiles$ Processing DocNum: 1922880, FileYear: 1978, FileMd: 1221, Files: List(Z:\I\1978\12\21\1922880.001, Z:\I\1978\12\21\1922880.002, Z:\I\1978\12\21\1922880.003)
2017-06-20 16:16:31,030 INFO CopyFiles$ Copying: Z:\I\1978\12\21\1922880.001 to: ./preindex/1978/1922880.001
2017-06-20 16:16:31,030 INFO CopyFiles$ Copying: Z:\I\1978\12\21\1922880.002 to: ./preindex/1978/1922880.002
2017-06-20 16:16:31,045 INFO CopyFiles$ Copying: Z:\I\1978\12\21\1922880.003 to: ./preindex/1978/1922880.003
2017-06-20 16:16:31,045 INFO CopyFiles$ Processing DocNum: 1878755, FileYear: 1978, FileMd: 1017, Files: List(Z:\I\1978\10\17\1878755.001, Z:\I\1978\10\17\1878755.002, Z:\I\1978\10\17\1878755.003, Z:\I\1978\10\17\1878755.004)
2017-06-20 16:16:31,045 INFO CopyFiles$ Copying: Z:\I\1978\10\17\1878755.001 to: ./preindex/1978/1878755.001
2017-06-20 16:16:31,061 INFO CopyFiles$ Copying: Z:\I\1978\10\17\1878755.002 to: ./preindex/1978/1878755.002
2017-06-20 16:16:31,077 INFO CopyFiles$ Copying: Z:\I\1978\10\17\1878755.003 to: ./preindex/1978/1878755.003
2017-06-20 16:16:31,092 INFO CopyFiles$ Copying: Z:\I\1978\10\17\1878755.004 to: ./preindex/1978/1878755.004
2017-06-20 16:16:31,092 INFO CopyFiles$ Processing DocNum: 1855388, FileYear: 1978, FileMd: 914, Files: List(Z:\I\1978\09\14\1855388.001, Z:\I\1978\09\14\1855388.002, Z:\I\1978\09\14\1855388.003)
2017-06-20 16:16:31,092 INFO CopyFiles$ Copying: Z:\I\1978\09\14\1855388.001 to: ./preindex/1978/1855388.001
2017-06-20 16:16:31,108 INFO CopyFiles$ Copying: Z:\I\1978\09\14\1855388.002 to: ./preindex/1978/1855388.002
2017-06-20 16:16:31,108 INFO CopyFiles$ Copying: Z:\I\1978\09\14\1855388.003 to: ./preindex/1978/1855388.003
2017-06-20 16:16:31,139 INFO CopyFiles$ Processing DocNum: 1679550, FileYear: 1978, FileMd: 109, Files: List(Z:\I\1978\01\09\1679550.001, Z:\I\1978\01\09\1679550.002, Z:\I\1978\01\09\1679550.003)
2017-06-20 16:16:31,139 INFO CopyFiles$ Copying: Z:\I\1978\01\09\1679550.001 to: ./preindex/1978/1679550.001
2017-06-20 16:16:31,155 INFO CopyFiles$ Copying: Z:\I\1978\01\09\1679550.002 to: ./preindex/1978/1679550.002
2017-06-20 16:16:31,170 INFO CopyFiles$ Copying: Z:\I\1978\01\09\1679550.003 to: ./preindex/1978/1679550.003
2017-06-20 16:16:31,186 INFO CopyFiles$ Processing DocNum: 1675177, FileYear: 1978, FileMd: 103, Files: List(Z:\I\1978\01\03\1675177.001, Z:\I\1978\01\03\1675177.002, Z:\I\1978\01\03\1675177.003, Z:\I\1978\01\03\1675177.004, Z:\I\1978\01\03\1675177.005, Z:\I\1978\01\03\1675177.006, Z:\I\1978\01\03\1675177.007, Z:\I\1978\01\03\1675177.008)
2017-06-20 16:16:31,186 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675177.001 to: ./preindex/1978/1675177.001
2017-06-20 16:16:31,201 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675177.002 to: ./preindex/1978/1675177.002
2017-06-20 16:16:31,217 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675177.003 to: ./preindex/1978/1675177.003
2017-06-20 16:16:31,233 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675177.004 to: ./preindex/1978/1675177.004
2017-06-20 16:16:31,233 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675177.005 to: ./preindex/1978/1675177.005
2017-06-20 16:16:31,248 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675177.006 to: ./preindex/1978/1675177.006
2017-06-20 16:16:31,264 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675177.007 to: ./preindex/1978/1675177.007
2017-06-20 16:16:31,264 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675177.008 to: ./preindex/1978/1675177.008
2017-06-20 16:16:31,279 INFO CopyFiles$ Processing DocNum: 1738149, FileYear: 1978, FileMd: 407, Files: List(Z:\I\1978\04\07\1738149.001, Z:\I\1978\04\07\1738149.002, Z:\I\1978\04\07\1738149.003, Z:\I\1978\04\07\1738149.004, Z:\I\1978\04\07\1738149.005)
2017-06-20 16:16:31,295 INFO CopyFiles$ Copying: Z:\I\1978\04\07\1738149.001 to: ./preindex/1978/1738149.001
2017-06-20 16:16:31,311 INFO CopyFiles$ Copying: Z:\I\1978\04\07\1738149.002 to: ./preindex/1978/1738149.002
2017-06-20 16:16:31,326 INFO CopyFiles$ Copying: Z:\I\1978\04\07\1738149.003 to: ./preindex/1978/1738149.003
2017-06-20 16:16:31,342 INFO CopyFiles$ Copying: Z:\I\1978\04\07\1738149.004 to: ./preindex/1978/1738149.004
2017-06-20 16:16:31,357 INFO CopyFiles$ Copying: Z:\I\1978\04\07\1738149.005 to: ./preindex/1978/1738149.005
2017-06-20 16:16:31,373 INFO CopyFiles$ Processing DocNum: 1922979, FileYear: 1978, FileMd: 1221, Files: List(Z:\I\1978\12\21\1922979.001, Z:\I\1978\12\21\1922979.002, Z:\I\1978\12\21\1922979.003, Z:\I\1978\12\21\1922979.004)
2017-06-20 16:16:31,373 INFO CopyFiles$ Copying: Z:\I\1978\12\21\1922979.001 to: ./preindex/1978/1922979.001
2017-06-20 16:16:31,404 INFO CopyFiles$ Copying: Z:\I\1978\12\21\1922979.002 to: ./preindex/1978/1922979.002
2017-06-20 16:16:31,404 INFO CopyFiles$ Copying: Z:\I\1978\12\21\1922979.003 to: ./preindex/1978/1922979.003
2017-06-20 16:16:31,420 INFO CopyFiles$ Copying: Z:\I\1978\12\21\1922979.004 to: ./preindex/1978/1922979.004
2017-06-20 16:16:31,420 INFO CopyFiles$ Processing DocNum: 1782713, FileYear: 1978, FileMd: 608, Files: List(Z:\I\1978\06\08\1782713.001, Z:\I\1978\06\08\1782713.002, Z:\I\1978\06\08\1782713.003, Z:\I\1978\06\08\1782713.004, Z:\I\1978\06\08\1782713.005)
2017-06-20 16:16:31,420 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1782713.001 to: ./preindex/1978/1782713.001
2017-06-20 16:16:31,420 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1782713.002 to: ./preindex/1978/1782713.002
2017-06-20 16:16:31,435 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1782713.003 to: ./preindex/1978/1782713.003
2017-06-20 16:16:31,435 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1782713.004 to: ./preindex/1978/1782713.004
2017-06-20 16:16:31,435 INFO CopyFiles$ Copying: Z:\I\1978\06\08\1782713.005 to: ./preindex/1978/1782713.005
2017-06-20 16:16:31,451 INFO CopyFiles$ Processing DocNum: 1927171, FileYear: 1978, FileMd: 1229, Files: List(Z:\I\1978\12\29\1927171.001)
2017-06-20 16:16:31,451 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927171.001 to: ./preindex/1978/1927171.001
2017-06-20 16:16:31,467 INFO CopyFiles$ Processing DocNum: 1812016, FileYear: 1978, FileMd: 719, Files: List(Z:\I\1978\07\19\1812016.001, Z:\I\1978\07\19\1812016.002)
2017-06-20 16:16:31,467 INFO CopyFiles$ Copying: Z:\I\1978\07\19\1812016.001 to: ./preindex/1978/1812016.001
2017-06-20 16:16:31,482 INFO CopyFiles$ Copying: Z:\I\1978\07\19\1812016.002 to: ./preindex/1978/1812016.002
2017-06-20 16:16:31,498 INFO CopyFiles$ Processing DocNum: 1693340, FileYear: 1978, FileMd: 131, Files: List(Z:\I\1978\01\31\1693340.001, Z:\I\1978\01\31\1693340.002, Z:\I\1978\01\31\1693340.003, Z:\I\1978\01\31\1693340.004, Z:\I\1978\01\31\1693340.005, Z:\I\1978\01\31\1693340.006, Z:\I\1978\01\31\1693340.007)
2017-06-20 16:16:31,513 INFO CopyFiles$ Copying: Z:\I\1978\01\31\1693340.001 to: ./preindex/1978/1693340.001
2017-06-20 16:16:31,513 INFO CopyFiles$ Copying: Z:\I\1978\01\31\1693340.002 to: ./preindex/1978/1693340.002
2017-06-20 16:16:31,529 INFO CopyFiles$ Copying: Z:\I\1978\01\31\1693340.003 to: ./preindex/1978/1693340.003
2017-06-20 16:16:31,529 INFO CopyFiles$ Copying: Z:\I\1978\01\31\1693340.004 to: ./preindex/1978/1693340.004
2017-06-20 16:16:31,545 INFO CopyFiles$ Copying: Z:\I\1978\01\31\1693340.005 to: ./preindex/1978/1693340.005
2017-06-20 16:16:31,560 INFO CopyFiles$ Copying: Z:\I\1978\01\31\1693340.006 to: ./preindex/1978/1693340.006
2017-06-20 16:16:31,560 INFO CopyFiles$ Copying: Z:\I\1978\01\31\1693340.007 to: ./preindex/1978/1693340.007
2017-06-20 16:16:31,576 INFO CopyFiles$ Processing DocNum: 1753800, FileYear: 1978, FileMd: 501, Files: List(Z:\I\1978\05\01\1753800.001, Z:\I\1978\05\01\1753800.002)
2017-06-20 16:16:31,576 INFO CopyFiles$ Copying: Z:\I\1978\05\01\1753800.001 to: ./preindex/1978/1753800.001
2017-06-20 16:16:31,591 INFO CopyFiles$ Copying: Z:\I\1978\05\01\1753800.002 to: ./preindex/1978/1753800.002
2017-06-20 16:16:31,607 INFO CopyFiles$ Processing DocNum: 1862729, FileYear: 1978, FileMd: 925, Files: List(Z:\I\1978\09\25\1862729.001, Z:\I\1978\09\25\1862729.002, Z:\I\1978\09\25\1862729.003, Z:\I\1978\09\25\1862729.004, Z:\I\1978\09\25\1862729.005, Z:\I\1978\09\25\1862729.006, Z:\I\1978\09\25\1862729.007)
2017-06-20 16:16:31,607 INFO CopyFiles$ Copying: Z:\I\1978\09\25\1862729.001 to: ./preindex/1978/1862729.001
2017-06-20 16:16:31,623 INFO CopyFiles$ Copying: Z:\I\1978\09\25\1862729.002 to: ./preindex/1978/1862729.002
2017-06-20 16:16:31,623 INFO CopyFiles$ Copying: Z:\I\1978\09\25\1862729.003 to: ./preindex/1978/1862729.003
2017-06-20 16:16:31,638 INFO CopyFiles$ Copying: Z:\I\1978\09\25\1862729.004 to: ./preindex/1978/1862729.004
2017-06-20 16:16:31,638 INFO CopyFiles$ Copying: Z:\I\1978\09\25\1862729.005 to: ./preindex/1978/1862729.005
2017-06-20 16:16:31,654 INFO CopyFiles$ Copying: Z:\I\1978\09\25\1862729.006 to: ./preindex/1978/1862729.006
2017-06-20 16:16:31,654 INFO CopyFiles$ Copying: Z:\I\1978\09\25\1862729.007 to: ./preindex/1978/1862729.007
2017-06-20 16:16:31,654 INFO CopyFiles$ Processing DocNum: 1808386, FileYear: 1978, FileMd: 714, Files: List(Z:\I\1978\07\14\1808386.001, Z:\I\1978\07\14\1808386.002)
2017-06-20 16:16:31,654 INFO CopyFiles$ Copying: Z:\I\1978\07\14\1808386.001 to: ./preindex/1978/1808386.001
2017-06-20 16:16:31,685 INFO CopyFiles$ Copying: Z:\I\1978\07\14\1808386.002 to: ./preindex/1978/1808386.002
2017-06-20 16:16:31,701 INFO CopyFiles$ Processing DocNum: 1900366, FileYear: 1978, FileMd: 1116, Files: List(Z:\I\1978\11\16\1900366.001, Z:\I\1978\11\16\1900366.002, Z:\I\1978\11\16\1900366.003, Z:\I\1978\11\16\1900366.004)
2017-06-20 16:16:31,701 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900366.001 to: ./preindex/1978/1900366.001
2017-06-20 16:16:31,701 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900366.002 to: ./preindex/1978/1900366.002
2017-06-20 16:16:31,716 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900366.003 to: ./preindex/1978/1900366.003
2017-06-20 16:16:31,716 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900366.004 to: ./preindex/1978/1900366.004
2017-06-20 16:16:31,732 INFO CopyFiles$ Processing DocNum: 1909561, FileYear: 1978, FileMd: 1201, Files: List(Z:\I\1978\12\01\1909561.001, Z:\I\1978\12\01\1909561.002, Z:\I\1978\12\01\1909561.003)
2017-06-20 16:16:31,732 INFO CopyFiles$ Copying: Z:\I\1978\12\01\1909561.001 to: ./preindex/1978/1909561.001
2017-06-20 16:16:31,747 INFO CopyFiles$ Copying: Z:\I\1978\12\01\1909561.002 to: ./preindex/1978/1909561.002
2017-06-20 16:16:31,763 INFO CopyFiles$ Copying: Z:\I\1978\12\01\1909561.003 to: ./preindex/1978/1909561.003
2017-06-20 16:16:31,794 INFO CopyFiles$ Processing DocNum: 1874723, FileYear: 1978, FileMd: 1011, Files: List(Z:\I\1978\10\11\1874723.001, Z:\I\1978\10\11\1874723.002)
2017-06-20 16:16:31,794 INFO CopyFiles$ Copying: Z:\I\1978\10\11\1874723.001 to: ./preindex/1978/1874723.001
2017-06-20 16:16:31,810 INFO CopyFiles$ Copying: Z:\I\1978\10\11\1874723.002 to: ./preindex/1978/1874723.002
2017-06-20 16:16:31,825 INFO CopyFiles$ Processing DocNum: 1925925, FileYear: 1978, FileMd: 1228, Files: List(Z:\I\1978\12\28\1925925.001, Z:\I\1978\12\28\1925925.002)
2017-06-20 16:16:31,825 INFO CopyFiles$ Copying: Z:\I\1978\12\28\1925925.001 to: ./preindex/1978/1925925.001
2017-06-20 16:16:31,841 INFO CopyFiles$ Copying: Z:\I\1978\12\28\1925925.002 to: ./preindex/1978/1925925.002
2017-06-20 16:16:31,841 INFO CopyFiles$ Processing DocNum: 1763347, FileYear: 1978, FileMd: 511, Files: List(Z:\I\1978\05\11\1763347.001, Z:\I\1978\05\11\1763347.002, Z:\I\1978\05\11\1763347.003, Z:\I\1978\05\11\1763347.004)
2017-06-20 16:16:31,841 INFO CopyFiles$ Copying: Z:\I\1978\05\11\1763347.001 to: ./preindex/1978/1763347.001
2017-06-20 16:16:31,872 INFO CopyFiles$ Copying: Z:\I\1978\05\11\1763347.002 to: ./preindex/1978/1763347.002
2017-06-20 16:16:31,888 INFO CopyFiles$ Copying: Z:\I\1978\05\11\1763347.003 to: ./preindex/1978/1763347.003
2017-06-20 16:16:31,903 INFO CopyFiles$ Copying: Z:\I\1978\05\11\1763347.004 to: ./preindex/1978/1763347.004
2017-06-20 16:16:31,919 INFO CopyFiles$ Processing DocNum: 1763865, FileYear: 1978, FileMd: 512, Files: List(Z:\I\1978\05\12\1763865.001, Z:\I\1978\05\12\1763865.002, Z:\I\1978\05\12\1763865.003)
2017-06-20 16:16:31,919 INFO CopyFiles$ Copying: Z:\I\1978\05\12\1763865.001 to: ./preindex/1978/1763865.001
2017-06-20 16:16:31,950 INFO CopyFiles$ Copying: Z:\I\1978\05\12\1763865.002 to: ./preindex/1978/1763865.002
2017-06-20 16:16:31,950 INFO CopyFiles$ Copying: Z:\I\1978\05\12\1763865.003 to: ./preindex/1978/1763865.003
2017-06-20 16:16:31,966 INFO CopyFiles$ Processing DocNum: 1914960, FileYear: 1978, FileMd: 1211, Files: List(Z:\I\1978\12\11\1914960.001, Z:\I\1978\12\11\1914960.002)
2017-06-20 16:16:31,981 INFO CopyFiles$ Copying: Z:\I\1978\12\11\1914960.001 to: ./preindex/1978/1914960.001
2017-06-20 16:16:31,981 INFO CopyFiles$ Copying: Z:\I\1978\12\11\1914960.002 to: ./preindex/1978/1914960.002
2017-06-20 16:16:31,997 INFO CopyFiles$ Processing DocNum: 1846637, FileYear: 1978, FileMd: 901, Files: List(Z:\I\1978\09\01\1846637.001, Z:\I\1978\09\01\1846637.002, Z:\I\1978\09\01\1846637.003)
2017-06-20 16:16:31,997 INFO CopyFiles$ Copying: Z:\I\1978\09\01\1846637.001 to: ./preindex/1978/1846637.001
2017-06-20 16:16:31,997 INFO CopyFiles$ Copying: Z:\I\1978\09\01\1846637.002 to: ./preindex/1978/1846637.002
2017-06-20 16:16:32,013 INFO CopyFiles$ Copying: Z:\I\1978\09\01\1846637.003 to: ./preindex/1978/1846637.003
2017-06-20 16:16:32,028 INFO CopyFiles$ Processing DocNum: 1824844, FileYear: 1978, FileMd: 804, Files: List(Z:\I\1978\08\04\1824844.001, Z:\I\1978\08\04\1824844.002, Z:\I\1978\08\04\1824844.003, Z:\I\1978\08\04\1824844.004, Z:\I\1978\08\04\1824844.005)
2017-06-20 16:16:32,028 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1824844.001 to: ./preindex/1978/1824844.001
2017-06-20 16:16:32,044 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1824844.002 to: ./preindex/1978/1824844.002
2017-06-20 16:16:32,044 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1824844.003 to: ./preindex/1978/1824844.003
2017-06-20 16:16:32,044 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1824844.004 to: ./preindex/1978/1824844.004
2017-06-20 16:16:32,059 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1824844.005 to: ./preindex/1978/1824844.005
2017-06-20 16:16:32,059 INFO CopyFiles$ Processing DocNum: 1748940, FileYear: 1978, FileMd: 425, Files: List(Z:\I\1978\04\25\1748940.001, Z:\I\1978\04\25\1748940.002, Z:\I\1978\04\25\1748940.003, Z:\I\1978\04\25\1748940.004)
2017-06-20 16:16:32,059 INFO CopyFiles$ Copying: Z:\I\1978\04\25\1748940.001 to: ./preindex/1978/1748940.001
2017-06-20 16:16:32,075 INFO CopyFiles$ Copying: Z:\I\1978\04\25\1748940.002 to: ./preindex/1978/1748940.002
2017-06-20 16:16:32,091 INFO CopyFiles$ Copying: Z:\I\1978\04\25\1748940.003 to: ./preindex/1978/1748940.003
2017-06-20 16:16:32,091 INFO CopyFiles$ Copying: Z:\I\1978\04\25\1748940.004 to: ./preindex/1978/1748940.004
2017-06-20 16:16:32,106 INFO CopyFiles$ Processing DocNum: 1745788, FileYear: 1978, FileMd: 419, Files: List(Z:\I\1978\04\19\1745788.001, Z:\I\1978\04\19\1745788.002, Z:\I\1978\04\19\1745788.003)
2017-06-20 16:16:32,106 INFO CopyFiles$ Copying: Z:\I\1978\04\19\1745788.001 to: ./preindex/1978/1745788.001
2017-06-20 16:16:32,122 INFO CopyFiles$ Copying: Z:\I\1978\04\19\1745788.002 to: ./preindex/1978/1745788.002
2017-06-20 16:16:32,122 INFO CopyFiles$ Copying: Z:\I\1978\04\19\1745788.003 to: ./preindex/1978/1745788.003
2017-06-20 16:16:32,137 INFO CopyFiles$ Processing DocNum: 1711193, FileYear: 1978, FileMd: 228, Files: List(Z:\I\1978\02\28\1711193.001, Z:\I\1978\02\28\1711193.002, Z:\I\1978\02\28\1711193.003)
2017-06-20 16:16:32,137 INFO CopyFiles$ Copying: Z:\I\1978\02\28\1711193.001 to: ./preindex/1978/1711193.001
2017-06-20 16:16:32,153 INFO CopyFiles$ Copying: Z:\I\1978\02\28\1711193.002 to: ./preindex/1978/1711193.002
2017-06-20 16:16:32,153 INFO CopyFiles$ Copying: Z:\I\1978\02\28\1711193.003 to: ./preindex/1978/1711193.003
2017-06-20 16:16:32,169 INFO CopyFiles$ Processing DocNum: 1859587, FileYear: 1978, FileMd: 920, Files: List(Z:\I\1978\09\20\1859587.001, Z:\I\1978\09\20\1859587.002, Z:\I\1978\09\20\1859587.003)
2017-06-20 16:16:32,169 INFO CopyFiles$ Copying: Z:\I\1978\09\20\1859587.001 to: ./preindex/1978/1859587.001
2017-06-20 16:16:32,184 INFO CopyFiles$ Copying: Z:\I\1978\09\20\1859587.002 to: ./preindex/1978/1859587.002
2017-06-20 16:16:32,200 INFO CopyFiles$ Copying: Z:\I\1978\09\20\1859587.003 to: ./preindex/1978/1859587.003
2017-06-20 16:16:32,200 INFO CopyFiles$ Processing DocNum: 1729026, FileYear: 1978, FileMd: 327, Files: List(Z:\I\1978\03\27\1729026.001, Z:\I\1978\03\27\1729026.002, Z:\I\1978\03\27\1729026.003, Z:\I\1978\03\27\1729026.004, Z:\I\1978\03\27\1729026.005, Z:\I\1978\03\27\1729026.006)
2017-06-20 16:16:32,200 INFO CopyFiles$ Copying: Z:\I\1978\03\27\1729026.001 to: ./preindex/1978/1729026.001
2017-06-20 16:16:32,231 INFO CopyFiles$ Copying: Z:\I\1978\03\27\1729026.002 to: ./preindex/1978/1729026.002
2017-06-20 16:16:32,247 INFO CopyFiles$ Copying: Z:\I\1978\03\27\1729026.003 to: ./preindex/1978/1729026.003
2017-06-20 16:16:32,262 INFO CopyFiles$ Copying: Z:\I\1978\03\27\1729026.004 to: ./preindex/1978/1729026.004
2017-06-20 16:16:32,262 INFO CopyFiles$ Copying: Z:\I\1978\03\27\1729026.005 to: ./preindex/1978/1729026.005
2017-06-20 16:16:32,278 INFO CopyFiles$ Copying: Z:\I\1978\03\27\1729026.006 to: ./preindex/1978/1729026.006
2017-06-20 16:16:32,278 INFO CopyFiles$ Processing DocNum: 1847446, FileYear: 1978, FileMd: 905, Files: List(Z:\I\1978\09\05\1847446.001, Z:\I\1978\09\05\1847446.002, Z:\I\1978\09\05\1847446.003, Z:\I\1978\09\05\1847446.004)
2017-06-20 16:16:32,278 INFO CopyFiles$ Copying: Z:\I\1978\09\05\1847446.001 to: ./preindex/1978/1847446.001
2017-06-20 16:16:32,293 INFO CopyFiles$ Copying: Z:\I\1978\09\05\1847446.002 to: ./preindex/1978/1847446.002
2017-06-20 16:16:32,293 INFO CopyFiles$ Copying: Z:\I\1978\09\05\1847446.003 to: ./preindex/1978/1847446.003
2017-06-20 16:16:32,309 INFO CopyFiles$ Copying: Z:\I\1978\09\05\1847446.004 to: ./preindex/1978/1847446.004
2017-06-20 16:16:32,325 INFO CopyFiles$ Processing DocNum: 1681118, FileYear: 1978, FileMd: 111, Files: List(Z:\I\1978\01\11\1681118.001, Z:\I\1978\01\11\1681118.002, Z:\I\1978\01\11\1681118.003)
2017-06-20 16:16:32,325 INFO CopyFiles$ Copying: Z:\I\1978\01\11\1681118.001 to: ./preindex/1978/1681118.001
2017-06-20 16:16:32,340 INFO CopyFiles$ Copying: Z:\I\1978\01\11\1681118.002 to: ./preindex/1978/1681118.002
2017-06-20 16:16:32,356 INFO CopyFiles$ Copying: Z:\I\1978\01\11\1681118.003 to: ./preindex/1978/1681118.003
2017-06-20 16:16:32,371 INFO CopyFiles$ Processing DocNum: 1790647, FileYear: 1978, FileMd: 620, Files: List(Z:\I\1978\06\20\1790647.001, Z:\I\1978\06\20\1790647.002, Z:\I\1978\06\20\1790647.003)
2017-06-20 16:16:32,371 INFO CopyFiles$ Copying: Z:\I\1978\06\20\1790647.001 to: ./preindex/1978/1790647.001
2017-06-20 16:16:32,387 INFO CopyFiles$ Copying: Z:\I\1978\06\20\1790647.002 to: ./preindex/1978/1790647.002
2017-06-20 16:16:32,387 INFO CopyFiles$ Copying: Z:\I\1978\06\20\1790647.003 to: ./preindex/1978/1790647.003
2017-06-20 16:16:32,403 INFO CopyFiles$ Processing DocNum: 1677073, FileYear: 1978, FileMd: 105, Files: List(Z:\I\1978\01\05\1677073.001, Z:\I\1978\01\05\1677073.002, Z:\I\1978\01\05\1677073.003, Z:\I\1978\01\05\1677073.004)
2017-06-20 16:16:32,403 INFO CopyFiles$ Copying: Z:\I\1978\01\05\1677073.001 to: ./preindex/1978/1677073.001
2017-06-20 16:16:32,434 INFO CopyFiles$ Copying: Z:\I\1978\01\05\1677073.002 to: ./preindex/1978/1677073.002
2017-06-20 16:16:32,449 INFO CopyFiles$ Copying: Z:\I\1978\01\05\1677073.003 to: ./preindex/1978/1677073.003
2017-06-20 16:16:32,465 INFO CopyFiles$ Copying: Z:\I\1978\01\05\1677073.004 to: ./preindex/1978/1677073.004
2017-06-20 16:16:32,496 INFO CopyFiles$ Processing DocNum: 1824885, FileYear: 1978, FileMd: 804, Files: List(Z:\I\1978\08\04\1824885.001, Z:\I\1978\08\04\1824885.002, Z:\I\1978\08\04\1824885.003, Z:\I\1978\08\04\1824885.004)
2017-06-20 16:16:32,496 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1824885.001 to: ./preindex/1978/1824885.001
2017-06-20 16:16:32,496 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1824885.002 to: ./preindex/1978/1824885.002
2017-06-20 16:16:32,512 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1824885.003 to: ./preindex/1978/1824885.003
2017-06-20 16:16:32,512 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1824885.004 to: ./preindex/1978/1824885.004
2017-06-20 16:16:32,512 INFO CopyFiles$ Processing DocNum: 1811611, FileYear: 1978, FileMd: 720, Files: List(Z:\I\1978\07\20\1811611.001, Z:\I\1978\07\20\1811611.002, Z:\I\1978\07\20\1811611.003, Z:\I\1978\07\20\1811611.004)
2017-06-20 16:16:32,512 INFO CopyFiles$ Copying: Z:\I\1978\07\20\1811611.001 to: ./preindex/1978/1811611.001
2017-06-20 16:16:32,527 INFO CopyFiles$ Copying: Z:\I\1978\07\20\1811611.002 to: ./preindex/1978/1811611.002
2017-06-20 16:16:32,543 INFO CopyFiles$ Copying: Z:\I\1978\07\20\1811611.003 to: ./preindex/1978/1811611.003
2017-06-20 16:16:32,543 INFO CopyFiles$ Copying: Z:\I\1978\07\20\1811611.004 to: ./preindex/1978/1811611.004
2017-06-20 16:16:32,559 INFO CopyFiles$ Processing DocNum: 1805153, FileYear: 1978, FileMd: 711, Files: List(Z:\I\1978\07\11\1805153.001, Z:\I\1978\07\11\1805153.002, Z:\I\1978\07\11\1805153.003, Z:\I\1978\07\11\1805153.004)
2017-06-20 16:16:32,559 INFO CopyFiles$ Copying: Z:\I\1978\07\11\1805153.001 to: ./preindex/1978/1805153.001
2017-06-20 16:16:32,574 INFO CopyFiles$ Copying: Z:\I\1978\07\11\1805153.002 to: ./preindex/1978/1805153.002
2017-06-20 16:16:32,590 INFO CopyFiles$ Copying: Z:\I\1978\07\11\1805153.003 to: ./preindex/1978/1805153.003
2017-06-20 16:16:32,590 INFO CopyFiles$ Copying: Z:\I\1978\07\11\1805153.004 to: ./preindex/1978/1805153.004
2017-06-20 16:16:32,605 INFO CopyFiles$ Processing DocNum: 1740623, FileYear: 1978, FileMd: 411, Files: List(Z:\I\1978\04\11\1740623.001, Z:\I\1978\04\11\1740623.002, Z:\I\1978\04\11\1740623.003, Z:\I\1978\04\11\1740623.004, Z:\I\1978\04\11\1740623.005)
2017-06-20 16:16:32,605 INFO CopyFiles$ Copying: Z:\I\1978\04\11\1740623.001 to: ./preindex/1978/1740623.001
2017-06-20 16:16:32,621 INFO CopyFiles$ Copying: Z:\I\1978\04\11\1740623.002 to: ./preindex/1978/1740623.002
2017-06-20 16:16:32,621 INFO CopyFiles$ Copying: Z:\I\1978\04\11\1740623.003 to: ./preindex/1978/1740623.003
2017-06-20 16:16:32,637 INFO CopyFiles$ Copying: Z:\I\1978\04\11\1740623.004 to: ./preindex/1978/1740623.004
2017-06-20 16:16:32,637 INFO CopyFiles$ Copying: Z:\I\1978\04\11\1740623.005 to: ./preindex/1978/1740623.005
2017-06-20 16:16:32,652 INFO CopyFiles$ Processing DocNum: 1811615, FileYear: 1978, FileMd: 720, Files: List(Z:\I\1978\07\20\1811615.001, Z:\I\1978\07\20\1811615.002, Z:\I\1978\07\20\1811615.003)
2017-06-20 16:16:32,652 INFO CopyFiles$ Copying: Z:\I\1978\07\20\1811615.001 to: ./preindex/1978/1811615.001
2017-06-20 16:16:32,652 INFO CopyFiles$ Copying: Z:\I\1978\07\20\1811615.002 to: ./preindex/1978/1811615.002
2017-06-20 16:16:32,668 INFO CopyFiles$ Copying: Z:\I\1978\07\20\1811615.003 to: ./preindex/1978/1811615.003
2017-06-20 16:16:32,668 INFO CopyFiles$ Processing DocNum: 1844813, FileYear: 1978, FileMd: 831, Files: List(Z:\I\1978\08\31\1844813.001, Z:\I\1978\08\31\1844813.002, Z:\I\1978\08\31\1844813.003, Z:\I\1978\08\31\1844813.004)
2017-06-20 16:16:32,668 INFO CopyFiles$ Copying: Z:\I\1978\08\31\1844813.001 to: ./preindex/1978/1844813.001
2017-06-20 16:16:32,683 INFO CopyFiles$ Copying: Z:\I\1978\08\31\1844813.002 to: ./preindex/1978/1844813.002
2017-06-20 16:16:32,699 INFO CopyFiles$ Copying: Z:\I\1978\08\31\1844813.003 to: ./preindex/1978/1844813.003
2017-06-20 16:16:32,699 INFO CopyFiles$ Copying: Z:\I\1978\08\31\1844813.004 to: ./preindex/1978/1844813.004
2017-06-20 16:16:32,699 INFO CopyFiles$ Processing DocNum: 1699748, FileYear: 1978, FileMd: 209, Files: List(Z:\I\1978\02\09\1699748.001, Z:\I\1978\02\09\1699748.002, Z:\I\1978\02\09\1699748.003, Z:\I\1978\02\09\1699748.004)
2017-06-20 16:16:32,699 INFO CopyFiles$ Copying: Z:\I\1978\02\09\1699748.001 to: ./preindex/1978/1699748.001
2017-06-20 16:16:32,715 INFO CopyFiles$ Copying: Z:\I\1978\02\09\1699748.002 to: ./preindex/1978/1699748.002
2017-06-20 16:16:32,730 INFO CopyFiles$ Copying: Z:\I\1978\02\09\1699748.003 to: ./preindex/1978/1699748.003
2017-06-20 16:16:32,730 INFO CopyFiles$ Copying: Z:\I\1978\02\09\1699748.004 to: ./preindex/1978/1699748.004
2017-06-20 16:16:32,746 INFO CopyFiles$ Processing DocNum: 1925915, FileYear: 1978, FileMd: 1228, Files: List(Z:\I\1978\12\28\1925915.001, Z:\I\1978\12\28\1925915.002)
2017-06-20 16:16:32,746 INFO CopyFiles$ Copying: Z:\I\1978\12\28\1925915.001 to: ./preindex/1978/1925915.001
2017-06-20 16:16:32,761 INFO CopyFiles$ Copying: Z:\I\1978\12\28\1925915.002 to: ./preindex/1978/1925915.002
2017-06-20 16:16:32,761 INFO CopyFiles$ Processing DocNum: 1903755, FileYear: 1978, FileMd: 1128, Files: List(Z:\I\1978\11\28\1903755.001, Z:\I\1978\11\28\1903755.002, Z:\I\1978\11\28\1903755.003, Z:\I\1978\11\28\1903755.004, Z:\I\1978\11\28\1903755.005, Z:\I\1978\11\28\1903755.006, Z:\I\1978\11\28\1903755.007, Z:\I\1978\11\28\1903755.008)
2017-06-20 16:16:32,761 INFO CopyFiles$ Copying: Z:\I\1978\11\28\1903755.001 to: ./preindex/1978/1903755.001
2017-06-20 16:16:32,793 INFO CopyFiles$ Copying: Z:\I\1978\11\28\1903755.002 to: ./preindex/1978/1903755.002
2017-06-20 16:16:32,793 INFO CopyFiles$ Copying: Z:\I\1978\11\28\1903755.003 to: ./preindex/1978/1903755.003
2017-06-20 16:16:32,793 INFO CopyFiles$ Copying: Z:\I\1978\11\28\1903755.004 to: ./preindex/1978/1903755.004
2017-06-20 16:16:32,808 INFO CopyFiles$ Copying: Z:\I\1978\11\28\1903755.005 to: ./preindex/1978/1903755.005
2017-06-20 16:16:32,808 INFO CopyFiles$ Copying: Z:\I\1978\11\28\1903755.006 to: ./preindex/1978/1903755.006
2017-06-20 16:16:32,824 INFO CopyFiles$ Copying: Z:\I\1978\11\28\1903755.007 to: ./preindex/1978/1903755.007
2017-06-20 16:16:32,824 INFO CopyFiles$ Copying: Z:\I\1978\11\28\1903755.008 to: ./preindex/1978/1903755.008
2017-06-20 16:16:32,839 INFO CopyFiles$ Processing DocNum: 1924729, FileYear: 1978, FileMd: 1227, Files: List(Z:\I\1978\12\27\1924729.001, Z:\I\1978\12\27\1924729.002)
2017-06-20 16:16:32,855 INFO CopyFiles$ Copying: Z:\I\1978\12\27\1924729.001 to: ./preindex/1978/1924729.001
2017-06-20 16:16:32,855 INFO CopyFiles$ Copying: Z:\I\1978\12\27\1924729.002 to: ./preindex/1978/1924729.002
2017-06-20 16:16:32,871 INFO CopyFiles$ Processing DocNum: 1846652, FileYear: 1978, FileMd: 901, Files: List(Z:\I\1978\09\01\1846652.001, Z:\I\1978\09\01\1846652.002, Z:\I\1978\09\01\1846652.003, Z:\I\1978\09\01\1846652.004, Z:\I\1978\09\01\1846652.005)
2017-06-20 16:16:32,871 INFO CopyFiles$ Copying: Z:\I\1978\09\01\1846652.001 to: ./preindex/1978/1846652.001
2017-06-20 16:16:32,886 INFO CopyFiles$ Copying: Z:\I\1978\09\01\1846652.002 to: ./preindex/1978/1846652.002
2017-06-20 16:16:32,886 INFO CopyFiles$ Copying: Z:\I\1978\09\01\1846652.003 to: ./preindex/1978/1846652.003
2017-06-20 16:16:32,902 INFO CopyFiles$ Copying: Z:\I\1978\09\01\1846652.004 to: ./preindex/1978/1846652.004
2017-06-20 16:16:32,902 INFO CopyFiles$ Copying: Z:\I\1978\09\01\1846652.005 to: ./preindex/1978/1846652.005
2017-06-20 16:16:32,917 INFO CopyFiles$ Processing DocNum: 1682772, FileYear: 1978, FileMd: 113, Files: List(Z:\I\1978\01\13\1682772.001, Z:\I\1978\01\13\1682772.002, Z:\I\1978\01\13\1682772.003, Z:\I\1978\01\13\1682772.004)
2017-06-20 16:16:32,917 INFO CopyFiles$ Copying: Z:\I\1978\01\13\1682772.001 to: ./preindex/1978/1682772.001
2017-06-20 16:16:32,933 INFO CopyFiles$ Copying: Z:\I\1978\01\13\1682772.002 to: ./preindex/1978/1682772.002
2017-06-20 16:16:32,949 INFO CopyFiles$ Copying: Z:\I\1978\01\13\1682772.003 to: ./preindex/1978/1682772.003
2017-06-20 16:16:32,964 INFO CopyFiles$ Copying: Z:\I\1978\01\13\1682772.004 to: ./preindex/1978/1682772.004
2017-06-20 16:16:32,980 INFO CopyFiles$ Processing DocNum: 1799976, FileYear: 1978, FileMd: 703, Files: List(Z:\I\1978\07\03\1799976.001, Z:\I\1978\07\03\1799976.002, Z:\I\1978\07\03\1799976.003, Z:\I\1978\07\03\1799976.004)
2017-06-20 16:16:32,980 INFO CopyFiles$ Copying: Z:\I\1978\07\03\1799976.001 to: ./preindex/1978/1799976.001
2017-06-20 16:16:32,995 INFO CopyFiles$ Copying: Z:\I\1978\07\03\1799976.002 to: ./preindex/1978/1799976.002
2017-06-20 16:16:33,011 INFO CopyFiles$ Copying: Z:\I\1978\07\03\1799976.003 to: ./preindex/1978/1799976.003
2017-06-20 16:16:33,027 INFO CopyFiles$ Copying: Z:\I\1978\07\03\1799976.004 to: ./preindex/1978/1799976.004
2017-06-20 16:16:33,058 INFO CopyFiles$ Processing DocNum: 1686559, FileYear: 1978, FileMd: 119, Files: List(Z:\I\1978\01\19\1686559.001, Z:\I\1978\01\19\1686559.002, Z:\I\1978\01\19\1686559.003)
2017-06-20 16:16:33,058 INFO CopyFiles$ Copying: Z:\I\1978\01\19\1686559.001 to: ./preindex/1978/1686559.001
2017-06-20 16:16:33,073 INFO CopyFiles$ Copying: Z:\I\1978\01\19\1686559.002 to: ./preindex/1978/1686559.002
2017-06-20 16:16:33,095 INFO CopyFiles$ Copying: Z:\I\1978\01\19\1686559.003 to: ./preindex/1978/1686559.003
2017-06-20 16:16:33,105 INFO CopyFiles$ Processing DocNum: 1808214, FileYear: 1978, FileMd: 714, Files: List(Z:\I\1978\07\14\1808214.001, Z:\I\1978\07\14\1808214.002)
2017-06-20 16:16:33,105 INFO CopyFiles$ Copying: Z:\I\1978\07\14\1808214.001 to: ./preindex/1978/1808214.001
2017-06-20 16:16:33,125 INFO CopyFiles$ Copying: Z:\I\1978\07\14\1808214.002 to: ./preindex/1978/1808214.002
2017-06-20 16:16:33,165 INFO CopyFiles$ Processing DocNum: 1801334, FileYear: 1978, FileMd: 706, Files: List(Z:\I\1978\07\06\1801334.001, Z:\I\1978\07\06\1801334.002, Z:\I\1978\07\06\1801334.003, Z:\I\1978\07\06\1801334.004)
2017-06-20 16:16:33,165 INFO CopyFiles$ Copying: Z:\I\1978\07\06\1801334.001 to: ./preindex/1978/1801334.001
2017-06-20 16:16:33,197 INFO CopyFiles$ Copying: Z:\I\1978\07\06\1801334.002 to: ./preindex/1978/1801334.002
2017-06-20 16:16:33,212 INFO CopyFiles$ Copying: Z:\I\1978\07\06\1801334.003 to: ./preindex/1978/1801334.003
2017-06-20 16:16:33,228 INFO CopyFiles$ Copying: Z:\I\1978\07\06\1801334.004 to: ./preindex/1978/1801334.004
2017-06-20 16:16:33,243 INFO CopyFiles$ Processing DocNum: 1915140, FileYear: 1978, FileMd: 1211, Files: List(Z:\I\1978\12\11\1915140.001, Z:\I\1978\12\11\1915140.002)
2017-06-20 16:16:33,243 INFO CopyFiles$ Copying: Z:\I\1978\12\11\1915140.001 to: ./preindex/1978/1915140.001
2017-06-20 16:16:33,259 INFO CopyFiles$ Copying: Z:\I\1978\12\11\1915140.002 to: ./preindex/1978/1915140.002
2017-06-20 16:16:33,275 INFO CopyFiles$ Processing DocNum: 1788384, FileYear: 1978, FileMd: 616, Files: List(Z:\I\1978\06\16\1788384.001, Z:\I\1978\06\16\1788384.002)
2017-06-20 16:16:33,275 INFO CopyFiles$ Copying: Z:\I\1978\06\16\1788384.001 to: ./preindex/1978/1788384.001
2017-06-20 16:16:33,290 INFO CopyFiles$ Copying: Z:\I\1978\06\16\1788384.002 to: ./preindex/1978/1788384.002
2017-06-20 16:16:33,306 INFO CopyFiles$ Processing DocNum: 1860524, FileYear: 1978, FileMd: 921, Files: List(Z:\I\1978\09\21\1860524.001, Z:\I\1978\09\21\1860524.002, Z:\I\1978\09\21\1860524.003, Z:\I\1978\09\21\1860524.004)
2017-06-20 16:16:33,306 INFO CopyFiles$ Copying: Z:\I\1978\09\21\1860524.001 to: ./preindex/1978/1860524.001
2017-06-20 16:16:33,321 INFO CopyFiles$ Copying: Z:\I\1978\09\21\1860524.002 to: ./preindex/1978/1860524.002
2017-06-20 16:16:33,337 INFO CopyFiles$ Copying: Z:\I\1978\09\21\1860524.003 to: ./preindex/1978/1860524.003
2017-06-20 16:16:33,337 INFO CopyFiles$ Copying: Z:\I\1978\09\21\1860524.004 to: ./preindex/1978/1860524.004
2017-06-20 16:16:33,353 INFO CopyFiles$ Processing DocNum: 1922360, FileYear: 1978, FileMd: 1220, Files: List(Z:\I\1978\12\20\1922360.001, Z:\I\1978\12\20\1922360.002, Z:\I\1978\12\20\1922360.003, Z:\I\1978\12\20\1922360.004)
2017-06-20 16:16:33,353 INFO CopyFiles$ Copying: Z:\I\1978\12\20\1922360.001 to: ./preindex/1978/1922360.001
2017-06-20 16:16:33,368 INFO CopyFiles$ Copying: Z:\I\1978\12\20\1922360.002 to: ./preindex/1978/1922360.002
2017-06-20 16:16:33,368 INFO CopyFiles$ Copying: Z:\I\1978\12\20\1922360.003 to: ./preindex/1978/1922360.003
2017-06-20 16:16:33,368 INFO CopyFiles$ Copying: Z:\I\1978\12\20\1922360.004 to: ./preindex/1978/1922360.004
2017-06-20 16:16:33,384 INFO CopyFiles$ Processing DocNum: 1733337, FileYear: 1978, FileMd: 403, Files: List(Z:\I\1978\04\03\1733337.001, Z:\I\1978\04\03\1733337.002, Z:\I\1978\04\03\1733337.003)
2017-06-20 16:16:33,384 INFO CopyFiles$ Copying: Z:\I\1978\04\03\1733337.001 to: ./preindex/1978/1733337.001
2017-06-20 16:16:33,399 INFO CopyFiles$ Copying: Z:\I\1978\04\03\1733337.002 to: ./preindex/1978/1733337.002
2017-06-20 16:16:33,415 INFO CopyFiles$ Copying: Z:\I\1978\04\03\1733337.003 to: ./preindex/1978/1733337.003
2017-06-20 16:16:33,431 INFO CopyFiles$ Processing DocNum: 1711672, FileYear: 1978, FileMd: 228, Files: List(Z:\I\1978\02\28\1711672.001, Z:\I\1978\02\28\1711672.002, Z:\I\1978\02\28\1711672.003)
2017-06-20 16:16:33,431 INFO CopyFiles$ Copying: Z:\I\1978\02\28\1711672.001 to: ./preindex/1978/1711672.001
2017-06-20 16:16:33,446 INFO CopyFiles$ Copying: Z:\I\1978\02\28\1711672.002 to: ./preindex/1978/1711672.002
2017-06-20 16:16:33,462 INFO CopyFiles$ Copying: Z:\I\1978\02\28\1711672.003 to: ./preindex/1978/1711672.003
2017-06-20 16:16:33,493 INFO CopyFiles$ Processing DocNum: 1908032, FileYear: 1978, FileMd: 1129, Files: List(Z:\I\1978\11\29\1908032.001, Z:\I\1978\11\29\1908032.002, Z:\I\1978\11\29\1908032.003, Z:\I\1978\11\29\1908032.004, Z:\I\1978\11\29\1908032.005)
2017-06-20 16:16:33,493 INFO CopyFiles$ Copying: Z:\I\1978\11\29\1908032.001 to: ./preindex/1978/1908032.001
2017-06-20 16:16:33,509 INFO CopyFiles$ Copying: Z:\I\1978\11\29\1908032.002 to: ./preindex/1978/1908032.002
2017-06-20 16:16:33,509 INFO CopyFiles$ Copying: Z:\I\1978\11\29\1908032.003 to: ./preindex/1978/1908032.003
2017-06-20 16:16:33,509 INFO CopyFiles$ Copying: Z:\I\1978\11\29\1908032.004 to: ./preindex/1978/1908032.004
2017-06-20 16:16:33,524 INFO CopyFiles$ Copying: Z:\I\1978\11\29\1908032.005 to: ./preindex/1978/1908032.005
2017-06-20 16:16:33,524 INFO CopyFiles$ Processing DocNum: 1701093, FileYear: 1978, FileMd: 213, Files: List(Z:\I\1978\02\13\1701093.001, Z:\I\1978\02\13\1701093.002, Z:\I\1978\02\13\1701093.003, Z:\I\1978\02\13\1701093.004, Z:\I\1978\02\13\1701093.005)
2017-06-20 16:16:33,524 INFO CopyFiles$ Copying: Z:\I\1978\02\13\1701093.001 to: ./preindex/1978/1701093.001
2017-06-20 16:16:33,555 INFO CopyFiles$ Copying: Z:\I\1978\02\13\1701093.002 to: ./preindex/1978/1701093.002
2017-06-20 16:16:33,555 INFO CopyFiles$ Copying: Z:\I\1978\02\13\1701093.003 to: ./preindex/1978/1701093.003
2017-06-20 16:16:33,571 INFO CopyFiles$ Copying: Z:\I\1978\02\13\1701093.004 to: ./preindex/1978/1701093.004
2017-06-20 16:16:33,571 INFO CopyFiles$ Copying: Z:\I\1978\02\13\1701093.005 to: ./preindex/1978/1701093.005
2017-06-20 16:16:33,571 INFO CopyFiles$ Processing DocNum: 1688269, FileYear: 1978, FileMd: 123, Files: List(Z:\I\1978\01\23\1688269.001, Z:\I\1978\01\23\1688269.002)
2017-06-20 16:16:33,571 INFO CopyFiles$ Copying: Z:\I\1978\01\23\1688269.001 to: ./preindex/1978/1688269.001
2017-06-20 16:16:33,602 INFO CopyFiles$ Copying: Z:\I\1978\01\23\1688269.002 to: ./preindex/1978/1688269.002
2017-06-20 16:16:33,618 INFO CopyFiles$ Processing DocNum: 1848302, FileYear: 1978, FileMd: 906, Files: List(Z:\I\1978\09\06\1848302.001, Z:\I\1978\09\06\1848302.002, Z:\I\1978\09\06\1848302.003)
2017-06-20 16:16:33,618 INFO CopyFiles$ Copying: Z:\I\1978\09\06\1848302.001 to: ./preindex/1978/1848302.001
2017-06-20 16:16:33,633 INFO CopyFiles$ Copying: Z:\I\1978\09\06\1848302.002 to: ./preindex/1978/1848302.002
2017-06-20 16:16:33,633 INFO CopyFiles$ Copying: Z:\I\1978\09\06\1848302.003 to: ./preindex/1978/1848302.003
2017-06-20 16:16:33,649 INFO CopyFiles$ Processing DocNum: 1750343, FileYear: 1978, FileMd: 426, Files: List(Z:\I\1978\04\26\1750343.001, Z:\I\1978\04\26\1750343.002, Z:\I\1978\04\26\1750343.003)
2017-06-20 16:16:33,649 INFO CopyFiles$ Copying: Z:\I\1978\04\26\1750343.001 to: ./preindex/1978/1750343.001
2017-06-20 16:16:33,649 INFO CopyFiles$ Copying: Z:\I\1978\04\26\1750343.002 to: ./preindex/1978/1750343.002
2017-06-20 16:16:33,665 INFO CopyFiles$ Copying: Z:\I\1978\04\26\1750343.003 to: ./preindex/1978/1750343.003
2017-06-20 16:16:33,680 INFO CopyFiles$ Processing DocNum: 1714473, FileYear: 1978, FileMd: 306, Files: List(Z:\I\1978\03\06\1714473.001, Z:\I\1978\03\06\1714473.002, Z:\I\1978\03\06\1714473.003)
2017-06-20 16:16:33,680 INFO CopyFiles$ Copying: Z:\I\1978\03\06\1714473.001 to: ./preindex/1978/1714473.001
2017-06-20 16:16:33,696 INFO CopyFiles$ Copying: Z:\I\1978\03\06\1714473.002 to: ./preindex/1978/1714473.002
2017-06-20 16:16:33,696 INFO CopyFiles$ Copying: Z:\I\1978\03\06\1714473.003 to: ./preindex/1978/1714473.003
2017-06-20 16:16:33,711 INFO CopyFiles$ Processing DocNum: 1715370, FileYear: 1978, FileMd: 306, Files: List(Z:\I\1978\03\06\1715370.001, Z:\I\1978\03\06\1715370.002, Z:\I\1978\03\06\1715370.003, Z:\I\1978\03\06\1715370.004)
2017-06-20 16:16:33,711 INFO CopyFiles$ Copying: Z:\I\1978\03\06\1715370.001 to: ./preindex/1978/1715370.001
2017-06-20 16:16:33,743 INFO CopyFiles$ Copying: Z:\I\1978\03\06\1715370.002 to: ./preindex/1978/1715370.002
2017-06-20 16:16:33,758 INFO CopyFiles$ Copying: Z:\I\1978\03\06\1715370.003 to: ./preindex/1978/1715370.003
2017-06-20 16:16:33,774 INFO CopyFiles$ Copying: Z:\I\1978\03\06\1715370.004 to: ./preindex/1978/1715370.004
2017-06-20 16:16:33,774 INFO CopyFiles$ Processing DocNum: 1710901, FileYear: 1978, FileMd: 228, Files: List(Z:\I\1978\02\28\1710901.001)
2017-06-20 16:16:33,774 INFO CopyFiles$ Copying: Z:\I\1978\02\28\1710901.001 to: ./preindex/1978/1710901.001
2017-06-20 16:16:33,789 INFO CopyFiles$ Processing DocNum: 1845240, FileYear: 1978, FileMd: 831, Files: List(Z:\I\1978\08\31\1845240.001, Z:\I\1978\08\31\1845240.002)
2017-06-20 16:16:33,805 INFO CopyFiles$ Copying: Z:\I\1978\08\31\1845240.001 to: ./preindex/1978/1845240.001
2017-06-20 16:16:33,821 INFO CopyFiles$ Copying: Z:\I\1978\08\31\1845240.002 to: ./preindex/1978/1845240.002
2017-06-20 16:16:33,836 INFO CopyFiles$ Processing DocNum: 1730609, FileYear: 1978, FileMd: 329, Files: List(Z:\I\1978\03\29\1730609.001, Z:\I\1978\03\29\1730609.002, Z:\I\1978\03\29\1730609.003, Z:\I\1978\03\29\1730609.004, Z:\I\1978\03\29\1730609.005, Z:\I\1978\03\29\1730609.006)
2017-06-20 16:16:33,837 INFO CopyFiles$ Copying: Z:\I\1978\03\29\1730609.001 to: ./preindex/1978/1730609.001
2017-06-20 16:16:33,858 INFO CopyFiles$ Copying: Z:\I\1978\03\29\1730609.002 to: ./preindex/1978/1730609.002
2017-06-20 16:16:33,878 INFO CopyFiles$ Copying: Z:\I\1978\03\29\1730609.003 to: ./preindex/1978/1730609.003
2017-06-20 16:16:33,888 INFO CopyFiles$ Copying: Z:\I\1978\03\29\1730609.004 to: ./preindex/1978/1730609.004
2017-06-20 16:16:33,888 INFO CopyFiles$ Copying: Z:\I\1978\03\29\1730609.005 to: ./preindex/1978/1730609.005
2017-06-20 16:16:33,898 INFO CopyFiles$ Copying: Z:\I\1978\03\29\1730609.006 to: ./preindex/1978/1730609.006
2017-06-20 16:16:33,908 INFO CopyFiles$ Processing DocNum: 1742323, FileYear: 1978, FileMd: 413, Files: List(Z:\I\1978\04\13\1742323.001, Z:\I\1978\04\13\1742323.002, Z:\I\1978\04\13\1742323.003, Z:\I\1978\04\13\1742323.004, Z:\I\1978\04\13\1742323.005, Z:\I\1978\04\13\1742323.006)
2017-06-20 16:16:33,908 INFO CopyFiles$ Copying: Z:\I\1978\04\13\1742323.001 to: ./preindex/1978/1742323.001
2017-06-20 16:16:33,949 INFO CopyFiles$ Copying: Z:\I\1978\04\13\1742323.002 to: ./preindex/1978/1742323.002
2017-06-20 16:16:33,981 INFO CopyFiles$ Copying: Z:\I\1978\04\13\1742323.003 to: ./preindex/1978/1742323.003
2017-06-20 16:16:33,996 INFO CopyFiles$ Copying: Z:\I\1978\04\13\1742323.004 to: ./preindex/1978/1742323.004
2017-06-20 16:16:34,012 INFO CopyFiles$ Copying: Z:\I\1978\04\13\1742323.005 to: ./preindex/1978/1742323.005
2017-06-20 16:16:34,027 INFO CopyFiles$ Copying: Z:\I\1978\04\13\1742323.006 to: ./preindex/1978/1742323.006
2017-06-20 16:16:34,043 INFO CopyFiles$ Processing DocNum: 1856090, FileYear: 1978, FileMd: 915, Files: List(Z:\I\1978\09\15\1856090.001, Z:\I\1978\09\15\1856090.002, Z:\I\1978\09\15\1856090.003, Z:\I\1978\09\15\1856090.004)
2017-06-20 16:16:34,043 INFO CopyFiles$ Copying: Z:\I\1978\09\15\1856090.001 to: ./preindex/1978/1856090.001
2017-06-20 16:16:34,059 INFO CopyFiles$ Copying: Z:\I\1978\09\15\1856090.002 to: ./preindex/1978/1856090.002
2017-06-20 16:16:34,074 INFO CopyFiles$ Copying: Z:\I\1978\09\15\1856090.003 to: ./preindex/1978/1856090.003
2017-06-20 16:16:34,074 INFO CopyFiles$ Copying: Z:\I\1978\09\15\1856090.004 to: ./preindex/1978/1856090.004
2017-06-20 16:16:34,090 INFO CopyFiles$ Processing DocNum: 1792046, FileYear: 1978, FileMd: 622, Files: List(Z:\I\1978\06\22\1792046.001, Z:\I\1978\06\22\1792046.002, Z:\I\1978\06\22\1792046.003)
2017-06-20 16:16:34,090 INFO CopyFiles$ Copying: Z:\I\1978\06\22\1792046.001 to: ./preindex/1978/1792046.001
2017-06-20 16:16:34,105 INFO CopyFiles$ Copying: Z:\I\1978\06\22\1792046.002 to: ./preindex/1978/1792046.002
2017-06-20 16:16:34,121 INFO CopyFiles$ Copying: Z:\I\1978\06\22\1792046.003 to: ./preindex/1978/1792046.003
2017-06-20 16:16:34,137 INFO CopyFiles$ Processing DocNum: 1813137, FileYear: 1978, FileMd: 720, Files: List(Z:\I\1978\07\20\1813137.001, Z:\I\1978\07\20\1813137.002)
2017-06-20 16:16:34,137 INFO CopyFiles$ Copying: Z:\I\1978\07\20\1813137.001 to: ./preindex/1978/1813137.001
2017-06-20 16:16:34,137 INFO CopyFiles$ Copying: Z:\I\1978\07\20\1813137.002 to: ./preindex/1978/1813137.002
2017-06-20 16:16:34,168 INFO CopyFiles$ Processing DocNum: 1839513, FileYear: 1978, FileMd: 825, Files: List(Z:\I\1978\08\25\1839513.001, Z:\I\1978\08\25\1839513.002, Z:\I\1978\08\25\1839513.003, Z:\I\1978\08\25\1839513.004)
2017-06-20 16:16:34,168 INFO CopyFiles$ Copying: Z:\I\1978\08\25\1839513.001 to: ./preindex/1978/1839513.001
2017-06-20 16:16:34,183 INFO CopyFiles$ Copying: Z:\I\1978\08\25\1839513.002 to: ./preindex/1978/1839513.002
2017-06-20 16:16:34,183 INFO CopyFiles$ Copying: Z:\I\1978\08\25\1839513.003 to: ./preindex/1978/1839513.003
2017-06-20 16:16:34,199 INFO CopyFiles$ Copying: Z:\I\1978\08\25\1839513.004 to: ./preindex/1978/1839513.004
2017-06-20 16:16:34,199 INFO CopyFiles$ Processing DocNum: 1904127, FileYear: 1978, FileMd: 1122, Files: List(Z:\I\1978\11\22\1904127.001, Z:\I\1978\11\22\1904127.002, Z:\I\1978\11\22\1904127.003)
2017-06-20 16:16:34,199 INFO CopyFiles$ Copying: Z:\I\1978\11\22\1904127.001 to: ./preindex/1978/1904127.001
2017-06-20 16:16:34,215 INFO CopyFiles$ Copying: Z:\I\1978\11\22\1904127.002 to: ./preindex/1978/1904127.002
2017-06-20 16:16:34,230 INFO CopyFiles$ Copying: Z:\I\1978\11\22\1904127.003 to: ./preindex/1978/1904127.003
2017-06-20 16:16:34,230 INFO CopyFiles$ Processing DocNum: 1924014, FileYear: 1978, FileMd: 1222, Files: List(Z:\I\1978\12\22\1924014.001, Z:\I\1978\12\22\1924014.002, Z:\I\1978\12\22\1924014.003)
2017-06-20 16:16:34,230 INFO CopyFiles$ Copying: Z:\I\1978\12\22\1924014.001 to: ./preindex/1978/1924014.001
2017-06-20 16:16:34,246 INFO CopyFiles$ Copying: Z:\I\1978\12\22\1924014.002 to: ./preindex/1978/1924014.002
2017-06-20 16:16:34,261 INFO CopyFiles$ Copying: Z:\I\1978\12\22\1924014.003 to: ./preindex/1978/1924014.003
2017-06-20 16:16:34,261 INFO CopyFiles$ Processing DocNum: 1839752, FileYear: 1978, FileMd: 824, Files: List(Z:\I\1978\08\24\1839752.001, Z:\I\1978\08\24\1839752.002, Z:\I\1978\08\24\1839752.003)
2017-06-20 16:16:34,277 INFO CopyFiles$ Copying: Z:\I\1978\08\24\1839752.001 to: ./preindex/1978/1839752.001
2017-06-20 16:16:34,277 INFO CopyFiles$ Copying: Z:\I\1978\08\24\1839752.002 to: ./preindex/1978/1839752.002
2017-06-20 16:16:34,293 INFO CopyFiles$ Copying: Z:\I\1978\08\24\1839752.003 to: ./preindex/1978/1839752.003
2017-06-20 16:16:34,308 INFO CopyFiles$ Processing DocNum: 1718657, FileYear: 1978, FileMd: 310, Files: List(Z:\I\1978\03\10\1718657.001, Z:\I\1978\03\10\1718657.002, Z:\I\1978\03\10\1718657.003, Z:\I\1978\03\10\1718657.004)
2017-06-20 16:16:34,308 INFO CopyFiles$ Copying: Z:\I\1978\03\10\1718657.001 to: ./preindex/1978/1718657.001
2017-06-20 16:16:34,324 INFO CopyFiles$ Copying: Z:\I\1978\03\10\1718657.002 to: ./preindex/1978/1718657.002
2017-06-20 16:16:34,339 INFO CopyFiles$ Copying: Z:\I\1978\03\10\1718657.003 to: ./preindex/1978/1718657.003
2017-06-20 16:16:34,339 INFO CopyFiles$ Copying: Z:\I\1978\03\10\1718657.004 to: ./preindex/1978/1718657.004
2017-06-20 16:16:34,355 INFO CopyFiles$ Processing DocNum: 1880179, FileYear: 1978, FileMd: 1019, Files: List(Z:\I\1978\10\19\1880179.001, Z:\I\1978\10\19\1880179.002, Z:\I\1978\10\19\1880179.003, Z:\I\1978\10\19\1880179.004)
2017-06-20 16:16:34,355 INFO CopyFiles$ Copying: Z:\I\1978\10\19\1880179.001 to: ./preindex/1978/1880179.001
2017-06-20 16:16:34,371 INFO CopyFiles$ Copying: Z:\I\1978\10\19\1880179.002 to: ./preindex/1978/1880179.002
2017-06-20 16:16:34,371 INFO CopyFiles$ Copying: Z:\I\1978\10\19\1880179.003 to: ./preindex/1978/1880179.003
2017-06-20 16:16:34,371 INFO CopyFiles$ Copying: Z:\I\1978\10\19\1880179.004 to: ./preindex/1978/1880179.004
2017-06-20 16:16:34,386 INFO CopyFiles$ Processing DocNum: 1740447, FileYear: 1978, FileMd: 411, Files: List(Z:\I\1978\04\11\1740447.001, Z:\I\1978\04\11\1740447.002)
2017-06-20 16:16:34,386 INFO CopyFiles$ Copying: Z:\I\1978\04\11\1740447.001 to: ./preindex/1978/1740447.001
2017-06-20 16:16:34,402 INFO CopyFiles$ Copying: Z:\I\1978\04\11\1740447.002 to: ./preindex/1978/1740447.002
2017-06-20 16:16:34,417 INFO CopyFiles$ Processing DocNum: 1820225, FileYear: 1978, FileMd: 801, Files: List(Z:\I\1978\08\01\1820225.001, Z:\I\1978\08\01\1820225.002)
2017-06-20 16:16:34,417 INFO CopyFiles$ Copying: Z:\I\1978\08\01\1820225.001 to: ./preindex/1978/1820225.001
2017-06-20 16:16:34,433 INFO CopyFiles$ Copying: Z:\I\1978\08\01\1820225.002 to: ./preindex/1978/1820225.002
2017-06-20 16:16:34,449 INFO CopyFiles$ Processing DocNum: 1724964, FileYear: 1978, FileMd: 320, Files: List(Z:\I\1978\03\20\1724964.001, Z:\I\1978\03\20\1724964.002)
2017-06-20 16:16:34,449 INFO CopyFiles$ Copying: Z:\I\1978\03\20\1724964.001 to: ./preindex/1978/1724964.001
2017-06-20 16:16:34,464 INFO CopyFiles$ Copying: Z:\I\1978\03\20\1724964.002 to: ./preindex/1978/1724964.002
2017-06-20 16:16:34,480 INFO CopyFiles$ Processing DocNum: 1728760, FileYear: 1978, FileMd: 324, Files: List(Z:\I\1978\03\24\1728760.001, Z:\I\1978\03\24\1728760.002, Z:\I\1978\03\24\1728760.003, Z:\I\1978\03\24\1728760.004, Z:\I\1978\03\24\1728760.005)
2017-06-20 16:16:34,480 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1728760.001 to: ./preindex/1978/1728760.001
2017-06-20 16:16:34,480 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1728760.002 to: ./preindex/1978/1728760.002
2017-06-20 16:16:34,495 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1728760.003 to: ./preindex/1978/1728760.003
2017-06-20 16:16:34,511 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1728760.004 to: ./preindex/1978/1728760.004
2017-06-20 16:16:34,511 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1728760.005 to: ./preindex/1978/1728760.005
2017-06-20 16:16:34,527 INFO CopyFiles$ Processing DocNum: 1914188, FileYear: 1978, FileMd: 1212, Files: List(Z:\I\1978\12\12\1914188.001, Z:\I\1978\12\12\1914188.002, Z:\I\1978\12\12\1914188.003, Z:\I\1978\12\12\1914188.004, Z:\I\1978\12\12\1914188.005)
2017-06-20 16:16:34,527 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914188.001 to: ./preindex/1978/1914188.001
2017-06-20 16:16:34,527 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914188.002 to: ./preindex/1978/1914188.002
2017-06-20 16:16:34,527 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914188.003 to: ./preindex/1978/1914188.003
2017-06-20 16:16:34,542 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914188.004 to: ./preindex/1978/1914188.004
2017-06-20 16:16:34,542 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914188.005 to: ./preindex/1978/1914188.005
2017-06-20 16:16:34,558 INFO CopyFiles$ Processing DocNum: 1854096, FileYear: 1978, FileMd: 913, Files: List(Z:\I\1978\09\13\1854096.001, Z:\I\1978\09\13\1854096.002, Z:\I\1978\09\13\1854096.003)
2017-06-20 16:16:34,558 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1854096.001 to: ./preindex/1978/1854096.001
2017-06-20 16:16:34,558 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1854096.002 to: ./preindex/1978/1854096.002
2017-06-20 16:16:34,573 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1854096.003 to: ./preindex/1978/1854096.003
2017-06-20 16:16:34,573 INFO CopyFiles$ Processing DocNum: 1741300, FileYear: 1978, FileMd: 412, Files: List(Z:\I\1978\04\12\1741300.001, Z:\I\1978\04\12\1741300.002, Z:\I\1978\04\12\1741300.003)
2017-06-20 16:16:34,573 INFO CopyFiles$ Copying: Z:\I\1978\04\12\1741300.001 to: ./preindex/1978/1741300.001
2017-06-20 16:16:34,589 INFO CopyFiles$ Copying: Z:\I\1978\04\12\1741300.002 to: ./preindex/1978/1741300.002
2017-06-20 16:16:34,605 INFO CopyFiles$ Copying: Z:\I\1978\04\12\1741300.003 to: ./preindex/1978/1741300.003
2017-06-20 16:16:34,605 INFO CopyFiles$ Processing DocNum: 1832913, FileYear: 1978, FileMd: 815, Files: List(Z:\I\1978\08\15\1832913.001, Z:\I\1978\08\15\1832913.002, Z:\I\1978\08\15\1832913.003)
2017-06-20 16:16:34,605 INFO CopyFiles$ Copying: Z:\I\1978\08\15\1832913.001 to: ./preindex/1978/1832913.001
2017-06-20 16:16:34,636 INFO CopyFiles$ Copying: Z:\I\1978\08\15\1832913.002 to: ./preindex/1978/1832913.002
2017-06-20 16:16:34,651 INFO CopyFiles$ Copying: Z:\I\1978\08\15\1832913.003 to: ./preindex/1978/1832913.003
2017-06-20 16:16:34,667 INFO CopyFiles$ Processing DocNum: 1817473, FileYear: 1978, FileMd: 727, Files: List(Z:\I\1978\07\27\1817473.001, Z:\I\1978\07\27\1817473.002, Z:\I\1978\07\27\1817473.003, Z:\I\1978\07\27\1817473.004)
2017-06-20 16:16:34,667 INFO CopyFiles$ Copying: Z:\I\1978\07\27\1817473.001 to: ./preindex/1978/1817473.001
2017-06-20 16:16:34,683 INFO CopyFiles$ Copying: Z:\I\1978\07\27\1817473.002 to: ./preindex/1978/1817473.002
2017-06-20 16:16:34,683 INFO CopyFiles$ Copying: Z:\I\1978\07\27\1817473.003 to: ./preindex/1978/1817473.003
2017-06-20 16:16:34,698 INFO CopyFiles$ Copying: Z:\I\1978\07\27\1817473.004 to: ./preindex/1978/1817473.004
2017-06-20 16:16:34,714 INFO CopyFiles$ Processing DocNum: 1737248, FileYear: 1978, FileMd: 406, Files: List(Z:\I\1978\04\06\1737248.001, Z:\I\1978\04\06\1737248.002, Z:\I\1978\04\06\1737248.003, Z:\I\1978\04\06\1737248.004)
2017-06-20 16:16:34,714 INFO CopyFiles$ Copying: Z:\I\1978\04\06\1737248.001 to: ./preindex/1978/1737248.001
2017-06-20 16:16:34,714 INFO CopyFiles$ Copying: Z:\I\1978\04\06\1737248.002 to: ./preindex/1978/1737248.002
2017-06-20 16:16:34,729 INFO CopyFiles$ Copying: Z:\I\1978\04\06\1737248.003 to: ./preindex/1978/1737248.003
2017-06-20 16:16:34,729 INFO CopyFiles$ Copying: Z:\I\1978\04\06\1737248.004 to: ./preindex/1978/1737248.004
2017-06-20 16:16:34,745 INFO CopyFiles$ Processing DocNum: 1926138, FileYear: 1978, FileMd: 1228, Files: List(Z:\I\1978\12\28\1926138.001, Z:\I\1978\12\28\1926138.002, Z:\I\1978\12\28\1926138.003)
2017-06-20 16:16:34,745 INFO CopyFiles$ Copying: Z:\I\1978\12\28\1926138.001 to: ./preindex/1978/1926138.001
2017-06-20 16:16:34,761 INFO CopyFiles$ Copying: Z:\I\1978\12\28\1926138.002 to: ./preindex/1978/1926138.002
2017-06-20 16:16:34,761 INFO CopyFiles$ Copying: Z:\I\1978\12\28\1926138.003 to: ./preindex/1978/1926138.003
2017-06-20 16:16:34,776 INFO CopyFiles$ Processing DocNum: 1816442, FileYear: 1978, FileMd: 725, Files: List(Z:\I\1978\07\25\1816442.001, Z:\I\1978\07\25\1816442.002, Z:\I\1978\07\25\1816442.003)
2017-06-20 16:16:34,776 INFO CopyFiles$ Copying: Z:\I\1978\07\25\1816442.001 to: ./preindex/1978/1816442.001
2017-06-20 16:16:34,792 INFO CopyFiles$ Copying: Z:\I\1978\07\25\1816442.002 to: ./preindex/1978/1816442.002
2017-06-20 16:16:34,807 INFO CopyFiles$ Copying: Z:\I\1978\07\25\1816442.003 to: ./preindex/1978/1816442.003
2017-06-20 16:16:34,807 INFO CopyFiles$ Processing DocNum: 1882856, FileYear: 1978, FileMd: 1023, Files: List(Z:\I\1978\10\23\1882856.001, Z:\I\1978\10\23\1882856.002, Z:\I\1978\10\23\1882856.003)
2017-06-20 16:16:34,807 INFO CopyFiles$ Copying: Z:\I\1978\10\23\1882856.001 to: ./preindex/1978/1882856.001
2017-06-20 16:16:34,823 INFO CopyFiles$ Copying: Z:\I\1978\10\23\1882856.002 to: ./preindex/1978/1882856.002
2017-06-20 16:16:34,839 INFO CopyFiles$ Copying: Z:\I\1978\10\23\1882856.003 to: ./preindex/1978/1882856.003
2017-06-20 16:16:34,854 INFO CopyFiles$ Processing DocNum: 1721185, FileYear: 1978, FileMd: 314, Files: List(Z:\I\1978\03\14\1721185.001, Z:\I\1978\03\14\1721185.002, Z:\I\1978\03\14\1721185.003)
2017-06-20 16:16:34,854 INFO CopyFiles$ Copying: Z:\I\1978\03\14\1721185.001 to: ./preindex/1978/1721185.001
2017-06-20 16:16:34,870 INFO CopyFiles$ Copying: Z:\I\1978\03\14\1721185.002 to: ./preindex/1978/1721185.002
2017-06-20 16:16:34,870 INFO CopyFiles$ Copying: Z:\I\1978\03\14\1721185.003 to: ./preindex/1978/1721185.003
2017-06-20 16:16:34,885 INFO CopyFiles$ Processing DocNum: 1786578, FileYear: 1978, FileMd: 614, Files: List(Z:\I\1978\06\14\1786578.001, Z:\I\1978\06\14\1786578.002, Z:\I\1978\06\14\1786578.003)
2017-06-20 16:16:34,885 INFO CopyFiles$ Copying: Z:\I\1978\06\14\1786578.001 to: ./preindex/1978/1786578.001
2017-06-20 16:16:34,917 INFO CopyFiles$ Copying: Z:\I\1978\06\14\1786578.002 to: ./preindex/1978/1786578.002
2017-06-20 16:16:34,932 INFO CopyFiles$ Copying: Z:\I\1978\06\14\1786578.003 to: ./preindex/1978/1786578.003
2017-06-20 16:16:34,948 INFO CopyFiles$ Processing DocNum: 1713875, FileYear: 1978, FileMd: 303, Files: List(Z:\I\1978\03\03\1713875.001, Z:\I\1978\03\03\1713875.002, Z:\I\1978\03\03\1713875.003, Z:\I\1978\03\03\1713875.004)
2017-06-20 16:16:34,948 INFO CopyFiles$ Copying: Z:\I\1978\03\03\1713875.001 to: ./preindex/1978/1713875.001
2017-06-20 16:16:34,963 INFO CopyFiles$ Copying: Z:\I\1978\03\03\1713875.002 to: ./preindex/1978/1713875.002
2017-06-20 16:16:34,979 INFO CopyFiles$ Copying: Z:\I\1978\03\03\1713875.003 to: ./preindex/1978/1713875.003
2017-06-20 16:16:35,026 INFO CopyFiles$ Copying: Z:\I\1978\03\03\1713875.004 to: ./preindex/1978/1713875.004
2017-06-20 16:16:35,026 INFO CopyFiles$ Processing DocNum: 1914224, FileYear: 1978, FileMd: 1212, Files: List(Z:\I\1978\12\12\1914224.001, Z:\I\1978\12\12\1914224.002, Z:\I\1978\12\12\1914224.003, Z:\I\1978\12\12\1914224.004, Z:\I\1978\12\12\1914224.005, Z:\I\1978\12\12\1914224.006, Z:\I\1978\12\12\1914224.007, Z:\I\1978\12\12\1914224.008, Z:\I\1978\12\12\1914224.009, Z:\I\1978\12\12\1914224.010, Z:\I\1978\12\12\1914224.011, Z:\I\1978\12\12\1914224.012, Z:\I\1978\12\12\1914224.013, Z:\I\1978\12\12\1914224.014, Z:\I\1978\12\12\1914224.015)
2017-06-20 16:16:35,026 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914224.001 to: ./preindex/1978/1914224.001
2017-06-20 16:16:35,041 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914224.002 to: ./preindex/1978/1914224.002
2017-06-20 16:16:35,041 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914224.003 to: ./preindex/1978/1914224.003
2017-06-20 16:16:35,041 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914224.004 to: ./preindex/1978/1914224.004
2017-06-20 16:16:35,057 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914224.005 to: ./preindex/1978/1914224.005
2017-06-20 16:16:35,057 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914224.006 to: ./preindex/1978/1914224.006
2017-06-20 16:16:35,057 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914224.007 to: ./preindex/1978/1914224.007
2017-06-20 16:16:35,073 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914224.008 to: ./preindex/1978/1914224.008
2017-06-20 16:16:35,073 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914224.009 to: ./preindex/1978/1914224.009
2017-06-20 16:16:35,073 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914224.010 to: ./preindex/1978/1914224.010
2017-06-20 16:16:35,088 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914224.011 to: ./preindex/1978/1914224.011
2017-06-20 16:16:35,088 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914224.012 to: ./preindex/1978/1914224.012
2017-06-20 16:16:35,088 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914224.013 to: ./preindex/1978/1914224.013
2017-06-20 16:16:35,104 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914224.014 to: ./preindex/1978/1914224.014
2017-06-20 16:16:35,104 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914224.015 to: ./preindex/1978/1914224.015
2017-06-20 16:16:35,119 INFO CopyFiles$ Processing DocNum: 1817165, FileYear: 1978, FileMd: 726, Files: List(Z:\I\1978\07\26\1817165.001, Z:\I\1978\07\26\1817165.002, Z:\I\1978\07\26\1817165.003)
2017-06-20 16:16:35,119 INFO CopyFiles$ Copying: Z:\I\1978\07\26\1817165.001 to: ./preindex/1978/1817165.001
2017-06-20 16:16:35,119 INFO CopyFiles$ Copying: Z:\I\1978\07\26\1817165.002 to: ./preindex/1978/1817165.002
2017-06-20 16:16:35,135 INFO CopyFiles$ Copying: Z:\I\1978\07\26\1817165.003 to: ./preindex/1978/1817165.003
2017-06-20 16:16:35,135 INFO CopyFiles$ Processing DocNum: 1738009, FileYear: 1978, FileMd: 407, Files: List(Z:\I\1978\04\07\1738009.001, Z:\I\1978\04\07\1738009.002, Z:\I\1978\04\07\1738009.003)
2017-06-20 16:16:35,135 INFO CopyFiles$ Copying: Z:\I\1978\04\07\1738009.001 to: ./preindex/1978/1738009.001
2017-06-20 16:16:35,151 INFO CopyFiles$ Copying: Z:\I\1978\04\07\1738009.002 to: ./preindex/1978/1738009.002
2017-06-20 16:16:35,166 INFO CopyFiles$ Copying: Z:\I\1978\04\07\1738009.003 to: ./preindex/1978/1738009.003
2017-06-20 16:16:35,197 INFO CopyFiles$ Processing DocNum: 1684676, FileYear: 1978, FileMd: 117, Files: List(Z:\I\1978\01\17\1684676.001, Z:\I\1978\01\17\1684676.002, Z:\I\1978\01\17\1684676.003, Z:\I\1978\01\17\1684676.004, Z:\I\1978\01\17\1684676.005)
2017-06-20 16:16:35,197 INFO CopyFiles$ Copying: Z:\I\1978\01\17\1684676.001 to: ./preindex/1978/1684676.001
2017-06-20 16:16:35,213 INFO CopyFiles$ Copying: Z:\I\1978\01\17\1684676.002 to: ./preindex/1978/1684676.002
2017-06-20 16:16:35,229 INFO CopyFiles$ Copying: Z:\I\1978\01\17\1684676.003 to: ./preindex/1978/1684676.003
2017-06-20 16:16:35,244 INFO CopyFiles$ Copying: Z:\I\1978\01\17\1684676.004 to: ./preindex/1978/1684676.004
2017-06-20 16:16:35,260 INFO CopyFiles$ Copying: Z:\I\1978\01\17\1684676.005 to: ./preindex/1978/1684676.005
2017-06-20 16:16:35,275 INFO CopyFiles$ Processing DocNum: 1699733, FileYear: 1978, FileMd: 209, Files: List(Z:\I\1978\02\09\1699733.001, Z:\I\1978\02\09\1699733.002, Z:\I\1978\02\09\1699733.003, Z:\I\1978\02\09\1699733.004)
2017-06-20 16:16:35,275 INFO CopyFiles$ Copying: Z:\I\1978\02\09\1699733.001 to: ./preindex/1978/1699733.001
2017-06-20 16:16:35,291 INFO CopyFiles$ Copying: Z:\I\1978\02\09\1699733.002 to: ./preindex/1978/1699733.002
2017-06-20 16:16:35,291 INFO CopyFiles$ Copying: Z:\I\1978\02\09\1699733.003 to: ./preindex/1978/1699733.003
2017-06-20 16:16:35,307 INFO CopyFiles$ Copying: Z:\I\1978\02\09\1699733.004 to: ./preindex/1978/1699733.004
2017-06-20 16:16:35,307 INFO CopyFiles$ Processing DocNum: 1754079, FileYear: 1978, FileMd: 501, Files: List(Z:\I\1978\05\01\1754079.001, Z:\I\1978\05\01\1754079.002, Z:\I\1978\05\01\1754079.003)
2017-06-20 16:16:35,307 INFO CopyFiles$ Copying: Z:\I\1978\05\01\1754079.001 to: ./preindex/1978/1754079.001
2017-06-20 16:16:35,322 INFO CopyFiles$ Copying: Z:\I\1978\05\01\1754079.002 to: ./preindex/1978/1754079.002
2017-06-20 16:16:35,323 INFO CopyFiles$ Copying: Z:\I\1978\05\01\1754079.003 to: ./preindex/1978/1754079.003
2017-06-20 16:16:35,344 INFO CopyFiles$ Processing DocNum: 1925241, FileYear: 1978, FileMd: 1227, Files: List(Z:\I\1978\12\27\1925241.001, Z:\I\1978\12\27\1925241.002, Z:\I\1978\12\27\1925241.003)
2017-06-20 16:16:35,344 INFO CopyFiles$ Copying: Z:\I\1978\12\27\1925241.001 to: ./preindex/1978/1925241.001
2017-06-20 16:16:35,364 INFO CopyFiles$ Copying: Z:\I\1978\12\27\1925241.002 to: ./preindex/1978/1925241.002
2017-06-20 16:16:35,364 INFO CopyFiles$ Copying: Z:\I\1978\12\27\1925241.003 to: ./preindex/1978/1925241.003
2017-06-20 16:16:35,374 INFO CopyFiles$ Processing DocNum: 1888638, FileYear: 1978, FileMd: 1031, Files: List(Z:\I\1978\10\31\1888638.001, Z:\I\1978\10\31\1888638.002, Z:\I\1978\10\31\1888638.003)
2017-06-20 16:16:35,374 INFO CopyFiles$ Copying: Z:\I\1978\10\31\1888638.001 to: ./preindex/1978/1888638.001
2017-06-20 16:16:35,394 INFO CopyFiles$ Copying: Z:\I\1978\10\31\1888638.002 to: ./preindex/1978/1888638.002
2017-06-20 16:16:35,404 INFO CopyFiles$ Copying: Z:\I\1978\10\31\1888638.003 to: ./preindex/1978/1888638.003
2017-06-20 16:16:35,420 INFO CopyFiles$ Processing DocNum: 1685537, FileYear: 1978, FileMd: 118, Files: List(Z:\I\1978\01\18\1685537.001, Z:\I\1978\01\18\1685537.002, Z:\I\1978\01\18\1685537.003)
2017-06-20 16:16:35,420 INFO CopyFiles$ Copying: Z:\I\1978\01\18\1685537.001 to: ./preindex/1978/1685537.001
2017-06-20 16:16:35,451 INFO CopyFiles$ Copying: Z:\I\1978\01\18\1685537.002 to: ./preindex/1978/1685537.002
2017-06-20 16:16:35,467 INFO CopyFiles$ Copying: Z:\I\1978\01\18\1685537.003 to: ./preindex/1978/1685537.003
2017-06-20 16:16:35,467 INFO CopyFiles$ Processing DocNum: 1819089, FileYear: 1978, FileMd: 728, Files: List(Z:\I\1978\07\28\1819089.001, Z:\I\1978\07\28\1819089.002)
2017-06-20 16:16:35,467 INFO CopyFiles$ Copying: Z:\I\1978\07\28\1819089.001 to: ./preindex/1978/1819089.001
2017-06-20 16:16:35,482 INFO CopyFiles$ Copying: Z:\I\1978\07\28\1819089.002 to: ./preindex/1978/1819089.002
2017-06-20 16:16:35,498 INFO CopyFiles$ Processing DocNum: 1855966, FileYear: 1978, FileMd: 915, Files: List(Z:\I\1978\09\15\1855966.001, Z:\I\1978\09\15\1855966.002, Z:\I\1978\09\15\1855966.003, Z:\I\1978\09\15\1855966.004)
2017-06-20 16:16:35,498 INFO CopyFiles$ Copying: Z:\I\1978\09\15\1855966.001 to: ./preindex/1978/1855966.001
2017-06-20 16:16:35,529 INFO CopyFiles$ Copying: Z:\I\1978\09\15\1855966.002 to: ./preindex/1978/1855966.002
2017-06-20 16:16:35,529 INFO CopyFiles$ Copying: Z:\I\1978\09\15\1855966.003 to: ./preindex/1978/1855966.003
2017-06-20 16:16:35,545 INFO CopyFiles$ Copying: Z:\I\1978\09\15\1855966.004 to: ./preindex/1978/1855966.004
2017-06-20 16:16:35,545 INFO CopyFiles$ Processing DocNum: 1900385, FileYear: 1978, FileMd: 1116, Files: List(Z:\I\1978\11\16\1900385.001, Z:\I\1978\11\16\1900385.002)
2017-06-20 16:16:35,545 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900385.001 to: ./preindex/1978/1900385.001
2017-06-20 16:16:35,560 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900385.002 to: ./preindex/1978/1900385.002
2017-06-20 16:16:35,560 INFO CopyFiles$ Processing DocNum: 1854306, FileYear: 1978, FileMd: 913, Files: List(Z:\I\1978\09\13\1854306.001, Z:\I\1978\09\13\1854306.002, Z:\I\1978\09\13\1854306.003)
2017-06-20 16:16:35,576 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1854306.001 to: ./preindex/1978/1854306.001
2017-06-20 16:16:35,576 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1854306.002 to: ./preindex/1978/1854306.002
2017-06-20 16:16:35,591 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1854306.003 to: ./preindex/1978/1854306.003
2017-06-20 16:16:35,591 INFO CopyFiles$ Processing DocNum: 1708243, FileYear: 1978, FileMd: 223, Files: List(Z:\I\1978\02\23\1708243.001, Z:\I\1978\02\23\1708243.002, Z:\I\1978\02\23\1708243.003, Z:\I\1978\02\23\1708243.004, Z:\I\1978\02\23\1708243.005, Z:\I\1978\02\23\1708243.006)
2017-06-20 16:16:35,591 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1708243.001 to: ./preindex/1978/1708243.001
2017-06-20 16:16:35,623 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1708243.002 to: ./preindex/1978/1708243.002
2017-06-20 16:16:35,638 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1708243.003 to: ./preindex/1978/1708243.003
2017-06-20 16:16:35,638 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1708243.004 to: ./preindex/1978/1708243.004
2017-06-20 16:16:35,654 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1708243.005 to: ./preindex/1978/1708243.005
2017-06-20 16:16:35,669 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1708243.006 to: ./preindex/1978/1708243.006
2017-06-20 16:16:35,685 INFO CopyFiles$ Processing DocNum: 1782922, FileYear: 1978, FileMd: 609, Files: List(Z:\I\1978\06\09\1782922.001, Z:\I\1978\06\09\1782922.002, Z:\I\1978\06\09\1782922.003)
2017-06-20 16:16:35,685 INFO CopyFiles$ Copying: Z:\I\1978\06\09\1782922.001 to: ./preindex/1978/1782922.001
2017-06-20 16:16:35,685 INFO CopyFiles$ Copying: Z:\I\1978\06\09\1782922.002 to: ./preindex/1978/1782922.002
2017-06-20 16:16:35,685 INFO CopyFiles$ Copying: Z:\I\1978\06\09\1782922.003 to: ./preindex/1978/1782922.003
2017-06-20 16:16:35,701 INFO CopyFiles$ Processing DocNum: 1910756, FileYear: 1978, FileMd: 1204, Files: List(Z:\I\1978\12\04\1910756.001, Z:\I\1978\12\04\1910756.002, Z:\I\1978\12\04\1910756.003, Z:\I\1978\12\04\1910756.004)
2017-06-20 16:16:35,701 INFO CopyFiles$ Copying: Z:\I\1978\12\04\1910756.001 to: ./preindex/1978/1910756.001
2017-06-20 16:16:35,716 INFO CopyFiles$ Copying: Z:\I\1978\12\04\1910756.002 to: ./preindex/1978/1910756.002
2017-06-20 16:16:35,716 INFO CopyFiles$ Copying: Z:\I\1978\12\04\1910756.003 to: ./preindex/1978/1910756.003
2017-06-20 16:16:35,732 INFO CopyFiles$ Copying: Z:\I\1978\12\04\1910756.004 to: ./preindex/1978/1910756.004
2017-06-20 16:16:35,732 INFO CopyFiles$ Processing DocNum: 1789085, FileYear: 1978, FileMd: 619, Files: List(Z:\I\1978\06\19\1789085.001, Z:\I\1978\06\19\1789085.002, Z:\I\1978\06\19\1789085.003)
2017-06-20 16:16:35,732 INFO CopyFiles$ Copying: Z:\I\1978\06\19\1789085.001 to: ./preindex/1978/1789085.001
2017-06-20 16:16:35,763 INFO CopyFiles$ Copying: Z:\I\1978\06\19\1789085.002 to: ./preindex/1978/1789085.002
2017-06-20 16:16:35,779 INFO CopyFiles$ Copying: Z:\I\1978\06\19\1789085.003 to: ./preindex/1978/1789085.003
2017-06-20 16:16:35,794 INFO CopyFiles$ Processing DocNum: 1867173, FileYear: 1978, FileMd: 929, Files: List(Z:\I\1978\09\29\1867173.001, Z:\I\1978\09\29\1867173.002, Z:\I\1978\09\29\1867173.003, Z:\I\1978\09\29\1867173.004, Z:\I\1978\09\29\1867173.005, Z:\I\1978\09\29\1867173.006, Z:\I\1978\09\29\1867173.007)
2017-06-20 16:16:35,794 INFO CopyFiles$ Copying: Z:\I\1978\09\29\1867173.001 to: ./preindex/1978/1867173.001
2017-06-20 16:16:35,810 INFO CopyFiles$ Copying: Z:\I\1978\09\29\1867173.002 to: ./preindex/1978/1867173.002
2017-06-20 16:16:35,825 INFO CopyFiles$ Copying: Z:\I\1978\09\29\1867173.003 to: ./preindex/1978/1867173.003
2017-06-20 16:16:35,825 INFO CopyFiles$ Copying: Z:\I\1978\09\29\1867173.004 to: ./preindex/1978/1867173.004
2017-06-20 16:16:35,841 INFO CopyFiles$ Copying: Z:\I\1978\09\29\1867173.005 to: ./preindex/1978/1867173.005
2017-06-20 16:16:35,857 INFO CopyFiles$ Copying: Z:\I\1978\09\29\1867173.006 to: ./preindex/1978/1867173.006
2017-06-20 16:16:35,872 INFO CopyFiles$ Copying: Z:\I\1978\09\29\1867173.007 to: ./preindex/1978/1867173.007
2017-06-20 16:16:35,888 INFO CopyFiles$ Processing DocNum: 1688059, FileYear: 1978, FileMd: 123, Files: List(Z:\I\1978\01\23\1688059.001, Z:\I\1978\01\23\1688059.002, Z:\I\1978\01\23\1688059.003, Z:\I\1978\01\23\1688059.004)
2017-06-20 16:16:35,888 INFO CopyFiles$ Copying: Z:\I\1978\01\23\1688059.001 to: ./preindex/1978/1688059.001
2017-06-20 16:16:35,903 INFO CopyFiles$ Copying: Z:\I\1978\01\23\1688059.002 to: ./preindex/1978/1688059.002
2017-06-20 16:16:35,919 INFO CopyFiles$ Copying: Z:\I\1978\01\23\1688059.003 to: ./preindex/1978/1688059.003
2017-06-20 16:16:35,935 INFO CopyFiles$ Copying: Z:\I\1978\01\23\1688059.004 to: ./preindex/1978/1688059.004
2017-06-20 16:16:35,950 INFO CopyFiles$ Processing DocNum: 1678493, FileYear: 1978, FileMd: 106, Files: List(Z:\I\1978\01\06\1678493.001, Z:\I\1978\01\06\1678493.002, Z:\I\1978\01\06\1678493.003, Z:\I\1978\01\06\1678493.004)
2017-06-20 16:16:35,950 INFO CopyFiles$ Copying: Z:\I\1978\01\06\1678493.001 to: ./preindex/1978/1678493.001
2017-06-20 16:16:35,966 INFO CopyFiles$ Copying: Z:\I\1978\01\06\1678493.002 to: ./preindex/1978/1678493.002
2017-06-20 16:16:35,981 INFO CopyFiles$ Copying: Z:\I\1978\01\06\1678493.003 to: ./preindex/1978/1678493.003
2017-06-20 16:16:36,013 INFO CopyFiles$ Copying: Z:\I\1978\01\06\1678493.004 to: ./preindex/1978/1678493.004
2017-06-20 16:16:36,059 INFO CopyFiles$ Processing DocNum: 1872452, FileYear: 1978, FileMd: 1006, Files: List(Z:\I\1978\10\06\1872452.001, Z:\I\1978\10\06\1872452.002)
2017-06-20 16:16:36,059 INFO CopyFiles$ Copying: Z:\I\1978\10\06\1872452.001 to: ./preindex/1978/1872452.001
2017-06-20 16:16:36,091 INFO CopyFiles$ Copying: Z:\I\1978\10\06\1872452.002 to: ./preindex/1978/1872452.002
2017-06-20 16:16:36,106 INFO CopyFiles$ Processing DocNum: 1903581, FileYear: 1978, FileMd: 1121, Files: List(Z:\I\1978\11\21\1903581.001)
2017-06-20 16:16:36,106 INFO CopyFiles$ Copying: Z:\I\1978\11\21\1903581.001 to: ./preindex/1978/1903581.001
2017-06-20 16:16:36,122 INFO CopyFiles$ Processing DocNum: 1783327, FileYear: 1978, FileMd: 609, Files: List(Z:\I\1978\06\09\1783327.001, Z:\I\1978\06\09\1783327.002, Z:\I\1978\06\09\1783327.003)
2017-06-20 16:16:36,122 INFO CopyFiles$ Copying: Z:\I\1978\06\09\1783327.001 to: ./preindex/1978/1783327.001
2017-06-20 16:16:36,137 INFO CopyFiles$ Copying: Z:\I\1978\06\09\1783327.002 to: ./preindex/1978/1783327.002
2017-06-20 16:16:36,153 INFO CopyFiles$ Copying: Z:\I\1978\06\09\1783327.003 to: ./preindex/1978/1783327.003
2017-06-20 16:16:36,169 INFO CopyFiles$ Processing DocNum: 1739543, FileYear: 1978, FileMd: 410, Files: List(Z:\I\1978\04\10\1739543.001, Z:\I\1978\04\10\1739543.002)
2017-06-20 16:16:36,169 INFO CopyFiles$ Copying: Z:\I\1978\04\10\1739543.001 to: ./preindex/1978/1739543.001
2017-06-20 16:16:36,200 INFO CopyFiles$ Copying: Z:\I\1978\04\10\1739543.002 to: ./preindex/1978/1739543.002
2017-06-20 16:16:36,215 INFO CopyFiles$ Processing DocNum: 1882733, FileYear: 1978, FileMd: 1023, Files: List(Z:\I\1978\10\23\1882733.001, Z:\I\1978\10\23\1882733.002, Z:\I\1978\10\23\1882733.003, Z:\I\1978\10\23\1882733.004)
2017-06-20 16:16:36,215 INFO CopyFiles$ Copying: Z:\I\1978\10\23\1882733.001 to: ./preindex/1978/1882733.001
2017-06-20 16:16:36,231 INFO CopyFiles$ Copying: Z:\I\1978\10\23\1882733.002 to: ./preindex/1978/1882733.002
2017-06-20 16:16:36,247 INFO CopyFiles$ Copying: Z:\I\1978\10\23\1882733.003 to: ./preindex/1978/1882733.003
2017-06-20 16:16:36,247 INFO CopyFiles$ Copying: Z:\I\1978\10\23\1882733.004 to: ./preindex/1978/1882733.004
2017-06-20 16:16:36,262 INFO CopyFiles$ Processing DocNum: 1820360, FileYear: 1978, FileMd: 731, Files: List(Z:\I\1978\07\31\1820360.001, Z:\I\1978\07\31\1820360.002)
2017-06-20 16:16:36,262 INFO CopyFiles$ Copying: Z:\I\1978\07\31\1820360.001 to: ./preindex/1978/1820360.001
2017-06-20 16:16:36,278 INFO CopyFiles$ Copying: Z:\I\1978\07\31\1820360.002 to: ./preindex/1978/1820360.002
2017-06-20 16:16:36,293 INFO CopyFiles$ Processing DocNum: 1744705, FileYear: 1978, FileMd: 418, Files: List(Z:\I\1978\04\18\1744705.001, Z:\I\1978\04\18\1744705.002)
2017-06-20 16:16:36,293 INFO CopyFiles$ Copying: Z:\I\1978\04\18\1744705.001 to: ./preindex/1978/1744705.001
2017-06-20 16:16:36,309 INFO CopyFiles$ Copying: Z:\I\1978\04\18\1744705.002 to: ./preindex/1978/1744705.002
2017-06-20 16:16:36,309 INFO CopyFiles$ Processing DocNum: 1874738, FileYear: 1978, FileMd: 1011, Files: List(Z:\I\1978\10\11\1874738.001, Z:\I\1978\10\11\1874738.002, Z:\I\1978\10\11\1874738.003, Z:\I\1978\10\11\1874738.004)
2017-06-20 16:16:36,325 INFO CopyFiles$ Copying: Z:\I\1978\10\11\1874738.001 to: ./preindex/1978/1874738.001
2017-06-20 16:16:36,340 INFO CopyFiles$ Copying: Z:\I\1978\10\11\1874738.002 to: ./preindex/1978/1874738.002
2017-06-20 16:16:36,356 INFO CopyFiles$ Copying: Z:\I\1978\10\11\1874738.003 to: ./preindex/1978/1874738.003
2017-06-20 16:16:36,356 INFO CopyFiles$ Copying: Z:\I\1978\10\11\1874738.004 to: ./preindex/1978/1874738.004
2017-06-20 16:16:36,371 INFO CopyFiles$ Processing DocNum: 1675278, FileYear: 1978, FileMd: 103, Files: List(Z:\I\1978\01\03\1675278.001, Z:\I\1978\01\03\1675278.002, Z:\I\1978\01\03\1675278.003)
2017-06-20 16:16:36,371 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675278.001 to: ./preindex/1978/1675278.001
2017-06-20 16:16:36,387 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675278.002 to: ./preindex/1978/1675278.002
2017-06-20 16:16:36,387 INFO CopyFiles$ Copying: Z:\I\1978\01\03\1675278.003 to: ./preindex/1978/1675278.003
2017-06-20 16:16:36,403 INFO CopyFiles$ Processing DocNum: 1812020, FileYear: 1978, FileMd: 719, Files: List(Z:\I\1978\07\19\1812020.001, Z:\I\1978\07\19\1812020.002, Z:\I\1978\07\19\1812020.003, Z:\I\1978\07\19\1812020.004)
2017-06-20 16:16:36,403 INFO CopyFiles$ Copying: Z:\I\1978\07\19\1812020.001 to: ./preindex/1978/1812020.001
2017-06-20 16:16:36,403 INFO CopyFiles$ Copying: Z:\I\1978\07\19\1812020.002 to: ./preindex/1978/1812020.002
2017-06-20 16:16:36,403 INFO CopyFiles$ Copying: Z:\I\1978\07\19\1812020.003 to: ./preindex/1978/1812020.003
2017-06-20 16:16:36,418 INFO CopyFiles$ Copying: Z:\I\1978\07\19\1812020.004 to: ./preindex/1978/1812020.004
2017-06-20 16:16:36,418 INFO CopyFiles$ Processing DocNum: 1754829, FileYear: 1978, FileMd: 502, Files: List(Z:\I\1978\05\02\1754829.001, Z:\I\1978\05\02\1754829.002, Z:\I\1978\05\02\1754829.003, Z:\I\1978\05\02\1754829.004)
2017-06-20 16:16:36,418 INFO CopyFiles$ Copying: Z:\I\1978\05\02\1754829.001 to: ./preindex/1978/1754829.001
2017-06-20 16:16:36,434 INFO CopyFiles$ Copying: Z:\I\1978\05\02\1754829.002 to: ./preindex/1978/1754829.002
2017-06-20 16:16:36,465 INFO CopyFiles$ Copying: Z:\I\1978\05\02\1754829.003 to: ./preindex/1978/1754829.003
2017-06-20 16:16:36,465 INFO CopyFiles$ Copying: Z:\I\1978\05\02\1754829.004 to: ./preindex/1978/1754829.004
2017-06-20 16:16:36,481 INFO CopyFiles$ Processing DocNum: 1675954, FileYear: 1978, FileMd: 104, Files: List(Z:\I\1978\01\04\1675954.001, Z:\I\1978\01\04\1675954.002, Z:\I\1978\01\04\1675954.003, Z:\I\1978\01\04\1675954.004, Z:\I\1978\01\04\1675954.005)
2017-06-20 16:16:36,481 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1675954.001 to: ./preindex/1978/1675954.001
2017-06-20 16:16:36,496 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1675954.002 to: ./preindex/1978/1675954.002
2017-06-20 16:16:36,496 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1675954.003 to: ./preindex/1978/1675954.003
2017-06-20 16:16:36,512 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1675954.004 to: ./preindex/1978/1675954.004
2017-06-20 16:16:36,512 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1675954.005 to: ./preindex/1978/1675954.005
2017-06-20 16:16:36,512 INFO CopyFiles$ Processing DocNum: 1799540, FileYear: 1978, FileMd: 703, Files: List(Z:\I\1978\07\03\1799540.001, Z:\I\1978\07\03\1799540.002, Z:\I\1978\07\03\1799540.003, Z:\I\1978\07\03\1799540.004, Z:\I\1978\07\03\1799540.005, Z:\I\1978\07\03\1799540.006, Z:\I\1978\07\03\1799540.007)
2017-06-20 16:16:36,527 INFO CopyFiles$ Copying: Z:\I\1978\07\03\1799540.001 to: ./preindex/1978/1799540.001
2017-06-20 16:16:36,543 INFO CopyFiles$ Copying: Z:\I\1978\07\03\1799540.002 to: ./preindex/1978/1799540.002
2017-06-20 16:16:36,559 INFO CopyFiles$ Copying: Z:\I\1978\07\03\1799540.003 to: ./preindex/1978/1799540.003
2017-06-20 16:16:36,574 INFO CopyFiles$ Copying: Z:\I\1978\07\03\1799540.004 to: ./preindex/1978/1799540.004
2017-06-20 16:16:36,574 INFO CopyFiles$ Copying: Z:\I\1978\07\03\1799540.005 to: ./preindex/1978/1799540.005
2017-06-20 16:16:36,590 INFO CopyFiles$ Copying: Z:\I\1978\07\03\1799540.006 to: ./preindex/1978/1799540.006
2017-06-20 16:16:36,605 INFO CopyFiles$ Copying: Z:\I\1978\07\03\1799540.007 to: ./preindex/1978/1799540.007
2017-06-20 16:16:36,621 INFO CopyFiles$ Processing DocNum: 1914947, FileYear: 1978, FileMd: 1211, Files: List(Z:\I\1978\12\11\1914947.001, Z:\I\1978\12\11\1914947.002, Z:\I\1978\12\11\1914947.003, Z:\I\1978\12\11\1914947.004)
2017-06-20 16:16:36,621 INFO CopyFiles$ Copying: Z:\I\1978\12\11\1914947.001 to: ./preindex/1978/1914947.001
2017-06-20 16:16:36,637 INFO CopyFiles$ Copying: Z:\I\1978\12\11\1914947.002 to: ./preindex/1978/1914947.002
2017-06-20 16:16:36,652 INFO CopyFiles$ Copying: Z:\I\1978\12\11\1914947.003 to: ./preindex/1978/1914947.003
2017-06-20 16:16:36,652 INFO CopyFiles$ Copying: Z:\I\1978\12\11\1914947.004 to: ./preindex/1978/1914947.004
2017-06-20 16:16:36,668 INFO CopyFiles$ Processing DocNum: 1866644, FileYear: 1978, FileMd: 929, Files: List(Z:\I\1978\09\29\1866644.001, Z:\I\1978\09\29\1866644.002, Z:\I\1978\09\29\1866644.003, Z:\I\1978\09\29\1866644.004, Z:\I\1978\09\29\1866644.005)
2017-06-20 16:16:36,668 INFO CopyFiles$ Copying: Z:\I\1978\09\29\1866644.001 to: ./preindex/1978/1866644.001
2017-06-20 16:16:36,683 INFO CopyFiles$ Copying: Z:\I\1978\09\29\1866644.002 to: ./preindex/1978/1866644.002
2017-06-20 16:16:36,684 INFO CopyFiles$ Copying: Z:\I\1978\09\29\1866644.003 to: ./preindex/1978/1866644.003
2017-06-20 16:16:36,705 INFO CopyFiles$ Copying: Z:\I\1978\09\29\1866644.004 to: ./preindex/1978/1866644.004
2017-06-20 16:16:36,725 INFO CopyFiles$ Copying: Z:\I\1978\09\29\1866644.005 to: ./preindex/1978/1866644.005
2017-06-20 16:16:36,755 INFO CopyFiles$ Processing DocNum: 1797462, FileYear: 1978, FileMd: 629, Files: List(Z:\I\1978\06\29\1797462.001, Z:\I\1978\06\29\1797462.002, Z:\I\1978\06\29\1797462.003, Z:\I\1978\06\29\1797462.004)
2017-06-20 16:16:36,755 INFO CopyFiles$ Copying: Z:\I\1978\06\29\1797462.001 to: ./preindex/1978/1797462.001
2017-06-20 16:16:36,765 INFO CopyFiles$ Copying: Z:\I\1978\06\29\1797462.002 to: ./preindex/1978/1797462.002
2017-06-20 16:16:36,765 INFO CopyFiles$ Copying: Z:\I\1978\06\29\1797462.003 to: ./preindex/1978/1797462.003
2017-06-20 16:16:36,775 INFO CopyFiles$ Copying: Z:\I\1978\06\29\1797462.004 to: ./preindex/1978/1797462.004
2017-06-20 16:16:36,791 INFO CopyFiles$ Processing DocNum: 1842816, FileYear: 1978, FileMd: 829, Files: List(Z:\I\1978\08\29\1842816.001, Z:\I\1978\08\29\1842816.002, Z:\I\1978\08\29\1842816.003, Z:\I\1978\08\29\1842816.004, Z:\I\1978\08\29\1842816.005, Z:\I\1978\08\29\1842816.006)
2017-06-20 16:16:36,791 INFO CopyFiles$ Copying: Z:\I\1978\08\29\1842816.001 to: ./preindex/1978/1842816.001
2017-06-20 16:16:36,822 INFO CopyFiles$ Copying: Z:\I\1978\08\29\1842816.002 to: ./preindex/1978/1842816.002
2017-06-20 16:16:36,838 INFO CopyFiles$ Copying: Z:\I\1978\08\29\1842816.003 to: ./preindex/1978/1842816.003
2017-06-20 16:16:36,853 INFO CopyFiles$ Copying: Z:\I\1978\08\29\1842816.004 to: ./preindex/1978/1842816.004
2017-06-20 16:16:36,869 INFO CopyFiles$ Copying: Z:\I\1978\08\29\1842816.005 to: ./preindex/1978/1842816.005
2017-06-20 16:16:36,885 INFO CopyFiles$ Copying: Z:\I\1978\08\29\1842816.006 to: ./preindex/1978/1842816.006
2017-06-20 16:16:36,916 INFO CopyFiles$ Processing DocNum: 1698694, FileYear: 1978, FileMd: 208, Files: List(Z:\I\1978\02\08\1698694.001, Z:\I\1978\02\08\1698694.002, Z:\I\1978\02\08\1698694.003, Z:\I\1978\02\08\1698694.004)
2017-06-20 16:16:36,916 INFO CopyFiles$ Copying: Z:\I\1978\02\08\1698694.001 to: ./preindex/1978/1698694.001
2017-06-20 16:16:36,931 INFO CopyFiles$ Copying: Z:\I\1978\02\08\1698694.002 to: ./preindex/1978/1698694.002
2017-06-20 16:16:36,947 INFO CopyFiles$ Copying: Z:\I\1978\02\08\1698694.003 to: ./preindex/1978/1698694.003
2017-06-20 16:16:36,947 INFO CopyFiles$ Copying: Z:\I\1978\02\08\1698694.004 to: ./preindex/1978/1698694.004
2017-06-20 16:16:36,963 INFO CopyFiles$ Processing DocNum: 1762990, FileYear: 1978, FileMd: 511, Files: List(Z:\I\1978\05\11\1762990.001, Z:\I\1978\05\11\1762990.002)
2017-06-20 16:16:36,963 INFO CopyFiles$ Copying: Z:\I\1978\05\11\1762990.001 to: ./preindex/1978/1762990.001
2017-06-20 16:16:36,994 INFO CopyFiles$ Copying: Z:\I\1978\05\11\1762990.002 to: ./preindex/1978/1762990.002
2017-06-20 16:16:37,009 INFO CopyFiles$ Processing DocNum: 1926323, FileYear: 1978, FileMd: 1229, Files: List(Z:\I\1978\12\29\1926323.001, Z:\I\1978\12\29\1926323.002, Z:\I\1978\12\29\1926323.003, Z:\I\1978\12\29\1926323.004, Z:\I\1978\12\29\1926323.005)
2017-06-20 16:16:37,025 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1926323.001 to: ./preindex/1978/1926323.001
2017-06-20 16:16:37,041 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1926323.002 to: ./preindex/1978/1926323.002
2017-06-20 16:16:37,041 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1926323.003 to: ./preindex/1978/1926323.003
2017-06-20 16:16:37,041 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1926323.004 to: ./preindex/1978/1926323.004
2017-06-20 16:16:37,056 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1926323.005 to: ./preindex/1978/1926323.005
2017-06-20 16:16:37,103 INFO CopyFiles$ Processing DocNum: 1833338, FileYear: 1978, FileMd: 816, Files: List(Z:\I\1978\08\16\1833338.001, Z:\I\1978\08\16\1833338.002, Z:\I\1978\08\16\1833338.003)
2017-06-20 16:16:37,103 INFO CopyFiles$ Copying: Z:\I\1978\08\16\1833338.001 to: ./preindex/1978/1833338.001
2017-06-20 16:16:37,119 INFO CopyFiles$ Copying: Z:\I\1978\08\16\1833338.002 to: ./preindex/1978/1833338.002
2017-06-20 16:16:37,134 INFO CopyFiles$ Copying: Z:\I\1978\08\16\1833338.003 to: ./preindex/1978/1833338.003
2017-06-20 16:16:37,150 INFO CopyFiles$ Processing DocNum: 1924017, FileYear: 1978, FileMd: 1222, Files: List(Z:\I\1978\12\22\1924017.001, Z:\I\1978\12\22\1924017.002, Z:\I\1978\12\22\1924017.003, Z:\I\1978\12\22\1924017.004)
2017-06-20 16:16:37,150 INFO CopyFiles$ Copying: Z:\I\1978\12\22\1924017.001 to: ./preindex/1978/1924017.001
2017-06-20 16:16:37,165 INFO CopyFiles$ Copying: Z:\I\1978\12\22\1924017.002 to: ./preindex/1978/1924017.002
2017-06-20 16:16:37,165 INFO CopyFiles$ Copying: Z:\I\1978\12\22\1924017.003 to: ./preindex/1978/1924017.003
2017-06-20 16:16:37,165 INFO CopyFiles$ Copying: Z:\I\1978\12\22\1924017.004 to: ./preindex/1978/1924017.004
2017-06-20 16:16:37,181 INFO CopyFiles$ Processing DocNum: 1738839, FileYear: 1978, FileMd: 324, Files: List(Z:\I\1978\03\24\1738839.001, Z:\I\1978\03\24\1738839.002, Z:\I\1978\03\24\1738839.003, Z:\I\1978\03\24\1738839.004, Z:\I\1978\03\24\1738839.005, Z:\I\1978\03\24\1738839.006, Z:\I\1978\03\24\1738839.007)
2017-06-20 16:16:37,181 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1738839.001 to: ./preindex/1978/1738839.001
2017-06-20 16:16:37,197 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1738839.002 to: ./preindex/1978/1738839.002
2017-06-20 16:16:37,212 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1738839.003 to: ./preindex/1978/1738839.003
2017-06-20 16:16:37,228 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1738839.004 to: ./preindex/1978/1738839.004
2017-06-20 16:16:37,243 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1738839.005 to: ./preindex/1978/1738839.005
2017-06-20 16:16:37,259 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1738839.006 to: ./preindex/1978/1738839.006
2017-06-20 16:16:37,275 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1738839.007 to: ./preindex/1978/1738839.007
2017-06-20 16:16:37,306 INFO CopyFiles$ Processing DocNum: 1751210, FileYear: 1978, FileMd: 427, Files: List(Z:\I\1978\04\27\1751210.001, Z:\I\1978\04\27\1751210.002, Z:\I\1978\04\27\1751210.003, Z:\I\1978\04\27\1751210.004, Z:\I\1978\04\27\1751210.005)
2017-06-20 16:16:37,306 INFO CopyFiles$ Copying: Z:\I\1978\04\27\1751210.001 to: ./preindex/1978/1751210.001
2017-06-20 16:16:37,306 INFO CopyFiles$ Copying: Z:\I\1978\04\27\1751210.002 to: ./preindex/1978/1751210.002
2017-06-20 16:16:37,321 INFO CopyFiles$ Copying: Z:\I\1978\04\27\1751210.003 to: ./preindex/1978/1751210.003
2017-06-20 16:16:37,321 INFO CopyFiles$ Copying: Z:\I\1978\04\27\1751210.004 to: ./preindex/1978/1751210.004
2017-06-20 16:16:37,337 INFO CopyFiles$ Copying: Z:\I\1978\04\27\1751210.005 to: ./preindex/1978/1751210.005
2017-06-20 16:16:37,353 INFO CopyFiles$ Processing DocNum: 1709317, FileYear: 1978, FileMd: 224, Files: List(Z:\I\1978\02\24\1709317.001, Z:\I\1978\02\24\1709317.002)
2017-06-20 16:16:37,353 INFO CopyFiles$ Copying: Z:\I\1978\02\24\1709317.001 to: ./preindex/1978/1709317.001
2017-06-20 16:16:37,368 INFO CopyFiles$ Copying: Z:\I\1978\02\24\1709317.002 to: ./preindex/1978/1709317.002
2017-06-20 16:16:37,384 INFO CopyFiles$ Processing DocNum: 1844426, FileYear: 1978, FileMd: 906, Files: List(Z:\I\1978\09\06\1844426.001, Z:\I\1978\09\06\1844426.002, Z:\I\1978\09\06\1844426.003, Z:\I\1978\09\06\1844426.004, Z:\I\1978\09\06\1844426.005, Z:\I\1978\09\06\1844426.006, Z:\I\1978\09\06\1844426.007)
2017-06-20 16:16:37,384 INFO CopyFiles$ Copying: Z:\I\1978\09\06\1844426.001 to: ./preindex/1978/1844426.001
2017-06-20 16:16:37,399 INFO CopyFiles$ Copying: Z:\I\1978\09\06\1844426.002 to: ./preindex/1978/1844426.002
2017-06-20 16:16:37,415 INFO CopyFiles$ Copying: Z:\I\1978\09\06\1844426.003 to: ./preindex/1978/1844426.003
2017-06-20 16:16:37,431 INFO CopyFiles$ Copying: Z:\I\1978\09\06\1844426.004 to: ./preindex/1978/1844426.004
2017-06-20 16:16:37,446 INFO CopyFiles$ Copying: Z:\I\1978\09\06\1844426.005 to: ./preindex/1978/1844426.005
2017-06-20 16:16:37,462 INFO CopyFiles$ Copying: Z:\I\1978\09\06\1844426.006 to: ./preindex/1978/1844426.006
2017-06-20 16:16:37,477 INFO CopyFiles$ Copying: Z:\I\1978\09\06\1844426.007 to: ./preindex/1978/1844426.007
2017-06-20 16:16:37,493 INFO CopyFiles$ Processing DocNum: 1732986, FileYear: 1978, FileMd: 331, Files: List(Z:\I\1978\03\31\1732986.001, Z:\I\1978\03\31\1732986.002, Z:\I\1978\03\31\1732986.003, Z:\I\1978\03\31\1732986.004, Z:\I\1978\03\31\1732986.005, Z:\I\1978\03\31\1732986.006, Z:\I\1978\03\31\1732986.007, Z:\I\1978\03\31\1732986.008)
2017-06-20 16:16:37,493 INFO CopyFiles$ Copying: Z:\I\1978\03\31\1732986.001 to: ./preindex/1978/1732986.001
2017-06-20 16:16:37,509 INFO CopyFiles$ Copying: Z:\I\1978\03\31\1732986.002 to: ./preindex/1978/1732986.002
2017-06-20 16:16:37,524 INFO CopyFiles$ Copying: Z:\I\1978\03\31\1732986.003 to: ./preindex/1978/1732986.003
2017-06-20 16:16:37,540 INFO CopyFiles$ Copying: Z:\I\1978\03\31\1732986.004 to: ./preindex/1978/1732986.004
2017-06-20 16:16:37,540 INFO CopyFiles$ Copying: Z:\I\1978\03\31\1732986.005 to: ./preindex/1978/1732986.005
2017-06-20 16:16:37,571 INFO CopyFiles$ Copying: Z:\I\1978\03\31\1732986.006 to: ./preindex/1978/1732986.006
2017-06-20 16:16:37,571 INFO CopyFiles$ Copying: Z:\I\1978\03\31\1732986.007 to: ./preindex/1978/1732986.007
2017-06-20 16:16:37,587 INFO CopyFiles$ Copying: Z:\I\1978\03\31\1732986.008 to: ./preindex/1978/1732986.008
2017-06-20 16:16:37,587 INFO CopyFiles$ Processing DocNum: 1882448, FileYear: 1978, FileMd: 1023, Files: List(Z:\I\1978\10\23\1882448.001, Z:\I\1978\10\23\1882448.002)
2017-06-20 16:16:37,587 INFO CopyFiles$ Copying: Z:\I\1978\10\23\1882448.001 to: ./preindex/1978/1882448.001
2017-06-20 16:16:37,602 INFO CopyFiles$ Copying: Z:\I\1978\10\23\1882448.002 to: ./preindex/1978/1882448.002
2017-06-20 16:16:37,618 INFO CopyFiles$ Processing DocNum: 1722083, FileYear: 1978, FileMd: 315, Files: List(Z:\I\1978\03\15\1722083.001, Z:\I\1978\03\15\1722083.002, Z:\I\1978\03\15\1722083.003, Z:\I\1978\03\15\1722083.004, Z:\I\1978\03\15\1722083.005, Z:\I\1978\03\15\1722083.006)
2017-06-20 16:16:37,618 INFO CopyFiles$ Copying: Z:\I\1978\03\15\1722083.001 to: ./preindex/1978/1722083.001
2017-06-20 16:16:37,633 INFO CopyFiles$ Copying: Z:\I\1978\03\15\1722083.002 to: ./preindex/1978/1722083.002
2017-06-20 16:16:37,649 INFO CopyFiles$ Copying: Z:\I\1978\03\15\1722083.003 to: ./preindex/1978/1722083.003
2017-06-20 16:16:37,665 INFO CopyFiles$ Copying: Z:\I\1978\03\15\1722083.004 to: ./preindex/1978/1722083.004
2017-06-20 16:16:37,665 INFO CopyFiles$ Copying: Z:\I\1978\03\15\1722083.005 to: ./preindex/1978/1722083.005
2017-06-20 16:16:37,680 INFO CopyFiles$ Copying: Z:\I\1978\03\15\1722083.006 to: ./preindex/1978/1722083.006
2017-06-20 16:16:37,680 INFO CopyFiles$ Processing DocNum: 1721188, FileYear: 1978, FileMd: 314, Files: List(Z:\I\1978\03\14\1721188.001, Z:\I\1978\03\14\1721188.002, Z:\I\1978\03\14\1721188.003)
2017-06-20 16:16:37,680 INFO CopyFiles$ Copying: Z:\I\1978\03\14\1721188.001 to: ./preindex/1978/1721188.001
2017-06-20 16:16:37,696 INFO CopyFiles$ Copying: Z:\I\1978\03\14\1721188.002 to: ./preindex/1978/1721188.002
2017-06-20 16:16:37,696 INFO CopyFiles$ Copying: Z:\I\1978\03\14\1721188.003 to: ./preindex/1978/1721188.003
2017-06-20 16:16:37,696 INFO CopyFiles$ Processing DocNum: 1686338, FileYear: 1978, FileMd: 119, Files: List(Z:\I\1978\01\19\1686338.001, Z:\I\1978\01\19\1686338.002, Z:\I\1978\01\19\1686338.003)
2017-06-20 16:16:37,696 INFO CopyFiles$ Copying: Z:\I\1978\01\19\1686338.001 to: ./preindex/1978/1686338.001
2017-06-20 16:16:37,727 INFO CopyFiles$ Copying: Z:\I\1978\01\19\1686338.002 to: ./preindex/1978/1686338.002
2017-06-20 16:16:37,743 INFO CopyFiles$ Copying: Z:\I\1978\01\19\1686338.003 to: ./preindex/1978/1686338.003
2017-06-20 16:16:37,758 INFO CopyFiles$ Processing DocNum: 1683770, FileYear: 1978, FileMd: 116, Files: List(Z:\I\1978\01\16\1683770.001, Z:\I\1978\01\16\1683770.002)
2017-06-20 16:16:37,774 INFO CopyFiles$ Copying: Z:\I\1978\01\16\1683770.001 to: ./preindex/1978/1683770.001
2017-06-20 16:16:37,789 INFO CopyFiles$ Copying: Z:\I\1978\01\16\1683770.002 to: ./preindex/1978/1683770.002
2017-06-20 16:16:37,805 INFO CopyFiles$ Processing DocNum: 1796916, FileYear: 1978, FileMd: 629, Files: List(Z:\I\1978\06\29\1796916.001, Z:\I\1978\06\29\1796916.002)
2017-06-20 16:16:37,805 INFO CopyFiles$ Copying: Z:\I\1978\06\29\1796916.001 to: ./preindex/1978/1796916.001
2017-06-20 16:16:37,805 INFO CopyFiles$ Copying: Z:\I\1978\06\29\1796916.002 to: ./preindex/1978/1796916.002
2017-06-20 16:16:37,821 INFO CopyFiles$ Processing DocNum: 1817460, FileYear: 1978, FileMd: 727, Files: List(Z:\I\1978\07\27\1817460.001, Z:\I\1978\07\27\1817460.002)
2017-06-20 16:16:37,821 INFO CopyFiles$ Copying: Z:\I\1978\07\27\1817460.001 to: ./preindex/1978/1817460.001
2017-06-20 16:16:37,836 INFO CopyFiles$ Copying: Z:\I\1978\07\27\1817460.002 to: ./preindex/1978/1817460.002
2017-06-20 16:16:37,852 INFO CopyFiles$ Processing DocNum: 1907856, FileYear: 1978, FileMd: 1129, Files: List(Z:\I\1978\11\29\1907856.001, Z:\I\1978\11\29\1907856.002, Z:\I\1978\11\29\1907856.003, Z:\I\1978\11\29\1907856.004)
2017-06-20 16:16:37,852 INFO CopyFiles$ Copying: Z:\I\1978\11\29\1907856.001 to: ./preindex/1978/1907856.001
2017-06-20 16:16:37,867 INFO CopyFiles$ Copying: Z:\I\1978\11\29\1907856.002 to: ./preindex/1978/1907856.002
2017-06-20 16:16:37,867 INFO CopyFiles$ Copying: Z:\I\1978\11\29\1907856.003 to: ./preindex/1978/1907856.003
2017-06-20 16:16:37,883 INFO CopyFiles$ Copying: Z:\I\1978\11\29\1907856.004 to: ./preindex/1978/1907856.004
2017-06-20 16:16:37,883 INFO CopyFiles$ Processing DocNum: 1854484, FileYear: 1978, FileMd: 913, Files: List(Z:\I\1978\09\13\1854484.001, Z:\I\1978\09\13\1854484.002, Z:\I\1978\09\13\1854484.003, Z:\I\1978\09\13\1854484.004)
2017-06-20 16:16:37,883 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1854484.001 to: ./preindex/1978/1854484.001
2017-06-20 16:16:37,899 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1854484.002 to: ./preindex/1978/1854484.002
2017-06-20 16:16:37,899 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1854484.003 to: ./preindex/1978/1854484.003
2017-06-20 16:16:37,899 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1854484.004 to: ./preindex/1978/1854484.004
2017-06-20 16:16:37,914 INFO CopyFiles$ Processing DocNum: 1729076, FileYear: 1978, FileMd: 327, Files: List(Z:\I\1978\03\27\1729076.001, Z:\I\1978\03\27\1729076.002, Z:\I\1978\03\27\1729076.003, Z:\I\1978\03\27\1729076.004, Z:\I\1978\03\27\1729076.005)
2017-06-20 16:16:37,914 INFO CopyFiles$ Copying: Z:\I\1978\03\27\1729076.001 to: ./preindex/1978/1729076.001
2017-06-20 16:16:37,930 INFO CopyFiles$ Copying: Z:\I\1978\03\27\1729076.002 to: ./preindex/1978/1729076.002
2017-06-20 16:16:37,945 INFO CopyFiles$ Copying: Z:\I\1978\03\27\1729076.003 to: ./preindex/1978/1729076.003
2017-06-20 16:16:37,961 INFO CopyFiles$ Copying: Z:\I\1978\03\27\1729076.004 to: ./preindex/1978/1729076.004
2017-06-20 16:16:37,977 INFO CopyFiles$ Copying: Z:\I\1978\03\27\1729076.005 to: ./preindex/1978/1729076.005
2017-06-20 16:16:37,977 INFO CopyFiles$ Processing DocNum: 1708134, FileYear: 1978, FileMd: 223, Files: List(Z:\I\1978\02\23\1708134.001, Z:\I\1978\02\23\1708134.002)
2017-06-20 16:16:37,977 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1708134.001 to: ./preindex/1978/1708134.001
2017-06-20 16:16:38,008 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1708134.002 to: ./preindex/1978/1708134.002
2017-06-20 16:16:38,008 INFO CopyFiles$ Processing DocNum: 1714371, FileYear: 1978, FileMd: 306, Files: List(Z:\I\1978\03\06\1714371.001, Z:\I\1978\03\06\1714371.002, Z:\I\1978\03\06\1714371.003, Z:\I\1978\03\06\1714371.004, Z:\I\1978\03\06\1714371.005, Z:\I\1978\03\06\1714371.006, Z:\I\1978\03\06\1714371.007, Z:\I\1978\03\06\1714371.008)
2017-06-20 16:16:38,008 INFO CopyFiles$ Copying: Z:\I\1978\03\06\1714371.001 to: ./preindex/1978/1714371.001
2017-06-20 16:16:38,023 INFO CopyFiles$ Copying: Z:\I\1978\03\06\1714371.002 to: ./preindex/1978/1714371.002
2017-06-20 16:16:38,039 INFO CopyFiles$ Copying: Z:\I\1978\03\06\1714371.003 to: ./preindex/1978/1714371.003
2017-06-20 16:16:38,055 INFO CopyFiles$ Copying: Z:\I\1978\03\06\1714371.004 to: ./preindex/1978/1714371.004
2017-06-20 16:16:38,055 INFO CopyFiles$ Copying: Z:\I\1978\03\06\1714371.005 to: ./preindex/1978/1714371.005
2017-06-20 16:16:38,070 INFO CopyFiles$ Copying: Z:\I\1978\03\06\1714371.006 to: ./preindex/1978/1714371.006
2017-06-20 16:16:38,070 INFO CopyFiles$ Copying: Z:\I\1978\03\06\1714371.007 to: ./preindex/1978/1714371.007
2017-06-20 16:16:38,086 INFO CopyFiles$ Copying: Z:\I\1978\03\06\1714371.008 to: ./preindex/1978/1714371.008
2017-06-20 16:16:38,086 INFO CopyFiles$ Processing DocNum: 1839234, FileYear: 1978, FileMd: 824, Files: List(Z:\I\1978\08\24\1839234.001, Z:\I\1978\08\24\1839234.002, Z:\I\1978\08\24\1839234.003, Z:\I\1978\08\24\1839234.004, Z:\I\1978\08\24\1839234.005, Z:\I\1978\08\24\1839234.006)
2017-06-20 16:16:38,086 INFO CopyFiles$ Copying: Z:\I\1978\08\24\1839234.001 to: ./preindex/1978/1839234.001
2017-06-20 16:16:38,101 INFO CopyFiles$ Copying: Z:\I\1978\08\24\1839234.002 to: ./preindex/1978/1839234.002
2017-06-20 16:16:38,101 INFO CopyFiles$ Copying: Z:\I\1978\08\24\1839234.003 to: ./preindex/1978/1839234.003
2017-06-20 16:16:38,117 INFO CopyFiles$ Copying: Z:\I\1978\08\24\1839234.004 to: ./preindex/1978/1839234.004
2017-06-20 16:16:38,117 INFO CopyFiles$ Copying: Z:\I\1978\08\24\1839234.005 to: ./preindex/1978/1839234.005
2017-06-20 16:16:38,148 INFO CopyFiles$ Copying: Z:\I\1978\08\24\1839234.006 to: ./preindex/1978/1839234.006
2017-06-20 16:16:38,148 INFO CopyFiles$ Processing DocNum: 1682779, FileYear: 1978, FileMd: 113, Files: List(Z:\I\1978\01\13\1682779.001, Z:\I\1978\01\13\1682779.002, Z:\I\1978\01\13\1682779.003)
2017-06-20 16:16:38,148 INFO CopyFiles$ Copying: Z:\I\1978\01\13\1682779.001 to: ./preindex/1978/1682779.001
2017-06-20 16:16:38,164 INFO CopyFiles$ Copying: Z:\I\1978\01\13\1682779.002 to: ./preindex/1978/1682779.002
2017-06-20 16:16:38,179 INFO CopyFiles$ Copying: Z:\I\1978\01\13\1682779.003 to: ./preindex/1978/1682779.003
2017-06-20 16:16:38,211 INFO CopyFiles$ Processing DocNum: 1808171, FileYear: 1978, FileMd: 714, Files: List(Z:\I\1978\07\14\1808171.001, Z:\I\1978\07\14\1808171.002, Z:\I\1978\07\14\1808171.003)
2017-06-20 16:16:38,211 INFO CopyFiles$ Copying: Z:\I\1978\07\14\1808171.001 to: ./preindex/1978/1808171.001
2017-06-20 16:16:38,226 INFO CopyFiles$ Copying: Z:\I\1978\07\14\1808171.002 to: ./preindex/1978/1808171.002
2017-06-20 16:16:38,242 INFO CopyFiles$ Copying: Z:\I\1978\07\14\1808171.003 to: ./preindex/1978/1808171.003
2017-06-20 16:16:38,257 INFO CopyFiles$ Processing DocNum: 1827175, FileYear: 1978, FileMd: 808, Files: List(Z:\I\1978\08\08\1827175.001, Z:\I\1978\08\08\1827175.002)
2017-06-20 16:16:38,257 INFO CopyFiles$ Copying: Z:\I\1978\08\08\1827175.001 to: ./preindex/1978/1827175.001
2017-06-20 16:16:38,273 INFO CopyFiles$ Copying: Z:\I\1978\08\08\1827175.002 to: ./preindex/1978/1827175.002
2017-06-20 16:16:38,289 INFO CopyFiles$ Processing DocNum: 1873568, FileYear: 1978, FileMd: 1009, Files: List(Z:\I\1978\10\09\1873568.001, Z:\I\1978\10\09\1873568.002, Z:\I\1978\10\09\1873568.003, Z:\I\1978\10\09\1873568.004, Z:\I\1978\10\09\1873568.005, Z:\I\1978\10\09\1873568.006)
2017-06-20 16:16:38,304 INFO CopyFiles$ Copying: Z:\I\1978\10\09\1873568.001 to: ./preindex/1978/1873568.001
2017-06-20 16:16:38,320 INFO CopyFiles$ Copying: Z:\I\1978\10\09\1873568.002 to: ./preindex/1978/1873568.002
2017-06-20 16:16:38,335 INFO CopyFiles$ Copying: Z:\I\1978\10\09\1873568.003 to: ./preindex/1978/1873568.003
2017-06-20 16:16:38,351 INFO CopyFiles$ Copying: Z:\I\1978\10\09\1873568.004 to: ./preindex/1978/1873568.004
2017-06-20 16:16:38,351 INFO CopyFiles$ Copying: Z:\I\1978\10\09\1873568.005 to: ./preindex/1978/1873568.005
2017-06-20 16:16:38,367 INFO CopyFiles$ Copying: Z:\I\1978\10\09\1873568.006 to: ./preindex/1978/1873568.006
2017-06-20 16:16:38,382 INFO CopyFiles$ Processing DocNum: 1849591, FileYear: 1978, FileMd: 907, Files: List(Z:\I\1978\09\07\1849591.001, Z:\I\1978\09\07\1849591.002, Z:\I\1978\09\07\1849591.003, Z:\I\1978\09\07\1849591.004, Z:\I\1978\09\07\1849591.005)
2017-06-20 16:16:38,382 INFO CopyFiles$ Copying: Z:\I\1978\09\07\1849591.001 to: ./preindex/1978/1849591.001
2017-06-20 16:16:38,398 INFO CopyFiles$ Copying: Z:\I\1978\09\07\1849591.002 to: ./preindex/1978/1849591.002
2017-06-20 16:16:38,413 INFO CopyFiles$ Copying: Z:\I\1978\09\07\1849591.003 to: ./preindex/1978/1849591.003
2017-06-20 16:16:38,429 INFO CopyFiles$ Copying: Z:\I\1978\09\07\1849591.004 to: ./preindex/1978/1849591.004
2017-06-20 16:16:38,429 INFO CopyFiles$ Copying: Z:\I\1978\09\07\1849591.005 to: ./preindex/1978/1849591.005
2017-06-20 16:16:38,445 INFO CopyFiles$ Processing DocNum: 1729915, FileYear: 1978, FileMd: 328, Files: List(Z:\I\1978\03\28\1729915.001, Z:\I\1978\03\28\1729915.002, Z:\I\1978\03\28\1729915.003)
2017-06-20 16:16:38,445 INFO CopyFiles$ Copying: Z:\I\1978\03\28\1729915.001 to: ./preindex/1978/1729915.001
2017-06-20 16:16:38,460 INFO CopyFiles$ Copying: Z:\I\1978\03\28\1729915.002 to: ./preindex/1978/1729915.002
2017-06-20 16:16:38,476 INFO CopyFiles$ Copying: Z:\I\1978\03\28\1729915.003 to: ./preindex/1978/1729915.003
2017-06-20 16:16:38,476 INFO CopyFiles$ Processing DocNum: 1813916, FileYear: 1978, FileMd: 721, Files: List(Z:\I\1978\07\21\1813916.001, Z:\I\1978\07\21\1813916.002, Z:\I\1978\07\21\1813916.003)
2017-06-20 16:16:38,491 INFO CopyFiles$ Copying: Z:\I\1978\07\21\1813916.001 to: ./preindex/1978/1813916.001
2017-06-20 16:16:38,507 INFO CopyFiles$ Copying: Z:\I\1978\07\21\1813916.002 to: ./preindex/1978/1813916.002
2017-06-20 16:16:38,507 INFO CopyFiles$ Copying: Z:\I\1978\07\21\1813916.003 to: ./preindex/1978/1813916.003
2017-06-20 16:16:38,507 INFO CopyFiles$ Processing DocNum: 1739380, FileYear: 1978, FileMd: 410, Files: List(Z:\I\1978\04\10\1739380.001, Z:\I\1978\04\10\1739380.002)
2017-06-20 16:16:38,523 INFO CopyFiles$ Copying: Z:\I\1978\04\10\1739380.001 to: ./preindex/1978/1739380.001
2017-06-20 16:16:38,538 INFO CopyFiles$ Copying: Z:\I\1978\04\10\1739380.002 to: ./preindex/1978/1739380.002
2017-06-20 16:16:38,554 INFO CopyFiles$ Processing DocNum: 1688195, FileYear: 1978, FileMd: 123, Files: List(Z:\I\1978\01\23\1688195.001, Z:\I\1978\01\23\1688195.002, Z:\I\1978\01\23\1688195.003)
2017-06-20 16:16:38,554 INFO CopyFiles$ Copying: Z:\I\1978\01\23\1688195.001 to: ./preindex/1978/1688195.001
2017-06-20 16:16:38,569 INFO CopyFiles$ Copying: Z:\I\1978\01\23\1688195.002 to: ./preindex/1978/1688195.002
2017-06-20 16:16:38,585 INFO CopyFiles$ Copying: Z:\I\1978\01\23\1688195.003 to: ./preindex/1978/1688195.003
2017-06-20 16:16:38,616 INFO CopyFiles$ Processing DocNum: 1927425, FileYear: 1978, FileMd: 1229, Files: List(Z:\I\1978\12\29\1927425.001, Z:\I\1978\12\29\1927425.002, Z:\I\1978\12\29\1927425.003, Z:\I\1978\12\29\1927425.004, Z:\I\1978\12\29\1927425.005, Z:\I\1978\12\29\1927425.006, Z:\I\1978\12\29\1927425.007, Z:\I\1978\12\29\1927425.008, Z:\I\1978\12\29\1927425.009, Z:\I\1978\12\29\1927425.010, Z:\I\1978\12\29\1927425.011, Z:\I\1978\12\29\1927425.012, Z:\I\1978\12\29\1927425.013, Z:\I\1978\12\29\1927425.014, Z:\I\1978\12\29\1927425.015, Z:\I\1978\12\29\1927425.016, Z:\I\1978\12\29\1927425.017, Z:\I\1978\12\29\1927425.018, Z:\I\1978\12\29\1927425.019, Z:\I\1978\12\29\1927425.020, Z:\I\1978\12\29\1927425.021)
2017-06-20 16:16:38,616 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927425.001 to: ./preindex/1978/1927425.001
2017-06-20 16:16:38,632 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927425.002 to: ./preindex/1978/1927425.002
2017-06-20 16:16:38,647 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927425.003 to: ./preindex/1978/1927425.003
2017-06-20 16:16:38,647 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927425.004 to: ./preindex/1978/1927425.004
2017-06-20 16:16:38,647 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927425.005 to: ./preindex/1978/1927425.005
2017-06-20 16:16:38,663 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927425.006 to: ./preindex/1978/1927425.006
2017-06-20 16:16:38,663 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927425.007 to: ./preindex/1978/1927425.007
2017-06-20 16:16:38,663 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927425.008 to: ./preindex/1978/1927425.008
2017-06-20 16:16:38,679 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927425.009 to: ./preindex/1978/1927425.009
2017-06-20 16:16:38,679 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927425.010 to: ./preindex/1978/1927425.010
2017-06-20 16:16:38,679 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927425.011 to: ./preindex/1978/1927425.011
2017-06-20 16:16:38,694 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927425.012 to: ./preindex/1978/1927425.012
2017-06-20 16:16:38,694 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927425.013 to: ./preindex/1978/1927425.013
2017-06-20 16:16:38,694 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927425.014 to: ./preindex/1978/1927425.014
2017-06-20 16:16:38,710 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927425.015 to: ./preindex/1978/1927425.015
2017-06-20 16:16:38,710 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927425.016 to: ./preindex/1978/1927425.016
2017-06-20 16:16:38,725 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927425.017 to: ./preindex/1978/1927425.017
2017-06-20 16:16:38,725 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927425.018 to: ./preindex/1978/1927425.018
2017-06-20 16:16:38,725 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927425.019 to: ./preindex/1978/1927425.019
2017-06-20 16:16:38,741 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927425.020 to: ./preindex/1978/1927425.020
2017-06-20 16:16:38,741 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927425.021 to: ./preindex/1978/1927425.021
2017-06-20 16:16:38,757 INFO CopyFiles$ Processing DocNum: 1726988, FileYear: 1978, FileMd: 308, Files: List(Z:\I\1978\03\08\1726988.001, Z:\I\1978\03\08\1726988.002, Z:\I\1978\03\08\1726988.003)
2017-06-20 16:16:38,757 INFO CopyFiles$ Copying: Z:\I\1978\03\08\1726988.001 to: ./preindex/1978/1726988.001
2017-06-20 16:16:38,757 INFO CopyFiles$ Copying: Z:\I\1978\03\08\1726988.002 to: ./preindex/1978/1726988.002
2017-06-20 16:16:38,772 INFO CopyFiles$ Copying: Z:\I\1978\03\08\1726988.003 to: ./preindex/1978/1726988.003
2017-06-20 16:16:38,772 INFO CopyFiles$ Processing DocNum: 1855171, FileYear: 1978, FileMd: 914, Files: List(Z:\I\1978\09\14\1855171.001, Z:\I\1978\09\14\1855171.002, Z:\I\1978\09\14\1855171.003)
2017-06-20 16:16:38,788 INFO CopyFiles$ Copying: Z:\I\1978\09\14\1855171.001 to: ./preindex/1978/1855171.001
2017-06-20 16:16:38,803 INFO CopyFiles$ Copying: Z:\I\1978\09\14\1855171.002 to: ./preindex/1978/1855171.002
2017-06-20 16:16:38,803 INFO CopyFiles$ Copying: Z:\I\1978\09\14\1855171.003 to: ./preindex/1978/1855171.003
2017-06-20 16:16:38,819 INFO CopyFiles$ Processing DocNum: 1924890, FileYear: 1978, FileMd: 1227, Files: List(Z:\I\1978\12\27\1924890.001, Z:\I\1978\12\27\1924890.002, Z:\I\1978\12\27\1924890.003)
2017-06-20 16:16:38,819 INFO CopyFiles$ Copying: Z:\I\1978\12\27\1924890.001 to: ./preindex/1978/1924890.001
2017-06-20 16:16:38,835 INFO CopyFiles$ Copying: Z:\I\1978\12\27\1924890.002 to: ./preindex/1978/1924890.002
2017-06-20 16:16:38,850 INFO CopyFiles$ Copying: Z:\I\1978\12\27\1924890.003 to: ./preindex/1978/1924890.003
2017-06-20 16:16:38,866 INFO CopyFiles$ Processing DocNum: 1868601, FileYear: 1978, FileMd: 1003, Files: List(Z:\I\1978\10\03\1868601.001, Z:\I\1978\10\03\1868601.002, Z:\I\1978\10\03\1868601.003, Z:\I\1978\10\03\1868601.004)
2017-06-20 16:16:38,866 INFO CopyFiles$ Copying: Z:\I\1978\10\03\1868601.001 to: ./preindex/1978/1868601.001
2017-06-20 16:16:38,881 INFO CopyFiles$ Copying: Z:\I\1978\10\03\1868601.002 to: ./preindex/1978/1868601.002
2017-06-20 16:16:38,881 INFO CopyFiles$ Copying: Z:\I\1978\10\03\1868601.003 to: ./preindex/1978/1868601.003
2017-06-20 16:16:38,897 INFO CopyFiles$ Copying: Z:\I\1978\10\03\1868601.004 to: ./preindex/1978/1868601.004
2017-06-20 16:16:38,913 INFO CopyFiles$ Processing DocNum: 1710224, FileYear: 1978, FileMd: 227, Files: List(Z:\I\1978\02\27\1710224.001, Z:\I\1978\02\27\1710224.002)
2017-06-20 16:16:38,913 INFO CopyFiles$ Copying: Z:\I\1978\02\27\1710224.001 to: ./preindex/1978/1710224.001
2017-06-20 16:16:38,944 INFO CopyFiles$ Copying: Z:\I\1978\02\27\1710224.002 to: ./preindex/1978/1710224.002
2017-06-20 16:16:38,944 INFO CopyFiles$ Processing DocNum: 1768500, FileYear: 1978, FileMd: 518, Files: List(Z:\I\1978\05\18\1768500.001, Z:\I\1978\05\18\1768500.002, Z:\I\1978\05\18\1768500.003)
2017-06-20 16:16:38,944 INFO CopyFiles$ Copying: Z:\I\1978\05\18\1768500.001 to: ./preindex/1978/1768500.001
2017-06-20 16:16:38,959 INFO CopyFiles$ Copying: Z:\I\1978\05\18\1768500.002 to: ./preindex/1978/1768500.002
2017-06-20 16:16:38,975 INFO CopyFiles$ Copying: Z:\I\1978\05\18\1768500.003 to: ./preindex/1978/1768500.003
2017-06-20 16:16:38,975 INFO CopyFiles$ Processing DocNum: 1799535, FileYear: 1978, FileMd: 703, Files: List(Z:\I\1978\07\03\1799535.001, Z:\I\1978\07\03\1799535.002, Z:\I\1978\07\03\1799535.003, Z:\I\1978\07\03\1799535.004, Z:\I\1978\07\03\1799535.005)
2017-06-20 16:16:38,975 INFO CopyFiles$ Copying: Z:\I\1978\07\03\1799535.001 to: ./preindex/1978/1799535.001
2017-06-20 16:16:39,006 INFO CopyFiles$ Copying: Z:\I\1978\07\03\1799535.002 to: ./preindex/1978/1799535.002
2017-06-20 16:16:39,022 INFO CopyFiles$ Copying: Z:\I\1978\07\03\1799535.003 to: ./preindex/1978/1799535.003
2017-06-20 16:16:39,037 INFO CopyFiles$ Copying: Z:\I\1978\07\03\1799535.004 to: ./preindex/1978/1799535.004
2017-06-20 16:16:39,053 INFO CopyFiles$ Copying: Z:\I\1978\07\03\1799535.005 to: ./preindex/1978/1799535.005
2017-06-20 16:16:39,069 INFO CopyFiles$ Processing DocNum: 1681198, FileYear: 1978, FileMd: 111, Files: List(Z:\I\1978\01\11\1681198.001, Z:\I\1978\01\11\1681198.002, Z:\I\1978\01\11\1681198.003)
2017-06-20 16:16:39,069 INFO CopyFiles$ Copying: Z:\I\1978\01\11\1681198.001 to: ./preindex/1978/1681198.001
2017-06-20 16:16:39,084 INFO CopyFiles$ Copying: Z:\I\1978\01\11\1681198.002 to: ./preindex/1978/1681198.002
2017-06-20 16:16:39,085 INFO CopyFiles$ Copying: Z:\I\1978\01\11\1681198.003 to: ./preindex/1978/1681198.003
2017-06-20 16:16:39,106 INFO CopyFiles$ Processing DocNum: 1856211, FileYear: 1978, FileMd: 915, Files: List(Z:\I\1978\09\15\1856211.001, Z:\I\1978\09\15\1856211.002)
2017-06-20 16:16:39,106 INFO CopyFiles$ Copying: Z:\I\1978\09\15\1856211.001 to: ./preindex/1978/1856211.001
2017-06-20 16:16:39,126 INFO CopyFiles$ Copying: Z:\I\1978\09\15\1856211.002 to: ./preindex/1978/1856211.002
2017-06-20 16:16:39,146 INFO CopyFiles$ Processing DocNum: 1803933, FileYear: 1978, FileMd: 710, Files: List(Z:\I\1978\07\10\1803933.001, Z:\I\1978\07\10\1803933.002, Z:\I\1978\07\10\1803933.003, Z:\I\1978\07\10\1803933.004, Z:\I\1978\07\10\1803933.005)
2017-06-20 16:16:39,146 INFO CopyFiles$ Copying: Z:\I\1978\07\10\1803933.001 to: ./preindex/1978/1803933.001
2017-06-20 16:16:39,166 INFO CopyFiles$ Copying: Z:\I\1978\07\10\1803933.002 to: ./preindex/1978/1803933.002
2017-06-20 16:16:39,182 INFO CopyFiles$ Copying: Z:\I\1978\07\10\1803933.003 to: ./preindex/1978/1803933.003
2017-06-20 16:16:39,197 INFO CopyFiles$ Copying: Z:\I\1978\07\10\1803933.004 to: ./preindex/1978/1803933.004
2017-06-20 16:16:39,197 INFO CopyFiles$ Copying: Z:\I\1978\07\10\1803933.005 to: ./preindex/1978/1803933.005
2017-06-20 16:16:39,213 INFO CopyFiles$ Processing DocNum: 1709090, FileYear: 1978, FileMd: 224, Files: List(Z:\I\1978\02\24\1709090.001, Z:\I\1978\02\24\1709090.002, Z:\I\1978\02\24\1709090.003, Z:\I\1978\02\24\1709090.004)
2017-06-20 16:16:39,213 INFO CopyFiles$ Copying: Z:\I\1978\02\24\1709090.001 to: ./preindex/1978/1709090.001
2017-06-20 16:16:39,229 INFO CopyFiles$ Copying: Z:\I\1978\02\24\1709090.002 to: ./preindex/1978/1709090.002
2017-06-20 16:16:39,244 INFO CopyFiles$ Copying: Z:\I\1978\02\24\1709090.003 to: ./preindex/1978/1709090.003
2017-06-20 16:16:39,260 INFO CopyFiles$ Copying: Z:\I\1978\02\24\1709090.004 to: ./preindex/1978/1709090.004
2017-06-20 16:16:39,260 INFO CopyFiles$ Processing DocNum: 1883539, FileYear: 1978, FileMd: 1024, Files: List(Z:\I\1978\10\24\1883539.001, Z:\I\1978\10\24\1883539.002, Z:\I\1978\10\24\1883539.003, Z:\I\1978\10\24\1883539.004)
2017-06-20 16:16:39,260 INFO CopyFiles$ Copying: Z:\I\1978\10\24\1883539.001 to: ./preindex/1978/1883539.001
2017-06-20 16:16:39,291 INFO CopyFiles$ Copying: Z:\I\1978\10\24\1883539.002 to: ./preindex/1978/1883539.002
2017-06-20 16:16:39,307 INFO CopyFiles$ Copying: Z:\I\1978\10\24\1883539.003 to: ./preindex/1978/1883539.003
2017-06-20 16:16:39,322 INFO CopyFiles$ Copying: Z:\I\1978\10\24\1883539.004 to: ./preindex/1978/1883539.004
2017-06-20 16:16:39,338 INFO CopyFiles$ Processing DocNum: 1704621, FileYear: 1978, FileMd: 216, Files: List(Z:\I\1978\02\16\1704621.001, Z:\I\1978\02\16\1704621.002)
2017-06-20 16:16:39,338 INFO CopyFiles$ Copying: Z:\I\1978\02\16\1704621.001 to: ./preindex/1978/1704621.001
2017-06-20 16:16:39,353 INFO CopyFiles$ Copying: Z:\I\1978\02\16\1704621.002 to: ./preindex/1978/1704621.002
2017-06-20 16:16:39,369 INFO CopyFiles$ Processing DocNum: 1689330, FileYear: 1978, FileMd: 124, Files: List(Z:\I\1978\01\24\1689330.001, Z:\I\1978\01\24\1689330.002, Z:\I\1978\01\24\1689330.003, Z:\I\1978\01\24\1689330.004)
2017-06-20 16:16:39,369 INFO CopyFiles$ Copying: Z:\I\1978\01\24\1689330.001 to: ./preindex/1978/1689330.001
2017-06-20 16:16:39,400 INFO CopyFiles$ Copying: Z:\I\1978\01\24\1689330.002 to: ./preindex/1978/1689330.002
2017-06-20 16:16:39,416 INFO CopyFiles$ Copying: Z:\I\1978\01\24\1689330.003 to: ./preindex/1978/1689330.003
2017-06-20 16:16:39,431 INFO CopyFiles$ Copying: Z:\I\1978\01\24\1689330.004 to: ./preindex/1978/1689330.004
2017-06-20 16:16:39,463 INFO CopyFiles$ Processing DocNum: 1843874, FileYear: 1978, FileMd: 830, Files: List(Z:\I\1978\08\30\1843874.001, Z:\I\1978\08\30\1843874.002, Z:\I\1978\08\30\1843874.003)
2017-06-20 16:16:39,463 INFO CopyFiles$ Copying: Z:\I\1978\08\30\1843874.001 to: ./preindex/1978/1843874.001
2017-06-20 16:16:39,494 INFO CopyFiles$ Copying: Z:\I\1978\08\30\1843874.002 to: ./preindex/1978/1843874.002
2017-06-20 16:16:39,509 INFO CopyFiles$ Copying: Z:\I\1978\08\30\1843874.003 to: ./preindex/1978/1843874.003
2017-06-20 16:16:39,525 INFO CopyFiles$ Processing DocNum: 1820777, FileYear: 1978, FileMd: 801, Files: List(Z:\I\1978\08\01\1820777.001, Z:\I\1978\08\01\1820777.002, Z:\I\1978\08\01\1820777.003, Z:\I\1978\08\01\1820777.004, Z:\I\1978\08\01\1820777.005)
2017-06-20 16:16:39,525 INFO CopyFiles$ Copying: Z:\I\1978\08\01\1820777.001 to: ./preindex/1978/1820777.001
2017-06-20 16:16:39,556 INFO CopyFiles$ Copying: Z:\I\1978\08\01\1820777.002 to: ./preindex/1978/1820777.002
2017-06-20 16:16:39,572 INFO CopyFiles$ Copying: Z:\I\1978\08\01\1820777.003 to: ./preindex/1978/1820777.003
2017-06-20 16:16:39,572 INFO CopyFiles$ Copying: Z:\I\1978\08\01\1820777.004 to: ./preindex/1978/1820777.004
2017-06-20 16:16:39,587 INFO CopyFiles$ Copying: Z:\I\1978\08\01\1820777.005 to: ./preindex/1978/1820777.005
2017-06-20 16:16:39,587 INFO CopyFiles$ Processing DocNum: 1738278, FileYear: 1978, FileMd: 407, Files: List(Z:\I\1978\04\07\1738278.001, Z:\I\1978\04\07\1738278.002, Z:\I\1978\04\07\1738278.003, Z:\I\1978\04\07\1738278.004, Z:\I\1978\04\07\1738278.005)
2017-06-20 16:16:39,587 INFO CopyFiles$ Copying: Z:\I\1978\04\07\1738278.001 to: ./preindex/1978/1738278.001
2017-06-20 16:16:39,619 INFO CopyFiles$ Copying: Z:\I\1978\04\07\1738278.002 to: ./preindex/1978/1738278.002
2017-06-20 16:16:39,634 INFO CopyFiles$ Copying: Z:\I\1978\04\07\1738278.003 to: ./preindex/1978/1738278.003
2017-06-20 16:16:39,650 INFO CopyFiles$ Copying: Z:\I\1978\04\07\1738278.004 to: ./preindex/1978/1738278.004
2017-06-20 16:16:39,665 INFO CopyFiles$ Copying: Z:\I\1978\04\07\1738278.005 to: ./preindex/1978/1738278.005
2017-06-20 16:16:39,697 INFO CopyFiles$ Processing DocNum: 1701894, FileYear: 1978, FileMd: 214, Files: List(Z:\I\1978\02\14\1701894.001, Z:\I\1978\02\14\1701894.002, Z:\I\1978\02\14\1701894.003)
2017-06-20 16:16:39,697 INFO CopyFiles$ Copying: Z:\I\1978\02\14\1701894.001 to: ./preindex/1978/1701894.001
2017-06-20 16:16:39,712 INFO CopyFiles$ Copying: Z:\I\1978\02\14\1701894.002 to: ./preindex/1978/1701894.002
2017-06-20 16:16:39,728 INFO CopyFiles$ Copying: Z:\I\1978\02\14\1701894.003 to: ./preindex/1978/1701894.003
2017-06-20 16:16:39,743 INFO CopyFiles$ Processing DocNum: 1722137, FileYear: 1978, FileMd: 315, Files: List(Z:\I\1978\03\15\1722137.001, Z:\I\1978\03\15\1722137.002, Z:\I\1978\03\15\1722137.003, Z:\I\1978\03\15\1722137.004)
2017-06-20 16:16:39,743 INFO CopyFiles$ Copying: Z:\I\1978\03\15\1722137.001 to: ./preindex/1978/1722137.001
2017-06-20 16:16:39,759 INFO CopyFiles$ Copying: Z:\I\1978\03\15\1722137.002 to: ./preindex/1978/1722137.002
2017-06-20 16:16:39,759 INFO CopyFiles$ Copying: Z:\I\1978\03\15\1722137.003 to: ./preindex/1978/1722137.003
2017-06-20 16:16:39,775 INFO CopyFiles$ Copying: Z:\I\1978\03\15\1722137.004 to: ./preindex/1978/1722137.004
2017-06-20 16:16:39,790 INFO CopyFiles$ Processing DocNum: 1699741, FileYear: 1978, FileMd: 209, Files: List(Z:\I\1978\02\09\1699741.001, Z:\I\1978\02\09\1699741.002, Z:\I\1978\02\09\1699741.003)
2017-06-20 16:16:39,790 INFO CopyFiles$ Copying: Z:\I\1978\02\09\1699741.001 to: ./preindex/1978/1699741.001
2017-06-20 16:16:39,790 INFO CopyFiles$ Copying: Z:\I\1978\02\09\1699741.002 to: ./preindex/1978/1699741.002
2017-06-20 16:16:39,806 INFO CopyFiles$ Copying: Z:\I\1978\02\09\1699741.003 to: ./preindex/1978/1699741.003
2017-06-20 16:16:39,806 INFO CopyFiles$ Processing DocNum: 1914775, FileYear: 1978, FileMd: 1211, Files: List(Z:\I\1978\12\11\1914775.001, Z:\I\1978\12\11\1914775.002, Z:\I\1978\12\11\1914775.003, Z:\I\1978\12\11\1914775.004)
2017-06-20 16:16:39,806 INFO CopyFiles$ Copying: Z:\I\1978\12\11\1914775.001 to: ./preindex/1978/1914775.001
2017-06-20 16:16:39,821 INFO CopyFiles$ Copying: Z:\I\1978\12\11\1914775.002 to: ./preindex/1978/1914775.002
2017-06-20 16:16:39,837 INFO CopyFiles$ Copying: Z:\I\1978\12\11\1914775.003 to: ./preindex/1978/1914775.003
2017-06-20 16:16:39,837 INFO CopyFiles$ Copying: Z:\I\1978\12\11\1914775.004 to: ./preindex/1978/1914775.004
2017-06-20 16:16:39,837 INFO CopyFiles$ Processing DocNum: 1677214, FileYear: 1978, FileMd: 105, Files: List(Z:\I\1978\01\05\1677214.001, Z:\I\1978\01\05\1677214.002, Z:\I\1978\01\05\1677214.003)
2017-06-20 16:16:39,837 INFO CopyFiles$ Copying: Z:\I\1978\01\05\1677214.001 to: ./preindex/1978/1677214.001
2017-06-20 16:16:39,868 INFO CopyFiles$ Copying: Z:\I\1978\01\05\1677214.002 to: ./preindex/1978/1677214.002
2017-06-20 16:16:39,884 INFO CopyFiles$ Copying: Z:\I\1978\01\05\1677214.003 to: ./preindex/1978/1677214.003
2017-06-20 16:16:39,899 INFO CopyFiles$ Processing DocNum: 1833328, FileYear: 1978, FileMd: 816, Files: List(Z:\I\1978\08\16\1833328.001, Z:\I\1978\08\16\1833328.002, Z:\I\1978\08\16\1833328.003, Z:\I\1978\08\16\1833328.004, Z:\I\1978\08\16\1833328.005)
2017-06-20 16:16:39,899 INFO CopyFiles$ Copying: Z:\I\1978\08\16\1833328.001 to: ./preindex/1978/1833328.001
2017-06-20 16:16:39,931 INFO CopyFiles$ Copying: Z:\I\1978\08\16\1833328.002 to: ./preindex/1978/1833328.002
2017-06-20 16:16:39,931 INFO CopyFiles$ Copying: Z:\I\1978\08\16\1833328.003 to: ./preindex/1978/1833328.003
2017-06-20 16:16:39,946 INFO CopyFiles$ Copying: Z:\I\1978\08\16\1833328.004 to: ./preindex/1978/1833328.004
2017-06-20 16:16:39,962 INFO CopyFiles$ Copying: Z:\I\1978\08\16\1833328.005 to: ./preindex/1978/1833328.005
2017-06-20 16:16:39,977 INFO CopyFiles$ Processing DocNum: 1675982, FileYear: 1978, FileMd: 104, Files: List(Z:\I\1978\01\04\1675982.001, Z:\I\1978\01\04\1675982.002, Z:\I\1978\01\04\1675982.003, Z:\I\1978\01\04\1675982.004)
2017-06-20 16:16:39,977 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1675982.001 to: ./preindex/1978/1675982.001
2017-06-20 16:16:39,978 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1675982.002 to: ./preindex/1978/1675982.002
2017-06-20 16:16:39,978 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1675982.003 to: ./preindex/1978/1675982.003
2017-06-20 16:16:39,979 INFO CopyFiles$ Copying: Z:\I\1978\01\04\1675982.004 to: ./preindex/1978/1675982.004
2017-06-20 16:16:40,009 INFO CopyFiles$ Processing DocNum: 1877425, FileYear: 1978, FileMd: 1016, Files: List(Z:\I\1978\10\16\1877425.001, Z:\I\1978\10\16\1877425.002, Z:\I\1978\10\16\1877425.003)
2017-06-20 16:16:40,049 INFO CopyFiles$ Copying: Z:\I\1978\10\16\1877425.001 to: ./preindex/1978/1877425.001
2017-06-20 16:16:40,059 INFO CopyFiles$ Copying: Z:\I\1978\10\16\1877425.002 to: ./preindex/1978/1877425.002
2017-06-20 16:16:40,069 INFO CopyFiles$ Copying: Z:\I\1978\10\16\1877425.003 to: ./preindex/1978/1877425.003
2017-06-20 16:16:40,085 INFO CopyFiles$ Processing DocNum: 1866566, FileYear: 1978, FileMd: 929, Files: List(Z:\I\1978\09\29\1866566.001, Z:\I\1978\09\29\1866566.002, Z:\I\1978\09\29\1866566.003)
2017-06-20 16:16:40,085 INFO CopyFiles$ Copying: Z:\I\1978\09\29\1866566.001 to: ./preindex/1978/1866566.001
2017-06-20 16:16:40,101 INFO CopyFiles$ Copying: Z:\I\1978\09\29\1866566.002 to: ./preindex/1978/1866566.002
2017-06-20 16:16:40,116 INFO CopyFiles$ Copying: Z:\I\1978\09\29\1866566.003 to: ./preindex/1978/1866566.003
2017-06-20 16:16:40,132 INFO CopyFiles$ Processing DocNum: 1790514, FileYear: 1978, FileMd: 620, Files: List(Z:\I\1978\06\20\1790514.001, Z:\I\1978\06\20\1790514.002, Z:\I\1978\06\20\1790514.003, Z:\I\1978\06\20\1790514.004)
2017-06-20 16:16:40,132 INFO CopyFiles$ Copying: Z:\I\1978\06\20\1790514.001 to: ./preindex/1978/1790514.001
2017-06-20 16:16:40,147 INFO CopyFiles$ Copying: Z:\I\1978\06\20\1790514.002 to: ./preindex/1978/1790514.002
2017-06-20 16:16:40,163 INFO CopyFiles$ Copying: Z:\I\1978\06\20\1790514.003 to: ./preindex/1978/1790514.003
2017-06-20 16:16:40,163 INFO CopyFiles$ Copying: Z:\I\1978\06\20\1790514.004 to: ./preindex/1978/1790514.004
2017-06-20 16:16:40,179 INFO CopyFiles$ Processing DocNum: 1820686, FileYear: 1978, FileMd: 801, Files: List(Z:\I\1978\08\01\1820686.001, Z:\I\1978\08\01\1820686.002, Z:\I\1978\08\01\1820686.003)
2017-06-20 16:16:40,179 INFO CopyFiles$ Copying: Z:\I\1978\08\01\1820686.001 to: ./preindex/1978/1820686.001
2017-06-20 16:16:40,194 INFO CopyFiles$ Copying: Z:\I\1978\08\01\1820686.002 to: ./preindex/1978/1820686.002
2017-06-20 16:16:40,210 INFO CopyFiles$ Copying: Z:\I\1978\08\01\1820686.003 to: ./preindex/1978/1820686.003
2017-06-20 16:16:40,225 INFO CopyFiles$ Processing DocNum: 1816042, FileYear: 1978, FileMd: 725, Files: List(Z:\I\1978\07\25\1816042.001, Z:\I\1978\07\25\1816042.002, Z:\I\1978\07\25\1816042.003)
2017-06-20 16:16:40,225 INFO CopyFiles$ Copying: Z:\I\1978\07\25\1816042.001 to: ./preindex/1978/1816042.001
2017-06-20 16:16:40,241 INFO CopyFiles$ Copying: Z:\I\1978\07\25\1816042.002 to: ./preindex/1978/1816042.002
2017-06-20 16:16:40,241 INFO CopyFiles$ Copying: Z:\I\1978\07\25\1816042.003 to: ./preindex/1978/1816042.003
2017-06-20 16:16:40,257 INFO CopyFiles$ Processing DocNum: 1705622, FileYear: 1978, FileMd: 222, Files: List(Z:\I\1978\02\22\1705622.001, Z:\I\1978\02\22\1705622.002, Z:\I\1978\02\22\1705622.003)
2017-06-20 16:16:40,257 INFO CopyFiles$ Copying: Z:\I\1978\02\22\1705622.001 to: ./preindex/1978/1705622.001
2017-06-20 16:16:40,272 INFO CopyFiles$ Copying: Z:\I\1978\02\22\1705622.002 to: ./preindex/1978/1705622.002
2017-06-20 16:16:40,272 INFO CopyFiles$ Copying: Z:\I\1978\02\22\1705622.003 to: ./preindex/1978/1705622.003
2017-06-20 16:16:40,288 INFO CopyFiles$ Processing DocNum: 1681747, FileYear: 1978, FileMd: 112, Files: List(Z:\I\1978\01\12\1681747.001, Z:\I\1978\01\12\1681747.002, Z:\I\1978\01\12\1681747.003, Z:\I\1978\01\12\1681747.004, Z:\I\1978\01\12\1681747.005, Z:\I\1978\01\12\1681747.006, Z:\I\1978\01\12\1681747.007, Z:\I\1978\01\12\1681747.008, Z:\I\1978\01\12\1681747.009, Z:\I\1978\01\12\1681747.010, Z:\I\1978\01\12\1681747.011, Z:\I\1978\01\12\1681747.012, Z:\I\1978\01\12\1681747.013, Z:\I\1978\01\12\1681747.014, Z:\I\1978\01\12\1681747.015)
2017-06-20 16:16:40,288 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681747.001 to: ./preindex/1978/1681747.001
2017-06-20 16:16:40,303 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681747.002 to: ./preindex/1978/1681747.002
2017-06-20 16:16:40,335 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681747.003 to: ./preindex/1978/1681747.003
2017-06-20 16:16:40,335 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681747.004 to: ./preindex/1978/1681747.004
2017-06-20 16:16:40,350 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681747.005 to: ./preindex/1978/1681747.005
2017-06-20 16:16:40,366 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681747.006 to: ./preindex/1978/1681747.006
2017-06-20 16:16:40,366 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681747.007 to: ./preindex/1978/1681747.007
2017-06-20 16:16:40,381 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681747.008 to: ./preindex/1978/1681747.008
2017-06-20 16:16:40,397 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681747.009 to: ./preindex/1978/1681747.009
2017-06-20 16:16:40,397 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681747.010 to: ./preindex/1978/1681747.010
2017-06-20 16:16:40,413 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681747.011 to: ./preindex/1978/1681747.011
2017-06-20 16:16:40,428 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681747.012 to: ./preindex/1978/1681747.012
2017-06-20 16:16:40,444 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681747.013 to: ./preindex/1978/1681747.013
2017-06-20 16:16:40,459 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681747.014 to: ./preindex/1978/1681747.014
2017-06-20 16:16:40,475 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681747.015 to: ./preindex/1978/1681747.015
2017-06-20 16:16:40,491 INFO CopyFiles$ Processing DocNum: 1752477, FileYear: 1978, FileMd: 428, Files: List(Z:\I\1978\04\28\1752477.001, Z:\I\1978\04\28\1752477.002, Z:\I\1978\04\28\1752477.003, Z:\I\1978\04\28\1752477.004)
2017-06-20 16:16:40,491 INFO CopyFiles$ Copying: Z:\I\1978\04\28\1752477.001 to: ./preindex/1978/1752477.001
2017-06-20 16:16:40,506 INFO CopyFiles$ Copying: Z:\I\1978\04\28\1752477.002 to: ./preindex/1978/1752477.002
2017-06-20 16:16:40,506 INFO CopyFiles$ Copying: Z:\I\1978\04\28\1752477.003 to: ./preindex/1978/1752477.003
2017-06-20 16:16:40,522 INFO CopyFiles$ Copying: Z:\I\1978\04\28\1752477.004 to: ./preindex/1978/1752477.004
2017-06-20 16:16:40,522 INFO CopyFiles$ Processing DocNum: 1873805, FileYear: 1978, FileMd: 1010, Files: List(Z:\I\1978\10\10\1873805.001, Z:\I\1978\10\10\1873805.002, Z:\I\1978\10\10\1873805.003)
2017-06-20 16:16:40,537 INFO CopyFiles$ Copying: Z:\I\1978\10\10\1873805.001 to: ./preindex/1978/1873805.001
2017-06-20 16:16:40,553 INFO CopyFiles$ Copying: Z:\I\1978\10\10\1873805.002 to: ./preindex/1978/1873805.002
2017-06-20 16:16:40,569 INFO CopyFiles$ Copying: Z:\I\1978\10\10\1873805.003 to: ./preindex/1978/1873805.003
2017-06-20 16:16:40,584 INFO CopyFiles$ Processing DocNum: 1709960, FileYear: 1978, FileMd: 227, Files: List(Z:\I\1978\02\27\1709960.001, Z:\I\1978\02\27\1709960.002, Z:\I\1978\02\27\1709960.003, Z:\I\1978\02\27\1709960.004)
2017-06-20 16:16:40,584 INFO CopyFiles$ Copying: Z:\I\1978\02\27\1709960.001 to: ./preindex/1978/1709960.001
2017-06-20 16:16:40,600 INFO CopyFiles$ Copying: Z:\I\1978\02\27\1709960.002 to: ./preindex/1978/1709960.002
2017-06-20 16:16:40,615 INFO CopyFiles$ Copying: Z:\I\1978\02\27\1709960.003 to: ./preindex/1978/1709960.003
2017-06-20 16:16:40,615 INFO CopyFiles$ Copying: Z:\I\1978\02\27\1709960.004 to: ./preindex/1978/1709960.004
2017-06-20 16:16:40,631 INFO CopyFiles$ Processing DocNum: 1907760, FileYear: 1978, FileMd: 1129, Files: List(Z:\I\1978\11\29\1907760.001, Z:\I\1978\11\29\1907760.002)
2017-06-20 16:16:40,631 INFO CopyFiles$ Copying: Z:\I\1978\11\29\1907760.001 to: ./preindex/1978/1907760.001
2017-06-20 16:16:40,647 INFO CopyFiles$ Copying: Z:\I\1978\11\29\1907760.002 to: ./preindex/1978/1907760.002
2017-06-20 16:16:40,662 INFO CopyFiles$ Processing DocNum: 1820912, FileYear: 1978, FileMd: 801, Files: List(Z:\I\1978\08\01\1820912.001, Z:\I\1978\08\01\1820912.002, Z:\I\1978\08\01\1820912.003, Z:\I\1978\08\01\1820912.004)
2017-06-20 16:16:40,662 INFO CopyFiles$ Copying: Z:\I\1978\08\01\1820912.001 to: ./preindex/1978/1820912.001
2017-06-20 16:16:40,678 INFO CopyFiles$ Copying: Z:\I\1978\08\01\1820912.002 to: ./preindex/1978/1820912.002
2017-06-20 16:16:40,693 INFO CopyFiles$ Copying: Z:\I\1978\08\01\1820912.003 to: ./preindex/1978/1820912.003
2017-06-20 16:16:40,709 INFO CopyFiles$ Copying: Z:\I\1978\08\01\1820912.004 to: ./preindex/1978/1820912.004
2017-06-20 16:16:40,725 INFO CopyFiles$ Processing DocNum: 1729957, FileYear: 1978, FileMd: 328, Files: List(Z:\I\1978\03\28\1729957.001, Z:\I\1978\03\28\1729957.002, Z:\I\1978\03\28\1729957.003)
2017-06-20 16:16:40,725 INFO CopyFiles$ Copying: Z:\I\1978\03\28\1729957.001 to: ./preindex/1978/1729957.001
2017-06-20 16:16:40,756 INFO CopyFiles$ Copying: Z:\I\1978\03\28\1729957.002 to: ./preindex/1978/1729957.002
2017-06-20 16:16:40,756 INFO CopyFiles$ Copying: Z:\I\1978\03\28\1729957.003 to: ./preindex/1978/1729957.003
2017-06-20 16:16:40,771 INFO CopyFiles$ Processing DocNum: 1785999, FileYear: 1978, FileMd: 614, Files: List(Z:\I\1978\06\14\1785999.001, Z:\I\1978\06\14\1785999.002, Z:\I\1978\06\14\1785999.003)
2017-06-20 16:16:40,771 INFO CopyFiles$ Copying: Z:\I\1978\06\14\1785999.001 to: ./preindex/1978/1785999.001
2017-06-20 16:16:40,803 INFO CopyFiles$ Copying: Z:\I\1978\06\14\1785999.002 to: ./preindex/1978/1785999.002
2017-06-20 16:16:40,818 INFO CopyFiles$ Copying: Z:\I\1978\06\14\1785999.003 to: ./preindex/1978/1785999.003
2017-06-20 16:16:40,849 INFO CopyFiles$ Processing DocNum: 1726380, FileYear: 1978, FileMd: 322, Files: List(Z:\I\1978\03\22\1726380.001, Z:\I\1978\03\22\1726380.002)
2017-06-20 16:16:40,849 INFO CopyFiles$ Copying: Z:\I\1978\03\22\1726380.001 to: ./preindex/1978/1726380.001
2017-06-20 16:16:40,865 INFO CopyFiles$ Copying: Z:\I\1978\03\22\1726380.002 to: ./preindex/1978/1726380.002
2017-06-20 16:16:40,865 INFO CopyFiles$ Processing DocNum: 1744853, FileYear: 1978, FileMd: 418, Files: List(Z:\I\1978\04\18\1744853.001, Z:\I\1978\04\18\1744853.002, Z:\I\1978\04\18\1744853.003)
2017-06-20 16:16:40,865 INFO CopyFiles$ Copying: Z:\I\1978\04\18\1744853.001 to: ./preindex/1978/1744853.001
2017-06-20 16:16:40,896 INFO CopyFiles$ Copying: Z:\I\1978\04\18\1744853.002 to: ./preindex/1978/1744853.002
2017-06-20 16:16:40,896 INFO CopyFiles$ Copying: Z:\I\1978\04\18\1744853.003 to: ./preindex/1978/1744853.003
2017-06-20 16:16:40,896 INFO CopyFiles$ Processing DocNum: 1817764, FileYear: 1978, FileMd: 727, Files: List(Z:\I\1978\07\27\1817764.001, Z:\I\1978\07\27\1817764.002, Z:\I\1978\07\27\1817764.003)
2017-06-20 16:16:40,912 INFO CopyFiles$ Copying: Z:\I\1978\07\27\1817764.001 to: ./preindex/1978/1817764.001
2017-06-20 16:16:40,927 INFO CopyFiles$ Copying: Z:\I\1978\07\27\1817764.002 to: ./preindex/1978/1817764.002
2017-06-20 16:16:40,943 INFO CopyFiles$ Copying: Z:\I\1978\07\27\1817764.003 to: ./preindex/1978/1817764.003
2017-06-20 16:16:40,959 INFO CopyFiles$ Processing DocNum: 1886238, FileYear: 1978, FileMd: 1027, Files: List(Z:\I\1978\10\27\1886238.001, Z:\I\1978\10\27\1886238.002)
2017-06-20 16:16:40,959 INFO CopyFiles$ Copying: Z:\I\1978\10\27\1886238.001 to: ./preindex/1978/1886238.001
2017-06-20 16:16:40,959 INFO CopyFiles$ Copying: Z:\I\1978\10\27\1886238.002 to: ./preindex/1978/1886238.002
2017-06-20 16:16:40,974 INFO CopyFiles$ Processing DocNum: 1722373, FileYear: 1978, FileMd: 315, Files: List(Z:\I\1978\03\15\1722373.001, Z:\I\1978\03\15\1722373.002, Z:\I\1978\03\15\1722373.003, Z:\I\1978\03\15\1722373.004)
2017-06-20 16:16:40,974 INFO CopyFiles$ Copying: Z:\I\1978\03\15\1722373.001 to: ./preindex/1978/1722373.001
2017-06-20 16:16:40,990 INFO CopyFiles$ Copying: Z:\I\1978\03\15\1722373.002 to: ./preindex/1978/1722373.002
2017-06-20 16:16:40,990 INFO CopyFiles$ Copying: Z:\I\1978\03\15\1722373.003 to: ./preindex/1978/1722373.003
2017-06-20 16:16:41,005 INFO CopyFiles$ Copying: Z:\I\1978\03\15\1722373.004 to: ./preindex/1978/1722373.004
2017-06-20 16:16:41,021 INFO CopyFiles$ Processing DocNum: 1824837, FileYear: 1978, FileMd: 804, Files: List(Z:\I\1978\08\04\1824837.001, Z:\I\1978\08\04\1824837.002, Z:\I\1978\08\04\1824837.003, Z:\I\1978\08\04\1824837.004, Z:\I\1978\08\04\1824837.005, Z:\I\1978\08\04\1824837.006, Z:\I\1978\08\04\1824837.007)
2017-06-20 16:16:41,021 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1824837.001 to: ./preindex/1978/1824837.001
2017-06-20 16:16:41,021 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1824837.002 to: ./preindex/1978/1824837.002
2017-06-20 16:16:41,037 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1824837.003 to: ./preindex/1978/1824837.003
2017-06-20 16:16:41,037 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1824837.004 to: ./preindex/1978/1824837.004
2017-06-20 16:16:41,052 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1824837.005 to: ./preindex/1978/1824837.005
2017-06-20 16:16:41,052 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1824837.006 to: ./preindex/1978/1824837.006
2017-06-20 16:16:41,052 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1824837.007 to: ./preindex/1978/1824837.007
2017-06-20 16:16:41,068 INFO CopyFiles$ Processing DocNum: 1907753, FileYear: 1978, FileMd: 1129, Files: List(Z:\I\1978\11\29\1907753.001, Z:\I\1978\11\29\1907753.002, Z:\I\1978\11\29\1907753.003)
2017-06-20 16:16:41,068 INFO CopyFiles$ Copying: Z:\I\1978\11\29\1907753.001 to: ./preindex/1978/1907753.001
2017-06-20 16:16:41,083 INFO CopyFiles$ Copying: Z:\I\1978\11\29\1907753.002 to: ./preindex/1978/1907753.002
2017-06-20 16:16:41,083 INFO CopyFiles$ Copying: Z:\I\1978\11\29\1907753.003 to: ./preindex/1978/1907753.003
2017-06-20 16:16:41,099 INFO CopyFiles$ Processing DocNum: 1920952, FileYear: 1978, FileMd: 1219, Files: List(Z:\I\1978\12\19\1920952.001, Z:\I\1978\12\19\1920952.002, Z:\I\1978\12\19\1920952.003, Z:\I\1978\12\19\1920952.004, Z:\I\1978\12\19\1920952.005, Z:\I\1978\12\19\1920952.006, Z:\I\1978\12\19\1920952.007, Z:\I\1978\12\19\1920952.008, Z:\I\1978\12\19\1920952.009)
2017-06-20 16:16:41,099 INFO CopyFiles$ Copying: Z:\I\1978\12\19\1920952.001 to: ./preindex/1978/1920952.001
2017-06-20 16:16:41,099 INFO CopyFiles$ Copying: Z:\I\1978\12\19\1920952.002 to: ./preindex/1978/1920952.002
2017-06-20 16:16:41,115 INFO CopyFiles$ Copying: Z:\I\1978\12\19\1920952.003 to: ./preindex/1978/1920952.003
2017-06-20 16:16:41,115 INFO CopyFiles$ Copying: Z:\I\1978\12\19\1920952.004 to: ./preindex/1978/1920952.004
2017-06-20 16:16:41,115 INFO CopyFiles$ Copying: Z:\I\1978\12\19\1920952.005 to: ./preindex/1978/1920952.005
2017-06-20 16:16:41,130 INFO CopyFiles$ Copying: Z:\I\1978\12\19\1920952.006 to: ./preindex/1978/1920952.006
2017-06-20 16:16:41,130 INFO CopyFiles$ Copying: Z:\I\1978\12\19\1920952.007 to: ./preindex/1978/1920952.007
2017-06-20 16:16:41,146 INFO CopyFiles$ Copying: Z:\I\1978\12\19\1920952.008 to: ./preindex/1978/1920952.008
2017-06-20 16:16:41,146 INFO CopyFiles$ Copying: Z:\I\1978\12\19\1920952.009 to: ./preindex/1978/1920952.009
2017-06-20 16:16:41,161 INFO CopyFiles$ Processing DocNum: 1809181, FileYear: 1978, FileMd: 717, Files: List(Z:\I\1978\07\17\1809181.001, Z:\I\1978\07\17\1809181.002, Z:\I\1978\07\17\1809181.003, Z:\I\1978\07\17\1809181.004)
2017-06-20 16:16:41,161 INFO CopyFiles$ Copying: Z:\I\1978\07\17\1809181.001 to: ./preindex/1978/1809181.001
2017-06-20 16:16:41,177 INFO CopyFiles$ Copying: Z:\I\1978\07\17\1809181.002 to: ./preindex/1978/1809181.002
2017-06-20 16:16:41,193 INFO CopyFiles$ Copying: Z:\I\1978\07\17\1809181.003 to: ./preindex/1978/1809181.003
2017-06-20 16:16:41,193 INFO CopyFiles$ Copying: Z:\I\1978\07\17\1809181.004 to: ./preindex/1978/1809181.004
2017-06-20 16:16:41,193 INFO CopyFiles$ Processing DocNum: 1749291, FileYear: 1978, FileMd: 425, Files: List(Z:\I\1978\04\25\1749291.001, Z:\I\1978\04\25\1749291.002)
2017-06-20 16:16:41,208 INFO CopyFiles$ Copying: Z:\I\1978\04\25\1749291.001 to: ./preindex/1978/1749291.001
2017-06-20 16:16:41,208 INFO CopyFiles$ Copying: Z:\I\1978\04\25\1749291.002 to: ./preindex/1978/1749291.002
2017-06-20 16:16:41,224 INFO CopyFiles$ Processing DocNum: 1761613, FileYear: 1978, FileMd: 510, Files: List(Z:\I\1978\05\10\1761613.001, Z:\I\1978\05\10\1761613.002, Z:\I\1978\05\10\1761613.003)
2017-06-20 16:16:41,224 INFO CopyFiles$ Copying: Z:\I\1978\05\10\1761613.001 to: ./preindex/1978/1761613.001
2017-06-20 16:16:41,255 INFO CopyFiles$ Copying: Z:\I\1978\05\10\1761613.002 to: ./preindex/1978/1761613.002
2017-06-20 16:16:41,255 INFO CopyFiles$ Copying: Z:\I\1978\05\10\1761613.003 to: ./preindex/1978/1761613.003
2017-06-20 16:16:41,286 INFO CopyFiles$ Processing DocNum: 1742506, FileYear: 1978, FileMd: 413, Files: List(Z:\I\1978\04\13\1742506.001, Z:\I\1978\04\13\1742506.002, Z:\I\1978\04\13\1742506.003, Z:\I\1978\04\13\1742506.004)
2017-06-20 16:16:41,286 INFO CopyFiles$ Copying: Z:\I\1978\04\13\1742506.001 to: ./preindex/1978/1742506.001
2017-06-20 16:16:41,302 INFO CopyFiles$ Copying: Z:\I\1978\04\13\1742506.002 to: ./preindex/1978/1742506.002
2017-06-20 16:16:41,317 INFO CopyFiles$ Copying: Z:\I\1978\04\13\1742506.003 to: ./preindex/1978/1742506.003
2017-06-20 16:16:41,333 INFO CopyFiles$ Copying: Z:\I\1978\04\13\1742506.004 to: ./preindex/1978/1742506.004
2017-06-20 16:16:41,349 INFO CopyFiles$ Processing DocNum: 1926819, FileYear: 1978, FileMd: 1229, Files: List(Z:\I\1978\12\29\1926819.001, Z:\I\1978\12\29\1926819.002)
2017-06-20 16:16:41,349 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1926819.001 to: ./preindex/1978/1926819.001
2017-06-20 16:16:41,380 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1926819.002 to: ./preindex/1978/1926819.002
2017-06-20 16:16:41,380 INFO CopyFiles$ Processing DocNum: 1887160, FileYear: 1978, FileMd: 1030, Files: List(Z:\I\1978\10\30\1887160.001, Z:\I\1978\10\30\1887160.002)
2017-06-20 16:16:41,380 INFO CopyFiles$ Copying: Z:\I\1978\10\30\1887160.001 to: ./preindex/1978/1887160.001
2017-06-20 16:16:41,395 INFO CopyFiles$ Copying: Z:\I\1978\10\30\1887160.002 to: ./preindex/1978/1887160.002
2017-06-20 16:16:41,411 INFO CopyFiles$ Processing DocNum: 1686328, FileYear: 1978, FileMd: 119, Files: List(Z:\I\1978\01\19\1686328.001, Z:\I\1978\01\19\1686328.002)
2017-06-20 16:16:41,411 INFO CopyFiles$ Copying: Z:\I\1978\01\19\1686328.001 to: ./preindex/1978/1686328.001
2017-06-20 16:16:41,427 INFO CopyFiles$ Copying: Z:\I\1978\01\19\1686328.002 to: ./preindex/1978/1686328.002
2017-06-20 16:16:41,458 INFO CopyFiles$ Processing DocNum: 1898859, FileYear: 1978, FileMd: 1115, Files: List(Z:\I\1978\11\15\1898859.001, Z:\I\1978\11\15\1898859.002, Z:\I\1978\11\15\1898859.003, Z:\I\1978\11\15\1898859.004, Z:\I\1978\11\15\1898859.005)
2017-06-20 16:16:41,458 INFO CopyFiles$ Copying: Z:\I\1978\11\15\1898859.001 to: ./preindex/1978/1898859.001
2017-06-20 16:16:41,458 INFO CopyFiles$ Copying: Z:\I\1978\11\15\1898859.002 to: ./preindex/1978/1898859.002
2017-06-20 16:16:41,473 INFO CopyFiles$ Copying: Z:\I\1978\11\15\1898859.003 to: ./preindex/1978/1898859.003
2017-06-20 16:16:41,473 INFO CopyFiles$ Copying: Z:\I\1978\11\15\1898859.004 to: ./preindex/1978/1898859.004
2017-06-20 16:16:41,489 INFO CopyFiles$ Copying: Z:\I\1978\11\15\1898859.005 to: ./preindex/1978/1898859.005
2017-06-20 16:16:41,489 INFO CopyFiles$ Processing DocNum: 1811888, FileYear: 1978, FileMd: 719, Files: List(Z:\I\1978\07\19\1811888.001, Z:\I\1978\07\19\1811888.002)
2017-06-20 16:16:41,489 INFO CopyFiles$ Copying: Z:\I\1978\07\19\1811888.001 to: ./preindex/1978/1811888.001
2017-06-20 16:16:41,505 INFO CopyFiles$ Copying: Z:\I\1978\07\19\1811888.002 to: ./preindex/1978/1811888.002
2017-06-20 16:16:41,520 INFO CopyFiles$ Processing DocNum: 1788539, FileYear: 1978, FileMd: 616, Files: List(Z:\I\1978\06\16\1788539.001, Z:\I\1978\06\16\1788539.002, Z:\I\1978\06\16\1788539.003)
2017-06-20 16:16:41,520 INFO CopyFiles$ Copying: Z:\I\1978\06\16\1788539.001 to: ./preindex/1978/1788539.001
2017-06-20 16:16:41,536 INFO CopyFiles$ Copying: Z:\I\1978\06\16\1788539.002 to: ./preindex/1978/1788539.002
2017-06-20 16:16:41,551 INFO CopyFiles$ Copying: Z:\I\1978\06\16\1788539.003 to: ./preindex/1978/1788539.003
2017-06-20 16:16:41,583 INFO CopyFiles$ Processing DocNum: 1761556, FileYear: 1978, FileMd: 510, Files: List(Z:\I\1978\05\10\1761556.001, Z:\I\1978\05\10\1761556.002, Z:\I\1978\05\10\1761556.003)
2017-06-20 16:16:41,583 INFO CopyFiles$ Copying: Z:\I\1978\05\10\1761556.001 to: ./preindex/1978/1761556.001
2017-06-20 16:16:41,598 INFO CopyFiles$ Copying: Z:\I\1978\05\10\1761556.002 to: ./preindex/1978/1761556.002
2017-06-20 16:16:41,614 INFO CopyFiles$ Copying: Z:\I\1978\05\10\1761556.003 to: ./preindex/1978/1761556.003
2017-06-20 16:16:41,629 INFO CopyFiles$ Processing DocNum: 1690039, FileYear: 1978, FileMd: 125, Files: List(Z:\I\1978\01\25\1690039.001, Z:\I\1978\01\25\1690039.002, Z:\I\1978\01\25\1690039.003, Z:\I\1978\01\25\1690039.004, Z:\I\1978\01\25\1690039.005, Z:\I\1978\01\25\1690039.006)
2017-06-20 16:16:41,629 INFO CopyFiles$ Copying: Z:\I\1978\01\25\1690039.001 to: ./preindex/1978/1690039.001
2017-06-20 16:16:41,645 INFO CopyFiles$ Copying: Z:\I\1978\01\25\1690039.002 to: ./preindex/1978/1690039.002
2017-06-20 16:16:41,661 INFO CopyFiles$ Copying: Z:\I\1978\01\25\1690039.003 to: ./preindex/1978/1690039.003
2017-06-20 16:16:41,676 INFO CopyFiles$ Copying: Z:\I\1978\01\25\1690039.004 to: ./preindex/1978/1690039.004
2017-06-20 16:16:41,692 INFO CopyFiles$ Copying: Z:\I\1978\01\25\1690039.005 to: ./preindex/1978/1690039.005
2017-06-20 16:16:41,723 INFO CopyFiles$ Copying: Z:\I\1978\01\25\1690039.006 to: ./preindex/1978/1690039.006
2017-06-20 16:16:41,739 INFO CopyFiles$ Processing DocNum: 1730609, FileYear: 1978, FileMd: 329, Files: List(Z:\I\1978\03\29\1730609.001, Z:\I\1978\03\29\1730609.002, Z:\I\1978\03\29\1730609.003, Z:\I\1978\03\29\1730609.004, Z:\I\1978\03\29\1730609.005, Z:\I\1978\03\29\1730609.006)
2017-06-20 16:16:41,739 INFO CopyFiles$ Copying: Z:\I\1978\03\29\1730609.001 to: ./preindex/1978/1730609.001
2017-06-20 16:16:41,739 INFO CopyFiles$ Copying: Z:\I\1978\03\29\1730609.002 to: ./preindex/1978/1730609.002
2017-06-20 16:16:41,754 INFO CopyFiles$ Copying: Z:\I\1978\03\29\1730609.003 to: ./preindex/1978/1730609.003
2017-06-20 16:16:41,754 INFO CopyFiles$ Copying: Z:\I\1978\03\29\1730609.004 to: ./preindex/1978/1730609.004
2017-06-20 16:16:41,754 INFO CopyFiles$ Copying: Z:\I\1978\03\29\1730609.005 to: ./preindex/1978/1730609.005
2017-06-20 16:16:41,770 INFO CopyFiles$ Copying: Z:\I\1978\03\29\1730609.006 to: ./preindex/1978/1730609.006
2017-06-20 16:16:41,770 INFO CopyFiles$ Processing DocNum: 1685495, FileYear: 1978, FileMd: 118, Files: List(Z:\I\1978\01\18\1685495.001, Z:\I\1978\01\18\1685495.002, Z:\I\1978\01\18\1685495.003)
2017-06-20 16:16:41,770 INFO CopyFiles$ Copying: Z:\I\1978\01\18\1685495.001 to: ./preindex/1978/1685495.001
2017-06-20 16:16:41,801 INFO CopyFiles$ Copying: Z:\I\1978\01\18\1685495.002 to: ./preindex/1978/1685495.002
2017-06-20 16:16:41,817 INFO CopyFiles$ Copying: Z:\I\1978\01\18\1685495.003 to: ./preindex/1978/1685495.003
2017-06-20 16:16:41,832 INFO CopyFiles$ Processing DocNum: 1763273, FileYear: 1978, FileMd: 511, Files: List(Z:\I\1978\05\11\1763273.001, Z:\I\1978\05\11\1763273.002)
2017-06-20 16:16:41,832 INFO CopyFiles$ Copying: Z:\I\1978\05\11\1763273.001 to: ./preindex/1978/1763273.001
2017-06-20 16:16:41,863 INFO CopyFiles$ Copying: Z:\I\1978\05\11\1763273.002 to: ./preindex/1978/1763273.002
2017-06-20 16:16:41,879 INFO CopyFiles$ Processing DocNum: 1678339, FileYear: 1978, FileMd: 106, Files: List(Z:\I\1978\01\06\1678339.001, Z:\I\1978\01\06\1678339.002, Z:\I\1978\01\06\1678339.003, Z:\I\1978\01\06\1678339.004)
2017-06-20 16:16:41,879 INFO CopyFiles$ Copying: Z:\I\1978\01\06\1678339.001 to: ./preindex/1978/1678339.001
2017-06-20 16:16:41,910 INFO CopyFiles$ Copying: Z:\I\1978\01\06\1678339.002 to: ./preindex/1978/1678339.002
2017-06-20 16:16:41,926 INFO CopyFiles$ Copying: Z:\I\1978\01\06\1678339.003 to: ./preindex/1978/1678339.003
2017-06-20 16:16:41,957 INFO CopyFiles$ Copying: Z:\I\1978\01\06\1678339.004 to: ./preindex/1978/1678339.004
2017-06-20 16:16:41,973 INFO CopyFiles$ Processing DocNum: 1907910, FileYear: 1978, FileMd: 1129, Files: List(Z:\I\1978\11\29\1907910.001, Z:\I\1978\11\29\1907910.002)
2017-06-20 16:16:41,973 INFO CopyFiles$ Copying: Z:\I\1978\11\29\1907910.001 to: ./preindex/1978/1907910.001
2017-06-20 16:16:41,973 INFO CopyFiles$ Copying: Z:\I\1978\11\29\1907910.002 to: ./preindex/1978/1907910.002
2017-06-20 16:16:41,988 INFO CopyFiles$ Processing DocNum: 1789088, FileYear: 1978, FileMd: 619, Files: List(Z:\I\1978\06\19\1789088.001, Z:\I\1978\06\19\1789088.002, Z:\I\1978\06\19\1789088.003, Z:\I\1978\06\19\1789088.004)
2017-06-20 16:16:41,988 INFO CopyFiles$ Copying: Z:\I\1978\06\19\1789088.001 to: ./preindex/1978/1789088.001
2017-06-20 16:16:42,004 INFO CopyFiles$ Copying: Z:\I\1978\06\19\1789088.002 to: ./preindex/1978/1789088.002
2017-06-20 16:16:42,035 INFO CopyFiles$ Copying: Z:\I\1978\06\19\1789088.003 to: ./preindex/1978/1789088.003
2017-06-20 16:16:42,035 INFO CopyFiles$ Copying: Z:\I\1978\06\19\1789088.004 to: ./preindex/1978/1789088.004
2017-06-20 16:16:42,066 INFO CopyFiles$ Processing DocNum: 1779955, FileYear: 1978, FileMd: 607, Files: List(Z:\I\1978\06\07\1779955.001, Z:\I\1978\06\07\1779955.002, Z:\I\1978\06\07\1779955.003, Z:\I\1978\06\07\1779955.004, Z:\I\1978\06\07\1779955.005)
2017-06-20 16:16:42,066 INFO CopyFiles$ Copying: Z:\I\1978\06\07\1779955.001 to: ./preindex/1978/1779955.001
2017-06-20 16:16:42,082 INFO CopyFiles$ Copying: Z:\I\1978\06\07\1779955.002 to: ./preindex/1978/1779955.002
2017-06-20 16:16:42,113 INFO CopyFiles$ Copying: Z:\I\1978\06\07\1779955.003 to: ./preindex/1978/1779955.003
2017-06-20 16:16:42,113 INFO CopyFiles$ Copying: Z:\I\1978\06\07\1779955.004 to: ./preindex/1978/1779955.004
2017-06-20 16:16:42,144 INFO CopyFiles$ Copying: Z:\I\1978\06\07\1779955.005 to: ./preindex/1978/1779955.005
2017-06-20 16:16:42,160 INFO CopyFiles$ Processing DocNum: 1740464, FileYear: 1978, FileMd: 411, Files: List(Z:\I\1978\04\11\1740464.001, Z:\I\1978\04\11\1740464.002, Z:\I\1978\04\11\1740464.003, Z:\I\1978\04\11\1740464.004)
2017-06-20 16:16:42,160 INFO CopyFiles$ Copying: Z:\I\1978\04\11\1740464.001 to: ./preindex/1978/1740464.001
2017-06-20 16:16:42,175 INFO CopyFiles$ Copying: Z:\I\1978\04\11\1740464.002 to: ./preindex/1978/1740464.002
2017-06-20 16:16:42,191 INFO CopyFiles$ Copying: Z:\I\1978\04\11\1740464.003 to: ./preindex/1978/1740464.003
2017-06-20 16:16:42,207 INFO CopyFiles$ Copying: Z:\I\1978\04\11\1740464.004 to: ./preindex/1978/1740464.004
2017-06-20 16:16:42,207 INFO CopyFiles$ Processing DocNum: 1887138, FileYear: 1978, FileMd: 1030, Files: List(Z:\I\1978\10\30\1887138.001, Z:\I\1978\10\30\1887138.002, Z:\I\1978\10\30\1887138.003)
2017-06-20 16:16:42,207 INFO CopyFiles$ Copying: Z:\I\1978\10\30\1887138.001 to: ./preindex/1978/1887138.001
2017-06-20 16:16:42,222 INFO CopyFiles$ Copying: Z:\I\1978\10\30\1887138.002 to: ./preindex/1978/1887138.002
2017-06-20 16:16:42,238 INFO CopyFiles$ Copying: Z:\I\1978\10\30\1887138.003 to: ./preindex/1978/1887138.003
2017-06-20 16:16:42,238 INFO CopyFiles$ Processing DocNum: 1718661, FileYear: 1978, FileMd: 310, Files: List(Z:\I\1978\03\10\1718661.001, Z:\I\1978\03\10\1718661.002)
2017-06-20 16:16:42,238 INFO CopyFiles$ Copying: Z:\I\1978\03\10\1718661.001 to: ./preindex/1978/1718661.001
2017-06-20 16:16:42,253 INFO CopyFiles$ Copying: Z:\I\1978\03\10\1718661.002 to: ./preindex/1978/1718661.002
2017-06-20 16:16:42,269 INFO CopyFiles$ Processing DocNum: 1856031, FileYear: 1978, FileMd: 915, Files: List(Z:\I\1978\09\15\1856031.001, Z:\I\1978\09\15\1856031.002, Z:\I\1978\09\15\1856031.003, Z:\I\1978\09\15\1856031.004, Z:\I\1978\09\15\1856031.005)
2017-06-20 16:16:42,269 INFO CopyFiles$ Copying: Z:\I\1978\09\15\1856031.001 to: ./preindex/1978/1856031.001
2017-06-20 16:16:42,285 INFO CopyFiles$ Copying: Z:\I\1978\09\15\1856031.002 to: ./preindex/1978/1856031.002
2017-06-20 16:16:42,300 INFO CopyFiles$ Copying: Z:\I\1978\09\15\1856031.003 to: ./preindex/1978/1856031.003
2017-06-20 16:16:42,316 INFO CopyFiles$ Copying: Z:\I\1978\09\15\1856031.004 to: ./preindex/1978/1856031.004
2017-06-20 16:16:42,331 INFO CopyFiles$ Copying: Z:\I\1978\09\15\1856031.005 to: ./preindex/1978/1856031.005
2017-06-20 16:16:42,331 INFO CopyFiles$ Processing DocNum: 1817548, FileYear: 1978, FileMd: 727, Files: List(Z:\I\1978\07\27\1817548.001, Z:\I\1978\07\27\1817548.002)
2017-06-20 16:16:42,331 INFO CopyFiles$ Copying: Z:\I\1978\07\27\1817548.001 to: ./preindex/1978/1817548.001
2017-06-20 16:16:42,363 INFO CopyFiles$ Copying: Z:\I\1978\07\27\1817548.002 to: ./preindex/1978/1817548.002
2017-06-20 16:16:42,363 INFO CopyFiles$ Processing DocNum: 1792509, FileYear: 1978, FileMd: 622, Files: List(Z:\I\1978\06\22\1792509.001, Z:\I\1978\06\22\1792509.002, Z:\I\1978\06\22\1792509.003, Z:\I\1978\06\22\1792509.004)
2017-06-20 16:16:42,363 INFO CopyFiles$ Copying: Z:\I\1978\06\22\1792509.001 to: ./preindex/1978/1792509.001
2017-06-20 16:16:42,378 INFO CopyFiles$ Copying: Z:\I\1978\06\22\1792509.002 to: ./preindex/1978/1792509.002
2017-06-20 16:16:42,378 INFO CopyFiles$ Copying: Z:\I\1978\06\22\1792509.003 to: ./preindex/1978/1792509.003
2017-06-20 16:16:42,394 INFO CopyFiles$ Copying: Z:\I\1978\06\22\1792509.004 to: ./preindex/1978/1792509.004
2017-06-20 16:16:42,394 INFO CopyFiles$ Processing DocNum: 1746198, FileYear: 1978, FileMd: 419, Files: List(Z:\I\1978\04\19\1746198.001, Z:\I\1978\04\19\1746198.002, Z:\I\1978\04\19\1746198.003)
2017-06-20 16:16:42,409 INFO CopyFiles$ Copying: Z:\I\1978\04\19\1746198.001 to: ./preindex/1978/1746198.001
2017-06-20 16:16:42,409 INFO CopyFiles$ Copying: Z:\I\1978\04\19\1746198.002 to: ./preindex/1978/1746198.002
2017-06-20 16:16:42,425 INFO CopyFiles$ Copying: Z:\I\1978\04\19\1746198.003 to: ./preindex/1978/1746198.003
2017-06-20 16:16:42,441 INFO CopyFiles$ Processing DocNum: 1681536, FileYear: 1978, FileMd: 111, Files: List(Z:\I\1978\01\11\1681536.001, Z:\I\1978\01\11\1681536.002, Z:\I\1978\01\11\1681536.003, Z:\I\1978\01\11\1681536.004)
2017-06-20 16:16:42,441 INFO CopyFiles$ Copying: Z:\I\1978\01\11\1681536.001 to: ./preindex/1978/1681536.001
2017-06-20 16:16:42,456 INFO CopyFiles$ Copying: Z:\I\1978\01\11\1681536.002 to: ./preindex/1978/1681536.002
2017-06-20 16:16:42,472 INFO CopyFiles$ Copying: Z:\I\1978\01\11\1681536.003 to: ./preindex/1978/1681536.003
2017-06-20 16:16:42,487 INFO CopyFiles$ Copying: Z:\I\1978\01\11\1681536.004 to: ./preindex/1978/1681536.004
2017-06-20 16:16:42,519 INFO CopyFiles$ Processing DocNum: 1774636, FileYear: 1978, FileMd: 511, Files: List(Z:\I\1978\05\11\1774636.001, Z:\I\1978\05\11\1774636.002, Z:\I\1978\05\11\1774636.003, Z:\I\1978\05\11\1774636.004, Z:\I\1978\05\11\1774636.005, Z:\I\1978\05\11\1774636.006, Z:\I\1978\05\11\1774636.007)
2017-06-20 16:16:42,519 INFO CopyFiles$ Copying: Z:\I\1978\05\11\1774636.001 to: ./preindex/1978/1774636.001
2017-06-20 16:16:42,534 INFO CopyFiles$ Copying: Z:\I\1978\05\11\1774636.002 to: ./preindex/1978/1774636.002
2017-06-20 16:16:42,550 INFO CopyFiles$ Copying: Z:\I\1978\05\11\1774636.003 to: ./preindex/1978/1774636.003
2017-06-20 16:16:42,550 INFO CopyFiles$ Copying: Z:\I\1978\05\11\1774636.004 to: ./preindex/1978/1774636.004
2017-06-20 16:16:42,565 INFO CopyFiles$ Copying: Z:\I\1978\05\11\1774636.005 to: ./preindex/1978/1774636.005
2017-06-20 16:16:42,581 INFO CopyFiles$ Copying: Z:\I\1978\05\11\1774636.006 to: ./preindex/1978/1774636.006
2017-06-20 16:16:42,581 INFO CopyFiles$ Copying: Z:\I\1978\05\11\1774636.007 to: ./preindex/1978/1774636.007
2017-06-20 16:16:42,597 INFO CopyFiles$ Processing DocNum: 1708248, FileYear: 1978, FileMd: 223, Files: List(Z:\I\1978\02\23\1708248.001, Z:\I\1978\02\23\1708248.002, Z:\I\1978\02\23\1708248.003, Z:\I\1978\02\23\1708248.004)
2017-06-20 16:16:42,597 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1708248.001 to: ./preindex/1978/1708248.001
2017-06-20 16:16:42,612 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1708248.002 to: ./preindex/1978/1708248.002
2017-06-20 16:16:42,628 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1708248.003 to: ./preindex/1978/1708248.003
2017-06-20 16:16:42,628 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1708248.004 to: ./preindex/1978/1708248.004
2017-06-20 16:16:42,659 INFO CopyFiles$ Processing DocNum: 1813028, FileYear: 1978, FileMd: 720, Files: List(Z:\I\1978\07\20\1813028.001, Z:\I\1978\07\20\1813028.002)
2017-06-20 16:16:42,659 INFO CopyFiles$ Copying: Z:\I\1978\07\20\1813028.001 to: ./preindex/1978/1813028.001
2017-06-20 16:16:42,659 INFO CopyFiles$ Copying: Z:\I\1978\07\20\1813028.002 to: ./preindex/1978/1813028.002
2017-06-20 16:16:42,675 INFO CopyFiles$ Processing DocNum: 1866622, FileYear: 1978, FileMd: 929, Files: List(Z:\I\1978\09\29\1866622.001, Z:\I\1978\09\29\1866622.002, Z:\I\1978\09\29\1866622.003, Z:\I\1978\09\29\1866622.004, Z:\I\1978\09\29\1866622.005, Z:\I\1978\09\29\1866622.006)
2017-06-20 16:16:42,675 INFO CopyFiles$ Copying: Z:\I\1978\09\29\1866622.001 to: ./preindex/1978/1866622.001
2017-06-20 16:16:42,690 INFO CopyFiles$ Copying: Z:\I\1978\09\29\1866622.002 to: ./preindex/1978/1866622.002
2017-06-20 16:16:42,706 INFO CopyFiles$ Copying: Z:\I\1978\09\29\1866622.003 to: ./preindex/1978/1866622.003
2017-06-20 16:16:42,737 INFO CopyFiles$ Copying: Z:\I\1978\09\29\1866622.004 to: ./preindex/1978/1866622.004
2017-06-20 16:16:42,753 INFO CopyFiles$ Copying: Z:\I\1978\09\29\1866622.005 to: ./preindex/1978/1866622.005
2017-06-20 16:16:42,768 INFO CopyFiles$ Copying: Z:\I\1978\09\29\1866622.006 to: ./preindex/1978/1866622.006
2017-06-20 16:16:42,768 INFO CopyFiles$ Processing DocNum: 1825033, FileYear: 1978, FileMd: 804, Files: List(Z:\I\1978\08\04\1825033.001, Z:\I\1978\08\04\1825033.002, Z:\I\1978\08\04\1825033.003, Z:\I\1978\08\04\1825033.004, Z:\I\1978\08\04\1825033.005, Z:\I\1978\08\04\1825033.006)
2017-06-20 16:16:42,768 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825033.001 to: ./preindex/1978/1825033.001
2017-06-20 16:16:42,784 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825033.002 to: ./preindex/1978/1825033.002
2017-06-20 16:16:42,784 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825033.003 to: ./preindex/1978/1825033.003
2017-06-20 16:16:42,799 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825033.004 to: ./preindex/1978/1825033.004
2017-06-20 16:16:42,799 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825033.005 to: ./preindex/1978/1825033.005
2017-06-20 16:16:42,799 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825033.006 to: ./preindex/1978/1825033.006
2017-06-20 16:16:42,815 INFO CopyFiles$ Processing DocNum: 1896410, FileYear: 1978, FileMd: 1110, Files: List(Z:\I\1978\11\10\1896410.001, Z:\I\1978\11\10\1896410.002, Z:\I\1978\11\10\1896410.003, Z:\I\1978\11\10\1896410.004, Z:\I\1978\11\10\1896410.005, Z:\I\1978\11\10\1896410.006)
2017-06-20 16:16:42,815 INFO CopyFiles$ Copying: Z:\I\1978\11\10\1896410.001 to: ./preindex/1978/1896410.001
2017-06-20 16:16:42,831 INFO CopyFiles$ Copying: Z:\I\1978\11\10\1896410.002 to: ./preindex/1978/1896410.002
2017-06-20 16:16:42,831 INFO CopyFiles$ Copying: Z:\I\1978\11\10\1896410.003 to: ./preindex/1978/1896410.003
2017-06-20 16:16:42,846 INFO CopyFiles$ Copying: Z:\I\1978\11\10\1896410.004 to: ./preindex/1978/1896410.004
2017-06-20 16:16:42,846 INFO CopyFiles$ Copying: Z:\I\1978\11\10\1896410.005 to: ./preindex/1978/1896410.005
2017-06-20 16:16:42,862 INFO CopyFiles$ Copying: Z:\I\1978\11\10\1896410.006 to: ./preindex/1978/1896410.006
2017-06-20 16:16:42,862 INFO CopyFiles$ Processing DocNum: 1795794, FileYear: 1978, FileMd: 628, Files: List(Z:\I\1978\06\28\1795794.001, Z:\I\1978\06\28\1795794.002, Z:\I\1978\06\28\1795794.003)
2017-06-20 16:16:42,862 INFO CopyFiles$ Copying: Z:\I\1978\06\28\1795794.001 to: ./preindex/1978/1795794.001
2017-06-20 16:16:42,877 INFO CopyFiles$ Copying: Z:\I\1978\06\28\1795794.002 to: ./preindex/1978/1795794.002
2017-06-20 16:16:42,893 INFO CopyFiles$ Copying: Z:\I\1978\06\28\1795794.003 to: ./preindex/1978/1795794.003
2017-06-20 16:16:42,893 INFO CopyFiles$ Processing DocNum: 1805579, FileYear: 1978, FileMd: 711, Files: List(Z:\I\1978\07\11\1805579.001, Z:\I\1978\07\11\1805579.002, Z:\I\1978\07\11\1805579.003, Z:\I\1978\07\11\1805579.004)
2017-06-20 16:16:42,893 INFO CopyFiles$ Copying: Z:\I\1978\07\11\1805579.001 to: ./preindex/1978/1805579.001
2017-06-20 16:16:42,909 INFO CopyFiles$ Copying: Z:\I\1978\07\11\1805579.002 to: ./preindex/1978/1805579.002
2017-06-20 16:16:42,924 INFO CopyFiles$ Copying: Z:\I\1978\07\11\1805579.003 to: ./preindex/1978/1805579.003
2017-06-20 16:16:42,924 INFO CopyFiles$ Copying: Z:\I\1978\07\11\1805579.004 to: ./preindex/1978/1805579.004
2017-06-20 16:16:42,940 INFO CopyFiles$ Processing DocNum: 1762966, FileYear: 1978, FileMd: 511, Files: List(Z:\I\1978\05\11\1762966.001, Z:\I\1978\05\11\1762966.002)
2017-06-20 16:16:42,940 INFO CopyFiles$ Copying: Z:\I\1978\05\11\1762966.001 to: ./preindex/1978/1762966.001
2017-06-20 16:16:42,971 INFO CopyFiles$ Copying: Z:\I\1978\05\11\1762966.002 to: ./preindex/1978/1762966.002
2017-06-20 16:16:42,987 INFO CopyFiles$ Processing DocNum: 1813145, FileYear: 1978, FileMd: 720, Files: List(Z:\I\1978\07\20\1813145.001, Z:\I\1978\07\20\1813145.002, Z:\I\1978\07\20\1813145.003, Z:\I\1978\07\20\1813145.004)
2017-06-20 16:16:42,987 INFO CopyFiles$ Copying: Z:\I\1978\07\20\1813145.001 to: ./preindex/1978/1813145.001
2017-06-20 16:16:42,987 INFO CopyFiles$ Copying: Z:\I\1978\07\20\1813145.002 to: ./preindex/1978/1813145.002
2017-06-20 16:16:43,002 INFO CopyFiles$ Copying: Z:\I\1978\07\20\1813145.003 to: ./preindex/1978/1813145.003
2017-06-20 16:16:43,002 INFO CopyFiles$ Copying: Z:\I\1978\07\20\1813145.004 to: ./preindex/1978/1813145.004
2017-06-20 16:16:43,018 INFO CopyFiles$ Processing DocNum: 1896407, FileYear: 1978, FileMd: 1110, Files: List(Z:\I\1978\11\10\1896407.001, Z:\I\1978\11\10\1896407.002, Z:\I\1978\11\10\1896407.003)
2017-06-20 16:16:43,018 INFO CopyFiles$ Copying: Z:\I\1978\11\10\1896407.001 to: ./preindex/1978/1896407.001
2017-06-20 16:16:43,018 INFO CopyFiles$ Copying: Z:\I\1978\11\10\1896407.002 to: ./preindex/1978/1896407.002
2017-06-20 16:16:43,033 INFO CopyFiles$ Copying: Z:\I\1978\11\10\1896407.003 to: ./preindex/1978/1896407.003
2017-06-20 16:16:43,049 INFO CopyFiles$ Processing DocNum: 1696659, FileYear: 1978, FileMd: 206, Files: List(Z:\I\1978\02\06\1696659.001, Z:\I\1978\02\06\1696659.002, Z:\I\1978\02\06\1696659.003)
2017-06-20 16:16:43,049 INFO CopyFiles$ Copying: Z:\I\1978\02\06\1696659.001 to: ./preindex/1978/1696659.001
2017-06-20 16:16:43,065 INFO CopyFiles$ Copying: Z:\I\1978\02\06\1696659.002 to: ./preindex/1978/1696659.002
2017-06-20 16:16:43,065 INFO CopyFiles$ Copying: Z:\I\1978\02\06\1696659.003 to: ./preindex/1978/1696659.003
2017-06-20 16:16:43,080 INFO CopyFiles$ Processing DocNum: 1918243, FileYear: 1978, FileMd: 1214, Files: List(Z:\I\1978\12\14\1918243.001, Z:\I\1978\12\14\1918243.002, Z:\I\1978\12\14\1918243.003)
2017-06-20 16:16:43,080 INFO CopyFiles$ Copying: Z:\I\1978\12\14\1918243.001 to: ./preindex/1978/1918243.001
2017-06-20 16:16:43,111 INFO CopyFiles$ Copying: Z:\I\1978\12\14\1918243.002 to: ./preindex/1978/1918243.002
2017-06-20 16:16:43,111 INFO CopyFiles$ Copying: Z:\I\1978\12\14\1918243.003 to: ./preindex/1978/1918243.003
2017-06-20 16:16:43,127 INFO CopyFiles$ Processing DocNum: 1747394, FileYear: 1978, FileMd: 420, Files: List(Z:\I\1978\04\20\1747394.001, Z:\I\1978\04\20\1747394.002, Z:\I\1978\04\20\1747394.003)
2017-06-20 16:16:43,127 INFO CopyFiles$ Copying: Z:\I\1978\04\20\1747394.001 to: ./preindex/1978/1747394.001
2017-06-20 16:16:43,143 INFO CopyFiles$ Copying: Z:\I\1978\04\20\1747394.002 to: ./preindex/1978/1747394.002
2017-06-20 16:16:43,143 INFO CopyFiles$ Copying: Z:\I\1978\04\20\1747394.003 to: ./preindex/1978/1747394.003
2017-06-20 16:16:43,158 INFO CopyFiles$ Processing DocNum: 1724416, FileYear: 1978, FileMd: 320, Files: List(Z:\I\1978\03\20\1724416.001, Z:\I\1978\03\20\1724416.002, Z:\I\1978\03\20\1724416.003)
2017-06-20 16:16:43,158 INFO CopyFiles$ Copying: Z:\I\1978\03\20\1724416.001 to: ./preindex/1978/1724416.001
2017-06-20 16:16:43,174 INFO CopyFiles$ Copying: Z:\I\1978\03\20\1724416.002 to: ./preindex/1978/1724416.002
2017-06-20 16:16:43,174 INFO CopyFiles$ Copying: Z:\I\1978\03\20\1724416.003 to: ./preindex/1978/1724416.003
2017-06-20 16:16:43,189 INFO CopyFiles$ Processing DocNum: 1925529, FileYear: 1978, FileMd: 1227, Files: List(Z:\I\1978\12\27\1925529.001, Z:\I\1978\12\27\1925529.002, Z:\I\1978\12\27\1925529.003)
2017-06-20 16:16:43,189 INFO CopyFiles$ Copying: Z:\I\1978\12\27\1925529.001 to: ./preindex/1978/1925529.001
2017-06-20 16:16:43,205 INFO CopyFiles$ Copying: Z:\I\1978\12\27\1925529.002 to: ./preindex/1978/1925529.002
2017-06-20 16:16:43,205 INFO CopyFiles$ Copying: Z:\I\1978\12\27\1925529.003 to: ./preindex/1978/1925529.003
2017-06-20 16:16:43,221 INFO CopyFiles$ Processing DocNum: 1881219, FileYear: 1978, FileMd: 1020, Files: List(Z:\I\1978\10\20\1881219.001, Z:\I\1978\10\20\1881219.002)
2017-06-20 16:16:43,221 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881219.001 to: ./preindex/1978/1881219.001
2017-06-20 16:16:43,236 INFO CopyFiles$ Copying: Z:\I\1978\10\20\1881219.002 to: ./preindex/1978/1881219.002
2017-06-20 16:16:43,236 INFO CopyFiles$ Processing DocNum: 1927166, FileYear: 1978, FileMd: 1229, Files: List(Z:\I\1978\12\29\1927166.001)
2017-06-20 16:16:43,236 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927166.001 to: ./preindex/1978/1927166.001
2017-06-20 16:16:43,252 INFO CopyFiles$ Processing DocNum: 1910598, FileYear: 1978, FileMd: 1204, Files: List(Z:\I\1978\12\04\1910598.001, Z:\I\1978\12\04\1910598.002)
2017-06-20 16:16:43,267 INFO CopyFiles$ Copying: Z:\I\1978\12\04\1910598.001 to: ./preindex/1978/1910598.001
2017-06-20 16:16:43,267 INFO CopyFiles$ Copying: Z:\I\1978\12\04\1910598.002 to: ./preindex/1978/1910598.002
2017-06-20 16:16:43,299 INFO CopyFiles$ Processing DocNum: 1800570, FileYear: 1978, FileMd: 705, Files: List(Z:\I\1978\07\05\1800570.001, Z:\I\1978\07\05\1800570.002, Z:\I\1978\07\05\1800570.003, Z:\I\1978\07\05\1800570.004, Z:\I\1978\07\05\1800570.005, Z:\I\1978\07\05\1800570.006, Z:\I\1978\07\05\1800570.007, Z:\I\1978\07\05\1800570.008)
2017-06-20 16:16:43,299 INFO CopyFiles$ Copying: Z:\I\1978\07\05\1800570.001 to: ./preindex/1978/1800570.001
2017-06-20 16:16:43,314 INFO CopyFiles$ Copying: Z:\I\1978\07\05\1800570.002 to: ./preindex/1978/1800570.002
2017-06-20 16:16:43,330 INFO CopyFiles$ Copying: Z:\I\1978\07\05\1800570.003 to: ./preindex/1978/1800570.003
2017-06-20 16:16:43,361 INFO CopyFiles$ Copying: Z:\I\1978\07\05\1800570.004 to: ./preindex/1978/1800570.004
2017-06-20 16:16:43,377 INFO CopyFiles$ Copying: Z:\I\1978\07\05\1800570.005 to: ./preindex/1978/1800570.005
2017-06-20 16:16:43,392 INFO CopyFiles$ Copying: Z:\I\1978\07\05\1800570.006 to: ./preindex/1978/1800570.006
2017-06-20 16:16:43,392 INFO CopyFiles$ Copying: Z:\I\1978\07\05\1800570.007 to: ./preindex/1978/1800570.007
2017-06-20 16:16:43,408 INFO CopyFiles$ Copying: Z:\I\1978\07\05\1800570.008 to: ./preindex/1978/1800570.008
2017-06-20 16:16:43,423 INFO CopyFiles$ Processing DocNum: 1728756, FileYear: 1978, FileMd: 324, Files: List(Z:\I\1978\03\24\1728756.001, Z:\I\1978\03\24\1728756.002, Z:\I\1978\03\24\1728756.003, Z:\I\1978\03\24\1728756.004)
2017-06-20 16:16:43,423 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1728756.001 to: ./preindex/1978/1728756.001
2017-06-20 16:16:43,439 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1728756.002 to: ./preindex/1978/1728756.002
2017-06-20 16:16:43,455 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1728756.003 to: ./preindex/1978/1728756.003
2017-06-20 16:16:43,470 INFO CopyFiles$ Copying: Z:\I\1978\03\24\1728756.004 to: ./preindex/1978/1728756.004
2017-06-20 16:16:43,486 INFO CopyFiles$ Processing DocNum: 1738424, FileYear: 1978, FileMd: 407, Files: List(Z:\I\1978\04\07\1738424.001, Z:\I\1978\04\07\1738424.002, Z:\I\1978\04\07\1738424.003)
2017-06-20 16:16:43,486 INFO CopyFiles$ Copying: Z:\I\1978\04\07\1738424.001 to: ./preindex/1978/1738424.001
2017-06-20 16:16:43,501 INFO CopyFiles$ Copying: Z:\I\1978\04\07\1738424.002 to: ./preindex/1978/1738424.002
2017-06-20 16:16:43,517 INFO CopyFiles$ Copying: Z:\I\1978\04\07\1738424.003 to: ./preindex/1978/1738424.003
2017-06-20 16:16:43,533 INFO CopyFiles$ Processing DocNum: 1744707, FileYear: 1978, FileMd: 418, Files: List(Z:\I\1978\04\18\1744707.001, Z:\I\1978\04\18\1744707.002)
2017-06-20 16:16:43,533 INFO CopyFiles$ Copying: Z:\I\1978\04\18\1744707.001 to: ./preindex/1978/1744707.001
2017-06-20 16:16:43,548 INFO CopyFiles$ Copying: Z:\I\1978\04\18\1744707.002 to: ./preindex/1978/1744707.002
2017-06-20 16:16:43,564 INFO CopyFiles$ Processing DocNum: 1836433, FileYear: 1978, FileMd: 821, Files: List(Z:\I\1978\08\21\1836433.001, Z:\I\1978\08\21\1836433.002, Z:\I\1978\08\21\1836433.003)
2017-06-20 16:16:43,564 INFO CopyFiles$ Copying: Z:\I\1978\08\21\1836433.001 to: ./preindex/1978/1836433.001
2017-06-20 16:16:43,579 INFO CopyFiles$ Copying: Z:\I\1978\08\21\1836433.002 to: ./preindex/1978/1836433.002
2017-06-20 16:16:43,595 INFO CopyFiles$ Copying: Z:\I\1978\08\21\1836433.003 to: ./preindex/1978/1836433.003
2017-06-20 16:16:43,611 INFO CopyFiles$ Processing DocNum: 1801018, FileYear: 1978, FileMd: 705, Files: List(Z:\I\1978\07\05\1801018.001, Z:\I\1978\07\05\1801018.002, Z:\I\1978\07\05\1801018.003)
2017-06-20 16:16:43,611 INFO CopyFiles$ Copying: Z:\I\1978\07\05\1801018.001 to: ./preindex/1978/1801018.001
2017-06-20 16:16:43,626 INFO CopyFiles$ Copying: Z:\I\1978\07\05\1801018.002 to: ./preindex/1978/1801018.002
2017-06-20 16:16:43,642 INFO CopyFiles$ Copying: Z:\I\1978\07\05\1801018.003 to: ./preindex/1978/1801018.003
2017-06-20 16:16:43,657 INFO CopyFiles$ Processing DocNum: 1688900, FileYear: 1978, FileMd: 124, Files: List(Z:\I\1978\01\24\1688900.001, Z:\I\1978\01\24\1688900.002, Z:\I\1978\01\24\1688900.003)
2017-06-20 16:16:43,657 INFO CopyFiles$ Copying: Z:\I\1978\01\24\1688900.001 to: ./preindex/1978/1688900.001
2017-06-20 16:16:43,673 INFO CopyFiles$ Copying: Z:\I\1978\01\24\1688900.002 to: ./preindex/1978/1688900.002
2017-06-20 16:16:43,689 INFO CopyFiles$ Copying: Z:\I\1978\01\24\1688900.003 to: ./preindex/1978/1688900.003
2017-06-20 16:16:43,704 INFO CopyFiles$ Processing DocNum: 1831501, FileYear: 1978, FileMd: 814, Files: List(Z:\I\1978\08\14\1831501.001, Z:\I\1978\08\14\1831501.002)
2017-06-20 16:16:43,704 INFO CopyFiles$ Copying: Z:\I\1978\08\14\1831501.001 to: ./preindex/1978/1831501.001
2017-06-20 16:16:43,720 INFO CopyFiles$ Copying: Z:\I\1978\08\14\1831501.002 to: ./preindex/1978/1831501.002
2017-06-20 16:16:43,720 INFO CopyFiles$ Processing DocNum: 1917837, FileYear: 1978, FileMd: 1214, Files: List(Z:\I\1978\12\14\1917837.001, Z:\I\1978\12\14\1917837.002, Z:\I\1978\12\14\1917837.003)
2017-06-20 16:16:43,720 INFO CopyFiles$ Copying: Z:\I\1978\12\14\1917837.001 to: ./preindex/1978/1917837.001
2017-06-20 16:16:43,735 INFO CopyFiles$ Copying: Z:\I\1978\12\14\1917837.002 to: ./preindex/1978/1917837.002
2017-06-20 16:16:43,751 INFO CopyFiles$ Copying: Z:\I\1978\12\14\1917837.003 to: ./preindex/1978/1917837.003
2017-06-20 16:16:43,767 INFO CopyFiles$ Processing DocNum: 1876678, FileYear: 1978, FileMd: 1013, Files: List(Z:\I\1978\10\13\1876678.001, Z:\I\1978\10\13\1876678.002, Z:\I\1978\10\13\1876678.003)
2017-06-20 16:16:43,767 INFO CopyFiles$ Copying: Z:\I\1978\10\13\1876678.001 to: ./preindex/1978/1876678.001
2017-06-20 16:16:43,767 INFO CopyFiles$ Copying: Z:\I\1978\10\13\1876678.002 to: ./preindex/1978/1876678.002
2017-06-20 16:16:43,782 INFO CopyFiles$ Copying: Z:\I\1978\10\13\1876678.003 to: ./preindex/1978/1876678.003
2017-06-20 16:16:43,782 INFO CopyFiles$ Processing DocNum: 1847884, FileYear: 1978, FileMd: 905, Files: List(Z:\I\1978\09\05\1847884.001, Z:\I\1978\09\05\1847884.002, Z:\I\1978\09\05\1847884.003)
2017-06-20 16:16:43,782 INFO CopyFiles$ Copying: Z:\I\1978\09\05\1847884.001 to: ./preindex/1978/1847884.001
2017-06-20 16:16:43,798 INFO CopyFiles$ Copying: Z:\I\1978\09\05\1847884.002 to: ./preindex/1978/1847884.002
2017-06-20 16:16:43,813 INFO CopyFiles$ Copying: Z:\I\1978\09\05\1847884.003 to: ./preindex/1978/1847884.003
2017-06-20 16:16:43,813 INFO CopyFiles$ Processing DocNum: 1914193, FileYear: 1978, FileMd: 1212, Files: List(Z:\I\1978\12\12\1914193.001, Z:\I\1978\12\12\1914193.002, Z:\I\1978\12\12\1914193.003, Z:\I\1978\12\12\1914193.004, Z:\I\1978\12\12\1914193.005)
2017-06-20 16:16:43,829 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914193.001 to: ./preindex/1978/1914193.001
2017-06-20 16:16:43,829 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914193.002 to: ./preindex/1978/1914193.002
2017-06-20 16:16:43,829 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914193.003 to: ./preindex/1978/1914193.003
2017-06-20 16:16:43,845 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914193.004 to: ./preindex/1978/1914193.004
2017-06-20 16:16:43,845 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914193.005 to: ./preindex/1978/1914193.005
2017-06-20 16:16:43,860 INFO CopyFiles$ Processing DocNum: 1814898, FileYear: 1978, FileMd: 724, Files: List(Z:\I\1978\07\24\1814898.001, Z:\I\1978\07\24\1814898.002, Z:\I\1978\07\24\1814898.003)
2017-06-20 16:16:43,860 INFO CopyFiles$ Copying: Z:\I\1978\07\24\1814898.001 to: ./preindex/1978/1814898.001
2017-06-20 16:16:43,876 INFO CopyFiles$ Copying: Z:\I\1978\07\24\1814898.002 to: ./preindex/1978/1814898.002
2017-06-20 16:16:43,876 INFO CopyFiles$ Copying: Z:\I\1978\07\24\1814898.003 to: ./preindex/1978/1814898.003
2017-06-20 16:16:43,891 INFO CopyFiles$ Processing DocNum: 1781251, FileYear: 1978, FileMd: 607, Files: List(Z:\I\1978\06\07\1781251.001, Z:\I\1978\06\07\1781251.002, Z:\I\1978\06\07\1781251.003, Z:\I\1978\06\07\1781251.004)
2017-06-20 16:16:43,891 INFO CopyFiles$ Copying: Z:\I\1978\06\07\1781251.001 to: ./preindex/1978/1781251.001
2017-06-20 16:16:43,907 INFO CopyFiles$ Copying: Z:\I\1978\06\07\1781251.002 to: ./preindex/1978/1781251.002
2017-06-20 16:16:43,907 INFO CopyFiles$ Copying: Z:\I\1978\06\07\1781251.003 to: ./preindex/1978/1781251.003
2017-06-20 16:16:43,923 INFO CopyFiles$ Copying: Z:\I\1978\06\07\1781251.004 to: ./preindex/1978/1781251.004
2017-06-20 16:16:43,923 INFO CopyFiles$ Processing DocNum: 1887498, FileYear: 1978, FileMd: 1030, Files: List(Z:\I\1978\10\30\1887498.001, Z:\I\1978\10\30\1887498.002, Z:\I\1978\10\30\1887498.003)
2017-06-20 16:16:43,923 INFO CopyFiles$ Copying: Z:\I\1978\10\30\1887498.001 to: ./preindex/1978/1887498.001
2017-06-20 16:16:43,938 INFO CopyFiles$ Copying: Z:\I\1978\10\30\1887498.002 to: ./preindex/1978/1887498.002
2017-06-20 16:16:43,938 INFO CopyFiles$ Copying: Z:\I\1978\10\30\1887498.003 to: ./preindex/1978/1887498.003
2017-06-20 16:16:43,938 INFO CopyFiles$ Processing DocNum: 1681680, FileYear: 1978, FileMd: 112, Files: List(Z:\I\1978\01\12\1681680.001, Z:\I\1978\01\12\1681680.002, Z:\I\1978\01\12\1681680.003, Z:\I\1978\01\12\1681680.004, Z:\I\1978\01\12\1681680.005, Z:\I\1978\01\12\1681680.006)
2017-06-20 16:16:43,954 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681680.001 to: ./preindex/1978/1681680.001
2017-06-20 16:16:43,954 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681680.002 to: ./preindex/1978/1681680.002
2017-06-20 16:16:43,969 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681680.003 to: ./preindex/1978/1681680.003
2017-06-20 16:16:43,985 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681680.004 to: ./preindex/1978/1681680.004
2017-06-20 16:16:44,001 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681680.005 to: ./preindex/1978/1681680.005
2017-06-20 16:16:44,016 INFO CopyFiles$ Copying: Z:\I\1978\01\12\1681680.006 to: ./preindex/1978/1681680.006
2017-06-20 16:16:44,016 INFO CopyFiles$ Processing DocNum: 1744826, FileYear: 1978, FileMd: 418, Files: List(Z:\I\1978\04\18\1744826.001, Z:\I\1978\04\18\1744826.002)
2017-06-20 16:16:44,016 INFO CopyFiles$ Copying: Z:\I\1978\04\18\1744826.001 to: ./preindex/1978/1744826.001
2017-06-20 16:16:44,047 INFO CopyFiles$ Copying: Z:\I\1978\04\18\1744826.002 to: ./preindex/1978/1744826.002
2017-06-20 16:16:44,047 INFO CopyFiles$ Processing DocNum: 1723227, FileYear: 1978, FileMd: 316, Files: List(Z:\I\1978\03\16\1723227.001, Z:\I\1978\03\16\1723227.002, Z:\I\1978\03\16\1723227.003, Z:\I\1978\03\16\1723227.004)
2017-06-20 16:16:44,047 INFO CopyFiles$ Copying: Z:\I\1978\03\16\1723227.001 to: ./preindex/1978/1723227.001
2017-06-20 16:16:44,063 INFO CopyFiles$ Copying: Z:\I\1978\03\16\1723227.002 to: ./preindex/1978/1723227.002
2017-06-20 16:16:44,079 INFO CopyFiles$ Copying: Z:\I\1978\03\16\1723227.003 to: ./preindex/1978/1723227.003
2017-06-20 16:16:44,079 INFO CopyFiles$ Copying: Z:\I\1978\03\16\1723227.004 to: ./preindex/1978/1723227.004
2017-06-20 16:16:44,079 INFO CopyFiles$ Processing DocNum: 1717121, FileYear: 1978, FileMd: 223, Files: List(Z:\I\1978\02\23\1717121.001, Z:\I\1978\02\23\1717121.002, Z:\I\1978\02\23\1717121.003, Z:\I\1978\02\23\1717121.004)
2017-06-20 16:16:44,094 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1717121.001 to: ./preindex/1978/1717121.001
2017-06-20 16:16:44,110 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1717121.002 to: ./preindex/1978/1717121.002
2017-06-20 16:16:44,110 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1717121.003 to: ./preindex/1978/1717121.003
2017-06-20 16:16:44,125 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1717121.004 to: ./preindex/1978/1717121.004
2017-06-20 16:16:44,141 INFO CopyFiles$ Processing DocNum: 1893677, FileYear: 1978, FileMd: 1107, Files: List(Z:\I\1978\11\07\1893677.001, Z:\I\1978\11\07\1893677.002, Z:\I\1978\11\07\1893677.003, Z:\I\1978\11\07\1893677.004)
2017-06-20 16:16:44,141 INFO CopyFiles$ Copying: Z:\I\1978\11\07\1893677.001 to: ./preindex/1978/1893677.001
2017-06-20 16:16:44,157 INFO CopyFiles$ Copying: Z:\I\1978\11\07\1893677.002 to: ./preindex/1978/1893677.002
2017-06-20 16:16:44,172 INFO CopyFiles$ Copying: Z:\I\1978\11\07\1893677.003 to: ./preindex/1978/1893677.003
2017-06-20 16:16:44,172 INFO CopyFiles$ Copying: Z:\I\1978\11\07\1893677.004 to: ./preindex/1978/1893677.004
2017-06-20 16:16:44,188 INFO CopyFiles$ Processing DocNum: 1842918, FileYear: 1978, FileMd: 829, Files: List(Z:\I\1978\08\29\1842918.001, Z:\I\1978\08\29\1842918.002)
2017-06-20 16:16:44,188 INFO CopyFiles$ Copying: Z:\I\1978\08\29\1842918.001 to: ./preindex/1978/1842918.001
2017-06-20 16:16:44,203 INFO CopyFiles$ Copying: Z:\I\1978\08\29\1842918.002 to: ./preindex/1978/1842918.002
2017-06-20 16:16:44,235 INFO CopyFiles$ Processing DocNum: 1729960, FileYear: 1978, FileMd: 328, Files: List(Z:\I\1978\03\28\1729960.001, Z:\I\1978\03\28\1729960.002, Z:\I\1978\03\28\1729960.003)
2017-06-20 16:16:44,250 INFO CopyFiles$ Copying: Z:\I\1978\03\28\1729960.001 to: ./preindex/1978/1729960.001
2017-06-20 16:16:44,250 INFO CopyFiles$ Copying: Z:\I\1978\03\28\1729960.002 to: ./preindex/1978/1729960.002
2017-06-20 16:16:44,250 INFO CopyFiles$ Copying: Z:\I\1978\03\28\1729960.003 to: ./preindex/1978/1729960.003
2017-06-20 16:16:44,266 INFO CopyFiles$ Processing DocNum: 1767389, FileYear: 1978, FileMd: 517, Files: List(Z:\I\1978\05\17\1767389.001, Z:\I\1978\05\17\1767389.002, Z:\I\1978\05\17\1767389.003)
2017-06-20 16:16:44,266 INFO CopyFiles$ Copying: Z:\I\1978\05\17\1767389.001 to: ./preindex/1978/1767389.001
2017-06-20 16:16:44,281 INFO CopyFiles$ Copying: Z:\I\1978\05\17\1767389.002 to: ./preindex/1978/1767389.002
2017-06-20 16:16:44,297 INFO CopyFiles$ Copying: Z:\I\1978\05\17\1767389.003 to: ./preindex/1978/1767389.003
2017-06-20 16:16:44,313 INFO CopyFiles$ Processing DocNum: 1748396, FileYear: 1978, FileMd: 424, Files: List(Z:\I\1978\04\24\1748396.001, Z:\I\1978\04\24\1748396.002, Z:\I\1978\04\24\1748396.003)
2017-06-20 16:16:44,313 INFO CopyFiles$ Copying: Z:\I\1978\04\24\1748396.001 to: ./preindex/1978/1748396.001
2017-06-20 16:16:44,328 INFO CopyFiles$ Copying: Z:\I\1978\04\24\1748396.002 to: ./preindex/1978/1748396.002
2017-06-20 16:16:44,344 INFO CopyFiles$ Copying: Z:\I\1978\04\24\1748396.003 to: ./preindex/1978/1748396.003
2017-06-20 16:16:44,344 INFO CopyFiles$ Processing DocNum: 1709032, FileYear: 1978, FileMd: 224, Files: List(Z:\I\1978\02\24\1709032.001, Z:\I\1978\02\24\1709032.002, Z:\I\1978\02\24\1709032.003, Z:\I\1978\02\24\1709032.004)
2017-06-20 16:16:44,344 INFO CopyFiles$ Copying: Z:\I\1978\02\24\1709032.001 to: ./preindex/1978/1709032.001
2017-06-20 16:16:44,375 INFO CopyFiles$ Copying: Z:\I\1978\02\24\1709032.002 to: ./preindex/1978/1709032.002
2017-06-20 16:16:44,375 INFO CopyFiles$ Copying: Z:\I\1978\02\24\1709032.003 to: ./preindex/1978/1709032.003
2017-06-20 16:16:44,406 INFO CopyFiles$ Copying: Z:\I\1978\02\24\1709032.004 to: ./preindex/1978/1709032.004
2017-06-20 16:16:44,437 INFO CopyFiles$ Processing DocNum: 1735343, FileYear: 1978, FileMd: 404, Files: List(Z:\I\1978\04\04\1735343.001, Z:\I\1978\04\04\1735343.002)
2017-06-20 16:16:44,453 INFO CopyFiles$ Copying: Z:\I\1978\04\04\1735343.001 to: ./preindex/1978/1735343.001
2017-06-20 16:16:44,469 INFO CopyFiles$ Copying: Z:\I\1978\04\04\1735343.002 to: ./preindex/1978/1735343.002
2017-06-20 16:16:44,484 INFO CopyFiles$ Processing DocNum: 1738154, FileYear: 1978, FileMd: 407, Files: List(Z:\I\1978\04\07\1738154.001, Z:\I\1978\04\07\1738154.002, Z:\I\1978\04\07\1738154.003)
2017-06-20 16:16:44,484 INFO CopyFiles$ Copying: Z:\I\1978\04\07\1738154.001 to: ./preindex/1978/1738154.001
2017-06-20 16:16:44,500 INFO CopyFiles$ Copying: Z:\I\1978\04\07\1738154.002 to: ./preindex/1978/1738154.002
2017-06-20 16:16:44,531 INFO CopyFiles$ Copying: Z:\I\1978\04\07\1738154.003 to: ./preindex/1978/1738154.003
2017-06-20 16:16:44,547 INFO CopyFiles$ Processing DocNum: 1846559, FileYear: 1978, FileMd: 901, Files: List(Z:\I\1978\09\01\1846559.001, Z:\I\1978\09\01\1846559.002)
2017-06-20 16:16:44,547 INFO CopyFiles$ Copying: Z:\I\1978\09\01\1846559.001 to: ./preindex/1978/1846559.001
2017-06-20 16:16:44,562 INFO CopyFiles$ Copying: Z:\I\1978\09\01\1846559.002 to: ./preindex/1978/1846559.002
2017-06-20 16:16:44,578 INFO CopyFiles$ Processing DocNum: 1867440, FileYear: 1978, FileMd: 1002, Files: List(Z:\I\1978\10\02\1867440.001, Z:\I\1978\10\02\1867440.002, Z:\I\1978\10\02\1867440.003, Z:\I\1978\10\02\1867440.004)
2017-06-20 16:16:44,578 INFO CopyFiles$ Copying: Z:\I\1978\10\02\1867440.001 to: ./preindex/1978/1867440.001
2017-06-20 16:16:44,593 INFO CopyFiles$ Copying: Z:\I\1978\10\02\1867440.002 to: ./preindex/1978/1867440.002
2017-06-20 16:16:44,609 INFO CopyFiles$ Copying: Z:\I\1978\10\02\1867440.003 to: ./preindex/1978/1867440.003
2017-06-20 16:16:44,609 INFO CopyFiles$ Copying: Z:\I\1978\10\02\1867440.004 to: ./preindex/1978/1867440.004
2017-06-20 16:16:44,625 INFO CopyFiles$ Processing DocNum: 1900428, FileYear: 1978, FileMd: 1116, Files: List(Z:\I\1978\11\16\1900428.001, Z:\I\1978\11\16\1900428.002, Z:\I\1978\11\16\1900428.003)
2017-06-20 16:16:44,625 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900428.001 to: ./preindex/1978/1900428.001
2017-06-20 16:16:44,625 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900428.002 to: ./preindex/1978/1900428.002
2017-06-20 16:16:44,640 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900428.003 to: ./preindex/1978/1900428.003
2017-06-20 16:16:44,640 INFO CopyFiles$ Processing DocNum: 1812981, FileYear: 1978, FileMd: 720, Files: List(Z:\I\1978\07\20\1812981.001, Z:\I\1978\07\20\1812981.002, Z:\I\1978\07\20\1812981.003)
2017-06-20 16:16:44,640 INFO CopyFiles$ Copying: Z:\I\1978\07\20\1812981.001 to: ./preindex/1978/1812981.001
2017-06-20 16:16:44,656 INFO CopyFiles$ Copying: Z:\I\1978\07\20\1812981.002 to: ./preindex/1978/1812981.002
2017-06-20 16:16:44,656 INFO CopyFiles$ Copying: Z:\I\1978\07\20\1812981.003 to: ./preindex/1978/1812981.003
2017-06-20 16:16:44,671 INFO CopyFiles$ Processing DocNum: 1744816, FileYear: 1978, FileMd: 418, Files: List(Z:\I\1978\04\18\1744816.001, Z:\I\1978\04\18\1744816.002)
2017-06-20 16:16:44,671 INFO CopyFiles$ Copying: Z:\I\1978\04\18\1744816.001 to: ./preindex/1978/1744816.001
2017-06-20 16:16:44,687 INFO CopyFiles$ Copying: Z:\I\1978\04\18\1744816.002 to: ./preindex/1978/1744816.002
2017-06-20 16:16:44,718 INFO CopyFiles$ Processing DocNum: 1892556, FileYear: 1978, FileMd: 1106, Files: List(Z:\I\1978\11\06\1892556.001, Z:\I\1978\11\06\1892556.002, Z:\I\1978\11\06\1892556.003)
2017-06-20 16:16:44,718 INFO CopyFiles$ Copying: Z:\I\1978\11\06\1892556.001 to: ./preindex/1978/1892556.001
2017-06-20 16:16:44,734 INFO CopyFiles$ Copying: Z:\I\1978\11\06\1892556.002 to: ./preindex/1978/1892556.002
2017-06-20 16:16:44,734 INFO CopyFiles$ Copying: Z:\I\1978\11\06\1892556.003 to: ./preindex/1978/1892556.003
2017-06-20 16:16:44,749 INFO CopyFiles$ Processing DocNum: 1784058, FileYear: 1978, FileMd: 612, Files: List(Z:\I\1978\06\12\1784058.001, Z:\I\1978\06\12\1784058.002)
2017-06-20 16:16:44,749 INFO CopyFiles$ Copying: Z:\I\1978\06\12\1784058.001 to: ./preindex/1978/1784058.001
2017-06-20 16:16:44,765 INFO CopyFiles$ Copying: Z:\I\1978\06\12\1784058.002 to: ./preindex/1978/1784058.002
2017-06-20 16:16:44,765 INFO CopyFiles$ Processing DocNum: 1790102, FileYear: 1978, FileMd: 620, Files: List(Z:\I\1978\06\20\1790102.001, Z:\I\1978\06\20\1790102.002, Z:\I\1978\06\20\1790102.003)
2017-06-20 16:16:44,781 INFO CopyFiles$ Copying: Z:\I\1978\06\20\1790102.001 to: ./preindex/1978/1790102.001
2017-06-20 16:16:44,781 INFO CopyFiles$ Copying: Z:\I\1978\06\20\1790102.002 to: ./preindex/1978/1790102.002
2017-06-20 16:16:44,796 INFO CopyFiles$ Copying: Z:\I\1978\06\20\1790102.003 to: ./preindex/1978/1790102.003
2017-06-20 16:16:44,812 INFO CopyFiles$ Processing DocNum: 1791441, FileYear: 1978, FileMd: 621, Files: List(Z:\I\1978\06\21\1791441.001, Z:\I\1978\06\21\1791441.002, Z:\I\1978\06\21\1791441.003, Z:\I\1978\06\21\1791441.004, Z:\I\1978\06\21\1791441.005)
2017-06-20 16:16:44,812 INFO CopyFiles$ Copying: Z:\I\1978\06\21\1791441.001 to: ./preindex/1978/1791441.001
2017-06-20 16:16:44,827 INFO CopyFiles$ Copying: Z:\I\1978\06\21\1791441.002 to: ./preindex/1978/1791441.002
2017-06-20 16:16:44,827 INFO CopyFiles$ Copying: Z:\I\1978\06\21\1791441.003 to: ./preindex/1978/1791441.003
2017-06-20 16:16:44,843 INFO CopyFiles$ Copying: Z:\I\1978\06\21\1791441.004 to: ./preindex/1978/1791441.004
2017-06-20 16:16:44,843 INFO CopyFiles$ Copying: Z:\I\1978\06\21\1791441.005 to: ./preindex/1978/1791441.005
2017-06-20 16:16:44,859 INFO CopyFiles$ Processing DocNum: 1773233, FileYear: 1978, FileMd: 525, Files: List(Z:\I\1978\05\25\1773233.001, Z:\I\1978\05\25\1773233.002, Z:\I\1978\05\25\1773233.003, Z:\I\1978\05\25\1773233.004, Z:\I\1978\05\25\1773233.005)
2017-06-20 16:16:44,859 INFO CopyFiles$ Copying: Z:\I\1978\05\25\1773233.001 to: ./preindex/1978/1773233.001
2017-06-20 16:16:44,874 INFO CopyFiles$ Copying: Z:\I\1978\05\25\1773233.002 to: ./preindex/1978/1773233.002
2017-06-20 16:16:44,874 INFO CopyFiles$ Copying: Z:\I\1978\05\25\1773233.003 to: ./preindex/1978/1773233.003
2017-06-20 16:16:44,890 INFO CopyFiles$ Copying: Z:\I\1978\05\25\1773233.004 to: ./preindex/1978/1773233.004
2017-06-20 16:16:44,905 INFO CopyFiles$ Copying: Z:\I\1978\05\25\1773233.005 to: ./preindex/1978/1773233.005
2017-06-20 16:16:44,905 INFO CopyFiles$ Processing DocNum: 1689093, FileYear: 1978, FileMd: 124, Files: List(Z:\I\1978\01\24\1689093.001, Z:\I\1978\01\24\1689093.002, Z:\I\1978\01\24\1689093.003, Z:\I\1978\01\24\1689093.004, Z:\I\1978\01\24\1689093.005)
2017-06-20 16:16:44,905 INFO CopyFiles$ Copying: Z:\I\1978\01\24\1689093.001 to: ./preindex/1978/1689093.001
2017-06-20 16:16:44,937 INFO CopyFiles$ Copying: Z:\I\1978\01\24\1689093.002 to: ./preindex/1978/1689093.002
2017-06-20 16:16:44,952 INFO CopyFiles$ Copying: Z:\I\1978\01\24\1689093.003 to: ./preindex/1978/1689093.003
2017-06-20 16:16:44,968 INFO CopyFiles$ Copying: Z:\I\1978\01\24\1689093.004 to: ./preindex/1978/1689093.004
2017-06-20 16:16:44,983 INFO CopyFiles$ Copying: Z:\I\1978\01\24\1689093.005 to: ./preindex/1978/1689093.005
2017-06-20 16:16:44,999 INFO CopyFiles$ Processing DocNum: 1861712, FileYear: 1978, FileMd: 922, Files: List(Z:\I\1978\09\22\1861712.001, Z:\I\1978\09\22\1861712.002)
2017-06-20 16:16:44,999 INFO CopyFiles$ Copying: Z:\I\1978\09\22\1861712.001 to: ./preindex/1978/1861712.001
2017-06-20 16:16:45,015 INFO CopyFiles$ Copying: Z:\I\1978\09\22\1861712.002 to: ./preindex/1978/1861712.002
2017-06-20 16:16:45,030 INFO CopyFiles$ Processing DocNum: 1852926, FileYear: 1978, FileMd: 913, Files: List(Z:\I\1978\09\13\1852926.001, Z:\I\1978\09\13\1852926.002, Z:\I\1978\09\13\1852926.003, Z:\I\1978\09\13\1852926.004, Z:\I\1978\09\13\1852926.005)
2017-06-20 16:16:45,030 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1852926.001 to: ./preindex/1978/1852926.001
2017-06-20 16:16:45,030 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1852926.002 to: ./preindex/1978/1852926.002
2017-06-20 16:16:45,046 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1852926.003 to: ./preindex/1978/1852926.003
2017-06-20 16:16:45,046 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1852926.004 to: ./preindex/1978/1852926.004
2017-06-20 16:16:45,046 INFO CopyFiles$ Copying: Z:\I\1978\09\13\1852926.005 to: ./preindex/1978/1852926.005
2017-06-20 16:16:45,061 INFO CopyFiles$ Processing DocNum: 1776176, FileYear: 1978, FileMd: 531, Files: List(Z:\I\1978\05\31\1776176.001, Z:\I\1978\05\31\1776176.002, Z:\I\1978\05\31\1776176.003)
2017-06-20 16:16:45,061 INFO CopyFiles$ Copying: Z:\I\1978\05\31\1776176.001 to: ./preindex/1978/1776176.001
2017-06-20 16:16:45,077 INFO CopyFiles$ Copying: Z:\I\1978\05\31\1776176.002 to: ./preindex/1978/1776176.002
2017-06-20 16:16:45,077 INFO CopyFiles$ Copying: Z:\I\1978\05\31\1776176.003 to: ./preindex/1978/1776176.003
2017-06-20 16:16:45,093 INFO CopyFiles$ Processing DocNum: 1692363, FileYear: 1978, FileMd: 130, Files: List(Z:\I\1978\01\30\1692363.001, Z:\I\1978\01\30\1692363.002, Z:\I\1978\01\30\1692363.003)
2017-06-20 16:16:45,093 INFO CopyFiles$ Copying: Z:\I\1978\01\30\1692363.001 to: ./preindex/1978/1692363.001
2017-06-20 16:16:45,108 INFO CopyFiles$ Copying: Z:\I\1978\01\30\1692363.002 to: ./preindex/1978/1692363.002
2017-06-20 16:16:45,124 INFO CopyFiles$ Copying: Z:\I\1978\01\30\1692363.003 to: ./preindex/1978/1692363.003
2017-06-20 16:16:45,155 INFO CopyFiles$ Processing DocNum: 1691861, FileYear: 1978, FileMd: 127, Files: List(Z:\I\1978\01\27\1691861.001, Z:\I\1978\01\27\1691861.002, Z:\I\1978\01\27\1691861.003, Z:\I\1978\01\27\1691861.004)
2017-06-20 16:16:45,155 INFO CopyFiles$ Copying: Z:\I\1978\01\27\1691861.001 to: ./preindex/1978/1691861.001
2017-06-20 16:16:45,171 INFO CopyFiles$ Copying: Z:\I\1978\01\27\1691861.002 to: ./preindex/1978/1691861.002
2017-06-20 16:16:45,171 INFO CopyFiles$ Copying: Z:\I\1978\01\27\1691861.003 to: ./preindex/1978/1691861.003
2017-06-20 16:16:45,186 INFO CopyFiles$ Copying: Z:\I\1978\01\27\1691861.004 to: ./preindex/1978/1691861.004
2017-06-20 16:16:45,186 INFO CopyFiles$ Processing DocNum: 1885473, FileYear: 1978, FileMd: 1026, Files: List(Z:\I\1978\10\26\1885473.001, Z:\I\1978\10\26\1885473.002)
2017-06-20 16:16:45,202 INFO CopyFiles$ Copying: Z:\I\1978\10\26\1885473.001 to: ./preindex/1978/1885473.001
2017-06-20 16:16:45,202 INFO CopyFiles$ Copying: Z:\I\1978\10\26\1885473.002 to: ./preindex/1978/1885473.002
2017-06-20 16:16:45,217 INFO CopyFiles$ Processing DocNum: 1746182, FileYear: 1978, FileMd: 419, Files: List(Z:\I\1978\04\19\1746182.001, Z:\I\1978\04\19\1746182.002, Z:\I\1978\04\19\1746182.003, Z:\I\1978\04\19\1746182.004, Z:\I\1978\04\19\1746182.005)
2017-06-20 16:16:45,217 INFO CopyFiles$ Copying: Z:\I\1978\04\19\1746182.001 to: ./preindex/1978/1746182.001
2017-06-20 16:16:45,249 INFO CopyFiles$ Copying: Z:\I\1978\04\19\1746182.002 to: ./preindex/1978/1746182.002
2017-06-20 16:16:45,249 INFO CopyFiles$ Copying: Z:\I\1978\04\19\1746182.003 to: ./preindex/1978/1746182.003
2017-06-20 16:16:45,264 INFO CopyFiles$ Copying: Z:\I\1978\04\19\1746182.004 to: ./preindex/1978/1746182.004
2017-06-20 16:16:45,280 INFO CopyFiles$ Copying: Z:\I\1978\04\19\1746182.005 to: ./preindex/1978/1746182.005
2017-06-20 16:16:45,295 INFO CopyFiles$ Processing DocNum: 1772799, FileYear: 1978, FileMd: 524, Files: List(Z:\I\1978\05\24\1772799.001, Z:\I\1978\05\24\1772799.002)
2017-06-20 16:16:45,295 INFO CopyFiles$ Copying: Z:\I\1978\05\24\1772799.001 to: ./preindex/1978/1772799.001
2017-06-20 16:16:45,327 INFO CopyFiles$ Copying: Z:\I\1978\05\24\1772799.002 to: ./preindex/1978/1772799.002
2017-06-20 16:16:45,342 INFO CopyFiles$ Processing DocNum: 1780890, FileYear: 1978, FileMd: 607, Files: List(Z:\I\1978\06\07\1780890.001, Z:\I\1978\06\07\1780890.002)
2017-06-20 16:16:45,342 INFO CopyFiles$ Copying: Z:\I\1978\06\07\1780890.001 to: ./preindex/1978/1780890.001
2017-06-20 16:16:45,342 INFO CopyFiles$ Copying: Z:\I\1978\06\07\1780890.002 to: ./preindex/1978/1780890.002
2017-06-20 16:16:45,358 INFO CopyFiles$ Processing DocNum: 1712122, FileYear: 1978, FileMd: 301, Files: List(Z:\I\1978\03\01\1712122.001, Z:\I\1978\03\01\1712122.002, Z:\I\1978\03\01\1712122.003, Z:\I\1978\03\01\1712122.004, Z:\I\1978\03\01\1712122.005, Z:\I\1978\03\01\1712122.006, Z:\I\1978\03\01\1712122.007, Z:\I\1978\03\01\1712122.008)
2017-06-20 16:16:45,358 INFO CopyFiles$ Copying: Z:\I\1978\03\01\1712122.001 to: ./preindex/1978/1712122.001
2017-06-20 16:16:45,373 INFO CopyFiles$ Copying: Z:\I\1978\03\01\1712122.002 to: ./preindex/1978/1712122.002
2017-06-20 16:16:45,389 INFO CopyFiles$ Copying: Z:\I\1978\03\01\1712122.003 to: ./preindex/1978/1712122.003
2017-06-20 16:16:45,405 INFO CopyFiles$ Copying: Z:\I\1978\03\01\1712122.004 to: ./preindex/1978/1712122.004
2017-06-20 16:16:45,420 INFO CopyFiles$ Copying: Z:\I\1978\03\01\1712122.005 to: ./preindex/1978/1712122.005
2017-06-20 16:16:45,420 INFO CopyFiles$ Copying: Z:\I\1978\03\01\1712122.006 to: ./preindex/1978/1712122.006
2017-06-20 16:16:45,436 INFO CopyFiles$ Copying: Z:\I\1978\03\01\1712122.007 to: ./preindex/1978/1712122.007
2017-06-20 16:16:45,483 INFO CopyFiles$ Copying: Z:\I\1978\03\01\1712122.008 to: ./preindex/1978/1712122.008
2017-06-20 16:16:45,483 INFO CopyFiles$ Processing DocNum: 1683772, FileYear: 1978, FileMd: 116, Files: List(Z:\I\1978\01\16\1683772.001, Z:\I\1978\01\16\1683772.002)
2017-06-20 16:16:45,483 INFO CopyFiles$ Copying: Z:\I\1978\01\16\1683772.001 to: ./preindex/1978/1683772.001
2017-06-20 16:16:45,498 INFO CopyFiles$ Copying: Z:\I\1978\01\16\1683772.002 to: ./preindex/1978/1683772.002
2017-06-20 16:16:45,514 INFO CopyFiles$ Processing DocNum: 1805316, FileYear: 1978, FileMd: 711, Files: List(Z:\I\1978\07\11\1805316.001, Z:\I\1978\07\11\1805316.002)
2017-06-20 16:16:45,514 INFO CopyFiles$ Copying: Z:\I\1978\07\11\1805316.001 to: ./preindex/1978/1805316.001
2017-06-20 16:16:45,529 INFO CopyFiles$ Copying: Z:\I\1978\07\11\1805316.002 to: ./preindex/1978/1805316.002
2017-06-20 16:16:45,545 INFO CopyFiles$ Processing DocNum: 1679698, FileYear: 1978, FileMd: 109, Files: List(Z:\I\1978\01\09\1679698.001, Z:\I\1978\01\09\1679698.002, Z:\I\1978\01\09\1679698.003, Z:\I\1978\01\09\1679698.004, Z:\I\1978\01\09\1679698.005)
2017-06-20 16:16:45,545 INFO CopyFiles$ Copying: Z:\I\1978\01\09\1679698.001 to: ./preindex/1978/1679698.001
2017-06-20 16:16:45,561 INFO CopyFiles$ Copying: Z:\I\1978\01\09\1679698.002 to: ./preindex/1978/1679698.002
2017-06-20 16:16:45,576 INFO CopyFiles$ Copying: Z:\I\1978\01\09\1679698.003 to: ./preindex/1978/1679698.003
2017-06-20 16:16:45,607 INFO CopyFiles$ Copying: Z:\I\1978\01\09\1679698.004 to: ./preindex/1978/1679698.004
2017-06-20 16:16:45,607 INFO CopyFiles$ Copying: Z:\I\1978\01\09\1679698.005 to: ./preindex/1978/1679698.005
2017-06-20 16:16:45,639 INFO CopyFiles$ Processing DocNum: 1820212, FileYear: 1978, FileMd: 731, Files: List(Z:\I\1978\07\31\1820212.001, Z:\I\1978\07\31\1820212.002, Z:\I\1978\07\31\1820212.003, Z:\I\1978\07\31\1820212.004)
2017-06-20 16:16:45,639 INFO CopyFiles$ Copying: Z:\I\1978\07\31\1820212.001 to: ./preindex/1978/1820212.001
2017-06-20 16:16:45,639 INFO CopyFiles$ Copying: Z:\I\1978\07\31\1820212.002 to: ./preindex/1978/1820212.002
2017-06-20 16:16:45,654 INFO CopyFiles$ Copying: Z:\I\1978\07\31\1820212.003 to: ./preindex/1978/1820212.003
2017-06-20 16:16:45,654 INFO CopyFiles$ Copying: Z:\I\1978\07\31\1820212.004 to: ./preindex/1978/1820212.004
2017-06-20 16:16:45,670 INFO CopyFiles$ Processing DocNum: 1774406, FileYear: 1978, FileMd: 526, Files: List(Z:\I\1978\05\26\1774406.001, Z:\I\1978\05\26\1774406.002, Z:\I\1978\05\26\1774406.003)
2017-06-20 16:16:45,670 INFO CopyFiles$ Copying: Z:\I\1978\05\26\1774406.001 to: ./preindex/1978/1774406.001
2017-06-20 16:16:45,685 INFO CopyFiles$ Copying: Z:\I\1978\05\26\1774406.002 to: ./preindex/1978/1774406.002
2017-06-20 16:16:45,685 INFO CopyFiles$ Copying: Z:\I\1978\05\26\1774406.003 to: ./preindex/1978/1774406.003
2017-06-20 16:16:45,701 INFO CopyFiles$ Processing DocNum: 1803807, FileYear: 1978, FileMd: 710, Files: List(Z:\I\1978\07\10\1803807.001, Z:\I\1978\07\10\1803807.002, Z:\I\1978\07\10\1803807.003)
2017-06-20 16:16:45,701 INFO CopyFiles$ Copying: Z:\I\1978\07\10\1803807.001 to: ./preindex/1978/1803807.001
2017-06-20 16:16:45,701 INFO CopyFiles$ Copying: Z:\I\1978\07\10\1803807.002 to: ./preindex/1978/1803807.002
2017-06-20 16:16:45,717 INFO CopyFiles$ Copying: Z:\I\1978\07\10\1803807.003 to: ./preindex/1978/1803807.003
2017-06-20 16:16:45,717 INFO CopyFiles$ Processing DocNum: 1827132, FileYear: 1978, FileMd: 808, Files: List(Z:\I\1978\08\08\1827132.001, Z:\I\1978\08\08\1827132.002, Z:\I\1978\08\08\1827132.003, Z:\I\1978\08\08\1827132.004)
2017-06-20 16:16:45,732 INFO CopyFiles$ Copying: Z:\I\1978\08\08\1827132.001 to: ./preindex/1978/1827132.001
2017-06-20 16:16:45,732 INFO CopyFiles$ Copying: Z:\I\1978\08\08\1827132.002 to: ./preindex/1978/1827132.002
2017-06-20 16:16:45,748 INFO CopyFiles$ Copying: Z:\I\1978\08\08\1827132.003 to: ./preindex/1978/1827132.003
2017-06-20 16:16:45,748 INFO CopyFiles$ Copying: Z:\I\1978\08\08\1827132.004 to: ./preindex/1978/1827132.004
2017-06-20 16:16:45,763 INFO CopyFiles$ Processing DocNum: 1702895, FileYear: 1978, FileMd: 215, Files: List(Z:\I\1978\02\15\1702895.001, Z:\I\1978\02\15\1702895.002, Z:\I\1978\02\15\1702895.003)
2017-06-20 16:16:45,763 INFO CopyFiles$ Copying: Z:\I\1978\02\15\1702895.001 to: ./preindex/1978/1702895.001
2017-06-20 16:16:45,779 INFO CopyFiles$ Copying: Z:\I\1978\02\15\1702895.002 to: ./preindex/1978/1702895.002
2017-06-20 16:16:45,795 INFO CopyFiles$ Copying: Z:\I\1978\02\15\1702895.003 to: ./preindex/1978/1702895.003
2017-06-20 16:16:45,810 INFO CopyFiles$ Processing DocNum: 1705617, FileYear: 1978, FileMd: 222, Files: List(Z:\I\1978\02\22\1705617.001, Z:\I\1978\02\22\1705617.002, Z:\I\1978\02\22\1705617.003, Z:\I\1978\02\22\1705617.004, Z:\I\1978\02\22\1705617.005)
2017-06-20 16:16:45,810 INFO CopyFiles$ Copying: Z:\I\1978\02\22\1705617.001 to: ./preindex/1978/1705617.001
2017-06-20 16:16:45,826 INFO CopyFiles$ Copying: Z:\I\1978\02\22\1705617.002 to: ./preindex/1978/1705617.002
2017-06-20 16:16:45,826 INFO CopyFiles$ Copying: Z:\I\1978\02\22\1705617.003 to: ./preindex/1978/1705617.003
2017-06-20 16:16:45,841 INFO CopyFiles$ Copying: Z:\I\1978\02\22\1705617.004 to: ./preindex/1978/1705617.004
2017-06-20 16:16:45,841 INFO CopyFiles$ Copying: Z:\I\1978\02\22\1705617.005 to: ./preindex/1978/1705617.005
2017-06-20 16:16:45,841 INFO CopyFiles$ Processing DocNum: 1927168, FileYear: 1978, FileMd: 1229, Files: List(Z:\I\1978\12\29\1927168.001, Z:\I\1978\12\29\1927168.002)
2017-06-20 16:16:45,857 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927168.001 to: ./preindex/1978/1927168.001
2017-06-20 16:16:45,857 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927168.002 to: ./preindex/1978/1927168.002
2017-06-20 16:16:45,873 INFO CopyFiles$ Processing DocNum: 1927167, FileYear: 1978, FileMd: 1229, Files: List(Z:\I\1978\12\29\1927167.001)
2017-06-20 16:16:45,873 INFO CopyFiles$ Copying: Z:\I\1978\12\29\1927167.001 to: ./preindex/1978/1927167.001
2017-06-20 16:16:45,888 INFO CopyFiles$ Processing DocNum: 1914267, FileYear: 1978, FileMd: 1212, Files: List(Z:\I\1978\12\12\1914267.001, Z:\I\1978\12\12\1914267.002, Z:\I\1978\12\12\1914267.003, Z:\I\1978\12\12\1914267.004, Z:\I\1978\12\12\1914267.005, Z:\I\1978\12\12\1914267.006)
2017-06-20 16:16:45,888 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914267.001 to: ./preindex/1978/1914267.001
2017-06-20 16:16:45,904 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914267.002 to: ./preindex/1978/1914267.002
2017-06-20 16:16:45,904 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914267.003 to: ./preindex/1978/1914267.003
2017-06-20 16:16:45,904 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914267.004 to: ./preindex/1978/1914267.004
2017-06-20 16:16:45,919 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914267.005 to: ./preindex/1978/1914267.005
2017-06-20 16:16:45,919 INFO CopyFiles$ Copying: Z:\I\1978\12\12\1914267.006 to: ./preindex/1978/1914267.006
2017-06-20 16:16:45,919 INFO CopyFiles$ Processing DocNum: 1678506, FileYear: 1978, FileMd: 106, Files: List(Z:\I\1978\01\06\1678506.001, Z:\I\1978\01\06\1678506.002, Z:\I\1978\01\06\1678506.003)
2017-06-20 16:16:45,935 INFO CopyFiles$ Copying: Z:\I\1978\01\06\1678506.001 to: ./preindex/1978/1678506.001
2017-06-20 16:16:45,951 INFO CopyFiles$ Copying: Z:\I\1978\01\06\1678506.002 to: ./preindex/1978/1678506.002
2017-06-20 16:16:45,966 INFO CopyFiles$ Copying: Z:\I\1978\01\06\1678506.003 to: ./preindex/1978/1678506.003
2017-06-20 16:16:45,997 INFO CopyFiles$ Processing DocNum: 1713330, FileYear: 1978, FileMd: 303, Files: List(Z:\I\1978\03\03\1713330.001, Z:\I\1978\03\03\1713330.002, Z:\I\1978\03\03\1713330.003, Z:\I\1978\03\03\1713330.004, Z:\I\1978\03\03\1713330.005)
2017-06-20 16:16:45,997 INFO CopyFiles$ Copying: Z:\I\1978\03\03\1713330.001 to: ./preindex/1978/1713330.001
2017-06-20 16:16:46,013 INFO CopyFiles$ Copying: Z:\I\1978\03\03\1713330.002 to: ./preindex/1978/1713330.002
2017-06-20 16:16:46,029 INFO CopyFiles$ Copying: Z:\I\1978\03\03\1713330.003 to: ./preindex/1978/1713330.003
2017-06-20 16:16:46,029 INFO CopyFiles$ Copying: Z:\I\1978\03\03\1713330.004 to: ./preindex/1978/1713330.004
2017-06-20 16:16:46,044 INFO CopyFiles$ Copying: Z:\I\1978\03\03\1713330.005 to: ./preindex/1978/1713330.005
2017-06-20 16:16:46,044 INFO CopyFiles$ Processing DocNum: 1709036, FileYear: 1978, FileMd: 224, Files: List(Z:\I\1978\02\24\1709036.001, Z:\I\1978\02\24\1709036.002, Z:\I\1978\02\24\1709036.003, Z:\I\1978\02\24\1709036.004, Z:\I\1978\02\24\1709036.005)
2017-06-20 16:16:46,044 INFO CopyFiles$ Copying: Z:\I\1978\02\24\1709036.001 to: ./preindex/1978/1709036.001
2017-06-20 16:16:46,060 INFO CopyFiles$ Copying: Z:\I\1978\02\24\1709036.002 to: ./preindex/1978/1709036.002
2017-06-20 16:16:46,075 INFO CopyFiles$ Copying: Z:\I\1978\02\24\1709036.003 to: ./preindex/1978/1709036.003
2017-06-20 16:16:46,091 INFO CopyFiles$ Copying: Z:\I\1978\02\24\1709036.004 to: ./preindex/1978/1709036.004
2017-06-20 16:16:46,107 INFO CopyFiles$ Copying: Z:\I\1978\02\24\1709036.005 to: ./preindex/1978/1709036.005
2017-06-20 16:16:46,122 INFO CopyFiles$ Processing DocNum: 1831903, FileYear: 1978, FileMd: 814, Files: List(Z:\I\1978\08\14\1831903.001, Z:\I\1978\08\14\1831903.002, Z:\I\1978\08\14\1831903.003, Z:\I\1978\08\14\1831903.004)
2017-06-20 16:16:46,122 INFO CopyFiles$ Copying: Z:\I\1978\08\14\1831903.001 to: ./preindex/1978/1831903.001
2017-06-20 16:16:46,138 INFO CopyFiles$ Copying: Z:\I\1978\08\14\1831903.002 to: ./preindex/1978/1831903.002
2017-06-20 16:16:46,153 INFO CopyFiles$ Copying: Z:\I\1978\08\14\1831903.003 to: ./preindex/1978/1831903.003
2017-06-20 16:16:46,153 INFO CopyFiles$ Copying: Z:\I\1978\08\14\1831903.004 to: ./preindex/1978/1831903.004
2017-06-20 16:16:46,169 INFO CopyFiles$ Processing DocNum: 1695757, FileYear: 1978, FileMd: 203, Files: List(Z:\I\1978\02\03\1695757.001, Z:\I\1978\02\03\1695757.002, Z:\I\1978\02\03\1695757.003, Z:\I\1978\02\03\1695757.004)
2017-06-20 16:16:46,169 INFO CopyFiles$ Copying: Z:\I\1978\02\03\1695757.001 to: ./preindex/1978/1695757.001
2017-06-20 16:16:46,200 INFO CopyFiles$ Copying: Z:\I\1978\02\03\1695757.002 to: ./preindex/1978/1695757.002
2017-06-20 16:16:46,216 INFO CopyFiles$ Copying: Z:\I\1978\02\03\1695757.003 to: ./preindex/1978/1695757.003
2017-06-20 16:16:46,231 INFO CopyFiles$ Copying: Z:\I\1978\02\03\1695757.004 to: ./preindex/1978/1695757.004
2017-06-20 16:16:46,247 INFO CopyFiles$ Processing DocNum: 1743420, FileYear: 1978, FileMd: 414, Files: List(Z:\I\1978\04\14\1743420.001, Z:\I\1978\04\14\1743420.002, Z:\I\1978\04\14\1743420.003, Z:\I\1978\04\14\1743420.004)
2017-06-20 16:16:46,247 INFO CopyFiles$ Copying: Z:\I\1978\04\14\1743420.001 to: ./preindex/1978/1743420.001
2017-06-20 16:16:46,263 INFO CopyFiles$ Copying: Z:\I\1978\04\14\1743420.002 to: ./preindex/1978/1743420.002
2017-06-20 16:16:46,278 INFO CopyFiles$ Copying: Z:\I\1978\04\14\1743420.003 to: ./preindex/1978/1743420.003
2017-06-20 16:16:46,294 INFO CopyFiles$ Copying: Z:\I\1978\04\14\1743420.004 to: ./preindex/1978/1743420.004
2017-06-20 16:16:46,325 INFO CopyFiles$ Processing DocNum: 1893685, FileYear: 1978, FileMd: 1107, Files: List(Z:\I\1978\11\07\1893685.001, Z:\I\1978\11\07\1893685.002, Z:\I\1978\11\07\1893685.003, Z:\I\1978\11\07\1893685.004, Z:\I\1978\11\07\1893685.005)
2017-06-20 16:16:46,325 INFO CopyFiles$ Copying: Z:\I\1978\11\07\1893685.001 to: ./preindex/1978/1893685.001
2017-06-20 16:16:46,325 INFO CopyFiles$ Copying: Z:\I\1978\11\07\1893685.002 to: ./preindex/1978/1893685.002
2017-06-20 16:16:46,325 INFO CopyFiles$ Copying: Z:\I\1978\11\07\1893685.003 to: ./preindex/1978/1893685.003
2017-06-20 16:16:46,341 INFO CopyFiles$ Copying: Z:\I\1978\11\07\1893685.004 to: ./preindex/1978/1893685.004
2017-06-20 16:16:46,341 INFO CopyFiles$ Copying: Z:\I\1978\11\07\1893685.005 to: ./preindex/1978/1893685.005
2017-06-20 16:16:46,341 INFO CopyFiles$ Processing DocNum: 1762923, FileYear: 1978, FileMd: 511, Files: List(Z:\I\1978\05\11\1762923.001, Z:\I\1978\05\11\1762923.002)
2017-06-20 16:16:46,356 INFO CopyFiles$ Copying: Z:\I\1978\05\11\1762923.001 to: ./preindex/1978/1762923.001
2017-06-20 16:16:46,372 INFO CopyFiles$ Copying: Z:\I\1978\05\11\1762923.002 to: ./preindex/1978/1762923.002
2017-06-20 16:16:46,403 INFO CopyFiles$ Processing DocNum: 1823923, FileYear: 1978, FileMd: 803, Files: List(Z:\I\1978\08\03\1823923.001, Z:\I\1978\08\03\1823923.002, Z:\I\1978\08\03\1823923.003)
2017-06-20 16:16:46,403 INFO CopyFiles$ Copying: Z:\I\1978\08\03\1823923.001 to: ./preindex/1978/1823923.001
2017-06-20 16:16:46,419 INFO CopyFiles$ Copying: Z:\I\1978\08\03\1823923.002 to: ./preindex/1978/1823923.002
2017-06-20 16:16:46,419 INFO CopyFiles$ Copying: Z:\I\1978\08\03\1823923.003 to: ./preindex/1978/1823923.003
2017-06-20 16:16:46,434 INFO CopyFiles$ Processing DocNum: 1885436, FileYear: 1978, FileMd: 1026, Files: List(Z:\I\1978\10\26\1885436.001, Z:\I\1978\10\26\1885436.002, Z:\I\1978\10\26\1885436.003)
2017-06-20 16:16:46,434 INFO CopyFiles$ Copying: Z:\I\1978\10\26\1885436.001 to: ./preindex/1978/1885436.001
2017-06-20 16:16:46,434 INFO CopyFiles$ Copying: Z:\I\1978\10\26\1885436.002 to: ./preindex/1978/1885436.002
2017-06-20 16:16:46,450 INFO CopyFiles$ Copying: Z:\I\1978\10\26\1885436.003 to: ./preindex/1978/1885436.003
2017-06-20 16:16:46,450 INFO CopyFiles$ Processing DocNum: 1708304, FileYear: 1978, FileMd: 223, Files: List(Z:\I\1978\02\23\1708304.001, Z:\I\1978\02\23\1708304.002)
2017-06-20 16:16:46,450 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1708304.001 to: ./preindex/1978/1708304.001
2017-06-20 16:16:46,465 INFO CopyFiles$ Copying: Z:\I\1978\02\23\1708304.002 to: ./preindex/1978/1708304.002
2017-06-20 16:16:46,481 INFO CopyFiles$ Processing DocNum: 1831302, FileYear: 1978, FileMd: 815, Files: List(Z:\I\1978\08\15\1831302.001, Z:\I\1978\08\15\1831302.002, Z:\I\1978\08\15\1831302.003, Z:\I\1978\08\15\1831302.004)
2017-06-20 16:16:46,481 INFO CopyFiles$ Copying: Z:\I\1978\08\15\1831302.001 to: ./preindex/1978/1831302.001
2017-06-20 16:16:46,528 INFO CopyFiles$ Copying: Z:\I\1978\08\15\1831302.002 to: ./preindex/1978/1831302.002
2017-06-20 16:16:46,528 INFO CopyFiles$ Copying: Z:\I\1978\08\15\1831302.003 to: ./preindex/1978/1831302.003
2017-06-20 16:16:46,528 INFO CopyFiles$ Copying: Z:\I\1978\08\15\1831302.004 to: ./preindex/1978/1831302.004
2017-06-20 16:16:46,543 INFO CopyFiles$ Processing DocNum: 1818774, FileYear: 1978, FileMd: 728, Files: List(Z:\I\1978\07\28\1818774.001, Z:\I\1978\07\28\1818774.002, Z:\I\1978\07\28\1818774.003, Z:\I\1978\07\28\1818774.004, Z:\I\1978\07\28\1818774.005)
2017-06-20 16:16:46,543 INFO CopyFiles$ Copying: Z:\I\1978\07\28\1818774.001 to: ./preindex/1978/1818774.001
2017-06-20 16:16:46,559 INFO CopyFiles$ Copying: Z:\I\1978\07\28\1818774.002 to: ./preindex/1978/1818774.002
2017-06-20 16:16:46,575 INFO CopyFiles$ Copying: Z:\I\1978\07\28\1818774.003 to: ./preindex/1978/1818774.003
2017-06-20 16:16:46,575 INFO CopyFiles$ Copying: Z:\I\1978\07\28\1818774.004 to: ./preindex/1978/1818774.004
2017-06-20 16:16:46,590 INFO CopyFiles$ Copying: Z:\I\1978\07\28\1818774.005 to: ./preindex/1978/1818774.005
2017-06-20 16:16:46,590 INFO CopyFiles$ Processing DocNum: 1805568, FileYear: 1978, FileMd: 711, Files: List(Z:\I\1978\07\11\1805568.001, Z:\I\1978\07\11\1805568.002, Z:\I\1978\07\11\1805568.003)
2017-06-20 16:16:46,606 INFO CopyFiles$ Copying: Z:\I\1978\07\11\1805568.001 to: ./preindex/1978/1805568.001
2017-06-20 16:16:46,621 INFO CopyFiles$ Copying: Z:\I\1978\07\11\1805568.002 to: ./preindex/1978/1805568.002
2017-06-20 16:16:46,621 INFO CopyFiles$ Copying: Z:\I\1978\07\11\1805568.003 to: ./preindex/1978/1805568.003
2017-06-20 16:16:46,637 INFO CopyFiles$ Processing DocNum: 1808696, FileYear: 1978, FileMd: 714, Files: List(Z:\I\1978\07\14\1808696.001, Z:\I\1978\07\14\1808696.002)
2017-06-20 16:16:46,637 INFO CopyFiles$ Copying: Z:\I\1978\07\14\1808696.001 to: ./preindex/1978/1808696.001
2017-06-20 16:16:46,653 INFO CopyFiles$ Copying: Z:\I\1978\07\14\1808696.002 to: ./preindex/1978/1808696.002
2017-06-20 16:16:46,668 INFO CopyFiles$ Processing DocNum: 1885309, FileYear: 1978, FileMd: 1026, Files: List(Z:\I\1978\10\26\1885309.001, Z:\I\1978\10\26\1885309.002, Z:\I\1978\10\26\1885309.003)
2017-06-20 16:16:46,668 INFO CopyFiles$ Copying: Z:\I\1978\10\26\1885309.001 to: ./preindex/1978/1885309.001
2017-06-20 16:16:46,684 INFO CopyFiles$ Copying: Z:\I\1978\10\26\1885309.002 to: ./preindex/1978/1885309.002
2017-06-20 16:16:46,684 INFO CopyFiles$ Copying: Z:\I\1978\10\26\1885309.003 to: ./preindex/1978/1885309.003
2017-06-20 16:16:46,699 INFO CopyFiles$ Processing DocNum: 1862514, FileYear: 1978, FileMd: 925, Files: List(Z:\I\1978\09\25\1862514.001, Z:\I\1978\09\25\1862514.002, Z:\I\1978\09\25\1862514.003)
2017-06-20 16:16:46,699 INFO CopyFiles$ Copying: Z:\I\1978\09\25\1862514.001 to: ./preindex/1978/1862514.001
2017-06-20 16:16:46,715 INFO CopyFiles$ Copying: Z:\I\1978\09\25\1862514.002 to: ./preindex/1978/1862514.002
2017-06-20 16:16:46,715 INFO CopyFiles$ Copying: Z:\I\1978\09\25\1862514.003 to: ./preindex/1978/1862514.003
2017-06-20 16:16:46,731 INFO CopyFiles$ Processing DocNum: 1789566, FileYear: 1978, FileMd: 619, Files: List(Z:\I\1978\06\19\1789566.001, Z:\I\1978\06\19\1789566.002, Z:\I\1978\06\19\1789566.003, Z:\I\1978\06\19\1789566.004)
2017-06-20 16:16:46,731 INFO CopyFiles$ Copying: Z:\I\1978\06\19\1789566.001 to: ./preindex/1978/1789566.001
2017-06-20 16:16:46,746 INFO CopyFiles$ Copying: Z:\I\1978\06\19\1789566.002 to: ./preindex/1978/1789566.002
2017-06-20 16:16:46,762 INFO CopyFiles$ Copying: Z:\I\1978\06\19\1789566.003 to: ./preindex/1978/1789566.003
2017-06-20 16:16:46,762 INFO CopyFiles$ Copying: Z:\I\1978\06\19\1789566.004 to: ./preindex/1978/1789566.004
2017-06-20 16:16:46,777 INFO CopyFiles$ Processing DocNum: 1886212, FileYear: 1978, FileMd: 1027, Files: List(Z:\I\1978\10\27\1886212.001, Z:\I\1978\10\27\1886212.002)
2017-06-20 16:16:46,777 INFO CopyFiles$ Copying: Z:\I\1978\10\27\1886212.001 to: ./preindex/1978/1886212.001
2017-06-20 16:16:46,793 INFO CopyFiles$ Copying: Z:\I\1978\10\27\1886212.002 to: ./preindex/1978/1886212.002
2017-06-20 16:16:46,793 INFO CopyFiles$ Processing DocNum: 1696546, FileYear: 1978, FileMd: 203, Files: List(Z:\I\1978\02\03\1696546.001, Z:\I\1978\02\03\1696546.002, Z:\I\1978\02\03\1696546.003, Z:\I\1978\02\03\1696546.004)
2017-06-20 16:16:46,793 INFO CopyFiles$ Copying: Z:\I\1978\02\03\1696546.001 to: ./preindex/1978/1696546.001
2017-06-20 16:16:46,824 INFO CopyFiles$ Copying: Z:\I\1978\02\03\1696546.002 to: ./preindex/1978/1696546.002
2017-06-20 16:16:46,840 INFO CopyFiles$ Copying: Z:\I\1978\02\03\1696546.003 to: ./preindex/1978/1696546.003
2017-06-20 16:16:46,855 INFO CopyFiles$ Copying: Z:\I\1978\02\03\1696546.004 to: ./preindex/1978/1696546.004
2017-06-20 16:16:46,871 INFO CopyFiles$ Processing DocNum: 1872197, FileYear: 1978, FileMd: 1006, Files: List(Z:\I\1978\10\06\1872197.001, Z:\I\1978\10\06\1872197.002)
2017-06-20 16:16:46,871 INFO CopyFiles$ Copying: Z:\I\1978\10\06\1872197.001 to: ./preindex/1978/1872197.001
2017-06-20 16:16:46,887 INFO CopyFiles$ Copying: Z:\I\1978\10\06\1872197.002 to: ./preindex/1978/1872197.002
2017-06-20 16:16:46,902 INFO CopyFiles$ Processing DocNum: 1843922, FileYear: 1978, FileMd: 830, Files: List(Z:\I\1978\08\30\1843922.001, Z:\I\1978\08\30\1843922.002)
2017-06-20 16:16:46,902 INFO CopyFiles$ Copying: Z:\I\1978\08\30\1843922.001 to: ./preindex/1978/1843922.001
2017-06-20 16:16:46,918 INFO CopyFiles$ Copying: Z:\I\1978\08\30\1843922.002 to: ./preindex/1978/1843922.002
2017-06-20 16:16:46,933 INFO CopyFiles$ Processing DocNum: 1868614, FileYear: 1978, FileMd: 1003, Files: List(Z:\I\1978\10\03\1868614.001, Z:\I\1978\10\03\1868614.002, Z:\I\1978\10\03\1868614.003, Z:\I\1978\10\03\1868614.004, Z:\I\1978\10\03\1868614.005)
2017-06-20 16:16:46,933 INFO CopyFiles$ Copying: Z:\I\1978\10\03\1868614.001 to: ./preindex/1978/1868614.001
2017-06-20 16:16:46,949 INFO CopyFiles$ Copying: Z:\I\1978\10\03\1868614.002 to: ./preindex/1978/1868614.002
2017-06-20 16:16:46,965 INFO CopyFiles$ Copying: Z:\I\1978\10\03\1868614.003 to: ./preindex/1978/1868614.003
2017-06-20 16:16:46,965 INFO CopyFiles$ Copying: Z:\I\1978\10\03\1868614.004 to: ./preindex/1978/1868614.004
2017-06-20 16:16:46,965 INFO CopyFiles$ Copying: Z:\I\1978\10\03\1868614.005 to: ./preindex/1978/1868614.005
2017-06-20 16:16:46,980 INFO CopyFiles$ Processing DocNum: 1783330, FileYear: 1978, FileMd: 609, Files: List(Z:\I\1978\06\09\1783330.001, Z:\I\1978\06\09\1783330.002, Z:\I\1978\06\09\1783330.003)
2017-06-20 16:16:46,980 INFO CopyFiles$ Copying: Z:\I\1978\06\09\1783330.001 to: ./preindex/1978/1783330.001
2017-06-20 16:16:46,996 INFO CopyFiles$ Copying: Z:\I\1978\06\09\1783330.002 to: ./preindex/1978/1783330.002
2017-06-20 16:16:47,011 INFO CopyFiles$ Copying: Z:\I\1978\06\09\1783330.003 to: ./preindex/1978/1783330.003
2017-06-20 16:16:47,027 INFO CopyFiles$ Processing DocNum: 1790163, FileYear: 1978, FileMd: 620, Files: List(Z:\I\1978\06\20\1790163.001, Z:\I\1978\06\20\1790163.002)
2017-06-20 16:16:47,027 INFO CopyFiles$ Copying: Z:\I\1978\06\20\1790163.001 to: ./preindex/1978/1790163.001
2017-06-20 16:16:47,043 INFO CopyFiles$ Copying: Z:\I\1978\06\20\1790163.002 to: ./preindex/1978/1790163.002
2017-06-20 16:16:47,058 INFO CopyFiles$ Processing DocNum: 1900532, FileYear: 1978, FileMd: 1116, Files: List(Z:\I\1978\11\16\1900532.001, Z:\I\1978\11\16\1900532.002, Z:\I\1978\11\16\1900532.003)
2017-06-20 16:16:47,058 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900532.001 to: ./preindex/1978/1900532.001
2017-06-20 16:16:47,074 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900532.002 to: ./preindex/1978/1900532.002
2017-06-20 16:16:47,074 INFO CopyFiles$ Copying: Z:\I\1978\11\16\1900532.003 to: ./preindex/1978/1900532.003
2017-06-20 16:16:47,074 INFO CopyFiles$ Processing DocNum: 1721892, FileYear: 1978, FileMd: 315, Files: List(Z:\I\1978\03\15\1721892.001, Z:\I\1978\03\15\1721892.002, Z:\I\1978\03\15\1721892.003, Z:\I\1978\03\15\1721892.004)
2017-06-20 16:16:47,074 INFO CopyFiles$ Copying: Z:\I\1978\03\15\1721892.001 to: ./preindex/1978/1721892.001
2017-06-20 16:16:47,089 INFO CopyFiles$ Copying: Z:\I\1978\03\15\1721892.002 to: ./preindex/1978/1721892.002
2017-06-20 16:16:47,105 INFO CopyFiles$ Copying: Z:\I\1978\03\15\1721892.003 to: ./preindex/1978/1721892.003
2017-06-20 16:16:47,105 INFO CopyFiles$ Copying: Z:\I\1978\03\15\1721892.004 to: ./preindex/1978/1721892.004
2017-06-20 16:16:47,121 INFO CopyFiles$ Processing DocNum: 1825000, FileYear: 1978, FileMd: 804, Files: List(Z:\I\1978\08\04\1825000.001, Z:\I\1978\08\04\1825000.002, Z:\I\1978\08\04\1825000.003, Z:\I\1978\08\04\1825000.004, Z:\I\1978\08\04\1825000.005, Z:\I\1978\08\04\1825000.006, Z:\I\1978\08\04\1825000.007, Z:\I\1978\08\04\1825000.008, Z:\I\1978\08\04\1825000.009, Z:\I\1978\08\04\1825000.010, Z:\I\1978\08\04\1825000.011, Z:\I\1978\08\04\1825000.012)
2017-06-20 16:16:47,121 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825000.001 to: ./preindex/1978/1825000.001
2017-06-20 16:16:47,136 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825000.002 to: ./preindex/1978/1825000.002
2017-06-20 16:16:47,152 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825000.003 to: ./preindex/1978/1825000.003
2017-06-20 16:16:47,152 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825000.004 to: ./preindex/1978/1825000.004
2017-06-20 16:16:47,152 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825000.005 to: ./preindex/1978/1825000.005
2017-06-20 16:16:47,167 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825000.006 to: ./preindex/1978/1825000.006
2017-06-20 16:16:47,167 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825000.007 to: ./preindex/1978/1825000.007
2017-06-20 16:16:47,167 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825000.008 to: ./preindex/1978/1825000.008
2017-06-20 16:16:47,183 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825000.009 to: ./preindex/1978/1825000.009
2017-06-20 16:16:47,183 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825000.010 to: ./preindex/1978/1825000.010
2017-06-20 16:16:47,199 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825000.011 to: ./preindex/1978/1825000.011
2017-06-20 16:16:47,199 INFO CopyFiles$ Copying: Z:\I\1978\08\04\1825000.012 to: ./preindex/1978/1825000.012
2017-06-20 16:16:47,214 INFO CopyFiles$ Processing DocNum: 1753450, FileYear: 1978, FileMd: 428, Files: List(Z:\I\1978\04\28\1753450.001, Z:\I\1978\04\28\1753450.002, Z:\I\1978\04\28\1753450.003, Z:\I\1978\04\28\1753450.004)
2017-06-20 16:16:47,214 INFO CopyFiles$ Copying: Z:\I\1978\04\28\1753450.001 to: ./preindex/1978/1753450.001
2017-06-20 16:16:47,214 INFO CopyFiles$ Copying: Z:\I\1978\04\28\1753450.002 to: ./preindex/1978/1753450.002
2017-06-20 16:16:47,230 INFO CopyFiles$ Copying: Z:\I\1978\04\28\1753450.003 to: ./preindex/1978/1753450.003
2017-06-20 16:16:47,230 INFO CopyFiles$ Copying: Z:\I\1978\04\28\1753450.004 to: ./preindex/1978/1753450.004
2017-06-20 16:16:47,245 INFO CopyFiles$ Processing DocNum: 1759027, FileYear: 1978, FileMd: 424, Files: List(Z:\I\1978\04\24\1759027.001, Z:\I\1978\04\24\1759027.002, Z:\I\1978\04\24\1759027.003, Z:\I\1978\04\24\1759027.004, Z:\I\1978\04\24\1759027.005, Z:\I\1978\04\24\1759027.006)
2017-06-20 16:16:47,245 INFO CopyFiles$ Copying: Z:\I\1978\04\24\1759027.001 to: ./preindex/1978/1759027.001
2017-06-20 16:16:47,245 INFO CopyFiles$ Copying: Z:\I\1978\04\24\1759027.002 to: ./preindex/1978/1759027.002
2017-06-20 16:16:47,261 INFO CopyFiles$ Copying: Z:\I\1978\04\24\1759027.003 to: ./preindex/1978/1759027.003
2017-06-20 16:16:47,261 INFO CopyFiles$ Copying: Z:\I\1978\04\24\1759027.004 to: ./preindex/1978/1759027.004
2017-06-20 16:16:47,277 INFO CopyFiles$ Copying: Z:\I\1978\04\24\1759027.005 to: ./preindex/1978/1759027.005
2017-06-20 16:16:47,277 INFO CopyFiles$ Copying: Z:\I\1978\04\24\1759027.006 to: ./preindex/1978/1759027.006
2017-06-20 16:16:47,292 INFO CopyFiles$ Processing DocNum: 1819773, FileYear: 1978, FileMd: 731, Files: List(Z:\I\1978\07\31\1819773.001, Z:\I\1978\07\31\1819773.002, Z:\I\1978\07\31\1819773.003)
2017-06-20 16:16:47,292 INFO CopyFiles$ Copying: Z:\I\1978\07\31\1819773.001 to: ./preindex/1978/1819773.001
2017-06-20 16:16:47,308 INFO CopyFiles$ Copying: Z:\I\1978\07\31\1819773.002 to: ./preindex/1978/1819773.002
2017-06-20 16:16:47,323 INFO CopyFiles$ Copying: Z:\I\1978\07\31\1819773.003 to: ./preindex/1978/1819773.003
2017-06-20 16:16:47,323 INFO CopyFiles$ Processing DocNum: 1842645, FileYear: 1978, FileMd: 829, Files: List(Z:\I\1978\08\29\1842645.001, Z:\I\1978\08\29\1842645.002, Z:\I\1978\08\29\1842645.003, Z:\I\1978\08\29\1842645.004, Z:\I\1978\08\29\1842645.005)
2017-06-20 16:16:47,323 INFO CopyFiles$ Copying: Z:\I\1978\08\29\1842645.001 to: ./preindex/1978/1842645.001
2017-06-20 16:16:47,339 INFO CopyFiles$ Copying: Z:\I\1978\08\29\1842645.002 to: ./preindex/1978/1842645.002
2017-06-20 16:16:47,355 INFO CopyFiles$ Copying: Z:\I\1978\08\29\1842645.003 to: ./preindex/1978/1842645.003
2017-06-20 16:16:47,370 INFO CopyFiles$ Copying: Z:\I\1978\08\29\1842645.004 to: ./preindex/1978/1842645.004
2017-06-20 16:16:47,386 INFO CopyFiles$ Copying: Z:\I\1978\08\29\1842645.005 to: ./preindex/1978/1842645.005
2017-06-20 16:16:47,401 INFO CopyFiles$ Processing DocNum: 1789037, FileYear: 1978, FileMd: 616, Files: List(Z:\I\1978\06\16\1789037.001, Z:\I\1978\06\16\1789037.002, Z:\I\1978\06\16\1789037.003, Z:\I\1978\06\16\1789037.004, Z:\I\1978\06\16\1789037.005, Z:\I\1978\06\16\1789037.006, Z:\I\1978\06\16\1789037.007, Z:\I\1978\06\16\1789037.008, Z:\I\1978\06\16\1789037.009, Z:\I\1978\06\16\1789037.010, Z:\I\1978\06\16\1789037.011)
2017-06-20 16:16:47,401 INFO CopyFiles$ Copying: Z:\I\1978\06\16\1789037.001 to: ./preindex/1978/1789037.001
2017-06-20 16:16:47,433 INFO CopyFiles$ Copying: Z:\I\1978\06\16\1789037.002 to: ./preindex/1978/1789037.002
2017-06-20 16:16:47,448 INFO CopyFiles$ Copying: Z:\I\1978\06\16\1789037.003 to: ./preindex/1978/1789037.003
2017-06-20 16:16:47,464 INFO CopyFiles$ Copying: Z:\I\1978\06\16\1789037.004 to: ./preindex/1978/1789037.004
2017-06-20 16:16:47,479 INFO CopyFiles$ Copying: Z:\I\1978\06\16\1789037.005 to: ./preindex/1978/1789037.005
2017-06-20 16:16:47,495 INFO CopyFiles$ Copying: Z:\I\1978\06\16\1789037.006 to: ./preindex/1978/1789037.006
2017-06-20 16:16:47,511 INFO CopyFiles$ Copying: Z:\I\1978\06\16\1789037.007 to: ./preindex/1978/1789037.007
2017-06-20 16:16:47,526 INFO CopyFiles$ Copying: Z:\I\1978\06\16\1789037.008 to: ./preindex/1978/1789037.008
2017-06-20 16:16:47,557 INFO CopyFiles$ Copying: Z:\I\1978\06\16\1789037.009 to: ./preindex/1978/1789037.009
2017-06-20 16:16:47,557 INFO CopyFiles$ Copying: Z:\I\1978\06\16\1789037.010 to: ./preindex/1978/1789037.010
2017-06-20 16:16:47,589 INFO CopyFiles$ Copying: Z:\I\1978\06\16\1789037.011 to: ./preindex/1978/1789037.011
2017-06-20 16:16:47,604 INFO CopyFiles$ Processing DocNum: 1687965, FileYear: 1978, FileMd: 123, Files: List(Z:\I\1978\01\23\1687965.001, Z:\I\1978\01\23\1687965.002)
2017-06-20 16:16:47,604 INFO CopyFiles$ Copying: Z:\I\1978\01\23\1687965.001 to: ./preindex/1978/1687965.001
2017-06-20 16:16:47,620 INFO CopyFiles$ Copying: Z:\I\1978\01\23\1687965.002 to: ./preindex/1978/1687965.002
2017-06-20 16:16:47,635 INFO CopyFiles$ Processing DocNum: 1743281, FileYear: 1978, FileMd: 414, Files: List(Z:\I\1978\04\14\1743281.001, Z:\I\1978\04\14\1743281.002)
2017-06-20 16:16:47,635 INFO CopyFiles$ Copying: Z:\I\1978\04\14\1743281.001 to: ./preindex/1978/1743281.001
2017-06-20 16:16:47,667 INFO CopyFiles$ Copying: Z:\I\1978\04\14\1743281.002 to: ./preindex/1978/1743281.002


