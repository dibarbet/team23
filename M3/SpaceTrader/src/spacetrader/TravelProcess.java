/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spacetrader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.Timer;
import java.util.Random;
/**
 *
 * @author YaxiongLiu
 */
public class TravelProcess extends javax.swing.JFrame {
    Player myPlayer = new Player("name",1,1,1,1,1);
    Random rand = new Random();
    private int dist, encFac;
    private boolean stop;
    final int delay = 500;
    Timer timer = new Timer(delay,null);
    ActionListener myal = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (dist%3==0) {
                travellingLabel.setText("Travelling");
                travellingLabel.repaint();
            }
            
            if (!stop) {
                encFac = rand.nextInt(50);
                System.out.println(encFac);
                if((encFac>70) && (encFac<74)) {
                    traderTrade.setEnabled(true);
                    traderLeave.setEnabled(true);
                    traderAttack.setEnabled(true);
                    if (encFac==71) {
                        traderInfo.setText("Another trader appears and ignores you.");
                        traderInfo.repaint();
                        traderTrade.setEnabled(false);
                    } else if (encFac==72) {
                        traderInfo.setText("Another trader appears and asks for trade.");
                        traderInfo.repaint();
                    } else {
                        traderInfo.setText("Another trader appears and runs away.");
                        traderInfo.repaint();
                        traderAttack.setEnabled(false);
                        traderTrade.setEnabled(false);
                    }
                    encounterTrader.setLocationRelativeTo(null);
                    encounterTrader.setVisible(true);
                    stop=true;
                    timer.stop();
                } else if((encFac>42) && (encFac<45)) {
                    pirateOK.setEnabled(true);
                    pirateFight.setEnabled(true);
                    pirateEscape.setEnabled(true);
                    if (encFac==43) {
                        pirateInfo.setText("Apirate appears, you got attacked");
                        pirateInfo.repaint();
                        pirateOK.setEnabled(false);
                    } else {
                        pirateInfo.setText("Apirate appears, but runs away.");
                        pirateInfo.repaint();
                        pirateFight.setEnabled(false);
                        pirateEscape.setEnabled(false);
                    }
                    encounterPirate.setLocationRelativeTo(null);
                    encounterPirate.setVisible(true);
                    stop=true;
                    timer.stop();
                } else if((encFac>12) && (encFac<15)) {
                    policeBribe.setEnabled(true);
                    policeEscape.setEnabled(true);
                    policeAcctack.setEnabled(true);
                    policeCheck.setEnabled(true);
                    encounterPolice.setVisible(true);
                    if (encFac==13) {
                        policeInfo.setText("A police saw you, but ignored you.");
                        policeInfo.repaint();
                        policeBribe.setEnabled(false);
                        policeEscape.setEnabled(false);
                        policeAcctack.setEnabled(false);
                        policeCheck.setEnabled(false);
                    } else {
                        policeInfo.setText("A police wants to check your cargo");
                        policeInfo.repaint();
                        policeOK.setEnabled(false);
                    }
                    encounterPolice.setLocationRelativeTo(null);
                    encounterPolice.setVisible(true);
                    stop=true;
                    timer.stop();
                } 
                
                else if (encFac==1 || encFac==11) {
                    randCreditInfo1.setText("You gained " + myPlayer.gainCredit(500) + " credits");
                    randCreditInfo2.setText("Lucky! Who lost 500 credits in universe.");
                    System.out.println(myPlayer.credit);
                    randCredit.setLocationRelativeTo(null);
                    randCredit.setVisible(true);
                    stop=true;
                    timer.stop();
                } else if (encFac==9 || encFac==99) {
                    randCreditInfo1.setText("You were stolen " + myPlayer.loseCredit(500) + " credits in your ship");
                    randCreditInfo2.setText("HOW COULD THAT HAPPEN?");
                    randCredit.setLocationRelativeTo(null);
                    randCredit.setVisible(true);
                    stop=true;
                    timer.stop();
                }
                
                travellingLabel.setText(travellingLabel.getText() + ".");
                travellingLabel.repaint();
                dist--;
                remainingDist.setText("Remaining Distance: " + dist);
                remainingDist.repaint();
                
                if (dist<0) {
                    timer.stop();
                    dispose();
                }
            }
        }
    };
    /**
     * Creates new form TravelProcess
     */
    public TravelProcess() {
        initComponents();
        timer.addActionListener(myal);
        dist=20;
    }
    
    public TravelProcess(double d) {
        dist=(int)d;
        myPlayer.credit = 30000;
        initComponents();
        timer.addActionListener(myal);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        encounterTrader = new javax.swing.JDialog();
        traderInfo = new javax.swing.JLabel();
        traderAttack = new javax.swing.JButton();
        traderTrade = new javax.swing.JButton();
        traderLeave = new javax.swing.JButton();
        encounterPirate = new javax.swing.JDialog();
        pirateInfo = new javax.swing.JLabel();
        pirateOK = new javax.swing.JButton();
        pirateFight = new javax.swing.JButton();
        pirateEscape = new javax.swing.JButton();
        encounterPolice = new javax.swing.JDialog();
        policeInfo = new javax.swing.JLabel();
        policeOK = new javax.swing.JButton();
        policeBribe = new javax.swing.JButton();
        policeEscape = new javax.swing.JButton();
        policeAcctack = new javax.swing.JButton();
        policeCheck = new javax.swing.JButton();
        randCredit = new javax.swing.JDialog();
        randCreditInfo1 = new javax.swing.JLabel();
        randCreditInfo2 = new javax.swing.JLabel();
        randCreditOK = new javax.swing.JButton();
        bribePolice = new javax.swing.JDialog();
        bribePoliceInfo = new javax.swing.JLabel();
        bribePoliceOK = new javax.swing.JButton();
        bribePoliceCancel = new javax.swing.JButton();
        fight = new javax.swing.JDialog();
        fightENHP = new javax.swing.JLabel();
        fightBF = new javax.swing.JLabel();
        fightMYHP = new javax.swing.JLabel();
        fightAttack = new javax.swing.JButton();
        fightEscape = new javax.swing.JButton();
        fightSur = new javax.swing.JButton();
        travellingLabel = new javax.swing.JLabel();
        remainingDist = new javax.swing.JLabel();

        encounterTrader.setMinimumSize(new java.awt.Dimension(400, 300));

        traderInfo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        traderInfo.setText("encounter tader");

        traderAttack.setText("Attack");
        traderAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traderAttackActionPerformed(evt);
            }
        });

        traderTrade.setText("Trade");

        traderLeave.setText("Leave");
        traderLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traderLeaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout encounterTraderLayout = new javax.swing.GroupLayout(encounterTrader.getContentPane());
        encounterTrader.getContentPane().setLayout(encounterTraderLayout);
        encounterTraderLayout.setHorizontalGroup(
            encounterTraderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encounterTraderLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(encounterTraderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(encounterTraderLayout.createSequentialGroup()
                        .addComponent(traderAttack, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(encounterTraderLayout.createSequentialGroup()
                        .addGroup(encounterTraderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(traderInfo)
                            .addGroup(encounterTraderLayout.createSequentialGroup()
                                .addComponent(traderTrade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(traderLeave, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                        .addGap(30, 30, 30))))
        );
        encounterTraderLayout.setVerticalGroup(
            encounterTraderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encounterTraderLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(traderInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(traderAttack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(encounterTraderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(traderTrade, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(traderLeave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        encounterPirate.setMinimumSize(new java.awt.Dimension(400, 300));

        pirateInfo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        pirateInfo.setText("Pirate is attacking you");

        pirateOK.setText("OK");
        pirateOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pirateOKActionPerformed(evt);
            }
        });

        pirateFight.setText("Fight");
        pirateFight.setMaximumSize(new java.awt.Dimension(47, 23));
        pirateFight.setMinimumSize(new java.awt.Dimension(47, 23));
        pirateFight.setPreferredSize(new java.awt.Dimension(47, 23));
        pirateFight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pirateFightActionPerformed(evt);
            }
        });

        pirateEscape.setText("Escape");
        pirateEscape.setMaximumSize(new java.awt.Dimension(47, 23));
        pirateEscape.setMinimumSize(new java.awt.Dimension(47, 23));
        pirateEscape.setPreferredSize(new java.awt.Dimension(47, 23));
        pirateEscape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pirateEscapeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout encounterPirateLayout = new javax.swing.GroupLayout(encounterPirate.getContentPane());
        encounterPirate.getContentPane().setLayout(encounterPirateLayout);
        encounterPirateLayout.setHorizontalGroup(
            encounterPirateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encounterPirateLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(encounterPirateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pirateInfo)
                    .addGroup(encounterPirateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(encounterPirateLayout.createSequentialGroup()
                            .addComponent(pirateFight, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pirateEscape, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(pirateOK, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        encounterPirateLayout.setVerticalGroup(
            encounterPirateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encounterPirateLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(pirateInfo)
                .addGap(98, 98, 98)
                .addComponent(pirateOK, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(encounterPirateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pirateEscape, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pirateFight, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        encounterPolice.setMinimumSize(new java.awt.Dimension(400, 300));

        policeInfo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        policeInfo.setText("encounter police");

        policeOK.setText("OK");
        policeOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                policeOKActionPerformed(evt);
            }
        });

        policeBribe.setText("Bribe");
        policeBribe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                policeBribeActionPerformed(evt);
            }
        });

        policeEscape.setText("Escape");
        policeEscape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                policeEscapeActionPerformed(evt);
            }
        });

        policeAcctack.setText("Fight");
        policeAcctack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                policeAcctackActionPerformed(evt);
            }
        });

        policeCheck.setText("Go For It");

        javax.swing.GroupLayout encounterPoliceLayout = new javax.swing.GroupLayout(encounterPolice.getContentPane());
        encounterPolice.getContentPane().setLayout(encounterPoliceLayout);
        encounterPoliceLayout.setHorizontalGroup(
            encounterPoliceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encounterPoliceLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(encounterPoliceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(policeInfo)
                    .addComponent(policeOK, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, encounterPoliceLayout.createSequentialGroup()
                        .addGroup(encounterPoliceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(policeBribe, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(policeAcctack, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(encounterPoliceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(policeEscape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(policeCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        encounterPoliceLayout.setVerticalGroup(
            encounterPoliceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, encounterPoliceLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(policeInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(policeOK, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(encounterPoliceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(policeBribe, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(policeCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(encounterPoliceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(policeAcctack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(policeEscape, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        randCredit.setMinimumSize(new java.awt.Dimension(400, 300));

        randCreditInfo1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        randCreditInfo1.setText("jLabel1");

        randCreditInfo2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        randCreditInfo2.setText("jLabel2");

        randCreditOK.setText("OK");
        randCreditOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randCreditOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout randCreditLayout = new javax.swing.GroupLayout(randCredit.getContentPane());
        randCredit.getContentPane().setLayout(randCreditLayout);
        randCreditLayout.setHorizontalGroup(
            randCreditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(randCreditLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(randCreditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(randCreditInfo2)
                    .addComponent(randCreditInfo1)
                    .addComponent(randCreditOK, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        randCreditLayout.setVerticalGroup(
            randCreditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(randCreditLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(randCreditInfo1)
                .addGap(28, 28, 28)
                .addComponent(randCreditInfo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(randCreditOK, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        bribePolice.setMinimumSize(new java.awt.Dimension(400, 300));

        bribePoliceInfo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bribePoliceInfo.setText("You are going to bribe Police $");

        bribePoliceOK.setText("OK");
        bribePoliceOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bribePoliceOKActionPerformed(evt);
            }
        });

        bribePoliceCancel.setText("Cancel");
        bribePoliceCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bribePoliceCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bribePoliceLayout = new javax.swing.GroupLayout(bribePolice.getContentPane());
        bribePolice.getContentPane().setLayout(bribePoliceLayout);
        bribePoliceLayout.setHorizontalGroup(
            bribePoliceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bribePoliceLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(bribePoliceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bribePoliceInfo)
                    .addGroup(bribePoliceLayout.createSequentialGroup()
                        .addComponent(bribePoliceOK, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(bribePoliceCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        bribePoliceLayout.setVerticalGroup(
            bribePoliceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bribePoliceLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(bribePoliceInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(bribePoliceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bribePoliceCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bribePoliceOK, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        fight.setMinimumSize(new java.awt.Dimension(400, 300));

        fightENHP.setText("HP: ");

        fightBF.setText("Battle Field");

        fightMYHP.setText("HP");

        fightAttack.setText("Attack");
        fightAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fightAttackActionPerformed(evt);
            }
        });

        fightEscape.setText("Escape");
        fightEscape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fightEscapeActionPerformed(evt);
            }
        });

        fightSur.setText("Surrender");

        javax.swing.GroupLayout fightLayout = new javax.swing.GroupLayout(fight.getContentPane());
        fight.getContentPane().setLayout(fightLayout);
        fightLayout.setHorizontalGroup(
            fightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fightLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(fightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fightBF)
                    .addComponent(fightMYHP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(fightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fightENHP)
                    .addComponent(fightAttack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fightSur, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(fightEscape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        fightLayout.setVerticalGroup(
            fightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fightLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(fightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fightBF)
                    .addComponent(fightENHP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(fightAttack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fightSur, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fightMYHP)
                    .addComponent(fightEscape, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        travellingLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        travellingLabel.setText("Travelling");

        remainingDist.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        remainingDist.setText("Remaining Distance:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(remainingDist)
                    .addComponent(travellingLabel))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(travellingLabel)
                .addGap(61, 61, 61)
                .addComponent(remainingDist)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void policeOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_policeOKActionPerformed
        encounterPolice.dispose();
        resumeTravelling();// TODO add your handling code here:
    }//GEN-LAST:event_policeOKActionPerformed

    private void pirateOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pirateOKActionPerformed
        encounterPirate.dispose();
        resumeTravelling();// TODO add your handling code here:
    }//GEN-LAST:event_pirateOKActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        resumeTravelling();        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void pirateFightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pirateFightActionPerformed
        fight.setLocationRelativeTo(null);
        fight.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_pirateFightActionPerformed

    private void traderAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traderAttackActionPerformed
        fight.setLocationRelativeTo(null);
        fight.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_traderAttackActionPerformed

    private void policeBribeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_policeBribeActionPerformed
        bribePolice.setLocationRelativeTo(null);
        bribePolice.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_policeBribeActionPerformed

    private void randCreditOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randCreditOKActionPerformed
        randCredit.dispose();
        resumeTravelling();// TODO add your handling code here:
    }//GEN-LAST:event_randCreditOKActionPerformed

    private void traderLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traderLeaveActionPerformed
        encounterTrader.dispose();     
        resumeTravelling();// TODO add your handling code here:
    }//GEN-LAST:event_traderLeaveActionPerformed

    private void pirateEscapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pirateEscapeActionPerformed
        encounterPirate.dispose();
        resumeTravelling();// TODO add your handling code here:
    }//GEN-LAST:event_pirateEscapeActionPerformed

    private void policeEscapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_policeEscapeActionPerformed
        encounterPolice.dispose();  
        resumeTravelling();// TODO add your handling code here:
    }//GEN-LAST:event_policeEscapeActionPerformed

    private void fightEscapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fightEscapeActionPerformed
        fight.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_fightEscapeActionPerformed

    private void fightAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fightAttackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fightAttackActionPerformed

    private void bribePoliceOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bribePoliceOKActionPerformed
        bribePolice.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_bribePoliceOKActionPerformed

    private void bribePoliceCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bribePoliceCancelActionPerformed
        bribePolice.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_bribePoliceCancelActionPerformed

    private void policeAcctackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_policeAcctackActionPerformed
        fight.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_policeAcctackActionPerformed

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
            java.util.logging.Logger.getLogger(TravelProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TravelProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TravelProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TravelProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TravelProcess().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog bribePolice;
    private javax.swing.JButton bribePoliceCancel;
    private javax.swing.JLabel bribePoliceInfo;
    private javax.swing.JButton bribePoliceOK;
    private javax.swing.JDialog encounterPirate;
    private javax.swing.JDialog encounterPolice;
    private javax.swing.JDialog encounterTrader;
    private javax.swing.JDialog fight;
    private javax.swing.JButton fightAttack;
    private javax.swing.JLabel fightBF;
    private javax.swing.JLabel fightENHP;
    private javax.swing.JButton fightEscape;
    private javax.swing.JLabel fightMYHP;
    private javax.swing.JButton fightSur;
    private javax.swing.JButton pirateEscape;
    private javax.swing.JButton pirateFight;
    private javax.swing.JLabel pirateInfo;
    private javax.swing.JButton pirateOK;
    private javax.swing.JButton policeAcctack;
    private javax.swing.JButton policeBribe;
    private javax.swing.JButton policeCheck;
    private javax.swing.JButton policeEscape;
    private javax.swing.JLabel policeInfo;
    private javax.swing.JButton policeOK;
    private javax.swing.JDialog randCredit;
    private javax.swing.JLabel randCreditInfo1;
    private javax.swing.JLabel randCreditInfo2;
    private javax.swing.JButton randCreditOK;
    private javax.swing.JLabel remainingDist;
    private javax.swing.JButton traderAttack;
    private javax.swing.JLabel traderInfo;
    private javax.swing.JButton traderLeave;
    private javax.swing.JButton traderTrade;
    private javax.swing.JLabel travellingLabel;
    // End of variables declaration//GEN-END:variables

    public void resumeTravelling() {
        stop=false;
        try {
            Thread.sleep(200);
        } catch (InterruptedException ie) { }
        timer.restart();
    }
    
}
