public void myStartActivity(Intent intent) {
        AdsFullScreen adsFullScreen2 = this.adsFullScreen;
        if (adsFullScreen2 == null || this.frameLayoutCustomAd == null) {
            startActivity(intent);
        } else {
            adsFullScreen2.showFullAd(intent);
        }
    }

//pass data to another acitvity
boolean isTrending = getIntent().getBooleanExtra("isTrending", false);
        if(isTrending) {
        // Code Goes Here
        }
Intent trend = new Intent(Saxphome.this, HomeActivity.class);
                                                                                      
trend.putExtra("isTrending", true);
                                                                                      
startActivity(trend);
