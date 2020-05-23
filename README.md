# Bil211-Hw3
abstract class and inheritance
Bu labda çeşitli ağaçların bilgilerini toplayan bir program yazacaksınız. Bunun için
ihtiyacınız ilk sınıf abstract Tree sınıfı. Tree sınıfı diğer tüm sınıfların üst sınıfı.
Tree sınıfının ağaçları karşılaştırabilmesi için Javanın bir interface’i olan Comparable
interface’ini implement etmesi gerekmektedir.
Daha sonrasında ise farklı ağaç çeşitleri olan Ash, Oak, Linden sınıfları oluşturmanız
gerekli.

Ash sınıfında:-
compareTo(Tree ashTree) metodu ismi metodu çağıran ağacın yaşı argüman olarak
verilen ağacın yaşından küçükse negatif bir tamsayı, büyükse pozitif bir tamsayı,
ağaçlar aynı yaştalarsa isimlerini karşılaştırır, alfabetik olarak önce geliyorsa negatif,
sonra geliyorsa pozitif bir tamsayı döner. Aynı isimdelerse aynı şekilde adreslerini
karşılaştırır. Onlar da aynıysa 0 döner.
-
printMessage() metodu ise “This is an Ash tree named <ağacın ismi>!” mesajını
ekrana yazar. <ağacın ismi> yazılan kısımda set edilen name değeri bulunmalıdır.

Oak sınıfında:
-
compareTo(Tree oakTree) metodu ismi metodu çağıran ağacın adı alfabetik olarak
argüman olarak verilen ağacın adından küçükse negatif bir tamsayı, büyükse pozitif
bir tamsayı, ağaçlar aynı isme sahipse yaşlarını karşılaştırır. Yaşı diğerinden küçükse
negatif, büyükse pozitif döner. Aynı yaştalarsa adreslerini alfabetik olarak
karşılaştırır. Hepsi aynıysa 0 döner.
-
printMessage() metodu ise “This is an Oak tree named <ağacın ismi>!” mesajını
ekrana yazar. <ağacın ismi> yazılan kısımda set edilen name değeri bulunmalıdır.

Linden sınıfında:
-
compareTo(Tree lindenTree) metodu ismi metodu çağıran ağacın adresi alfabetik
olarak argüman olarak verilen ağacın adresinden küçükse negatif bir tamsayı,
büyükse pozitif bir tamsayı, ağaçlar aynı adrese sahipse isimlerini karşılaştırır. Onlar
da aynıysa yaşlarını karşılaştırır. Yaşı küçükse negatif, büyükse pozitif, eşitse 0
döner.
-
printMessage() metodu ise “This is a Linden tree named <ağacın ismi>!” mesajını
ekrana yazar. <ağacın ismi> yazılan kısımda set edilen name değeri bulunmalıdır.
toString metotları ise her ağaç için uygun aşağıdaki Stringi dönmelidir ve bu alanları
doldururken get metotlarını kullanmalıdır.
