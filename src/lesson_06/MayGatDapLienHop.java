package lesson_06;

public class MayGatDapLienHop {

    public void catLua(String caylua){
        System.out.println("Dang cat " + caylua);
    }

    public void xayLua(String hatlua){
        System.out.println("Dang xay " + hatlua);
    }

    public static void main(String[] args) {
        MayGatDapLienHop mayGatDapLienHop = new MayGatDapLienHop();
        mayGatDapLienHop.catLua("Cay lua");
        mayGatDapLienHop.xayLua("Hat lua");
    }
}
