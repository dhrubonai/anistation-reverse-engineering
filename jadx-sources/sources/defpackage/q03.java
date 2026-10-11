package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q03 implements r03 {
    public int x;
    public long y;

    public /* synthetic */ q03(int i, long j) {
        this.x = i;
        this.y = j;
    }

    public static q03 b(c12 c12Var, zi4 zi4Var) {
        c12Var.A(zi4Var.a, 0, 8);
        zi4Var.N(0);
        return new q03(zi4Var.m(), zi4Var.r());
    }

    public synchronized boolean a() {
        boolean z;
        if (this.x != 0) {
            if (System.currentTimeMillis() <= this.y) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    public synchronized void c(int i) {
        long min;
        if ((i < 200 || i >= 300) && i != 401 && i != 404) {
            this.x++;
            synchronized (this) {
                if (i != 429 && (i < 500 || i >= 600)) {
                    min = 86400000;
                    this.y = System.currentTimeMillis() + min;
                }
                min = (long) Math.min(Math.pow(2.0d, this.x) + ((long) (Math.random() * 1000.0d)), 1800000.0d);
                this.y = System.currentTimeMillis() + min;
            }
            return;
        }
        synchronized (this) {
            this.x = 0;
        }
        return;
    }

    @Override // defpackage.r03
    public m03 toInstant() {
        long j = this.y;
        if (j >= m03.z.x && j <= m03.A.x) {
            return te4.C(this.x, j);
        }
        throw new IllegalArgumentException("The parsed date is outside the range representable by Instant (Unix epoch second " + j + ')');
    }
}
