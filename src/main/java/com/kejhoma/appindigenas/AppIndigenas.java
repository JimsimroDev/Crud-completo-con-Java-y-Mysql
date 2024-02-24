package com.kejhoma.appindigenas;

//import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
//import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import com.kejhoma.appindigenas.igu.LoginInicial;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class AppIndigenas {

    public static void main(String[] args) {
        // FlatArcDarkIJTheme.setup();

        //        w
        try {

            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            System.out.println("Look and ferr erro!");
        }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // FlatDarculaLaf.setup();
                LoginInicial principal = new LoginInicial();
                principal.setVisible(true);
            }
        });
    }
}
