
package view;

import java.text.DecimalFormat;
import model.CalculatorModel;

/**
 *
 * @author ahza
 */
public class CalculatorView extends javax.swing.JFrame {

    /**
     * Creates new form CalculatorView
     */
    public CalculatorView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    CalculatorModel model = new CalculatorModel();
    String operand = "";

    public void getOperand(javax.swing.JButton button) {
        operand += button.getText();
        model.setOperand(operand);
        resultLabel.setText(operand);
    }

    private void getOperator(int opt) {
        model.setOperator(opt);
        operand = "";
    }

    private void process() {
        DecimalFormat df = new DecimalFormat("#,###.########");
        model.process();
        operand = "";
        resultLabel.setText(df.format(model.getResult()) + "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        resultLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn7 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnDOT = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnCLEAR = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnDIVIDE = new javax.swing.JButton();
        btnMULTIPLY = new javax.swing.JButton();
        btnMINUS = new javax.swing.JButton();
        btnSUM = new javax.swing.JButton();
        btnAC = new javax.swing.JButton();
        btnPERCENT = new javax.swing.JButton();
        btn1X = new javax.swing.JButton();
        btnEQUALS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple Calculator");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        resultLabel.setBackground(new java.awt.Color(255, 255, 255));
        resultLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 36)); // NOI18N
        resultLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        resultLabel.setText("0");
        resultLabel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                resultLabelKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btn7.setText("7");
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn7.setDefaultCapable(false);
        btn7.setFocusPainted(false);
        btn7.setFocusable(false);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn4.setText("4");
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn4.setDefaultCapable(false);
        btn4.setFocusPainted(false);
        btn4.setFocusable(false);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn1.setText("1");
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn1.setDefaultCapable(false);
        btn1.setFocusPainted(false);
        btn1.setFocusable(false);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btnDOT.setText(".");
        btnDOT.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDOT.setDefaultCapable(false);
        btnDOT.setFocusPainted(false);
        btnDOT.setFocusable(false);
        btnDOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDOTActionPerformed(evt);
            }
        });

        btn0.setText("0");
        btn0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn0.setDefaultCapable(false);
        btn0.setFocusPainted(false);
        btn0.setFocusable(false);
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnCLEAR.setText("C");
        btnCLEAR.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCLEAR.setDefaultCapable(false);
        btnCLEAR.setFocusPainted(false);
        btnCLEAR.setFocusable(false);
        btnCLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCLEARActionPerformed(evt);
            }
        });

        btn2.setText("2");
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn2.setDefaultCapable(false);
        btn2.setFocusPainted(false);
        btn2.setFocusable(false);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setText("3");
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn3.setDefaultCapable(false);
        btn3.setFocusPainted(false);
        btn3.setFocusable(false);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn5.setText("5");
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn5.setDefaultCapable(false);
        btn5.setFocusPainted(false);
        btn5.setFocusable(false);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setText("6");
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn6.setDefaultCapable(false);
        btn6.setFocusPainted(false);
        btn6.setFocusable(false);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn8.setText("8");
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn8.setDefaultCapable(false);
        btn8.setFocusPainted(false);
        btn8.setFocusable(false);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setText("9");
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn9.setDefaultCapable(false);
        btn9.setFocusPainted(false);
        btn9.setFocusable(false);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnDOT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDOT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDIVIDE.setText("/");
        btnDIVIDE.setDefaultCapable(false);
        btnDIVIDE.setFocusPainted(false);
        btnDIVIDE.setFocusable(false);
        btnDIVIDE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDIVIDEActionPerformed(evt);
            }
        });
        jPanel3.add(btnDIVIDE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 60, 33));

        btnMULTIPLY.setText("*");
        btnMULTIPLY.setDefaultCapable(false);
        btnMULTIPLY.setFocusPainted(false);
        btnMULTIPLY.setFocusable(false);
        btnMULTIPLY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMULTIPLYActionPerformed(evt);
            }
        });
        jPanel3.add(btnMULTIPLY, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 51, 60, 33));

        btnMINUS.setText("-");
        btnMINUS.setDefaultCapable(false);
        btnMINUS.setFocusPainted(false);
        btnMINUS.setFocusable(false);
        btnMINUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMINUSActionPerformed(evt);
            }
        });
        jPanel3.add(btnMINUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 60, 33));

        btnSUM.setText("+");
        btnSUM.setDefaultCapable(false);
        btnSUM.setFocusPainted(false);
        btnSUM.setFocusable(false);
        btnSUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSUMActionPerformed(evt);
            }
        });
        jPanel3.add(btnSUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 129, 60, 33));

        btnAC.setText("AC");
        btnAC.setDefaultCapable(false);
        btnAC.setFocusPainted(false);
        btnAC.setFocusable(false);
        btnAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACActionPerformed(evt);
            }
        });
        jPanel3.add(btnAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 6, -1, 33));

        btnPERCENT.setText("%");
        btnPERCENT.setDefaultCapable(false);
        btnPERCENT.setFocusPainted(false);
        btnPERCENT.setFocusable(false);
        btnPERCENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPERCENTActionPerformed(evt);
            }
        });
        jPanel3.add(btnPERCENT, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 51, 72, 33));

        btn1X.setText("1/x");
        btn1X.setDefaultCapable(false);
        btn1X.setFocusPainted(false);
        btn1X.setFocusable(false);
        btn1X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1XActionPerformed(evt);
            }
        });
        jPanel3.add(btn1X, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 90, -1, 33));

        btnEQUALS.setText("=");
        btnEQUALS.setDefaultCapable(false);
        btnEQUALS.setFocusPainted(false);
        btnEQUALS.setFocusable(false);
        btnEQUALS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEQUALSActionPerformed(evt);
            }
        });
        jPanel3.add(btnEQUALS, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 129, 72, 33));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        getOperand(btn1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        getOperand(btn2);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        getOperand(btn3);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        getOperand(btn4);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        getOperand(btn5);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        getOperand(btn6);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        getOperand(btn7);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        getOperand(btn8);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        getOperand(btn9);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnSUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSUMActionPerformed
        getOperator(1);
    }//GEN-LAST:event_btnSUMActionPerformed

    private void btnMINUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMINUSActionPerformed
        getOperator(2);
    }//GEN-LAST:event_btnMINUSActionPerformed

    private void btnMULTIPLYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMULTIPLYActionPerformed
        getOperator(3);
    }//GEN-LAST:event_btnMULTIPLYActionPerformed

    private void btnDIVIDEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDIVIDEActionPerformed
        getOperator(4);
    }//GEN-LAST:event_btnDIVIDEActionPerformed

    private void btnPERCENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPERCENTActionPerformed
        getOperator(5);
    }//GEN-LAST:event_btnPERCENTActionPerformed

    private void btn1XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1XActionPerformed
        getOperator(6);
    }//GEN-LAST:event_btn1XActionPerformed

    private void btnEQUALSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEQUALSActionPerformed
        process();
    }//GEN-LAST:event_btnEQUALSActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        getOperand(btn0);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnDOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDOTActionPerformed
        getOperand(btnDOT);
    }//GEN-LAST:event_btnDOTActionPerformed

    private void btnCLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCLEARActionPerformed
        if (operand.length() > 1) {
            operand = operand.substring(0, operand.length() - 1);
            model.setOperand(operand);
            resultLabel.setText(operand);
        } else {
            operand = "";
            model.setOperand(operand);
            resultLabel.setText("0");
        }
    }//GEN-LAST:event_btnCLEARActionPerformed

    private void btnACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACActionPerformed
        operand = "";
        model.setOperator(0);
        model.setResult(0);
        resultLabel.setText("0");
    }//GEN-LAST:event_btnACActionPerformed

    private void resultLabelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resultLabelKeyPressed
        DecimalFormat df = new DecimalFormat("#,###.########");
        resultLabel.setText(""+df);
    }//GEN-LAST:event_resultLabelKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn1X;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAC;
    private javax.swing.JButton btnCLEAR;
    private javax.swing.JButton btnDIVIDE;
    private javax.swing.JButton btnDOT;
    private javax.swing.JButton btnEQUALS;
    private javax.swing.JButton btnMINUS;
    private javax.swing.JButton btnMULTIPLY;
    private javax.swing.JButton btnPERCENT;
    private javax.swing.JButton btnSUM;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel resultLabel;
    // End of variables declaration//GEN-END:variables
}
