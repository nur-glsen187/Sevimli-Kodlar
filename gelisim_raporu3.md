# Sevimli-Kodlar

# Düzeltmeler
2.gelişim raporumuzda  yazdığımız oyunun kullanıcıyla bir etkileşimi yoktu.Kodlarımızın devamında kullanıcı ile etkileşime geçtik.Projemizde adım adım ilerliyoruz şimdilik masaüstü versiyonu için klavyeden girdileri aldık.Karakterin hareketini klavyeden aldığımız girdilerle belirlemiş olduk.Oyun nesnemizi kıstlı hareket ettirebiliyorduk ama ilerleyen süreçlerde oyun nesnemize kesintisiz hareket sağladık.Oyun nesnemizi hareket ettirirken adım adım hareket ettirebiliyorduk yani ilk önce bir tuşa basıp elimizi çektikten sonra diğer tuşa basarak işlemimizi devam ettiriyorduk fakat geliştirdik ve şuan iki tuşlada hareket sağlayabiliyoruz.

# Zorluklar
Oyun nesnemiz kesintisiz hareket etmiyordu.Tuşa sürekli bastığımızda kesintisiz bir hareketi yoktu.Bu sürekliliği sağlarken bir zorluk yaşadık.

RESİMMMM

Diğer yaşadığımız zorlukta oyun nesnemizi hareket ettirebilmek için sürekli klavyeye basıyor oluşumuzdu.Biz tek bir girdi hamlesiyle oyun nesnemiz kesintisiz hareket etsin istiyorduk.Bunu şu şekilde düzeltmiş olduk ; 

RESİMMMM

Her oyun saniyede 60 kez update edilmek zorundadır.Bunu sabit bir rakam yapıyoruz ki herkesin bilgisayarında oyun eşit hızda çalışsın.

![updutee](https://1.bp.blogspot.com/-VVTF9wvWgUE/YILRKSLC7iI/AAAAAAAAAj8/xlWHfYoIDrU8n9SlcLBL5Yd-GxqWoqnUACLcBGAsYHQ/s484/WhatsApp%2BImage%2B2021-04-23%2Bat%2B16.49.18.jpeg)

Bunu da update fonksiyonunun içine delta parametresini koyarak yaptık.

# Araçlar
 Libgdx 
 
 Eclipse

