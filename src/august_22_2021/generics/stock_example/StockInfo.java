package august_22_2021.generics.stock_example;

public interface StockInfo<T extends Stock> {

    T getStock();

    int getNAV();

    default int getYear() {
        return 2000;
    }

}
