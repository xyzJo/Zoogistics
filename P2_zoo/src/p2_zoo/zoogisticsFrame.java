/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_zoo;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author joanaibarra
 */
public class zoogisticsFrame extends JFrame {

    /**
     * Creates new form zoogisticsFrame
     */
    public zoogisticsFrame() {
        super("Zoogistics");
        this.setSize(600, 550); //size may change 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((screen.getWidth() - getWidth())/2);
        int y = (int) ((screen.getHeight() - getHeight())/2);
        setLocation(x, y); 
        
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

        mainPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        logButton = new javax.swing.JButton();
        nxtupButton = new javax.swing.JButton();
        mvButton = new javax.swing.JButton();
        addanButton = new javax.swing.JButton();
        bgImage1 = new javax.swing.JLabel();
        logPanel = new javax.swing.JPanel();
        logHeader = new javax.swing.JLabel();
        homeButton1 = new javax.swing.JButton();
        question2 = new javax.swing.JLabel();
        logFeed = new javax.swing.JRadioButton();
        logMedication = new javax.swing.JRadioButton();
        question1 = new javax.swing.JLabel();
        searchAnimal = new javax.swing.JTextField();
        submitButton3 = new javax.swing.JButton();
        hint = new javax.swing.JLabel();
        bgImage2 = new javax.swing.JLabel();
        mvPanel = new javax.swing.JPanel();
        mvHeader = new javax.swing.JLabel();
        homeButton2 = new javax.swing.JButton();
        question3 = new javax.swing.JLabel();
        animalSearch2 = new javax.swing.JTextField();
        question4 = new javax.swing.JLabel();
        exhibitSearch = new javax.swing.JTextField();
        submitButton2 = new javax.swing.JButton();
        hint1 = new javax.swing.JLabel();
        hint2 = new javax.swing.JLabel();
        bgImage3 = new javax.swing.JLabel();
        nxtupPanel = new javax.swing.JPanel();
        nxtupHeader = new javax.swing.JLabel();
        homeButton3 = new javax.swing.JButton();
        dbTextField = new javax.swing.JTextField();
        bgImage4 = new javax.swing.JLabel();
        addanPanel = new javax.swing.JPanel();
        addanHeader = new javax.swing.JLabel();
        homeButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelExhibit = new javax.swing.JLabel();
        jLabelLf = new javax.swing.JLabel();
        jLabelnxtAct = new javax.swing.JLabel();
        jTfName = new javax.swing.JTextField();
        jTfNxtAct = new javax.swing.JTextField();
        jTfFeed = new javax.swing.JTextField();
        jTfExhibit = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        jLabelType = new javax.swing.JLabel();
        jTfType = new javax.swing.JTextField();
        jLabelSex = new javax.swing.JLabel();
        jTfSex = new javax.swing.JTextField();
        bgImage5 = new javax.swing.JLabel();
        successPanel = new javax.swing.JPanel();
        successHeader = new javax.swing.JLabel();
        msg1 = new javax.swing.JLabel();
        msg2 = new javax.swing.JLabel();
        rtnhomeButton = new javax.swing.JButton();
        msg2contd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new java.awt.CardLayout());

        homePanel.setPreferredSize(new java.awt.Dimension(732, 500));
        homePanel.setLayout(null);

        titleLabel.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        titleLabel.setText("Zoogistics");
        homePanel.add(titleLabel);
        titleLabel.setBounds(250, 0, 260, 100);

