/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JFrame;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author mamir
 */
public class FrameSwitcher {
    public int previousFrame;
    private JFrame nowFrame;

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrameSwitcher switcher = new FrameSwitcher();
            }
        });
    }

    public FrameSwitcher() {
        previousFrame = 0;
        nowFrame = new Frame1(this);
        nowFrame.setVisible(true);
    }

    public void changeView(int next) {
        nowFrame.setVisible(false);
        nowFrame.dispose();
        switch (next) {
            case 1:
                nowFrame = new Frame1(this);
                break;
            case 2:
                nowFrame = new Frame2(this);
                break;
            case 3:
                nowFrame = new Frame3(this);
                break;
            case 4:
                nowFrame = new Frame4(this);
                break;
            case 5:
                nowFrame = new Frame5(this);
                break;
            case 6:
                nowFrame = new Frame6(this);
                break;
            case 7:
                nowFrame = new Frame7(this);
                break;
            case 8:
                nowFrame = new Frame8(this);
                break;
            case 9:
                nowFrame = new Frame9(this);
                break;
            case 10:
                nowFrame = new Frame10(this);
                break;
        }
        nowFrame.setVisible(true);

    }
}
