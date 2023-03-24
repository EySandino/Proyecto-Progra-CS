package MainModule;
import GUI.AdminLogIn;
import GUI.AppWindow;
import GUI.LoginScreen;

public class Main {
    public static void main(String[] args){
        AppWindow window = new AppWindow(new LoginScreen(), 750, 150);
    }
}