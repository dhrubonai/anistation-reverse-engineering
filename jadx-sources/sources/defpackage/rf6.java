package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rf6 extends ec5 implements Runnable {
    public final long C;

    public rf6(long j, xz0 xz0Var) {
        super(xz0Var, xz0Var.getContext());
        this.C = j;
    }

    @Override // defpackage.s0, defpackage.t43
    public final String S() {
        return super.S() + "(timeMillis=" + this.C + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        l11 l11Var = this.A;
        x97.C(l11Var);
        r11 r11Var = (r11) l11Var.get(r11.y);
        if (r11Var != null) {
            str = r11Var.x;
        } else {
            str = null;
        }
        String j = qx1.j(this.C, "Timed out waiting for ", " ms");
        if (str != null) {
            StringBuilder n = h11.n("Coroutine \"", str, "\" ");
            if (j.length() > 0) {
                j = Character.toLowerCase(j.charAt(0)) + j.substring(1);
            }
            n.append(j);
            j = n.toString();
        }
        r(new qf6(j, this));
    }
}