        logButton.setBackground(new java.awt.Color(0, 0, 0));
        logButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        logButton.setForeground(new java.awt.Color(255, 255, 255));
        logButton.setText("Log Activity");
        logButton.setPreferredSize(new java.awt.Dimension(110, 30));
        logButton.setSize(new java.awt.Dimension(260, 70));
        logButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logButtonActionPerformed(evt);
            }
        });
        homePanel.add(logButton);
        logButton.setBounds(40, 140, 260, 70);

        nxtupButton.setBackground(new java.awt.Color(0, 0, 0));
        nxtupButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        nxtupButton.setForeground(new java.awt.Color(255, 255, 255));
        nxtupButton.setText("Next Up");
        nxtupButton.setSize(new java.awt.Dimension(260, 70));
        nxtupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nxtupButtonActionPerformed(evt);
            }
        });
        homePanel.add(nxtupButton);
        nxtupButton.setBounds(40, 280, 260, 70);

        mvButton.setBackground(new java.awt.Color(0, 0, 0));
        mvButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        mvButton.setForeground(new java.awt.Color(255, 255, 255));
        mvButton.setText("Move Animal");
        mvButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mvButtonActionPerformed(evt);
            }
        });
        homePanel.add(mvButton);
        mvButton.setBounds(430, 140, 260, 70);

        addanButton.setBackground(new java.awt.Color(0, 0, 0));
        addanButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        addanButton.setForeground(new java.awt.Color(255, 255, 255));
        addanButton.setText("Add Animal");
        addanButton.setMaximumSize(new java.awt.Dimension(164, 30));
        addanButton.setMinimumSize(new java.awt.Dimension(164, 30));
        addanButton.setPreferredSize(new java.awt.Dimension(164, 30));
        addanButton.setSize(new java.awt.Dimension(260, 70));
        addanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addanButtonActionPerformed(evt);
            }
        });
        homePanel.add(addanButton);
        addanButton.setBounds(430, 280, 260, 70);

        bgImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2_zoo/bg4.png"))); // NOI18N
        homePanel.add(bgImage1);
        bgImage1.setBounds(0, 0, 730, 580);

        mainPanel.add(homePanel, "homePanel");

        logPanel.setMaximumSize(new java.awt.Dimension(3000, 3000));
        logPanel.setPreferredSize(new java.awt.Dimension(732, 573));
        logPanel.setLayout(null);

        logHeader.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        logHeader.setText("Log an Activity");
        logPanel.add(logHeader);
        logHeader.setBounds(6, 6, 286, 62);

        homeButton1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        homeButton1.setText("Home");
        homeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButton1ActionPerformed(evt);
            }
        });
        logPanel.add(homeButton1);
        homeButton1.setBounds(541, 488, 97, 30);

        question2.setText("Step 2: Who would you like to log an activity for?");
        logPanel.add(question2);
        question2.setBounds(33, 169, 307, 16);

        logFeed.setText("Log Feeding");
        logFeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logFeedActionPerformed(evt);
            }
        });
        logPanel.add(logFeed);
        logFeed.setBounds(91, 114, 108, 23);

        logMedication.setText("Log Medication");
        logPanel.add(logMedication);
        logMedication.setBounds(354, 114, 128, 23);

        question1.setText("Step 1: What kind of activity are you logging? (Choose 1)");
        logPanel.add(question1);
        question1.setBounds(33, 92, 355, 16);
        logPanel.add(searchAnimal);
        searchAnimal.setBounds(29, 213, 550, 48);

        submitButton3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        submitButton3.setText("Submit");
        logPanel.add(submitButton3);
        submitButton3.setBounds(369, 488, 108, 30);

        hint.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        hint.setText("you can search by name, type or ID");
        logPanel.add(hint);
        hint.setBounds(33, 191, 238, 16);

        bgImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2_zoo/bg4.png"))); // NOI18N
        logPanel.add(bgImage2);
        bgImage2.setBounds(0, -4, 730, 580);

        mainPanel.add(logPanel, "logPanel");

        mvPanel.setPreferredSize(new java.awt.Dimension(732, 573));
        mvPanel.setLayout(null);

        mvHeader.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        mvHeader.setText("Move an Animal");
        mvPanel.add(mvHeader);
        mvHeader.setBounds(36, 6, 322, 72);

        homeButton2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        homeButton2.setText("Home");
        homeButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButton2ActionPerformed(evt);
            }
        });
        mvPanel.add(homeButton2);
        homeButton2.setBounds(555, 484, 97, 30);

        question3.setText("Step 1: Who would you like to move?");
        mvPanel.add(question3);
        question3.setBounds(42, 90, 230, 16);

        animalSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animalSearch2ActionPerformed(evt);
            }
        });
        mvPanel.add(animalSearch2);
        animalSearch2.setBounds(44, 131, 500, 54);

        question4.setText("Step 2: Where To?");
        mvPanel.add(question4);
        question4.setBounds(36, 224, 110, 16);
        mvPanel.add(exhibitSearch);
        exhibitSearch.setBounds(44, 266, 500, 54);

        submitButton2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        submitButton2.setText("Submit");
        submitButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButton2ActionPerformed(evt);
            }
        });
        mvPanel.add(submitButton2);
        submitButton2.setBounds(410, 484, 108, 30);

        hint1.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        hint1.setText("Insert the name of the Animal you would like to move");
        mvPanel.add(hint1);
        hint1.setBounds(42, 109, 380, 16);

        hint2.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        hint2.setText("Insert the name of the Exhibit you'd like to move the animal to");
        mvPanel.add(hint2);
        hint2.setBounds(36, 244, 440, 16);

        bgImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2_zoo/bg4.png"))); // NOI18N
        mvPanel.add(bgImage3);
        bgImage3.setBounds(-10, -4, 740, 580);

        mainPanel.add(mvPanel, "mvPanel");

        nxtupPanel.setLayout(null);

        nxtupHeader.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        nxtupHeader.setText("What's Next Up");
        nxtupPanel.add(nxtupHeader);
        nxtupHeader.setBounds(6, 6, 286, 41);

        homeButton3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        homeButton3.setText("Home");
        homeButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButton3ActionPerformed(evt);
            }
        });
        nxtupPanel.add(homeButton3);
        homeButton3.setBounds(630, 380, 97, 30);

        dbTextField.setEditable(false);
        dbTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbTextFieldActionPerformed(evt);
            }
        });
        nxtupPanel.add(dbTextField);
        dbTextField.setBounds(20, 60, 650, 310);

        bgImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2_zoo/bg4.png"))); // NOI18N
        nxtupPanel.add(bgImage4);
        bgImage4.setBounds(0, -4, 730, 580);

        mainPanel.add(nxtupPanel, "nxtupPanel");

        addanPanel.setPreferredSize(new java.awt.Dimension(732, 573));
        addanPanel.setRequestFocusEnabled(false);
        addanPanel.setLayout(null);

        addanHeader.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        addanHeader.setText("Add New Animal");
        addanPanel.add(addanHeader);
        addanHeader.setBounds(6, 6, 310, 41);

        homeButton4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        homeButton4.setText("Home");
        homeButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButton4ActionPerformed(evt);
            }
        });
        addanPanel.add(homeButton4);
        homeButton4.setBounds(500, 469, 97, 30);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("All fields are required! ");
        addanPanel.add(jLabel1);
        jLabel1.setBounds(6, 53, 217, 22);

        jLabelName.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabelName.setText("Name:");
        addanPanel.add(jLabelName);
        jLabelName.setBounds(6, 158, 61, 21);

        jLabelExhibit.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabelExhibit.setText("Exhibit:");
        addanPanel.add(jLabelExhibit);
        jLabelExhibit.setBounds(6, 229, 74, 21);

        jLabelLf.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabelLf.setText("Last Feeding:");
        addanPanel.add(jLabelLf);
        jLabelLf.setBounds(6, 298, 123, 21);

        jLabelnxtAct.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabelnxtAct.setText("Next Activity:");
        addanPanel.add(jLabelnxtAct);
        jLabelnxtAct.setBounds(6, 385, 125, 31);

        jTfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfNameActionPerformed(evt);
            }
        });
        addanPanel.add(jTfName);
        jTfName.setBounds(88, 149, 449, 43);

        jTfNxtAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfNxtActActionPerformed(evt);
            }
        });
        addanPanel.add(jTfNxtAct);
        jTfNxtAct.setBounds(137, 381, 417, 43);

        jTfFeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfFeedActionPerformed(evt);
            }
        });
        addanPanel.add(jTfFeed);
        jTfFeed.setBounds(135, 289, 402, 43);

        jTfExhibit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfExhibitActionPerformed(evt);
            }
        });
        addanPanel.add(jTfExhibit);
        jTfExhibit.setBounds(87, 210, 450, 43);

        submitButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        addanPanel.add(submitButton);
        submitButton.setBounds(343, 469, 108, 30);

        jLabelType.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabelType.setText("Type:");
        addanPanel.add(jLabelType);
        jLabelType.setBounds(88, 97, 83, 27);
        addanPanel.add(jTfType);
        jTfType.setBounds(189, 93, 106, 38);

        jLabelSex.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabelSex.setText("Sex:");
        addanPanel.add(jLabelSex);
        jLabelSex.setBounds(360, 100, 40, 21);
        addanPanel.add(jTfSex);
        jTfSex.setBounds(431, 93, 106, 38);

        bgImage5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2_zoo/bg4.png"))); // NOI18N
        addanPanel.add(bgImage5);
        bgImage5.setBounds(0, -4, 730, 580);

        mainPanel.add(addanPanel, "addanPanel");

        successPanel.setBackground(new java.awt.Color(0, 0, 0));
        successPanel.setPreferredSize(new java.awt.Dimension(732, 573));
        successPanel.setLayout(null);

        successHeader.setFont(new java.awt.Font("Georgia", 3, 36)); // NOI18N
        successHeader.setForeground(new java.awt.Color(102, 153, 0));
        successHeader.setText("Success!");
        successPanel.add(successHeader);
        successHeader.setBounds(6, 6, 170, 50);

        msg1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        msg1.setForeground(new java.awt.Color(255, 255, 255));
        msg1.setText("Thank you for using Zoogistics!");
        successPanel.add(msg1);
        msg1.setBounds(220, 109, 294, 22);

        msg2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        msg2.setForeground(new java.awt.Color(255, 255, 255));
        msg2.setText("You have successfully");
        successPanel.add(msg2);
        msg2.setBounds(266, 149, 206, 22);

        rtnhomeButton.setBackground(new java.awt.Color(102, 153, 0));
        rtnhomeButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        rtnhomeButton.setForeground(new java.awt.Color(255, 255, 255));
        rtnhomeButton.setText("Return Home");
        rtnhomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtnhomeButtonActionPerformed(evt);
            }
        });
        successPanel.add(rtnhomeButton);
        rtnhomeButton.setBounds(240, 285, 274, 74);
        successPanel.add(msg2contd);
        msg2contd.setBounds(266, 177, 0, 28);

        mainPanel.add(successPanel, "successPanel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logButtonActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "logPanel");
    }//GEN-LAST:event_logButtonActionPerformed

    private void mvButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mvButtonActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "mvPanel");
    }//GEN-LAST:event_mvButtonActionPerformed

    private void nxtupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxtupButtonActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "nxtupPanel");
    }//GEN-LAST:event_nxtupButtonActionPerformed

    private void addanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addanButtonActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "addanPanel");
    }//GEN-LAST:event_addanButtonActionPerformed

    private void homeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButton1ActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "homePanel");
    }//GEN-LAST:event_homeButton1ActionPerformed

    private void homeButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButton3ActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "homePanel");
    }//GEN-LAST:event_homeButton3ActionPerformed

    private void homeButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButton4ActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "homePanel");
    }//GEN-LAST:event_homeButton4ActionPerformed

    private void logFeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logFeedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logFeedActionPerformed

    private void jTfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfNameActionPerformed

    private void jTfNxtActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfNxtActActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfNxtActActionPerformed

    private void jTfFeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfFeedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfFeedActionPerformed

    private void jTfExhibitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfExhibitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfExhibitActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "successPanel");
    }//GEN-LAST:event_submitButtonActionPerformed

    private void rtnhomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtnhomeButtonActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "homePanel");
    }//GEN-LAST:event_rtnhomeButtonActionPerformed

    private void submitButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButton2ActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "successPanel");
    }//GEN-LAST:event_submitButton2ActionPerformed

    private void animalSearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animalSearch2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_animalSearch2ActionPerformed

    private void homeButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButton2ActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "homePanel");
    }//GEN-LAST:event_homeButton2ActionPerformed

    private void dbTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dbTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(zoogisticsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(zoogisticsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(zoogisticsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(zoogisticsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new zoogisticsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addanButton;
    private javax.swing.JLabel addanHeader;
    private javax.swing.JPanel addanPanel;
    public javax.swing.JTextField animalSearch2;
    private javax.swing.JLabel bgImage1;
    private javax.swing.JLabel bgImage2;
    private javax.swing.JLabel bgImage3;
    private javax.swing.JLabel bgImage4;
    private javax.swing.JLabel bgImage5;
    public javax.swing.JTextField dbTextField;
    public javax.swing.JTextField exhibitSearch;
    private javax.swing.JLabel hint;
    private javax.swing.JLabel hint1;
    private javax.swing.JLabel hint2;
    public javax.swing.JButton homeButton1;
    public javax.swing.JButton homeButton2;
    public javax.swing.JButton homeButton3;
    public javax.swing.JButton homeButton4;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelExhibit;
    private javax.swing.JLabel jLabelLf;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelSex;
    private javax.swing.JLabel jLabelType;
    private javax.swing.JLabel jLabelnxtAct;
    public javax.swing.JTextField jTfExhibit;
    public javax.swing.JTextField jTfFeed;
    public javax.swing.JTextField jTfName;
    public javax.swing.JTextField jTfNxtAct;
    public javax.swing.JTextField jTfSex;
    public javax.swing.JTextField jTfType;
    public javax.swing.JButton logButton;
    public javax.swing.JRadioButton logFeed;
    private javax.swing.JLabel logHeader;
    public javax.swing.JRadioButton logMedication;
    public javax.swing.JPanel logPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel msg1;
    private javax.swing.JLabel msg2;
    private javax.swing.JLabel msg2contd;
    public javax.swing.JButton mvButton;
    private javax.swing.JLabel mvHeader;
    public javax.swing.JPanel mvPanel;
    public javax.swing.JButton nxtupButton;
    private javax.swing.JLabel nxtupHeader;
    private javax.swing.JPanel nxtupPanel;
    private javax.swing.JLabel question1;
    private javax.swing.JLabel question2;
    private javax.swing.JLabel question3;
    private javax.swing.JLabel question4;
    private javax.swing.JButton rtnhomeButton;
    public javax.swing.JTextField searchAnimal;
    public javax.swing.JButton submitButton;
    public javax.swing.JButton submitButton2;
    public javax.swing.JButton submitButton3;
    private javax.swing.JLabel successHeader;
    private javax.swing.JPanel successPanel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
