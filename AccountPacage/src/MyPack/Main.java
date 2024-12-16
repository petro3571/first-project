

class AccountBalance {
    public static void main (String[] args) {
        Balance[] current = new Balance [3];

        current [0] = new Balance ("Димасик",28.23);
        current [1] = new Balance ("Александр", 36.24);
        current [2] = new Balance("Ника", 35.25 );

        for (int i = 0;i<3;i++) {
            current[i].show();
        }
    }
}