package com.example.foodapplication;

        import android.content.ContentValues;
        import android.content.Context;
        import android.database.Cursor;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;
        import android.graphics.drawable.Drawable;

        import androidx.annotation.Nullable;

        import java.util.ArrayList;


public class Database extends SQLiteOpenHelper {

    // static variable
    private static final int DB_VERSION = 1;

    // Database name
    private static final String DB_NAME = "Food.db";
    private static final String TABLE_NAME = "product";

    // column tables
    private static final String ID = "id";
    private static final String JUDUL = "judul";
    private static final String DESKRIPSI = "deskripsi";
    private static final String HARGA = "harga";
    private static final String IMG = "image";



    public Database(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String CREATE_FOODS_TABLE = "CREATE TABLE " + TABLE_NAME + "("
                + ID + " INTEGER PRIMARY KEY," + JUDUL + " TEXT," + DESKRIPSI + " TEXT," + HARGA + " INTEGER"
                + IMG + "INTEGER" + ")";
        sqLiteDatabase.execSQL(CREATE_FOODS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    public void InsertData(Food product){
        SQLiteDatabase db  = getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(JUDUL, product.judul);
        values.put(DESKRIPSI, product.deskripsi);
        values.put(IMG, product.img);
        values.put(HARGA, product.harga);

        db.insert(TABLE_NAME, null, values);
        db.close();
    }

    public ArrayList<Food> getFoods(Context context) {

        ArrayList<Food> foodList = new ArrayList<Food>();

        String Query = "SELECT  * FROM " + TABLE_NAME;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(Query, null);

        if (cursor.moveToFirst()) {
            do {

                String judul = cursor.getString(1);
                String deskripsi = cursor.getString(2);
                int harga = cursor.getInt(3);
                Drawable image = context.getDrawable(cursor.getInt(4));
                int imgInt = cursor.getInt(4);

                Food product = new Food(judul,deskripsi,harga,image,imgInt);

                foodList.add(product);

            } while (cursor.moveToNext());
        }
        return foodList;
    }
}