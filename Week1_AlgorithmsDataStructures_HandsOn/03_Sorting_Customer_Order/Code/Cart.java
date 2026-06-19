public class Cart {

    private Order[] orders = new Order[10];

    public void shuffleOrders() {

        String[] names = {
                "Sakthivel", "John", "Leo", "Steve", "Nancy",
                "William", "Shakespeare", "Nolan", "Wick", "Potter"
        };

        int[] amounts = {
                2043, 2442, 1333, 8984, 4545,
                7954, 2312, 9535, 8972, 2411
        };

        for (int i = 0; i < orders.length; i++) {
            orders[i] = new Order(i + 1, names[i], amounts[i]);
        }
    }

    public Order[] getOrders() {
        return orders;
    }

    public void displayOrders(Order[] orderList) {

        for (Order order : orderList) {
            System.out.println(order);
        }
    }

    public void bubbleSort(Order[] orderList) {

        for (int pass = 0; pass < orderList.length - 1; pass++) {

            for (int current = 0; current < orderList.length - pass - 1; current++) {

                if (orderList[current].getTotalPrice() >
                        orderList[current + 1].getTotalPrice()) {

                    Order temp = orderList[current];
                    orderList[current] = orderList[current + 1];
                    orderList[current + 1] = temp;
                }
            }
        }
    }

    public void quickSort(Order[] orderList, int start, int end) {

        if (start < end) {

            int pivotIndex = divide(orderList, start, end);

            quickSort(orderList, start, pivotIndex - 1);
            quickSort(orderList, pivotIndex + 1, end);
        }
    }

    private int divide(Order[] orderList, int start, int end) {

        int pivotValue = orderList[end].getTotalPrice();
        int smallerElementIndex = start - 1;

        for (int i = start; i < end; i++) {

            if (orderList[i].getTotalPrice() < pivotValue) {

                smallerElementIndex++;

                Order temp = orderList[smallerElementIndex];
                orderList[smallerElementIndex] = orderList[i];
                orderList[i] = temp;
            }
        }

        Order temp = orderList[smallerElementIndex + 1];
        orderList[smallerElementIndex + 1] = orderList[end];
        orderList[end] = temp;

        return smallerElementIndex + 1;
    }
}