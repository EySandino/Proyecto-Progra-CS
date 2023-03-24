package GUI;

import java.awt.Color;
import ControlBaseDatos.DBConnection;
import java.sql.ResultSet;

public class LoginScreen extends javax.swing.JPanel {
    int xMouse, yMouse;

    public LoginScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogInAsAdmin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLogIn = new javax.swing.JPanel();
        txtLogIn = new javax.swing.JLabel();
        btnCreateAccount = new javax.swing.JPanel();
        txtCreateAccount = new javax.swing.JLabel();
        txtUserEmail = new javax.swing.JTextField();
        txtUserPassword = new javax.swing.JPasswordField();
        btnExit = new javax.swing.JPanel();
        txtExit = new javax.swing.JLabel();
        pnlHeader = new javax.swing.JPanel();
        txtBadCredentials = new javax.swing.JLabel();
        txtCompanyName = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogInAsAdmin.setBackground(new Color(214, 230, 255));
        btnLogInAsAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogInAsAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLogInAsAdminMousePressed(evt);
            }
        });
        btnLogInAsAdmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin");
        btnLogInAsAdmin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        add(btnLogInAsAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 530, 100, 30));

        btnLogIn.setBackground(new Color(214, 230, 255));
        btnLogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLogInMousePressed(evt);
            }
        });
        btnLogIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtLogIn.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        txtLogIn.setForeground(new java.awt.Color(0, 0, 0));
        txtLogIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLogIn.setText("Iniciar Sesion");
        btnLogIn.add(txtLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        add(btnLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 530, 100, 30));

        btnCreateAccount.setBackground(new Color(214, 230, 255));
        btnCreateAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCreateAccountMousePressed(evt);
            }
        });
        btnCreateAccount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCreateAccount.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        txtCreateAccount.setForeground(new java.awt.Color(0, 0, 0));
        txtCreateAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCreateAccount.setText("Crear Cuenta");
        btnCreateAccount.add(txtCreateAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        add(btnCreateAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 590, 100, 30));

        txtUserEmail.setBackground(new Color(214, 230, 255));
        txtUserEmail.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        txtUserEmail.setForeground(new java.awt.Color(153, 153, 153));
        txtUserEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUserEmail.setText("Email");
        txtUserEmail.setBorder(null);
        txtUserEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUserEmailMousePressed(evt);
            }
        });
        add(txtUserEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 400, 180, 30));

        txtUserPassword.setBackground(new Color(214, 230, 255));
        txtUserPassword.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        txtUserPassword.setForeground(new java.awt.Color(153, 153, 153));
        txtUserPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUserPassword.setText("password");
        txtUserPassword.setBorder(null);
        txtUserPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUserPasswordMousePressed(evt);
            }
        });
        add(txtUserPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 475, 180, 30));

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtExit.setFont(new java.awt.Font("Open Sans", 0, 24)); // NOI18N
        txtExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtExit.setText("X");
        btnExit.add(txtExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        pnlHeader.setBackground(new Color(0, 0, 0, 1));
        pnlHeader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlHeaderMouseDragged(evt);
            }
        });
        pnlHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlHeaderMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        add(pnlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 40));

        txtBadCredentials.setFont(new java.awt.Font("Brush Script MT", 0, 24)); // NOI18N
        txtBadCredentials.setForeground(new java.awt.Color(255, 0, 0));
        txtBadCredentials.setToolTipText("");
        add(txtBadCredentials, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 130, 250, 20));

        txtCompanyName.setFont(new java.awt.Font("Brush Script MT", 0, 24)); // NOI18N
        txtCompanyName.setForeground(new java.awt.Color(0, 0, 0));
        txtCompanyName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCompanyName.setText("Patitos Voladores");
        txtCompanyName.setToolTipText("");
        add(txtCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 90, 150, 30));

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Logo.jpg"))); // NOI18N
        add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 357, 640));
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setBackground(Color.red);
        txtExit.setForeground(Color.white);
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setBackground(Color.white);
        txtExit.setForeground(Color.black);
    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
       System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void pnlHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_pnlHeaderMousePressed

    private void pnlHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        AppWindow.setWindowLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_pnlHeaderMouseDragged

    private void txtUserEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserEmailMousePressed
        if (txtUserEmail.getText().equals("Email")){
            txtUserEmail.setText("");
            txtUserEmail.setForeground(new Color(0, 0, 0));
        }
        
        if (String.valueOf(txtUserPassword.getPassword()).isEmpty()){
            txtUserPassword.setText("password");
            txtUserPassword.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtUserEmailMousePressed

    private void txtUserPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserPasswordMousePressed
        if (String.valueOf(txtUserPassword.getPassword()).equals("password")){
            txtUserPassword.setText("");
            txtUserPassword.setForeground(new Color(0, 0, 0));
        }
        
        if (txtUserEmail.getText().isEmpty()){
            txtUserEmail.setText("Email");
            txtUserEmail.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtUserPasswordMousePressed

    private void btnLogInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogInMousePressed
        String inputEmail = txtUserEmail.getText();
        String inputPassword = String.valueOf(txtUserPassword.getPassword());
        
        try {
            DBConnection dbConnection = new DBConnection(DBConnection.getCredencialesPath());
            dbConnection.getUserPassword(inputEmail, DBConnection.usuarios);
            ResultSet result =  dbConnection.getUserPassword(inputEmail, DBConnection.usuarios);
            
            result.next();
            String dbPassword = result.getString("contraseña");
            
            if (dbPassword.equals(inputPassword)){
                System.out.println("good");
                //Iniciar aplicacion como usuario
            }
            else{
                txtBadCredentials.setText("Correo y/o contraseña inválidos");
                txtUserEmail.setText("Email");
                txtUserPassword.setText("password");
            }

        }
        catch(Exception e){
            txtBadCredentials.setText("Correo y/o contraseña inválidos");
            txtUserEmail.setText("Email");
            txtUserPassword.setText("password");
        }
    }//GEN-LAST:event_btnLogInMousePressed

    private void btnCreateAccountMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateAccountMousePressed
        
    }//GEN-LAST:event_btnCreateAccountMousePressed

    private void btnLogInAsAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogInAsAdminMousePressed
        AppWindow window = new AppWindow(new AdminLogIn(), 100, 100);
