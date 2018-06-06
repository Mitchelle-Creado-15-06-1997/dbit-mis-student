package com.dev2qa.java.jdbc;

import android.support.v7.app.AppCompatActivity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main extends AppCompatActivity {

    public Main(Main main) {

    }

    public void main(String[] args) throws SQLException {

        PostgresHelper client = new PostgresHelper(
                DbContract.HOST,
                DbContract.DB_NAME,
                DbContract.USERNAME,
                DbContract.PASSWORD);


        try {
            if (client.connect()) {
                System.out.println("DB connected");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        ResultSet rs = client.execQuery("SELECT * FROM attendance");

//        ArrayList<String> Id = new ArrayList<String>();
//        ArrayList<String> Name = new ArrayList<String>();
//        ArrayList<String> MailId = new ArrayList<String>();
//        ArrayList<String> Age = new ArrayList<String>();
//        Main controllerdb = new Main(this);
//        SQLiteDatabase db;
//        db = controllerdb.getReadableDatabase();
//        Cursor cursor = db.rawQuery("SELECT * FROM  attendance",null);
//        Id.clear();
//        Name.clear();
//        MailId.clear();
//        Age.clear();
//        if (cursor.moveToFirst()) {
//            do {
//                Id.add(cursor.getString(cursor.getColumnIndex("Id")));
//                Name.add(cursor.getString(cursor.getColumnIndex("Username")));
//                MailId.add(cursor.getString(cursor.getColumnIndex("Mailid")));
//                Age.add(cursor.getString(cursor.getColumnIndex("Age")));
//            } while (cursor.moveToNext());
//        }
//
//        //code to set adapter to populate list
//        cursor.close();
//
//
//        Intent i = new Intent(Main.this, AttendanceFragment.class);
//        Bundle b = new Bundle();
//        b.putString("id",id);
//
//


//        i.putExtras(b);

//        startActivity(i);

//        while(rs.next()) {
//

//            System.out.printf("%d\t%s\t%s\t%d\n",
//                    rs.getInt(1),
//                    rs.getString(2),
//                    rs.getString(3),
//                    rs.getInt(4));
//        }

    }

}