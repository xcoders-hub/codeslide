start2.setOnClickListener(new View.OnClickListener() { // start2 id in xml layout
            @Override
            public void onClick(View v)
            {
                Intent start2Intent = new Intent( Mainactivity2.this, menu_prediction.class);
                 Mainactivity2.this.startActivity(start2Intent);
            }

        });
