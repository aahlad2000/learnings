package august_22_2021.generics.stock_example;

public class ICICIStockInfo implements StockInfo<ICICIStock> {
    @Override
    public ICICIStock getStock() {
        return new ICICIStock();
    }

    @Override
    public int getNAV() {
        return 1;
    }
}
