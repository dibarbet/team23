/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spacetrader;
import java.util.Random;
/**
 *
 * @author Guy, Seung Lee
 */
public class MarketWindow extends javax.swing.JFrame {
    private int nwater, nfurs, nfood, nore, ngames, nfirearms, nmedicine, nmachines, nnarcotics, nrobots;
    private int pwater, pfurs, pfood, pore, pgames, pfirearms, pmedicine, pmachines, pnarcotics, probots;
    private int mwater, mfurs, mfood, more, mgames, mfirearms, mmedicine, mmachines, mnarcotics, mrobots;
    private int money;
    private Ship ship = new Ship();
    private String[] stock;
    private SolarSystem solarsystem;
    /**
     * Creates new form MarketWindow
     * @param solarsystem  solar system of this market
     */
    
    public MarketWindow(SolarSystem solarsystem) {
        initComponents();
        this.solarsystem = solarsystem;
        //ship.testCase(); // create test case
        for (int i = 0; i < ship.cargo.length; i++) { //get the numbers of goods in cargo space
            if (ship.cargo[i] == "Water") {
                nwater++;
            } else if (ship.cargo[i] == "Furs") {
                nfurs++;
            } else if (ship.cargo[i] == "Food") {
                nfood++;
            } else if (ship.cargo[i] == "Ore") {
                nore++;
            } else if (ship.cargo[i] == "Games") {
                ngames++;
            } else if (ship.cargo[i] == "Firearms") {
                nfirearms++;
            } else if (ship.cargo[i] == "Medicine") {
                nmedicine++;
            } else if (ship.cargo[i] == "Machines") {
                nmachines++;
            } else if (ship.cargo[i] == "Narcotics") {
                nnarcotics++;
            } else if (ship.cargo[i] == "Robots") {
                nrobots++;
            }            
        }
        
        
        System.out.println("nWater:" + nwater); //prints out the numbers of cargo space
        System.out.println("nFurs:" + nfurs);
        System.out.println("nFood:" + nfood);
        System.out.println("nOre:" + nore);
        System.out.println("nGames:" + ngames);
        System.out.println("nFirearms:" + nfirearms);
        System.out.println("nMedicine:" + nmedicine);
        System.out.println("nMachines:" + nmachines);
        System.out.println("nNarcotics:" + nnarcotics);
        System.out.println("nRobots:" + nrobots);
        
        
        int techLevel = solarsystem.getTechLevel();
                
        Random rand = new Random(); // creates prices for goods based on a model
        pwater = Good.Water.basePrice * (1 + rand.nextInt(Good.Water.var) / 10) + (Good.Water.ipl * (techLevel - Good.Water.mtlp));
        pfurs = Good.Furs.basePrice * (1 + rand.nextInt(Good.Furs.var) / 10) + (Good.Furs.ipl * (techLevel - Good.Furs.mtlp));
        pfood = Good.Food.basePrice * (1 + rand.nextInt(Good.Food.var) / 10) + (Good.Food.ipl * (techLevel - Good.Food.mtlp));
        pore = Good.Ore.basePrice * (1 + rand.nextInt(Good.Ore.var) / 10) + (Good.Ore.ipl * (techLevel - Good.Ore.mtlp));
        pgames = Good.Games.basePrice * (1 + rand.nextInt(Good.Games.var) / 10) + (Good.Games.ipl * (techLevel - Good.Games.mtlp));
        pfirearms = Good.Firearms.basePrice * (1 + rand.nextInt(Good.Firearms.var) / 10) + (Good.Firearms.ipl * (techLevel - Good.Firearms.mtlp));
        pmedicine = Good.Medicine.basePrice * (1 + rand.nextInt(Good.Medicine.var) / 10) + (Good.Medicine.ipl * (techLevel - Good.Medicine.mtlp));
        pmachines = Good.Machines.basePrice * (1 + rand.nextInt(Good.Machines.var) / 10) + (Good.Machines.ipl * (techLevel - Good.Machines.mtlp));
        pnarcotics = Good.Narcotics.basePrice * (1 + rand.nextInt(Good.Narcotics.var) / 10) + (Good.Narcotics.ipl * (techLevel - Good.Narcotics.mtlp));
        probots = Good.Robots.basePrice * (1 + rand.nextInt(Good.Robots.var) / 10) + (Good.Robots.ipl * (2 - Good.Robots.mtlp));
        
        System.out.println("pWater:" + pwater); //prints out prices of goods
        System.out.println("pFurs:" + pfurs);
        System.out.println("pFood:" + pfood);
        System.out.println("pOre:" + pore);
        System.out.println("pGames:" + pgames);
        System.out.println("pFirearms:" + pfirearms);
        System.out.println("pMedicine:" + pmedicine);
        System.out.println("pMachines:" + pmachines);
        System.out.println("pNarcotics:" + pnarcotics);
        System.out.println("pRobots:" + probots);
        
        jTextField31.setText(Integer.toString(nwater)); //display numbers of goods in the corresponding textfields
        jTextField32.setText(Integer.toString(nfurs));
        jTextField33.setText(Integer.toString(nfood));
        jTextField34.setText(Integer.toString(nore));
        jTextField35.setText(Integer.toString(ngames));
        jTextField36.setText(Integer.toString(nfirearms));
        jTextField37.setText(Integer.toString(nmedicine));
        jTextField38.setText(Integer.toString(nmachines));
        jTextField39.setText(Integer.toString(nnarcotics));
        jTextField40.setText(Integer.toString(nrobots));
        
        jTextField1.setText(Integer.toString(pwater)); //display prices of goods in the corresponding textfields.
        jTextField12.setText(Integer.toString(pfurs));
        jTextField13.setText(Integer.toString(pfood));
        jTextField14.setText(Integer.toString(pore));
        jTextField15.setText(Integer.toString(pgames));
        jTextField16.setText(Integer.toString(pfirearms));
        jTextField17.setText(Integer.toString(pmedicine));
        jTextField18.setText(Integer.toString(pmachines));
        jTextField19.setText(Integer.toString(pnarcotics));
        jTextField20.setText(Integer.toString(probots));
        
        money = SpaceTrader.player.credit; //get money of the player
        jTextField41.setText(Integer.toString(money)); //display amount of money in the corresponding textfields
        
        mwater = (1+ rand.nextInt(10)) * techLevel;
        mfurs = (1+ rand.nextInt(10)) * techLevel;
        mfood = (1+ rand.nextInt(10)) * techLevel;
        more = (1+ rand.nextInt(10)) * techLevel;
        mgames = (1+ rand.nextInt(10)) * techLevel;
        mfirearms = (1+ rand.nextInt(10)) * techLevel;
        mmedicine = (1+ rand.nextInt(10)) * techLevel;
        mmachines = (1+ rand.nextInt(10)) * techLevel;
        mnarcotics = (1+ rand.nextInt(10)) * techLevel;
        mrobots = (1+ rand.nextInt(10)) * techLevel;
        /*stock = new String[100 + rand.nextInt(20)];
        for (int i = 0; i < stock.length; i++) { //generate stock in market
            int num = rand.nextInt(10);
            if (num == 0) {
                stock[i] = "Water";
                mwater++;
            } else if (num == 1) {
                stock[i] = "Furs";
                mfurs++;
            } else if (num == 2) {
                stock[i] = "Food";
                mfood++;
            } else if (num == 3) {
                stock[i] = "Ore";
                more++;
            } else if (num == 4) {
                stock[i] = "Games";
                mgames++;
            } else if (num == 5) {
                stock[i] = "Firearms";
                mfirearms++;
            } else if (num == 6) {
                stock[i] = "Medicine";
                mmedicine++;
            } else if (num == 7) {
                stock[i] = "Machines";
                mmachines++;
            } else if (num == 8) {
                stock[i] = "Narcotics";
                mnarcotics++;
            } else if (num == 9) {
                stock[i] = "Robots";
                mrobots++;
            } else if (num == 10) {
                stock[i] = null;
            }
        }*/
        jTextField21.setText(Integer.toString(mwater));
        jTextField22.setText(Integer.toString(mfurs));
        jTextField23.setText(Integer.toString(mfood));
        jTextField24.setText(Integer.toString(more));
        jTextField25.setText(Integer.toString(mgames));
        jTextField42.setText(Integer.toString(mfirearms));
        jTextField43.setText(Integer.toString(mmedicine));
        jTextField44.setText(Integer.toString(mmachines));
        jTextField45.setText(Integer.toString(mnarcotics));
        jTextField46.setText(Integer.toString(mrobots));
        
        System.out.println("Tech Lv: " + solarsystem.getTechLevel());
        jButton1.setEnabled(solarsystem.getTechLevel() >= Good.water.mtlp);
        jButton2.setEnabled(solarsystem.getTechLevel() >= Good.furs.mtlp);
        jButton3.setEnabled(solarsystem.getTechLevel() >= Good.food.mtlp);
        jButton4.setEnabled(solarsystem.getTechLevel() >= Good.ore.mtlp);
        jButton5.setEnabled(solarsystem.getTechLevel() >= Good.games.mtlp);
        jButton6.setEnabled(solarsystem.getTechLevel() >= Good.firearms.mtlp);
        jButton7.setEnabled(solarsystem.getTechLevel() >= Good.medicine.mtlp);
        jButton8.setEnabled(solarsystem.getTechLevel() >= Good.machines.mtlp);
        jButton9.setEnabled(solarsystem.getTechLevel() >= Good.narcotics.mtlp);
        jButton10.setEnabled(solarsystem.getTechLevel() >= Good.robots.mtlp);
        jButton11.setEnabled(solarsystem.getTechLevel() >= Good.water.mtlu);
        jButton12.setEnabled(solarsystem.getTechLevel() >= Good.furs.mtlu);
        jButton13.setEnabled(solarsystem.getTechLevel() >= Good.food.mtlu);
        jButton14.setEnabled(solarsystem.getTechLevel() >= Good.ore.mtlu);
        jButton15.setEnabled(solarsystem.getTechLevel() >= Good.games.mtlu);
        jButton16.setEnabled(solarsystem.getTechLevel() >= Good.firearms.mtlu);
        jButton17.setEnabled(solarsystem.getTechLevel() >= Good.medicine.mtlu);
        jButton18.setEnabled(solarsystem.getTechLevel() >= Good.machines.mtlu);
        jButton19.setEnabled(solarsystem.getTechLevel() >= Good.narcotics.mtlu);
        jButton20.setEnabled(solarsystem.getTechLevel() >= Good.robots.mtlu);
    }

    
       
    
        
        
        
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDialog1 = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jDialog2 = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();        
        jLabel10 = new javax.swing.JLabel();
        jTextField41 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        jLabel5.setText("jLabel5");

