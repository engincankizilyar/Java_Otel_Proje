package deneme;

import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MusteriCikisForm extends javax.swing.JFrame {

    String connectionString = "jdbc:sqlserver://localhost:1433; databaseName=OTEL";
    int tc;//sorgudaki tc_no değeri ile eşleştirmek oluşturduğumuz değişken
    
    
    public MusteriCikisForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Müşteri Çıkış");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/homepage.png")));
        this.setResizable(false);
        tableDoldur();
    }
    // SQL'den Gelen Verileri Table'a Aktarma //
    private void tableDoldur()
    {
        DBHandler dbh = null;
        try
        {
            //Müşterinin kayıtlı olduğu odanın fiyatını Oda tablosundan getirip Müşteri bilgileri ile birleştirerek 2 tabloyu bir hale getiren kod
            String sql = "SELECT Musteriler.tc_no, Musteriler.oda_no, Musteriler.ad_soyad, Musteriler.cocuk, Musteriler.giris_tarih, Musteriler.cikis_tarih, Oda.fiyat from Musteriler INNER JOIN Oda ON Oda.oda_no=Musteriler.oda_no";
            dbh=new DBHandler(connectionString,"sa","123");
            ResultSet rs=dbh.executeQuery(sql);
            int count = 0;
            DefaultTableModel model = new DefaultTableModel();
            String[] col={"TC No","Oda No","Ad Soyad","Çocuk Sayısı","Giriş Tarih","Çıkış Tarih","Fiyat"};
            model.setColumnIdentifiers(col);
            tblMusteriList.setModel(model);
            while(rs.next())
            {
               model.addRow(new Object []{ rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getInt(4),
                            rs.getDate(5),rs.getDate(6),rs.getInt(7)});
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
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMusteriList = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblTopFiyat = new javax.swing.JLabel();
        btnSil = new javax.swing.JButton();
        btnGeri = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblOdaNo1 = new javax.swing.JLabel();
        txtOda = new javax.swing.JTextField();
        lblOdaNo2 = new javax.swing.JLabel();
        txtAdSoyad = new javax.swing.JTextField();
        lblOdaNo3 = new javax.swing.JLabel();
        txtCocuk = new javax.swing.JTextField();
        txtFiyat = new javax.swing.JTextField();
        lblOdaNo6 = new javax.swing.JLabel();
        lblOdaNo5 = new javax.swing.JLabel();
        txtCikisTarih = new javax.swing.JTextField();
        txtGirisTarih = new javax.swing.JTextField();
        lblOdaNo4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(125, 95, 255));

        jPanel2.setBackground(new java.awt.Color(125, 95, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Müşteri Liste", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        tblMusteriList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "TC No", "Oda No", "Ad Soyad", "Çocuk", "Giriş Tarih", "Çıkış Tarih", "Fiyat"
            }
        ));
        tblMusteriList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMusteriListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMusteriList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Toplam Fiyat:");

        lblTopFiyat.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        btnSil.setBackground(new java.awt.Color(102, 255, 102));
        btnSil.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        btnSil.setText("Sil");
        btnSil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

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

        jPanel3.setBackground(new java.awt.Color(125, 95, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Çıkış İşlemleri Yapılacak Müşteri Bilgileri", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        lblOdaNo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOdaNo1.setForeground(new java.awt.Color(51, 51, 51));
        lblOdaNo1.setText("Oda No:");

        lblOdaNo2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOdaNo2.setForeground(new java.awt.Color(51, 51, 51));
        lblOdaNo2.setText("Ad Soyad:");

        lblOdaNo3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOdaNo3.setForeground(new java.awt.Color(51, 51, 51));
        lblOdaNo3.setText("Çocuk:");

        lblOdaNo6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOdaNo6.setForeground(new java.awt.Color(51, 51, 51));
        lblOdaNo6.setText("Fiyat:");

        lblOdaNo5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOdaNo5.setForeground(new java.awt.Color(51, 51, 51));
        lblOdaNo5.setText("Çıkış Tarih:");

        lblOdaNo4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOdaNo4.setForeground(new java.awt.Color(51, 51, 51));
        lblOdaNo4.setText("Giriş Tarih:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblOdaNo4)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblOdaNo1)
                        .addGap(28, 28, 28)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtOda)
                        .addGap(47, 47, 47)
                        .addComponent(lblOdaNo2)
                        .addGap(18, 18, 18)
                        .addComponent(txtAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtGirisTarih, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(lblOdaNo5)
                        .addGap(18, 18, 18)
                        .addComponent(txtCikisTarih, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblOdaNo3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCocuk, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblOdaNo6)
                        .addGap(24, 24, 24)
                        .addComponent(txtFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOdaNo1)
                    .addComponent(txtAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOdaNo2)
                    .addComponent(txtCocuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOdaNo3))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblOdaNo6))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtGirisTarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblOdaNo4)
                        .addComponent(txtCikisTarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblOdaNo5)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(263, 263, 263)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(288, 288, 288)
                                .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(lblTopFiyat))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnGeri)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGeri, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblTopFiyat))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriActionPerformed
         //formlar arası geçişi sağladığımız kısım bu formun setvisibile'ını false MenuForum'un setvisible'ını true yapıyoruz//
        MenuForm mF = new MenuForm();
        mF.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnGeriActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        //OTEL databasemizdeki Musteriler tablosuna Bu formda girdiğimiz verileri silmek için oluşturduğumuz sorgu//
        String sql = "DELETE FROM Musteriler where tc_no="+tc;
        try
        {
            DBHandler dbh = new DBHandler(connectionString,"sa","123");
            int rows = dbh.executeNonQuery(sql);
            dbh.close();
            JOptionPane.showMessageDialog(null,"Kayıt Başarıyla Silindi");
            tableDoldur();
            //databse tablosunda ve listedeki silme işlemi tamamlandıktan sonra textFieldların içini tekrardan boşaltıyoruz ki bir karışıklık olmasın//
            txtOda.setText("");
            txtAdSoyad.setText("");
            txtCocuk.setText("");
            txtGirisTarih.setText("");
            txtCikisTarih.setText("");
            txtFiyat.setText("");
            lblTopFiyat.setText("");
        }
        catch (Exception e)
        {
            //
        }

    }//GEN-LAST:event_btnSilActionPerformed

    private void tblMusteriListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMusteriListMouseClicked

        int idx = tblMusteriList.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)tblMusteriList.getModel();
        tc = Integer.parseInt(model.getValueAt(idx, 0).toString());
        //Müşterinin kayıtlı olduğu odanın fiyatını Oda tablosundan getirip Müşteri bilgileri ile birleştirerek 2 tabloyu bir hale getiren kod//
        String sql = "SELECT Musteriler.tc_no, Musteriler.oda_no, Musteriler.ad_soyad, Musteriler.cocuk, Musteriler.giris_tarih, Musteriler.cikis_tarih, Oda.fiyat from Musteriler INNER JOIN Oda ON Oda.oda_no=Musteriler.oda_no where Musteriler.tc_no="+tc;
        DBHandler dbh;
        try
        {
            dbh = new DBHandler(connectionString,"sa","123");
            ResultSet rs = dbh.executeQuery(sql);
            while(rs.next())
            {
                txtOda.setText(rs.getString(2));
                txtAdSoyad.setText(rs.getString(3));
                txtCocuk.setText(rs.getString(4));
                txtGirisTarih.setText(rs.getString(5));
                txtCikisTarih.setText(rs.getString(6));
                txtFiyat.setText(rs.getString(7));

                int cocuk, fiyat;
                cocuk = Integer.parseInt(txtCocuk.getText());
                fiyat = Integer.parseInt(txtFiyat.getText());
                int top = fiyat - (fiyat*20/100);
                if (cocuk > 0)
                lblTopFiyat.setText(""+top+" TL");
                else
                lblTopFiyat.setText(""+fiyat+" TL");
                break;
            }
            dbh.close();
        }
        catch (Exception e)
        {
            //
        }
    }//GEN-LAST:event_tblMusteriListMouseClicked

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriCikisForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeri;
    private javax.swing.JButton btnSil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOdaNo1;
    private javax.swing.JLabel lblOdaNo2;
    private javax.swing.JLabel lblOdaNo3;
    private javax.swing.JLabel lblOdaNo4;
    private javax.swing.JLabel lblOdaNo5;
    private javax.swing.JLabel lblOdaNo6;
    private javax.swing.JLabel lblTopFiyat;
    private javax.swing.JTable tblMusteriList;
    private javax.swing.JTextField txtAdSoyad;
    private javax.swing.JTextField txtCikisTarih;
    private javax.swing.JTextField txtCocuk;
    private javax.swing.JTextField txtFiyat;
    private javax.swing.JTextField txtGirisTarih;
    private javax.swing.JTextField txtOda;
    // End of variables declaration//GEN-END:variables
}
