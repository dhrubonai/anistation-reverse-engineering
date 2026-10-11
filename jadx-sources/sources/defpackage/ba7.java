package defpackage;

import android.app.ActivityManager;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ba7 extends g6 {
    public final i6 a;
    public final h6 b;
    public d37 d;
    public k6 e;
    public final String h;
    public boolean i;
    public boolean j;
    public final ArrayList c = new ArrayList();
    public boolean f = false;
    public boolean g = false;

    static {
        Pattern.compile("^[a-zA-Z0-9 ]+$");
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [d37, java.lang.ref.WeakReference] */
    /* JADX WARN: Type inference failed for: r1v0, types: [d37, java.lang.ref.WeakReference] */
    public ba7(h6 h6Var, i6 i6Var) {
        k6 k6Var;
        this.b = h6Var;
        this.a = i6Var;
        String uuid = UUID.randomUUID().toString();
        this.h = uuid;
        this.d = new WeakReference(null);
        j6 j6Var = i6Var.f;
        if (j6Var != j6.HTML && j6Var != j6.JAVASCRIPT) {
            k6Var = new ea7(uuid, Collections.unmodifiableMap(i6Var.c));
        } else {
            WebView webView = i6Var.a;
            k6Var = new k6(uuid);
            if (!webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            k6Var.b = new WeakReference(webView);
        }
        this.e = k6Var;
        k6Var.f();
        ia7.c.a.add(this);
        k6 k6Var2 = this.e;
        l68 l68Var = l68.T;
        WebView e = k6Var2.e();
        String str = k6Var2.a;
        JSONObject jSONObject = new JSONObject();
        ha7.b(jSONObject, "impressionOwner", h6Var.a);
        ha7.b(jSONObject, "mediaEventsOwner", h6Var.b);
        ha7.b(jSONObject, "creativeType", h6Var.d);
        ha7.b(jSONObject, "impressionType", h6Var.e);
        ha7.b(jSONObject, "isolateVerificationScripts", Boolean.valueOf(h6Var.c));
        l68Var.a(e, "init", jSONObject, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [d37, java.lang.ref.WeakReference] */
    @Override // defpackage.g6
    public final void a(View view) {
        if (!this.g) {
            qs5.c(view, "AdView is null");
            if (((View) this.d.get()) != view) {
                this.d = new WeakReference(view);
                k6 k6Var = this.e;
                k6Var.getClass();
                k6Var.e = System.nanoTime();
                k6Var.d = 1;
                Collection<ba7> unmodifiableCollection = Collections.unmodifiableCollection(ia7.c.a);
                if (unmodifiableCollection != null && !unmodifiableCollection.isEmpty()) {
                    for (ba7 ba7Var : unmodifiableCollection) {
                        if (ba7Var != this && ((View) ba7Var.d.get()) == view) {
                            ba7Var.d.clear();
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.g6
    public final void b() {
        boolean z;
        Date date;
        if (this.f) {
            return;
        }
        this.f = true;
        ia7 ia7Var = ia7.c;
        boolean z2 = false;
        if (ia7Var.b.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        ia7Var.b.add(this);
        if (!z) {
            pa7 b = pa7.b();
            da7 da7Var = da7.A;
            da7Var.z = b;
            da7Var.x = true;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100 || da7Var.b()) {
                z2 = true;
            }
            da7Var.y = z2;
            da7Var.a(z2);
            mj6.f.getClass();
            mj6.b();
            ma7 ma7Var = b.b;
            ma7Var.d = ma7Var.a();
            ma7Var.b();
            ma7Var.a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, ma7Var);
        }
        float f = pa7.b().a;
        k6 k6Var = this.e;
        l68.T.a(k6Var.e(), "setDeviceVolume", Float.valueOf(f), k6Var.a);
        k6 k6Var2 = this.e;
        Date date2 = z97.f.b;
        if (date2 != null) {
            date = (Date) date2.clone();
        } else {
            date = null;
        }
        k6Var2.c(date);
        this.e.a(this, this.a);
    }
}
