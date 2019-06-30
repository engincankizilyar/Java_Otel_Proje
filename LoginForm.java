package deneme;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {
    
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public LoginForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Admin Login");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/login.png")));
        this.setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBG = new javax.swing.JPanel();
        lblFoto = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();
        jPanelLogin = new javax.swing.JPanel();
        lblKulAdi = new javax.swing.JLabel();
        lblParola = new javax.swing.JLabel();
        btnGiris = new javax.swing.JButton();
        btnIptal = new javax.swing.JButton();
        txtKulAdi = new javax.swing.JTextField();
        txtParola = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBG.setBackground(new java.awt.Color(125, 95, 255));

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login.png"))); // NOI18N

        btnInfo.setBackground(new java.awt.Color(125, 95, 255));
        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/info.png"))); // NOI18N
        btnInfo.setBorder(null);
        btnInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        jPanelLogin.setBackground(new java.awt.Color(125, 95, 255));
        jPanelLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), null, null), "Admin Giriş", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        lblKulAdi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblKulAdi.setForeground(new java.awt.Color(255, 255, 255));
        lblKulAdi.setText("Kullanıcı Adı:");

        lblParola.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblParola.setForeground(new java.awt.Color(255, 255, 255));
        lblParola.setText("Parola:");

        btnGiris.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGiris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/key.png"))); // NOI18N
        btnGiris.setText("Giriş");
        btnGiris.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGirisActionPerformed(evt);
            }
        });

        btnIptal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnIptal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/error.png"))); // NOI18N
        btnIptal.setText("İptal");
        btnIptal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIptal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIptalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addComponent(btnGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIptal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addComponent(lblParola)
                        .addGap(46, 46, 46)
                        .addComponent(txtParola))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addComponent(lblKulAdi)
                        .addGap(15, 15, 15)
                        .addComponent(txtKulAdi)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKulAdi)
                    .addComponent(txtKulAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblParola)
                    .addComponent(txtParola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGiris)
                    .addComponent(btnIptal))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanelBGLayout = new javax.swing.GroupLayout(jPanelBG);
        jPanelBG.setLayout(jPanelBGLayout);
        jPanelBGLayout.setHorizontalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBGLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBGLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblFoto)
                        .addGap(97, 97, 97)
                        .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBGLayout.createSequentialGroup()
                        .addComponent(jPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanelBGLayout.setVerticalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBGLayout.createSequentialGroup()
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBGLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblFoto))
                    .addGroup(jPanelBGLayout.createSequentialGroup()
                        .addComponent(btnInfo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        //Sağ üstteki infobuton'a tıklayınca isimlerimizi bastıran bir detay eklemek istedik :)//
        JOptionPane.showMessageDialog(this, "Developers\n\n" + "Batuhan Demiray\nEngincan Kızılyar");
    }//GEN-LAST:event_btnInfoActionPerformed
    
    private void btnGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGirisActionPerformed
        
        DBHandler dbh = null;
        //OTEL databasemizdeki Yönetici Tablosundaki verileri seçen sorgu//
        String sql = "Select * from Yonetici where kul_adi=? and parola=?";
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433; databaseName=OTEL","sa","123");
            pst = con.prepareStatement(sql);
            pst.setString(1, txtKulAdi.getText());  
            pst.setString(2, txtParola.getText());
            rs = pst.executeQuery();
            //Kullanıcı adı ve şifrenin doğru olup olmadığı kontrolü//
            if (rs.next())
            {
                 JOptionPane.showMessageDialog(null, "Başarılı Giriş");
                 //Menu Formda: Hoşgeldiniz. kullaniciAdi yerine giriş yapılan kullanıcı adını yazdıran kod//
                 MenuForm mf=new MenuForm(txtKulAdi.getText());
                 //eğer doğru giriş sağlandıysa direkt menuforma geçiş yapıyoruz//
                 mf.setVisible(true);
                 this.hide();
            }
            else if (txtKulAdi.getText().length() == 0 || txtParola.getText().length() == 0)
            {
                JOptionPane.showMessageDialog(null, "Kullanıcı Adı veya Parola Boş Bırakılamaz");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Kullanıcı Adı veya Parola Yanlış");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnGirisActionPerformed
    
    private void btnIptalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIptalActionPerformed

            System.exit(0);
    }//GEN-LAST:event_btnIptalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGiris;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnIptal;
    private javax.swing.JPanel jPanelBG;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblKulAdi;
    private javax.swing.JLabel lblParola;
    private javax.swing.JTextField txtKulAdi;
    private javax.swing.JPasswordField txtParola;
    // End of variables declaration//GEN-END:variables
}
