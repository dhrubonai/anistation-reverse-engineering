package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tz6 implements x42 {
    public final /* synthetic */ w44 A;
    public final /* synthetic */ w44 B;
    public final /* synthetic */ w44 C;
    public final /* synthetic */ w44 D;
    public final /* synthetic */ w44 E;
    public final /* synthetic */ w44 x;
    public final /* synthetic */ w44 y;
    public final /* synthetic */ w44 z;

    public tz6(w44 w44Var, w44 w44Var2, w44 w44Var3, w44 w44Var4, w44 w44Var5, w44 w44Var6, w44 w44Var7, w44 w44Var8) {
        this.x = w44Var;
        this.y = w44Var2;
        this.z = w44Var3;
        this.A = w44Var4;
        this.B = w44Var5;
        this.C = w44Var6;
        this.D = w44Var7;
        this.E = w44Var8;
    }

    @Override // defpackage.x42
    public final Object emit(Object obj, vz0 vz0Var) {
        xx6 xx6Var = (xx6) obj;
        boolean e = s07.e(this.x);
        pn6 pn6Var = pn6.a;
        if (!e) {
            boolean booleanValue = ((Boolean) this.y.getValue()).booleanValue();
            w44 w44Var = this.z;
            if (booleanValue == ((Boolean) w44Var.getValue()).booleanValue()) {
                int ordinal = xx6Var.ordinal();
                boolean z = false;
                if (ordinal != 0) {
                    if (ordinal != 1 && ordinal != 2) {
                        ze0.l();
                        return null;
                    }
                    if (xx6Var == xx6.z) {
                        z = true;
                    }
                    if (z != ((Boolean) w44Var.getValue()).booleanValue()) {
                        if (z) {
                            ((sb2) this.D.getValue()).invoke();
                            return pn6Var;
                        }
                        ((sb2) this.E.getValue()).invoke();
                        return pn6Var;
                    }
                } else if (!((Boolean) w44Var.getValue()).booleanValue() && !s07.d(this.A)) {
                    boolean z2 = ((dq4) this.B.getValue()).b;
                    w44 w44Var2 = this.C;
                    if (z2) {
                        ((v27) w44Var2.getValue()).O(false);
                    }
                    ((v27) w44Var2.getValue()).P(true);
                }
            }
        }
        return pn6Var;
    }
}
