package info.android.ecommerce.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Product implements Parcelable {
    String name;
    ArrayList<String> color;
    String rating;
    String price;
    String description;
    String image;

    protected Product(Parcel in) {
        name = in.readString();
        color = in.createStringArrayList();
        rating = in.readString();
        price = in.readString();
        description = in.readString();
        image = in.readString();
    }

    public static final Creator<Product> CREATOR = new Creator<Product>() {
        @Override
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        @Override
        public Product[] newArray(int size) {
            return new Product[size];
        }
    };

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Product() {
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Product(ArrayList<String> color, String rating, String description, String name, String price, String image) {
        this.color = color;
        this.rating = rating;
        this.description = description;
        this.price = price;
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getColor() {
        return color;
    }

    public void setColor(ArrayList<String> color) {
        this.color = color;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeStringList(color);
        parcel.writeString(rating);
        parcel.writeString(price);
        parcel.writeString(description);
        parcel.writeString(image);
    }
}
