package lesson27_thread;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MoleJFrame extends javax.swing.JFrame {
    ImageIcon hole  =  new ImageIcon(getClass().getResource("/lesson27_thread/hole.png"));
    ImageIcon mole1 =  new ImageIcon(getClass().getResource("/lesson27_thread/mole1.png"));
    ImageIcon mole2 =  new ImageIcon(getClass().getResource("/lesson27_thread/mole2.png"));
    ImageIcon mole3 =  new ImageIcon(getClass().getResource("/lesson27_thread/mole3.png"));
    ImageIcon mole4 =  new ImageIcon(getClass().getResource("/lesson27_thread/mole4.png"));
    
    ImageIcon[] icons = {hole, mole1, mole2, mole3, mole2, mole1, hole};
    int[] sleepTime = {150, 200, 250, 300, 350, 400, 450, 500};
    MoleRun mr1, mr2, mr3;
    
    class MoleRun implements Runnable {
        private JLabel m, m_message;
        public boolean hit;
        public MoleRun(JLabel m, JLabel m_message) {
            this.m = m;
            this.m_message = m_message;
        }

        @Override
        public void run() {
            for(int i=0;true;i++) {
                int idx = i % icons.length;
                m.setText(idx + "");
                if(hit && idx == 3) { // 是否被打 ?
                    m.setIcon(mole4);
                    m_message.setText("打到我拉~");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ex) {
                    }
                    i = 0;
                    hit = false;
                } else {
                    hit = false;
                    if(idx == 3) {
                        m_message.setText("來打我啊~");
                    }
                    m.setIcon(icons[idx]);
                    try {
                        int timeIdx = new Random().nextInt(sleepTime.length);
                        Thread.sleep(sleepTime[timeIdx]);
                    } catch (InterruptedException ex) {
                    }
                }
                m_message.setText("打不到我~");
            }
        }
        
    }
    
    public MoleJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        m1 = new javax.swing.JLabel();
        m2 = new javax.swing.JLabel();
        m3 = new javax.swing.JLabel();
        m1_message = new javax.swing.JLabel();
        m2_message = new javax.swing.JLabel();
        m3_message = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("打地鼠");

        jButton1.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        jButton2.setText("Stop");

        m1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lesson27_thread/hole.png"))); // NOI18N
        m1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                m1MousePressed(evt);
            }
        });

        m2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lesson27_thread/hole.png"))); // NOI18N
        m2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                m2MousePressed(evt);
            }
        });

        m3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lesson27_thread/hole.png"))); // NOI18N
        m3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                m3MousePressed(evt);
            }
        });

        m1_message.setText("jLabel1");

        m2_message.setText("jLabel1");

        m3_message.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(m1_message)
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(m3_message))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(m3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(m2_message)))))
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(m1)
                        .addGap(322, 322, 322))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(253, 253, 253))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(m1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(m2_message)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(m3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(m3_message)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(m1_message)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(51, 51, 51))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mr1 = new MoleRun(m1, m1_message);
        mr2 = new MoleRun(m2, m2_message);
        mr3 = new MoleRun(m3, m3_message);
        
        new Thread(mr1).start();
        new Thread(mr2).start();
        new Thread(mr3).start();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void m1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m1MousePressed
        mr1.hit = true;
    }//GEN-LAST:event_m1MousePressed

    private void m2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m2MousePressed
        mr2.hit = true;
    }//GEN-LAST:event_m2MousePressed

    private void m3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m3MousePressed
        mr3.hit = true;
    }//GEN-LAST:event_m3MousePressed

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
            java.util.logging.Logger.getLogger(MoleJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoleJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoleJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoleJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoleJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel m1;
    private javax.swing.JLabel m1_message;
    private javax.swing.JLabel m2;
    private javax.swing.JLabel m2_message;
    private javax.swing.JLabel m3;
    private javax.swing.JLabel m3_message;
    // End of variables declaration//GEN-END:variables
}
