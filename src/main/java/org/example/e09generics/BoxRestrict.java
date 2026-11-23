package org.example.e09generics;

public class BoxRestrict<T extends App & Goods> {
    public T media;
    //App을 상속받고있는 제너릭들만 올수있다.

}
