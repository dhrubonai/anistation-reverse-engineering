package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class mw1 extends n11 {
    public static final /* synthetic */ int B = 0;
    public bs A;
    public long y;
    public boolean z;

    public final void A0(boolean z) {
        long j;
        long j2 = this.y;
        if (z) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        this.y = j + j2;
        if (!z) {
            this.z = true;
        }
    }

    public abstract long B0();

    public final boolean C0() {
        Object removeFirst;
        bs bsVar = this.A;
        if (bsVar != null) {
            if (bsVar.isEmpty()) {
                removeFirst = null;
            } else {
                removeFirst = bsVar.removeFirst();
            }
            mh1 mh1Var = (mh1) removeFirst;
            if (mh1Var == null) {
                return false;
            }
            mh1Var.run();
            return true;
        }
        return false;
    }

    public abstract void shutdown();

    @Override // defpackage.n11
    public final n11 x0(int i) {
        wk6.k(i);
        return this;
    }

    public final void y0(boolean z) {
        long j;
        long j2 = this.y;
        if (z) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        long j3 = j2 - j;
        this.y = j3;
        if (j3 <= 0 && this.z) {
            shutdown();
        }
    }

    public final void z0(mh1 mh1Var) {
        bs bsVar = this.A;
        if (bsVar == null) {
            bsVar = new bs();
            this.A = bsVar;
        }
        bsVar.addLast(mh1Var);
    }
}