        jLabel6.setText("You cannot sell more goods than are in your cargo space.");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel6)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(271, Short.MAX_VALUE))
        );

        jLabel8.setText("You cannot buy more goods than you have money or cargo space. ");

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel8)
                .addContainerGap(262, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField2.setEditable(false);
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Water");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Furs");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setEditable(false);
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("Food");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setEditable(false);
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("Ore");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setEditable(false);
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("Games");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.setEditable(false);
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("Firearms");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField8.setEditable(false);
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("Medicine");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTextField9.setEditable(false);
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("Machines");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jTextField10.setEditable(false);
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("Narcotics");
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jTextField11.setEditable(false);
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("Robots");
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Market Place");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Cargo Bay");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setText("Market Goods");

        jLabel7.setText("Price");

        jTextField1.setEditable(false);
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("      ");

        jTextField12.setEditable(false);
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("      ");

        jTextField13.setEditable(false);
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("      ");

        jTextField14.setEditable(false);
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setText("      ");

        jTextField15.setEditable(false);
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setText("      ");

        jTextField16.setEditable(false);
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setText("      ");

        jTextField17.setEditable(false);
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setText("      ");

        jTextField18.setEditable(false);
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setText("      ");

        jTextField19.setEditable(false);
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setText("      ");

        jTextField20.setEditable(false);
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setText("      ");

        jLabel9.setText("Amount");

        jTextField31.setEditable(false);
        jTextField31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField31.setText("      ");
        jTextField31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField31ActionPerformed(evt);
            }
        });

        jTextField32.setEditable(false);
        jTextField32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField32.setText("      ");
        jTextField32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField32ActionPerformed(evt);
            }
        });

        jTextField33.setEditable(false);
        jTextField33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField33.setText("      ");

        jTextField34.setEditable(false);
        jTextField34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField34.setText("      ");

        jTextField35.setEditable(false);
        jTextField35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField35.setText("      ");

        jTextField36.setEditable(false);
        jTextField36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField36.setText("      ");

        jTextField37.setEditable(false);
        jTextField37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField37.setText("      ");

        jTextField38.setEditable(false);
        jTextField38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField38.setText("      ");

        jTextField39.setEditable(false);
        jTextField39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField39.setText("      ");

        jTextField40.setEditable(false);
        jTextField40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField40.setText("      ");

        jButton1.setText("Buy");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Buy");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Buy");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Buy");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Buy");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Buy");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Buy");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Buy");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Buy");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Buy");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Sell");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Sell");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Sell");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Sell");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("Sell");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("Sell");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("Sell");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("Sell");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("Sell");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setText("Sell");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jLabel10.setText("Money  $");

        jTextField41.setEditable(false);
        jTextField41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField41.setText("      ");
        jTextField41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField41ActionPerformed(evt);
            }
        });

        jTextField21.setEditable(false);
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setText("      ");
        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });

        jTextField22.setEditable(false);
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField22.setText("      ");

        jTextField23.setEditable(false);
        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField23.setText("      ");

        jTextField24.setEditable(false);
        jTextField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField24.setText("      ");

        jTextField25.setEditable(false);
        jTextField25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField25.setText("      ");

        jLabel11.setText("Amount");

        jTextField42.setEditable(false);
        jTextField42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField42.setText("      ");

        jTextField43.setEditable(false);
        jTextField43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField43.setText("      ");

        jTextField44.setEditable(false);
        jTextField44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField44.setText("      ");

        jTextField45.setEditable(false);
        jTextField45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField45.setText("      ");

        jTextField46.setEditable(false);
        jTextField46.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField46.setText("      ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel3)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jButton15, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jButton14))
                                            .addComponent(jButton13))
                                        .addComponent(jButton12))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField32, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                        .addComponent(jTextField33, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField34, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField35, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField36))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField37))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField38))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField39))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField11)
                            .addComponent(jTextField10)
                            .addComponent(jTextField9)
                            .addComponent(jTextField8)
                            .addComponent(jTextField7)
                            .addComponent(jTextField6)
                            .addComponent(jTextField5)
                            .addComponent(jTextField4)
                            .addComponent(jTextField3)
                            .addComponent(jTextField2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton1)
                                            .addComponent(jButton2)
                                            .addComponent(jButton3)
                                            .addComponent(jButton4)
                                            .addComponent(jButton5)
                                            .addComponent(jButton6)
                                            .addComponent(jButton7)
                                            .addComponent(jButton8)
                                            .addComponent(jButton9)
                                            .addComponent(jButton10)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton3)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton4)
                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton5)
                                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton6)
                                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton7)
                                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton8)
                                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton9)
                                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton10)
                                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton15)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton20))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int tempmoney = money;
        if (tempmoney - pwater > 0 && mwater >0) {
            money = money - pwater;
            nwater++;
            mwater--;
            jTextField31.setText(Integer.toString(nwater));
            jTextField21.setText(Integer.toString(mwater));
            jTextField41.setText(Integer.toString(money));
            ship.addCargo(1, "Waters");
        } else {
            jDialog2.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int tempmoney = money;
        if (tempmoney - pfurs > 0 && mfurs >0) {
            money = money - pfurs;
            nfurs++;
            mfurs--;
            jTextField32.setText(Integer.toString(nfurs));
            jTextField22.setText(Integer.toString(mfurs));
            jTextField41.setText(Integer.toString(money));
            ship.addCargo(1, "Furs");
        } else {
            jDialog2.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int tempmoney = money;
        if (tempmoney - pfood > 0 && mfood >0) {
            money = money - pfood;
            nfood++;
            mfood--;
            jTextField33.setText(Integer.toString(nfood));
            jTextField23.setText(Integer.toString(mfood));
            jTextField41.setText(Integer.toString(money));
            ship.addCargo(1, "Food");
        } else {
            jDialog2.setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int tempmoney = money;
        if (tempmoney - pore > 0&& more > 0) {
            money = money - pore;
            nore++;
            more--;
            jTextField34.setText(Integer.toString(nore));
            jTextField24.setText(Integer.toString(more));
            jTextField41.setText(Integer.toString(money));
            ship.addCargo(1, "Ore");
        } else {
            jDialog2.setVisible(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int tempmoney = money;
        if (tempmoney - pgames > 0 && mgames > 0) {
            money = money - pgames;
            ngames++;
            mgames--;
            jTextField35.setText(Integer.toString(ngames));
            jTextField25.setText(Integer.toString(mgames));
            jTextField41.setText(Integer.toString(money));
            ship.addCargo(1, "Games");
        } else {
            jDialog2.setVisible(true);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int tempmoney = money;
        if (tempmoney - pfirearms > 0 && mfirearms > 0) {
            money = money - pfirearms;
            nfurs++;
            mfurs--;
            jTextField36.setText(Integer.toString(nfirearms));
            jTextField42.setText(Integer.toString(mfirearms));
            jTextField41.setText(Integer.toString(money));
            ship.addCargo(1, "Firearms");
        } else {
            jDialog2.setVisible(true);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int tempmoney = money;
        if (tempmoney - pmedicine > 0 && mmedicine > 0) {
            money = money - pmedicine;
            nmedicine++;
            mmedicine--;
            jTextField37.setText(Integer.toString(nmedicine));
            jTextField43.setText(Integer.toString(mmedicine));
            jTextField41.setText(Integer.toString(money));
            ship.addCargo(1, "Medicine");
        } else {
            jDialog2.setVisible(true);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int tempmoney = money;
        if (tempmoney - pmachines > 0&& mmachines > 0) {
            money = money - pmachines;
            nmachines++;
            mmachines--;
            jTextField38.setText(Integer.toString(nmachines));
            jTextField44.setText(Integer.toString(mmachines));
            jTextField41.setText(Integer.toString(money));
            ship.addCargo(1, "Machines");
        } else {
            jDialog2.setVisible(true);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        int tempmoney = money;
        if (tempmoney - pnarcotics > 0 && mnarcotics > 0) {
            money = money - pnarcotics;
            nnarcotics++;
            mnarcotics--;
            jTextField39.setText(Integer.toString(nnarcotics));
            jTextField45.setText(Integer.toString(mnarcotics));
            jTextField41.setText(Integer.toString(money));
            ship.addCargo(1, "Narcotics");
        } else {
            jDialog2.setVisible(true);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int tempmoney = money;
        if (tempmoney - probots > 0 && mrobots > 0) {
            money = money - probots;
            nrobots++;
            mrobots--;
            jTextField40.setText(Integer.toString(nrobots));
            jTextField46.setText(Integer.toString(mrobots));
            jTextField41.setText(Integer.toString(money));
            ship.addCargo(1, "Robots");
        } else {
            jDialog2.setVisible(true);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        int tempmoney = money;
        if (nwater> 0) {
            money = money + pwater;
            nwater--;
            mwater++;
            jTextField21.setText(Integer.toString(mwater));
            jTextField31.setText(Integer.toString(nwater));
            jTextField41.setText(Integer.toString(money));
            ship.removeCargo(1, "Water");
        } else {
            jDialog1.setVisible(true);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        int tempmoney = money;
        if (nfurs > 0) {
            money = money + pfurs;
            nfurs--;
            mfurs++;
            jTextField22.setText(Integer.toString(mfurs));
            jTextField32.setText(Integer.toString(nfurs));
            jTextField41.setText(Integer.toString(money));
            ship.removeCargo(1, "Furs");
        } else {
            jDialog1.setVisible(true);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        int tempmoney = money;
        if (nfood > 0) {
            money = money + pfood;
            nfood--;
            mfood++;
            jTextField23.setText(Integer.toString(mfood));
            jTextField33.setText(Integer.toString(nfood));
            jTextField41.setText(Integer.toString(money));
            ship.removeCargo(1, "Food");
        } else {
            jDialog1.setVisible(true);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        int tempmoney = money;
        if (nore > 0) {
            money = money + pore;
            nore--;
            more++;
            jTextField24.setText(Integer.toString(more));
            jTextField34.setText(Integer.toString(nore));
            jTextField41.setText(Integer.toString(money));
            ship.removeCargo(1, "Ore");
        } else {
            jDialog1.setVisible(true);
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        int tempmoney = money;
        if (ngames > 0) {
            money = money + pgames;
            ngames--;
            mgames++;
            jTextField25.setText(Integer.toString(mgames));
            jTextField35.setText(Integer.toString(ngames));
            jTextField41.setText(Integer.toString(money));
            ship.removeCargo(1, "Games");
        } else {
            jDialog1.setVisible(true);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        int tempmoney = money;
        if (nfirearms > 0) {
            money = money + pfirearms;
            nfirearms--;
            mfirearms++;
            jTextField42.setText(Integer.toString(mfirearms));
            jTextField36.setText(Integer.toString(nfirearms));
            jTextField41.setText(Integer.toString(money));
            ship.removeCargo(1, "Firearms");
        } else {
            jDialog1.setVisible(true);
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        int tempmoney = money;
        if (nmedicine > 0) {
            money = money + pmedicine;
            nmedicine--;
            mmedicine++;
            jTextField43.setText(Integer.toString(mmedicine));
            jTextField37.setText(Integer.toString(nmedicine));
            jTextField41.setText(Integer.toString(money));
            ship.removeCargo(1, "Medicine");
        } else {
            jDialog1.setVisible(true);
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        int tempmoney = money;
        if (nmachines > 0) {
            money = money + pmachines;
            nmachines--;
            mmachines++;
            jTextField44.setText(Integer.toString(mmachines));
            jTextField38.setText(Integer.toString(nmachines));
            jTextField41.setText(Integer.toString(money));
            ship.removeCargo(1, "Machines");
        } else {
            jDialog1.setVisible(true);
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        int tempmoney = money;
        if (nnarcotics > 0) {
            money = money + pnarcotics;
            nnarcotics--;
            mnarcotics++;
            jTextField45.setText(Integer.toString(mnarcotics));
            jTextField39.setText(Integer.toString(nnarcotics));
            jTextField41.setText(Integer.toString(money));
            ship.removeCargo(1, "Narcotics");
        } else {
            jDialog1.setVisible(true);
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        int tempmoney = money;
        if (nrobots > 0) {
            money = money + probots;
            nrobots--;
            mrobots++;
            jTextField46.setText(Integer.toString(mrobots));
            jTextField40.setText(Integer.toString(nrobots));
            jTextField41.setText(Integer.toString(money));
            ship.removeCargo(1, "Robots");
        } else {
            jDialog1.setVisible(true);
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jTextField31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField31ActionPerformed

    }//GEN-LAST:event_jTextField31ActionPerformed

    private void jTextField41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField41ActionPerformed

    private void jTextField32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField32ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed
   
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
            java.util.logging.Logger.getLogger(MarketWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarketWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarketWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarketWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarketWindow(solarsystem).setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
