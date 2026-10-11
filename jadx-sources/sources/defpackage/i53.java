package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class i53 implements ac4 {
    public final /* synthetic */ byte a;

    public /* synthetic */ i53(byte b) {
        this.a = b;
    }

    @Override // defpackage.xt1
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                bc4 bc4Var = (bc4) obj2;
                bc4Var.a(gw4.f, entry.getKey());
                bc4Var.a(gw4.g, entry.getValue());
                return;
            default:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
