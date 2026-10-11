package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class wn5 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ float z;

    public /* synthetic */ wn5(Object obj, float f, byte b) {
        this.x = b;
        this.y = obj;
        this.z = f;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        float g0;
        byte b = this.x;
        float f = this.z;
        Object obj = this.y;
        switch (b) {
            case 0:
                g0 = ((ud1) obj).g0(f);
                break;
            case 1:
                g0 = ((ud1) obj).g0(f);
                break;
            default:
                float h = ((e9) obj).f.h();
                float f2 = 0.0f;
                if (!Float.isNaN(h) && h < 0.0f) {
                    f2 = db.B((-h) / f, 0.0f, 1.0f);
                }
                return Float.valueOf(f2);
        }
        return Float.valueOf(g0);
    }
}
