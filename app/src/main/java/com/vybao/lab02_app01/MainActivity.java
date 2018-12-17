package com.vybao.lab02_app01;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String arr[]={"My","Name","Is","Bao"};

        ListView lv = (ListView)findViewById(R.id.lvPerson);

        ArrayAdapter<String>myadapter =
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr);
        lv.setAdapter(myadapter);

        final TextView txtView  = (TextView)findViewById(R.id.txtSelected);

        lv.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        txtView.setText("index :" + position + "; value :" + arr[position] + "!!!"  );

                    }
                }
        );
    }
}
