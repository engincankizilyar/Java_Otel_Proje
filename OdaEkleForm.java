package deneme;

import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class OdaEkleForm extends javax.swing.JFrame {
    
    String connectionString = "jdbc:sqlserver://localhost:1433; databaseName=OTEL";

    public OdaEkleForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Oda Ekle");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/room.png")));
        this.setResizable(false);
        tableDoldur();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblOdaNo = new javax.swing.JLabel();
        txtOdaNo = new javax.swing.JTextField();
        lblOdaTip = new javax.swing.JLabel();
        txtOdaTip = new javax.swing.JTextField();
        lblOzellik = new javax.swing.JLabel();
        txtOzellik = new javax.swing.JTextField();
        lblKapasite = new javax.swing.JLabel();
        txtKapasite = new javax.swing.JTextField();
        lblFiyat = new javax.swing.JLabel();
        txtFiyat = new javax.swing.JTextField();
        lblOdaNofoto = new javax.swing.JLabel();
        lblOdaTipfoto = new javax.swing.JLabel();
        lblKapasitefoto = new javax.swing.JLabel();
        lblOzellikfoto = new javax.swing.JLabel();
        lblFiyatfoto = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOdaList = new javax.swing.JTable();
        btnEkle = new javax.swing.JButton();
        btnGeri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(125, 95, 255));

        jPanel2.setBackground(new java.awt.Color(125, 95, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Oda Bilgileri", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        lblOdaNo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOdaNo.setForeground(new java.awt.Color(255, 255, 255));
        lblOdaNo.setText("Oda No:");

        lblOdaTip.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOdaTip.setForeground(new java.awt.Color(255, 255, 255));
        lblOdaTip.setText("Oda Tipi:");

        lblOzellik.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOzellik.setForeground(new java.awt.Color(255, 255, 255));
        lblOzellik.setText("Özellik:");

        lblKapasite.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblKapasite.setForeground(new java.awt.Color(255, 255, 255));
        lblKapasite.setText("Kapasite:");

        lblFiyat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFiyat.setForeground(new java.awt.Color(255, 255, 255));
        lblFiyat.setText("Fiyat:");

        lblOdaNofoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/key-card.png"))); // NOI18N

        lblOdaTipfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/room.png"))); // NOI18N

        lblKapasitefoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/capacity.png"))); // NOI18N

        lblOzellikfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/properties.png"))); // NOI18N

        lblFiyatfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/price.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblOdaNofoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblOdaNo)
                        .addGap(18, 18, 18)
                        .addComponent(txtOdaNo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblOzellikfoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblOzellik)
                        .addGap(20, 20, 20)
                        .addComponent(txtOzellik, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblOdaTipfoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblOdaTip)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(txtOdaTip, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblKapasitefoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblKapasite)
                        .addGap(18, 18, 18)
                        .addComponent(txtKapasite)))
                .addGap(68, 68, 68))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(lblFiyatfoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFiyat)
                .addGap(18, 18, 18)
                .addComponent(txtFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtOdaTip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblOdaNo)
                                .addComponent(txtOdaNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblOdaNofoto))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblOdaTipfoto)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblOdaTip))))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblKapasitefoto)
                        .addComponent(lblKapasite, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtKapasite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblOzellik)
                        .addComponent(txtOzellik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblOzellikfoto)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFiyat)
                    .addComponent(txtFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFiyatfoto))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(125, 95, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Oda Listesi", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        tblOdaList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Oda No", "Oda Tipi", "Özellik", "Kapasite", "Fiyat"
            }
        ));
        jScrollPane1.setViewportView(tblOdaList);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnEkle.setBackground(new java.awt.Color(102, 255, 102));
        btnEkle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEkle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        btnEkle.setText("Ekle");
        btnEkle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGeri, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGeri, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnEkle, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
     // SQL'den Gelen Verileri Table'a Aktarma //
    private void tableDoldur()
    {
        DBHandler dbh = null;
        try
        {
            String sql = "SELECT * FROM Oda";
            dbh=new DBHandler(connectionString,"sa","123");
            ResultSet rs=dbh.executeQuery(sql);
            int count = 0;
            DefaultTableModel model = new DefaultTableModel();
            String[] col={"Oda No","Oda Tipi","Özellik","Kapasite","Fiyat"};
            model.setColumnIdentifiers(col);
            tblOdaList.setModel(model);
            while(rs.next())
            {
                model.addRow(new Object []{ rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),
                                rs.getInt(5)});
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
    
    private void btnGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriActionPerformed
         //formlar arası geçişi sağladığımız kısım bu formun setvisibile'ını false MenuForum'un setvisible'ını true yapıyoruz//
        MenuForm mF = new MenuForm();
        mF.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnGeriActionPerformed

    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
        //sorgunun içine yazılacak değişkenleri oluşturup içlerine textField içindeki girdiyi atıyoruz//
        String odano = txtOdaNo.getText();
        String odatip = txtOdaTip.getText();
        String ozellik = txtOzellik.getText();
        String kapasite = txtKapasite.getText();
        String fiyat = txtFiyat.getText();
        //OTEL databasemizdeki Oda tablosuna Bu formda girdiğimiz verileri ekleyebilmek için oluşturduğumuz sorgu//
        String sql="INSERT INTO Oda values('"+odano+"','"+odatip+"','"+ozellik+"','"+kapasite+"','"+fiyat+"')";
        try 
        {
            DBHandler dbh = new DBHandler(connectionString,"sa","123");
            dbh.executeNonQuery(sql);
            JOptionPane.showMessageDialog(null, "Oda Başarıyla Eklendi!");
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Hata!");
        }
        ///odayı database'e ekledikten sonra textFieldların içini tekrardan boşaltıyoruz ki bir karışıklık olmasın//
        txtOdaNo.setText("");
        txtOdaTip.setText("");
        txtOzellik.setText("");
        txtKapasite.setText("");
        txtFiyat.setText("");
        tableDoldur();
    }//GEN-LAST:event_btnEkleActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OdaEkleForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnGeri;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFiyat;
    private javax.swing.JLabel lblFiyatfoto;
    private javax.swing.JLabel lblKapasite;
    private javax.swing.JLabel lblKapasitefoto;
    private javax.swing.JLabel lblOdaNo;
    private javax.swing.JLabel lblOdaNofoto;
    private javax.swing.JLabel lblOdaTip;
    private javax.swing.JLabel lblOdaTipfoto;
    private javax.swing.JLabel lblOzellik;
    private javax.swing.JLabel lblOzellikfoto;
    private javax.swing.JTable tblOdaList;
    private javax.swing.JTextField txtFiyat;
    private javax.swing.JTextField txtKapasite;
    private javax.swing.JTextField txtOdaNo;
    private javax.swing.JTextField txtOdaTip;
    private javax.swing.JTextField txtOzellik;
    // End of variables declaration//GEN-END:variables
}
