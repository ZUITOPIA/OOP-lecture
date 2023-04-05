class PenUser {
    public static void main (String[] args){
        System.out.println("Hello Pen!");

        Pen mypen1 = new Pen();
        mypen1.write();

        Pen mypen2 = new Pen("JUHEE KO");
        mypen2.write();

        Pen mypen3 = new Pen(1000);
        mypen3.write();

        Pen mypen4 = new Pen("JUHEE KO", "green", 100);
        mypen4.write();
    }
}