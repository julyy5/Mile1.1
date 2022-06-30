public class main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 2640;
        int miles = service.calculate (price);
        System.out.println(miles);
    }
}