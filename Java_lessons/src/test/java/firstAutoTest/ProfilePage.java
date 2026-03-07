package firstAutoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ProfilePage {

    public WebDriver driver;
    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//*[@id=\"_R_cd5vdbh95uivb_\"]/div/header/button")
    private WebElement closeAdYndxMusic;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[1]/main/div[1]/div/div[2]/div[2]/button[2]")
    private WebElement loginBtnYndxMusic;

    @FindBy(css = "div.user__userpic-avatar")
    private WebElement profileBtn;

    @FindBy(css = "div.multi-auth__user-name")
    private WebElement userMenu;

    @FindBy(xpath = "//*[contains(text(), 'Выйти')]")
    private WebElement logoutLink;

    public void clickCloseAdYndxMusic() {
        closeAdYndxMusic.click(); }
    public void clickLoginBtnYndxMusic() {
        loginBtnYndxMusic.click(); }
    public void clickProfileBtn() {
        profileBtn.click(); }
    public String getUserName() {
        String userName = userMenu.getText();
        return userName; }
    public void logoutLink() {
        logoutLink.click(); }
}
