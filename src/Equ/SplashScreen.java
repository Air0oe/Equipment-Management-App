package Equ;

import javax.swing.UIManager;

public class SplashScreen extends javax.swing.JFrame {

   
    public SplashScreen() {
        initComponents();
        progressBar.setStringPainted(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        foregroundImage = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPanel.setBackground(new java.awt.Color(153, 153, 0));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Equipment");
        backgroundPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 300, 80));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Management");
        backgroundPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 300, 80));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Loading ...");
        backgroundPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 140, 50));

        progressBar.setBackground(new java.awt.Color(102, 102, 102));
        progressBar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        progressBar.setForeground(new java.awt.Color(0, 153, 153));
        progressBar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backgroundPanel.add(progressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 530, 30));

        foregroundImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foregroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Equ/assets/comp.png"))); // NOI18N
        backgroundPanel.add(foregroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 420));

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Equ/assets/Background.png"))); // NOI18N
        backgroundPanel.add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        try 
        {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) 
            {
                if ("Nimbus".equals(info.getName())) 
                {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        SplashScreen splashScreen = new SplashScreen();
        splashScreen.setVisible(true);
        
        try {
            for(int i = 0; i<=100; i++)
            {
               Thread.sleep(60); 
               splashScreen.progressBar.setValue(i);
            }
            
            
        } catch (Exception e) {
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel foregroundImage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
