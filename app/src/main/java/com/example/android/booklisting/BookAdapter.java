package com.example.android.booklisting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class BookAdapter extends ArrayAdapter<Book> {

    public BookAdapter(Context context, List<Book> books) {
        super(context, 0, books);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link currentBook} object located at this position in the list
        Book currentBook = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID title.
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);

        // Get the version name from the current Book object and
        // set this text on the Title TextView
        titleView.setText(currentBook.getTitle());

        // Find the TextView in the list_item.xml layout with the ID author.
        TextView authorView = (TextView) listItemView.findViewById(R.id.author);
        // Get the version name from the current Book object and
        // set this text on the Author TextView
        authorView.setText(currentBook.getAuthors());

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}
