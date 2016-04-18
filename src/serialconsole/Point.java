/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialconsole;

import java.awt.Color;

/**
 *
 * @author Ngu
 */
public class Point {
    //tọa độ ban đầu    
    private int point_x;
    private int point_y;
    //bán kính
    private int point_radius;
    //speed
    private int point_speed_x;
    private int point_speed_y;
    //color
    private Color point_color;

    public Point(int point_x, int point_y, int point_radius, Color point_color) {
        this.point_x = point_x;
        this.point_y = point_y;
        this.point_radius = point_radius;
        this.point_color = point_color;
    }

    public Color getPoint_color() {
        return point_color;
    }

    public void setPoint_color(Color point_color) {
        this.point_color = point_color;
    }
    

    public int getPoint_x() {
        return point_x;
    }

    public void setPoint_x(int point_x) {
        this.point_x = point_x;
    }

    public int getPoint_y() {
        return point_y;
    }

    public void setPoint_y(int point_y) {
        this.point_y = point_y;
    }

    public int getPoint_radius() {
        return point_radius;
    }

    public void setPoint_radius(int point_radius) {
        this.point_radius = point_radius;
    }

    public int getPoint_speed_x() {
        return point_speed_x;
    }

    public void setPoint_speed_x(int point_speed_x) {
        this.point_speed_x = point_speed_x;
    }

    public int getPoint_speed_y() {
        return point_speed_y;
    }

    public void setPoint_speed_y(int point_speed_y) {
        this.point_speed_y = point_speed_y;
    }
}
