# HackerRank Çözümleri

HackerRank'teki başlangıç ve orta seviye algoritma sorularına Java ile yazılmış çözümler.

> **Not:** Bu depo 2024 yılında alıştırma amaçlı oluşturuldu ve artık güncellenmiyor.

## İçerik

Bütün çözümler `src/` altında, paket kullanılmadan yazıldı. Her dosyada HackerRank'in verdiği şablonla birlikte bir çözüm metodu ve girdiyi okuyan `main` sınıfı bulunur.

| Dosya | Soru | `main` sınıfı |
|---|---|---|
| `BirthdayCakeCandles.java` | Birthday Cake Candles | `Solution` |
| `CountingValleys.java` | Counting Valleys | `CountingValleysSolution` |
| `DiagonalDifference.java` | Diagonal Difference | `DiagonalDifferenceSolution` |
| `GetWays.java` | The Coin Change Problem (dinamik programlama) | `GetWaysSolution` |
| `JumpingOnClouds.java` | Jumping on the Clouds | `JumpingOnCloudsSolution` |
| `MiniMaxSum.java` | Mini-Max Sum | `SolutionMiniMaxSum` |
| `PlusMinus.java` | Plus Minus | `PlusMinus` |
| `SockMerchant.java` | Sales by Match (Sock Merchant) | `SockMerchantSolution` |
| `Staircase.java` | Staircase | `StaircaseSolution` |
| `TimeConversion.java` | Time Conversion | `SolutionTimeConversion` |

## Teknolojiler

- Java 8 veya üstü (yalnızca standart kütüphane, Stream API)
- Dış bağımlılık yok

## Çalıştırma

```
javac -d out src/*.java
java -cp out GetWaysSolution < girdi.txt
```

Girdi, HackerRank'teki örnek girdiyle aynı biçimde standart girişten okunur. Bazı çözümler (`BirthdayCakeCandles`, `CountingValleys`, `DiagonalDifference`, `GetWays`, `TimeConversion`) HackerRank şablonu gereği sonucu `OUTPUT_PATH` ortam değişkeninde belirtilen dosyaya yazar; bunları çalıştırmadan önce bu değişkene bir dosya yolu verin.
