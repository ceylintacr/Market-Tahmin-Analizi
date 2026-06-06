## 🛒 Müşteri Ürün Kategorisi Tahminleme Sistemi

## 📖 Proje Hakkında
Bu proje, perakende sektöründe faaliyet gösteren bir marketin müşteri verilerini analiz ederek, kullanıcıların sosyo-demografik profillerine (yaş, cinsiyet, şehir, harcama potansiyeli) göre hangi ürün kategorisine (Gıda, Kozmetik vb.) yöneleceklerini tahmin etmeyi amaçlayan bir makine öğrenmesi uygulamasıdır. 

Sistem içerisinde **K-En Yakın Komşu (KNN)** ve **Karar Ağacı (Decision Tree)** sınıflandırma algoritmaları, herhangi bir dış makine öğrenmesi kütüphanesi kullanılmadan tamamen Java ve Nesneye Yönelik Programlama (OOP) prensipleriyle sıfırdan geliştirilmiştir.

## 🚀 Özellikler
- **Özel Algoritma İmplementasyonları:** KNN ve Karar Ağacı algoritmalarının temel matematiksel formüllerle (Öklid mesafesi, Information Gain vb.) modüler olarak kodlanması.
- **Nesneye Yönelik Mimari (OOP):** Sistem; Kalıtım (Inheritance), Arayüz (Interface), Kapsülleme (Encapsulation) ve Çok Biçimlilik (Polymorphism) gibi OOP prensiplerine uygun olarak genişletilebilir bir yapıda tasarlanmıştır.
- **Kapsamlı Veri Ön İşleme:**
  - Eksik (null) ve hatalı verilerin temizlenmesi.
  - Metinsel verilerin sayısal değerlere dönüştürülmesi (Label Encoding - Örn: Kadın:0, Erkek:1, Şehir isimlerinin plaka kodlarına dönüştürülmesi).
  - Farklı ölçekteki verilerin (yaş ve harcama skoru) Min-Max normalizasyonu ile [0-1] aralığına çekilmesi.
- **Performans ve Metrik Ölçümü:** - Tahmin doğruluğu (Accuracy) hesaplaması.
  - Algoritmaların hesaplama maliyetlerinin ve çalışma sürelerinin (milisaniye cinsinden) kıyaslanması.
  - Hata Matrisi (Confusion Matrix) analizi ile modellerin zayıf yönlerinin raporlanması.
- **Dinamik Kullanıcı Arayüzü:** Veri yükleme, algoritma/parametre seçimi (Örn: K değeri, maxDepth) ve performans sonuçlarının grafiksel olarak incelenebildiği kullanıcı arayüzü.

## 📊 Veri Seti Yapısı
Uygulama, Kocaeli bölgesinden anonimleştirilmiş 5093 satırlık gerçek perakende satış verisi üzerinde çalışmaktadır. Her bir satır bir "satış işlemini" temsil eder.
- **Girdi (Bağımsız) Değişkenler:** Müşteri ID (ClientCode), Cinsiyet, Toplam Ücret (LineNetTotal), Marka (BrandCode), Yaş, Şehir vb.
- **Hedef (Bağımlı) Değişken:** Ürün Kategorisi (Category).

Eğitim ve test işlemleri için veri seti **%80 Eğitim (Train)** ve **%20 Test** olacak şekilde rastgele ve veri sızıntısı olmadan ikiye ayrılmaktadır.

## 🛠️ Teknolojiler ve Mimari
- **Programlama Dili:** Java
- **Veri Yapıları:** Dinamik bellek yönetimi için `ArrayList` ve `HashMap`, performanslı sıralama için `PriorityQueue`.
- **Temel Sınıf Yapısı:**
  - `UserRecord`: Kapsüllenmiş müşteri ve işlem verilerini tutar.
  - `DataLoader`: Veri okuma ve nesneye dönüştürme işlemlerini gerçekleştirir.
  - `PreProcessor`: Veri temizleme, Encoding ve Normalizasyon süreçlerini yönetir.
  - `IClassifier`: `train()` ve `predict()` metotlarını barındıran ortak algoritma arayüzü.
  - `KNNClassifier` & `DecisionTreeClassifier`: Sınıflandırma algoritmalarının somut implementasyonları.
  - `Evaluator`: Model başarım metriklerinin hesaplandığı değerlendirme modülü.

## ⚙️ Kurulum ve Kullanım
1. Projeyi bilgisayarınıza klonlayın.
2. Java destekli bir IDE (IntelliJ IDEA, Eclipse, VS Code vb.) ile projeyi açın.
3. Projeyi derleyerek arayüz (GUI) uygulamasını başlatın.
4. Arayüz üzerinden `.xlsx` formatındaki satış verisini sisteme yükleyin (Eğitim ve Test verilerini toplu veya ayrı ayrı yükleyebilirsiniz).
5. Kullanmak istediğiniz algoritmayı (KNN veya Karar Ağacı) ve parametrelerini (KNN için komşu sayısı, Karar Ağacı için derinlik sınırı vb.) belirleyin.
6. Model eğitimini başlatın ve test sonuçlarını, çalışma sürelerini ve grafikleri arayüz üzerinden analiz edin.
"""
with open('/mnt/data/README.md', 'w', encoding='utf-8') as f:
    f.write(readme_content)
print("README.md created successfully.")
