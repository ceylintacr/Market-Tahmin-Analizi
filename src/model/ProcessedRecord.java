package model;

public class ProcessedRecord {

    private final double[] features;
    private final String label;

    public ProcessedRecord(double[] features, String label) {
        if (features == null || features.length == 0) {
            throw new IllegalArgumentException("Özellikler null veya boş olamaz.");
        }
        if (label == null || label.isBlank()) {
            throw new IllegalArgumentException("Etiket null veya boş olamaz.");
        }
        this.features = features.clone();
        this.label = label;
    }

    public double[] getFeatures() {
        return features.clone();
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("İşlenmişVeri{features=[");
        for (int i = 0; i < features.length; i++) {
            sb.append(String.format("%.4f", features[i]));
            if (i < features.length - 1)
                sb.append(", ");
        }
        sb.append("], label='").append(label).append("'}");
        return sb.toString();
    }
}