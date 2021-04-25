public class Live_chart_match extends AppCompatActivity implements FragmentDrawer.FragmentDrawerListener{

    private WebView simplewebView;
    public ViewPager viewPager;
    FloatingActionButton foting;
    private Toolbar mToolbar;
    private FragmentDrawer drawerFragment;
    private ActionBar actionBar;
    FrameLayout ly;
    ImageView draw_image;
    InterstitialAd mInterstitial;
    AdView adView;
    Runnable refresh;
    public static final String ADMOB_ID_BANNER = "ca-app-pub-99729##########2/60#########";
    private final Handler handler = new Handler();

        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.live_chart_webview);
            mToolbar = (Toolbar) findViewById(R.id.toolbar);
            foting = (FloatingActionButton) findViewById(R.id.fab);
            setSupportActionBar(mToolbar);

            String url = "https://driveup.in/page/privacy-policy";
            simplewebView = (WebView) findViewById(R.id.simpleWebView);
            simplewebView.getSettings().setJavaScriptEnabled(true);
            simplewebView.loadUrl(url);
            simplewebView.setWebViewClient(new WebViewClient() {
                public boolean shouldOverrideUrlLoading(WebView viewx, String urlx) {
                    viewx.loadUrl(urlx);
                    return false;
                }
            });
        }
