package com.company;

public class Rectangle {
    public float width;
    public float length;
    public void Set(){
        if(width<0 && width>20 && length <0 && length>20){
            System.out.println("program cannot start");

        }
    }
public Rectangle(){}
public float Area (){
    float area=width*length;
    return area;
}
public float Permitter (){
    float permitter=(width+length)*2;
    return permitter;
}
public void answer(){
    System.out.format("the answers are"+Area(),+Permitter());
}


}
