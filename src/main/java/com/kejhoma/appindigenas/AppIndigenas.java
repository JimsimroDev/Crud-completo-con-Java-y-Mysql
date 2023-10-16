package com.kejhoma.appindigenas;

//import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import com.formdev.flatlaf.FlatDarculaLaf;
//import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import com.kejhoma.appindigenas.igu.LoginInicial;

public class AppIndigenas {

    public static void main(String[] args) {
       // FlatArcDarkIJTheme.setup();
        FlatDarculaLaf.setup();
        LoginInicial principal = new LoginInicial();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);

    }
}
