package minggu04;
public class MainP1 {
    public static void main(String[] args) {
        Processor p = new Processor("Inter i5", 3);
        Laptop l = new Laptop("Thinkpad", p);
        l.info();
        
        Processor p1 = new Processor();
        p1.setMerk("Intel i5");
        p1.setCache(4);
        Laptop l1 = new Laptop();
        l1.setMerk("Thinkpad");
        l1.setProc(p1);
        l1.info();
    }   
}