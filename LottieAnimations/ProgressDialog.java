package com.kdapps.videoplayer.hdmaxplayer.video.player.Dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.content.res.AppCompatResources;

import com.kdapps.videoplayer.hdmaxplayer.video.player.R;

import java.util.Objects;

public class ProgressDialog {
    private Activity activity;
    private boolean cancelable;
    private int titleColor;
    private String titleDone;
    private String titleLoading;

    public ProgressDialog(Builder builder) {
        this.titleLoading = builder.titleLoading;
        this.activity = builder.activity;
        this.titleColor = builder.titleColor;
        this.cancelable = builder.cancelable;
    }

    public static class Builder {
        private Activity activity;
        private boolean cancelable = true;
        private Dialog dialog;
        private int doneGifID;
        private String doneTitle;
        private int loadingGifID;
        private int titleColor;
        private String titleLoading;
        private TextView tvTitle;

        public Builder(Activity activity) {
            this.activity = activity;
        }

        public ProgressDialog build() {
            TextView textView;
            Dialog dialog;
            this.dialog = dialog = new Dialog((Context)this.activity);
            dialog.requestWindowFeature(1);
            Objects.requireNonNull(this.dialog.getWindow()).setBackgroundDrawable((Drawable)new ColorDrawable(0));
            this.dialog.setCancelable(this.cancelable);
            this.dialog.setContentView(R.layout.progress_dialog2);
            this.tvTitle = textView = (TextView)this.dialog.findViewById(R.id.tv_title);
            String string2 = this.titleLoading;
            if (string2 != null) {
                if (!string2.equals((Object)"")) {
                    this.tvTitle.setVisibility(View.VISIBLE);
                    this.tvTitle.setText((CharSequence)this.titleLoading);
                    int n2 = this.titleColor;
                    if (n2 != 0) {
                        this.tvTitle.setTextColor(AppCompatResources.getColorStateList((Context)this.activity, (int)n2));
                    }
                } else {
                    this.tvTitle.setVisibility(View.GONE);
                }
            } else {
                textView.setVisibility(View.GONE);
            }
            if (!this.dialog.isShowing()) {
                this.dialog.show();
            }
            return new ProgressDialog(this);
        }

        public void clear() {
            String string2 = this.doneTitle;
            if (string2 != null) {
                if (!string2.equals((Object)"")) {
                    this.tvTitle.setText((CharSequence)this.doneTitle);
                }
            } else {
                this.tvTitle.setText((CharSequence)"Done");
            }
            if (this.dialog.isShowing()) {
                this.dialog.dismiss();
            }
        }

        public boolean isLoading() {
            return this.dialog.isShowing();
        }

        public Builder setCancelable(boolean bl) {
            this.cancelable = bl;
            return this;
        }

        public Builder setDoneGif(int n2) {
            this.doneGifID = n2;
            return this;
        }

        public Builder setDoneTitle(String string2) {
            this.doneTitle = string2;
            return this;
        }

        public Builder setLoadingGif(int n2) {
            this.loadingGifID = n2;
            return this;
        }

        public Builder setLoadingTitle(String string2) {
            this.titleLoading = string2;
            return this;
        }

        public Builder setTitleColor(int n2) {
            this.titleColor = n2;
            return this;
        }
    }

}


