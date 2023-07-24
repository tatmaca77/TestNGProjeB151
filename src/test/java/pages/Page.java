package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Page {

    public Page() {    /** Önce Constructor olusturulur UNUTMA!!!!!! */
        PageFactory.initElements(Driver.getDriver(),this);

    }
    /** Proje sorumlusu veya github sorumlusu satir paylasimi yapmalidir. Karisiklik olmamasi icin. Ekstra satir verilebilir. */

    // Tolga
    @FindBy (id = "twotabsearchtextbox")
    public WebElement aramaKutusu;



































    //Tolga
    // Ayca








































    //Ayca






}
