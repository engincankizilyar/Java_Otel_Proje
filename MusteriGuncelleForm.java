package deneme;

import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MusteriGuncelleForm extends javax.swing.JFrame {
    
    String connectionString = "jdbc:sqlserver://localhost:1433; databaseName=OTEL";
    int tc;//sorgudaki tc_no değeri ile eşleştirmek oluşturduğumuz değişken
    
    public MusteriGuncelleForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Müşteri Güncelle");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/list24.png")));
        this.setResizable(false);
        tableDoldur();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBG = new javax.swing.JPanel();
        jPanelList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMusteriList = new javax.swing.JTable();
        btnGeri = new javax.swing.JButton();
        txtCinsiyet = new javax.swing.JTextField();
        txtAdSoyad = new javax.swing.JTextField();
        txtOda = new javax.swing.JTextField();
        lblAd = new javax.swing.JLabel();
        lblOdaNo = new javax.swing.JLabel();
        lblSoyad = new javax.swing.JLabel();
        txtGirisTarih = new javax.swing.JTextField();
        txtTelNo = new javax.swing.JTextField();
        txtCocuk = new javax.swing.JTextField();
        txtYas = new javax.swing.JTextField();
        lblTelNo = new javax.swing.JLabel();
        lblCocuk = new javax.swing.JLabel();
        lblYas = new javax.swing.JLabel();
        lblCinsiyet = new javax.swing.JLabel();
        btnGuncelle = new javax.swing.JButton();
        lblTelNo1 = new javax.swing.JLabel();
        txtCikisTarih = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBG.setBackground(new java.awt.Color(125, 95, 255));

        jPanelList.setBackground(new java.awt.Color(125, 95, 255));
        jPanelList.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Müşteri Listesi", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        tblMusteriList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TC No", "Oda No", "Ad", "Soyad", "Cinsiyet", "Yaş", "Çocuk", "Tel No", "Giriş Tarihi", "Çıkış Tarihi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMusteriList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMusteriListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMusteriList);
        if (tblMusteriList.getColumnModel().getColumnCount() > 0) {
            tblMusteriList.getColumnModel().getColumn(0).setResizable(false);
            tblMusteriList.getColumnModel().getColumn(1).setResizable(false);
            tblMusteriList.getColumnModel().getColumn(2).setResizable(false);
            tblMusteriList.getColumnModel().getColumn(3).setResizable(false);
            tblMusteriList.getColumnModel().getColumn(4).setResizable(false);
            tblMusteriList.getColumnModel().getColumn(5).setResizable(false);
            tblMusteriList.getColumnModel().getColumn(6).setResizable(false);
            tblMusteriList.getColumnModel().getColumn(7).setResizable(false);
            tblMusteriList.getColumnModel().getColumn(8).setResizable(false);
            tblMusteriList.getColumnModel().getColumn(9).setResizable(false);
        }

        javax.swing.GroupLayout jPanelListLayout = new javax.swing.GroupLayout(jPanelList);
        jPanelList.setLayout(jPanelListLayout);
        jPanelListLayout.setHorizontalGroup(
            jPanelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanelListLayout.setVerticalGroup(
            jPanelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnGeri.setBackground(new java.awt.Color(255, 77, 77));
        btnGeri.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGeri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        btnGeri.setText("Geri");
        btnGeri.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriActionPerformed(evt);
            }
        });

        lblAd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAd.setForeground(new java.awt.Color(51, 51, 51));
        lblAd.setText("Ad Soyad:");

        lblOdaNo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOdaNo.setForeground(new java.awt.Color(51, 51, 51));
        lblOdaNo.setText("Oda No:");

        lblSoyad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSoyad.setForeground(new java.awt.Color(51, 51, 51));
        lblSoyad.setText("Cinsiyet:");

        lblTelNo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTelNo.setForeground(new java.awt.Color(51, 51, 51));
        lblTelNo.setText("Giriş Tarih:");

        lblCocuk.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCocuk.setForeground(new java.awt.Color(51, 51, 51));
        lblCocuk.setText("Tel No:");

        lblYas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblYas.setForeground(new java.awt.Color(51, 51, 51));
        lblYas.setText("Çocuk:");

        lblCinsiyet.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCinsiyet.setForeground(new java.awt.Color(51, 51, 51));
        lblCinsiyet.setText("Yaş:");

        btnGuncelle.setBackground(new java.awt.Color(102, 255, 102));
        btnGuncelle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuncelle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update.png"))); // NOI18N
        btnGuncelle.setText("Güncelle");
        btnGuncelle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuncelleActionPerformed(evt);
            }
        });

        lblTelNo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTelNo1.setForeground(new java.awt.Color(51, 51, 51));
        lblTelNo1.setText("Çıkış Tarih:");

        javax.swing.GroupLayout jPanelBGLayout = new javax.swing.GroupLayout(jPanelBG);
        jPanelBG.setLayout(jPanelBGLayout);
        jPanelBGLayout.setHorizontalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelBGLayout.createSequentialGroup()
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBGLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(btnGuncelle)
                        .addGap(18, 18, 18)
                        .addComponent(btnGeri, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBGLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBGLayout.createSequentialGroup()
                                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanelBGLayout.createSequentialGroup()
                                        .addComponent(lblOdaNo)
                                        .addGap(33, 33, 33)
                                        .addComponent(txtOda, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelBGLayout.createSequentialGroup()
                                        .addComponent(lblCinsiyet)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtYas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 33, Short.MAX_VALUE)
                                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAd)
                                    .addComponent(lblYas))
                                .addGap(28, 28, 28))
                            .addGroup(jPanelBGLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(lblTelNo)
                                .addGap(18, 18, 18)
                                .addComponent(txtGirisTarih, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBGLayout.createSequentialGroup()
                                .addComponent(lblTelNo1)
                                .addGap(18, 18, 18)
                                .addComponent(txtCikisTarih, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelBGLayout.createSequentialGroup()
                                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCocuk)
                                    .addComponent(txtAdSoyad, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSoyad)
                                    .addComponent(lblCocuk))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCinsiyet, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(txtTelNo))))))
                .addGap(58, 58, 58))
        );
        jPanelBGLayout.setVerticalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOdaNo)
                    .addComponent(txtAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAd)
                    .addComponent(lblSoyad)
                    .addComponent(txtCinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYas, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCocuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCocuk)
                    .addComponent(txtTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCinsiyet)
                    .addComponent(txtYas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelNo)
                        .addComponent(txtGirisTarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelNo1)
                        .addComponent(txtCikisTarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGeri, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
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

    private void btnGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriActionPerformed
        //formlar arası geçişi sağladığımız kısım bu formun setvisibile'ını false MenuForum'un setvisible'ını true yapıyoruz//
        MenuForm mF = new MenuForm();
        mF.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnGeriActionPerformed

    private void tblMusteriListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMusteriListMouseClicked
        
        //int tc;
        int idx = tblMusteriList.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)tblMusteriList.getModel();
        tc = Integer.parseInt(model.getValueAt(idx, 0).toString());
        //eklediğimiz listeyi doldurması için OTEL databasemizdeki Musteriler Tablosundaki verileri seçen sorgu//
        String sql = "SELECT * FROM Musteriler where tc_no="+tc;
        DBHandler dbh;
        try
        {
            dbh = new DBHandler(connectionString,"sa","123");
            ResultSet rs = dbh.executeQuery(sql);
            while(rs.next())
            {
                txtOda.setText(rs.getString(2));
                txtAdSoyad.setText(rs.getString(3));
                txtCinsiyet.setText(rs.getString(4));
                txtYas.setText(rs.getString(5));
                txtCocuk.setText(rs.getString(6));
                txtTelNo.setText(rs.getString(7));
                txtGirisTarih.setText(rs.getString(8));
                txtCikisTarih.setText(rs.getString(9));
                break;
            }
            dbh.close();
        }
        catch (Exception e)
        {
            //
        }
    }//GEN-LAST:event_tblMusteriListMouseClicked

    private void btnGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuncelleActionPerformed
     
        //OTEL databasemizdeki Musteriler tablosuna,bu formda girdiğimiz verileri güncelleyebilmek için oluşturduğumuz sorgu//
        String sql = "Update Musteriler set oda_no='"+txtOda.getText()+"', ad_soyad='"+txtAdSoyad.getText()+"', cinsiyet='"+txtCinsiyet.getText()+"', yas='"+txtYas.getText()+"', cocuk='"+txtCocuk.getText()+"', tel_no='"+txtTelNo.getText()+"', giris_tarih='"+txtGirisTarih.getText()+"', cikis_tarih='"+txtCikisTarih.getText()+"' where tc_no="+tc;
        try
        {
            DBHandler dbh = new DBHandler(connectionString,"sa","123");
            int rows = dbh.executeNonQuery(sql);
            dbh.close();
            JOptionPane.showMessageDialog(null,"Kayıt Başarıyla Güncellendi");
            tableDoldur();
            //databse tablosunda ve listedeki güncelleme tamamlandıktan sonra textFieldların içini tekrardan boşaltıyoruz ki bir karışıklık olmasın//
            txtOda.setText("");
            txtAdSoyad.setText("");
            txtCinsiyet.setText("");
            txtYas.setText("");
            txtCocuk.setText("");
            txtTelNo.setText("");
            txtGirisTarih.setText("");
            txtCikisTarih.setText("");
        }
        catch (Exception e)
        {
            //
        }
    }//GEN-LAST:event_btnGuncelleActionPerformed
    
    // SQL'den Gelen Verileri Table'a Aktarma //
    private void tableDoldur()
    {
        DBHandler dbh = null;
        try
        {
            String sql = "SELECT * FROM Musteriler";
            dbh=new DBHandler(connectionString,"sa","123");
            ResultSet rs=dbh.executeQuery(sql);
            int count = 0;
            DefaultTableModel model = new DefaultTableModel();
            String[] col={"TC No","Oda No","Ad Soyad","Cinsiyet","Yaş","Çocuk Sayısı","Tel No","Giriş Tarih","Çıkış Tarih"};
            model.setColumnIdentifiers(col);
            tblMusteriList.setModel(model);
            while(rs.next())
            {
               model.addRow(new Object []{ rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),
                            rs.getString(5),rs.getInt(6),rs.getInt(7),rs.getDate(8),rs.getDate(9)});
                count++;
            }
        }
        catch (Exception e)
        {
            System.out.println("" + e.getMessage());
        }
        finally
        {
            try
            {
                dbh.close();
            }
            catch (SQLException ex) 
            {
                //
            }
        }
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriGuncelleForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeri;
    private javax.swing.JButton btnGuncelle;
    private javax.swing.JPanel jPanelBG;
    private javax.swing.JPanel jPanelList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAd;
    private javax.swing.JLabel lblCinsiyet;
    private javax.swing.JLabel lblCocuk;
    private javax.swing.JLabel lblOdaNo;
    private javax.swing.JLabel lblSoyad;
    private javax.swing.JLabel lblTelNo;
    private javax.swing.JLabel lblTelNo1;
    private javax.swing.JLabel lblYas;
    private javax.swing.JTable tblMusteriList;
    private javax.swing.JTextField txtAdSoyad;
    private javax.swing.JTextField txtCikisTarih;
    private javax.swing.JTextField txtCinsiyet;
    private javax.swing.JTextField txtCocuk;
    private javax.swing.JTextField txtGirisTarih;
    private javax.swing.JTextField txtOda;
    private javax.swing.JTextField txtTelNo;
    private javax.swing.JTextField txtYas;
    // End of variables declaration//GEN-END:variables
}
