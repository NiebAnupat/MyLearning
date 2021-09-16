public class MethodReturn {
    public static void main(String[] args) {
        ConnectServer(300);
    }

    static void ConnectServer(int ping) {

        // เมื่อใช้คำสั่ง return; จะออกจาก Method โดยจะไม่ทำคำสั่งหลังจากนั้น
        System.out.println("Ping = " + ping);
        if (ping > 100) return;
        System.out.println("Connected........");
    }
}
