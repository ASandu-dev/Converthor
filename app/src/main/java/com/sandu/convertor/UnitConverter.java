package com.sandu.convertor;

public class UnitConverter {
    public static double kilometri2Mile(double g){
        return g*0.621371192;
    }
    public static double kilometri2Metri(double g){
        return g*1000;
    }
    public static double kilometri2Feet(double g){
        return g*3280.8399;
    }
    public static double kilometri2Yard(double g){
        return g*1093.6133;
    }
    public static double kilometri2Centimetri(double g){
        return g*100000;
    }
    public static double kilometri2Inch(double g){
        return g*39370.0787;
    }

    public static double mile2Kilometri(double b){
        return b*1.609344;
    }
    public static double mile2Metri(double b){
        return b*1609.344;
    }
    public static double mile2Feet(double b){
        return b*5280;
    }
    public static double mile2Yarzi(double b){
        return b*1760;
    }
    public static double mile2Centimetri(double b){
        return b*160934.4;
    }
    public static double mile2Inch(double b){
        return b*63360;
    }

    public static double metri2Feet(double c){
        return c*3.2808;
    }
    public static double metri2Kilometri(double c){
        return c/1000;
    }
    public static double metri2Mile(double c){
        return c*0.000621371192;
    }
    public static double metri2Centimetri(double c){
        return c*100;
    }
    public static double metri2Inch(double c){
        return c*39.3700787;
    }
    public static double metri2Yard(double e){
        return e*1.093613;
    }

    public static double feet2Kilometri(double c){
        return c*0.0003048;
    }
    public static double feet2Miles(double c){
        return c*0.000189393939;
    }
    public static double feet2Metri(double d){
        return d/3.2808;
    }
    public static double feet2Yard(double f){
        return f*0.333333333;
    }
    public static double feet2Centimeters(double f){
        return f*30.48;
    }
    public static double feet2Inch(double f){
        return f*12;
    }


    public static double yard2Kilometri(double f){
        return f/1093.6133;
    }
    public static double yard2Mile(double f){
        return f/1760;
    }
    public static double yard2Metri(double f){
        return f/1.093613;
    }
    public static double yard2Feet(double f){
        return f/0.333333333;
    }
    public static double yard2Centimetri(double f){
        return f*91.44;
    }
    public static double yard2Inch(double f){
        return f*36;
    }

    public static double cm2Kilometri(double c){return c/100000;}
    public static double cm2Mile(double c){return c/160934.4;}
    public static double cm2Metri(double c){return c/100;}
    public static double cm2Feet(double c){return c/30.48;}
    public static double cm2Yard(double c){return c/91.44;}
    public static double cm2Inch(double c){return c*0.393700787;}

    public static double inch2Kilometeri(double c){return c/39370.0787;}
    public static double inch2Mile(double c){return c/63360;}
    public static double inch2Metri(double c){return c/39.3700787;}
    public static double inch2Feet(double c){return c/12;}
    public static double inch2Centimetri(double c){return c/0.393700787;}
    public static double inch2Yard(double c){return c/36;}

}
