package defpackage;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class et7 implements ux7 {
    public final gu7 x;

    public et7(z18 z18Var) {
        this.x = z18Var.I;
    }

    @Override // defpackage.ux7
    public void a(int i, Throwable th, byte[] bArr) {
        es7 es7Var;
        es7 es7Var2;
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        int i2 = i;
        gu7 gu7Var = this.x;
        es7 es7Var3 = gu7Var.C;
        if (i2 != 200 && i2 != 204) {
            if (i2 == 304) {
                i2 = 304;
            }
            gu7.l(es7Var3);
            es7Var3.F.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), th);
        }
        if (th == null) {
            bt7 bt7Var = gu7Var.B;
            gu7.j(bt7Var);
            bt7Var.Q.b(true);
            if (bArr != null && bArr.length != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String optString = jSONObject.optString("deeplink", "");
                    if (TextUtils.isEmpty(optString)) {
                        gu7.l(es7Var3);
                        es7Var3.J.a("Deferred Deep Link is empty.");
                        return;
                    }
                    String optString2 = jSONObject.optString("gclid", "");
                    String optString3 = jSONObject.optString("gbraid", "");
                    String optString4 = jSONObject.optString("gad_source", "");
                    double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                    Bundle bundle2 = new Bundle();
                    i28 i28Var = gu7Var.F;
                    gu7.j(i28Var);
                    gu7 gu7Var2 = (gu7) i28Var.x;
                    if (TextUtils.isEmpty(optString)) {
                        es7Var2 = es7Var3;
                    } else {
                        Context context = gu7Var2.x;
                        es7Var2 = es7Var3;
                        try {
                            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                            if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                                if (!TextUtils.isEmpty(optString3)) {
                                    bundle2.putString("gbraid", optString3);
                                }
                                if (!TextUtils.isEmpty(optString4)) {
                                    bundle2.putString("gad_source", optString4);
                                }
                                bundle2.putString("gclid", optString2);
                                bundle2.putString("_cis", "ddp");
                                gu7Var.J.S("auto", "_cmp", bundle2);
                                if (!TextUtils.isEmpty(optString)) {
                                    try {
                                        SharedPreferences.Editor edit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                        edit.putString("deeplink", optString);
                                        edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                        if (edit.commit()) {
                                            Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                            Context context2 = gu7Var2.x;
                                            if (Build.VERSION.SDK_INT >= 34) {
                                                makeBasic = BroadcastOptions.makeBasic();
                                                shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
                                                bundle = shareIdentityEnabled.toBundle();
                                                context2.sendBroadcast(intent, null, bundle);
                                                return;
                                            }
                                            context2.sendBroadcast(intent);
                                            return;
                                        }
                                        return;
                                    } catch (RuntimeException e) {
                                        es7 es7Var4 = ((gu7) i28Var.x).C;
                                        gu7.l(es7Var4);
                                        es7Var4.C.b(e, "Failed to persist Deferred Deep Link. exception");
                                        return;
                                    }
                                }
                                return;
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            es7Var = es7Var2;
                            gu7.l(es7Var);
                            es7Var.C.b(e, "Failed to parse the Deferred Deep Link response. exception");
                            return;
                        }
                    }
                    gu7.l(es7Var2);
                    es7Var = es7Var2;
                    try {
                        es7Var.F.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                        return;
                    } catch (JSONException e3) {
                        e = e3;
                        gu7.l(es7Var);
                        es7Var.C.b(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                } catch (JSONException e4) {
                    e = e4;
                    es7Var = es7Var3;
                }
            } else {
                gu7.l(es7Var3);
                es7Var3.J.a("Deferred Deep Link response empty.");
                return;
            }
        }
        gu7.l(es7Var3);
        es7Var3.F.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), th);
    }

    public boolean b() {
        gu7 gu7Var = this.x;
        try {
            if (f97.a(gu7Var.x).c(128, "com.android.vending").versionCode < 80837300) {
                return false;
            }
            return true;
        } catch (Exception e) {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.K.b(e, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }

    public /* synthetic */ et7(gu7 gu7Var) {
        this.x = gu7Var;
    }
}
