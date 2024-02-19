import
ublic class Sale {
        private Discount.Customer customer;
        private String date;
        private double serviceExpense;
        private double productExpense;

        public Sale(Discount.Customer customer, String date) {
            this.customer = customer;
            this.date = date;
        }

        public String getDate() {
            return date;
        }

        public double getServiceExpense() {
            return serviceExpense;
        }

        public void setServiceExpense(double serviceExpense) {
            this.serviceExpense = serviceExpense;
        }

        public double getProductExpense() {
            return productExpense;
        }

        public void setProductExpense(double productExpense) {
            this.productExpense = productExpense;
        }

        public double getTotalExpense() {
            double totalExpense = serviceExpense + productExpense;
            double discount = customer.getServiceMemberDiscount() * serviceExpense
                    + customer.getProductMemberDiscount() * productExpense;
            return totalExpense - discount;
        }

        public void displayInfo() {
            System.out.println("Customer: " + customer.getCustomerName());
            System.out.println("Date: " + date);
            System.out.println("Service Expense: $" + serviceExpense);
            System.out.println("Product Expense: $" + productExpense);
            System.out.println("Total Expense after Discount: $" + getTotalExpense());
            System.out.println();
        }
}
