package com.discord.socialsdk;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import defpackage.fq3;
import defpackage.w57;
import defpackage.yu5;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class AuthenticationActivity extends Activity {
    private static final String CALLBACK_PATH = "/authorize/callback";
    private static final String CALLBACK_SCHEME_PREFIX = "discord-";
    private static AuthenticationClientCallback currentCallback;
    private boolean completed = false;
    private boolean hasResumedBefore = false;
    private AuthenticationClientCallback nativeCallback;

    public static void authorize(Activity activity, String str, AuthenticationClientCallback authenticationClientCallback) {
        AuthenticationClientCallback authenticationClientCallback2 = currentCallback;
        if (authenticationClientCallback2 != null) {
            authenticationClientCallback2.onAuthorizationComplete("canceled", "", "");
        }
        currentCallback = authenticationClientCallback;
        Intent intent = new Intent(activity, (Class<?>) AuthenticationActivity.class);
        intent.setData(Uri.parse(str));
        activity.startActivity(intent);
    }

    private boolean handleIntentReceived(Intent intent) {
        Uri data = intent.getData();
        if (data == null || this.completed || data.getScheme() == null || !data.getScheme().startsWith(CALLBACK_SCHEME_PREFIX) || data.getPath() == null || !data.getPath().equals(CALLBACK_PATH)) {
            return false;
        }
        String queryParameter = data.getQueryParameter("code");
        String queryParameter2 = data.getQueryParameter("state");
        String queryParameter3 = data.getQueryParameter("error");
        if (queryParameter3 == null) {
            queryParameter3 = "";
        }
        if (queryParameter == null) {
            queryParameter = "";
        }
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        onAuthorizationComplete(queryParameter3, queryParameter, queryParameter2);
        this.completed = true;
        return true;
    }

    private boolean launch(Uri uri) {
        if (CustomTabsClient.getPackageName(this, (List) null) == null) {
            return false;
        }
        CustomTabsIntent build = new CustomTabsIntent.Builder().setBookmarksButtonEnabled(false).setDownloadButtonEnabled(false).setShareState(2).setSendToExternalDefaultHandlerEnabled(true).setShowTitle(false).setInitialActivityHeightPx((int) (Resources.getSystem().getDisplayMetrics().heightPixels * 0.9f), 2).build();
        build.intent.setData(uri);
        startActivityForResult(build.intent, 0);
        return true;
    }

    private void onAuthorizationComplete(String str, String str2, String str3) {
        currentCallback = null;
        AuthenticationClientCallback authenticationClientCallback = this.nativeCallback;
        if (authenticationClientCallback != null) {
            authenticationClientCallback.onAuthorizationComplete(str, str2, str3);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        w57 w57Var;
        Window window = getWindow();
        View decorView = window.getDecorView();
        boolean z = false;
        yu5.k(window, false);
        fq3 fq3Var = new fq3(decorView);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            w57Var = new w57(window, fq3Var, (byte) 1);
        } else if (i >= 30) {
            w57Var = new w57(window, fq3Var, (byte) 1);
        } else {
            w57Var = new w57(window, fq3Var, (byte) 0);
        }
        w57Var.c(519);
        w57Var.g();
        window.getAttributes().layoutInDisplayCutoutMode = 1;
        super.onCreate(bundle);
        if (bundle != null) {
            this.hasResumedBefore = bundle.getBoolean("has-resumed-before", false);
            this.completed = bundle.getBoolean("completed", false);
            z = true;
        }
        this.nativeCallback = currentCallback;
        if (this.completed) {
            finish();
            return;
        }
        if (!z) {
            Uri data = getIntent().getData();
            try {
                Intent intent = new Intent("android.intent.action.VIEW", data);
                if (data.toString().startsWith("https://discord.com/oauth2/authorize")) {
                    intent.setData(Uri.parse(data.toString().replace("https://discord.com", "discord://action")));
                }
                startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                if (!launch(data)) {
                    try {
                        startActivity(new Intent("android.intent.action.VIEW", data));
                    } catch (ActivityNotFoundException e) {
                        Log.e("AuthenticationActivity", "No activity found to handle the authorization intent", e);
                        onAuthorizationComplete("no_browser_available", "", "");
                        this.completed = true;
                        finish();
                    }
                }
            }
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (handleIntentReceived(getIntent())) {
            finish();
        } else if (!this.hasResumedBefore) {
            this.hasResumedBefore = true;
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("has-resumed-before", this.hasResumedBefore);
        bundle.putBoolean("completed", this.completed);
        super.onSaveInstanceState(bundle);
    }
}
