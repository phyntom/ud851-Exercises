/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * We couldn't come up with a good name for this class. Then, we realized
 * that this lesson is about RecyclerView.
 * <p>
 * RecyclerView... Recycling... Saving the planet? Being green? Anyone?
 * #crickets
 * <p>
 * Avoid unnecessary garbage collection by using RecyclerView and ViewHolders.
 * <p>
 * If you don't like our puns, we named this Adapter GreenAdapter because its
 * contents are green.
 */
// COMPLETED (4) From GreenAdapter, extend RecyclerView.Adapter<NumberViewHolder>
public class GreenAdapter extends RecyclerView.Adapter<GreenAdapter.NumberViewHolder> {

    // COMPLETED (1) Add a private int variable called mNumberItems
    int mNumberItems;
    // COMPLETED (2) Create a constructor for GreenAdapter that accepts an int as a parameter for numberOfItems
    // COMPLETED (3) Store the numberOfItems parameter in mNumberItems

    public GreenAdapter(int numberOfItems) {
        mNumberItems = numberOfItems;
    }

    // COMPLETED (5) Override the onCreateViewHolder method
    // COMPLETED (6) Create and return a new NumberViewHolder within this method

    @Override
    public NumberViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.number_list_item,parent,false);
        return new NumberViewHolder(view);
    }

    // COMPLETED (7) Override onBindViewHolder
    // COMPLETED (8) Within onBindViewHolder, call holder.bind and pass in the position

    @Override
    public void onBindViewHolder(NumberViewHolder holder, int position) {
        holder.bind(position);
    }

    // COMPLETED (9) Override getItemCount and return the number of items to display


    @Override
    public int getItemCount() {
        return mNumberItems;
    }

    /**
     * Cache of the children views for a list item.
     */
    public class NumberViewHolder extends RecyclerView.ViewHolder {

        private TextView listItemNumberView;

        public NumberViewHolder(View view) {
            super(view);
            listItemNumberView = (TextView) view.findViewById(R.id.tv_item_number);
        }

        public void bind(int listIndex) {
            listItemNumberView.setText(String.valueOf(listIndex));
        }
    }
}
