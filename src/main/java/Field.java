public class Field {
    private CropRow[] cropRows;

    public CropRow[] getCropRows() {
        return cropRows;
    }

    public Field() {
        this.cropRows = new CropRow[5];
    }
}
