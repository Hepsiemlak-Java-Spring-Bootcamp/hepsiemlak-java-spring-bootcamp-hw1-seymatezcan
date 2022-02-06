
İkinci soru:

Java' da çoklu kalıtım mümkün değildir. Bunun nedenleri, olması durumunda karşılaşılacak problemler ve hangi dillerin buna izin verdiğini ve Java' da bunu Object-Oriented prensipleri ile sağlayabilip sağlayamayabileceğimizi yazınız.
Çoklu kalıtımı destekleyen C++, Python, Perl gibi dillerin yanında Java çoklu kalıtımı desteklemez. Öncelikle kalıtımdan bahsetmek gerekirse, kalıtım, bir sınıfın diğer sınıflara özelliklerini aktarabilmesidir. Özellik aktaran sınıf base class, özellikleri alan sınıf ise subclass olarak adlandırılır. Bu şekilde hiyerarşik bir yapı kurulur.

Çoklu kalıtım ise, bir sınıfın, birden fazla sınıftan kalıtılmasıdır. Aşağıda bununla ilgili basit bir örnek vermek gerekirse:

public class HighEndProgrammingLanguages {

Boolean assembler==false;

public void pickIde(){

}

}

public class ObjectBasedProgrammingLanguages {

public void addObject(){

}

public class VisualBasicProgrammingLanguage:HighEndProgrammingLanguages,ObjectBasedProgrammingLanguages {

public void EndOfTheLineAddEnd(){

}

}

Yukarıdaki kodu açıklayacak olursak, Visual Basic high-end bir yazılım dili ve aynı zamanda nesne tabanlı bir yazılım dilidir. Buradaki yapıya göre Visual Basic' i her iki sınıftan da kalıtmalıyız. Bu durum, bu gibi basit modellerde, anlaşılır gözükse de kapsamlı modellerde büyük sorunlar çıkarabilir.

B ve C sınıfları, A sınıfından kalıtılmış olsun. D sınıfı da B ve C sınıfından kalıtılmış olsun. B ve C sınıfları, A sınıfında bulunan methodları override ederek kullanmış olsun. Bu durumda, D sınıfı, aynı methodu override etmek istediğinde, B' de bulunan override mı, yoksa C' de bulunan override mı çalışır? Bu probleme Diamond Problem nedir.

Bunların yanında çoklu kalıtımın avantajları da bulunur. Örneğin bir adaptör deseninde çoklu kalıtımın yararlarını gözlemleyebiliriz. Bir classın basşka bir class tarafından uyarlanmasına izin verir. Dikey bir hiyerarşide çoklu kalıtım avantajlıdır. Bir kümenin özellikleri diğer kümenin özelliklerine bağlı olmaz. Ancak diamond problemindeki gibi bir hiyerarşide, dikeylik gözlenmez ve bu durum çoklu kalıtımı dezavantaja dönüştürür.
