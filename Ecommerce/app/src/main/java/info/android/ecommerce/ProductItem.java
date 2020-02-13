package info.android.ecommerce;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import info.android.ecommerce.model.Product;

public class ProductItem extends AppCompatActivity {
    private TextView name, rating, price, color, description;
    private ImageView imageView;
    private String ratingStar = "* * * * *";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_item);
        Product product = getIntent().getParcelableExtra("product");
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle(product.getName());
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimaryDark)));
        }
        name = findViewById(R.id.textViewName);
        rating = findViewById(R.id.textViewRating);
        description = findViewById(R.id.textViewDescription);
        color = findViewById(R.id.textViewColor);
        price = findViewById(R.id.textViewPrice);
        imageView = findViewById(R.id.image_view1);
        Glide.with(getApplicationContext())
                .load(product.getImage())
                .into(imageView);
        name.setText(product.getName());
        price.setText("₹ " + product.getPrice());
        rating.setText(ratingStar + " " + product.getRating() + "  ratings");
        description.setText(product.getDescription());
        color.setText("Color Count : " + product.getColor().size());
    }
}
