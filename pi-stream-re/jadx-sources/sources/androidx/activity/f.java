package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.b0;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class f extends c.h {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f264i;

    public f(b0 b0Var) {
        this.f264i = b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.h
    public final void b(int i10, d.a aVar, Object obj) {
        Bundle bundle;
        String[] strArr;
        j jVar = this.f264i;
        androidx.fragment.app.o b10 = aVar.b(jVar, obj);
        if (b10 != null) {
            new Handler(Looper.getMainLooper()).post(new a.d(this, i10, b10, 1));
            return;
        }
        Intent a10 = aVar.a(jVar, obj);
        if (a10.getExtras() != null && a10.getExtras().getClassLoader() == null) {
            a10.setExtrasClassLoader(jVar.getClassLoader());
        }
        if (a10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a10.getAction())) {
            String[] stringArrayExtra = a10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            int i11 = w.g.f10699a;
            HashSet hashSet = new HashSet();
            for (int i12 = 0; i12 < stringArrayExtra.length; i12++) {
                if (!TextUtils.isEmpty(stringArrayExtra[i12])) {
                    if (!com.bumptech.glide.d.G() && TextUtils.equals(stringArrayExtra[i12], "android.permission.POST_NOTIFICATIONS")) {
                        hashSet.add(Integer.valueOf(i12));
                    }
                } else {
                    throw new IllegalArgumentException(a3.g.t(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
            }
            int size = hashSet.size();
            if (size > 0) {
                strArr = new String[stringArrayExtra.length - size];
            } else {
                strArr = stringArrayExtra;
            }
            if (size > 0) {
                if (size != stringArrayExtra.length) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < stringArrayExtra.length; i14++) {
                        if (!hashSet.contains(Integer.valueOf(i14))) {
                            strArr[i13] = stringArrayExtra[i14];
                            i13++;
                        }
                    }
                } else {
                    return;
                }
            }
            if (jVar instanceof w.e) {
                ((w.e) jVar).validateRequestPermissionsRequestCode(i10);
            }
            w.c.b(jVar, stringArrayExtra, i10);
            return;
        }
        if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a10.getAction())) {
            c.k kVar = (c.k) a10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                IntentSender intentSender = kVar.f1598a;
                Intent intent = kVar.f1599b;
                int i15 = kVar.f1600c;
                int i16 = kVar.f1601d;
                int i17 = w.g.f10699a;
                w.a.c(jVar, intentSender, i10, intent, i15, i16, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e10) {
                new Handler(Looper.getMainLooper()).post(new a.d(this, i10, e10, 2));
                return;
            }
        }
        int i18 = w.g.f10699a;
        w.a.b(jVar, a10, i10, bundle);
    }
}
