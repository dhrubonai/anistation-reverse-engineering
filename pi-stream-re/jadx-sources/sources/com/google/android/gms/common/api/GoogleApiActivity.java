package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.base.zaq;

@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2352b = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f2353a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f2353a = 0;
            setResult(i11, intent);
            if (booleanExtra) {
                com.google.android.gms.common.api.internal.h g10 = com.google.android.gms.common.api.internal.h.g(this);
                if (i11 != -1) {
                    if (i11 == 0) {
                        g10.h(new b5.a(13, null), getIntent().getIntExtra("failing_client_id", -1));
                    }
                } else {
                    zaq zaqVar = g10.E;
                    zaqVar.sendMessage(zaqVar.obtainMessage(3));
                }
            }
        } else if (i10 == 2) {
            this.f2353a = 0;
            setResult(i11, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f2353a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f2353a = bundle.getInt("resolution");
        }
        if (this.f2353a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
                return;
            }
            if (pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                    this.f2353a = 1;
                    return;
                } catch (ActivityNotFoundException e10) {
                    if (extras.getBoolean("notify_manager", true)) {
                        com.google.android.gms.common.api.internal.h.g(this).h(new b5.a(22, null), getIntent().getIntExtra("failing_client_id", -1));
                    } else {
                        String obj = pendingIntent.toString();
                        StringBuilder sb = new StringBuilder(obj.length() + 36);
                        sb.append("Activity not found while launching ");
                        sb.append(obj);
                        sb.append(".");
                        String sb2 = sb.toString();
                        if (Build.FINGERPRINT.contains("generic")) {
                            sb2 = sb2.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                        }
                        Log.e("GoogleApiActivity", sb2, e10);
                    }
                    this.f2353a = 1;
                    finish();
                    return;
                } catch (IntentSender.SendIntentException e11) {
                    Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e11);
                    finish();
                    return;
                }
            }
            w7.b.s(num);
            b5.d.f1517d.d(this, num.intValue(), this);
            this.f2353a = 1;
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f2353a);
        super.onSaveInstanceState(bundle);
    }
}
