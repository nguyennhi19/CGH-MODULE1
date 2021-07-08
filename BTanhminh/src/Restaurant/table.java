package Restaurant;

class Table {
    private static boolean emptyTable;

    public Table() {

    }

    public Table(boolean emptyTable) {
        this.emptyTable = emptyTable;
    }

    public static boolean isEmptyTable() {
        return emptyTable;
    }

    public void bookOrder(Table table) {
        emptyTable = true;
    }

    public void releaseOrder(Table table) {
        emptyTable = false;
    }
}
