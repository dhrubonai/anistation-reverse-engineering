package defpackage;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ij3 {
    public static final AtomicLong h = new AtomicLong();
    public final long a;
    public final v41 b;
    public final Uri c;
    public final Map d;
    public final long e;
    public final long f;
    public final long g;

    public ij3(hj3 hj3Var) {
        this.a = hj3Var.a;
        this.b = (v41) hj3Var.e;
        this.c = (Uri) hj3Var.f;
        this.d = (Map) hj3Var.g;
        this.e = hj3Var.b;
        this.f = hj3Var.c;
        this.g = hj3Var.d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hj3, java.lang.Object] */
    public final hj3 a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.e = this.b;
        obj.f = this.c;
        obj.g = this.d;
        obj.b = this.e;
        obj.c = this.f;
        obj.d = this.g;
        return obj;
    }
}
