class Marker {
    String marker;
    String brand;
    String type;
    double price;
    String color;

    
    Marker(String marker, String brand, String type, double price, String color) {
        this.marker = marker;
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.color = color;
    }

    
    Marker(Marker other) {
        this.marker = other.marker;
        this.brand = other.brand;
        this.type = other.type;
        this.price = other.price;
        this.color = other.color;
    }

    
    void display() {
        System.out.println(marker + "  " + brand + "  " + type + "  " + price + "  " + color);
    }
}

public class MarkerSortByColor {
    
    public static void insertionSortByColor(Marker[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Marker key = new Marker(arr[i]); // Use copy constructor
            int j = i - 1;

            while (j >= 0 && arr[j].color.compareTo(key.color) < 0) {
                arr[j + 1] = new Marker(arr[j]); // Copy constructor
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Marker[] markers = {
            new Marker("M1", "Camlin", "Permanent", 15.5, "red"),
            new Marker("M2", "Faber", "Whiteboard", 10.0, "green"),
            new Marker("M3", "Reynolds", "Sketch", 12.5, "black"),
            new Marker("M4", "Luxor", "Highlighter", 14.0, "blue"),
            new Marker("M5", "Classmate", "Permanent", 9.5, "orange")
        };

        insertionSortByColor(markers);

        System.out.println("Markers sorted by color (descending):");
        for (Marker m : markers) {
            m.display();
        }
    }
}
