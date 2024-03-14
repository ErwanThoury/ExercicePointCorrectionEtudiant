package com.example.correctionpoint;

public class Point {
        private double x, y; // attributs de la classe
            public Point(double abscisse, double ordonnee) {
            this.x = abscisse;
            this.y = ordonnee;
        } // constructeur
        public static double alea(double inf, double sup) {
            double f = Math.random()/Math.nextDown(1.0);
            double nbAlea = inf*(1.0 - f) + sup*f;
            return nbAlea;
        }
        // rend un nombre entre inf et sup.
        public String affiche(){
            return "("+this.x+";"+this.y+")";
        } // retourne, sous forme de chaîne de caractères, les coordonnées du point. EXEMPLE : « (1;6) »
        public double affiche(Point p){
            double distanceX = this.x-p.getX();
            double distanceY = this.y-p.getY();
            return Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY,2));
        } // retourne, sous forme de double, la distance entre le point « ciblé » et le point en paramètre.

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}


