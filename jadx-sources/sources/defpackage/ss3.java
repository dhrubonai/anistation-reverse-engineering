package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ss3 implements fp3 {
    public final Object A;
    public Object B;
    public boolean x;
    public long y;
    public long z;

    public ss3(a92 a92Var) {
        this.A = new Handler(Looper.getMainLooper());
        this.B = a92Var;
    }

    public void a(long j) {
        this.y = j;
        if (this.x) {
            ((f46) this.A).getClass();
            this.z = SystemClock.elapsedRealtime();
        }
    }

    @Override // defpackage.fp3
    public void b(rn4 rn4Var) {
        if (this.x) {
            a(m());
        }
        this.B = rn4Var;
    }

    public void c() {
        if (!this.x) {
            ((f46) this.A).getClass();
            this.z = SystemClock.elapsedRealtime();
            this.x = true;
        }
    }

    @Override // defpackage.fp3
    public rn4 e() {
        return (rn4) this.B;
    }

    @Override // defpackage.fp3
    public long m() {
        long j;
        long j2 = this.y;
        if (this.x) {
            ((f46) this.A).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.z;
            if (((rn4) this.B).a == 1.0f) {
                j = eq6.U(elapsedRealtime);
            } else {
                j = elapsedRealtime * r6.c;
            }
            return j + j2;
        }
        return j2;
    }

    public ss3(f46 f46Var) {
        this.A = f46Var;
        this.B = rn4.d;
    }
}
