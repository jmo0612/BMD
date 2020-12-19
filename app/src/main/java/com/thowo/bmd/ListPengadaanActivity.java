package com.thowo.bmd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.thowo.bmd.util.QueryHelperPersediaan;
import com.thowo.jmandroidframework.component.JMAnActivity;
import com.thowo.jmandroidframework.component.JMAnListAdapter;
import com.thowo.jmjavaframework.db.JMResultSetStyle;
import com.thowo.jmjavaframework.table.JMRow;
import com.thowo.jmjavaframework.table.JMTable;

import java.util.List;

public class ListPengadaanActivity extends JMAnActivity {
    private ListView lPengadaan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pengadaan);
        this.lPengadaan=(ListView) this.findViewById(R.id.lvPengadaan);
        JMTable tbl=JMTable.create(QueryHelperPersediaan.qListPengadaan.replace("[TAHUN]",String.valueOf(Global.getCurrentYear())),JMTable.DBTYPE_MYSQL);
        tbl.getStyle()
                .setFormat(13, JMResultSetStyle.FORMAT_DOUBLE_CURRENCY,null)
                .setFormat(3,JMResultSetStyle.FORMAT_DATE_CUSTOM,new String[]{JMResultSetStyle.PARAM_DATE_WEEKDAY_SHORT+", "+JMResultSetStyle.PARAM_DATE_DAY_LONG+"-"+JMResultSetStyle.PARAM_DATE_MONTH_SHORT+"-"+JMResultSetStyle.PARAM_DATE_YEAR_LONG});
        tbl.refresh();
        List<JMRow> rows=tbl.getAllRows();
        this.lPengadaan.setAdapter(JMAnListAdapter.create(this,R.layout.list_pengadaan,rows,""));
    }
}