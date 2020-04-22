package co.com.choucair.reto.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class OrganizacionPage {

    public static final Target LINK_ORGANIZACION = Target.the("Boton Organizacion").located(By.xpath("//span[contains(text(),'Organizacion')]"));
    public static final Target LINK_UNIDADES_DE_NEGOCIO = Target.the("Boton Unidades De Negocio").located(By.xpath("//span[contains(text(),'Unidades de Negocio')]"));
    public static final Target BOTON_NUEVA_UNIDAD_DE_NEGOCIO = Target.the("Boton Busines Unit").located(By.xpath(" //span[contains(text(),'Nuevo Business Unit')]"));
    public static final Target CAMPO_NOMBRE = Target.the("Campo Name").located(By.name("Name"));
    public static final Target Boton_Guardar = Target.the("Boton Guardar").located(By.xpath("//span[contains(text(),'Guardar')]"));


}

