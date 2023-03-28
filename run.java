
package pewarisan;

public class run {
    public static void main(String[] args) {
        boss boss = new boss();
        manager manager = new manager();
        officeboy ob = new officeboy();
        ojt ojt = new ojt();
        
        boss.cetak();
        System.out.println("");
        manager.cetak();
        System.out.println("");
        ob.cetak();
        System.out.println("");
        ojt.cetak();
    }
}
