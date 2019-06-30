package deneme;

import java.awt.Toolkit;

public class MenuForm extends javax.swing.JFrame {

    public MenuForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Ana Menü");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/homepage.png")));
        this.setResizable(false);
        
    }
    //MenuForm Constructor'ını Loginden gelen kullanıcı adı değerini,Hoşgeldiniz kullanici adı şeklinde bastırması için yanındaki label'ın içine bu kullanıcı adını attık//
    public MenuForm(String kullanici_adi)
    {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Ana Menü");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/homepage.png")));
        this.setResizable(false);
        lblKulAdi.setText(kullanici_adi);//
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBG = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblKulAdi = new javax.swing.JLabel();
        jPanelMenu = new javax.swing.JPanel();
        lblFoto = new javax.swing.JLabel();
        btnMusteriKayit = new javax.swing.JButton();
        btnMusteriGuncelleme = new javax.swing.JButton();
        btnOdaEkle = new javax.swing.JButton();
        btnOdaGuncelleme = new javax.swing.JButton();
        btnMusteriCikis = new javax.swing.JButton();
        btnCikis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ana Menü");
        setName("frmMenu"); // NOI18N

        jPanelBG.setBackground(new java.awt.Color(125, 95, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Hoşgeldiniz:");

        lblKulAdi.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblKulAdi.setForeground(new java.awt.Color(204, 204, 255));

        jPanelMenu.setBackground(new java.awt.Color(125, 95, 255));
        jPanelMenu.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Ana Menü", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/homepage.png"))); // NOI18N
        lblFoto.setToolTipText("");
        lblFoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnMusteriKayit.setBackground(new java.awt.Color(102, 255, 102));
        btnMusteriKayit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMusteriKayit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/customer.png"))); // NOI18N
        btnMusteriKayit.setText("Müşteri Kayıt");
        btnMusteriKayit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMusteriKayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusteriKayitActionPerformed(evt);
            }
        });

        btnMusteriGuncelleme.setBackground(new java.awt.Color(229, 255, 102));
        btnMusteriGuncelleme.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMusteriGuncelleme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/list24.png"))); // NOI18N
        btnMusteriGuncelleme.setText("Müşteri Güncelle");
        btnMusteriGuncelleme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMusteriGuncelleme.setMaximumSize(new java.awt.Dimension(95, 23));
        btnMusteriGuncelleme.setMinimumSize(new java.awt.Dimension(95, 23));
        btnMusteriGuncelleme.setPreferredSize(new java.awt.Dimension(95, 23));
        btnMusteriGuncelleme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusteriGuncellemeActionPerformed(evt);
            }
        });

        btnOdaEkle.setBackground(new java.awt.Color(102, 255, 102));
        btnOdaEkle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnOdaEkle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/room.png"))); // NOI18N
        btnOdaEkle.setText("Oda Ekle");
        btnOdaEkle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOdaEkle.setMaximumSize(new java.awt.Dimension(95, 23));
        btnOdaEkle.setMinimumSize(new java.awt.Dimension(95, 23));
        btnOdaEkle.setPreferredSize(new java.awt.Dimension(95, 23));
        btnOdaEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdaEkleActionPerformed(evt);
            }
        });

        btnOdaGuncelleme.setBackground(new java.awt.Color(229, 255, 102));
        btnOdaGuncelleme.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnOdaGuncelleme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/list24.png"))); // NOI18N
        btnOdaGuncelleme.setText("Oda Güncelle");
        btnOdaGuncelleme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOdaGuncelleme.setMaximumSize(new java.awt.Dimension(75, 23));
        btnOdaGuncelleme.setMinimumSize(new java.awt.Dimension(75, 23));
        btnOdaGuncelleme.setPreferredSize(new java.awt.Dimension(75, 23));
        btnOdaGuncelleme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdaGuncellemeActionPerformed(evt);
            }
        });

        btnMusteriCikis.setBackground(new java.awt.Color(255, 77, 77));
        btnMusteriCikis.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMusteriCikis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/leave.png"))); // NOI18N
        btnMusteriCikis.setText("Müşteri Çıkış");
        btnMusteriCikis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMusteriCikis.setMaximumSize(new java.awt.Dimension(75, 23));
        btnMusteriCikis.setMinimumSize(new java.awt.Dimension(75, 23));
        btnMusteriCikis.setPreferredSize(new java.awt.Dimension(75, 23));
        btnMusteriCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusteriCikisActionPerformed(evt);
            }
        });

        btnCikis.setBackground(new java.awt.Color(255, 77, 77));
        btnCikis.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCikis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        btnCikis.setText("Çıkış");
        btnCikis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCikisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnMusteriGuncelleme, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(lblFoto)
                .addGap(66, 66, 66)
                .addComponent(btnOdaGuncelleme, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMusteriCikis, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMusteriKayit, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCikis, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOdaEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOdaEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMusteriKayit, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnOdaGuncelleme, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMusteriGuncelleme, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblFoto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCikis, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMusteriCikis, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout jPanelBGLayout = new javax.swing.GroupLayout(jPanelBG);
        jPanelBG.setLayout(jPanelBGLayout);
        jPanelBGLayout.setHorizontalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBGLayout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKulAdi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelBGLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBGLayout.setVerticalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBGLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblKulAdi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMusteriKayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusteriKayitActionPerformed
        //formlar arası geçişi sağladığımız kısım bu formun setvisibile'ını false MusteriKayitForm'un setvisible'ını true yapıyoruz//
        MusteriKayitForm mkf = new MusteriKayitForm();
        mkf.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnMusteriKayitActionPerformed
    
    
    private void btnCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCikisActionPerformed
        //formlar arası geçişi sağladığımız kısım bu formun setvisibile'ını false LoginForm'un setvisible'ını true yapıyoruz//
        LoginForm lF = new LoginForm();
        lF.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnCikisActionPerformed

    private void btnMusteriGuncellemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusteriGuncellemeActionPerformed
        //formlar arası geçişi sağladığımız kısım bu formun setvisibile'ını false MusteriGuncelleForm'un setvisible'ını true yapıyoruz//
        MusteriGuncelleForm mlF = new MusteriGuncelleForm();
        mlF.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnMusteriGuncellemeActionPerformed

    private void btnOdaEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdaEkleActionPerformed
        //formlar arası geçişi sağladığımız kısım bu formun setvisibile'ını false OdaEkleForum'un setvisible'ını true yapıyoruz//
        OdaEkleForm oeF = new OdaEkleForm();
        oeF.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnOdaEkleActionPerformed

    private void btnOdaGuncellemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdaGuncellemeActionPerformed
        //formlar arası geçişi sağladığımız kısım bu formun setvisibile'ını false OdaGuncelleForm'un setvisible'ını true yapıyoruz//
        OdaGuncelleForm olF = new OdaGuncelleForm();
        olF.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnOdaGuncellemeActionPerformed

    private void btnMusteriCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusteriCikisActionPerformed
        //formlar arası geçişi sağladığımız kısım bu formun setvisibile'ını false MusteriCikisForm'un setvisible'ını true yapıyoruz//
        MusteriCikisForm mcF = new MusteriCikisForm();
        mcF.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnMusteriCikisActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCikis;
    private javax.swing.JButton btnMusteriCikis;
    private javax.swing.JButton btnMusteriGuncelleme;
    private javax.swing.JButton btnMusteriKayit;
    private javax.swing.JButton btnOdaEkle;
    private javax.swing.JButton btnOdaGuncelleme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelBG;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblKulAdi;
    // End of variables declaration//GEN-END:variables

}
