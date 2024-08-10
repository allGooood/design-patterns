package org.example.singleton;

public class Singleton {

    // 1. synchronized getter 사용 - 속도/성능 저하(속도 문제가 그리 중요하지 않다면 괜챃음)
//    private  static Singleton uniqueInstance;
//
//    //게으른 인스턴스 생성(lazy instantiation)
//    public static synchronized Singleton getInstance(){
//        if(uniqueInstance == null){
//            uniqueInstance = new Singleton();
//        }
//        return uniqueInstance;
//    }


    // 2. 정적 인스턴스 처음부터 만들기
//    private static Singleton uniqueInstance = new Singleton();
//
//    private Singleton(){
//
//    }
//
//    public static Singleton getInstance(){
//        return uniqueInstance;
//    }


    // 3. DCL(Double-Checked Locking) 사용 - 자바 5 이상에서만 사용 가능
    private volatile static Singleton getUniqueInstance;
    private Singleton(){

    }

    public static Singleton getInstance(){
        if(getUniqueInstance == null){
            // 처음에만 동기화
            synchronized (Singleton.class){
                // 다시 한 번 null check.
                if(getUniqueInstance == null){
                    getUniqueInstance = new Singleton();
                }
            }
        }
        return getUniqueInstance;
    }

}





























