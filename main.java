static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         **************************************************
         * ENTRADA EJEMPLO: -3 8 9 40 8 9 -59 -122 369
         **************************************************
        */
        String ask;

        System.out.println("# Introduzca la secuencia: ");

        String[] lista = sc.nextLine().split(" ");
        Integer arr[] = new Integer[lista.length];

        for (int t = 0; t < arr.length; t++) {
            arr[t] = Integer.parseInt(lista[t]);
        }

        System.out.print("# Introduzca si es asc o des: ");
        for (int pos = 0; pos < arr.length; pos++) {
            ask = sc.nextLine();
            if (ask.equals("asc")) {
                Arrays.sort(arr);
                for (int t : arr) {
                    System.out.print(" " + t);
                }
                break;
            } else if (ask.equals("des")) {
                Arrays.sort(arr, Collections.reverseOrder());
                for(int j : arr){
                    System.out.print(" " + j);
                }
                break;
            }
        }
    }
