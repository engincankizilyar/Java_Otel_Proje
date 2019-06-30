package deneme;

import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class OdaGuncelleForm extends javax.swing.JFrame {

    String connectionString = "jdbc:sqlserver://localhost:1433; databaseName=OTEL";
    int oda_no;//sorgudaki oda_no değeri ile eşleştirmek oluşturduğumuz değişken
    
    public OdaGuncelleForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Oda Güncelle");
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
        tblOdaList = new javax.swing.JTable();
        btnGeri = new javax.swing.JButton();
        txtKapasite = new javax.swing.JTextField();
        txtOzellik = new javax.swing.JTextField();
        txtOdaTip = new javax.swing.JTextField();
        lblOzellik = new javax.swing.JLabel();
        lblOdaTip = new javax.swing.JLabel();
        lblKapasite = new javax.swing.JLabel();
        txtFiyat = new javax.swing.JTextField();
        lblFiyat = new javax.swing.JLabel();
        btnGuncelle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBG.setBackground(new java.awt.Color(125, 95, 255));

        jPanelList.setBackground(new java.awt.Color(125, 95, 255));
        jPanelList.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Oda Listesi", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        tblOdaList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Oda No", "Oda Tipi", "Özellik", "Kapasite", "Fiyat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOdaList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOdaListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOdaList);

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

        lblOzellik.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOzellik.setForeground(new java.awt.Color(51, 51, 51));
        lblOzellik.setText("Özellik:");

        lblOdaTip.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOdaTip.setForeground(new java.awt.Color(51, 51, 51));
        lblOdaTip.setText("Oda Tip:");

        lblKapasite.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblKapasite.setForeground(new java.awt.Color(51, 51, 51));
        lblKapasite.setText("Kapasite:");

        lblFiyat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFiyat.setForeground(new java.awt.Color(51, 51, 51));
        lblFiyat.setText("Fiyat:");

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

        javax.swing.GroupLayout jPanelBGLayout = new javax.swing.GroupLayout(jPanelBG);
        jPanelBG.setLayout(jPanelBGLayout);
        jPanelBGLayout.setHorizontalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBGLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGuncelle)
                .addGap(18, 18, 18)
                .addComponent(btnGeri)
                .addGap(308, 308, 308))
            .addGroup(jPanelBGLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblOdaTip)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtOdaTip, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblOzellik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtOzellik, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblKapasite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtKapasite, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblFiyat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanelBGLayout.setVerticalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOdaTip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOdaTip)
                    .addComponent(txtOzellik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOzellik)
                    .addComponent(lblKapasite)
                    .addComponent(txtKapasite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFiyat)
                    .addComponent(txtFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGeri, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
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

    private void tblOdaListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOdaListMouseClicked

        int idx = tblOdaList.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)tblOdaList.getModel();
        oda_no = Integer.parseInt(model.getValueAt(idx, 0).toString());
        //OTEL databasemizdeki Oda Tablosundaki verileri seçen sorgu//
        String sql = "SELECT * FROM Oda where oda_no="+oda_no;
        DBHandler dbh;
        try
        {
            dbh = new DBHandler(connectionString,"sa","123");
            ResultSet rs = dbh.executeQuery(sql);
            while(rs.next())
            {
                txtOdaTip.setText(rs.getString(2));
                txtOzellik.setText(rs.getString(3));
                txtKapasite.setText(rs.getString(4));
                txtFiyat.setText(rs.getString(5));
                break;
            }
            dbh.close();
        }
        catch (Exception e)
        {
            //
        }
    }//GEN-LAST:event_tblOdaListMouseClicked

    private void btnGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriActionPerformed

        MenuForm mF = new MenuForm();
        mF.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnGeriActionPerformed

    private void btnGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuncelleActionPerformed
        //OTEL databasemizdeki Oda tablosuna,bu formda girdiğimiz verileri güncelleyebilmek için oluşturduğumuz sorgu//
        String sql = "Update Oda set oda_tip='"+txtOdaTip.getText()+"', ozellik='"+txtOzellik.getText()+"', kapasite='"+txtKapasite.getText()+"', fiyat='"+txtFiyat.getText()+"' where oda_no="+oda_no;
        try
        {
            DBHandler dbh = new DBHandler(connectionString,"sa","123");
            int rows = dbh.executeNonQuery(sql);
            dbh.close();
            JOptionPane.showMessageDialog(null,"Kayıt Başarıyla Güncellendi");
            tableDoldur();
            txtOdaTip.setText("");
            txtOzellik.setText("");
            txtKapasite.setText("");
            txtFiyat.setText("");
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
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OdaGuncelleForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeri;
    private javax.swing.JButton btnGuncelle;
    private javax.swing.JPanel jPanelBG;
    private javax.swing.JPanel jPanelList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFiyat;
    private javax.swing.JLabel lblKapasite;
    private javax.swing.JLabel lblOdaTip;
    private javax.swing.JLabel lblOzellik;
    private javax.swing.JTable tblOdaList;
    private javax.swing.JTextField txtFiyat;
    private javax.swing.JTextField txtKapasite;
    private javax.swing.JTextField txtOdaTip;
    private javax.swing.JTextField txtOzellik;
    // End of variables declaration//GEN-END:variables
}
