package co.com.choucair.reto.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class ReunionPage{

    public static final Target LINK_REUNION = Target.the("Reunion").located(By.xpath("//i[@class='nav-icon fa fa-comments premium-feature']"));
    public static final Target LINK_PROGRAMAR_REUNION = Target.the("Boton Reunion").located(By.xpath("//span[contains(text(),'Reuniones')]"));
    public static final Target BOTON_NUEVA_REUNION = Target.the("Boton Nuevo").located(By.xpath("//span[contains(text(),'Nuevo Meeting')]"));
    public static final Target CAMPO_NOMBRE_REUNION = Target.the("Meeting Name").located(By.name("MeetingName"));
    public static final Target CAMPO_Link_Reunion = Target.the("Link").located(By.xpath(" //div[@id='s2id_StartSharp_Meeting_MeetingDialog12_UnitId']//b"));
    public static final Target CAMPO_Unidad = Target.the("Unidad").located(By.id("s2id_autogen8_search"));
    public static final Target Btn_Guardar = Target.the("Boton Guardar").located(By.xpath("//span[contains(text(),'Guardar')]"));
    public static final Target Campo_Tefelono = Target.the("Telefono").located(By.id("StartSharp_Meeting_MeetingDialog12_MeetingNumber"));
    public static final Target Nombre_de_La_Reunion=Target.the("Nombre_Reunion").located(By.xpath("//a[contains(text(),'reunion001')]"));
    public static final Target Ubicacion=Target.the("Ubicacion").located(By.xpath(" //div[@class='field LocationId col-sm-6']//a[@class='inplace-button inplace-create']\n"));
    public static final Target Nombre_Ubicacion=Target.the("Nombre Ubicacion").located(By.xpath("//input[@id='StartSharp_Meeting_MeetingLocationDialog33_Name']"));
    public static final Target Guardar_Ubicacion=Target.the("Guardar Ubicacion").located(By.xpath("//div[@class='s-DialogContent']//span[@class='button-inner'][contains(text(),'Guardar')]"));


}
