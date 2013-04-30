
package cs540group9;


import java.io.File;
import java.io.FilenameFilter;
import javax.swing.JFrame;
import java.util.*;


public class NumGUI extends javax.swing.JFrame {
   
    ResourceBundle currentRb;
    ResourceBundle rblist[];
    
    public NumGUI(ResourceBundle rblist[], ResourceBundle currentRb) {
        this.rblist = rblist;
        this.currentRb = currentRb;
        initComponents();
        init();
    }
    
    private void init(){
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("CS540 Assign9");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AmericanFlag = new javax.swing.JButton();
        monumentLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        IndianFlag = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AmericanFlag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs540group9/americanflag.jpg"))); // NOI18N
        AmericanFlag.setText("americanFlag");
        AmericanFlag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AmericanFlagMouseClicked(evt);
            }
        });

        monumentLabel.setText("jLabel3");
        monumentLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                monumentLabelMouseClicked(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });

        IndianFlag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs540group9/indiaflag.jpg"))); // NOI18N
        IndianFlag.setText("indiaFlag");
        IndianFlag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IndianFlagMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IndianFlag, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AmericanFlag, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(exitButton)
                            .addComponent(monumentLabel))))
                .addContainerGap(3060, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AmericanFlag, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monumentLabel))
                .addGap(58, 58, 58)
                .addComponent(IndianFlag, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton)
                .addContainerGap(2185, Short.MAX_VALUE))
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

    private void monumentLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monumentLabelMouseClicked
        monumentLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Num9/StatueLiberty.jpg")));
        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_monumentLabelMouseClicked

    //american flag
    private void AmericanFlagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AmericanFlagMouseClicked
        currentRb = rblist[0];
        exitButton.setVisible(false);
        //jLabel3.setIcon(new Icon(createImage("indiaflag.jpg"));
        exitButton.setText(currentRb.getString("my.exit"));
    }//GEN-LAST:event_AmericanFlagMouseClicked

    private void IndianFlagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IndianFlagMouseClicked
        currentRb = rblist[1];
        exitButton.setText(currentRb.getString("my.exit"));
    }//GEN-LAST:event_IndianFlagMouseClicked

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitButtonMouseClicked

    
    public static void main(String args[]) throws Exception {
        ResourceBundle currentRb = null;
        ResourceBundle rblist[] = new ResourceBundle[5];
        try {
            rblist[0] = ResourceBundle.getBundle("resourceBundle-en-US");
            
            rblist[1] = ResourceBundle.getBundle("resourceBundle-hi-IN");
            
        } catch (MissingResourceException mre) {
            mre.printStackTrace();
            System.err.println("missing resources detected, you suck");
        }
       
       //Set<String> languages = new TreeSet<String>();
       //System.out.println(languages.size());
       //languages = loadLanguages();
       new NumGUI(rblist, currentRb);
    }
    
    public static Set<String> loadLanguages()
    {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        final String bundlepackage = "com.example.i18n";
        final String bundlename = "messages";

        File root = new File(loader.getResource(bundlepackage.replace('.', '/')).getFile());
        File[] files = root.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.matches("^" + bundlename + "(_\\w{2}(_\\w{2})?)?\\.properties$");
            }
        });

        Set<String> languages = new TreeSet<String>();
        for (File file : files) {
            languages.add(file.getName().replaceAll("^" + bundlename + "(_)?|\\.properties$", ""));
        }
        return languages;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AmericanFlag;
    private javax.swing.JButton IndianFlag;
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel monumentLabel;
    // End of variables declaration//GEN-END:variables
}
