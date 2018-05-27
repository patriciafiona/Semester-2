
import java.util.Scanner;
import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JOptionPane;

public class mainFrame extends javax.swing.JFrame {

    public static String getNode;
    
    //nomor mulai node
    public static int x = 480;
    public static int y = 100;
    public static int per = 1;
    
    //buat nentuin titik garis awal sama akhir
    public static int xAwal = 480;
    public static int xAkhir = 480;
    
    public static int yAwal = 100;
    
    //untuk binary Search Treenya
    public static int[] bst = new int[16];
    public static int elemen;
   
    
    
    public mainFrame() {
        for(int i = 1; i < 16; i++){
            bst[i] = 0;
        }

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kosong = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        insertButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        insertPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BoxParent = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        nodeValue = new javax.swing.JTextField();
        AddNodeButton = new javax.swing.JButton();
        tempatKanvas = new javax.swing.JScrollPane();
        canvasPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(930, 0));

        kosong.setBackground(new java.awt.Color(204, 204, 204));
        kosong.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kosong.setLayout(new java.awt.CardLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Binary Search Tree");

        jLabel4.setText("Insert Section");

        insertButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        insertButton.setText("Insert");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        resetButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(homePanelLayout.createSequentialGroup()
                                .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel4))
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(102, 102, 102)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertButton)
                    .addComponent(resetButton))
                .addGap(33, 33, 33)
                .addComponent(exitButton)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        kosong.add(homePanel, "card2");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Binary Search Tree");

        jLabel2.setText("Insert Section");

        BoxParent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Node Value");

        nodeValue.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        AddNodeButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AddNodeButton.setText("Add");
        AddNodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNodeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BoxParentLayout = new javax.swing.GroupLayout(BoxParent);
        BoxParent.setLayout(BoxParentLayout);
        BoxParentLayout.setHorizontalGroup(
            BoxParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BoxParentLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(BoxParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BoxParentLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AddNodeButton))
                    .addGroup(BoxParentLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nodeValue, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        BoxParentLayout.setVerticalGroup(
            BoxParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BoxParentLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(BoxParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nodeValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(AddNodeButton)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout insertPanelLayout = new javax.swing.GroupLayout(insertPanel);
        insertPanel.setLayout(insertPanelLayout);
        insertPanelLayout.setHorizontalGroup(
            insertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertPanelLayout.createSequentialGroup()
                .addGroup(insertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(insertPanelLayout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel2))
                    .addGroup(insertPanelLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel1)))
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insertPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BoxParent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        insertPanelLayout.setVerticalGroup(
            insertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(96, 96, 96)
                .addComponent(BoxParent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        kosong.add(insertPanel, "card2");

        tempatKanvas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        canvasPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout canvasPanelLayout = new javax.swing.GroupLayout(canvasPanel);
        canvasPanel.setLayout(canvasPanelLayout);
        canvasPanelLayout.setHorizontalGroup(
            canvasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1347, Short.MAX_VALUE)
        );
        canvasPanelLayout.setVerticalGroup(
            canvasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 798, Short.MAX_VALUE)
        );

        tempatKanvas.setViewportView(canvasPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(kosong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(tempatKanvas, javax.swing.GroupLayout.PREFERRED_SIZE, 1045, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tempatKanvas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(kosong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        //removing panel
        kosong.removeAll();
        kosong.repaint();
        kosong.revalidate();
        
        //add panel
        kosong.add(insertPanel);
        kosong.repaint();
        kosong.revalidate();

        //balikin si nodeValue jadi null
        nodeValue.setText("");
        
    }//GEN-LAST:event_insertButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        //Hapus yang ada di kanvasScroll
        canvasPanel.repaint();
        canvasPanel.revalidate();
        
        //balikin lagi jadi array-nya ke 0 lagi semua
        for(int i = 1; i < 16; i++){
            bst[i] = 0;
        }
        
        //balikin lagi ke nilai awal
        x = 480;
        y = 100;
        per = 1;

        //buat nentuin titik garis awal sama akhir
        xAwal = 480;
        xAkhir = 480;

        yAwal = 100;
        
    }//GEN-LAST:event_resetButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        //keluar dari program...
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void AddNodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNodeButtonActionPerformed
        
        if(bst[1] == 0){
            //input root
            getNode = nodeValue.getText();
            elemen = Integer.parseInt(getNode);
            bst[1] = elemen;
            
            //cetak treenya
            cetakLingkaran();
            cetakAngka();
            output();
            
            
            //balik lagi ke halaman Home
            //removing panel
            kosong.remove(insertPanel);

            //add panel
            kosong.add(homePanel);
            
        }else{
            getNode = nodeValue.getText();
            elemen = Integer.parseInt(getNode);
        
            int posisi = 1;
             while(posisi < 16 && bst[posisi] != 0){
                if(elemen > bst[posisi]){ 
                    //kalo di kanan
                    xAwal = x+50;
                    yAwal=y;
                    posisi = (2 * posisi) + 1;
                    per = per+per;
                    x = x+(x/per);
                    
                    //tentuin titik awal sama akhirnya
                    xAkhir = x+(x/per+per);
                    
                }else{
                    //kalo di kiri
                    xAwal=x;
                    yAwal=y;
                    
                    posisi = 2 * posisi;
                    per = per+per;
                    x = x-(x/per);
                    xAkhir = x-(x/per+per);
                    
                }
                y = y+100;
            }
             
            if(posisi > 16){
                //balik lagi ke halaman Home
                //removing panel
                kosong.remove(insertPanel);

                //add panel
                kosong.add(homePanel);
                
                //kasih alert kalo udah gak bisa nambah lagi
                JOptionPane.showMessageDialog(null, "Maaf, TIDAK bisa menambah node lagi karena TREE ini hanya sampai level 4. Terimakasih");
                
            }
            
            //kalo uda ketemu posisinya
            bst[posisi] = elemen;
            
            //cetak treenya
            cetakLingkaran();
            cetakGaris();
            cetakAngka();
            
            output();
            
            
            //balik lagi ke halaman Home
            //removing panel
            kosong.remove(insertPanel);

            //add panel
            kosong.add(homePanel);
            
        }
        
    }//GEN-LAST:event_AddNodeButtonActionPerformed

    
    public void cetakLingkaran(){
        
        //gambar linkarannya
        Graphics g = canvasPanel.getGraphics();
        g.drawOval(x, y, 50, 50); // x, y , width, height

    }
    
    public void cetakGaris(){
        
        //gambar linkarannya
        Graphics g = canvasPanel.getGraphics();
        g.drawLine(xAwal, yAwal+25, x+25, y); //x1 , y1, x2, y2

    }
    
    public void cetakAngka(){

        //cetak angkanya
        Graphics g = canvasPanel.getGraphics();
        g.drawString(getNode, x+20, y+30); // String , x , y

        //kembalikan nilai x dan y, per, dan xAkhir ke nilai semula
        x = 480;
        y = 100;
        per = 1;
        xAkhir = 480;
        xAwal = 480;
        yAwal = 100;
    }
    
    public void output(){
        System.out.print("Hasil dari inputan saat ini : ");
        for(int i = 1; i < 16; i++){
            System.out.print(bst[i]);
            if(i<15){
                System.out.print(" , ");
            }
        }
        System.out.println("\n");
    }
    
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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNodeButton;
    private javax.swing.JPanel BoxParent;
    private javax.swing.JPanel canvasPanel;
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel homePanel;
    private javax.swing.JButton insertButton;
    private javax.swing.JPanel insertPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel kosong;
    private javax.swing.JTextField nodeValue;
    private javax.swing.JButton resetButton;
    private javax.swing.JScrollPane tempatKanvas;
    // End of variables declaration//GEN-END:variables
}
