package defpackage;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class r91 {
    public static final o15 r;
    public final jf6 a;
    public final hf6 b;
    public final fm0 c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final int l;
    public final boolean m;
    public final long n;
    public final rw2 o;
    public final ConcurrentHashMap p;
    public long q;

    static {
        z62 z62Var = nw2.y;
        Object[] objArr = {"file", HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, "data", "android.resource", "rawresource", "asset"};
        jf7.p(objArr, 6);
        r = nw2.j(objArr, 6);
    }

    public r91(fm0 fm0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, Map map) {
        a("bufferForPlaybackMs", "0", i5, 0);
        a("bufferForPlaybackForLocalPlaybackMs", "0", i6, 0);
        a("bufferForPlaybackAfterRebufferMs", "0", i7, 0);
        a("bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0", i8, 0);
        a("minBufferMs", "bufferForPlaybackMs", i, i5);
        a("minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs", i2, i6);
        a("minBufferMs", "bufferForPlaybackAfterRebufferMs", i, i7);
        a("minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs", i2, i8);
        a("maxBufferMs", "minBufferMs", i3, i);
        a("maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs", i4, i2);
        a("backBufferDurationMs", "0", 0, 0);
        this.a = new jf6();
        this.b = new hf6();
        this.c = fm0Var;
        this.d = eq6.U(i);
        this.e = eq6.U(i2);
        this.f = eq6.U(i3);
        this.g = eq6.U(i4);
        this.h = eq6.U(i5);
        this.i = eq6.U(i6);
        this.j = eq6.U(i7);
        this.k = eq6.U(i8);
        this.l = i9;
        this.m = z;
        this.n = eq6.U(0L);
        this.p = new ConcurrentHashMap();
        this.o = rw2.b(map);
        this.q = -1L;
    }

    public static void a(String str, String str2, int i, int i2) {
        boolean z;
        if (i >= i2) {
            z = true;
        } else {
            z = false;
        }
        io3.q(z, "%s cannot be less than %s", str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(defpackage.ej3 r17) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r91.b(ej3):boolean");
    }

    public final void c() {
        boolean isEmpty = this.p.isEmpty();
        fm0 fm0Var = this.c;
        int i = 0;
        if (isEmpty) {
            synchronized (fm0Var) {
                fm0Var.G(0);
            }
        } else {
            Iterator it = this.p.values().iterator();
            while (it.hasNext()) {
                i += ((q91) it.next()).c;
            }
            fm0Var.G(i);
        }
    }
}
