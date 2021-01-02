# Sevimli-Kodlar

# Öğrenilen Yöntemler
Oyunumuzu programlarken Texture,TextureRegion,OrtographicCamera kavramlarını öğrendik.
## TextureRegion():
Texture'ın içindeki kullandığımız resimler bir TextureRegion'dır.Örneğin bir Texture içinde 50 ile 100 koordinatları arasındaki bir resim aldığımızda bu TextureRegion olur.
## Texture:
Oyun programlarken resimlerimizi texture içinde tutarız. Bir nevi resim albümü gibi düşünülebilir. Oyunumuzun texture'ında yol,karakter,bulut,karakterin toplayacağı kod parçacıkları olacaktır.

## OrtographicCamera:

Oyunumuzda  her state için bir kamera olacaktır .OrtographicCamera sınıfından ürettiğimiz  camera nesnesine setToOrto metoduyla kameranın ters veya düz olacağı,kameranın genişliği ve yüksekliği değerleri verilecektir

## State :
Obje farklı durumlarda farklı davranışlar gösteriyorsa state yapısı kullanılır.Oyunumuzda farklı durumları kontrol etmek için bir çok state classı kullandık.Farklı durumlara sahip objenin yeni bir duruma geçtiğinde yaptığı haretin değişmesidir.
## SpriteBatch:
Ekranda hareketli grafikleri çizmek için çeşitli yöntemler içerir. SpriteBatch sınıfından oluşturduğumuz objeyi draw() methoduyla kullandığımızda o an çizim işlemini yapmıyor,sadece verdiğimiz verileri organize ediyor. draw() methodunu çalıştırmak için begin ve end methodlarının arasına yazılması gerekir. 


## glClearColor : 
Oyunumuzu oluşturduğumuzda bir arka plan rengi tanımlamamız ve her çizdiğimizde bu renkleri temizlememiz gerekiyor.Bu metod bu işlemi yapıyor.

![arkaplan silme](https://1.bp.blogspot.com/-mpr3ty4vU_A/X_DrkSD804I/AAAAAAAAAhQ/7HY1gOX6xlQNRaZDuKkLORNMAGFLY6oyQCLcBGAsYHQ/s560/pis%2Bhali.JPG)
[arkaplan silme](https://1.bp.blogspot.com/-Syow_vFXLPE/X_Drkf02JcI/AAAAAAAAAhM/1dGp9IiPT4sjjkpNxtTrEx4algBEYWF4QCLcBGAsYHQ/s500/temiz%2Bhali.JPG)






