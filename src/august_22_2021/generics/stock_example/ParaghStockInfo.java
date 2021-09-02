package august_22_2021.generics.stock_example;

public class ParaghStockInfo implements StockInfo<ParaghStock>{
    @Override
    public ParaghStock getStock() {
        return null;
    }

    @Override
    public int getNAV() {
        return 0;
    }
}
