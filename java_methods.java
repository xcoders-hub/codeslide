public void myStartActivity(Intent intent) {
        AdsFullScreen adsFullScreen2 = this.adsFullScreen;
        if (adsFullScreen2 == null || this.frameLayoutCustomAd == null) {
            startActivity(intent);
        } else {
            adsFullScreen2.showFullAd(intent);
        }
    }
