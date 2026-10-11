package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class af1 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ af1(Object obj, int i, byte b) {
        this.x = b;
        this.z = obj;
        this.y = i;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        boolean z;
        byte b = this.x;
        int i = this.y;
        Object obj = this.z;
        switch (b) {
            case 0:
                ((ub2) obj).invoke(Integer.valueOf(i));
                return pn6.a;
            case 1:
                return Integer.valueOf(((bd6) ((fm0) obj).B).b.d(i));
            case 2:
                ((fa6) obj).g1(i);
                return Boolean.TRUE;
            default:
                if (((af3) obj).j().o > i) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
