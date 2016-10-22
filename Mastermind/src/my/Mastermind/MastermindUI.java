/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.Mastermind;

import java.awt.*;
import java.util.Arrays;
import javax.swing.*;

/**
 *
 * @author Robin Bonny
 */
public class MastermindUI extends javax.swing.JFrame {

    public MastermindUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        GFrame = new javax.swing.JPanel();
        StartButton = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Mastermind by Robin Bonny");
        setResizable(false);

        Title.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Title.setText("Mastermind by Robin Bonny");

        javax.swing.GroupLayout GFrameLayout = new javax.swing.GroupLayout(GFrame);
        GFrame.setLayout(GFrameLayout);
        GFrameLayout.setHorizontalGroup(
            GFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        GFrameLayout.setVerticalGroup(
            GFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );

        StartButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        StartButton.setText("Start Game");
        StartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StartButtonMouseClicked(evt);
            }
        });

        Button1.setBackground(new java.awt.Color(255, 0, 0));
        Button1.setText("Red");
        Button1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button1.setPreferredSize(new java.awt.Dimension(70, 30));
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button2.setBackground(new java.awt.Color(0, 255, 0));
        Button2.setText("Green");
        Button2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button2.setPreferredSize(new java.awt.Dimension(70, 30));
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button3.setBackground(new java.awt.Color(0, 0, 255));
        Button3.setText("Blue");
        Button3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button3.setPreferredSize(new java.awt.Dimension(70, 30));
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        Button4.setBackground(new java.awt.Color(255, 165, 0));
        Button4.setText("Orange");
        Button4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button4.setPreferredSize(new java.awt.Dimension(70, 30));
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        Button5.setBackground(new java.awt.Color(0, 255, 255));
        Button5.setText("Cyan");
        Button5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button5.setPreferredSize(new java.awt.Dimension(70, 30));
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button6.setBackground(new java.awt.Color(255, 0, 255));
        Button6.setText("Magenta");
        Button6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button6.setPreferredSize(new java.awt.Dimension(70, 30));
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(StartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void paintCircle(int x, int y, int ColorInt) {
        Graphics2D g = (Graphics2D) GFrame.getGraphics();
        RenderingHints hints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setRenderingHints(hints);
        switch (ColorInt) {
            case 0:
                g.setColor(Color.red);
                break;
            case 1:
                g.setColor(Color.green);
                break;
            case 2:
                g.setColor(Color.blue);
                break;
            case 3:
                g.setColor(Color.orange);
                break;
            case 4:
                g.setColor(Color.cyan);
                break;
            case 5:
                g.setColor(Color.magenta);
                break;
        }
        g.fillOval(x, y, 45, 45);
    }

    public void paintPins(int x, int y, int ColorBW) {
        Graphics2D g = (Graphics2D) GFrame.getGraphics();
        RenderingHints hints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setRenderingHints(hints);
        switch (ColorBW) {
            case 0:
                g.setColor(Color.black);
                break;
            case 1:
                g.setColor(Color.white);
                break;
        }
        g.fillOval(x, y, 20, 20);
    }

    public void getColorXY(int color) {
        int calcX = -100;
        int calcY = -100;
        switch (countCircles()) {
            case 0:
                cg[0][0] = color;
                calcX = 43;
                calcY = 673;
                break;
            case 1:
                cg[1][0] = color;
                calcX = 113;
                calcY = 673;
                break;
            case 2:
                cg[2][0] = color;
                calcX = 183;
                calcY = 673;
                break;
            case 3:
                cg[3][0] = color;
                calcX = 253;
                calcY = 673;
                eval(0);
                break;
            case 4:
                cg[0][1] = color;
                calcX = 43;
                calcY = 603;
                break;
            case 5:
                cg[1][1] = color;
                calcX = 113;
                calcY = 603;
                break;
            case 6:
                cg[2][1] = color;
                calcX = 183;
                calcY = 603;
                break;
            case 7:
                cg[3][1] = color;
                calcX = 253;
                calcY = 603;
                eval(1);
                break;
            case 8:
                cg[0][2] = color;
                calcX = 43;
                calcY = 533;
                break;
            case 9:
                cg[1][2] = color;
                calcX = 113;
                calcY = 533;
                break;
            case 10:
                cg[2][2] = color;
                calcX = 183;
                calcY = 533;
                break;
            case 11:
                cg[3][2] = color;
                calcX = 253;
                calcY = 533;
                eval(2);
                break;
            case 12:
                cg[0][3] = color;
                calcX = 43;
                calcY = 463;
                break;
            case 13:
                cg[1][3] = color;
                calcX = 113;
                calcY = 463;
                break;
            case 14:
                cg[2][3] = color;
                calcX = 183;
                calcY = 463;
                break;
            case 15:
                cg[3][3] = color;
                calcX = 253;
                calcY = 463;
                eval(3);
                break;
            case 16:
                cg[0][4] = color;
                calcX = 43;
                calcY = 393;
                break;
            case 17:
                cg[1][4] = color;
                calcX = 113;
                calcY = 393;
                break;
            case 18:
                cg[2][4] = color;
                calcX = 183;
                calcY = 393;
                break;
            case 19:
                cg[3][4] = color;
                calcX = 253;
                calcY = 393;
                eval(4);
                break;
            case 20:
                cg[0][5] = color;
                calcX = 43;
                calcY = 323;
                break;
            case 21:
                cg[1][5] = color;
                calcX = 113;
                calcY = 323;
                break;
            case 22:
                cg[2][5] = color;
                calcX = 183;
                calcY = 323;
                break;
            case 23:
                cg[3][5] = color;
                calcX = 253;
                calcY = 323;
                eval(5);
                break;
            case 24:
                cg[0][6] = color;
                calcX = 43;
                calcY = 253;
                break;
            case 25:
                cg[1][6] = color;
                calcX = 113;
                calcY = 253;
                break;
            case 26:
                cg[2][6] = color;
                calcX = 183;
                calcY = 253;
                break;
            case 27:
                cg[3][6] = color;
                calcX = 253;
                calcY = 253;
                eval(6);
                break;
            case 28:
                cg[0][7] = color;
                calcX = 43;
                calcY = 183;
                break;
            case 29:
                cg[1][7] = color;
                calcX = 113;
                calcY = 183;
                break;
            case 30:
                cg[2][7] = color;
                calcX = 183;
                calcY = 183;
                break;
            case 31:
                cg[3][7] = color;
                calcX = 253;
                calcY = 183;
                eval(7);
                break;
            case 32:
                cg[0][8] = color;
                calcX = 43;
                calcY = 113;
                break;
            case 33:
                cg[1][8] = color;
                calcX = 113;
                calcY = 113;
                break;
            case 34:
                cg[2][8] = color;
                calcX = 183;
                calcY = 113;
                break;
            case 35:
                cg[3][8] = color;
                calcX = 253;
                calcY = 113;
                eval(8);
                break;
            case 36:
                cg[0][9] = color;
                calcX = 43;
                calcY = 43;
                break;
            case 37:
                cg[1][9] = color;
                calcX = 113;
                calcY = 43;
                break;
            case 38:
                cg[2][9] = color;
                calcX = 183;
                calcY = 43;
                break;
            case 39:
                cg[3][9] = color;
                calcX = 253;
                calcY = 43;
                eval(9);
                break;
        }
        paintCircle(calcX, calcY, color);
    }

    public void getPinsXY() {

    }

    int whitePin[] = new int[10];
    int blackPin[] = new int[10];

    public void eval(int row) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i != j) {
                    if (cg[j][row] == cs[i]) {
                        whitePin[row]++;
                    }
                }
            }
            if (cg[i][row] == cs[i]) {
                blackPin[row]++;
            }
        }
        System.out.println("black " + Arrays.toString(blackPin));
        System.out.println("white " + Arrays.toString(whitePin));
    }

    int circles = -1;

    int countCircles() {
        circles++;
        return circles;
    }

    int cg[][] = new int[4][10];                                            //Player Color Array
    int cs[] = new int[4];                                                  //Solution Color Array

    private void StartButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartButtonMouseClicked
        // TODO add your handling code here:
        Graphics2D g = (Graphics2D) GFrame.getGraphics();
        RenderingHints hints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setRenderingHints(hints);
        g.clearRect(0, 0, 340, 760);
        g.drawRect(20, 20, 300, 720);
        for (int v = 0; v < 4; v++) {
            for (int h = 0; h < 10; h++) {
                g.drawOval(v * 70 + 40, h * 70 + 40, 50, 50);
            }
        }
        g.fillOval(60, 690, 10, 10);
        for (int i = 0; i < 4; i++) {
            cs[i] = (int) (Math.random() * 6);
        }
        System.out.println(Arrays.toString(cs));

        //int whitePin[] = new int[10];
        //int blackPin[] = new int[10];
        /*for (int t1 = 0; t1 < 10; t1++) {
            for (int t2 = 0; t2 < 4; t2++) {
                cg[t2][t1] = 1 + (int) (Math.random() * 6);
            }
        }*/

 /*for (int i2 = 0; i2 < 10; i2++) {
            for (int i3 = 0; i3 < 4; i3++) {
                for (int i4 = 0; i4 < 4; i4++) {
                    if (cg[i4][i2] == cs[i3]) {
                        whitePin[i2]++;
                        System.out.println(Arrays.toString(whitePin));
                    }
                }
                if (cg[i3][i2] == cs[i3]) {
                    blackPin[i2]++;
                    System.out.println(Arrays.toString(blackPin));
                }
            }
        }*/
    }//GEN-LAST:event_StartButtonMouseClicked

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        getColorXY(0);
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        getColorXY(1);
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        getColorXY(2);
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        getColorXY(3);
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        getColorXY(4);
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        getColorXY(5);
    }//GEN-LAST:event_Button6ActionPerformed

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
            java.util.logging.Logger.getLogger(MastermindUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MastermindUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MastermindUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MastermindUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MastermindUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JPanel GFrame;
    private javax.swing.JButton StartButton;
    private javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables
}
