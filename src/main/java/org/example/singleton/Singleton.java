package org.example.singleton;

public class Singleton {
    private  static Singleton uniqueInstance;

    //기타 인스턴스 변수

    //게으른 인스턴스 생성(lazy instantiation)
    public static Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    //기타 메소드
}
