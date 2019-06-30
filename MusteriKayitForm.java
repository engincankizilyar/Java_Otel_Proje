package deneme;

import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MusteriKayitForm extends javax.swing.JFrame{

    String connectionString = "jdbc:sqlserver://localhost:1433; databaseName=OTEL";
    Oda[] oda;
    
    // Constructor Method //
    public MusteriKayitForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Müşteri Kayıt");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/customer.png")));
        this.setResizable(false);
        tableDoldur();
        odaDoldur();
    }
    
    // SQL'den Gelen Verileri Table'a Aktarma //
    private void tableDoldur()
    {
        DBHandler dbh = null;
        try
        {
            //eklediğimiz listeyi doldurması için OTEL databasemizdeki Musteriler Tablosundaki verileri seçen sorgu//
            String sql = "SELECT * FROM Musteriler";
            dbh = new DBHandler(connectionString,"sa","123");
            ResultSet rs = dbh.executeQuery(sql);
            int count = 0;
            DefaultTableModel model = new DefaultTableModel();
            String[] col={"TC No","Oda No","Ad Soyad","Cinsiyet","Yaş","Çocuk","Tel No","Giriş Tarihi","Çıkış Tarihi"};//sütunların ismi//
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
    // SQL'den Gelen Verileri Table'a Aktarma //
    public void odaDoldur()
    {
        DBHandler dbh = null;
        try
        {
            //eklediğimiz listeyi doldurması için OTEL databasemizdeki Oda Tablosundaki verileri seçen sorgu//
            String sql = "SELECT * FROM Oda where oda_no not in(Select oda_no from Musteriler)";
            dbh = new DBHandler(connectionString,"sa","123");
            ResultSet rs = dbh.executeQuery(sql);
            int count = 0;
            Vector model = new Vector();
            while(rs.next())
            {  
                model.addElement(new Oda(rs.getInt(1),rs.getString(2),rs.getString(3),
                                rs.getInt(4),rs.getInt(5)).toString());
                count++;
            }
            cboxOdaNo.setModel(new DefaultComboBoxModel(model));
            if (dbh != null) 
            {
                dbh.close();
            }
       } 
       catch (SQLException ex) 
       {
            System.out.println("catccath"+ex.getMessage());
       }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBG = new javax.swing.JPanel();
        jPanelMusteri = new javax.swing.JPanel();
        lblAdSoyad = new javax.swing.JLabel();
        lblTC = new javax.swing.JLabel();
        lblCinsiyet = new javax.swing.JLabel();
        txtTC = new javax.swing.JTextField();
        txtAdSoyad = new javax.swing.JTextField();
        cboxCinsiyet = new javax.swing.JComboBox<>();
        lblTCfoto = new javax.swing.JLabel();
        lblAdSoyadfoto = new javax.swing.JLabel();
        lblCinsiyetfoto = new javax.swing.JLabel();
        txtTelNo = new javax.swing.JTextField();
        lblTelNo = new javax.swing.JLabel();
        lblTelNofoto = new javax.swing.JLabel();
        lblCocukfoto = new javax.swing.JLabel();
        lblCocuk = new javax.swing.JLabel();
        cboxCocuk = new javax.swing.JComboBox<>();
        lblYasfoto = new javax.swing.JLabel();
        lblYas = new javax.swing.JLabel();
        txtYas = new javax.swing.JTextField();
        jPanelOda = new javax.swing.JPanel();
        lblGiris = new javax.swing.JLabel();
        lblCikis = new javax.swing.JLabel();
        lblOdaNo = new javax.swing.JLabel();
        lblOdaNofoto = new javax.swing.JLabel();
        lblGirisfoto = new javax.swing.JLabel();
        lblCikisfoto = new javax.swing.JLabel();
        cboxOdaNo = new javax.swing.JComboBox<>();
        txtGiris = new javax.swing.JTextField();
        txtCikis = new javax.swing.JTextField();
        jScrollPanelOdaList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMusteriList = new javax.swing.JTable();
        btnEkle = new javax.swing.JButton();
        btnGeri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBG.setBackground(new java.awt.Color(125, 95, 255));

        jPanelMusteri.setBackground(new java.awt.Color(125, 95, 255));
        jPanelMusteri.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Müşteri Bilgileri", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        lblAdSoyad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAdSoyad.setForeground(new java.awt.Color(255, 255, 255));
        lblAdSoyad.setText("Ad Soyad:");

        lblTC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTC.setForeground(new java.awt.Color(255, 255, 255));
        lblTC.setText("TC Kimlik No:");

        lblCinsiyet.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCinsiyet.setForeground(new java.awt.Color(255, 255, 255));
        lblCinsiyet.setText("Cinsiyet:");

        cboxCinsiyet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Erkek", "Kadın" }));

        lblTCfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/id.png"))); // NOI18N

        lblAdSoyadfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/name.png"))); // NOI18N

        lblCinsiyetfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gender.png"))); // NOI18N

        lblTelNo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTelNo.setForeground(new java.awt.Color(255, 255, 255));
        lblTelNo.setText("Tel. No:");

        lblTelNofoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/phone.png"))); // NOI18N

        lblCocukfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/children.png"))); // NOI18N

        lblCocuk.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCocuk.setForeground(new java.awt.Color(255, 255, 255));
        lblCocuk.setText("0-12 Yaş Çocuk:");

        cboxCocuk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        lblYasfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/adult.png"))); // NOI18N

        lblYas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblYas.setForeground(new java.awt.Color(255, 255, 255));
        lblYas.setText("Yaş:");

        javax.swing.GroupLayout jPanelMusteriLayout = new javax.swing.GroupLayout(jPanelMusteri);
        jPanelMusteri.setLayout(jPanelMusteriLayout);
        jPanelMusteriLayout.setHorizontalGroup(
            jPanelMusteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMusteriLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanelMusteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMusteriLayout.createSequentialGroup()
                        .addComponent(lblYasfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblYas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtYas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMusteriLayout.createSequentialGroup()
                        .addComponent(lblCocukfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCocuk)
                        .addGap(38, 38, 38)
                        .addComponent(cboxCocuk, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMusteriLayout.createSequentialGroup()
                        .addComponent(lblCinsiyetfoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCinsiyet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboxCinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMusteriLayout.createSequentialGroup()
                        .addComponent(lblAdSoyadfoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAdSoyad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMusteriLayout.createSequentialGroup()
                        .addComponent(lblTCfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(txtTC, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMusteriLayout.createSequentialGroup()
                        .addComponent(lblTelNofoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTelNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
        );
        jPanelMusteriLayout.setVerticalGroup(
            jPanelMusteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMusteriLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelMusteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMusteriLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanelMusteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTC)
                            .addComponent(txtTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addComponent(lblTCfoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMusteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAdSoyadfoto)
                    .addGroup(jPanelMusteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAdSoyad)))
                .addGap(26, 26, 26)
                .addGroup(jPanelMusteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMusteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboxCinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCinsiyet))
                    .addComponent(lblCinsiyetfoto))
                .addGap(18, 18, 18)
                .addGroup(jPanelMusteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblYasfoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtYas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMusteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCocukfoto)
                    .addGroup(jPanelMusteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCocuk)
                        .addComponent(cboxCocuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelMusteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelNofoto)
                    .addGroup(jPanelMusteriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelNo)
                        .addComponent(txtTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanelOda.setBackground(new java.awt.Color(125, 95, 255));
        jPanelOda.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Oda / Tarih Bilgileri", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        lblGiris.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblGiris.setForeground(new java.awt.Color(255, 255, 255));
        lblGiris.setText("Giriş Tarihi:");

        lblCikis.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCikis.setForeground(new java.awt.Color(255, 255, 255));
        lblCikis.setText("Çıkış Tarihi:");

        lblOdaNo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOdaNo.setForeground(new java.awt.Color(255, 255, 255));
        lblOdaNo.setText("Oda No:");

        lblOdaNofoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/key-card.png"))); // NOI18N

        lblGirisfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/entry-date.png"))); // NOI18N

        lblCikisfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/release-date.png"))); // NOI18N

        javax.swing.GroupLayout jPanelOdaLayout = new javax.swing.GroupLayout(jPanelOda);
        jPanelOda.setLayout(jPanelOdaLayout);
        jPanelOdaLayout.setHorizontalGroup(
            jPanelOdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOdaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanelOdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOdaLayout.createSequentialGroup()
                        .addComponent(lblGirisfoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelOdaLayout.createSequentialGroup()
                        .addComponent(lblOdaNofoto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOdaNo))
                    .addGroup(jPanelOdaLayout.createSequentialGroup()
                        .addComponent(lblCikisfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCikis)))
                .addGap(19, 19, 19)
                .addGroup(jPanelOdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCikis, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxOdaNo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 46, Short.MAX_VALUE))
        );
        jPanelOdaLayout.setVerticalGroup(
            jPanelOdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOdaLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanelOdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOdaLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanelOdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOdaNo)
                            .addComponent(cboxOdaNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblOdaNofoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelOdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblGirisfoto)
                    .addGroup(jPanelOdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblGiris)
                        .addComponent(txtGiris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanelOdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelOdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCikis)
                        .addComponent(txtCikis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCikisfoto))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jScrollPanelOdaList.setBackground(new java.awt.Color(125, 95, 255));
        jScrollPanelOdaList.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Müşteri Liste", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        tblMusteriList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TC No", "Oda No", "Ad Soyad", "Cinsiyet", "Yaş", "Çocuk", "Tel No", "Giriş Tarihi", "Çıkış Tarihi"
            }
        ));
        jScrollPane1.setViewportView(tblMusteriList);

        javax.swing.GroupLayout jScrollPanelOdaListLayout = new javax.swing.GroupLayout(jScrollPanelOdaList);
        jScrollPanelOdaList.setLayout(jScrollPanelOdaListLayout);
        jScrollPanelOdaListLayout.setHorizontalGroup(
            jScrollPanelOdaListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
        );
        jScrollPanelOdaListLayout.setVerticalGroup(
            jScrollPanelOdaListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jScrollPanelOdaListLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        javax.swing.GroupLayout jPanelBGLayout = new javax.swing.GroupLayout(jPanelBG);
        jPanelBG.setLayout(jPanelBGLayout);
        jPanelBGLayout.setHorizontalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBGLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPanelOdaList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelBGLayout.createSequentialGroup()
                        .addComponent(jPanelMusteri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelOda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelBGLayout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGeri, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelBGLayout.setVerticalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBGLayout.createSequentialGroup()
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelMusteri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelOda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGeri, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPanelOdaList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
            //sorgunun içine yazılacak değişkenleri oluşturup içlerine textField içindeki girdiyi atıyoruz//
            String tcno = txtTC.getText();
            String adSoyad = txtAdSoyad.getText();
            String cinsiyet = cboxCinsiyet.getSelectedItem().toString();
            String yas = txtYas.getText();
            String cocuk = cboxCocuk.getSelectedItem().toString();
            String telno = txtTelNo.getText();
            String odano = cboxOdaNo.getSelectedItem().toString();
            String girisTarih = txtGiris.getText();
            String cikisTarih = txtCikis.getText();
            
            if(txtTC.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"TC Kimlik No alanı boş bırakılamaz.");
            }
            else if(txtAdSoyad.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Ad Soyad alanı boş bırakılamaz.");
            }
            else if(cboxCinsiyet.getSelectedItem().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Cinsiyet alanı boş bırakılamaz.");
            }
            else if(txtYas.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Yaş alanı boş bırakılamaz.");
            }
            else if(cboxCocuk.getSelectedItem().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Çocuk Sayısı alanı boş bırakılamaz.");
            }
            else if(txtTelNo.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Tel.No alanı boş bırakılamaz.");
            }
            else if(cboxOdaNo.getSelectedItem().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Oda No alanı boş bırakılamaz.");
            }
            else if(txtGiris.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Giriş Tarihi alanı boş bırakılamaz.");
            }
            else if(txtCikis.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Çıkış Tarihi alanı boş bırakılamaz.");
            }
            else 
            {
            //OTEL databasemizdeki Musteriler tablosuna Bu formda girdiğimiz verileri ekleyebilmek için oluşturduğumuz sorgu//
            String sql="INSERT INTO Musteriler values('"+tcno+"','"+odano+"','"+adSoyad+"','"+cinsiyet+"','"+yas+"','"+cocuk+"','"+telno+"','"+girisTarih+"','"+cikisTarih+"')";
            try 
            {
                DBHandler dbh = new DBHandler(connectionString,"sa","123");
                dbh.executeNonQuery(sql);
                JOptionPane.showMessageDialog(null, "Müşteri Başarıyla Eklendi!");
            }
            catch (SQLException e) 
            {
                JOptionPane.showMessageDialog(null, "Hata!");
            }
            //müşteriyi ekledikten sonra textFieldların içini tekrardan boşaltıyoruz ki bir karışıklık olmasın//
            txtTC.setText("");
            txtAdSoyad.setText("");
            cboxCinsiyet.setSelectedIndex(0);
            txtYas.setText("");
            cboxCocuk.setSelectedIndex(0);
            txtTelNo.setText("");
            txtGiris.setText("");
            txtCikis.setText("");
            tableDoldur();
            odaDoldur();
            }
    }//GEN-LAST:event_btnEkleActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriKayitForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnGeri;
    private javax.swing.JComboBox<String> cboxCinsiyet;
    private javax.swing.JComboBox<String> cboxCocuk;
    private javax.swing.JComboBox<String> cboxOdaNo;
    private javax.swing.JPanel jPanelBG;
    private javax.swing.JPanel jPanelMusteri;
    private javax.swing.JPanel jPanelOda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jScrollPanelOdaList;
    private javax.swing.JLabel lblAdSoyad;
    private javax.swing.JLabel lblAdSoyadfoto;
    private javax.swing.JLabel lblCikis;
    private javax.swing.JLabel lblCikisfoto;
    private javax.swing.JLabel lblCinsiyet;
    private javax.swing.JLabel lblCinsiyetfoto;
    private javax.swing.JLabel lblCocuk;
    private javax.swing.JLabel lblCocukfoto;
    private javax.swing.JLabel lblGiris;
    private javax.swing.JLabel lblGirisfoto;
    private javax.swing.JLabel lblOdaNo;
    private javax.swing.JLabel lblOdaNofoto;
    private javax.swing.JLabel lblTC;
    private javax.swing.JLabel lblTCfoto;
    private javax.swing.JLabel lblTelNo;
    private javax.swing.JLabel lblTelNofoto;
    private javax.swing.JLabel lblYas;
    private javax.swing.JLabel lblYasfoto;
    private javax.swing.JTable tblMusteriList;
    private javax.swing.JTextField txtAdSoyad;
    private javax.swing.JTextField txtCikis;
    private javax.swing.JTextField txtGiris;
    private javax.swing.JTextField txtTC;
    private javax.swing.JTextField txtTelNo;
    private javax.swing.JTextField txtYas;
    // End of variables declaration//GEN-END:variables
}
