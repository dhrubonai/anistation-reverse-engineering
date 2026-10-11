package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import com.unity3d.ads.core.domain.WebViewScreenCapture;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ea7 extends k6 {
    public WebView f;
    public Long g;
    public final Map h;

    public ea7(String str, Map map) {
        super(str);
        this.g = null;
        this.h = map;
    }

    @Override // defpackage.k6
    public final void a(ba7 ba7Var, i6 i6Var) {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap(i6Var.c);
        Iterator it = unmodifiableMap.keySet().iterator();
        if (!it.hasNext()) {
            b(ba7Var, i6Var, jSONObject);
        } else {
            unmodifiableMap.get((String) it.next()).getClass();
            ov3.d();
        }
    }

    @Override // defpackage.k6
    public final void d() {
        long nanoTime;
        super.d();
        if (this.g == null) {
            nanoTime = 4000;
        } else {
            nanoTime = (System.nanoTime() - this.g.longValue()) / 1000000;
        }
        new Handler().postDelayed(new la(this), Math.max(4000 - nanoTime, WebViewScreenCapture.CACHE_TTL_MS));
        this.f = null;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [d37, java.lang.ref.WeakReference] */
    @Override // defpackage.k6
    public final void f() {
        WebView webView = new WebView(oa7.b.a);
        this.f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f.getSettings().setAllowContentAccess(false);
        this.f.getSettings().setAllowFileAccess(false);
        this.f.setWebViewClient(new ca7(this));
        this.b = new WeakReference(this.f);
        WebView webView2 = this.f;
        if (webView2 != null && !TextUtils.isEmpty(null)) {
            try {
                webView2.evaluateJavascript(null, null);
            } catch (IllegalStateException unused) {
                webView2.loadUrl("javascript: null");
            }
        }
        Map map = this.h;
        Iterator it = map.keySet().iterator();
        if (!it.hasNext()) {
            this.g = Long.valueOf(System.nanoTime());
        } else {
            map.get((String) it.next()).getClass();
            ov3.d();
        }
    }
}
