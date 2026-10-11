package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ag0 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public ag0(t78 t78Var, y88 y88Var, int i) {
        this.x = (byte) 2;
        this.z = y88Var;
        this.y = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        int i = this.y;
        Object obj = this.z;
        switch (b) {
            case 0:
                wp wpVar = (wp) ((sn3) obj).y;
                if (wpVar != null) {
                    wpVar.o(i);
                    return;
                }
                return;
            case 1:
                ((wa7) obj).d(i);
                return;
            default:
                ((y88) obj).D.c(i);
                return;
        }
    }

    public /* synthetic */ ag0(Object obj, int i, byte b) {
        this.x = b;
        this.z = obj;
        this.y = i;
    }
}
