package info.androidhive.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

import info.androidhive.foodorderapp.Adapters.OrdersAdapter;
import info.androidhive.foodorderapp.Models.OrdersModel;
import info.androidhive.foodorderapp.databinding.ActivityOrderBinding;

public class OrderActivity extends AppCompatActivity {

    ActivityOrderBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<OrdersModel> list = new ArrayList<>();
        list.add(new OrdersModel(R.drawable.burger1,"Cheese Burger", "4","112456732"));
        list.add(new OrdersModel(R.drawable.burger1,"Cheese Burger", "4","112456732"));
        list.add(new OrdersModel(R.drawable.burger1,"Cheese Burger", "4","112456732"));
        list.add(new OrdersModel(R.drawable.burger1,"Cheese Burger", "4","112456732"));
        list.add(new OrdersModel(R.drawable.burger1,"Cheese Burger", "4","112456732"));
        list.add(new OrdersModel(R.drawable.burger1,"Cheese Burger", "4","112456732"));
        list.add(new OrdersModel(R.drawable.burger1,"Cheese Burger", "4","112456732"));
        list.add(new OrdersModel(R.drawable.burger1,"Cheese Burger", "4","112456732"));
        list.add(new OrdersModel(R.drawable.burger1,"Cheese Burger", "4","112456732"));

        OrdersAdapter adapter = new OrdersAdapter(list,this);
        binding.orderRecyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.orderRecyclerView.setLayoutManager(layoutManager);

    }
}