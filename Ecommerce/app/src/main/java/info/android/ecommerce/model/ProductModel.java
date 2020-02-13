package info.android.ecommerce.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;


public class ProductModel implements Parcelable {
    public ProductModel() {
    }

    private List<Product> products = null;

    protected ProductModel(Parcel in) {
    }

    public static final Creator<ProductModel> CREATOR = new Creator<ProductModel>() {
        @Override
        public ProductModel createFromParcel(Parcel in) {
            return new ProductModel(in);
        }

        @Override
        public ProductModel[] newArray(int size) {
            return new ProductModel[size];
        }
    };

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
    }
}

