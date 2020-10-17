package com.thowo.bmd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.thowo.jmandroidframework.component.JMAnActivity;
import com.thowo.jmandroidframework.component.JMAnListAdapter;
import com.thowo.jmjavaframework.table.JMRow;
import com.thowo.jmjavaframework.table.JMTable;

import java.util.List;

public class ListInventarisActivity extends JMAnActivity {
    private ListView lInv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_inventaris);
        this.lInv=(ListView) this.findViewById(R.id.lvInv);
        JMTable tbl=JMTable.create("select * from tb_inventaris",JMTable.DBTYPE_MYSQL);
        List<JMRow> rows=tbl.getAllRows();
        this.lInv.setAdapter(JMAnListAdapter.create(this,R.layout.list_inventaris,rows,""));
    }
}