package defpackage;

import android.media.metrics.LogSessionId;
import android.util.Pair;
import android.view.Surface;
import com.unity3d.services.core.device.MimeTypes;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ls6 {
    public final ho0 a;
    public final ea2 b;
    public final nw2 c;
    public final List d;
    public final bi6 e;
    public final kz f;
    public final String g;
    public final int h;
    public final LogSessionId i;
    public i36 j;
    public volatile p71 k;
    public volatile int l;
    public volatile boolean m;

    public ls6(ho0 ho0Var, ea2 ea2Var, nw2 nw2Var, nw2 nw2Var2, bi6 bi6Var, kz kzVar, LogSessionId logSessionId) {
        boolean z;
        String str;
        hp0 hp0Var = ea2Var.H;
        if (hp0Var != null) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        this.a = ho0Var;
        this.b = ea2Var;
        this.c = nw2Var;
        this.d = nw2Var2;
        this.e = bi6Var;
        this.f = kzVar;
        this.i = logSessionId;
        String str2 = ea2Var.p;
        str2.getClass();
        String str3 = MimeTypes.VIDEO_H265;
        if (bi6Var != null && (str = bi6Var.c) != null) {
            str2 = str;
        } else if (qy3.k(str2)) {
            str2 = MimeTypes.VIDEO_H265;
        }
        int i = bi6Var != null ? bi6Var.d : 0;
        if (i == 0 && hp0.h(hp0Var) && zt1.e(str2, hp0Var).isEmpty()) {
            if (zt1.e(MimeTypes.VIDEO_H265, hp0Var).isEmpty()) {
                i = 2;
            }
            Pair create = Pair.create(str3, Integer.valueOf(i));
            this.g = (String) create.first;
            this.h = ((Integer) create.second).intValue();
        }
        str3 = str2;
        Pair create2 = Pair.create(str3, Integer.valueOf(i));
        this.g = (String) create2.first;
        this.h = ((Integer) create2.second).intValue();
    }

    public final i36 a(int i, int i2) {
        hp0 hp0Var;
        if (this.m) {
            return null;
        }
        i36 i36Var = this.j;
        if (i36Var != null) {
            return i36Var;
        }
        if (i < i2) {
            this.l = 90;
            i2 = i;
            i = i2;
        }
        if (this.b.C % 180 == this.l % 180) {
            this.l = this.b.C;
        }
        boolean z = false;
        if (!this.c.contains(Integer.valueOf(this.l))) {
            int i3 = (this.l + 180) % 360;
            if (this.c.contains(Integer.valueOf(i3))) {
                this.l = i3;
            } else {
                this.l = ((Integer) this.c.get(0)).intValue();
                int i4 = i2;
                i2 = i;
                i = i4;
            }
        }
        da2 da2Var = new da2();
        da2Var.v = i;
        da2Var.w = i2;
        da2Var.B = 0;
        da2Var.a(this.b.B);
        da2Var.o = qy3.n(this.g);
        ea2 ea2Var = this.b;
        if (hp0.h(ea2Var.H) && this.h != 0) {
            hp0Var = hp0.h;
        } else if (hp0.i.equals(ea2Var.H)) {
            hp0Var = hp0.h;
        } else {
            hp0Var = ea2Var.H;
            hp0Var.getClass();
        }
        da2Var.G = hp0Var;
        ea2 ea2Var2 = new ea2(da2Var);
        ho0 ho0Var = this.a;
        da2 a = ea2Var2.a();
        a.o = qy3.n(c95.i(ea2Var2, this.d));
        this.k = ho0Var.m(new ea2(a), this.i);
        ea2 ea2Var3 = this.k.c;
        bi6 bi6Var = this.e;
        if (bi6Var != null) {
            kz kzVar = this.f;
            if (this.l != 0) {
                z = true;
            }
            int i5 = this.h;
            wp a2 = bi6Var.a();
            if (bi6Var.d != i5) {
                a2.c = i5;
            }
            if (!Objects.equals(ea2Var2.p, ea2Var3.p)) {
                a2.x(ea2Var3.p);
            }
            if (z) {
                int i6 = ea2Var2.w;
                int i7 = ea2Var3.w;
                if (i6 != i7) {
                    a2.b = i7;
                }
            } else {
                int i8 = ea2Var2.x;
                int i9 = ea2Var3.x;
                if (i8 != i9) {
                    a2.b = i9;
                }
            }
            kzVar.C(a2.b());
        }
        Surface surface = this.k.e;
        surface.getClass();
        this.j = new i36(surface, ea2Var3.w, ea2Var3.x, this.l, true);
        if (this.m) {
            this.k.h();
        }
        return this.j;
    }

    public final void b() {
        if (this.k != null) {
            p71 p71Var = this.k;
            if (!p71Var.i.get()) {
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            LinkedHashMap linkedHashMap = a61.a;
            try {
                synchronized (a61.class) {
                    synchronized (a61.class) {
                    }
                    p71Var.d.signalEndOfInputStream();
                }
                p71Var.d.signalEndOfInputStream();
            } catch (RuntimeException e) {
                kb0.r("DefaultCodec", "MediaCodec error", e);
                throw p71Var.b(e);
            }
        }
    }
}
