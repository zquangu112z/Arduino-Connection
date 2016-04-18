/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialconsole;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.*; 
import java.util.Random;

/**
 *
 * @author Ngu
 */
public class PointGroup extends Frame implements Runnable{

    //color 
    Color[] mColors = {Color.BLACK, Color.BLUE, Color.CYAN, Color.GRAY, Color.ORANGE, Color.YELLOW, Color.PINK};

    //kích thước box
    private static final int BOX_WIDTH = 320;
    private static final int BOX_HEIGHT = 480;
    //vẽ lại ball
    Thread mThread;

    //mảng Ball
    Point[] mBalls;

//số lượng ball
    int numberBall;
    
    
    int mouseSpeed=0;
    int bar_left=70;
    int bar_top=430;
    int bar_width=180;
    int bar_height=50;

    public PointGroup() {
        /**
         * Frame
         */
        setResizable(false);
        setTitle("BallCollusion");
        setBounds(10, 10, BOX_WIDTH, BOX_HEIGHT);
        //setSize(BOX_WIDTH, BOX_HEIGHT);
        setVisible(true);
        //exit 
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        /**
         * init Ball[10]
         */
        //this.numberBall = number;
        mBalls = new Point[numberBall];
        for (int i = 0; i < mBalls.length; i++) {
            //color
            mBalls[i] = new Point();
            mBalls[i].setBall_color(getRandom(mColors));
            //first dimension
            mBalls[i].setBall_x(getRandom(200, 10));
            mBalls[i].setBall_y(getRandom(200, 50));
            //radius
            mBalls[i].setBall_radius(getRandom(50, 20));
            //speed
            mBalls[i].setBall_speed_x(getRandom(30, 5));
            mBalls[i].setBall_speed_y(mBalls[i].getBall_speed_x());
        }
        
        /**
         * repaint();
         */
        mThread = new Thread(this);
        mThread.start();
    }

    public void paint(Graphics graphics) {
        try {
            for (int i = 0; i < numberBall; i++) {

                graphics.setColor(mBalls[i].getBall_color());
                int x = mBalls[i].getBall_x();
                int y = mBalls[i].getBall_y();
                int radius = mBalls[i].getBall_radius();
                graphics.fillOval(x, y, radius, radius);

            }
            
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

    @Override
    public void run() {
        while (true) {
        }
    }
    /**
     *
     * @param array
     * @return Color.
     */
    public static Color getRandom(Color[] array) {
        int index = new Random().nextInt(array.length);
        return array[index];
    }

    /**
     * @param max
     * @param min
     * @return int
     */
    public static int getRandom(int max, int min) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
    
    public static void main(String[] args) {
        new PointGroup();
    }
}
