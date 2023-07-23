package com.cebu.erid

class sample {
    Spinner dropdown = findViewById(R.id.spinner1);
    String[] items = new String[]{"1", "2", "3"};
    ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
    dropdown.setAdapter(adapter);
}