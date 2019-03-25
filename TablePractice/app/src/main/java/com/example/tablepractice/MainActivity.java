package com.example.tablepractice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.TextView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainActivity extends AppCompatActivity {
    int i = 0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        final Connection serverConnection = getRemoteConnection();

        final Button getData = findViewById(R.id.getDataButton);
        final TextView getDataText = findViewById(R.id.dataText);
        getData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (serverConnection != null) {
                    try {
                        getDataText.setText((CharSequence) serverConnection.getClientInfo());
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                } else {
                    getDataText.setText("Server is Null");
                }
            }
        });
    }

    private static Connection getRemoteConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbName = "scouting";
            String userName = "dbeehler";
            String password = "DietCoke12#$";
            String hostname = "scoutingdb.cvwch2qajbty.us-east-2.rds.amazonaws.com";
            String port = "1433";
            String jdbcUrl = "jdbc:sqlserver://" + hostname + ":" + port + "/" + dbName + "?user=" + userName + "&password=" + password;
//          logger.trace("Getting remote connection with connection string from environment variables.");
            Connection con = DriverManager.getConnection(jdbcUrl);
//          logger.info("Remote connection successful.");
            return con;
//        } catch (ClassNotFoundException e) {
//      logger.warn(e.toString());
        } catch (SQLException e) {
//      logger.warn(e.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
