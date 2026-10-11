package defpackage;

import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.Date;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class k6 {
    public final String a;
    public v5 c;
    public long e = System.nanoTime();
    public int d = 1;
    public d37 b = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r3v1, types: [d37, java.lang.ref.WeakReference] */
    public k6(String str) {
        this.a = str;
    }

    public void a(ba7 ba7Var, i6 i6Var) {
        b(ba7Var, i6Var, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.ba7 r8, defpackage.i6 r9, org.json.JSONObject r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k6.b(ba7, i6, org.json.JSONObject):void");
    }

    public final void c(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        ha7.b(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        l68.T.a(e(), "setLastActivity", jSONObject);
    }

    public void d() {
        this.b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView e() {
        return (WebView) this.b.get();
    }

    public void f() {
    }
}
