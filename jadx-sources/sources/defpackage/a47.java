package defpackage;

import android.content.Context;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a47 extends FrameLayout implements m26 {
    public ah0 A;
    public float B;
    public float C;
    public final zg0 x;
    public final y37 y;
    public List z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View, android.webkit.WebView, y37] */
    public a47(Context context) {
        super(context, null);
        this.z = Collections.EMPTY_LIST;
        this.A = ah0.g;
        this.B = 0.0533f;
        this.C = 0.08f;
        zg0 zg0Var = new zg0(context, 0);
        this.x = zg0Var;
        ?? webView = new WebView(context, null);
        this.y = webView;
        webView.setBackgroundColor(0);
        webView.getSettings().setAllowContentAccess(false);
        addView(zg0Var);
        addView(webView);
    }

    @Override // defpackage.m26
    public final void a(List list, ah0 ah0Var, float f, float f2) {
        this.A = ah0Var;
        this.B = f;
        this.C = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            b31 b31Var = (b31) list.get(i);
            if (b31Var.d != null) {
                arrayList.add(b31Var);
            } else {
                arrayList2.add(b31Var);
            }
        }
        if (!this.z.isEmpty() || !arrayList2.isEmpty()) {
            this.z = arrayList2;
            c();
        }
        this.x.a(arrayList, ah0Var, f, f2);
        invalidate();
    }

    public final String b(int i, float f) {
        float i2 = gv5.i(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (i2 == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(i2 / getContext().getResources().getDisplayMetrics().density)};
        String str = eq6.a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:262:0x01f0, code lost:
    
        if (r6 != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x01f2, code lost:
    
        r1 = "right";
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x01f5, code lost:
    
        r1 = "left";
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x01fb, code lost:
    
        if (r6 != false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0527 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x067b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a47.c():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && !this.z.isEmpty()) {
            c();
        }
    }
}
