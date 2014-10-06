/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spacetrader;
import java.awt.Dimension;
/**
 *
 * @author Guy
 */
public class GameWindow extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    private SolarSystem solarsystem;
    
    private Universe universe;
    
    private javax.swing.JButton buttons[] = new javax.swing.JButton[114];
    
    public GameWindow(Universe universe) {
        //initComponents();
        setSize(1200, 800);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        solarsystem = universe.getCurrentSolarSystem();
        this.universe = universe;
        Dimension dim = new Dimension(8,8);
        for(int i = 0; i < 114; i++) {
            buttons[i] = new javax.swing.JButton();
            if(universe.gameUniverse[i] == solarsystem) {
                buttons[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/spacetrader/Planet2.png")));
            } else {
                buttons[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/spacetrader/Planet.png")));
            }
            buttons[i].setBorderPainted(false);
            buttons[i].setPreferredSize(dim);
            buttons[i].setBounds((universe.gameUniverse[i].getX()) * 8, (universe.gameUniverse[i].getY()) * 8, 8, 8);
            add(buttons[i]);
        }
        buttons[0].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1Pressed(evt);
            }
        });
        buttons[1].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2Pressed(evt);
            }
        });
        buttons[2].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3Pressed(evt);
            }
        });
        buttons[3].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4Pressed(evt);
            }
        });
        buttons[4].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5Pressed(evt);
            }
        });
        buttons[5].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6Pressed(evt);
            }
        });
        buttons[6].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7Pressed(evt);
            }
        });
        buttons[7].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8Pressed(evt);
            }
        });
        buttons[8].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9Pressed(evt);
            }
        });
        buttons[9].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10Pressed(evt);
            }
        });
        buttons[10].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button11Pressed(evt);
            }
        });
        buttons[11].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button12Pressed(evt);
            }
        });
        buttons[12].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button13Pressed(evt);
            }
        });
        buttons[13].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button14Pressed(evt);
            }
        });
        buttons[14].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button15Pressed(evt);
            }
        });
        buttons[15].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button16Pressed(evt);
            }
        });
        buttons[16].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button17Pressed(evt);
            }
        });
        buttons[17].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button18Pressed(evt);
            }
        });
        buttons[18].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button19Pressed(evt);
            }
        });
        buttons[19].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button20Pressed(evt);
            }
        });
        buttons[20].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button21Pressed(evt);
            }
        });
        buttons[21].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button22Pressed(evt);
            }
        });
        buttons[22].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button23Pressed(evt);
            }
        });
        buttons[23].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button24Pressed(evt);
            }
        });
        buttons[24].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button25Pressed(evt);
            }
        });
        buttons[25].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button26Pressed(evt);
            }
        });
        buttons[26].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button27Pressed(evt);
            }
        });
        buttons[27].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button28Pressed(evt);
            }
        });
        buttons[28].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button29Pressed(evt);
            }
        });
        buttons[29].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button30Pressed(evt);
            }
        });
        buttons[30].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button31Pressed(evt);
            }
        });
        buttons[31].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button32Pressed(evt);
            }
        });
        buttons[32].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button33Pressed(evt);
            }
        });
        buttons[33].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button34Pressed(evt);
            }
        });
        buttons[34].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button35Pressed(evt);
            }
        });
        buttons[35].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button36Pressed(evt);
            }
        });
        buttons[36].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button37Pressed(evt);
            }
        });
        buttons[37].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button38Pressed(evt);
            }
        });
        buttons[38].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button39Pressed(evt);
            }
        });
        buttons[39].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button40Pressed(evt);
            }
        });
        buttons[40].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button41Pressed(evt);
            }
        });
        buttons[41].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button42Pressed(evt);
            }
        });
        buttons[42].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button43Pressed(evt);
            }
        });
        buttons[43].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button44Pressed(evt);
            }
        });
        buttons[44].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button45Pressed(evt);
            }
        });
        buttons[45].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button46Pressed(evt);
            }
        });
        buttons[46].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button47Pressed(evt);
            }
        });
        buttons[47].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button48Pressed(evt);
            }
        });
        buttons[48].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button49Pressed(evt);
            }
        });
        buttons[49].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button50Pressed(evt);
            }
        });
        buttons[50].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button51Pressed(evt);
            }
        });
        buttons[51].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button52Pressed(evt);
            }
        });
        buttons[52].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button53Pressed(evt);
            }
        });
        buttons[53].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button54Pressed(evt);
            }
        });
        buttons[54].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button55Pressed(evt);
            }
        });
        buttons[55].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button56Pressed(evt);
            }
        });
        buttons[56].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button57Pressed(evt);
            }
        });
        buttons[57].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button58Pressed(evt);
            }
        });
        buttons[58].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button59Pressed(evt);
            }
        });
        buttons[59].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button60Pressed(evt);
            }
        });
        buttons[60].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button61Pressed(evt);
            }
        });
        buttons[61].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button62Pressed(evt);
            }
        });
        buttons[62].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button63Pressed(evt);
            }
        });
        buttons[63].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button64Pressed(evt);
            }
        });
        buttons[64].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button65Pressed(evt);
            }
        });
        buttons[65].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button66Pressed(evt);
            }
        });
        buttons[66].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button67Pressed(evt);
            }
        });
        buttons[67].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button68Pressed(evt);
            }
        });
        buttons[68].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button69Pressed(evt);
            }
        });
        buttons[69].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button70Pressed(evt);
            }
        });
        buttons[70].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button71Pressed(evt);
            }
        });
        buttons[71].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button72Pressed(evt);
            }
        });
        buttons[72].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button73Pressed(evt);
            }
        });
        buttons[73].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button74Pressed(evt);
            }
        });
        buttons[74].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button75Pressed(evt);
            }
        });
        buttons[75].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button76Pressed(evt);
            }
        });
        buttons[76].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button77Pressed(evt);
            }
        });
        buttons[77].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button78Pressed(evt);
            }
        });
        buttons[78].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button79Pressed(evt);
            }
        });
        buttons[79].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button80Pressed(evt);
            }
        });
        buttons[80].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button81Pressed(evt);
            }
        });
        buttons[81].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button82Pressed(evt);
            }
        });
        buttons[82].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button83Pressed(evt);
            }
        });
        buttons[83].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button84Pressed(evt);
            }
        });
        buttons[84].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button85Pressed(evt);
            }
        });
        buttons[85].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button86Pressed(evt);
            }
        });
        buttons[86].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button87Pressed(evt);
            }
        });
        buttons[87].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button88Pressed(evt);
            }
        });
        buttons[88].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button89Pressed(evt);
            }
        });
        buttons[89].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button90Pressed(evt);
            }
        });
        buttons[90].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button91Pressed(evt);
            }
        });
        buttons[91].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button92Pressed(evt);
            }
        });
        buttons[92].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button93Pressed(evt);
            }
        });
        buttons[93].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button94Pressed(evt);
            }
        });
        buttons[94].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button95Pressed(evt);
            }
        });
        buttons[95].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button96Pressed(evt);
            }
        });
        buttons[96].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button97Pressed(evt);
            }
        });
        buttons[97].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button98Pressed(evt);
            }
        });
        buttons[98].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button99Pressed(evt);
            }
        });
        buttons[99].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button100Pressed(evt);
            }
        });
        buttons[100].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button101Pressed(evt);
            }
        });
        buttons[101].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button102Pressed(evt);
            }
        });
        buttons[102].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button103Pressed(evt);
            }
        });
        buttons[103].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button104Pressed(evt);
            }
        });
        buttons[104].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button105Pressed(evt);
            }
        });
        buttons[105].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button106Pressed(evt);
            }
        });
        buttons[106].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button107Pressed(evt);
            }
        });
        buttons[107].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button108Pressed(evt);
            }
        });
        buttons[108].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button109Pressed(evt);
            }
        });
        buttons[109].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button110Pressed(evt);
            }
        });
        buttons[110].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button111Pressed(evt);
            }
        });
        buttons[111].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button112Pressed(evt);
            }
        });
        buttons[112].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button113Pressed(evt);
            }
        });
        buttons[113].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button114Pressed(evt);
            }
        });
        setVisible(true);
    }
    
    public void button1Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[0], universe).setVisible(true);
    }
    
    public void button2Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[1], universe).setVisible(true);
    }
    
    public void button3Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[2], universe).setVisible(true);
    }
    
    public void button4Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[3], universe).setVisible(true);
    }
    
    public void button5Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[4], universe).setVisible(true);
    }
    
    public void button6Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[5], universe).setVisible(true);
    }
    
    public void button7Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[6], universe).setVisible(true);
    }
    
    public void button8Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[7], universe).setVisible(true);
    }
    
    public void button9Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[8], universe).setVisible(true);
    }
    
    public void button10Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[9], universe).setVisible(true);
    }
    
    public void button11Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[10], universe).setVisible(true);
    }
    
    public void button12Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[11], universe).setVisible(true);
    }
    
    public void button13Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[12], universe).setVisible(true);
    }
    
    public void button14Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[13], universe).setVisible(true);
    }
    
    public void button15Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[14], universe).setVisible(true);
    }
    
    public void button16Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[15], universe).setVisible(true);
    }
    
    public void button17Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[16], universe).setVisible(true);
    }
    
    public void button18Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[17], universe).setVisible(true);
    }
    
    public void button19Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[18], universe).setVisible(true);
    }
    
    public void button20Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[19], universe).setVisible(true);
    }
    
    public void button21Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[20], universe).setVisible(true);
    }
    
    public void button22Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[21], universe).setVisible(true);
    }
    
    public void button23Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[22], universe).setVisible(true);
    }
    
    public void button24Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[23], universe).setVisible(true);
    }
    
    public void button25Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[24], universe).setVisible(true);
    }
    
    public void button26Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[25], universe).setVisible(true);
    }
    
    public void button27Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[26], universe).setVisible(true);
    }
    
    public void button28Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[27], universe).setVisible(true);
    }
    
    public void button29Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[28], universe).setVisible(true);
    }
    
    public void button30Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[29], universe).setVisible(true);
    }
    
    public void button31Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[30], universe).setVisible(true);
    }
    
    public void button32Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[31], universe).setVisible(true);
    }
    
    public void button33Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[32], universe).setVisible(true);
    }
    
    public void button34Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[33], universe).setVisible(true);
    }
    
    public void button35Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[34], universe).setVisible(true);
    }
    
    public void button36Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[35], universe).setVisible(true);
    }
    
    public void button37Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[36], universe).setVisible(true);
    }
    
    public void button38Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[37], universe).setVisible(true);
    }
    
    public void button39Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[38], universe).setVisible(true);
    }
    
    public void button40Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[39], universe).setVisible(true);
    }
    
    public void button41Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[40], universe).setVisible(true);
    }
    
    public void button42Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[41], universe).setVisible(true);
    }
    
    public void button43Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[42], universe).setVisible(true);
    }
    
    public void button44Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[43], universe).setVisible(true);
    }
    
    public void button45Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[44], universe).setVisible(true);
    }
    
    public void button46Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[45], universe).setVisible(true);
    }
    
    public void button47Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[46], universe).setVisible(true);
    }
    
    public void button48Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[47], universe).setVisible(true);
    }
    
    public void button49Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[48], universe).setVisible(true);
    }
    
    public void button50Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[49], universe).setVisible(true);
    }
    
    public void button51Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[50], universe).setVisible(true);
    }
    
    public void button52Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[51], universe).setVisible(true);
    }
    
    public void button53Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[52], universe).setVisible(true);
    }
    
    public void button54Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[53], universe).setVisible(true);
    }
    
    public void button55Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[54], universe).setVisible(true);
    }
    
    public void button56Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[55], universe).setVisible(true);
    }
    
    public void button57Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[56], universe).setVisible(true);
    }
    
    public void button58Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[57], universe).setVisible(true);
    }
    
    public void button59Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[58], universe).setVisible(true);
    }
    
    public void button60Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[59], universe).setVisible(true);
    }
    
    public void button61Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[60], universe).setVisible(true);
    }
    
    public void button62Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[61], universe).setVisible(true);
    }
    
    public void button63Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[62], universe).setVisible(true);
    }
    
    public void button64Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[63], universe).setVisible(true);
    }
    
    public void button65Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[64], universe).setVisible(true);
    }
    
    public void button66Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[65], universe).setVisible(true);
    }
    
    public void button67Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[66], universe).setVisible(true);
    }
    
    public void button68Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[67], universe).setVisible(true);
    }
    
    public void button69Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[68], universe).setVisible(true);
    }
    
    public void button70Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[69], universe).setVisible(true);
    }
    
    public void button71Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[70], universe).setVisible(true);
    }
    
    public void button72Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[71], universe).setVisible(true);
    }
    
    public void button73Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[72], universe).setVisible(true);
    }
    
    public void button74Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[73], universe).setVisible(true);
    }
    
    public void button75Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[74], universe).setVisible(true);
    }
    
    public void button76Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[75], universe).setVisible(true);
    }
    
    public void button77Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[76], universe).setVisible(true);
    }
    
    public void button78Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[77], universe).setVisible(true);
    }
    
    public void button79Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[78], universe).setVisible(true);
    }
    
    public void button80Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[79], universe).setVisible(true);
    }
    
    public void button81Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[80], universe).setVisible(true);
    }
    
    public void button82Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[81], universe).setVisible(true);
    }
    
    public void button83Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[82], universe).setVisible(true);
    }
    
    public void button84Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[83], universe).setVisible(true);
    }
    
    public void button85Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[84], universe).setVisible(true);
    }
    
    public void button86Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[85], universe).setVisible(true);
    }
    
    public void button87Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[86], universe).setVisible(true);
    }
    
    public void button88Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[87], universe).setVisible(true);
    }
    
    public void button89Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[88], universe).setVisible(true);
    }
    
    public void button90Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[89], universe).setVisible(true);
    }
    
    public void button91Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[90], universe).setVisible(true);
    }
    
    public void button92Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[91], universe).setVisible(true);
    }
    
    public void button93Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[92], universe).setVisible(true);
    }
    
    public void button94Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[93], universe).setVisible(true);
    }
    
    public void button95Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[94], universe).setVisible(true);
    }
    
    public void button96Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[95], universe).setVisible(true);
    }
    
    public void button97Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[96], universe).setVisible(true);
    }
    
    public void button98Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[97], universe).setVisible(true);
    }
    
    public void button99Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[98], universe).setVisible(true);
    }
    
    public void button100Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[99], universe).setVisible(true);
    }
    
    public void button101Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[100], universe).setVisible(true);
    }
    
    public void button102Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[101], universe).setVisible(true);
    }
    
    public void button103Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[102], universe).setVisible(true);
    }
    
    public void button104Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[103], universe).setVisible(true);
    }
    
    public void button105Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[104], universe).setVisible(true);
    }
    
    public void button106Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[105], universe).setVisible(true);
    }
    
    public void button107Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[106], universe).setVisible(true);
    }
    
    public void button108Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[107], universe).setVisible(true);
    }
    
    public void button109Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[108], universe).setVisible(true);
    }
    
    public void button110Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[109], universe).setVisible(true);
    }
    
    public void button111Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[110], universe).setVisible(true);
    }
    
    public void button112Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[111], universe).setVisible(true);
    }
    
    public void button113Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[112], universe).setVisible(true);
    }
    
    public void button114Pressed(java.awt.event.ActionEvent evt) {
        new TravelWindow(universe.gameUniverse[113], universe).setVisible(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
