package org.example.e06oop;

public class AccessModifier {
    //퍼블릭은 메소드에서도 적을수 있음. 메소드, 필드 어디까지 공개할지 등등
    // default: 같은 패키지에 소속된 클래스에서만 접근 가능/ 퍼블릭이 없는 상태
    String strDefault = "default";

    // public: 클래스 내/외부 어디에서나 접근 가능
    public String strPublic = "Public";

    // private: 클래스 내부에서만 접근 가능
    private String strPrivate = "Private";

    // protected: 같은 패키지/ 클래스 내부/ 자식 클래스에서 접근 가능
    protected String strProtected = "Protected";

    void fnDefault(){
        System.out.println("Default Fn");
    }
    public void fnPublic(){
        System.out.println("Public Fn");
    }

    private void fnPrivate(){
        System.out.println("Private Fn");
    }

    protected void fnProtected(){
        System.out.println("Protected Fn");
    }
}