//        String inputEmail = JOptionPane.showInputDialog(null, "Intrese su correo: ", "Iniciar como administrador", JOptionPane.PLAIN_MESSAGE);
//        String inputPassword = JOptionPane.showInputDialog(null, "Intrese su contraseña: ", "Iniciar como administrador", JOptionPane.PLAIN_MESSAGE);
//        
//        try {
//            DBConnection dbConnection = new DBConnection(DBConnection.getCredencialesPath());
//            dbConnection.getUserPassword(inputEmail, DBConnection.administradores);
//            ResultSet result =  dbConnection.getUserPassword(inputEmail, DBConnection.administradores);
//            
//            result.next();
//            String dbPassword = result.getString("contraseña");
//            
//            if (dbPassword.equals(inputPassword)){
//                System.out.println("good");
//                //Iniciar aplicacion como admin
//            }
//            else{
//                txtBadCredentials.setText("Correo y/o contraseña inválidos");
//                txtUserEmail.setText("Email");
//                txtUserPassword.setText("password");
//            }
//
//        }
//        catch(Exception e){
//            txtBadCredentials.setText("Correo y/o contraseña inválidos");
//            txtUserEmail.setText("Email");
//            txtUserPassword.setText("password");
//        }
    }//GEN-LAST:event_btnLogInAsAdminMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JPanel btnCreateAccount;
    private javax.swing.JPanel btnExit;
    private javax.swing.JPanel btnLogIn;
    private javax.swing.JPanel btnLogInAsAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JLabel txtBadCredentials;
    private javax.swing.JLabel txtCompanyName;
    private javax.swing.JLabel txtCreateAccount;
    private javax.swing.JLabel txtExit;
    private javax.swing.JLabel txtLogIn;
    private javax.swing.JTextField txtUserEmail;
    private javax.swing.JPasswordField txtUserPassword;
    // End of variables declaration//GEN-END:variables
}
