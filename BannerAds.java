private boolean isAdMOb = false;
private Method method;
LinearLayout linearLayout;
private AdManagerAdView mAdManagerAdView;

AdView mAdView = new AdView(this);
        mAdView.setAdSize(AdSize.BANNER);
        mAdView.setAdUnitId(Constant.aboutUsList.getBanner_ad_id());
        linearLayout= (LinearLayout) findViewById(R.id.adView);
        if (!Constant.aboutUsList.isBanner_ad()) {
            linearLayout.setVisibility(View.GONE);
        }else {
            AdRequest adRequest = new AdRequest.Builder().build();
            if (mAdView.getAdSize() != null || mAdView.getAdUnitId() != null)
                mAdView.loadAd(adRequest);
            ((LinearLayout) findViewById(R.id.adView)).addView(mAdView);
        }
